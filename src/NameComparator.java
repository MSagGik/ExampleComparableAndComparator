import java.util.Comparator;

public class NameComparator implements Comparator<Heroes> {

    // Использование компаратора для упорядочивания по росту
    @Override
    public int compare(Heroes o1, Heroes o2) {
        return o1.getHeight() - o2.getHeight();
    }
//    // Использование компаратора для упорядочивания по имени
//    @Override
//    public int compare(Heroes o1, Heroes o2) {
//        String name1 = o1.getName();
//        String name2 = o2.getName();
//        return name1.compareTo(name2);
//    }
}

