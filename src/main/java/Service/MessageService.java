package Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import Repository.MessageRepository;
import java.util.Map;
import Presentation.Etudiant;

@Service
public class MessageService {

    @Autowired
    private MessageRepository messageRepository;

    public Map<String, String> getInfosAccueil() {
        return messageRepository.fetchData();
    }
    public Etudiant  getEtudiantInfos(Etudiant etudiant) {
        return messageRepository.getEtudiantInfos(etudiant);
    }
}