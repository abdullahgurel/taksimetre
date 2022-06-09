import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        /*
        Taksimetre Programı
Java ile gidilen mesafeye (KM) göre taksimetre tutarını ekrana yazdıran programı yazın.

Taksimetre KM başına 2.20 TL tutmaktadır.
Minimum ödenecek tutar 20 TL'dir. 20 TL altında ki ücretlerde yine 20 TL alınacaktır.
Taksimetre açılış ücreti 10 TL'dir.
         */

        Scanner taksimetre = new Scanner(System.in);

        int musteri,kacKm,tutar;
        boolean kosul1,kosul2,result;
        String str;

        System.out.print("Kac km gideceksiniz: ");
        musteri = taksimetre.nextInt();
        System.out.println("Taksimetre Km Basina 2.20 Tl Tutmaktadir.");
        System.out.println("Minimum odenecek tutar 20 Tl dir.20 tl altında ki ucretlerde yine 20 tl alinacaktır.");
        System.out.println("Taksimetre Acilis Ucreti 10 Tl dir.");

        kacKm =(int) (10+(musteri*2.20));
        kosul1 =20 > kacKm;
        kosul2 = 20 > kacKm;
        result = !(kosul1 && kosul2);
        tutar = result ? kacKm : 20;
        System.out.println(tutar);

    }
}
