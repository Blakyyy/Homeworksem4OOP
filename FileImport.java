import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class FileImport {
   public String path;

public FileImport(String path) {
    this.path = path;
}

public List<String> readCsvFile() {
    String line = "";
    List<String> list = new ArrayList<>();
    try (BufferedReader br = new BufferedReader(new FileReader(path));){
        while((line = br.readLine()) != null){
            list.add(line);
        }
    } catch (FileNotFoundException e) {
        e.printStackTrace();
    } catch (IOException e) {
        e.printStackTrace();
    }
    System.out.println(list);
    return list;

}
}
