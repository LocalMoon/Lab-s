package mypackage;

public class UI {

    public static void main(String[] args){
        IOperation[] operations = {new Div(), new Mod(), new Nod(), new Nok()};

        int a = 2030, b = 8;
        for (IOperation op : operations){
            System.out.println(op.getName());
            System.out.printf("%d %s %d = %d \n", a, op.getSign(), b, op.estimate(a, b));
        }
    }
    
}
