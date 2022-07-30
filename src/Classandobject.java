import java.util.Scanner;

public class Classandobject {
    public static void main(String[] args) {
        var h1=new Human();
        System.out.println("Enter the Attributes of the person 1 ");
        h1.name=new Scanner(System.in).nextLine();
        h1.gender=new Scanner(System.in).nextLine();
        h1.length=new Scanner(System.in).nextInt();
        h1.info();
    }

}
class Human{
    String name;
    String gender;
    int length;
    public void info(){
        this.length+=10;
        System.out.println("Your Name Is : "+this.name);
        System.out.println("Your Gender Is : "+this.gender);
        System.out.println("Your Length Is : "+this.length);
    }
}