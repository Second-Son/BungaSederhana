import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Test {

	public static void main(String[] args) {
		 Scanner sn= new Scanner(System.in);
		 int Kali,i,Bunga;
		 List arrList = new ArrayList();  
	      arrList.add("20.000");  
	      arrList.add("25.000");  
	      arrList.add("30.000");
	      arrList.add("35.000");
		 
		 
		 System.out.println("\n======================" +
		 "===========================");
		 System.out.println("| Angsuran ke- |  Besar Angsuran  |");
		 System.out.println("=================================================");
		
		 for(i=0;i<arrList.size();i++){
		
		 System.out.println("|      "+i+"       |   Rp. "+arrList.get(i)+" |");
		 System.out.println("==================================================");
	 
	 	}
		 
	}
}
