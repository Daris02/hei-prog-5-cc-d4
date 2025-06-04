package Builder;

public record Car(
  String engine,
  String wheels,
  String color,
  Integer seat,
  Boolean sunRoof,
  Enum fuelType) {
}
