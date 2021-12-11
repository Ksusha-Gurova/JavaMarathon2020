package day15;

public class Shoes {
    private String name;
    private int size;
    private int balance;

    public Shoes(String name, int size, int balance) {
        this.name = name;
        this.size = size;
        this.balance = balance;
    }

    public int getBalance() {
        return balance;
    }

    @Override
    public String toString() {
        return name + ", " + size + ", " + balance;
    }
}
