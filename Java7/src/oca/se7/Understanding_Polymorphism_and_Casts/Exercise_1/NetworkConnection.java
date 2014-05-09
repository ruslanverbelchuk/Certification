package oca.se7.Understanding_Polymorphism_and_Casts.Exercise_1;


public class NetworkConnection implements Logable{
    private long createdTimestamp;
    private String currentLogMessage;
    
    public NetworkConnection(){
        createdTimestamp = System.currentTimeMillis();
        currentLogMessage = "Initialized";
    }
            
    public void connection(){
        currentLogMessage = "Connected at " + System.currentTimeMillis();
    }
    public String getInitInfo(){
        return "Networking Connection object created "  + createdTimestamp;
    }
    
    public String getLogableEvent(){
        return currentLogMessage;
    }
}
