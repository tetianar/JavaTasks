package fileFormats.json;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.json.simple.JSONObject;

import java.io.IOException;

/**
 * Created by Tetiana_Romaniv on 10/4/2016.
 */
public class Runner {
    public static void main(String[] args) throws IOException {

        Cities g = new Cities(6, "Lviv");
        JSONObject json = new JSONObject();
        json.put("id", g.getId());
        json.put("name", g.getName());
        System.out.println(json.toJSONString());
        String jString = json.toJSONString();

        ObjectMapper mapper = new ObjectMapper();
        Cities wasRead = mapper.readValue(jString, Cities.class);
        System.out.println(wasRead);
        //CSV0 https://www.mkyong.com/java/how-to-read-and-parse-csv-file-in-java/
        //CSV1 http://www.journaldev.com/2544/java-csv-parser
        //XPATH http://freeformatter.com/xpath-tester.html
        //Jacson https://www.mkyong.com/java/jackson-2-convert-java-object-to-from-json/
        //XLS http://prologistic.com.ua/rabotaem-s-excel-v-java.html
    }
}
