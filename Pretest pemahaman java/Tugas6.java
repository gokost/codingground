import java.util.Scanner;

public class Tugas6{

     public static void main(String []args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukan nilai : ");
        int nilai = scanner.nextInt();
        String hasil = HitungNilai(nilai);
        System.out.println("nilai yang anda masukan adalah " + nilai + " jadi anda " + hasil);
     }
     
     public static String HitungNilai(int a1) {
      int nilai = a1;
      
      String hasil;
      if (nilai < 60 ){
        hasil = "tidak lulus";
      }else{
        hasil = "lulus ";  
      }
      
      return hasil; 
     }
}