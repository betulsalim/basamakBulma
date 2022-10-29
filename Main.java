import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int sayi, i,toplam=0,adet=0;

        Scanner input = new Scanner(System.in);

        System.out.println("Sayıyı giriniz: ");
        sayi = input.nextInt();

        while (sayi!= 0){
            toplam=toplam + (sayi%10);
            sayi=sayi/10;
            adet++;
        }
    System.out.println("Toplam: "+toplam);

    }
}
