package day6.task2;
//Создать класс Самолет (Airplane) с полями:
//        - producer (изготовитель)
//        - year (год выпуска)
//        - length (длина)
//        - weight (вес)
//        - fuel (количество топлива в баке) + геттер для этого поля
//        Создать конструктор в классе Самолет, принимающий в качестве аргументов значения
//        четырех полей класса (значение поля “количество топлива в баке” установить равным0). В конструкторе для передачи полям значений использовать ключевое слово this
//        .
//        Помимо этого, в классе необходимо реализовать метод info(), который выводит
//        сообщение в следующем формате:
//        “Изготовитель: … , год выпуска: … , длина: ..., вес: ..., количество топлива в баке: …”
//        Также, необходимо реализовать метод fillUp(), который в качестве аргумента
//        принимает число и заправляет топливный бак самолета на это значение.
//        Создать новый объект класса Самолет с произвольными данными.
//        Изменить год выпуска и длину с помощью сеттеров, вызвать метод fillUp() два
//        раза, передав разные значения. Вызвать метод info().

public class Task2 {
    public static void main(String[] args) {
        Airplane airplane1 = new Airplane("Kseniya",1996,15753.0,158496.0);
        airplane1.setYear(1995);
        airplane1.setLength(566564.77);
        airplane1.fillUp(75.3);
        airplane1.fillUp(77.9);
        airplane1.info();
    }
}
