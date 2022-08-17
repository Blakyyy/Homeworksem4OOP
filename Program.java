import java.io.IOException;

public class Program {
    public static void main(String[] args) throws IOException {
        FileExport fe = new FileExport("1", "as fast as you can", "17/08/2022", "12:49", "20/08/2020", "admin admin" );
        fe.writetoCsv(fe);

        FileImport fi = new FileImport("C:/Users/danii/OneDrive/Рабочий стол/Homeworksem5OOP/csvOutput.csv");
        fi.readCsvFile();
    }
}