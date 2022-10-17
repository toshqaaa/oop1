public class Cat extends Pet{

    public Cat(String name) {
        super(name);
    }

    public void voice() {
        System.out.println("мяу-мяу");
    }

    public void doSomething(){
        System.out.println("Что-то делаю");
    }
}
