package creationalDesignPatterns.singletonDesignPattern.loggerExample;

/*
* In this updated code we have used the synchronized keyword to avoid any race condition
* but there is a problem, since we have applied synchronized to the whole getLogger function
* it always blocks multiple thread from accessing it, let's say we have avoided any race condition and some
* thread has successfully created an instance of logger, now even though the instance is created the synchronized
* will not let multiple threads access the getLogger method at the same time, but that would be very inefficient
* since now the instance cannot be created again so it would be wise to let multiple thread access this method
* at the same time, that brings us to the third version of this code.
* */

public class V2Logger {
    private static V2Logger v2Logger = null;
    private V2Logger(){}

    public static synchronized V2Logger getV2Logger(){
        if(v2Logger == null)
        {
            v2Logger = new V2Logger();
        }
        return v2Logger;
    }

    public void logMessage(String message){
        System.out.println(message);
    }
}
