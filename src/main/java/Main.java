import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    
   Scanner scanner = new Scanner(System.in);
    System.out.println("Inserisci il primo numero");
    int num1 = scanner.nextInt();
    System.out.println("Inserisci il secondo numero");
    int num2 = scanner.nextInt();
    if(num1>num2){
      System.out.println("Il numero: " + num1 + " è maggiore del numero: " + num2);
    }
    else if(num1<num2){
      System.out.println("Il numero: "+ num1 + " è minore del numero: " + num2);
    }else{
      System.out.println("I numeri sono uguali");
    }
  }


}