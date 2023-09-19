import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int total = 0;
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.print("Bir Sayı Giriniz (Çıkmak için tek sayı girin): ");
            int sayi = input.nextInt();

            if (sayi % 2 == 0 && sayi % 4 == 0) {
                total += sayi;
            }

            if (sayi % 2 == 1) {
                break; // Kullanıcı tek sayı girdiğinde döngüyü sonlandır
            }
        }

        System.out.print("Toplam : " + total);
    }
}





