




// import java.util.Scanner;

// public class strings {//this class string is not inbuild this  class  string we created
//     public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);

//          //input and output of string
//          System.out.println("enter your first name");
//          String name = sc.nextLine(); // for input of string we use nextLine() method because it can take space as well but next() method can not take space as input
//          System.out.println(name);
//          System.out.println("enter your name");
//          String name2 = sc.next(); // for input of string we use next() method because it can not take space as input
//          System.out.println(name2);
//         int length = name.length(); // for finding length of string we use .length() 
//         System.out.println(length);
//     }
    
// }



                                                    //string length method
                                                    
 
//  public class strings {
//     public static void main(String[] args) {
//         String name = "hello world";
//         System.out.println("length of string is " + name.length()); //for finding length of string we use .length() and space is also included in length of string
//     }
// }



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



// public class strings {
//     public static void printletters(String str) {//we can also use name in the place of str
//         for(int i=0; i<str.length(); i++) {
//             System.out.print(str.charAt(i) + " ");
//         }
//         System.out.println();
        
//     }
//     public static void main(String[] args) {
//         String name = "hello shivam";
//         printletters(name);// function call 
//     }
// }



                                               //Q1 check a string is palindrome(letters or numbers are same when read from left to right and right to left) or not       
                                               
         
//  public class strings {
//     public static boolean isPalindrome(String str) {
//         for (int i = 0; i < str.length() / 2; i++) {
//             if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
//                 return false; // not a palindrome
//             }
//         }
//         return true; // is a palindrome
//     }

//     public static void main(String[] args) {
//         String str = "madam";
        
//     System.out.println(isPalindrome(str));
//     }   
// }    


                                                      //or




//   public class strings {
//     public static boolean isPalindrome(String str) {
//         for (int i = 0; i < str.length() / 2; i++) {
//             if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
//                 return false; // not a palindrome
//             }
//         }

       
//         return true; // is a palindrome
//     }

//     public static void main(String[] args) {
//         String str = "madam";

//         //or 
//         if (isPalindrome(str)) { //if (isPalindrome(str)) is true then it will print the string is a palindrome otherwise it will print the string is not a palindrome
//             System.out.println(str + " is a palindrome.");
//         } else {
//             System.out.println(str + " is not a palindrome.");
//         }
        
//     }   
// }    

                                                          //or
                                               
//  public class strings {
//     public static boolean isPalindrome(String str) {
//         for (int i = 0; i < str.length() / 2; i++) {
//             if (str.charAt(i) == str.charAt(str.length() - 1 - i)) {
//                 return true; // a palindrome
//             }
//         }

       
//         return false; // is a palindrome
//     }

//     public static void main(String[] args) {
//         String str = "madam";
        
//     System.out.println(isPalindrome(str));
//     }   
// }  



//dry run

// String str = "madam";
// str.length() = 5

// Loop iterations:
// Loop runs from i = 0 to i < str.length() / 2 → i < 2 (i.e., i = 0 and i = 1)

// Iteration 1: i = 0

// str.charAt(0) = 'm'
// str.charAt(str.length() - 1 - 0) = str.charAt(4) = 'm'
// Comparison: 'm' == 'm' → true (continue)

// Iteration 2: i = 1

// str.charAt(1) = 'a'
// str.charAt(str.length() - 1 - 1) = str.charAt(3) = 'a'
// Comparison: 'a' == 'a' → true (continue)

// Loop ends as i < 2 condition is not met anymore.

// Since all corresponding characters from the start and end matched, the function returns true.





                                                 //Q2 find shortest path


// public class strings {
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

//     int x2 = x * x;//x square
//     int y2 = y * y;//y square
//     return (float) Math.sqrt(x2 + y2);
//  }

//    public static void main(String[] args) {
//       String path = "NNESWWS";
//        System.out.println("Shortest path: " + getshortestpath(path));
//     }
// }
  



                                           //string function compare



// public class strings {
//     public static void main(String[] args) {
//         String name1 = "hello";
//         String name2 = "hello";
//         String name3 = new String("hello");
//         System.out.println(name1 == name2); // true because both name and name2 are pointing to the same string literal in the string pool
//         System.out.println(name1 == name3); // false because name3 is created using new keyword and it is pointing to a different memory location in the heap
//         System.out.println(name1.equals(name3)); // true because equals() method compares the content of the string and both name and name3 have the same content "hello"
//     // if we compare two strings using == operator then it will compare the reference of the string and if we compare two strings using equals() method then it will compare the content of the string
//     }
// }                                           
                                           
                                                                     //or


// public class strings {
//     public static void main(String[] args) {
//         String name1 = "hello";
//         String name2 = "hello";
       
//         System.out.println(name1 == name2); 
//         System.out.println(name1.equals(name2)); 
//     }
// }  




                                             //substring(means contiguous or connected sequence of characters within a string) of string

// public class strings {
//     public static String substring(String str, int si, int ei) {
//         String substr = "";
//         for (int i = si; i < ei; i++) {
//             substr += str.charAt(i);
//         }
//         return substr;
//     }

//     public static void main(String args[]) {
//         //substring
//         String str = "hello world";
        
//         System.out.println(substring(str, 0, 5)); // hello
//         System.out.println(substring(str, 6, 11)); // world
//     }   
// }




                                         //or inbuild method of substring for string


    //  public class strings {
    //     public static void main(String[] args) {
    //         String str = "hello world";
    //         String substr = str.substring(0, 5); // for finding substring of string we use substring() method and it takes two parameters one is starting index and another is ending index and it returns the substring from starting index to ending index-1
    //         System.out.println(substr); // hello
    //         //or
    //         System.out.println(str.substring(0, 5)); // hello
    //         String substr2 = str.substring(6, 11);
    //         System.out.println(substr2); // world
    //     }
    //  }                                    
                                       



                                        //  Q3 print largest string


//O(x into n) is time complexity because we are comparing each string with every other string 

//    public class strings {
//         public static void main(String args[]) {
//             String str[] = {"hello", "world", "java", "programming"};
//             String largest = str[0];
//             for (int i = 1; i < str.length; i++) {
//                 if (largest.compareTo(str[i]) < 0) { // compareTo() method compares two strings lexicographically and returns a negative integer, zero, or a positive integer as this string is less than, equal to, or greater than the specified object.
//                     largest = str[i];
//                 }
//             }
//             System.out.println("largest string is " + largest);
//         }
//     }                          
    
    

//dry run

//Step-by-step
// largest = "hello"
// i = 1
// str[1] = "world"
// "hello".compareTo("world") < 0 → true
// update largest = "world"

// i = 2
// str[2] = "java"
// "world".compareTo("java") < 0 → false
// largest stays "world"

// i = 3
// str[3] = "programming"
// "world".compareTo("programming") < 0 → false
// largest stays "world"

// Final output
// largest string is world


                                                //string builder


//  public class strings {
//     public static void main(String[] args) {
//         StringBuilder sb = new StringBuilder("hello");
//         sb.append(" world"); // for adding string to string builder we use append() method
//         System.out.println(sb); // hello world
//         sb.insert(5, " java"); // for inserting string at specific index in string builder we use insert() method and it takes two parameters one is index and another is string to be inserted
//         System.out.println(sb); // hello java world
//         sb.delete(5, 10); // for deleting string from string builder we use delete() method and it takes two parameters one is starting index and another is ending index and it deletes the string from starting index to ending index-1
//         System.out.println(sb); // hello world
//         System.out.println(sb.length()); // for finding length of string builder we use length() method
//     }
// }                                               


                                                     //or


//    public static void main(String args[]) {//O(26)
//     StringBuilder sb = new StringBuilder("");
//     for(char ch = 'a'; ch <= 'z'; ch++) {
//         sb.append(ch);// for adding character to string builder we use append() method and it takes character as parameter
//     }
//     System.out.println(sb);
//    }                                                  




    //**Q4 for a given string convert each the first letter of each word to uppercase and rest of the letters to lowercase


    // public static String toUppercase(String str) {//O(n)
    //     StringBuilder sb = new StringBuilder("");

    //     char ch = Character.toUpperCase(str.charAt(0)); // for converting first letter of string to uppercase we use toUpperCase() method of Character class and it takes character as parameter and returns the uppercase character
    //     sb.append(ch); // for adding character to string builder we use append() method and it takes character as parameter

    //     for (int i = 1; i < str.length(); i++) {
    //         if(str.charAt(i) == ' ' && i < str.length() - 1) { // for checking if the current character is space and it is not the last character of string
    //          sb.append(' '); // for adding space to string builder we use append() method and it takes space as parameter
    //          i++; // for skipping the space character
    //          sb.append(Character.toUpperCase(str.charAt(i))); // for converting first letter of next word to uppercase we use toUpperCase() method of Character class and it takes character as parameter and returns the uppercase character
    //         }else {
    //            sb.append(Character.toLowerCase(str.charAt(i))); // for converting rest of the letters to lowercase we use toLowerCase() method of Character class and it takes character as parameter and returns the lowercase character
             
    //         }
    //     }
    //     return sb.toString(); // for converting string builder to string we use toString() method and it returns the string representation of string builder
    // }


    // public static void main(String args[]) {
    //     String str = "hello world java programming";
    //     System.out.println(toUppercase(str));
    // }

//dry run
    

// Start
// sb = ""
// str.charAt(0) = 'h'
// Character.toUpperCase('h') = 'H'
// sb = "H"

// Loop
// i = 1
// e → append lowercase
// sb = "He"

// i = 2
// l → sb = "Hel"

// i = 3
// l → sb = "Hell"

// i = 4
// o → sb = "Hello"

// i = 5
// space ' '
// condition true: space and not last character
// append space → sb = "Hello "
// i++ makes i = 6
// str.charAt(6) = 'w'
// append uppercase W
// sb = "Hello W"

// i = 7
// o → sb = "Hello Wo"

// i = 8
// r → sb = "Hello Wor"

// i = 9
// l → sb = "Hello Worl"

// i = 10
// d → sb = "Hello World"

// i = 11
// space
// append space → sb = "Hello World "

// i++ → i = 12
// str.charAt(12) = 'j'
// append uppercase J
// sb = "Hello World J"

// i = 13
// a → sb = "Hello World Ja"

// i = 14
// v → sb = "Hello World Jav"

// i = 15
// a → sb = "Hello World Java"

// i = 16
// space
// append space → sb = "Hello World Java "

// i++ → i = 17
// str.charAt(17) = 'p'
// append uppercase P
// sb = "Hello World Java P"

// i = 18
// r → sb = "Hello World Java Pr"

// i = 19
// o → sb = "Hello World Java Pro"

// i = 20
// g → sb = "Hello World Java Prog"

// i = 21
// r → sb = "Hello World Java Progr"

// i = 22
// a → sb = "Hello World Java Progra"

// i = 23
// m → sb = "Hello World Java Program"

// i = 24
// m → sb = "Hello World Java Programm"

// i = 25
// i → sb = "Hello World Java Programmi"

// i = 26
// n → sb = "Hello World Java Programmin"

// i = 27
// g → sb = "Hello World Java Programming"

// Final output
// Hello World Java Programming



    //Q5 string compression 

public class strings {
    public static String compress(String str) {//O(n)
            String newStr = "";
        for (int i = 0; i < str.length(); i++) {
            Integer count = 1;
            while (i < str.length() - 1 && str.charAt(i) == str.charAt(i + 1)) {// for counting the number of occurrences of each character in string we use while loop and it checks if the current character is equal to the next character and it is not the last character of string
                count++;
                i++;
            }
           
            newStr += str.charAt(i); // for adding character to string we use + operator
            if (count > 1) {
                newStr += count.toString(); // for adding count to string we use + operator and count is an integer so we need to convert it to string therefore we use  .toString() converts the integer value in count into a String
            }
        }
        return newStr;
    }

    public static void main(String args[]) {
        String str = "aaabbccdee";
        System.out.println(compress(str)); // a3b2c2de2
    }
}



//dry run


// Initial
// newStr = ""
// Loop breakdown
// 1st group: "aaa"

// i = 0
// count = 1
// Compare:
// str[0] = a, str[1] = a → same → count = 2, i = 1
// str[1] = a, str[2] = a → same → count = 3, i = 2
// str[2] = a, str[3] = b → stop
// Add:
// newStr = "a"
// count > 1, so add 3
// newStr = "a3"
// 2nd group: "bb"

// i = 3
// count = 1
// Compare:
// str[3] = b, str[4] = b → same → count = 2, i = 4
// str[4] = b, str[5] = c → stop
// Add:
// newStr = "a3b"
// add 2
// newStr = "a3b2"
// 3rd group: "cc"

// i = 5
// count = 1
// Compare:
// str[5] = c, str[6] = c → same → count = 2, i = 6
// str[6] = c, str[7] = d → stop
// Add:
// newStr = "a3b2c"
// add 2
// newStr = "a3b2c2"
// 4th group: "d"

// i = 7
// count = 1
// No repeated next character
// Add:
// newStr = "a3b2c2d"
// count is 1, so no number added
// 5th group: "ee"

// i = 8
// count = 1
// Compare:
// str[8] = e, str[9] = e → same → count = 2, i = 9
// Add:
// newStr = "a3b2c2de"
// add 2
// newStr = "a3b2c2de2"
// Final Output
// a3b2c2de2