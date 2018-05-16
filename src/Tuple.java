import javafx.util.Pair;

import java.util.ArrayList;

public class Tuple {
    private int x;
    private int y;

    public Tuple(int a, int b) throws Exception{
        if(a < 0 || b < 0)
            throw new Exception("Les scores doivent être positifs ou nuls");

        if(a+b > 10)
            throw new Exception("La somme de deux scores d'une manche doit être inférieure ou égale à 10");

        x = a;
        y = b;
    }

    public int getX(){
        return x;
    }

    public int getY(){
        return y;
    }

    public void setX(int a) throws Exception{
        if(a < 0)
            throw new Exception("Les scores doivent être positifs ou nuls");

        if(a+this.y > 10)
            throw new Exception("La somme de deux scores d'une manche doit être inférieure ou égale à 10");

        x = a;
    }

    public void setY(int b) throws Exception{
        if(b < 0)
            throw new Exception("Les scores doivent être positifs ou nuls");

        if(b+this.x > 10)
            throw new Exception("La somme de deux scores d'une manche doit être inférieure ou égale à 10");

        y = b;
    }

    public int sum(boolean spare, boolean strike){
        if(spare)
            return x*2+y;
        if(strike)
            return (x+y) * 2;
        return x+y;
    }

}
