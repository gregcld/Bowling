import org.junit.jupiter.api.Test;
import sun.util.resources.cldr.az.CalendarData_az_Latn_AZ;

import static org.junit.jupiter.api.Assertions.*;

class BowlingTest {

    @Test
    public void Score_Equals_TuplesValuesSum() throws Exception{
        Bowling bwl = new Bowling();
        int a1 = 3, b1 = 6;
        int a2 = 5, b2 = 1;
        bwl.insert(a1, b1);
        bwl.insert(a2, b2);
        assertEquals(a1+b1+a2+b2, bwl.sum());
    }

    @Test
    public void NumberOfTuples_InferiorOrEqualsTen() throws Exception{
        Bowling bwl = new Bowling();

        bwl.insert(1,2);
        bwl.insert(8,2);
        bwl.insert(2,2);
        bwl.insert(10,0);
        bwl.insert(6,1);
        bwl.insert(1,2);
        bwl.insert(1,2);
        bwl.insert(1,2);
        bwl.insert(1,2);
        bwl.insert(1,2);

        assertThrows(Exception.class, ()->{
            bwl.insert(1,2);
        });
    }

    @Test
    public void Spare_CountsNextValueTwice() throws Exception{
        Bowling bwl = new Bowling();
        int a1 = 7, b1 = 3;
        int a2 = 8 , b2 = 1;
        bwl.insert(a1, b1);
        bwl.insert(a2, b2);

        if(a1+b1 == 10)
            a2 = 2*a2;

        assertEquals(a1+b1+a2+b2, bwl.sum());
    }

    @Test
    public void Strike_CountsNextValueTwice() throws Exception{
        Bowling bwl = new Bowling();
        int a1 = 10, b1 = 0;
        int a2 = 8 , b2 = 1;
        bwl.insert(a1, b1);
        bwl.insert(a2, b2);

        if(a1+b1 == 10) {
            a2 = 2 * a2;
            b2 = 2 * b2;
        }

        assertEquals(a1+b1+a2+b2, bwl.sum());
    }
}