package day7.task1;
//Для этого задания скопируйте класс Самолет из предыдущего дня в пакет текущего
//        дня.
//        В классе Самолет создать статический метод compareAirplanes, который в
//        качестве аргументов принимает два объекта класса Airplane (два самолета) и выводит
//        сообщение в консоль о том, какой из самолетов длиннее.

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

    public double getLength() {
        return length;
    }

    public Airplane(String producer, int year, double lenght, double weight){
        this.producer = producer;
        this.year = year;
        this.length = lenght;
        this.weight = weight;
        fuel = 0;

    }
    void info() {
        System.out.println("Изготовитель: " + producer + ", год выпуска: " + year + ", длина: " + length + ", вес: " + weight+", колличество топлива в баке: "+fuel);
    }
    public double fillUp (double fillUp){
        fuel+=fillUp;
        return fuel;
    }
    public static void compareAirplanes(Airplane airplane1, Airplane airplane2){
        if (airplane1.getLength() > airplane2.getLength()){
            System.out.println("Длина самолета airplane1 больше, чем длина самолета airplane2");
        }
        else if(airplane1.getLength() < airplane2.getLength()){
            System.out.println("Длина самолета airplane1 меньше, чем длина самолета airplane2");
        }
        else {
            System.out.println("Длины самолетов равны");
        }
    }
}
