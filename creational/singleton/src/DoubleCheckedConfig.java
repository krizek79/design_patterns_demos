public class DoubleCheckedConfig {

    private static volatile DoubleCheckedConfig instance;

    private String url;
    private String username;
    private String password;

    private DoubleCheckedConfig() {
        this.url = "jdbc:mysql://localhost:3306/mydb";
        this.username = "root";
        this.password = "password";
    }

    public static DoubleCheckedConfig getInstance() {
        if (instance == null) {
            synchronized (DoubleCheckedConfig.class) {
                if (instance == null) {
                    instance = new DoubleCheckedConfig();
                }
            }
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
