package day5;

//        Создать класс Автомобиль (англ. Car), с полями “Год выпуска”, “Цвет”, “Модель”.
//        Создать get и set методы для каждого поля. Создать экземпляр класса Автомобиль,
//        задать сеттером каждое поле, вывести в консоль значение каждого поля геттером.
//        Созданный вами класс должен отвечать принципам инкапсуляции.

public class Task1 {
    public static void main(String[] args) {
        Car car1 = new Car();

        car1.setReleaseDate("march 1998");
        System.out.println(car1.getReleaseDate());

        car1.setColor("Red");
        System.out.println(car1.getColor());

        car1.setModel("Jeep Cherokee");
        System.out.println(car1.getModel());
    }
}


class Car{
    private String releaseDate;
    private String color;
    private String model;

    public void setReleaseDate(String release){
        releaseDate = release;
    }
    public void setColor(String colorr){
        color = colorr;
    }
    public void setModel(String modell){
        model = modell;
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
