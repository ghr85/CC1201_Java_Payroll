import management.Director;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class TestDirector {
    public Director director;
    @Before
    public void before(){
        director = new Director("Regina Garfield", "BB100000",50000,"Chief Executive of colouring in",20000);
    }


    @Test
    public void hasName(){
        assertEquals("Regina Garfield", director.getName());
    }


    @Test
    public void hasNi(){
        assertEquals("BB100000",director.getNi());
    }

    @Test
    public void canRaiseSalary(){
        director.raiseSalary(1000);
        assertEquals(51000.0,director.getSalary());
    }
    @Test
    public void failRaiseSalary(){
        director.raiseSalary(-1000);
        assertEquals(50000.0,director.getSalary());
    }

    @Test
    public void canPayBonus(){
        assertEquals(500.0,director.payBonus());
    }

    @Test
    public void canGetBudget(){
        assertEquals(20000.0, director.getBudget());
    }

    @Test
    public void canChangeName(){
        director.changeName("Fiona Fudger");
        assertEquals("Fiona Fudger", director.getName());
    }
    @Test
    public void canChangeNameFail(){
        director.changeName(null);
        assertEquals("Regina Garfield", director.getName());
    }



}

