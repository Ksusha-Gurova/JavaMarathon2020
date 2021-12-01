package day6.task1;
//        Создать класс Мотоцикл (англ. Motorbike), с полями “Год выпуска”, “Цвет”,
//        “Модель”. Создать экземпляр класса Мотоцикл, с помощью конструктора (сеттеры не
//        использовать). Придерживаться принципов инкапсуляции и использовать ключевое
//        слово this. Геттером получить год выпуска, цвет, модель, вывести значения в
//        консоль.

class Motorbike {
    private int releaseDate;
    private String color;
    private String model;

    public Motorbike(int releaseDate, String color, String model){
        this.releaseDate = releaseDate;
        this.color = color;
        this.model = model;
    }

    public int getReleaseDate(){
        return releaseDate;
    }
    public String getColor(){
        return color;
    }
    public String  getModel(){
        return model;
    }

    void info(){
        System.out.println("Это мотоцикл");
    }
    public void yearDifference(int year){
        System.out.println("Возраст вашего мотоцикла: " + (year - releaseDate));
    }
}
