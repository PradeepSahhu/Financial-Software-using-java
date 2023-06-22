public abstract class ShareAssets implements Asset{



    private String symbol;
    private double totalCost;
    private double currentPrice;

    public ShareAssets(String symbol, double currentPrice) {
        this.symbol = symbol;

        this.currentPrice = currentPrice;
        this.totalCost = 0.0;
    }

    public void setCurrentPrice(double currentPrice) {
        this.currentPrice = currentPrice;
    }

    //adds a cost of the given amount to this asset.

    public void addCost(double cost){
        totalCost+=cost;
    }

    // returns the price per share of this asset
    public double getCurrentPrice(){
        return currentPrice;
    }
    public double getTotalCost(){
        return totalCost;
    }


    // This return the current market value of this asset.
    @Override
    public abstract double getMarketValue();

    // This will return the profit earned on shares.

    public double getProfit(){

        // it will call an abstract getMarketValue method;
        return getMarketValue() - getTotalCost();
    };
}