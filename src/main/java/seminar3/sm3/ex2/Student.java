package seminar3.sm3.ex2;


import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class Student {
    String fio;
    Integer group;
    Integer money;
    List<Integer> count;
}
