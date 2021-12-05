package com.springcore.collections;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Students {
  private List<String> names;
  private Set<Integer> rolls;
  Map<Integer, String> map;

  public Students() {
  }

  public Students(List<String> names, Set<Integer> rolls,
                  Map<Integer, String> map) {
    this.names = names;
    this.rolls = rolls;
    this.map = map;
  }

  public void setMap(Map<Integer, String> map) {
    this.map = map;
  }

  public Map<Integer, String> getMap() {
    return map;
  }

  public List<String> getNames() {
    return names;
  }

  public Set<Integer> getRolls() {
    return rolls;
  }

  public void setNames(List<String> names) {
    this.names = names;
  }

  public void setRolls(Set<Integer> rolls) {
    this.rolls = rolls;
  }
}
