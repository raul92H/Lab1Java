package fisiere;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.FileWriter;
import java.io.IOException;


public class JacksionExemple {
        public static void main(String args[]) throws Exception {
            Student std = new Student();
            std.setId(001);
            std.setName("Krishna");
            std.setAge(30);
            std.setPhone(9848022338L);
            //Creating the ObjectMapper object
            ObjectMapper mapper = new ObjectMapper();
            //Converting the Object to JSONString
            String jsonString = mapper.writeValueAsString(std);
            System.out.println(jsonString);
            Student student = mapper.readValue(jsonString, Student.class);
            try {
                FileWriter myWriter = new FileWriter("filename.txt");
                myWriter.write(jsonString);
                myWriter.close();
            } catch (IOException e) {
                System.out.println("An error occurred.");
                e.printStackTrace();
            }
        }
}
