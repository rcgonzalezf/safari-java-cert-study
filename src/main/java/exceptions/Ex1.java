package exceptions;

import java.io.IOException;
import java.sql.SQLException;

public class Ex1 {
  public static void doStuff() throws IOException, RuntimeException {
    try {
      if (Math.random() > 0.5) {
        throw new SQLException();
      }
      if (Math.random() > 0.5) {
        throw new IOException();
      }
    } catch (SQLException e) {
    }/* catch (IOException e) {
    }*/
  }

  public static void testIt() {
    try {
      doStuff();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}

