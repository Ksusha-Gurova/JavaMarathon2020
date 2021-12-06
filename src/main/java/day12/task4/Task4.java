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
import java.util.Collections;
import java.util.List;

public class Task4 {
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
        band1.addMember("Джеймс Хетфилд");
        band1.addMember("Кирк Хэмметт");
        band1.addMember("Роберт Трухильо");
        band1.addMember("Ларс Ульрих");


        MusicBand band2 = musicBands.get(1);
        band2.addMember("Серж Танкян");
        band2.addMember("Дарон Малакян");
        band2.addMember("Шаварш «Шаво» Одаджян");
        band2.addMember("Джон Долмаян");

        MusicBand.transferMembers(musicBands.get(0), musicBands.get(1));

        band1.printMembers();
        band2.printMembers();

        band2.removeMember("Серж Танкян");
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
