package day8.task2;
//Скопируйте класс Самолет из задания дня 6.
//        Внесите изменения в класс таким образом, чтобы следующий код выводил
//        информацию о самолете, аналогично вызову метода info().
//        Airplane airplane = new Airplane ("Boeing", 2000, 150, 10000);
//        System.out.println (airplane);

public class Airplane {
    private String producer;      //(изготовитель)
    private int year;             //(год выпуска)
    private double length;       //(длина)
    private double weight;       //(вес)
    private double fuel;         //(количество топлива в баке)

    public double getFuel(){
        return fuel;
    }
    public void setProducer(String producer){this.producer = producer;}
    public void setYear(int year){this.year = year;}
    public void setLength(double length){this.length = length;}
    public void setWeight(double weight){this.weight = weight;}

    public Airplane(String producer, int year, double lenght, double weight){
        this.producer = producer;
        this.year = year;
        this.length = lenght;
        this.weight = weight;
        fuel = 0;

    }
    public void info() {
        System.out.println("Изготовитель: " + producer + ", год выпуска: " + year + ", длина: " + length + ", вес: " + weight+", колличество топлива в баке: "+fuel);
    }
    public double fillUp (double fillUp){
        fuel+=fillUp;
        return fuel;
    }
    public String toString(){
        return "Изготовитель: " + producer + ", год выпуска: " + year + ", длина: " + length + ", вес: " + weight+", колличество топлива в баке: "+fuel;
    }


}
