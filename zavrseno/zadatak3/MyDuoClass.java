package zadatak3;

public class MyDuoClass {
	private static MyDuoClass instance;
	private static MyDuoClass instance2;
	private String _name;
	
	public MyDuoClass(){}
	
	public MyDuoClass(String name){
		_name = name;
	}
	public static MyDuoClass getInstance(String name){
		if(instance == null){
			instance = new MyDuoClass(name);
			return instance;
		}
		else if(instance2 == null){
			instance2=new MyDuoClass(name);
			return instance2;
		}		
		return instance;
	}
	public String getName(){
		return _name;
	}

	public static void main(String argv[]){
		MyDuoClass md1=new MyDuoClass().getInstance("Aldin");
		MyDuoClass md2=new MyDuoClass().getInstance("Adnan");
		MyDuoClass md3=new MyDuoClass().getInstance("Colic");
		MyDuoClass md4=new MyDuoClass().getInstance("Alicic");

		System.out.println(md1.getName());
		System.out.println(md2.getName());
		System.out.println(md3.getName());
		System.out.println(md4.getName());	
		
	}
}