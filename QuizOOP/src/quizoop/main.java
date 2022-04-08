/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quizoop;


import finalization.AndroidScoreCount;
import finalization.WebScoreCount;
import java.util.Scanner;
/**
 *
 * @author Gustav
 */
public class main {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Scanner choose = new Scanner(System.in);
        Scanner input = new Scanner(System.in);
        int form;
            
            System.out.println("Registration Form ");
            System.out.println("1. Android Development");
            System.out.println("2. Web Development");
            System.out.print("Select the division you want to join : ");
            form = choose.nextInt();
            
            switch (form){
                case 1 :
                    android(input);
                    break;
                case 2 :
                    website(input);
                    break; 
            }
    }
    
    public static void android(Scanner input){
        String nik;
        String name;
        double Writingscore;
        double Codingscore;
        double Interviewscore;
        int choise;
            
            Scanner choose = new Scanner(System.in);
            System.out.println(" ");
            Scanner file = new Scanner(System.in);
            System.out.println("Registration Form\n");
            System.out.println(" ");
            System.out.print("Input your NIK : ");
            nik = file.nextLine();
            System.out.print("Input your name : ");
            name = file.nextLine();
            System.out.print("Input writing test score : ");
            Writingscore = file.nextDouble();
            System.out.print("Input coding test score : ");
            Codingscore = file.nextDouble();
            System.out.print("Input interview test score : ");
            Interviewscore = file.nextDouble();
            AndroidScoreCount AndroidCount = new AndroidScoreCount(nik, name, Writingscore, Codingscore, Interviewscore);
            
            do{
                System.out.println(" ");
                System.out.println("Menu");
                System.out.println("1. Edit");
                System.out.println("2. Show Result");
                System.out.println("3. Exit");
                System.out.print("input here : ");
                choise = choose.nextInt();
                  
                    switch(choise) {
                        case 1:
                            Scanner EditedData = new Scanner(System.in);
                            System.out.println(" ");
                            System.out.println("EDITFORM");
                            System.out.print("Input writing test score : "); AndroidCount.Writingscore = EditedData.nextDouble();
                            System.out.print("Input coding test score : "); AndroidCount.Codingscore = EditedData.nextDouble();
                            System.out.print("Input interview test score : "); AndroidCount.Interviewscore = EditedData.nextInt();
                            break;
                        case 2:
                            double ScoreSUM;
                            String Username;
                            System.out.println(" ");
                            
                            ScoreSUM = AndroidCount.eliminateWriting() + AndroidCount.eliminateCoding() + AndroidCount.eliminateInterview();
                            Username = AndroidCount.getName();
                          
                            System.out.println("Final Score  : " + ScoreSUM);
                            if (ScoreSUM < 85) {
                                System.out.println("RESULT : REJECTED!");
                                System.out.println("we apologize to  " + Username + " we can't accept you because you don't meet our qualifications");
                            } else {
                                System.out.println("RESULT : ACCEPTED!");
                                System.out.println("congratulation to " + Username + " you're now part of our team in android development division");
                            }
                            break;
                            
                            case 3 :
                                System.out.println(" ");
                                System.out.println("Thankyou for applying to us");
                                break;
                    }
                } while (choise!=3); 
    }
    
    public static void website(Scanner input){
        String nik;
        String name;
        double Writingscore;
        double Codingscore;
        double Interviewscore;
        int choise;
            
            Scanner choose = new Scanner(System.in);
            System.out.println(" ");
            Scanner file = new Scanner(System.in);
            System.out.println("Registration Form\n");
            System.out.println(" ");
            System.out.print("Input your NIK : ");
            nik = file.nextLine();
            System.out.print("Input your name : ");
            name = file.nextLine();
            System.out.print("Input writing test score : ");
            Writingscore = file.nextDouble();
            System.out.print("Input coding test score : ");
            Codingscore = file.nextDouble();
            System.out.print("Input interview test score : ");
            Interviewscore = file.nextDouble();
            WebScoreCount WebCount = new WebScoreCount(nik, name, Writingscore, Codingscore, Interviewscore);
            
            do{
                System.out.println(" ");
                System.out.println("Menu");
                System.out.println("1. Edit");
                System.out.println("2. Show Result");
                System.out.println("3. Exit");
                System.out.print("input here : ");
                choise = choose.nextInt();
                  
                    switch(choise) {
                        case 1:
                            Scanner EditedData = new Scanner(System.in);
                            System.out.println(" ");
                            System.out.println("EDIT FORM");
                            System.out.print("Input writing test score : "); WebCount.Writingscore = EditedData.nextDouble();
                            System.out.print("Input coding test score : "); WebCount.Codingscore = EditedData.nextDouble();
                            System.out.print("Input interview test score : "); WebCount.Interviewscore = EditedData.nextInt();
                            break;
                        case 2:
                            double ScoreSUM;
                            String Username;
                            System.out.println(" ");
                            
                            ScoreSUM = WebCount.eliminateWriting() + WebCount.eliminateCoding() + WebCount.eliminateInterview();
                            Username = WebCount.getName();
                          
                            System.out.println("Final Result : " + ScoreSUM);
                            if (ScoreSUM < 85) {
                                System.out.println("RESULT : REJECTED!");
                                System.out.println("we apologize to " + Username + " we can't accept you because you don't meet our qualifications");
                            } else {
                                System.out.println("RESULT : ACCEPTED!");
                                System.out.println("congratulation to " + Username + " you're now part of our team in web development division");
                            }
                            break;
                            
                            case 3 :
                                System.out.println(" ");
                                System.out.println("Thankyou for applying to us");
                                break;
                    }
                } while (choise!=3);
    }
}
