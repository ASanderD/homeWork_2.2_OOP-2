public class Truck extends TransportVehicle implements UpdateTyres, WithEngine, WithTraler {

    public Truck(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    public void cervice() {
        updateTyre();
        checkEngine();
        checkTrailer();
    }

    @Override
    public void updateTyre() {//переопределение метода updateService
        System.out.println("Обслуживаем " + getModelName());
        for (int i = 0; i < getWheelsCount(); i++) {
            System.out.println("Меняем покрышку на грузовике");
        }
    }

    @Override
    public void checkEngine() {//переопределение метода checkEngine
        System.out.println("Проверяем двигатель грузовика");
    }

    @Override
    public void checkTrailer() {//переопределение метода checkTrailer
        System.out.println("Проверяем прицеп на грузовике");
    }

}

