package overloading;

public class NamedPerson {

	    private String name;
	    private int age;
	    private String address;

	    
	    public NamedPerson(String name) {
	        this.name = name;
	    
	    }


	    public NamedPerson(String name, int age) {
	        this.name = name;
	        this.age = age;
	       
	    }


	    public NamedPerson(String name, int age, String address) {
	        this.name = name;
	        this.age = age;
	        this.address = address;
	    }

	
	    public void displayDetails() {
	        System.out.println("Name: " + name);
	        System.out.println("Age: " + age);
	        System.out.println("Address: " + address);
	        System.out.println();
	    }
	

	    public static void main(String[] args) {
	     
	        NamedPerson person1 = new NamedPerson("Alice");
	        NamedPerson person2 = new NamedPerson("Bob", 25);
	        NamedPerson person3 = new NamedPerson("Charlie", 30, "123 Street, City");

	        // Displaying details
	        person1.displayDetails();
	        person2.displayDetails();
	        person3.displayDetails();
	    }
	}

