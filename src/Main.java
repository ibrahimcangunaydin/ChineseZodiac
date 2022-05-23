import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int birthYear, remainder;
        String Zodiac = "";
        boolean isError = false;

        Scanner inp = new Scanner(System.in);
        System.out.print("Doğum Yılınızı Giriniz: ");
        birthYear = inp.nextInt();

        remainder = birthYear % 12;

        switch (remainder) {
            case 0:
                Zodiac = "Maymun";
                break;
            case 1:
                Zodiac = "Horoz";
                break;
            case 2:
                Zodiac = "Köpek";
                break;
            case 3:
                Zodiac = "Domuz";
                break;
            case 4:
                Zodiac = "Fare";
                break;
            case 5:
                Zodiac = "Öküz";
                break;
            case 6:
                Zodiac = "Kaplan";
                break;
            case 7:
                Zodiac = "Tavşan";
                break;
            case 8:
                Zodiac = "Ejderha";
                break;
            case 9:
                Zodiac = "Yılan";
                break;
            case 10:
                Zodiac = "At";
                break;
            case 11:
                Zodiac = "Koyun";
                break;
            default:
                isError = true;
        }
        if (isError){
            System.out.println("Hatalı Veri Girdiniz!");
        }else {
            System.out.println("Çin Zodyağı Burcunuz: "+Zodiac);
        }

    }
}
