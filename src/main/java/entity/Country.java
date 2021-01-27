package entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Country {

    private ArrayList<String> cities;

    public void setCities(List<String> city){
        this.cities.addAll(city);
    }

}
