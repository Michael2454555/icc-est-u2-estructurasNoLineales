package Materia.controllers;
import Materia.models.Node;

public class BinaryTree{
    private Node root;
    public BinaryTree(){
        this.root=null;
    }
    public void insert(int value){
        root = insertRec(root, value);
    }
    private Node insertRec(Node padre, int value){
        if(padre == null){
            return new Node(value) ;
        }
        if(value < padre.getValue()){

            padre.setRefeizquierda(insertRec(padre.getRefeizquierda(), value));
        }else if (value > padre.getValue()){
            padre.setRefederecha(insertRec(padre.getRefederecha(), value));
        }
        return padre;
    }

    public void printPreorder(){
        printPreorderRec(root);
        System.out.println();
    }
    public void printPostorder(){
        printPostorderRec(root);
        System.out.println();
    }
    public void printintorder(){
        printintorderRec(root);
        System.out.println();
    }
    private void printPreorderRec(Node node){
        if(node != null){
            System.out.print(node.getValue()+", ");
            printPreorderRec(node.getRefeizquierda());
            printPreorderRec(node.getRefederecha());

        }

    }
    private void printPostorderRec(Node node){
        if(node != null){
            printPostorderRec(node.getRefeizquierda());
            printPostorderRec(node.getRefederecha());
            System.out.print(node.getValue()+", ");

        }

    }
    private void printintorderRec(Node node){
        if(node != null){
            printintorderRec(node.getRefeizquierda());
            System.out.print(node.getValue()+", ");
            printintorderRec(node.getRefederecha());

        }

    }
    public boolean findValue(int value){
        return false;
    }
    
}
