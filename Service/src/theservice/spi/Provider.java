package theservice.spi;

import theservice.Service;

public class Provider {
  public static MessageInterface getMessage() {
    return new Service();
  }
}
