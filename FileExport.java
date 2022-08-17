import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;


public class FileExport {
    private String id;
    private String priority;
    private String dateOfCreating;
    private String timeOfCreating;
    private String deadline;
    private String nameSurname;
    
    public FileExport(String id, String prioity, String dateOfCreating, String timeOfCreating, String deadline, String nameSurname) {
        this.id = id;
        this.priority = prioity;
        this.dateOfCreating = dateOfCreating;
        this.timeOfCreating = timeOfCreating;
        this.deadline = deadline;
        this.nameSurname = nameSurname;
    }
    
    private ArrayList<FileExport> adToArray(FileExport fe) {
        ArrayList<FileExport> list = new ArrayList<>();
        list.add(fe);
        return list;
    }
    
    public void writetoCsv(FileExport fe) throws IOException {
        List<FileExport> list = adToArray(fe);
        File csvFile = new File("csvOutput.csv");
        PrintWriter out = new PrintWriter(csvFile);
        for (FileExport feFinal : list ) {
            out.print(feFinal.getId() + ",");
            out.print(feFinal.getPriority() + ",");
            out.print(feFinal.getDateOfCreating()+ ",");
            out.print(feFinal.getTimeOfCreating()+ ",");
            out.print(feFinal.getDeadline()+ ",");
            out.print(feFinal.getNameSurname()+ ",");
        }
        out.close();
    }

    @Override
    public String toString() {
        return "FileExport [id= " + id + ", timeOfCreating= " + timeOfCreating + ", dateOfCreating=" + dateOfCreating
                + ", nameSurname=" + nameSurname + ", deadline= " + deadline + "]";
    }

    public String getId() {
        return id;
    }

    public String getDateOfCreating() {
        return dateOfCreating;
    }

    public String getTimeOfCreating() {
        return timeOfCreating;
    }

    public String getDeadline() {
        return deadline;
    }

    public String getNameSurname() {
        return nameSurname;
    }
    
    public String getPriority() {
        return priority;
    }


}
