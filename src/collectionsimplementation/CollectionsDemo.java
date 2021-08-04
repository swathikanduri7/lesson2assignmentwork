package collectionsimplementation;
import java.util.*;


public class CollectionsDemo 
{
			public static void main(String[] args) 
			{
			//creating arraylist
				
			  System.out.println("ArrayList");
			  ArrayList<String> city=new ArrayList<String>();   
		      city.add("Hyderabad");
		      city.add("Banglore");    	   
		      System.out.println(city);  
			
			//creating vector
		      System.out.println("\n");
		      System.out.println("Vector");
		      Vector<Integer> v = new Vector<Integer>();
		      v.addElement(25); 
		      v.addElement(40); 
		      System.out.println(v);
			
			//creating linkedlist
		      
		      System.out.println("\n");
		      System.out.println("LinkedList");
		      LinkedList<String> ll=new LinkedList<String>();  
		      ll.add("Raj");  
		      ll.add("Tarun");  	      
		      Iterator<String> itr=ll.iterator(); 
		      //Iterator<String> itr=ll.iterator();
		      while(itr.hasNext()){  
		       System.out.println(itr.next());  
		       
		       //creating hashset
		       System.out.println("\n");
		       System.out.println("HashSet");
		       HashSet<Integer> s=new HashSet<Integer>();  
		       s.add(1000);  
		       s.add(1001);  
		       s.add(1002);
		       s.add(1003);
		       System.out.println(s);
		       
		       //creating linkedhashset
		       System.out.println("\n");
		       System.out.println("LinkedHashSet");
		       LinkedHashSet<Integer> lh=new LinkedHashSet<Integer>();  
		       lh.add(11);  
		       lh.add(13);  
		       lh.add(12);
		       lh.add(14);	       
		       System.out.println(lh);
		      	} 
		      }  
		}


	
	

