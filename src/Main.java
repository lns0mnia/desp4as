public class Main {

    public static void main(String[] args) throws Exception {

        NewPostEventBus eventBus = new NewPostEventBus();

        WebNewPostObserver observer = new WebNewPostObserver(eventBus);

        NewPostEvent event = new NewPostEvent("John Doe", "This is a new post!");
        eventBus.publishEvent(event);

        System.in.read();

        System.exit(0);
    }
}