public class Main {
    public static void main(String[] args) {

        Apple apple1 = new Apple();
        Apple apple2 = new Apple();
        Apple apple3 = new Apple();
        Apple apple4 = new Apple();
        Apple apple5 = new Apple();

        Orange orange1 = new Orange();
        Orange orange2 = new Orange();
        Orange orange3 = new Orange();
        Orange orange4 = new Orange();
        Orange orange5 = new Orange();

        Box<Apple> box1 = new Box<Apple>(apple1, apple2, apple3, apple4);
        Box<Orange> box2 = new Box<Orange>(orange1, orange2);
        Box<Apple> box3 = new Box<Apple>();
        Box<Orange> box4 = new Box<Orange>(orange3,orange4);

        System.out.println("Вес фруктов в 1 коробке: "+ box1.getWeight());
        System.out.println("Вес фруктов во 2 коробке: "+ box2.getWeight());
        System.out.println("Вес фруктов в 3 коробке: "+ box3.getWeight());
        System.out.println("Вес фруктов в 4 коробке: "+ box4.getWeight());
        System.out.println("Перекладываем фрукты из 1 коробки в 3");
        box1.shift(box3);
        System.out.println("Вес фруктов в 1 коробке: "+ box1.getWeight());
        System.out.println("Вес фруктов в 3 коробке: "+ box3.getWeight());
        System.out.println("Сравниваем вес 1 и 3 коробки: "+ box1.compare(box3));
        System.out.println("Сравниваем вес 2 и 4 коробки: "+ box2.compare(box4));
        System.out.println("Добавляем 1 фрукт в 1 коробку");
        box1.add(apple5);
        System.out.println("Вес фруктов в 1 коробке: "+ box1.getWeight());
        box4.add(orange5);
        System.out.println("Добавляем 1 фрукт в 4 коробку");
        System.out.println("Вес фруктов в 4 коробке: "+ box4.getWeight());
    }
}