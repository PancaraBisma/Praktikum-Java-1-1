import javax.swing.JOptionPane;
import java.util.Scanner;

public class DataType{
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String namaDepan = "Muhammad";
        String namaTengah = "Pancara";
        String namaBelakang = "Bisma";
        int usia = 19;
        int targetTahunKuliah = 4;
        double ipk = 3.821452;
        char nilaAbjad = 'A';
        boolean tampan = true;

        System.out.println("==========InPut==========");
        System.out.print("Input Nama Depan : ");
        namaDepan = scanner.nextLine();
        System.out.print("Input Usia : ");
        usia = scanner.nextInt();
        System.out.print("Input IPK :");
        ipk = scanner.nextDouble();
        System.out.print("Input Nilai Abjad : ");
        nilaAbjad = scanner.next().charAt(0);
        System.out.print("Tampan? : ");
        tampan = scanner.nextBoolean();

        System.out.println("==========OutPut==========");
        System.out.println("Nama Depan : " + namaDepan);
        System.out.println("Nama Tengah : " + namaTengah);
        System.out.println("Nama Belakang : " + namaBelakang);
        System.out.println("Usia : " + usia);
        System.out.println("Target Kuliah : " + targetTahunKuliah + " tahun");
        System.out.println("IPK : " + ipk );
        System.out.println("Nilai PBO : " + nilaAbjad);
        System.err.println("Tampan : " + tampan);

        JOptionPane.showMessageDialog(null, "Hai, " + namaTengah + " " + namaBelakang);
    }
}