// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {


        // Case Study : Financial Software.
        /**
         * let's consider the problem of gathering info about a person's financial investments.
         * we have stocks, Dividend Stocks , mutual Funds, Real estate, Cash...
         *
         * How would you design a complete portfolio System?
         * what new types of objects would you write?
         *
         */

        Asset asset = new MutualFunds("Amazon",300);
        System.out.println(asset.getMarketValue());
        ((MutualFunds) asset).purchase(2.2,300);
        System.out.println(asset.getMarketValue());
        System.out.println(((MutualFunds) asset).getTotalCost());
    }

    // 1 - Classes : Stocks, DividendStocks, MutualFunds, Cash
    // 2 - Relations: DividendStock is-a stock.


    // 3 - Because Different assets compute their market values in different ways.
    //   -  We use Interface : getMarket Value and getProfit.

    // 4 - Similarities between mutual funds and stocks.??
      // - both mutual funds and stocks store assets that are based on shares.






}