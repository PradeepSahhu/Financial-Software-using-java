public class Cash implements Asset{



    private double amount; // amount of money held

    public Cash(double amount) {
        this.amount = amount;
    }


    @Override
    public double getMarketValue() {
        return amount;
    }

    // No profit since cash is fixed amount.
    @Override
    public double getProfit() {
        return 0;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }



}
