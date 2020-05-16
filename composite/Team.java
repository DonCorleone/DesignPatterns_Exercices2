package com.codewithmosh.composite;

import java.util.ArrayList;
import java.util.List;

public class Team implements Composition {
  private List<Composition> compositions = new ArrayList<>();

  public void add(Composition composition) {
    compositions.add(composition);
  }

  public void deploy() {
    for (var composition : compositions) {
      composition.deploy();
    }
  }
}
