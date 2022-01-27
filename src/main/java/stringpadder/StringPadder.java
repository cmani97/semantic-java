package stringpadder;

public interface StringPadder {
  String padLeft(String stringToPad, int totalLength);

  String padLeft(String stringToPad, int totalLength, char paddingCharacter);

  String padRight(String stringToPad, int totalLength);

  String padRight(String stringToPad, int totalLength, char paddingCharacter);

  String padMiddle(String stringToPad, int totalLength);

  String padMiddle(String stringToPad, int totalLength, char paddingCharacter);
}
