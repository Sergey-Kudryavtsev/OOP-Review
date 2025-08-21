package org.serega.Collection.Lesson1;

public class GenericBox<T> {
    private T box;

    public GenericBox(T box) {
        this.box = box;
    }

    public T getBox() {
        return box;
    }

    public void setBox(T box) {
        this.box = box;
    }

    public boolean compare(GenericBox<T> otherBox) {
        return this.box.equals(otherBox.getBox());
    }

    public void swap(GenericBox<T> other) {
        T temp = this.box;
        this.box = other.box;
        other.box = temp;
    }

    @Override
    public String toString() {
        return "Коробка - " + ((box != null) ? box.toString() : "null");
    }

    public static void main(String[] args) {
        GenericBox<Integer> intBox = new GenericBox<>(100);
        System.out.println("Содержимое intBox: " + intBox.getBox());


        GenericBox<String> strBox1 = new GenericBox<>("Hello Java");
        System.out.println("Содержимое strBox: " + strBox1.getBox());

        GenericBox<String> strBox2 = new GenericBox<>("Hello Serega");
        System.out.println("Содержимое strBox: " + strBox2.getBox());
        System.out.println("До обмена");
        System.out.println(strBox1);
        System.out.println(strBox2);

        strBox1.swap(strBox2);

        System.out.println("После обмена");
        System.out.println(strBox1);
        System.out.println(strBox2);

        GenericBox<String> anotherBox = new GenericBox<>("Hello Java");
        System.out.println("Коробки с одинаковым содержимым равны: " + strBox1.compare(anotherBox));
    }
}
