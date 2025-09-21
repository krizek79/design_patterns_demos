public class SyncConfig {

    private static SyncConfig instance;

    private String url;
    private String username;
    private String password;

    private SyncConfig() {
        this.url = "jdbc:mysql://localhost:3306/mydb";
        this.username = "root";
        this.password = "password";
    }

    public static synchronized SyncConfig getInstance() {
        if (instance == null) {
            instance = new SyncConfig();
        }
        return instance;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
