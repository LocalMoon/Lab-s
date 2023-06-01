package mypackage;

public class Nod implements IOperation {
    @Override
    public String getName(){
        return "Naibolshiy obshiy delitel";
    }

    @Override
    public String getSign(){
        return "NOD";
    }

    @Override
    public int estimate(int a, int b){
        if (a == 0 || b == 0) return a + b;
        else {
            int absa = Math.abs(a);
            int absb = Math.abs(b);
            int biggerv = Math.max(absa,absb);
            int smallerv = Math.min(absa,absb);

            return estimate(biggerv % smallerv, smallerv );
        }


    } 
}