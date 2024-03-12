import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
        File specFile = new File("car.json");
        Map<String, Field> map = Specification.parseSpec(specFile);

        File flatFile = new File("flatFile");
        FileParser parser = new FileParser();

        String data = parser.readAllBytes(flatFile);

        List<String> list = parser.readStringFields(data, map);

        System.out.println(list);

    }
}
