class switchstm{
          public static void main(String args[]){
                    int num = 44;
                    String size;

                    switch(num){
                              case 29:
                              size = "small";
                              break;

                              case 42:
                              size = "medium";
                              break;

                              case 44:
                              size = "Large";
                              break;

                              case 49:
                              size = "extra large";
                              break;

                              default:
                              size = "unknown";
                              break;

                    }
                    System.out.println("Size: " + size);
          }
}