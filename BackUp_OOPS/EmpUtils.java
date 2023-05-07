public class EmpUtils {
    public String capitalizeName(String name) {
        char firstChar = name.charAt(0);    // fetch first char only
        String firstLetter = String.valueOf(firstChar);  // typecast char to String
        firstLetter = firstLetter.toUpperCase();
        String remainingString = name.substring(1);
        remainingString = remainingString.toLowerCase();
        name = firstLetter + remainingString;
        return name;
    }

    public String formatName(String name) {
        String fullName = "";
        // name = "Ram kumar sharma";
        String nameArr[] = name.split(" ");    //{"Ram", "kumar", "sharma"}
        for(String word : nameArr) {
            fullName += capitalizeName(word) + " ";
        }
        return fullName;
    }
}
