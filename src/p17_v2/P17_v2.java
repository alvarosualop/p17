/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p17_v2;

import static com.sun.org.apache.xml.internal.serialize.OutputFormat.Defaults.Encoding;
import java.util.Scanner;

/**
 *
 * @author alvarosualop
 */
public class P17_v2 {
static Scanner keyboard= new Scanner (System.in);
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int option = -1;
        int euro;// si se declara la variable al principio ya no hace falta declararla cada vez.
        float eurofloatex6;
        float eurofloatex5;
        String eurostringex4;
        do {
            userMenu();
            option = keyboard.nextInt();
            switch (option) {
                case 1:
                    System.out.println("Input euro");
                    euro=keyboard.nextInt();
                    float moneda = exercise1(euro);
                    System.out.println(euro+"€="+moneda+"$");
                    break;

                case 2:
                    System.out.println("Input euro");
                    euro=keyboard.nextInt();
                    double moneda2 = exercise2(euro);
                    System.out.println(euro+"€="+moneda2+"$");
                    break;

                case 3:
                    System.out.println("Input euro");
                    euro=keyboard.nextInt();
                    String moneda3 = exercise3(euro);
                    System.out.println(euro+"€="+moneda3+"$");
                    break;

                case 4:
                    System.out.println("Input euro");
                    eurostringex4=keyboard.next();
                    int moneda4 = exercise4(eurostringex4);
                    System.out.println(eurostringex4+"€="+moneda4+"$");
                    break;

                case 5:
                    System.out.println("Input euro");
                    eurofloatex5=keyboard.nextFloat();
                    int moneda5 = exercise5((int) eurofloatex5);
                    System.out.println(eurofloatex5+"€="+moneda5+"$");
                    break;

                case 6:
                    System.out.println("Input euro");
                    eurofloatex6=keyboard.nextFloat();
                    String moneda6 = exercise6(eurofloatex6);
                    System.out.println(eurofloatex6+"€="+moneda6+"$");
                    break;

                case 7:
                    System.out.println("Input a letter");
                    String letter = keyboard.next();
                    int number = exercise7(letter);
                    String binary = exercise7binary(number);
                    System.out.println("The letter input is "+ number+" and in binary "+binary);
                    break;
                    
                case 8:
                    System.out.println("Input letters");
                    String letters = keyboard.next();
                    String binary8 = exercise8(letters);
                    System.out.println("The letters input are "+binary8);
                    
                case 9:
                    System.out.println("Input number from 0 to 255");
                    int numberex9 = keyboard.nextInt();
                    if (numberex9>=0 || numberex9<=255){
                    String charex9 = exercise9(numberex9);
                    System.out.println("The number input "+charex9);
                    }else{
                        System.out.println("Sorry, this program only understands numbers from 0 to 255.");
                    }
               
                case 10:
                    for (int c=32; c<128; c++) {
                    System.out.println(c + ": " + (char)c);
                    }  
                    
                    
                    

                default:
                    System.out.println("This excersise doesn't exist. Try again");

            }
        } while (option != 0);
    }
private static void userMenu() {
        System.out.println();
        System.out.println("Excersise 1.");
        System.out.println("Excersise 2.");
        System.out.println("Excersise 3.");
        System.out.println("Excersise 4.");
        System.out.println("Excersise 5.");
        System.out.println("Excersise 7.");
        System.out.println("Excersise 8.");
        System.out.println("Excersise 9.");
        System.out.println("Excersise 10.");
        System.out.println("Try what excersise do you want to check:");
}

private static float exercise1(int euro){//entra la variable euro desde main
        
        float resultex1;
        resultex1 = Float.valueOf(euro) * 1.1f;
        return resultex1;//el resultex1 se guarda en posicion de memoria y se pasa al nombre de float en main
    }
private static double exercise2(int euro){
        
        double resultex2 =Double.valueOf(euro * 100);//se pasa toda la operacion del dato que recibimos de main a double
        return resultex2;
}
private static String exercise3(int euro){
        
        String resultex3 = String.valueOf (euro);
        return resultex3;

    }
private static int exercise4(String eurostringex4){
         
         int resultex4 = Integer.parseInt(eurostringex4); 
         return resultex4;
            
     }
private static int exercise5(int eurofloatex5){
        
        int resultex5 = Integer.valueOf(eurofloatex5);
        return resultex5;

}
private static String exercise6(float eurofloatex6){
        
        String resultex6 = String.valueOf(eurofloatex6);
        return resultex6;

}
private static int exercise7(String letter){
    
        char resultex7 = letter.charAt(0);
        return resultex7; 
        
}

private static String exercise7binary(int number){
        
        String numberb = Integer.toBinaryString(number);
        return numberb;
}
private static String exercise8(String letters){
        
        int lettersbinary = Integer.parseInt(letters); 
        String lettersbinary2 = Integer.toBinaryString(lettersbinary);
        return lettersbinary2;
        
}
private static String exercise9(int numberex9){
    
        String resultex9 = String.valueOf (numberex9);
        return resultex9; 
}


}



    

