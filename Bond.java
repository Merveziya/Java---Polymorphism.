/* A class to represent an Bond extends Asset class
 * Represents a financial bond with properties such as principal, interest rate, and number of bonds owned.
 * @Author: Merve Ziya
 */
public class Bond extends Asset{
  
  //store the principal of the bond
  private double principalBond;
  
  //store the interest rate of the bond
  private double interestRate;
  
  //Initialize the number owned of the bond to 0
  private int numberOwned= 0;
  
   /* Constructs a new Bond object with the given name, principal bond and interest rate.
    * @param name the name of the Bond
    * @param interestRate the interest rate of the bond
    * @param principalBond principal of the bond
    */
   public Bond(String name, double interestRate, double principalBond) {
      super(name,0);
      this.principalBond=principalBond;
      this.interestRate=interestRate;
      setCurrentPrice(principalBond);
  }
    
   
   /* Retrieve the principal of the Bond
    * @return double principal bond
    */
   public double getPrincipal(){
      return this.principalBond;
   }
   
   
   /* Retrieve the number owned of the Bond
    * @return int number owned
    */
   public int getNumberOwned(){
      return this.numberOwned;
   }
   
   
   /* Change the number owned of the Bond
    * @param int number owned
    */
   public void setNumberOwned(int numberOwned){
      this.numberOwned=numberOwned;
   }
   
   
   /* Retrieve the interest rate of the Bond
    * @return double interest rate
    */
    public double getInterestRate(){
      return this.interestRate;
   }
    
    
   /* Change the interest rate of the Bond
    * @param double interest rate
    */
   public void setInterestRate(double interestRate){
      this.interestRate=interestRate;
   }
   
   
   /* @return double multiply the principalBond and interestRate
    */
   public double payInterest(){
      return principalBond*interestRate; 
   }
   
   
   /* The result is equal to  sum of getCurrentPrice() and getCostBasis()
    * The value of setNumberOwned equals the (getNumberOwned()equals + 1)
    * @return double current price
    */
   public double buy(){
     double costBasis =(getCurrentPrice()+ getCostBasis());
     setCostBasis(costBasis);
     setNumberOwned(getNumberOwned() + 1);
     return getCurrentPrice();
     
   }
   
   
   /*
    * This method sells a bond.
    * If there are no bonds owned, the method returns 0.
    * Otherwise, do the instructions
    * @return a double representing the current price of the bond after selling
    */
    public double sell(){
     
     if(this.numberOwned == 0){
       return 0;
     }
       
       setCostBasis(getCostBasis() - (getCostBasis() / this.numberOwned));
       double result =(getCurrentPrice()- getCostBasis());
       setCapitalGains(getCapitalGains()+ result);
       this.numberOwned -=1;
       return getCurrentPrice();
       
   }
  
}