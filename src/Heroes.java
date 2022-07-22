public class Heroes implements Comparable <Heroes> {
    private String name;
    private String bpl;
    private int height;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBpl() {
        return bpl;
    }

    public void setBpl(String bpl) {
        this.bpl = bpl;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public Heroes(String name, String bpl, int height) {
        this.name = name;
        this.bpl = bpl;
        this.height = height;
    }

    // Сравнение героев по имени
    @Override
    public int compareTo(Heroes o) {
        int result = this.name.compareTo(o.name);
        // Если именна одинаковые, то сравниваем по месту рождения
        if (result == 0) {
            result = this.bpl.compareTo(o.bpl);
        }
        return result;
    }


    // Переопределение метода toString
    public String toString() {
        return "\n" + this.name + " " + this.bpl + " и ростом " + this.height + " мм";
    }
}
