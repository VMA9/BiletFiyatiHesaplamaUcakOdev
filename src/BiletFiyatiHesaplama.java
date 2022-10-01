import java.util.Scanner;

public class BiletFiyatiHesaplama {
    public static void main (String[] args) {
        int km, age, tripType;
        double normalAmount, ageDiscount1, ageDiscount2, ageDiscount3, tripTypeDiscount, tripTypeDiscount1, tripTypeDiscount2, tripTypeDiscount3, totalAmount, totalAmount1, totalAmount2, totalAmount3;

        Scanner input = new Scanner(System.in);
        System.out.print("Mesafeyi km türünden giriniz : ");
        km = input.nextInt();

        System.out.print("Yaşınızı giriniz : ");
        age = input.nextInt();

        System.out.print("Yolculuk tipini giriniz (1 => Tek Yön , 2 => Gidiş Dönüş ) : ");
        tripType = input.nextInt();

        normalAmount = (km * 0.10);
        ageDiscount1 = normalAmount * 0.50;
        ageDiscount2 = normalAmount * 0.10;
        ageDiscount3 = normalAmount * 0.30;
        totalAmount1 = normalAmount - ageDiscount1;
        totalAmount2 = normalAmount - ageDiscount2;
        totalAmount3 = normalAmount - ageDiscount3;
        tripTypeDiscount = normalAmount * 0.20;
        tripTypeDiscount1 = totalAmount1 * 0.20;
        tripTypeDiscount2 = totalAmount2 * 0.20;
        tripTypeDiscount3 = totalAmount3 * 0.20;

        if (km < 0 || age < 0 || tripType < 1 || tripType > 2) {
            System.out.print("Hatalı Giriş Yaptınız. Tekrar Deneyiniz. ");
        } else if (age < 12 && age > 0 && km > 0 && tripType == 1) {
            System.out.print("Toplam Tutar : " + totalAmount1);
        } else if (age < 12 && age > 0 && km > 0 && tripType == 2) {
            totalAmount = normalAmount - (tripTypeDiscount1 + ageDiscount1);
            System.out.print("Toplam Tutar : " + totalAmount * 2);
        } else if (age >= 12 && age < 24 && km > 0 && tripType == 1) {
            System.out.print("Toplam Tutar : " + totalAmount2);
        } else if (age >= 12 && age < 24 && km > 0 && tripType == 2) {
            totalAmount = normalAmount - (tripTypeDiscount2 + ageDiscount2);
            System.out.print("Toplam Tutar : " + totalAmount * 2);
        } else if (age >= 24 && age <= 65 && km > 0 && tripType == 1) {
            System.out.print("Toplam Tutar : " + normalAmount);
        } else if (age >= 24 && age <= 65 && km > 0 && tripType == 2) {
            totalAmount = normalAmount - tripTypeDiscount;
            System.out.print("Toplam Tutar : " + totalAmount * 2);
        } else if (age > 65 && km > 0 && tripType == 1) {
            System.out.print("Toplam Tutar : " + totalAmount3);
        } else if (age > 65 && km > 0 && tripType == 2) {
            totalAmount = normalAmount - (tripTypeDiscount3 + ageDiscount3);
            System.out.print("Toplam Tutar : " + totalAmount * 2);
        }

    }
}