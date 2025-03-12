package String;

public class StudentToString {
    String name;
    int age;
    String admissionNO;


    public StudentToString(String name, int age, String admissionNO) {
        this.name = name;
        this.age = age;
        this.admissionNO = admissionNO;
    }

    @Override
    public String toString() {
        return  "student details  : {name :" + name +
                ". age:" + age +
                ",admission No :" + admissionNO + " }";
    }

    public static void main(String[] args) {
        StudentToString stu = new StudentToString("vikash" , 23 , "22scse2150014");

        System.out.println(stu);
    }
}
