package tugas;
import java.util.Scanner;

public class TestGuru{ 
    public static void main(String[] args) {
       
        Scanner in = new Scanner(System.in);
        
        System.out.println("NAMA Guru yang mau di input : ");
        String nama = in.nextLine();

        System.out.println("Mapel Pelajaran : ");
        String mapel = in.nextLine();
        
        System.out.println("Alamat guru : ");
        String alamat  = in.nextLine();
        
        System.out.println("ID Guru yang Mau di input : ");
        int id = in.nextInt();
    }
    

}

   