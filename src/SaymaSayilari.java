import java.util.Scanner;

public class SaymaSayilari {
    public static void main(String[] args){
        int enBy =Integer.MIN_VALUE;
        int enKc= Integer.MAX_VALUE;
        Scanner sc = new Scanner(System.in);
        System.out.print("Kaç tane sayi gireceksiniz: ");
        int n = sc.nextInt();
        for(int i = 1;i<=n;i++){
            System.out.println(i+" Sayıyı giriniz: ");
            int b = sc.nextInt();
            if(b>enBy){
                enBy = b;
            }
            if(b<enKc){
                enKc = b;
            }
        }
        System.out.println("En büyük sayi: "+ enBy);
        System.out.println("En kücük sayi: "+enKc);

    }
}
