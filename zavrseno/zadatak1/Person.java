import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Person implements Comparable {
	
	private String firstName;
	private String lastName;
	private String birthday;
	private Date birthdayDate;


	public Person(String firstName, String lastName, String birthday){
		this.firstName = firstName;
		this.lastName = lastName;
		this.birthday = birthday;
		parse();
	}
	private void parse(){
		SimpleDateFormat format = new SimpleDateFormat("dd.MM.yyyy");
		try {
			birthdayDate=format.parse((birthday != null)?birthday:"99.99.9999");
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
