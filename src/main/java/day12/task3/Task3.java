package day12.task3;
//*Выполнять в подпапке task3 в day12*
//        Создать класс Музыкальная Группа (англ. MusicBand) с полями name и year
//        (название музыкальной группы и год основания). Создать 10 или более экземпляров
//        класса MusicBand, добавить их в список (выбирайте такие музыкальные группы,
//        которые были созданы как до 2000 года, так и после, жанр не важен). Перемешать
//        список. Создать статический метод в классе Task3:
//public static List<MusicBand> groupsAfter2000(List<MusicBand>bands)
//        Этот метод принимает список групп в качестве аргумента и возвращает новый список,
//        состоящий из групп, основанных после 2000 года. Вызвать метод
//        groupsAfter2000(List<MusicBand> bands) в методе main()на вашем списке
//        из 10 групп. Вывести в консоль оба списка (оригинальный и с группами, основанными
//        после 2000 года).

import day9.Task2.Figure;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Task3 {
    public static void main(String[] args) {
        List<MusicBand>  musicBands = new ArrayList<>();
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
