import org.json.JSONObject;
import java.util.Iterator;


public class SearchCourseMate {
    String resourceName = "/users.json";
    JSONObject object = new JSONObject(resourceName);

    private void searchName (String name){
        Iterator<String> keys = object.keys();
        while(keys.hasNext()) {
            String key = keys.next();
            if (object.get(key) instanceof JSONObject) {

            }
        }

    }

}