package lab4;

public class lab4 {

    public static void main(String[] args){

        Person person1 = new Person();
        Profesor profesor1 = new Profesor();
        Student student1 = new Student();
        person1.setNume("Mihai");
        person1.setAge(19);
        person1.setEmail("ceva@gmail.com");
        profesor1.setNume("Gigel");
    }

    public static void problema1(String cuvant){
        int lungime = cuvant.length();
        if(lungime % 2 == 0){
            System.out.printf("%c%c" , cuvant.charAt((lungime/2)-1) , cuvant.charAt(lungime/2));
        }else{
            System.out.println(cuvant.charAt((lungime/2)));
        }
    }
}

