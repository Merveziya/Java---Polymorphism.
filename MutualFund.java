/* A class to represent a MutualFund extends Equity class
 * Allows buying and selling of shares with a load fee.
 * @Author: Merve Ziya
 */
public class  MutualFund extends Equity{
  
  //store the load of Fund
  private double loadFund;
  
  
  /* Constructs a new MutualFund object with the given name, symbol and current price.
   * @param name the name of the MutualFund
   * @param symbol number of shares owned of the MutualFund
   * @paramcurrentPrice of the MutualFund
   */
   public MutualFund(String name, char symbol, double currentPrice){
     super(name,symbol,currentPrice);
   }
   
   /* Retrieve the load of the MutualFund
    * @return double load
    */
   public double getLoad(){
     return this.loadFund;
   }
   
   
   /* Change the load of the MutualFund
    * @param double load
    */
   public void setLoad(double loadFund){
     this.loadFund=loadFund;
   }
  
   
   /*
    * This method buy a specified amount of the mutual fund.
    * @param double amountMoney, amount of money that you want to invest in the mutual fund
    * @return the input amount of money,or if value is negative, return 0
    */
   public double buy(double amountMoney){
     if(amountMoney <= 0){
       return 0;
     }
       double numberShares1 =  (amountMoney * ((100% - this.loadFund) / getCurrentPrice()))+ getNumberShares() ;
       setNumberShares(numberShares1);
       setCostBasis(getCostBasis() + amountMoney);
       return amountMoney;
   }
  
   
   /*
    * This method sells a specified amount of shares.
    * @param withdrawn the amount of money 
    * @return the amount of money withdrawn from the mutual fund
    */
   public double sell(double withdrawn){
     if((withdrawn <= 0) || (withdrawn >this.getCurrentPrice()*this.getNumberShares())) {
       return 0;
     }
       double sold =(withdrawn / this.getCurrentPrice()); 
       this.setNumberShares(this.getNumberShares() - sold);
       double newBasis = (sold / this.getNumberShares())* this.getCostBasis();
       this.setCostBasis(this.getCostBasis() - newBasis);
       this.setCapitalGains( this.getCapitalGains() + (withdrawn - newBasis)); 
       return withdrawn;
  
   }
   
}