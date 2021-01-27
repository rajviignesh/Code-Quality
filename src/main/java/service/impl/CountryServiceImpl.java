package service.impl;



import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CountryServiceImpl {

    public String findCountry(String contents) {
        Pattern pattern = Pattern.compile("<title>(\\S+)</title>");
        Matcher matcher = pattern.matcher(contents);
        if (matcher.find()) {
            String result = matcher.group(1);
            return result;
        }
        return "Country not Found";
    }
}
