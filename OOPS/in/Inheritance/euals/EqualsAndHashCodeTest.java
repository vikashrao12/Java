package in.Inheritance.euals;

public class EqualsAndHashCodeTest {
    public static void main(String[] args) {
        Person person1 = new Person("vikas",23,"001");
        Person person2 = new Person("vikas",23,"001");

        if (person1 == person2){              // this == is compare to address don't use to object compare
            System.out.println("Equal");
        }
        else {
            System.out.println("Not equal");
        }
        if (person1.equals(person2)){              //use create equals method on person class
            System.out.println("Equal");
        }
        else {
            System.out.println("Not equal");
        }
    }
}
