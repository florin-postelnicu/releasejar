package programforstudents;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import java.io.FileWriter;
import java.io.IOException;


public class JsonSimpleWriteExample {

    public static void main(String[] args) {
        JSONObject obj = new JSONObject();
        obj.put("name", "kastelka.com");
        obj.put("age", new Integer(100));

        JSONArray list = new JSONArray();
        list.add("Ma KKNare 1");
        list.add("Lasa ma leaorba 2");
        list.add("Ia mana bascula 3");

        obj.put("messages", list);

        try ( FileWriter file = new FileWriter("C:\\Users\\postelnicu\\IdeaProjects\\FlorinJavaG\\src\\programforstudents\\ttestWrite.json")){
            file.write(obj.toJSONString());
            file.flush();

        } catch (IOException e){
            e.printStackTrace();
        }

        System.out.println(obj);
    }
}
