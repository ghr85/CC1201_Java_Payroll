import org.junit.Before;
import org.junit.Test;
import techStaff.Developer;

import static junit.framework.TestCase.assertEquals;

public class TestDeveloper {

    public Developer developer;
    @Before

    public void before(){
        this.developer = new Developer("Rachael DonkeyWork", "JS123333",21000);
    }

    @Test
    public void hasName(){
        assertEquals("Rachael DonkeyWork", developer.getName());
    }


    @Test
    public void hasNi(){
        assertEquals("JS123333",developer.getNi());
    }

    @Test
    public void canRaiseSalary(){
        developer.raiseSalary(1000);
        assertEquals(22000.0,developer.getSalary());
    }

    @Test
    public void canPayBonus(){
        assertEquals(210.0,developer.payBonus());
    }

}
