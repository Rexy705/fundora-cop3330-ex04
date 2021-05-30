import java.util.Scanner;

public class ex04 {
    public static void main (String[] args){
        Scanner input1 = new Scanner(System.in),
                input2 = new Scanner(System.in),
                input3 = new Scanner(System.in),
                input4 = new Scanner(System.in);

        System.out.print("Enter a noun: ");
        String noun = input1.next();
        System.out.print("Enter a verb: ");
        String verb = input2.next();
        System.out.print("Enter an adjective: ");
        String adjective = input3.next();
        System.out.print("Enter an adverb: ");
        String adverb = input4.next();

        System.out.println("Do you " + verb + " your " + adjective + " " + noun + " "
                            + adverb + "? That's hilarious!");
    }
}
