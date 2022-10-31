public class Dog implements Runnable { //класс Dog инплементирует (реализует) интерфейс Runnable
    @Override
    public void run() {
        System.out.println("Собака побежала");
    }
}
