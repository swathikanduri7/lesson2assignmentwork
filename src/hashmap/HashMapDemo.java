package hashmap;
import java.util.*;

public class HashMapDemo
{
			public static void main(String[] args)
			{
						
			//Hashmap
			HashMap<Integer,String> hm=new HashMap<Integer,String>();      
		      hm.put(1,"sai");    
		      hm.put(2,"raj");    
		      hm.put(3,"charan");   
		      System.out.println("\nThe elements of Hashmap are ");  
		      for(Map.Entry<Integer,String> m:hm.entrySet())
		      {    
		       System.out.println(m.getKey()+" "+m.getValue());    
		      }
		      
		     //HashTable
		      Hashtable<Integer,String> ht=new Hashtable<Integer,String>();  
		      
		      ht.put(4,"Anju");  
		      ht.put(5,"Suhas");  
		      ht.put(6,"Ramu");  
		      ht.put(7,"Rajiv");  

		      System.out.println("\nThe elements of HashTable are ");  
		      for(Map.Entry<Integer,String> n:ht.entrySet())
		      {    
		       System.out.println(n.getKey()+" "+n.getValue());    
		      }
		      
		      
		      //TreeMap
		      TreeMap<Integer,String> map=new TreeMap<Integer,String>();    
		      map.put(8,"Hanu");    
		      map.put(9,"Hari");    
		      map.put(10,"Ram");       
		           
		      System.out.println("\nThe elements of TreeMap are ");  
		      for(Map.Entry<Integer,String> l:map.entrySet())
		      {    
		       System.out.println(l.getKey()+" "+l.getValue());    
		      }    
		      
		   }  
	}




