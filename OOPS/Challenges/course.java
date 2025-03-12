package Challenges;

public class course {
    static int maxCapacity = 100;

    String courseName;

    int enrollment ;

    String[] enrolStudent;

    course(String courseName){
        this.courseName = courseName;
        this.enrollment = 0 ;
        this.enrolStudent = new String[maxCapacity];

    }



    static void setMaxCapacity(int maxCapacity){
        course.maxCapacity = maxCapacity;
    }

    void enrolStudent(String studentName){
        enrolStudent[enrollment] = studentName;
        enrollment++;
    }

    void unenrollStudent(String studentName){
        System.out.println("student remove ");
        enrollment--;
    }
}
