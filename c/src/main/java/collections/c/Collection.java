package collections.c;
import java.util.ArrayList;
import java.util.*;
public class Collection {
     public  static void  main(String args[]) {
    	 ArrayList<Integer> arrli = new ArrayList<Integer>(10);
    	 for(int i=0;i<10;i++)
    	 {
    		 arrli.add(i);
    	 }
    	 Methods m=new Methods();
    	 System.out.println("Enter the operation you need to perform");
    	 System.out.println("1.add\n2.remove\n3.print\n4.search");
    	 Scanner s=new Scanner(System.in);
    	 int c=s.nextInt();
    	 switch(c)
    	 {
    	 case 1:int i=s.nextInt();
    		 m.addlist(arrli, i);
    	 case 2:i=s.nextInt();
    	      m.removelist(arrli,i);
    	 case 3:
	     	   m.print(arrli);
    	 case 4:i=s.nextInt();
	     		m.search(arrli,i);
    	 }
     }
}
