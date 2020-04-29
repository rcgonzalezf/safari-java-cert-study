package theservice;

import theservice.spi.MessageInterface;

public class Service implements MessageInterface {
  private static String message =
      "This is a message from Service";

  @Override
  public String get() {
    return message;
  }
}
