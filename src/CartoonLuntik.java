import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CartoonLuntik {
    public static void main(String[] args) {

        List<Heroes> heroes = new ArrayList<>(100);
        heroes.clear();

        // Добавление героев в коллекцию
        heroes.add(new Heroes("Лунтик", "родился на Луне", 100));
        heroes.add(new Heroes("Кузя", "родился на Земле", 85));
        heroes.add(new Heroes("Мила", "родилась на Земле", 75));
        heroes.add(new Heroes("Пчелёнок", "родился на Земле", 80));
        heroes.add(new Heroes("Вупсель", "родился на Земле", 90));
        heroes.add(new Heroes("Пупсель", "родился на Земле", 90));
        heroes.add(new Heroes("Баба Капа", "родилась на Земле", 102));
        heroes.add(new Heroes("Дед Шер", "родился на Земле", 102));
        heroes.add(new Heroes("Дядя Шнюк", "родился на Земле", 102));

        // Простой вывод на консоль
        System.out.println(heroes);

        // Упорядочивание персонажей по имени с помощью компарабла
        Collections.sort(heroes);
        System.out.println(heroes);

        // Упорядочивание персонажей по росту с помощью компаратора
        Comparator nameComparator = new NameComparator();
        Collections.sort(heroes,nameComparator);
        System.out.println(heroes);

    }
}
