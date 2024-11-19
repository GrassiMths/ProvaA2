public class Teste {
    public static void main(String[] args) {


        Singleton singleton1 = Singleton.getInstance();
        singleton1.setServerAdress("222.222.2.2");
        singleton1.setMaxConnections(200);
        singleton1.setLoggingEnable(false);

        Singleton singleton2 = Singleton.getInstance();
        singleton2.displayConfigurations();

        System.out.println("A configuração 1 e a 2 são iguais?\n" + (singleton1 == singleton2));


    }
}
