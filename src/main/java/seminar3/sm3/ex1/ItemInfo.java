package seminar3.sm3.ex1;
//указывается наименование товара, страна, экспортирующая товар, и объем поставляемой партии в штуках.


import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ItemInfo {

    String itemName;
    String contryName;
    Integer value;

}
