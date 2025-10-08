package encapsulation;

public class encapsulationdemo {
	public static void main(String[] args) {
		student s = new student ();
		s.setName("max");
		s.setId(11);
		
		System.out.println("Name:"+ s.getName() );
		System.out.println("ID:"+ s.getId() );
		
	}

}
