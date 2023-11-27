package lab8;
import java.util.*;
import java.util.stream.Collectors;

public class liste {

    public static void main(String[] args){
        problema1();
        problema2();
        problema3();
    }

    public static void problema1(){
        List<Integer> nr = Arrays.asList(1, 2 , 2 , 5 , 7, 7);

        List<Integer> dublicari = nr.stream().distinct().collect(Collectors.toList());
        System.out.println("Listele fara dublicari sunt:" + dublicari);
    }

    public static void problema2(){
        List<String> animale = Arrays.asList("Cal", "Caine" , "Pisica" , "Rata");
        char literaSpecifica = 'C';
        int counter = (int) animale.stream().filter(s -> s.startsWith(String.valueOf(literaSpecifica))).count();
        System.out.println("Numarul de animale care incep cu C:" + counter);
    }

    public static void problema3(){
        List<Integer> nr = new ArrayList<Integer>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introdu marimea listei:");
        int size = scanner.nextInt();
        for(int i = 0 ; i < size ; i++) {
            nr.add(scanner.nextInt());
        }
        Collections.sort(nr);
        System.out.println("Listele ordonate ascendent sunt:" + nr);
        Collections.sort(nr , Collections.reverseOrder());
        System.out.println("Listele ordonate descrescator sunt:" + nr);
    }
}
