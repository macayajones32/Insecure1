import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        System.out.println("Insecure: Issa Hive vs. Lawrence Hive");



        int teamIssa = 0;

        int teamLawrence = 0;

        String myAnswer;





        Scanner keyboard = new Scanner(System.in);



        System.out.println("Team Issa Score: " + teamIssa);

        System.out.println("Team Lawrence Score: " + teamLawrence);



        System.out.println("Lets play!");



        System.out.println("Was Issa wrong for cheating on Lawrence? (Y/N)");

        myAnswer = keyboard.nextLine();



        if (myAnswer == "Y") {

            teamLawrence = teamLawrence + 1;



        } else {

            teamIssa = teamIssa + 1;

        }



        System.out.println("He broke up with his girlfriend after learning she cheated on him. " +

                "moved all of his stuff out and had sex with a cute woman who’d been sweating him for months. Was he wrong(Y/N)?");

        myAnswer = keyboard.nextLine();



        if (myAnswer == "Y") {

            teamLawrence = teamLawrence + 1;



        } else {

            teamIssa = teamIssa + 2;

        }



        System.out.println("Did Issa deserve to be called a hoe ?");

        myAnswer = keyboard.nextLine();



        if (myAnswer == "N") {

            teamIssa = teamIssa + 2;



        } else {

            teamIssa = teamIssa + 1;

            teamLawrence = teamLawrence + 1;

        }



        System.out.println("Did his joblessness make him depressed, and sap his initiative and his " +

                "willingness to put any effort into being a good boyfriend?(Y/N)");



        myAnswer = keyboard.next();



        if (myAnswer == "Y") {

            teamIssa = teamIssa + 1;



        } else {

            teamLawrence = teamLawrence + 1;

        }





        if (teamLawrence > teamIssa) {

            System.out.println("Team Lawrence wins! Issa was wrong af!!");

        }else if (teamIssa == teamLawrence){

            System.out.println("They both full of shit ");

        }



        else {

            System.out.println("Team Issa Wins! Lawrence is a fboy!");

        }



        keyboard.close();

    }
}
