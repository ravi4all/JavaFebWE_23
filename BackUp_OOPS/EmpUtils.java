import java.text.DateFormat;
import java.text.NumberFormat;
import java.util.Date;
import java.util.Locale;

public class EmpUtils {

    // Locale locale = new Locale("en", "IN");
    Locale locale = new Locale("en", "US");

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

    public String formatSalary(double salary) {
        // NumberFormat nf = NumberFormat.getInstance(locale);
        NumberFormat nf = NumberFormat.getCurrencyInstance(locale);
        String sal = nf.format(salary);
        return sal;
    }

    public String formatDate() {
        Date date = new Date();
        // DateFormat df = DateFormat.getDateInstance(DateFormat.MEDIUM);
        DateFormat df = DateFormat.getDateInstance(DateFormat.SHORT, locale);
        String dateFormatted = df.format(date);
        // System.out.println("Date is : " + dateFormatted);
        return dateFormatted;
    }

}
