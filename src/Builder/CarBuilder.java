package Builder;

public class CarBuilder {
  private String engine;
  private String wheels;
  private String color;
  private Integer seat;
  private Boolean sunRoof;
  private Enum fuelType;

  public static CarBuilder setEngine(String engine) {
    CarBuilder builder = new CarBuilder();
    builder.engine = engine;
    return builder;
  }

  public static CarBuilder setWheels(String wheels) {
    CarBuilder builder = new CarBuilder();
    builder.wheels = wheels;
    return builder;
  }

  public static CarBuilder setColor(String color) {
    CarBuilder builder = new CarBuilder();
    builder.color = color;
    return builder;
  }

  public static CarBuilder setSeat(Integer seat) {
    CarBuilder builder = new CarBuilder();
    builder.seat = seat;
    return builder;
  }

  public static CarBuilder setSunRoof(Boolean sunRoof) {
    CarBuilder builder = new CarBuilder();
    builder.sunRoof = sunRoof;
    return builder;
  }

  public static CarBuilder setFuelType(Enum fuelType) {
    CarBuilder builder = new CarBuilder();
    builder.fuelType = fuelType;
    return builder;
  }

  public Car build() {
    return new Car(
      engine,
      wheels,
      color,
      seat,
      sunRoof,
      fuelType
    );
  }

  public static Car buildCheapCar() {
    return new Car(
      "engine 4cyl",
      "standard wheels",
      "white",
      4,
      false,
      FuelType.DIESEL
    );
  }

  public static Car buildSportCar() {
    return new Car(
      "engine v8",
      "sport wheels",
      "red",
      2,
      true,
      FuelType.DIESEL
    );
  }
}
