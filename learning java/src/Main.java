import java.lang.ref.Reference;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        This is for integers
        byte thebyte =-128;
        short theshort = 9899;
        int theint = 334;
        long thelong = 8879879879879l;
//        This is for float
        float thefloat = 45.909F;
        double thedouble = 489834.078787897478;

        boolean bool =true;
        char character = 'A';

//        Reference datatypes
    String name = new String("Kyle");
        System.out.println(name);
        name = name.toUpperCase();
        System.out.println(name);
//        Teneray operators
        String message = name == "kyle"?
                "I am kyle":
                "I am KYLE";
        System.out.println(message);

//        Using switches
        int age = 44;
        switch (age){
            case 32:
                System.out.println("I am younger");
            case 44:
                System.out.println("I am older");
            default:
        }

//        Arrays
        int [] arrayOfInt = new int[4];
        arrayOfInt[0]=3;
        arrayOfInt[2]=7;
        arrayOfInt[1]=5;
        System.out.println(Arrays.toString(arrayOfInt));
//        Alternatively
    int [] arrayOfNumbers ={3,6,8,1,8,4,3};
        System.out.println(Arrays.toString(arrayOfNumbers));

//    Using loops - for i in range as used in python
        for(int i=0;i<arrayOfNumbers.length-1;i++){
            System.out.println(arrayOfNumbers[i]);
        }
//        Using for every element in list as used in python
        for(int number:arrayOfNumbers){
            System.out.println(number);
        }
//        Using do while loops
        do{
            System.out.println(age);
            age--;
        }
        while (age>=44);
//        Taking user input
        Scanner input = new Scanner(System.in);
        System.out.println("What is your name ? ");
        String userName = input.nextLine();
        System.out.println("Your name is "+userName);

        //      Creating and using objects
            Phone iPhone =new Phone("iPhone12","Apple",16,256);
        System.out.println(iPhone.name);
        String newName = "Iphone X";
        iPhone.name = newName;
        System.out.println(iPhone.name);


    }
    //        Working with classes
    static class Phone{
        String name;
        String brand;
        int ram;
        int rom;
        Phone(String name, String brand, int ram, int rom){
         this.name =name;
         this.brand = brand;
         this.ram = ram;
         this.rom = rom;
        }

    }
}