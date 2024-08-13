package ex_28072024;

public class Lab035 {


    public static void main(String[] args) {
        BuildingBP building = new BuildingBP();
        building.color = "blue";
        building.height = 20;
        building.name = "Prestige";
        building.rooms = 15;

        building.lift();
        building.activity();
        building.functions();
    }



}
