public class Singleton {

    private static volatile Singleton instance;

    private String serverAdress;
    private int maxConnections;
    private boolean loggingEnable;


    public boolean isLoggingEnable() {
        return loggingEnable;
    }
    public void setLoggingEnable(boolean loggingEnable) {
        this.loggingEnable = loggingEnable;
    }
    public int getMaxConnections() {
        return maxConnections;
    }
    public void setMaxConnections(int maxConnections) {
        this.maxConnections = maxConnections;
    }
    public String getServerAdress() {
        return serverAdress;
    }
    public void setServerAdress(String serverAdress) {
        this.serverAdress = serverAdress;
    }


    private Singleton(){
        this.serverAdress = "111.111.1.1";
        this.maxConnections = 100;
        this.loggingEnable = true;
    }

    public static Singleton getInstance() {
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }return instance;
    }

    public void displayConfigurations(){
        System.out.println("Configurações atuais:");
        System.out.println("Endereço do servidor:"+ serverAdress);
        System.out.println("Conexões maximas:" + maxConnections);
        System.out.println("Logging ativado:" + loggingEnable);
    }

}
