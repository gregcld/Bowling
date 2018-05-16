import javafx.util.Pair;

import java.util.ArrayList;

public class Tuple {
    private int x;
    private int y;
    private int z;

    public Tuple(int a, int b) throws Exception{
        if(a < 0 || b < 0)
            throw new Exception("Les scores doivent être positifs ou nuls");

        if(a+b > 10)
            throw new Exception("La somme de deux scores d'une manche doit être inférieure ou égale à 10");

        x = a;
        y = b;
        z = 0;
    }

    public int getX(){
        return x;
    }

    public int getY(){
        return y;
    }

    public int getZ(){
        return z;
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

    public void setZ(int c) throws Exception{
        if(c < 0)
            throw new Exception("Les scores doivent être positifs ou nuls");

        z = c;
    }

    public int sum(boolean spare, boolean strike){
        if(spare)
            if(x == 10)
                return x*2 + 2*y + 2*z ;
            else if(x+y == 10)
                return 2*x + y + 2*z;
            else
                return 2*x + y + z;

        if(strike)
            if(x == 10 || x+y == 10)
                return 2*x + 2*y + 2*z;
            else
                return (x+y)*2 + z;
        if(x == 10)
            return x + 2*y + 2*z ;
        else if(x+y == 10)
            return x + y + 2*z;
        else
            return x + y + z;
    }

}
