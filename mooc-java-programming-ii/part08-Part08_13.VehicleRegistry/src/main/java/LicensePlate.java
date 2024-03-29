
import java.util.Arrays;
import java.util.Objects;

public class LicensePlate {
    // don't modify existing parts of this class

    // these instance variables have been defined as final, meaning 
    // that once set, their value can't be changed
    private final String liNumber;
    private final String country;

    public LicensePlate(String country, String liNumber) {
        this.liNumber = liNumber;
        this.country = country;
    }

    public boolean equals(Object object) {
        if(this == object) {
            return true;
        }
        if(!(object instanceof LicensePlate)) {
            return false;
        }
        LicensePlate potentialLicense = (LicensePlate) object;
        if(this.liNumber.equals(potentialLicense.liNumber) && this.country.equals(potentialLicense.country)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[] {this.liNumber, this.country});
    }

    @Override
    public String toString() {
        return country + " " + liNumber;
    }

}
