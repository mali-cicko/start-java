package SlagalicaKviz;

public class Operacija extends Node {

    private Node leftNode = null;
    private Node rightNode = null;
    private char op;



    public Operacija(char op){
        this.op = op;
    }

    public void setLeftNode(Node leftNode) {
        this.leftNode = leftNode;
    }

    public void setRightNode(Node rightNode) {
        this.rightNode = rightNode;
    }


    @Override
    public int calculate() {
        if(op == '+') return leftNode.calculate() + rightNode.calculate();
        else if(op == '-') return  leftNode.calculate() - rightNode.calculate();
        else if(op == '*') return leftNode.calculate() * rightNode.calculate();
        else if(op == '/') return leftNode.calculate() / rightNode.calculate();

        return 0;
    }

    public Node getLeftNode() {
        return leftNode;
    }

    public Node getRightNode() {

        return rightNode;
    }

    public char getOp() {
        return op;
    }

    public void toString2(){

        leftNode.toString2();
        System.out.print(op);
        rightNode.toString2();
    }
}
