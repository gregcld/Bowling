import javafx.util.Pair;

import java.util.ArrayList;

public class Bowling {
    ArrayList<Pair<Integer, Integer>> table;

    public Bowling(){
        table = new ArrayList<Pair<Integer, Integer>>();
    }

    public void insert(int a, int b) throws Exception{
        if(a < 0 || b < 0)
            throw new Exception("Les scores doivent être positifs ou nuls");

        if(a+b > 10)
            throw new Exception("La somme de deux scores d'une manche doit être inférieure ou égale à 10");

        if(table.size() >= 10)
            throw new Exception("Le jeu ne peut avoir que 10 manches");

        table.add(new Pair<Integer,Integer>(a,b));
    }

    public int sum(){
        int sum = 0;
        for(int i = 0; i < table.size(); i ++){
            sum += table.get(i).getKey() + table.get(i).getValue();
        }
        return sum;
    }

    public static void main(String[] args) throws Exception{

    }




}
