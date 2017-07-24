package PropertyManager.manager;

import java.time.LocalDate;
import lombok.*;

/**
 * Created by Jan
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Owner {

    private Long id;
    private String name;
    private String surname;
    private LocalDate born;
    private String phoneNumber;
    private String addressStreet;
    private String addressTown;

}
