/* A class to represent a Customer
 * This class represents a customer and their investments in a bond and mutual fund
 * Methods for buying and selling these investments and calculating the current value and capital gains.
 * @Author: Merve Ziya
 */
public class Customer {
  
  //store the bond the bond
  private Bond bond;
  
  //store the mutualFund of the mutualFund
  private MutualFund mutualFund;
  
  //store the totalcash
  private double totalCash;
  
  //store the first name
  private String firstName;
  
  //store the last name
  private String lastName;
  
  
   /* Constructs a new Customer object with the bond, mutualfund, firstName, lastName, totalCash.
    * @param first name and last name, the name and surname of the customer
    * @param mutualFund the mutual fund to be held by the customer
    * @param totalCash the total amount of cash held by the customer
    */
   public Customer(Bond bond, MutualFund mutualFund, String firstName, String lastName, double totalCash){
     this.bond = bond;
     this.mutualFund = mutualFund;
     this.firstName = firstName;
     this.lastName = lastName;
     this.totalCash = totalCash;
   }
   
   
   /* Retrieve the name of the Customer
    * @return String first name 
    */
   public String getFirstName(){
     return this.firstName;
   }
   
   
   /* Change the name of Customer
    * @param String name
    */
   public void setFirstName(String firstName){
     this.firstName = firstName;
   }
   
   
   /* Retrieve the surname of the Customer
    * @return String surname
    */
   public String getLastName(){
     return this.lastName;
   }
   
   
   /* Change the surname of Customer
    * @param String surname
    */
   public void setLastName(String lastName){
     this.lastName = lastName;
   }
   
   
   /* Retrieve the bond of Customer
    * @return bond type bond
    */
   public Bond getBond(){
     return this.bond;
   }
   
   
   /* Change the bond of the Bond
    * @param bond bond
    */
   public void setBond(Bond bond) {
     this.bond=bond;
   }
   
   
   /* Retrieve the mutual fund of Customer
    * @return mutualFund type mutualfund
    */
   public MutualFund getMutualFund(){
     return this.mutualFund; 
   }
   
   
   /* Change the mutualFund of the mutualFund
    * @param mutualFund mutualFund
    */
   public void setMutualFund(MutualFund mutualFund){
     this.mutualFund = mutualFund;
   }
   
   
   /*
    * Returns the current value of the customer's investments, including the bond and mutual fund.
    * @return the current value of the customer's investments
    */
   public double currentValue(){
     double bond1= 0.0;
     double mutualFund1 = 0.0;
     if (bond != null) {
       bond1 = bond.getCurrentPrice() * bond.getNumberOwned();
     }
     if (mutualFund != null) {
       mutualFund1 = mutualFund.getCurrentPrice() * mutualFund.getNumberShares();
     }
     double result = bond1 + mutualFund1;
     return result;
   }
  
   
   /*
    * Calculates the capital gains of the customer's investments.
    * @return the capital gains of the customer's investments else return 0.0
    */
   public double getCapitalGains(){
     if((bond != null) && (mutualFund != null)){
       double capitalGain = (bond.getCapitalGains() + mutualFund.getCapitalGains());
       return capitalGain;
     }
     else
       return 0.0;
   }
   
   
   /*
    * Selling bond increases the total cash. 
    */
   public void sellBond(){
     this.totalCash += bond.sell();
   }
    
   
   /*
    * Buying the bond decreases the total cash.
    * @return true if the bond is bought, false otherwise.
    */
   public boolean buyBond(){
     if(bond.getCurrentPrice() > this.totalCash){
       return false;
     }
     this.totalCash -= bond.buy() ;
     return true; 
   }
   
   
   /*
    * Increases the total cash by selling the mutual fund.
    * @param amountWD the amount to be withdrawn from the mutual fund.
    */
   public void withdrawMutualFund(double amountWD){
     totalCash += mutualFund.sell(amountWD);
   }
   
   
   /*
    * Decreases the total cash by buying the mutual fund.
    * @param value the value of the mutual fund to be bought.
    * @return true if the mutual fund is bought successfully, false otherwise.
    */
   public boolean buyMutualFund(double value){
     if(value > this.totalCash){
       return false;
     }
     double buyMethod = mutualFund.buy(value);
     this.totalCash -= buyMethod;
     return true;
   }

                
                   
}