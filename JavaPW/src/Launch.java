import java.util.*;

public class Launch {

	public static void main(String[] args) {
      Person p1= new Person();
      Person p2= new Person("Aman");
      Person p3 = new Person("Aman",5);
      System.out.println(p2.name);
      System.out.println(p3.number);
      System.out.println(Person.number2);
	}

}

class Person {
	String name;
	int number;
    static int number2;
    
    static  {
    	number2 = 2;
    }
	public Person() {
		System.out.println("Hello person!");
	}

	public Person(String name) {
		this.name = name;
	}

	public Person(String name, int number) {
		this.name = name;
		this.number = number;
	}
}


