/* A class to represent an Asset
 * Stores various properties such as the asset name, cost basis, capital gains, description, and current price
 * Allows for modification of these properties.
 * @Author: Merve Ziya
 */
public class Asset {
  
   //store the name of the asset
   private String name;
    
   //store the cost basis of the asset
   private double costBasis;
    
   //Initialize the capital gains of the asset to 0.0
   private double capitalGains = 0.0;
    
   //store the description of the asset
   private String description = "";
    
   //store the currentPrice of the asset
   private double currentPrice;
    
    
  /* Constructs a new Asset object with the given name and cost basis.
   * @param name the name of the Asset
   * @param costBasis the cost basis of the asset
   */ 
   public Asset(String name, double costBasis) {
        this.name = name;
        this.costBasis = costBasis;
        this.currentPrice = 0.0;
   }
 
  
  /* Retrieve the name of the Asset
   * @return String Asset name
   */
   public String getName(){
     return this.name;
   }
 
  
  /* Change the name of the Asset
   * @param String Asset name
   */
   public void setName(String name){
     this.name= name;
   }
  
  
  /* Retrieve the description of the Asset
   * @return String Asset description
   */
   public String getDescription(){
     return "This is some information about description: " + this.description;
   }

  
  /* Change the description of the Asset
   * @param String description
   */
   public void setDescription(String description){
     this.description = description;
   }
  
  
  /* Retrieve the cost basis of the Asset
   * @return double cost basis
   */
   public double getCostBasis(){
     return this.costBasis;
   }
  
  
  /* Change the cost basis of the Asset
   * @param double cost basis
   */
   public void setCostBasis(double costBasis){
     this.costBasis=costBasis;
   }
  
  
  /* Retrieve the current price of the Asset
   * @return double current basis
   */
   public double getCurrentPrice(){
     return this.currentPrice;
   }
  
  
  /* Change the current price of the Asset
   * @param double current price
   */
   public void setCurrentPrice(double currentPrice){
     this.currentPrice = currentPrice;
   }
  
  
  /* Retrieve the capital gains of the Asset
   * @return double capital gains
   */
   public double getCapitalGains(){
     return this.capitalGains;
   }
  
  
  /* Change the capital gains of the Asset
   * @param double capital gains
   */
   public void setCapitalGains(double capitalGains){
     this.capitalGains = capitalGains;
   }
  
  
}