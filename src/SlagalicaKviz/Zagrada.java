package SlagalicaKviz;

public class Zagrada extends Node {

    private char zagrada;

    public Zagrada (char zagrada){
        this.zagrada = zagrada;
    }

    @Override
    public int calculate() {
        return 0;
    }

    @Override
    public void toString2() {
        System.out.println(zagrada);
    }
}
