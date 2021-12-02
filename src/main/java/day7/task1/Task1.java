package day7.task1;
//Для этого задания скопируйте класс Самолет из предыдущего дня в пакет текущего
//        дня.
//        В классе Самолет создать статический метод compareAirplanes, который в
//        качестве аргументов принимает два объекта класса Airplane (два самолета) и выводит
//        сообщение в консоль о том, какой из самолетов длиннее.



public class Task1 {
    public static void main(String[] args) {
        Airplane airplane1 = new Airplane("Kseniya",1996,15753.0,158496.0);
        Airplane airplane2 = new Airplane("Petrov", 1783,1325583.0,67584.0);
        Airplane.compareAirplanes(airplane1,airplane2);
    }
}