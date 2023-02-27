package org.example.model;

public class Stock {
    private int rank;
    private String symbol;
    private String name;
    private float marketCapInBillions;
    private float dividend;

    public Stock(String row){
        String[] column = row.split(",");
        this.rank =Integer.parseInt(column[0]);
        this.symbol = column[1];
        this.name = column[2];
        this.marketCapInBillions = Float.parseFloat(column[6]);
        column[7] = column[7].replace("-","0");
        this.dividend = Float.parseFloat(column[7]);
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getMarketCapInBillions() {
        return marketCapInBillions;
    }

    public void setMarketCapInBillions(float marketCapInBillions) {
        this.marketCapInBillions = marketCapInBillions;
    }

    public float getDividend() {
        return dividend;
    }

    public void setDividend(float dividend) {
        this.dividend = dividend;
    }
    @Override
    public String toString() {
        return "Stock{" +
                "rank=" + rank +
                ", symbol='" + symbol + '\'' +
                ", name='" + name + '\'' +
                ", marketCapInBillions=" + marketCapInBillions +
                ", dividend=" + dividend +
                '}';
    }
}
