package single;

/**
 * Created by DB_BOY on 2018/9/8.
 */
public class Test {

    public static void main(String[] args) {
        for(int i = 0;i<3;i++){
            LazySingleton singleton = LazySingleton.getSingleton();
            System.out.println(singleton);
        }

        for(int i = 0;i<3;i++){
            HungrySingleton singleton = HungrySingleton.getSingleton();
            System.out.println(singleton);
        }

        for(int i = 0;i<3;i++){
            InternalSingleton singleton = InternalSingleton.getSingleton();
            System.out.println(singleton);
        }
        for(int i = 0;i<3;i++){
            EnumSingleton singleton = EnumSingleton.INSTANCE;
            System.out.println(singleton);
        }
        for(int i = 0;i<3;i++){
            LockSingleton singleton = LockSingleton.getSingleton();
            System.out.println(singleton);
        }

    }
}