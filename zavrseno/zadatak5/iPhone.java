package zadatak5;

public class iPhone extends MobilePhone{
	
	public void call(){	
		System.out.println("Calling from iPhone");
	}
	public void call(int number){
		System.out.println("Calling number " + number + " from iPhone");
	}

}
