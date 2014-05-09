package oca.se7.Understanding_Polymorphism_and_Casts.Exercise_1;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Logger {
    private BufferedWriter out;
    
    public Logger() throws IOException {
        out = new BufferedWriter(new FileWriter("logfile.txt"));
    }
    
    public void appendToLog(Logable logable) throws IOException{
        out.write("Object history: " + logable.getInitInfo());
        out.newLine();
        out.write("Object history: " + logable.getLogableEvent());
        out.newLine();
    }
    
    public void close() throws IOException {
        out.flush();
        out.close();
        
    }
}
