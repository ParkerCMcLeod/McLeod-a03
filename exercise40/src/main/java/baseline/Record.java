package baseline;

public class Record {

    public String firstName;
    public String lastName;
    public String department;
    public String seperationDate;
    static int numRecords = 0;

    public Record(String firstName, String lastName, String department, String seperationDate) {
        numRecords++;
        this.firstName = firstName;
        this.lastName = lastName;
        this.department = department;
        this.seperationDate = seperationDate;

    }

}