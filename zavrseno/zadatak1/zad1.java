import java.util.ArrayList;
import java.util.List;

public class zad1 {
	public static void main(String argv[]){
		 List<Person> persons=new ArrayList<Person>();
		 persons.add(new Person("Adnan","Alicic","19.03.1987"));
		 persons.add(new Person("Amir","Trajanakovski","29.04.1978"));
		 
		 persons.add(new Person("Den","Del",""));
		 
		 persons.add(new Person("Aldin","Čolić","02.01.2000"));
		 persons.add(new Person("Denis","Delic","01.01.2000"));
		 
		 persons.add(new Person("Daa","Dss"));		 
		 
		 persons.add(new Person("D","D","11.01.2010"));
		 persons.add(new Person("De","De","01.04.1964"));
		 persons.add(new Person("Den","Del","31.01.1997"));
		 
		 persons.add(new Person("Daadd","Dssaa"));
		 
		 persons.add(new Person("Deni","Deli","18.11.2002"));
		 persons.add(new Person("Deniss","Delic","28.02.1988"));

		 MySorter.sortByBirthday(persons); 		 
	}
}
