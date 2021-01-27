import entity.Country;
import service.impl.CountryServiceImpl;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class InitialTask {



    public static void main(String[] args) throws URISyntaxException, IOException{

        Path path = Paths.get(InitialTask.class.getClassLoader().getResource("sample.html").toURI());

        String contents = new String(Files.readAllBytes(path));

        CountryServiceImpl countryService = new CountryServiceImpl();
        String countryTitle = countryService.findCountry(contents);
        System.out.println(countryTitle);


        Country country1 = new Country();
        List<String> cityList = Arrays.asList( "Chennai", "Mumbai");
        country1.setCities(cityList);
        Country country2 = new Country();
        cityList = Arrays.asList( "LA", "NY");
        country2.setCities(cityList);
        Country country3 = new Country();
        cityList = Arrays.asList("London","Leeds");
        country2.setCities(cityList);

        HashMap<String, Country> countryList = new HashMap<>();
        countryList.put("India", country1);
        countryList.put("USA", country2);
        countryList.put("UK", country3);

        for (String i : countryList.keySet()) {
            if(i == countryTitle){
                System.out.println(countryList.get(i).getCities());
            }
        }



        //String country = countryService.findCountry(contents);
        //System.out.println(country);





    }
}
