package zadatak5;

public class MobilePhone implements Phone{
	public void call(){
		System.out.println("Calling from mobile Phone");
		
	}
	public void call(int number){
		System.out.println("Calling number "+ number +" from mobile Phone");
	}
	public static void main(String argv[]){
		Phone p=new iPhone();
		p.call();		 
		MobilePhone mp=new MobilePhone();
		mp.call();	
		
		MobilePhone mpc = new iPhone();

		p.call();
		p.call(1212121221);
		/*"Calling from iPhone"
		"Calling from mobile phone"
		"Calling from iPhone"
		"Calling number 1212121221 from iPhone"*/ 	
	}
}
