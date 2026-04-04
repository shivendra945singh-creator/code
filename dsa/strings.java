
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



//  public class strings {
//     public static void printletters(String str) {
//         for(int i=0; i<str.length(); i++) {
//             System.out.print(str.charAt(i) + " ");
//         }
//         System.out.println();
        
//     }
//      public static void main(String[] args) {
//         String name = "hello shivam";
//         printletters(name);// function call 
//      }
//     }



                                               //Q1 check a string is palindrome(letters or numbers are same when read from left to right and right to left) or not       
                                               
                                               

//   public class strings {
//     public static boolean isPalindrome(String str) {
//         for (int i = 0; i < str.length() / 2; i++) {
//             int n = str.length();
//             if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
//                 return false; // not a palindrome
//             }
//         }

       
//         return true; // is a palindrome
//     }

//     public static void main(String[] args) {
//         String str = "madam";
//                                          // if (isPalindrome(str)) {
//                                          //     System.out.println(str + " is a palindrome.");
//                                          // } else {
//                                           //     System.out.println(str + " is not a palindrome.");
        
//     System.out.println(isPalindrome(str));
//     }   
// }                                           





                                                 //Q2 find shortest path



//  public static float getshortestpath(String path)  {
//     int x = 0;
//     int y = 0;

//     for (int i = 0; i < path.length(); i++) {
//         char direction = path.charAt(i);
//         //north
//         if (direction == 'N') {
//             y++;
//             //south
//         } else if (direction == 'S') {
//             y--;
//             //east
//         } else if (direction == 'E') {
//             x++;
//             //west
//         } else if (direction == 'W') {
//             x--;
//         }
//     }

//     int x2 = x * x;
//     int y2 = y * y;
//     return (float) Math.sqrt(x2 + y2);
//  }

//  public static void main(String[] args) {
//     String path = "NNESWWS";
//     System.out.println("Shortest path: " + getshortestpath(path));
//   }
  



                                           //string function compare



// public class strings {
//     public static void main(String[] args) {
//         String name = "hello";
//         String name2 = "hello";
//         String name3 = new String("hello");
//         System.out.println(name == name2); // true because both name and name2 are pointing to the same string literal in the string pool
//         System.out.println(name == name3); // false because name3 is created using new keyword and it is pointing to a different memory location in the heap
//         System.out.println(name.equals(name3)); // true because equals() method compares the content of the string and both name and name3 have the same content "hello"
//     // if we compare two strings using == operator then it will compare the reference of the string and if we compare two strings using equals() method then it will compare the content of the string
//     }
// }                                           
                                           



                                             //substring(means contiguous or connected sequence of characters within a string) of string

//  public class strings {
//      public static String substring(String str, int si, int ei) {
//         String substr = "";
//         for (int i = si; i < ei; i++) {
//             substr += str.charAt(i);
//         }
//         return substr;
//      }

//     public static void main(String args[]) {
//         //sunstring
//         String str = "hello world";
        
//         System.out.println(substring(str, 0, 5)); // hello
//         System.out.println(substring(str, 6, 11)); // world
//     }
        
//      }




                                         //or inbuild method for substring of string


    //  public class strings {
    //     public static void main(String[] args) {
    //         String str = "hello world";
    //         String substr = str.substring(0, 5); // for finding substring of string we use substring() method and it takes two parameters one is starting index and another is ending index and it returns the substring from starting index to ending index-1
    //         System.out.println(substr); // hello
    //         String substr2 = str.substring(6, 11);
    //         System.out.println(substr2); // world
    //     }
    //  }                                    
                                       



                                          //print largest string