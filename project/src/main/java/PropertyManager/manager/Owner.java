package PropertyManager.manager;


import java.time.LocalDate;
import lombok.Data;

/**
 * Created by Jan
 */
@Data
public class Owner {
    private Long id;
    private String name;
    private String surname;
    private LocalDate born;
    private String phoneNumber;
    private String addressStreet;
    private String addressTown;

    public Owner() {
    }

    public Owner(String name, String surname, LocalDate born, String phoneNumber, String addressStreet, String addressTown) {
        this.id = null;
        this.name = name;
        this.surname = surname;
        this.born = born;
        this.phoneNumber = phoneNumber;
        this.addressStreet = addressStreet;
        this.addressTown = addressTown;
    }

    public Owner(Long id, String name, String surname, LocalDate born, String phoneNumber, String addressStreet, String addressTown) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.born = born;
        this.phoneNumber = phoneNumber;
        this.addressStreet = addressStreet;
        this.addressTown = addressTown;
    }

}
