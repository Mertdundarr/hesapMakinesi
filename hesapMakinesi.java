import java.util.Scanner;
public class hesapMakinesi {
    public static void main(String[] args) {
        int sayi1, sayi2 , select;

        Scanner input = new Scanner( System.in);
        System.out.print("İlk Sayıyı Giriniz : ");
        sayi1 = input.nextInt();
        System.out.print("İkinici Sayıyı Giriniz : ");
        sayi2 = input.nextInt();

        System.out.println("1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme");
        System.out.println("Yapmak İstediğiniz İşlemi Seçiniz : ");
        select = input.nextInt();

        switch (select) {
            case 1:
                int toplam = sayi1 + sayi2;
                System.out.println("Toplam Sonucu: " + toplam);
                break;
            case 2:
                int çıkarma = sayi1 - sayi2;
                System.out.println("Çıkarmanın Sonucu: " + çıkarma);
                break;
            case 3:
                double carpim = sayi1 * sayi2;
                System.out.println("Çarpımın Sonucu: " + carpim);
                break;
            case 4:
                int bolum = sayi1 / sayi2;
                System.out.println("bölüme Sonucu: " + bolum);
                break;

            default:
                System.out.println("Yanlış İşlem Seçtiniz: ");
        }
        System.out.println("İşlem Bitti");
    }


    }

