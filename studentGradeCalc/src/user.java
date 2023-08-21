import java.util.Scanner;

public class user {

    public static void main(String args[]){

        System.out.println("Enter the makrs of DSA: ");
        Scanner sc=new Scanner(System.in);
        int DSA= sc.nextInt();

        System.out.println("Enter the makrs of DBMS: ");
        Scanner sc1=new Scanner(System.in);
        int DBMS= sc.nextInt();

        System.out.println("Enter the makrs of MATHS: ");
        Scanner sc2=new Scanner(System.in);
        int MATHS= sc.nextInt();

        System.out.println("Enter the makrs of OS: ");
        Scanner sc3=new Scanner(System.in);
        int OS= sc.nextInt();

        int total=(DSA+DBMS+MATHS+OS);
        float avg=total/4;

        System.out.println("Press '1' for Total Marks");
        System.out.println("Press '2' for Average Percentage");

        Scanner sc4=new Scanner(System.in);
        int number=sc4.nextInt();

        switch (number){
            case 1:
                System.out.println("Total marks: "+total);
                break;

            case 2:
                System.out.println("Average % Obtained : "+avg);
                break;

            default:
                System.out.println("IVALID input!!!!!!!");
        }

        if (avg<100 && avg>80){
            System.out.println("GRADE 'A'");
        }
        else if( avg<80 && avg>70){
            System.out.println("GRADE 'B'");
        }
        else if( avg<70 && avg>60){
            System.out.println("GRADE 'C'");
        }
        else if(avg<60 && avg>50){
            System.out.println("GRADE 'D'");
        }
        else
            System.out.println("FAILED , Try NEXT YEAR");

}
}
