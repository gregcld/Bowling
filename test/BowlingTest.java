public class BowlingTest {

    public static void main(String[] args) throws Exception{
        Bowling b = new Bowling();
        b.insert(2,6);
        b.insert(3,6);
        b.insert(1,5);
        b.insert(8,2);
        b.insert(4,4);
        b.insert(4,4);
        b.insert(4,4);
        b.insert(4,4);
        b.insert(4,4);
        b.insert(4,4);
        System.out.println(b.sum());
    }
}
