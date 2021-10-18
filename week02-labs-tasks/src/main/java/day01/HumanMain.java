package day01;

public class HumanMain {
    public static void main(String[] args) {
        Human human = new Human("Bill",12);

        System.out.println(human.getName());
        System.out.println(human.getAge());
        System.out.println(human.introduc());
    }
}
