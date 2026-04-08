public class Oops {
    public static void main(String[] args) {
        Pen pen1 = new Pen(); // created a pen object named pen1
        pen1.setcolor("blue"); // setting the color property of pen1
        System.out.println("Pen color: " + pen1.color); // accessing the color property of pen1
        
        pen1.setcolor("red"); // changing the color property of pen1
        System.out.println("Pen color: " + pen1.color); // accessing the updated color property of pen1
        //or
        pen1.color = "green"; //  here we dont call function and directly accessing and changing the color property of pen1
        System.out.println("Pen color: " + pen1.color); // accessing the updated color property of pen1

        pen1.settip(5); // setting the tip property of pen1
        System.out.println("Pen tip size: " + pen1.tip); // accessing the tip property of pen1  
        
    }
}


class Pen {
    // properties
    String color;
    int tip;

    //functions
  void setcolor(String newcolor) {
        color = newcolor;
        
    }

    void settip(int newtip) {
        tip = newtip;
    }
}