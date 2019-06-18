/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package account;

/**
 *
 * @author Denbin Jose
 */
public class Account {

    
        private double balance;
        private double interestRate=0.23;
        private String user;
 
     /**constructor that takes the initial balance
      * @param initialBalance 
      */
        public Account(double initialBalance,String givenUser)
        {
            balance=initialBalance;
            user=givenUser;
            //Note that the initial balance must be greater than 50.       
        }
        
     /**The method for depositing amount and 
      * updating balance*/
        public void credit(double amount)
        {
            balance=getBalance()+amount;
        }

     /**The method for debit(withdrawing amount) and 
      * updating balance */
        public void debit(double amount)
        {
            balance=getBalance()-amount;

        }
        
     /**The getter for the balance
     * @return the balance
     */
    
        public double getBalance() 
        {
           if(balance>50){
                System.out.println("Account is created");
               
            }
           
    
        return balance;
        }

    /**The getter for InterestRate
     * @return the interestRate
     */
        public double getInterestRate() 
        {
            return interestRate;
        }
         public double getYearlyInterestRate() 
        {
            return balance+balance*0.23;
        }

    /**user is the read only field
     * @return the user
     */
    public String getUser() {
        return user;
    }
    
    
}//class end



/*1. A written description in the response box of your design for the 
code extension. It does not need to include any UML diagrams, just an explanation 
of how you will approach it and how that incorporates good design. (2 of 10 points)

Ans: This code is designed with encapsulation and loosily coupled principle
     so it is more protected and can be edit easily.
*/