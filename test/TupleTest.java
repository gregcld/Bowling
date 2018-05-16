import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TupleTest {

    @Test
    public void TupleSumInferiorOrEqualsTen() throws Exception{
        int x = 5;
        int y = 6;
        assertThrows(Exception.class,() ->{
            new Tuple(5,6);
        });
    }

    @Test
    public void TupleNegativeElement() throws Exception{
        int x = -5;
        int y = 4;
        assertThrows(Exception.class,() ->{
            new Tuple(5,6);
        });
    }



}