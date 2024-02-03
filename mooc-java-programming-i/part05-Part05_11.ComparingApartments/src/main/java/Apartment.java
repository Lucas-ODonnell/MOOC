
public class Apartment {

    private int rooms;
    private int squares;
    private int pricePerSquare;

    public Apartment(int rooms, int squares, int pricePerSquare) {
        this.rooms = rooms;
        this.squares = squares;
        this.pricePerSquare = pricePerSquare;
    }

    public int apartmentPrice() {
        return this.squares * this.pricePerSquare;
    }

    public boolean largerThan(Apartment compared) {
        if (this.squares > compared.squares) {
            return true;
        } else {
            return false;
        }
    }

    public int priceDifference(Apartment compared) {
        return Math.abs(this.apartmentPrice() - compared.apartmentPrice());
    }

    public boolean moreExpensiveThan(Apartment compared) {
        if (this.apartmentPrice() > compared.apartmentPrice()) {
            return true;
        } else {
            return false;
        }
    }

}
