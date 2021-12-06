package day12.task4;
//*Выполнять в подпапке task4 в day12*
//        Скопировать MusicBand из прошлого задания и доработать таким образом, чтобы в
//        группу можно было добавлять и удалять участников. Под участником понимается
//        строка (String) с именем и фамилией. Реализовать статический метод слияния групп
//        (в классе MusicBand), т.е. все участники группы  А переходят в группу B . Название
//        метода: transferMembers. Этот метод принимает в качестве аргументов два
//        экземпляра класса MusicBand. Реализовать метод printMembers (в классе
//        MusicBand), выводящий список участников в консоль. Проверить состав групп после
//        слияния.

import java.util.ArrayList;
import java.util.List;

public class MusicBand {
    private String name;
    private int year;
    private List<String> members = new ArrayList<>();

    public MusicBand(String name, int year){
        this.name = name;
        this.year = year;
    }

    public String getName() {
        return name;
    }
    public int getYear() {
        return year;
    }

    @Override
    public String toString() {
        return name + " созданны в " + year + " году";
    }

    public void addMember(String name){
        members.add(name);
    }
    public void removeMember(String name){
        members.remove(name);
    }

    public static void transferMembers(MusicBand from, MusicBand to ){
        to.members.addAll(from.members);
        from.members.clear();
    }
    public void printMembers(){
        System.out.println("Состав группы: " + members);
    }
}
