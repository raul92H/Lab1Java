package lab3Tema;

import java.util.Scanner;

public class tema {
    public static void main(String[] args){
        fibbonaci();
    }

    public static void comparare(){
        String a[] = {"java" , "test" , "university"};
        String b[] = {"car" , "university" , "plane"};

        for(int i = 0 ; i < a.length ; i++){
            for(int j = 0 ; j < b.length ; j++){
                if(a[i] == b[j]){
                    System.out.println("Cuvantul comun este:" + b[j]);
                }
            }
        }
    }

    public static void nrPrime(){
        int[] a = {5 , 3 , 8 , 12 , 11};
        for(int i = 0 ; i < a.length ; i++){
            boolean prim = true;
            for(int d = 2 ; d * d < a[i]; d++){
                if(a[i] % d == 0){
                    prim = false;
                    break;
                }
            }
            if(prim == true) {
                System.out.println(a[i]);
            }
        }
    }

    public static void palindrom(){
        int num;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti numarul de la tastatura");
        num = scanner.nextInt();
        int pastrareNum = num;
        int ogl = 0;

        while(num != 0){
            ogl = ogl * 10 + num % 10;
            num = num/10;
        }

        if(pastrareNum == ogl){
            System.out.println("Numarul este palindrom");
        }else{
            System.out.println("Numarul nu este palindrom");
        }


    }

    public static void fibbonaci(){
        int[] f = new int[20];
        f[0] = 0;
        f[1] = 1;
        System.out.println(f[0]);
        System.out.println(f[1]);
        for(int i = 2 ; f[i-1] + f[i-2] <= 20 ; i++){
            f[i] = f[i-1] + f[i-2];
            System.out.println(f[i]);
        }

    }
}