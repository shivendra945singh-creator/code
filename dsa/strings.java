
// import java.util.Scanner;

// public class strings {
//     public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);

//        //input and output of string
//        String name = sc.nextLine(); // for input of string we use nextLine() method because it can take space as well but next() method can not take space as input
//          System.out.println(name);
//          String name2 = sc.next(); // for input of string we use next() method because it can not take space as input
//          System.out.println(name2);
//           int length = name.length(); // for finding length of string we use .length() 
//           System.out.println(length);
//     }
    
// }



                                                    //string length method
                                                    
 
//  public class strings {
//      public static void main(String[] args) {
//         String name = "hello world";
//         System.err.println("length of string is " + name.length()); //for finding length of string we use .length() and space is also included in length of string
//         }
//         }



                                             //concatination(addition of two strings or more) of string



//  public class strings {
//      public static void main(String[] args) {
//         String name = "hello";
//         String name2 = "world";
//         String fullName = name + " " + name2; // for concatination of string we use + operator
//         System.out.println(fullName);
//      }
//  }     



                                                     // string.charAt method



//   public class strings {
//      public static void main(String[] args) {
//         String name = "hello";
//         String name2 = "world";
//         String fullName = name + " " + name2; // for concatination of string we use + operator
//         System.out.println(fullName.charAt(1)); //first letter of string is at index 0 and second letter is at index 1 and so on and space is also included in index of string
//      }
//  }                                                  




                                                      //or



 public class strings {
    public static void printletters(String str) {
        for(int i=0; i<str.length(); i++) {
            System.out.print(str.charAt(i) + " ");
        }
        System.out.println();
        
    }
     public static void main(String[] args) {
        String name = "hello shivam";
        printletters(name);// function call 
     }
    }
