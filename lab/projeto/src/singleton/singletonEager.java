package singleton;

public class singletonEager {
    private static singletonEager instancia = new singletonEager();

    private singletonEager(){
            super();
        }
        public static singletonEager getInstancia(){
            return instancia;
        }
    
}