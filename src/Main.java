import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double pi=3.14;
        Scanner input=new Scanner(System.in);
        System.out.print("Dairenin yarıçapını giriniz:");
        int r=input.nextInt();
        System.out.print("Dairenin merkez açısını giriniz:");
        int a=input.nextInt();

        double alan=((pi*(r*r)*a)/360);
        System.out.println(alan);
    }
}