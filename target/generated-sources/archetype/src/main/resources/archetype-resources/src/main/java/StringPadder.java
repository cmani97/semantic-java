#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package};

public interface StringPadder {
  String padLeft(String stringToPad, int totalLength);

  String padLeft(String stringToPad, int totalLength, char paddingCharacter);

  String padRight(String stringToPad, int totalLength);

  String padRight(String stringToPad, int totalLength, char paddingCharacter);

  String padMiddle(String stringToPad, int totalLength);

  String padMiddle(String stringToPad, int totalLength, char paddingCharacter);
}
