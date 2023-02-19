package seminar3.hw.hw1;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Item {
    private String name;
    private Double price;
    private Integer itemQality;
}
