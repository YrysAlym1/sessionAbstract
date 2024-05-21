import java.time.LocalDate;

public class School extends Educationcenter{


    public School(String name, String locatedCountry, LocalDate foundationYear) {
        super(name, locatedCountry, foundationYear);
    }

    @Override
    public void getInfo() {
        System.out.println("School: " + getName());
        System.out.println("Country: " + getLocatedCountry());
        System.out.println("foundation Year: " + getFoundationYear());
    }

}
