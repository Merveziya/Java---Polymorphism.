/* A class to represent an Equity extends Asset class
 * Type of financial security that represents ownership in a company.
 * @Author: Merve Ziya
 */
public class Equity extends Asset{
  
  //store the symbol variable as final
  private final char symbol;
   
  //store the number shares of Equýty
  private double numberShares;
  
   /* Constructs a new Equity object with the given name, symbol and current price.
    * @param name the name of the Equity
    * @param symbol number of shares owned of the equity
    * @paramcurrentPrice of the Equity
    * We cannot access the currentPrice because it is private.So, we use getter setter method.
    */
    public Equity(String name, char symbol, double currentPrice) {
     super(name,0);
     this.symbol = symbol;
     this.numberShares = 0;
    }
    
    
    /* Retrieve the symbol of the equity
     * @return char symbol
     */
    public char getSymbol(){
      return this.symbol;
    }
    
    
    /* Retrieve the number shares of the Equity
     * @return double number shares
     */
    public double getNumberShares() {
      return this.numberShares;
    }
    
    
    /* Change the number shares of the equity
     * @param double number shares
     */
    public void setNumberShares(double numberShares) {
      this.numberShares = numberShares;
    }
}