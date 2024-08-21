// object Guru
package tugas;
public class guru {
    int id;
    String nama;
    String alamat;
    String mapel;

    /*
     * Constructor nama sama dng nama Class Guru
     */
    public guru(String n, String m, int i, String a) {
        nama = n;
        mapel = m;
        id = i;
        alamat = a;
    }

    public void printDetails() {
        System.out.println("NAMA: " + nama);
        System.out.println("ID: " + id);
        System.out.println("Alamat: " + alamat);
        System.out.println("Mapel: " + mapel);

       
        
    }
}
