import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import com.example.simpleparadox.listycity.City;
import com.example.simpleparadox.listycity.CustomList;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

public class CustomListTest {
    private CustomList list;

    @Before
    public void createList(){
        list = new CustomList(null,new ArrayList<City>());
    }

    @Test
    public void addCityTest(){
        int listSize = list.getCount();
        list.addCity(new City("Edmonton","AB"));
        assertEquals(list.getCount(), listSize+1);
    }

    @Test
    public void hasCityTest(){
        City city = new City("Vancouver","BC");
        boolean beforeAdd = list.hasCity(city);
        list.addCity(city);
        boolean afterAdd = list.hasCity(city);
        assertNotEquals(beforeAdd,afterAdd);
   }

    @Test
    public void deleteTest(){
        City city = new City("Ontario","ON");
        list.addCity(city);
        boolean beforeDelete = list.hasCity(city);
        list.delete(city);
        boolean afterDelete = list.hasCity(city);
        assertNotEquals(beforeDelete,afterDelete);
    }

    @Test
    public void countCitiesTest(){
        int listSizeBefore = list.countCities();
        list.addCity(new City("Quebec","QC"));
        int listSizeAfter = list.countCities();
        assertEquals(listSizeAfter, listSizeBefore+1);
    }

}
