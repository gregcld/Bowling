import java.util.ArrayList;

public class Bowling {
    private ArrayList<Tuple> table;

    public Bowling(){
        table = new ArrayList<Tuple>();
    }

    public void insert(int a, int b) throws Exception{
        if(table.size() >= 10)
            throw new Exception("Le jeu ne peut avoir que 10 manches");

        table.add(new Tuple(a,b));
    }

    public void bonusShot(int c) throws Exception{
        if(table.size() != 10)
            throw new Exception("Le lancer bonus ne peut intervenir qu'à la 10eme manche");

        if(table.get(9).getX() == 10 || table.get(9).getY() == 10 || table.get(9).getX() + table.get(9).getY() == 10)
            table.get(9).setZ(c);
        else
            throw new Exception("Pas de bonus sans spare ni strike");
    }

    public int sum(){
        int sum = 0;
        boolean spare = false, strike = false;
        for(int i = 0; i < table.size(); i ++){
            sum += table.get(i).sum(spare, strike);
            spare=false;
            strike = false;
            if(table.get(i).getX() == 10)
                strike = true;
            else if(table.get(i).sum(false,false) == 10)
                spare = true;
        }
        return sum;
    }

    public static void main(String[] args) throws Exception{

    }

}
