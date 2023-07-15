import java.util.Scanner;

public class KdvOrani {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double fiyat, kdvTutari;
        System.out.print("Ürünün fiyatını giriniz: ");
        fiyat = input.nextInt();

        if(0<fiyat && fiyat<1000){
            kdvTutari = (fiyat * 18)/100;
            System.out.println("KDV Tutarı: " + kdvTutari + " " + "KDV'li Fiyat: " + (fiyat+kdvTutari));
        } else{
            kdvTutari = (fiyat * 8)/100;
            System.out.println("KDV Tutarı: " + kdvTutari + " " + "KDV'li Fiyat: " + (fiyat+kdvTutari));
        }

    }
}
