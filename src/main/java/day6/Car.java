package day6;

//        Создать класс Автомобиль (англ. Car), с полями “Год выпуска”, “Цвет”, “Модель”.
//        Создать get и set методы для каждого поля. Создать экземпляр класса Автомобиль,
//        задать сеттером каждое поле, вывести в консоль значение каждого поля геттером.
//        Созданный вами класс должен отвечать принципам инкапсуляции.


class Car {
    private int releaseDate;
    private String color;
    private String model;

    public void setReleaseDate(int release){
        releaseDate = release;
    }
    public void setColor(String colorr){
        color = colorr;
    }
    public void setModel(String modell){
        model = modell;
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
        System.out.println("Это автомобиль");
    }
    public void yearDifference(int year){
        System.out.println("Возраст вашего автомобиля: " + (year - releaseDate));
    }
}
