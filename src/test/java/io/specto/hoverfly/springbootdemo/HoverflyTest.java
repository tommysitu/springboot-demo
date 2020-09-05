package io.specto.hoverfly.springbootdemo;

import io.specto.hoverfly.junit.core.Hoverfly;
import io.specto.hoverfly.junit5.HoverflyExtension;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

@ExtendWith(HoverflyExtension.class)
public class HoverflyTest {

  @Test
  void name(Hoverfly hoverfly) {

  }
}
