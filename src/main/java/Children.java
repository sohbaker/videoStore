public class Children implements RentalType {
    public Children(String title, int daysRented) {
        this.movieTitle = title;
        this.daysRented = daysRented;
    }

    public int getDaysRented() {
        return daysRented;
    }

    public String getTitle() {
        return this.movieTitle;
    }

    public double getTotalRentalCost() {
        double total = 1.5;
        if (getDaysRented() > 3) {
            total += (getDaysRented() - 3) * 1.5;
        }
        return total;
    }

    public String getType() { return this.type; }

    private String movieTitle;
    private int daysRented;
    private String type = "Children";
    // public static final int PRICE_CODE = 2;
}
