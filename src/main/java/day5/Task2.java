package day5;
//        Создать класс Мотоцикл (англ. Motorbike), с полями “Год выпуска”, “Цвет”,
//        “Модель”. Создать экземпляр класса Мотоцикл, с помощью конструктора (сеттеры не
//        использовать). Придерживаться принципов инкапсуляции и использовать ключевое
//        слово this. Геттером получить год выпуска, цвет, модель, вывести значения в
//        консоль.

public class Task2 {
    public static void main(String[] args) {
        Motorbike motorbike1 = new Motorbike("1988", "Silver", "Suzuki Guides");
        System.out.println(motorbike1.getReleaseDate());
        System.out.println(motorbike1.getColor());
        System.out.println(motorbike1.getModel());
    }
}

class Motorbike {
    private String releaseDate;
    private String color;
    private String model;

    public Motorbike(String releaseDate, String color, String model){
        this.releaseDate = releaseDate;
        this.color = color;
        this.model = model;
    }

    public String getReleaseDate(){
        return releaseDate;
    }
    public String getColor(){
        return color;
    }
    public String  getModel(){
        return model;
    }
}
