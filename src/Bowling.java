import javafx.util.Pair;

import java.util.ArrayList;

public class Bowling {
    ArrayList<Pair<Integer, Integer>> table;

    public Bowling(){
        table = new ArrayList<Pair<Integer, Integer>>();
    }

    public void insert(int a, int b){
        if(a < 0 || b < 0){
            System.err.println("Les scores doivent être positifs ou nuls");
            System.exit(0);
        }

        if(a+b > 10){
            System.err.println("La somme de deux scores d'une manche doit être inférieure ou égale à 10");
            System.exit(0);
        }
        if(table.size() >= 10){
            System.err.println("Le jeu ne peut avoir que 10 manches");
            System.exit(0);
        }
        table.add(new Pair<Integer,Integer>(a,b));
    }

    public int sum(){
        int sum = 0;
        for(int i = 0; i < table.size(); i ++){
            sum += table.get(i).getKey() + table.get(i).getValue();
        }
        return sum;
    }

    public static void main(String[] args){
        Bowling tt = new Bowling();
        tt.insert(2,6);
        tt.insert(3,6);
        tt.insert(1,5);
        tt.insert(8,2);
        tt.insert(4,4);
        tt.insert(4,4);
        tt.insert(4,4);
        tt.insert(4,4);
        tt.insert(4,4);
        tt.insert(4,4);
        tt.insert(4,4);
        System.out.println(tt.sum());
    }




}
