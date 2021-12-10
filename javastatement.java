//if statement
import java.util.Scanner;
class statements{
          public static void main(String args[]){
                    Scanner statements = new Scanner(System.in);
                    System.out.println("Enter any number pls");
                    int num = statements.nextInt();
                    int num1,num2,num3;
                    num1 = 7;
                    num2 = 49;
                    num3 = 5;
                    if(num%2 == 0 && num != 0){
                              System.out.println("you have enter a Even number" +" " + num);
                    }else if(num == 0){
                              System.out.println("sory try again letter");
                    }
                    else{
                      System.out.println("you have enter a Odd number " +" "+ num);
         
                    }


                    //nested if statement
System.out.println("**********************************************");
                    if(num1 >=num2){
                              if(num1>= num3){
                                        System.out.println(" num 1 is the lagest number");
                              }else{
                                        System.out.println("num 3 is the lagest number");
                              }
                    }else{
                              System.out.println("num 2 is the lagest number");                    }



          }
}