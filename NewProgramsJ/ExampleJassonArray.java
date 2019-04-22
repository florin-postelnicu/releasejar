package programforstudents;


import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;

public class ExampleJassonArray {
    public static void main(String[] args) {



    JSONParser parser = new JSONParser();

    try {
        Object obj = parser.parse(new FileReader("C:\\Users\\postelnicu\\" +
                "IdeaProjects\\FlorinJavaG\\src\\programforstudents\\test.jason"));
        JSONObject jsonObject = (JSONObject ) obj;
        System.out.println(jsonObject);

        System.out.println("Now jsonarray for contact Phones");

        JSONArray ctcp = (JSONArray ) jsonObject.get("ContactPhones");
        System.out.println(ctcp);


        Iterator iterator = ctcp.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }




//        for( i in jsonObject.StudentSchedule){
//            x = jsonObject.StudentSchedule[i];
//            console.log(x);
//        }
    }
    catch (FileNotFoundException e){
        e.printStackTrace();
    }
    catch (IOException e){
        e.printStackTrace();
    }
    catch (ParseException e){
        e.printStackTrace();
    }
}}
