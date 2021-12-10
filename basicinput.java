import java.util.Scanner;
class javainput{
          public static void main(String args[]){
                    Scanner input = new Scanner(System.in);

                    System.out.println("enter any number");
                    int num = input.nextInt();
                    System.out.println("You entered" +" " + num);
                    System.out.println("*****************************************");
                    System.out.println("enter any number");
                    float num2 = input.nextFloat();
                    System.out.println("You entered" +" " + num2);

                    System.out.println("*****************************************");
                    System.out.println("enter any number");
                    double num3 = input.nextDouble();
                    System.out.println("You entered" +" " + num3);
                    input.close();
          }
}