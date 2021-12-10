//arthimetic operators
//assigniment operators
//relationship operators
//logical operators
//unary operators
// bitwise operators

//example one

class math {
          public static void main(String args[]){
                    //creating variables
                    //assign variable values
                    int num1, num2, num3, num4;
                    int result1, result2;
                    //where
                    num1 =5;
                    num2 = 5;
                    num3 = 4;
                    num4 =5;
                    

                    //addtion
                    System.out.println("num1 + num2 is " +(num1+num2));

                    //substraction operator
                    System.out.println("num1 - num2 is " +(num1-num2));

                    //multiplication
                    System.out.println("num1 * num2 is " +(num1*num2));

                    //division operator
                    System.out.println("num1 / num2 is " +(num1/num2));

                    //remeinder or modulo operator
                    System.out.println("num1 % num2 is " +(num1%num2));

          //java relational

          if(num1 > num2){
                    System.out.println("num1");
          }else if(num1 <num2){
                     System.out.println("num2");
          }else if(num1 == num2){
                     System.out.println("num1 and num2");
                     
          }else if(num1>=num2){
                     System.out.println("num1 is greater or equal to num2");
          }else {
                     System.out.println("num2 is greater or equal to num1");
          }



                    //java logical operators

                    if((num1 <num2) && (num3>num4)){
                               System.out.println("logical END successfuly executed");
                    }else if((num1 <num2) || (num3 > num4)){
                              System.out.println("logical OR successfuly executed");
                    }else if(num1 != num2){
                              System.out.println("logical NOT successfuly executed");
                    }


                    //encrement and decrement operators

                    result1 = num1++;
                    result2 = num1--;

                     System.out.println(result1);
                      System.out.println(result2);

          }
}