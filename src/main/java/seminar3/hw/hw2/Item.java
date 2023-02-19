package seminar3.hw.hw2;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Item {
    private String name;
    private String country;
    private Double mass;
    private Integer price;
    private Integer itemQality;
}