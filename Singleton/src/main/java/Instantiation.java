public class Instantiation{
	private static Instantiation obj=new Instantiation();// instance will be created at load time  
	 private Instantiation(){}  
	   
	 public static Instantiation getA(){  
	  return obj;  
	 }  
	  
	 public void doSomething(){  
	 System.out.println("Object is created at load time"); 
	 }
	 
	 
	 
	 public static void main(String args[])
	 {
	 	Instantiation obj1=Instantiation.getA();
	 	obj1.doSomething();
	 	
	 }
}