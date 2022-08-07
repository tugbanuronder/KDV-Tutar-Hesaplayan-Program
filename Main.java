import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);
        double tutar,kdvTutarı,kdvliTutar,kdv ;

        System.out.println("Bir tutar giriniz:");
        tutar=input.nextDouble();

        boolean tutardurumu = 0<tutar && tutar<1000;

        kdv = tutardurumu ? 0.18 : 0.08;

        kdvTutarı = tutar*kdv;
        kdvliTutar = tutar+kdvTutarı;

        System.out.println("KDV'siz Tutariniz:" + tutar);
        System.out.println("KDV Orani:" + kdv);
        System.out.println("KDV Tutariniz:" + kdvTutarı);
        System.out.println("KDV'li Fiyatiniz:" + kdvliTutar);








    }

}
