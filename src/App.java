import Materia.controllers.BinaryTree;

public class App {
    public static void main(String[] args) throws Exception {
        BinaryTree ab = new BinaryTree();
        ab.insert(50);
        ab.insert(17);
        ab.insert(76);
        ab.insert(9);
        ab.insert(23);
        ab.insert(54);
        ab.insert(14);
        ab.insert(19);
        // System.out.println("--Pre-Order--");
        // ab.printPreorder();
        // System.out.println();
        // System.out.println("--Pos-Order--");
        // ab.printPosOrder();
        // System.out.println();
        System.out.println();
        System.out.println("TAMAÑO DEL ARBOL: "+ ab.heighArbol());
        System.out.println();
        System.out.println("ALTURA DEL ARBOL: "+ ab.getHeightTree());
        System.out.println();
        System.out.println("-- ARBOL IN-ORDER --");
        ab.printInOrder();
        System.out.println();
        System.out.println();
        System.out.println("--ARBOL IN-ORDER CON ALTURAS--");
        ab.printInOrderWhitHeight();
        System.out.println();
        System.out.println();
        System.out.println("--ARBOL IN-ORDER CON FACTOR DE EQUILIBRIO --");
        ab.printInorderWithEqu();
        System.out.println();
        System.out.println();
        System.out.println("ARBOL ESTA EQUILIBRADO: " + ab.desequilibradosComp());
        System.out.println("EXISTE EL NODO 15 = " + ab.findValue(15));
        System.out.println("AGREGAMOS EL VALOR 15");
        ab.insert(15);
        System.out.println("--ARBOL IN-ORDER CON FACTOR DE EQUILIBRIO --");
        ab.printInorderWithEqu();
        System.out.println();
        System.out.println("ARBOL ESTA EQUILIBRADO: " + ab.desequilibradosComp());
        System.out.println("Michael yumbla");

        
        // if(ab.findValue(23)){
        //     System.out.println("Encontro el valor 23");
        // }else{
        //     System.out.println("No se encontro el valor 23");
        // }
        // if(ab.findValue(77)){
        //     System.out.println("Encontro el valor 77");
        // }else{
        //     System.out.println("No se encontro el valor 77");
        // }
    }
}