import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int temp=0;
        Scanner in= new Scanner(System.in);
        System.out.println("Dizi boyutunu giriniz : ");
        int n= in.nextInt();
        int[] dizi=new int[n];
        for(int k=0;k<dizi.length;k++){
            System.out.println("Dizi "+ (k+1) +  ". elemanını giriniz : ");
            dizi[k]=in.nextInt();
        }
        int[] dizi2= dizi;



        for(int k=0;k<dizi2.length;k++){
            for (int i=k+1;i< dizi.length;i++) {
                if (dizi2[k] > dizi2[i]) {
                temp=dizi2[k];
                dizi2[k]=dizi2[i];
                dizi2[i]=temp;
                }
            }
        }
        System.out.println(Arrays.toString(dizi2));

    }
}