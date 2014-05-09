package oca.se7.Understanding_Polymorphism_and_Casts.Exercise_1;

public class Tester {
    public static void main(String[] args) throws Exception{
        new Tester();
    }
    
    public Tester() throws Exception{
        Logger logger = new Logger();
        SystemStatus systemStatus = new SystemStatus();
        NetworkConnection networkConnection = new NetworkConnection();
        
        logger.appendToLog(systemStatus);
        logger.appendToLog(networkConnection);
        
        networkConnection.connection();
        Thread.sleep(2000);
        logger.appendToLog(systemStatus);
        logger.appendToLog(networkConnection);
        logger.close();
        
    }
    
}
