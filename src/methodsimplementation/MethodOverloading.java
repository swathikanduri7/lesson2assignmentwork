package methodsimplementation;


//method overloading
public class MethodOverloading 
{
			
	public void area(int b,int h)
	    {
	         System.out.println("Area of Triangle : "+(0.5*b*h));
	    }
	    public void area(int r) 
	    {
	         System.out.println("Area of Circle : "+(3.14*r*r));
	    }

	    public static void main(String args[])
	   {

	    	MethodOverloading mo=new MethodOverloading();
	         mo.area(15,10);
	         mo.area(15);  
	   }
	}


