import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Calculation1Test  {
    @Test
    public void addNumbers(){
        assertEquals(10,Calculation1.addNumbers(5,5));
        assertNotEquals(5,Calculation1.addNumbers(5,5));
    }

    @Test
    public void dom()
    {
        assertNotEquals(Calculation1.k,Calculation1.dom(5,8));
        assertEquals(Calculation1.k,Calculation1.dom(5,8));
    }

}