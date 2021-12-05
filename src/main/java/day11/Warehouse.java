package day11;
//На складе происходит сборка и упаковка интернет-заказа.
//        Создайте классы:
//        - “Склад” (англ. Warehouse). Поля: countOrder (количество собранных
//        заказов), balance (доход от доставленных заказов). Get и set методы для
//        обоих полей. Для получения информации о значениях полей склада
//        переопределите метод toString().
//        - “Сборщик” (англ. Picker), с полем salary, только get метод.
//        - “Курьер” (англ. Courier), с полем salary, только get метод.
//        Каждый класс-сотрудник должен реализовывать интерфейс Worker, в котором
//        необходимо объявить методы doWork() и bonus().
//        Каждый раз когда сотрудник выполняет свою работу (вызов метод doWork()), ему
//        выплачивается заработная плата (сокр. ЗП) (80 - сборщику, 100 - курьеру).
//        А также при вызове doWork() у Сборщика, происходит увеличение значения поля
//        countOrder в классе Warehouse на 1. При вызове doWork() у Курьера, происходит
//        увеличение переменной balance в классе Warehouse на 1000.
//        Сотрудникам полагается бонус (индивидуальный расчет для каждого): когда на складе
//        отгружен 1500-й заказ, заработанная к тому моменту ЗП сборщика утраивается. Когда
//        складом заработан 1.000.000, заработанная к тому моменту ЗП курьера удваивается.
//        Для демонстрации и тестирования работы программы создайте склад и по 1 рабочему,
//        вызовите у каждого методы doWork() и bonus(), столько раз, чтобы каждый из
//        сотрудников получил бонус. Выведите в консоль баланс и количество выполненных
//        заказов на складе и ЗП каждого из сотрудников.
//        Создать второй склад, также принять по 1 сотруднику с однократным вызовом
//        doWork() у каждого. Проконтролировать, что у склада 1 и его сотрудников при этом
//        значения не меняются.
//        Рекомендации: для получения данных склада внутри классов сотрудников реализуйте
//        хранение ссылки на объект Warehouse и передавайте ее с помощью конструктора или
//        set метода.

public class Warehouse {
    private int countOrder;
    private int balance;

    public void setCountOrder(int countOrder) {
        this.countOrder = countOrder;
    }
    public int getCountOrder() {
        return countOrder;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }
    public int getBalance() {
        return balance;
    }

    public void upBalance (){
        balance += 1000;
    }
    public void upCountOrder (){
        countOrder += 1;
    }

    @Override
    public String toString() {
        System.out.println("Колличество собранных заказов равно "+ countOrder + ". Доход от доставленных заказов составил " + balance + ".");
        return super.toString();
    }
}
