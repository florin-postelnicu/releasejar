package programforstudents;

public class StudentsAh {
    private String studentName, studentCounselor, studentYear;
    private String studentContactParents, studentSchedule;
    private int studentIDNumber;

    // constructor

    public StudentsAh( int studentIDNumber, String studentName, String studentCounselor, String studentYear,
                       String studentContactParents, String studentSchedule){
        this.studentIDNumber = studentIDNumber;
        this.studentName = studentName;
        this.studentCounselor = studentCounselor;
        this.studentYear = studentYear;
        this.studentContactParents = studentContactParents;
        this.studentSchedule = studentSchedule;
    }

    public int getStudentIDNUmber(String studentname) {return studentIDNumber;}
    public String getStudentName( int studentIDNumber) { return studentName;}

    public String getStudentYear( int studentIDNumber) { return studentYear;}
    public String getStudentYear( String studentName) { return studentYear;}

    public String getStudentCounselor ( int studentIDNumber) { return studentCounselor;}
    public String getStudentCounselor ( String studentName) { return studentCounselor;}

    public String getStudentContactParents( int studentIDNumber) { return studentContactParents;}
    public String getStudentContactParents( String studentName) { return studentContactParents;}

    public String getStudentSchedule( int studentIDNumber) { return studentSchedule;}
    public String getStudentSchedule( String studentName) { return studentSchedule;}


    public static void main(String[] args) {

        StudentsAh stahhs1 = new StudentsAh(123456, "Mario Tonta","Mr.Wyp",
                "Frosh", "Mummy and Daddy, Address; Leaving Rd, PHX , Az,  zip 85287," +
                " phone; 602-567-7890, email : m&D@letitbe.hope", "1= Math, 2 = Chem, 3= Phy, 4= Adviz," +
                " 5  Sports, 6= Lunch, 7= Airplanes, 8 = Tv Carrier, 9= robo Bobo");
        System.out.println(stahhs1.getStudentIDNUmber("Mario Tonta"));
        System.out.println(stahhs1.getStudentContactParents(123456));
        System.out.println(stahhs1.getStudentContactParents("Mario Tonta"));
        System.out.println(stahhs1.getStudentSchedule(123456));
    }





}
