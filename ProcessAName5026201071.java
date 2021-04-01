import java.util.Scanner;

public class ProcessAName5026201071 {
    public static void main(String[] args){

        Scanner nameSCN = new Scanner(System.in);
        System.out.println("Input your name : ");

        String firstName = nameSCN.nextLine();
        int Space = firstName.indexOf(" ");
        String lastName = firstName.substring((Space+1), firstName.length());

        System.out.println("Your name is : " + lastName + ", " + firstName.charAt(0));

    }
}