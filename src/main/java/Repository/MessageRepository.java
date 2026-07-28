package Repository;
import org.springframework.stereotype.Repository;
import java.util.HashMap;
import java.util.Map;

@Repository
public class MessageRepository {

    public Map<String, String> fetchData() {
        Map<String, String> bdd = new HashMap<>();
        bdd.put("msg", "Mandeha tsara ny Spring sy ny Framework-ko !");
        bdd.put("status", "Connecté à la BDD via Spring");
        return bdd;
    }
}
