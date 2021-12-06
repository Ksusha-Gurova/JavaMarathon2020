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

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Task5 {
    public static void main(String[] args) {
        List<MusicBand> musicBands = new ArrayList<>();
        musicBands.add(new MusicBand("Metallica", 1981));
        musicBands.add(new MusicBand("System of a Down", 1992));
        musicBands.add(new MusicBand("Linkin Park", 1996));
        musicBands.add(new MusicBand("Stigmata", 2001));
        musicBands.add(new MusicBand("Queen", 1973));
        musicBands.add(new MusicBand("The Rolling Stones", 1962));
        musicBands.add(new MusicBand("The Beatles", 1960));
        musicBands.add(new MusicBand("Bring Me the Horizon", 2004));
        musicBands.add(new MusicBand("Green Day", 1986));
        musicBands.add(new MusicBand("Animal ДжаZ ", 2000));
        musicBands.add(new MusicBand("The Animals ", 1962));

        MusicBand band1 = musicBands.get(0);
        band1.addMember(new Member("Джеймс Хетфилд", 58));
        band1.addMember(new Member("Кирк Хэмметт", 59));
        band1.addMember(new Member("Роберт Трухильо", 57));
        band1.addMember(new Member("Ларс Ульрих", 57));


        MusicBand band2 = musicBands.get(1);
        band2.addMember(new Member("Серж Танкян", 54));
        band2.addMember(new Member("Дарон Малакян", 46));
        band2.addMember(new Member("Шаварш «Шаво» Одаджян", 47));
        band2.addMember(new Member("Джон Долмаян", 48));

        MusicBand.transferMembers(musicBands.get(0), musicBands.get(1));
        Member member1 = band2.getMembers().get(0);

        band1.printMembers();
        band2.printMembers();

        band2.removeMember(member1);
        band2.printMembers();

        System.out.println();

        Collections.shuffle(musicBands);
        System.out.println(musicBands);
        System.out.println(groupsAfter2000(musicBands));

    }



    public static List<MusicBand> groupsAfter2000(List<MusicBand> bands){
        List<MusicBand> bandsAfter2000 = new ArrayList<>();
        for (MusicBand band: bands) {
            if(band.getYear() > 2000){
                bandsAfter2000.add(band);
            }
        }
        return bandsAfter2000;
    }
}

