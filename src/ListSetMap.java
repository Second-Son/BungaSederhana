import java.util.ArrayList;  
import java.util.HashMap;  
import java.util.HashSet;  
import java.util.List;  
import java.util.Map;  
import java.util.Set; 
import java.util.Scanner;

public class ListSetMap {
	public static void main(String[] args) {  
		      System.out.println("***List***");  
		      List arrList = new ArrayList();  
		      arrList.add("1");  
		      arrList.add("1");  
		      arrList.add("2");    ;      
		      for(int i = 0; i < arrList.size(); ++i){  
		        System.out.println(arrList.get(i));  
		      }      
		      System.out.println("***Set***");  
		      Set arrSet = new HashSet();          
		      arrSet.add("1");  
		      arrSet.add("1");  
		      arrSet.add("2");          
		      Object [] arrFromSet = arrSet.toArray();  
		      for(int i = 0; i < arrFromSet.length; ++i){  
		        System.out.println(arrFromSet[i]);  
		      }  
		      System.out.println("***Map***");  
		      Map arrMap = new HashMap();      
		      arrMap.put(0, "1");  
		      arrMap.put(1, "1");  
		      arrMap.put(2, "2");      
		      for(int i = 0; i < arrMap.size(); ++i){  
		        System.out.println(arrMap.get(i));  
		     }  
		      
		      
		      //  Buat Objek HashMap
		       HashMap<String, String> data = new HashMap<String, String>();
		         
		        //  Masukkan nilai ke dalam HashMap
		        data.put("nama", "Muhammad YUsuf");      //  <String1, String2> --> String1 sebagai key value untuk tiap data
		        data.put("kelas", "TK-4");        //  dan String2 sebagai nilainya yang akan dimasukkan ke dalam HashMap
		        data.put("hobi", "Programming");
		         
		        //  Tampilkan nilai data HashMap
		        System.out.println("Nama  : "+data.get("nama"));
		        System.out.println("Kelas : "+data.get("kelas"));
		        System.out.println("Hobi  : "+data.get("hobi"));
		      
		      System.out.print("Masukkan Jumlah Pinjaman: ");
		      Scanner pinjam = new Scanner(System.in);
		      Integer pinjaman = pinjam.nextInt();
		      System.out.print("Masukkan Bunga Perbulan: ");
		      Scanner bunga = new Scanner(System.in);
		      Integer bungaView = bunga.nextInt();
		      System.out.println("Jumlah Pinjaman : " + pinjaman);
		      System.out.println("Jumlah Bunga : " + bungaView);
		} 
}
