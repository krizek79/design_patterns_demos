public class Main {

    public static void main(String[] args) {
        // Lazy-loaded Singleton
        LazyConfig lazy1 = LazyConfig.getInstance();
        LazyConfig lazy2 = LazyConfig.getInstance();
        System.out.println("LazyConfig: same instance? " + (lazy1 == lazy2));
        lazy1.setUsername("lazyUser");
        System.out.println("LazyConfig username: " + lazy2.getUsername());

        System.out.println("---------------------------------------");

        // Synchronized Singleton
        SyncConfig sync1 = SyncConfig.getInstance();
        SyncConfig sync2 = SyncConfig.getInstance();
        System.out.println("SyncConfig: same instance? " + (sync1 == sync2));
        sync1.setUsername("syncUser");
        System.out.println("SyncConfig username: " + sync2.getUsername());

        System.out.println("---------------------------------------");

        // Double-checked Locking Singleton
        DoubleCheckedConfig double1 = DoubleCheckedConfig.getInstance();
        DoubleCheckedConfig double2 = DoubleCheckedConfig.getInstance();
        System.out.println("DoubleCheckedConfig: same instance? " + (double1 == double2));
        double1.setUsername("doubleUser");
        System.out.println("DoubleCheckedConfig username: " + double2.getUsername());

        System.out.println("---------------------------------------");

        // Enum Singleton
        EnumConfig enum1 = EnumConfig.INSTANCE;
        EnumConfig enum2 = EnumConfig.INSTANCE;
        System.out.println("EnumConfig: same instance? " + (enum1 == enum2));
        enum1.setUsername("enumUser");
        System.out.println("EnumConfig username: " + enum2.getUsername());
    }
}