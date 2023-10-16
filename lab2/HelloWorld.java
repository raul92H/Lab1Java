package lab2;

import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args){
        problema1();
        problema2();
    }

    public static void problema1(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti n:");
        int n = scanner.nextInt();
        for(int i = 1; i <= 10; i++){
            int p = i * i;
            System.out.println("Patratul este:" + p);
        }
    }

    public static void problema2(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti n:");
        int par = 0;
        int impar = 1;
        int n = scanner.nextInt();
        for(int i = 1 ; i <=n ; i++){
            if(i%2==0){
                par = par+i;
            }else{
                impar *= i;
            }
        }
        System.out.println("Suma pare este:" + par);
        System.out.println("Suma impara este:" + impar);
    }
}
