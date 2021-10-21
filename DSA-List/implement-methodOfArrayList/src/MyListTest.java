public class MyListTest {
    public static void main(String[] args) {
        MyList<String> elements = new MyList<>(3);
        elements.add(0, "Huu");
        elements.add(1, "Tiến");
        elements.add(1, "Long");
        elements.add(1, "Hoang");
        elements.add(2, "Giau");
        System.out.println(elements);

        MyList <String> result = elements.clone();

        System.out.println(result);
    }
}
