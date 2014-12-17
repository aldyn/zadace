package zadatak4;

public class Person {
	private String firstName;
	private String lastName;
	private String birthday;
	
	public static Person getInstance(){
		return new Person();
	}
	public Person withFirstName(String firstName){
		this.firstName = firstName;
		return this;
	}
	public Person withLastName(String lastName){
		this.lastName=lastName;
		return this;
	}
	public Person bornOn(String birthday){
		this.birthday=birthday;
		return this;
	}
	@Override
	public String toString(){
		return firstName + " " + lastName + " " + birthday;
	}
	
	public static void main(String argv[]){
		Person p = Person.getInstance().withFirstName("Adnan").withLastName("Alicic").bornOn("19.03.1987");
		System.out.println(p);
	}
}
