package creationalDesignPatterns.singletonDesignPattern.loggerExample;

/*
* now singleton design pattern is used to ensure that only a single instance of any class is created
* in the current example however that is not true and the reason behind that is the multi-thread property
* of java, there can happen a race condition that two threads thread A and thread B, try to call the getLogger
* function at the same time, thread A will see that there is not instance created of logger and thread B will see
* the same, in which condition both of those threads will create an instance, hence the singleton design pattern
* will end up creating multiple instances entirely different from what it was supposed to do.
*
* what is the solution:->
* the solution is to use the `synchronized` key word that makes sure that at any point a critical piece of code
* can be accessed by only one thread avoiding any race condition, let's see the correct way to do so over the
* next two version of logger.
* */

public class V1Logger {
    private static V1Logger v1Logger = null;
    private V1Logger(){}

    public static V1Logger getLogger(){
        if(v1Logger == null){
            v1Logger = new V1Logger();
        }
        return v1Logger;
    }

    public void logMessage(String message){
        System.out.println(message);
    }
}


