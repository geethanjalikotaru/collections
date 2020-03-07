package collections.c;
import java.util.ArrayList;
public class Methods {
     public void addlist(ArrayList<Integer>a,int i) {
    	 a.add(i);
     }
     public void removelist(ArrayList<Integer>a,int i) {
    	 a.remove(i);
     }
     public void print(ArrayList<Integer>arrli) {
    	 for (int i=0; i<arrli.size(); i++) 
 			System.out.print(arrli.get(i)+" ");
     }
     public void search(ArrayList<Integer>arrli,int j) {
    	 int f=0;
    	 for (int i=0; i<arrli.size(); i++) {
    		 
 			if(j==arrli.get(i))
 			{
 				System.out.println("Match Found");
 				f=1;
 				break;
 			}
 			}
    	 if(f==0) {
    		System.out.println("No match found"); 
    	 }
     }
}
