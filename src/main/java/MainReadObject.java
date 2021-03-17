import ch.hegarc.ig.cpo.business.Student;

import javax.json.*;
import javax.json.stream.JsonParser;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class MainReadObject {
    public static void main(String[] args) throws IOException {
        Student student = new Student();
        JsonObject obj;
        List<Student> list = new ArrayList();
        try(JsonReader reader = Json.createReader(new FileReader("Students.json"))){
            JsonArray array = reader.readArray();

            for (int i = 0; i < array.size(); i++){
                student.setId(array.getJsonObject(i).getJsonNumber("id").intValue());
                System.out.println(student.getId());
            }


        }
        catch(Exception e){
            e.printStackTrace();
        }


    }

}
