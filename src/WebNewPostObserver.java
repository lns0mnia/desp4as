public class WebNewPostObserver implements NewPostObserver {

    private NewPostEventBus eventBus;

    public WebNewPostObserver(NewPostEventBus eventBus) {
        this.eventBus = eventBus;
        eventBus.registerObserver(this);
    }

    @Override
    public void onNewPost(String user, String postContent) {
        System.out.println("New post from " + user + ": " + postContent);
    }
}