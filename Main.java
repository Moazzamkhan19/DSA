import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        LinkedList list=new LinkedList();
        list.add(1);
        list.add(2);

        list.add(4);
        list.add(5);
        list.addatfront(6);
        System.out.println("Enter the value before which you want to add a new node");
        int num=sc.nextInt();
        System.out.println("Enter the value before which you want to add");
        int num1=sc.nextInt();

        list.addmiddle(num1,num);

        list.display();

        System.out.println("After removing value from front");

        list.delete();
        System.out.println("After removing value from rear");
        list.deleteend();
        list.display();

        System.out.println("After removing value from middle");

        list.deletemiddle(2);
        list.display();
}}