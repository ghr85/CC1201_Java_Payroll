import org.junit.Before;
import org.junit.Test;
import techStaff.DatabaseAdmin;

import static junit.framework.TestCase.assertEquals;

public class TestDatabaseAdmin {

    public DatabaseAdmin databaseAdmin;
    @Before

    public void before(){
        this.databaseAdmin = new DatabaseAdmin("Rachael DonkeyWork", "JS123333",21000);
    }

    @Test
    public void hasName(){
        assertEquals("Rachael DonkeyWork", databaseAdmin.getName());
    }


    @Test
    public void hasNi(){
        assertEquals("JS123333",databaseAdmin.getNi());
    }

    @Test
    public void canRaiseSalary(){
        databaseAdmin.raiseSalary(1000);
        assertEquals(22000.0,databaseAdmin.getSalary());
    }

    @Test
    public void failRaiseSalary(){
        databaseAdmin.raiseSalary(-1000);
        assertEquals(21000.0,databaseAdmin.getSalary());
    }

    @Test
    public void canChangeName(){
        databaseAdmin.changeName("Fiona Fudger");
        assertEquals("Fiona Fudger", databaseAdmin.getName());
    }
    @Test
    public void canChangeNameFail(){
        databaseAdmin.changeName(null);
        assertEquals("Rachael DonkeyWork", databaseAdmin.getName());
    }

    @Test
    public void canPayBonus(){
        assertEquals(210.0,databaseAdmin.payBonus());
    }
}
