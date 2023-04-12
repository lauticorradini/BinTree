package BinTree;
public class App {
    public static void main(String[] args) throws Exception {
        BinTree tree = new BinTree(); 
        BinTree tree2 = new BinTree();
        tree.insert(8);
        tree.insert(3);
        tree.insert(10);
        tree.insert(1);
        tree.insert(6);
        tree.insert(14);
        tree.insert(4);
        tree.insert(7);
        tree.insert(13);

        tree2.insert(8);
        tree2.insert(3);
        tree2.insert(10);
        tree2.insert(1);
        tree2.insert(6);
        tree2.insert(14);
        tree2.insert(4);
        tree2.insert(7);
        tree2.insert(13);

        System.out.println("Pre Order:");
        tree.preOrder(tree.getRoot());

        System.out.println("Altura del arbol: " + tree.height(tree.getRoot()));

        int quantity = tree.quantity(tree.getRoot());
        System.out.println("Cantidad de nodos del arbol: " + quantity);

        boolean isEqual = tree.equals(tree.getRoot(), tree2.getRoot());
        System.out.println("Los arboles son iguales: " + isEqual);
        
    }
}
