package singleton;

public class singletonLazyHolder {
    private static class instanceHolder{
        public static singletonLazyHolder instancia = new singletonLazyHolder();
    }

    private singletonLazyHolder(){
            super();
        }
        public static singletonLazyHolder getInstancia(){
            return instanceHolder.instancia;
        }
    
}
    

