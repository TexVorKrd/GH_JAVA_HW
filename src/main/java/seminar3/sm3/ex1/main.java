package seminar3.sm3.ex1;


//1/Даны сведения об экспортируемых товарах:
// указывается наименование товара, страна, экспортирующая товар, и объем поставляемой партии в штуках.
// Найти страны, которые экспортируют данный товар, и общий объем его экспорта.


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class main {

    public static void main(String[] args) {

        ItemInfo it1 = new ItemInfo("qwer", "asd", 3);
        ItemInfo it2 = new ItemInfo("qwer1", "sfasd", 4);
        ItemInfo it3 = new ItemInfo("qwer1", "asfsd", 5);
        ItemInfo it4 = new ItemInfo("qwer2", "asfdd", 6);
        ItemInfo it5 = new ItemInfo("qwer", "asd", 7);

        ArrayList<ItemInfo> itemList= new ArrayList<>();
        itemList.add(it1);
        itemList.add(it2);
        itemList.add(it3);
        itemList.add(it4);
        itemList.add(it5);


}

}
