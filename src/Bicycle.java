public class Bicycle extends TransportVehicle implements UpdateTyres {

    public Bicycle(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    public void cervice() {
        updateTyre();
    }

    public void updateTyre() { //переопределение метода updateService
        System.out.println("Обслуживаем " + getModelName());
        for (int i = 0; i < getWheelsCount(); i++) {
            System.out.println("Меняем покрышку на велосипеде");
        }
    }
}
