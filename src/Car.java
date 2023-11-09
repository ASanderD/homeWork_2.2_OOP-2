public class Car extends TransportVehicle implements UpdateTyres, WithEngine {


    public Car(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    public void cervice() {
        updateTyres();
        checkEngine();
    }

    @Override
    public void updateTyres() {//переопределение метода updateTyres
        System.out.println("Обслуживаем " + getModelName());
        for (int i = 0; i < getWheelsCount(); i++) {
            System.out.println("Меняем покрышку на автомобиле");
        }
    }

    @Override
    public void checkEngine() {//переопределение метода checkEngine
        System.out.println("Проверяем двигатель автомобиля");
    }
}
