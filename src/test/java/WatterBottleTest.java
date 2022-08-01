import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WatterBottleTest {
    WaterBottle myWaterBottle;
    @Before
    public void beforeEach(){
        myWaterBottle = new WaterBottle("Mr. Sippy Cup");
    }

    @Test
    public void hasName(){
        assertEquals("Mr. Sippy Cup", myWaterBottle.getName());
    }

    @Test
    public void hasVolume(){
        assertEquals(100, myWaterBottle.getVolume());
    }

    @Test
    public void canDrink(){
        myWaterBottle.drink();
        assertEquals(90, myWaterBottle.getVolume());
    }

    @Test
    public void canEmpty(){
        myWaterBottle.empty();
        assertEquals(0, myWaterBottle.getVolume());
    }

    @Test
    public void canFill(){
        myWaterBottle.empty();
        myWaterBottle.fill();
        assertEquals(100, myWaterBottle.getVolume());
    }
}
