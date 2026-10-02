#!/bin/bash

APP_NAME="AppTestMyFramework"
SRC_DIR="src/main/java"
WEB_DIR="src/main/webapp"
BUILD_DIR="build"
LIB_DIR="lib"
TOMCAT_DIR="/home/fiorenantsoa/Documents/tomcat/tomcat"
TOMCAT_WEBAPPS="$HOME/Documents/tomcat/tomcat/webapps"
CONN_API_JAR="$LIB_DIR/mysql-connector-j-8.4.0.jar"
SERVLET_API_JAR="$LIB_DIR/servlet-api.jar"

#AJOUT : Le chemin où le framework a déposé son JAR
FRAMEWORK_JAR="$LIB_DIR/MyFrameWork.jar"

# Nettoyage et création du répertoire temporaire
rm -rf $BUILD_DIR
mkdir -p $BUILD_DIR/WEB-INF/classes
mkdir -p $BUILD_DIR/WEB-INF/lib

# Copier le driver MySQL dans WEB-INF/lib
# cp -f $CONN_API_JAR $BUILD_DIR/WEB-INF/lib/

#  AJOUT : Copier le JAR de ton framework dans le dossier de build du WAR
if [ -d "$LIB_DIR" ]; then
    cp -f $LIB_DIR/* $BUILD_DIR/WEB-INF/lib/
    echo "Tous les fichiers JAR ont été copiés dans WEB-INF/lib."
else
    echo "Erreur : Le dossier $LIB_DIR n'existe pas."
    exit 1
fi

# Compilation des fichiers Java de ton AppTest
find $SRC_DIR -name "*.java" > sources.txt
# On inclut le framework dans le classpath au cas où ton AppTest en a besoin pour compiler
javac -parameters -cp "$SERVLET_API_JAR:$CONN_API_JAR:$FRAMEWORK_JAR:$LIB_DIR/*" -d $BUILD_DIR/WEB-INF/classes @sources.txt 
rm sources.txt

# Copier les fichiers web (web.xml, JSP, etc.)
cp -r $WEB_DIR/* $BUILD_DIR/
cp -rf web.xml $BUILD_DIR/WEB-INF
# cp -rf assests/* $BUILD_DIR/ # Laisser commenté si le dossier n'existe pas

# Générer le fichier .war
cd $BUILD_DIR || exit
jar -cvf $APP_NAME.war *
cd ..

# Déploiement dans Tomcat
cp -f $BUILD_DIR/$APP_NAME.war $TOMCAT_WEBAPPS/

echo ""
echo "Déploiement terminé. Redémarrez Tomcat si nécessaire."
echo ""

$TOMCAT_DIR/bin/shutdown.sh
sleep 2
$TOMCAT_DIR/bin/startup.sh