import java.util.*;

public class ATM{
    public static void main(String[] args){
        try (Scanner sc = new Scanner(System.in)) {
            int balance = 10000;
            int withdraw = 0 , deposit = 0;

   //Data handling use karde isme
   
                while(true)  
                {  

                    System.out.println("Welcome to ATM.......");  
                    System.out.println("Choose 1 for Check Balance");  
                    System.out.println("Choose 2 for Withraw");  
                    System.out.println("Choose 3 for Deposit");  
                    System.out.println("Choose 4 for Quit");  
                    System.out.print("Choose the operation you want to perform:");  
                      
                     
                    int choice = sc.nextInt();

                    switch(choice){
                        
                        case 1 :
                        System.out.println("Current Balance : " + balance);
                        break;

                        case 2 : 
                        System.out.print("Enter money to be withdrawn:");  
                        withdraw = sc.nextInt();  
                                      
                        if(balance >= withdraw)  
                        {    
                            balance = balance - withdraw;  
                            System.out.println("Please collect your money");  
                        }  
                        else  
                        {  
                            System.out.println("Insufficient Balance");  
                        }  
                        System.out.println("");  
                        break;  

                        case 3 :
                        System.out.print("Enter money to be deposited:");  
                        deposit = sc.nextInt();  
                              
                
                        balance = balance + deposit;  
                        System.out.println("Your Money has been successfully depsited");  
                        System.out.println("");  
                        break;

                        case 4 :
                        System.exit(0);

                        default : 
                        System.out.println("Invalid choice. Please select a valid option (1/2/3/4).");

                    }
                }
        }
        }    
    }
