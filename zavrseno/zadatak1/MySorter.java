import java.util.List;
import java.util.Collections;

public class MySorter{
	
 public static void sortByBirthday(List<Person> p){
	 Collections.sort(p);
	 for(int i=0; i < p.size(); i++)
		 System.out.println(i+1 +". " + p.get(i));
/*Ne mora se explicitno pozivati toString() metod jer metod println kreira novi Object
 * na osnovu proslijedjene vrijendosti, tj. poziva metod valueOf() koji explicitno
 * na proslijedjenom parametru pozove metod toString();	 
 */
 }
};
