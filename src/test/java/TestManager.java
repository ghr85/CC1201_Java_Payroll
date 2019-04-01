import management.Manager;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class TestManager {
    public Manager manager;

    @Before
    public void before(){
        manager = new Manager("Shona Whipcrack", "JS123445",30000, "Mid Management");
    }

    @Test
    public void hasName(){
        assertEquals("Shona Whipcrack", manager.getName());
    }

    @Test
    public void hasDept(){
        assertEquals("Mid Management",manager.getDept());
    }

    @Test
    public void hasNi(){
        assertEquals("JS123445",manager.getNi());
    }

    @Test
    public void canRaiseSalary(){
        manager.raiseSalary(1000);
        assertEquals(31000.0,manager.getSalary());
    }

    @Test
    public void failRaiseSalary(){
        manager.raiseSalary(-1000);
        assertEquals(30000.0,manager.getSalary());
    }

    @Test
    public void canChangeName(){
        manager.changeName("Fiona Fudger");
        assertEquals("Fiona Fudger", manager.getName());
    }
    @Test
    public void canChangeNameFail(){
        manager.changeName(null);
        assertEquals("Shona Whipcrack", manager.getName());
    }

    @Test
    public void canPayBonus(){
        assertEquals(300.0,manager.payBonus());
    }


}
