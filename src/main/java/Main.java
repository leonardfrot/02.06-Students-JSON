import ch.hegarc.ig.cpo.business.Student;
import ch.hegarc.ig.cpo.business.StudentList;


import javax.json.*;
import javax.json.stream.JsonParser;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        try(JsonParser parser = Json.createParser(new FileReader("Students.json"))){
            JsonParser.Event event = null;
            while(parser.hasNext()){
                event = parser.next();
                switch (event) {
                    case START_ARRAY:
                        System.out.println();
                        break;
                    case END_OBJECT:
                        System.out.println();
                        break;
                    case KEY_NAME:
                        System.out.print(" " +parser.getString() + " :");
                        break;
                    case VALUE_STRING:
                        System.out.print(" valeur=" + parser.getString());
                        break;
                    case VALUE_NUMBER:
                        if (parser.isIntegralNumber()) {
                            System.out.print(" valeur=" + parser.getInt());
                        } else {
                            System.out.print(" valeur=" + parser.getBigDecimal());
                        }
                        break;
                    case VALUE_NULL:
                        System.out.print(" valeur=null");
                        break;
                }
            }

        }
        catch(Exception e){
            e.printStackTrace();
        }

    }

}



