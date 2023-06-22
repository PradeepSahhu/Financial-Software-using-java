public class MutualFunds extends ShareAssets{

    private double totalShares;

    public MutualFunds(String symbol, double currentPrice) {
        super(symbol, currentPrice);
        this.totalShares = 0.0;
    }

    @Override
    public double getMarketValue() {
        return totalShares * getCurrentPrice();
    }

    public double getTotalShares() {
        return totalShares;
    }



    // records purchased of the given shares at the given price.
    public void purchase(double shares, double pricePerShare){
        totalShares += shares;
//        totalShares = Double.sum(totalShares,shares);
        addCost(shares*pricePerShare);
    }
}
