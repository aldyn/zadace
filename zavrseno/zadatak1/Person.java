import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Person implements Comparable {
	
	private String firstName;
	private String lastName;
	private String birthday;
	private Date birthdayDate;
//Konstruktor za parsiranje bez unesenog datuma rođenja
	Person (String fName, String lName){
		firstName = fName;
		lastName = lName;
		birthday= "";
		parsiraj();
	}
//Konstruktor za parsiranje sa svim unesenim parametrima
	Person(String fName, String lName, String birth){
		firstName = fName;
		lastName = lName;
		birthday = birth;
		parsiraj();
	}
//privatni metod koji parsira datum rođenja	
	private void parsiraj(){
		SimpleDateFormat format = new SimpleDateFormat("dd.MM.yyyy");
		try {
			birthdayDate=format.parse((birthday!="")?birthday:"99.99.9999");
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}
	@Override
	public String toString(){
		
		return firstName + " " + lastName + " " + birthday;
	}
	
	public int compareTo(Object p2) {
		return birthdayDate.compareTo(((Person)p2).birthdayDate);
	}
};