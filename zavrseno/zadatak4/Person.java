package zadatak4;

public class Person {
	private String firstName;
	private String lastName;
	private String birthday;
	
	public static Person getInstance(){
		return new Person();
	}
	public Person withFirstName(String first_name){
		firstName = first_name;
		return this;
	}
	public Person withLastName(String last_name){
		lastName=last_name;
		return this;
	}
	public Person bornOn(String date){
		birthday=date;
		return this;
	}
	@Override
	public String toString(){
		
		return firstName + " " + lastName + " " + birthday;
	}
	
	public static void main(String argv[]){
		Person p = Person.getInstance().withFirstName("Adnan").withLastName("Alicic").bornOn("19.03.1987");
		System.out.println(p.toString());
	}
}
