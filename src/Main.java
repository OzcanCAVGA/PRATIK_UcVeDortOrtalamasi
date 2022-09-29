import java.util.Scanner;

/*
Java döngüler ile 0'dan girilen sayıya kadar olan sayılardan
3 ve 4'e tam bölünen sayıların ortalamasını hesaplayan programı yazınız.
 */
public class Main {
    public static void main(String[] args) {
        int k, count = 0, toplam = 0,yeniSayi;
        Scanner yazici = new Scanner(System.in);
        System.out.println("Girilecek sayi adedini girin");
        k = yazici.nextInt();
        for (int i = 1; i <= k; i++) {
            yeniSayi=yazici.nextInt();
            if (yeniSayi % 3 == 0 && yeniSayi % 4 == 0) {
                toplam = yeniSayi + toplam;
                count++;
            }
        }
        System.out.println("ortalama: "+(toplam/count));
    }
}
