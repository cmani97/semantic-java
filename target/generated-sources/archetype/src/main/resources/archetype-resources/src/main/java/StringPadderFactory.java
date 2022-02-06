#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package};

public final class StringPadderFactory {
  private StringPadderFactory() {}

  public static StringPadder createStringPadder() {
    return new StringPadderImpl();
  }
}
