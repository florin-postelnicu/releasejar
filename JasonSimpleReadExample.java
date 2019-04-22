package programforstudents;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;

/*
I got an error for using Iterator<String> with an Array JSONArray,

Exception in thread "main" java.lang.ClassCastException: class org.json.simple.JSONObject cannot be cast
to class java.lang.String (org.json.simple.JSONObject is in unnamed module of loader 'app'; java.lang.String is
in module java.base of loader 'bootstrap')
at programforstudents.JasonSimpleReadExample.main(JasonSimpleReadExample.java:39)

The problem is solvable by eliminating the <String> identifier from Iterator.
So, as long as we deal with a regular Array, all the methods valid in java.lang can be applied.
 */

public class JasonSimpleReadExample {
    public static void main(String[] args) {
        JSONParser parser = new JSONParser();

        try{

            Object obj = parser.parse(new FileReader("C:\\Users\\postelnicu\\" +
                    "IdeaProjects\\FlorinJavaG\\src\\programforstudents\\test.jason"));
            JSONObject jsonObject = (JSONObject ) obj;
            System.out.println(jsonObject);

            String name = (String) jsonObject.get("name");
            System.out.println(name);

            long age = (Long) jsonObject.get("Age");
            System.out.println(age);

            // loop array

            JSONArray ctcp = (JSONArray ) jsonObject.get("ContactPhones");
//            Iterator<String> iterator = ctcp.iterator(); // Se the comment, and replace it with :

            Iterator iterator = ctcp.iterator();
            while(iterator.hasNext()){
                System.out.println(iterator.next());
            }
        }catch (FileNotFoundException e){
            e.printStackTrace();

        }catch (IOException e){
            e.printStackTrace();
        }catch (ParseException e){
            e.printStackTrace();
        }
    }


}