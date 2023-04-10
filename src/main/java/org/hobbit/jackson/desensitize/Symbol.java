package org.hobbit.jackson.desensitize;

/**
 * @author lhy
 * @version 1.0.0 2022/3/30 10:38
 */
public class Symbol {

  /**
   * 脱敏符号
   */
  public static final String STAR = "*";

  private Symbol() {

  }

  /**
   * 获取符号
   *
   * @param number 符号个数
   * @param symbol 符号
   */
  public static String getSymbol(int number, String symbol) {
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < number; i++) {
      sb.append(symbol);
    }
    return sb.toString();
  }
}
