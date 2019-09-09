import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.*;
import java.util.LinkedHashMap;
import java.util.Map;

public class JsonLab {
    public static void main(String[] args) throws IOException {

        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        gson.toJson("Hello World", System.out);

        System.out.println();

        Map<String, String> myMap = new LinkedHashMap<String, String>();
        myMap.put("Name", "Tom");
        myMap.put("Address", "New York");

        String json1 = gson.toJson(myMap);
        System.out.println(json1);

        Student st1 = new Student(666, "Tony", "Smith", 3.83, "tony@mail.kmutt.ac.th");
        st1.addAdvisor("Somtui");
        st1.addAdvisor("Borworn");
        st1.addAdvisor("Chonlameth");

        try (Writer writer1 = new OutputStreamWriter(new FileOutputStream("src/student1.json"), "UTF-8")) {
            gson.toJson(st1, writer1);
            writer1.close();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (Reader reader1 = new FileReader("src/Student5.json")) {
            Student st5 = gson.fromJson(reader1, Student.class);
            System.out.println(st5);
            reader1.close();
        }
    }
}
