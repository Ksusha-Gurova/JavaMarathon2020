package day10;

public class Tree {

    private Node root;

    public void addValue(int value){
        if (root == null){
            root = new Node(value);
        }
        else {
            root.addLeftOrRight(value, root);
        }
    }
    public void printSortTree(){
        print(root);
    }

    private void print(Node currentNode){

//        if (currentNode.getLeftChild() != null){
//            print(currentNode.getLeftChild());
//        }
//
//        System.out.println(currentNode.getValue());
//
//        if (currentNode.getRightChild() != null){
//            print(currentNode.getRightChild());
//        }
        if (currentNode.getLeftChild() != null){
            print(currentNode.getLeftChild());
        }
        System.out.print(currentNode.getValue() + ", ");

        if (currentNode.getRightChild() != null){
            print(currentNode.getRightChild());

        }
    }
}
