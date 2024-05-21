import java.time.LocalDate;

public class College extends Educationcenter{

    public College(String name, String locatedCountry, LocalDate foundationYear) {
        super(name, locatedCountry, foundationYear);
    }

    @Override
    public void getInfo() {
        System.out.println("College: " + getName());
        System.out.println("Country: " + getLocatedCountry());
        System.out.println("foundation Year: " + getFoundationYear());
    }

}
