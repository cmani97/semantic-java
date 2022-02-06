#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package};

public class StringPadderImpl implements StringPadder {
  public StringPadderImpl() {}

  @Override
  public String padLeft(String stringToPad, int totalLength) {
    return padLeft(stringToPad, totalLength, ' ');
  }

  @Override
  public String padLeft(String stringToPad, int totalLength, char paddingCharacter) {
    return getStringToBeAdded(stringToPad, totalLength, paddingCharacter) + stringToPad;
  }

  @Override
  public String padRight(String stringToPad, int totalLength) {
    return padRight(stringToPad, totalLength, ' ');
  }

  @Override
  public String padRight(String stringToPad, int totalLength, char paddingCharacter) {
    return stringToPad + getStringToBeAdded(stringToPad, totalLength, paddingCharacter);
  }

  @Override
  public String padMiddle(String stringToPad, int totalLength) {
    return padMiddle(stringToPad, totalLength, ' ');
  }

  @Override
  public String padMiddle(String stringToPad, int totalLength, char paddingCharacter) {
    String left = stringToPad.substring(0, stringToPad.length() / 2 + 1);
    String right = stringToPad.substring(stringToPad.length() / 2 + 1);
    String middle = getStringToBeAdded(stringToPad, totalLength, paddingCharacter);
    return left + middle + right;
  }

  private String getStringToBeAdded(String stringToPad, int totalLength, char paddingCharacter) {
    int quantity = totalLength - stringToPad.length();
    if (quantity > 0) {
      return Character.toString(paddingCharacter).repeat(quantity);
    } else {
      return "";
    }
  }
}
