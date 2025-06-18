package Materia.models;

public class Node {
    private int value;
    private Node refeizquierda;
    private Node refederecha;
    public Node(int value) {
        this.value = value;
        this.refeizquierda = null;
        this.refederecha = null;
    }
    public int getValue() {
        return value;
    }
    public void setValue(int value) {
        this.value = value;
    }
    public Node getRefeizquierda() {
        return refeizquierda;
    }
    public void setRefeizquierda(Node refeizquierda) {
        this.refeizquierda = refeizquierda;
    }
    public Node getRefederecha() {
        return refederecha;
    }
    public void setRefederecha(Node refederecha) {
        this.refederecha = refederecha;
    }
    @Override
    public String toString() {
        return "Node [value=" + value + "]";
    }
    

    

    
}
