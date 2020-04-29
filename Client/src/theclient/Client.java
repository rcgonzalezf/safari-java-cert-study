package theclient;

import theservice.spi.MessageInterface;

import java.lang.reflect.Field;

public class Client {
  public static void main(String[] args) throws Throwable {
    MessageInterface serv = theservice.spi.Provider.getMessage();
    System.out.println("Message is " + serv.get());
    Class<?> cl = serv.getClass();
    Field theMessage = cl.getDeclaredField("message");
    theMessage.setAccessible(true); // disables access checks
    theMessage.set(null, "Haha, I hacked your secret message");
    System.out.println("Message is " + serv.get());
//    throw new java.sql.SQLException();
  }
}
