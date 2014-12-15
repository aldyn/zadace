package zadatak3;

public class MyDuoClass {
	private static MyDuoClass instance;
	private static MyDuoClass instance2;
	
	private MyDuoClass(){}

	public static MyDuoClass getInstance(){
		if(instance == null){
			instance = new MyDuoClass();
			return instance;
		}
		else if(instance2 == null){
			instance2=new MyDuoClass();
			return instance2;
		}		
		return instance;
	}

	public static void main(String argv[]){
		MyDuoClass md1=new MyDuoClass().getInstance();
		MyDuoClass md2=new MyDuoClass().getInstance();
		MyDuoClass md3=new MyDuoClass().getInstance();
		MyDuoClass md4=new MyDuoClass().getInstance();
		
		System.out.println(md1);
		System.out.println(md2);
		System.out.println(md3);
		System.out.println(md4);
		
	}
}
