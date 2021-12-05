package day10;

public class Node {
    private int value;
    private Node leftChild;
    private Node rightChild;

//    public void setLeftChild(Node leftChild) {this.leftChild = leftChild;}
//    public day10.Node getLeftChild() {return leftChild;}
//
//    public void setRightChild(Node rightChild) {this.rightChild = rightChild;}
//    public day10.Node getRightChild() {return rightChild;}
//
//    public void setValue(int value) {this.value = value;}
    public int getValue() {
        return value;
    }

    public Node (int value){
        this.value = value;
    }

    public Node getLeftChild() {
        return leftChild;
    }

    public Node getRightChild() {
        return rightChild;
    }

    public void addLeftOrRight(int value, Node currentNode){
        if (value >= currentNode.value) {
            if (currentNode.rightChild == null) {
                currentNode.rightChild = new Node(value);
            }
            else currentNode.rightChild.addLeftOrRight(value, currentNode.rightChild);
        }
        else {
            if(currentNode.leftChild == null) {
                currentNode.leftChild = new Node(value);
            }
            else currentNode.leftChild.addLeftOrRight(value, currentNode.leftChild);
        }
    }
}
