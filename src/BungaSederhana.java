import java.util.Scanner;
 
class Pinjaman{
 long Pinjam,Sisa;
 float Angsuran;
 int Kali,i,Bunga;
 
 public void setPinjam(long Pinjam) {
 this.Pinjam = Pinjam;
 }
 
 public void setBunga(int Bunga) {
 this.Bunga = Bunga;
 }
 
 public void setKali(int Kali) {
 this.Kali = Kali;
 }
 
 public void inSisa(){
 
 Sisa=Pinjam;
 }
 
 public void setSisa(){
 Sisa=Sisa-(Pinjam/Kali);
 }
 public void setAngsuran(){
 
 Angsuran=(Pinjam/Kali)+(((float) Bunga/100)*Sisa);
 
 }
 
 public void PrintScr(){
 
 System.out.println("\n======================" +
 "===========================");
 System.out.println("| Angsuran ke- |  Besar Angsuran  |     Sisa    |");
 System.out.println("=================================================");
 inSisa();
 for(i=1;i<=Kali;i++){
 
 setAngsuran();
 setSisa();
 System.out.println("|      "+i+"       |   Rp. "+Angsuran+"  | " +
 "Rp.  "+Sisa+" |");
 System.out.println("==================================================");
 
 }
 }
 
}

public class BungaSederhana {
 
 public static void main(String[] args) {
 Pinjaman rent = new Pinjaman();
 Scanner sn= new Scanner(System.in);
 
 System.out.print("Masukan Besar Pinjaman : ");
 rent.setPinjam(sn.nextLong());
 System.out.print("Masukan Besar Bunga    : ");
 rent.setBunga(sn.nextInt());
 System.out.print("Masukan Banyak Angsuran: ");
 rent.setKali(sn.nextInt());
 
 rent.PrintScr();
 
 }
 
}