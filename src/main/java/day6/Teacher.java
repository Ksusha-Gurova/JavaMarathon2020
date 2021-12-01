package day6;
//Создать класс Teacher (Преподаватель), имеющий поля “Имя”, “Предмет”. Создать
//        класс  Student (Студент) с полем “Имя”.
//        Каждый класс имеет конструктор (с параметрами), set и get методы по
//        необходимости, а также у преподавателя есть метод evaluate (оценить студента),
//        принимающий в качестве аргумента студента, и работающий следующим образом:
//        внутри метода случайным образом генерируется число от 2 до 5, выводится строка:
//        "Преподаватель ИМЯПРЕПОДАВАТЕЛЯ оценил студента с именем ИМЯСТУДЕНТА
//        по предмету ИМЯПРЕДМЕТА на оценку ОЦЕНКА."
//        Все слова, написанные большими буквами, должны быть заменены
//        соответствующими значениями. ОЦЕНКА должна принимать значения "отлично”,
//        "хорошо”, "удовлетворительно" или "неудовлетворительно", в зависимости от
//        значения случайного числа.
//        Создайте по 1 экземпляру каждого класса, у преподавателя

import java.util.concurrent.ThreadLocalRandom;

public class Teacher {
    private String name;
    private String schoolClass;
    public Teacher(String name, String schoolClass){
        this.name = name;
        this.schoolClass = schoolClass;
    }
    void evaluate(Student student){
        int e = ThreadLocalRandom.current().nextInt(2,  5+1);
        String evaluate = "";
        switch (e){
            case 2:
                evaluate = "неудовлетворительно";
            case 3:
                evaluate = "удовлетворительно";
            case 4:
                evaluate = "хорошо";
            case 5:
                evaluate = "отлично";
        }
        System.out.println("Преподаватель " + name + " оценил студента " + student.getName() + " по предмету " + schoolClass + " на оценку " + evaluate);
    }
}
