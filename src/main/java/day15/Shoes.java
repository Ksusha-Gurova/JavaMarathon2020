package day15;

public class Shoes {
    private final String name;
    private final int size;
    private final int balance;

    public Shoes(String name, int size, int balance) {
        this.name = name;
        this.size = size;
        this.balance = balance;
    }

    @Override
    public String toString() {
        return name + ", " + size + ", " + balance;
    }
}
