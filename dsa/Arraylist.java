import java.util.ArrayList;

public class Arraylist {
    public static void main(String args[]) {
        //className objectName = new ClassName();
       ArrayList<Integer> list = new ArrayList<>();
       ArrayList<String> list2 = new ArrayList<>();
       ArrayList<Boolean> list3 = new ArrayList<>();
      
       //add operation O(1)

       list.add(1);// at oth index 1
       list.add(2);// at 1th index 2
       list.add(3);// at 2th index 3
       list.add(4);// at 3th index 4
       System.err.println(list);

       //or

       list.add(1,10);//tc is O(n) and here at 1th index 10 is added and others elements shit accordingly
           System.err.println(list);

       //Get operation   - O(1)

        int element = list.get(1);
        System.out.println(element);

       //Delete operation  - O(n)

     list.remove(2);
      System.out.println(list);

      //set operation  - O(n)

      list.set(3,15);//at3rd index number replace with 15 number 
      System.err.println(list);

      //contain - O(n)

      System.err.println(list.contains(1));//chech number 1 is present or not
      System.err.println(list.contains(17));//chech number 17 is present or not
    }
}
