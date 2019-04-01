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


}
