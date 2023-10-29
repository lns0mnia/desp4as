import java.lang.String;
public class ConcreteNewPostEventFactory implements NewPostEventFactory {

    @Override
    public NewPostEvent createEvent(String type) {
        if (type.equals("new_post")) {
            return new NewPostEvent("John Doe", "This is a new post!");
        } else {
            throw new IllegalArgumentException("Unknown new post event type: " + type);
        }
    }
}