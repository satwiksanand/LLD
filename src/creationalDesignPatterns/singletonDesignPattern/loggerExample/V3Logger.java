package creationalDesignPatterns.singletonDesignPattern.loggerExample;

/*
* first thing to notice is that in this class we have used the synchronized keyword in the if condition rather
* than the whole function, second if you will notice one thing we have used two if conditions to check whether
* the logger instance is null or not is because we don't want the thread to once again create multiple instances
* of logger.
* */

public class V3Logger {
    private static V3Logger v3Logger = null;
    private V3Logger(){}

    public static V3Logger getV3Logger(){
        if(v3Logger == null){
            synchronized (V3Logger.class){
                if(v3Logger == null){
                    v3Logger = new V3Logger();
                }
            }
        }
        return v3Logger;
    }

    public void logMessage(String message){
        System.out.println(message);
    }
}
