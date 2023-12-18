import java.util.ArrayList;

public class Cities {
    ArrayList<City> cities = new ArrayList<>();

    public void addCity(City cityL) {
        cities.add(cityL);
    }

    public City getBiggestCity() {
        int max = 0;
        City biggestCity = null;

        for (City cityL : cities) {

            if (cityL.getPopulation() > max) {
                max = cityL.getPopulation();
                biggestCity = cityL;
            }
        }
        return biggestCity;
    }

    public int getTotalPopulation(){
        int totalPopulation = 0;

        for (City cityL : cities){
            totalPopulation += cityL.getPopulation();

        }
        return totalPopulation;



    }


}

