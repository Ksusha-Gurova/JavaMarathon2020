package day12.task5;
//*Выполнять в подпапке task5 в day12*
//        Скопировать MusicBand из прошлого задания и доработать - теперь у участника
//        музыкальной группы есть не только имя, но и возраст. Соответственно, теперь под
//        участником понимается не строка, а объект класса MusicArtist. Необходимо
//        реализовать класс MusicArtist и доработать класс MusicBand (создать копию
//        класса) таким образом, чтобы участники были - объекты класса MusicArtist. После
//        этого, надо сделать то же самое, что и требовалось в 4 задании - слить две группы и
//        проверить состав групп после слияния. Методы для слияния и для вывода участников
//        в консоль необходимо тоже переработать, чтобы они работали с объектами класса
//        MusicArtist.

import day9.Task1.Human;

import java.util.ArrayList;
import java.util.List;

public class MusicBand {
    private String name;
    private int year;
    private List<Member> members = new ArrayList<>();

    public List<Member> getMembers() {
        return members;
    }

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

    public void addMember(Member member){
        members.add(member);
    }
    public void removeMember(Member member){
        members.remove(member);
    }

    public static void transferMembers(MusicBand from, MusicBand to ){
        to.members.addAll(from.members);
        from.members.clear();
    }
    public void printMembers(){
        System.out.println("Состав группы: " + members);
    }
}
