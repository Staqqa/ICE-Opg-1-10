public class Main {
    public static void main(String[] args) {


        City Kong = new City("Kongens Lyngby", 57500);
        City Ribe = new City("Ribe", 8257);
        City Stor = new City("Storvolde", 34252);
        City tarm = new City("Tarm", 4010);
        City horre = new City("Horreby", 305);


        Cities C1 = new Cities();
        C1.addCity(Kong);
        C1.addCity(Ribe);
        C1.addCity(Stor);
        C1.addCity(tarm);
        C1.addCity(horre);

        City BigC = C1.getBiggestCity();
        System.out.println(BigC.getName());

        int totalCity = C1.getTotalPopulation();
        System.out.println("Samlet antal indbyggere: " + totalCity);

    }
}