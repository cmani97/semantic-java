package stringpadder;

public final class StringPadderFactory {
  private StringPadderFactory() {}

  public static StringPadder createStringPadder() {
    return new StringPadderImpl();
  }
}
