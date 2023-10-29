public class NewPostEvent {

    private String user;
    private String postContent;

    public NewPostEvent(String user, String postContent) {
        this.user = user;
        this.postContent = postContent;
    }

    public String getUser() {
        return user;
    }

    public String getPostContent() {
        return postContent;
    }
}