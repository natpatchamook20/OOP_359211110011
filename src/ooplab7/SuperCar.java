package ooplab7;

public class SuperCar {
    private String carBrand;
    private String carColor;
    private String carEngineSize;
    private String maxSpeed;
    private String countryOfOrigin;

    public SuperCar() {
    }
    public SuperCar (String b, String c, String e, String s, String o) {
        this.carBrand = b;
        this.carColor = c;
        this.carEngineSize = e;
        this.maxSpeed = s;
        this.countryOfOrigin = o;
    }
    @Override
    public String toString() {
        return "SuperCar{" +
                "carBrand='" + carBrand + '\'' +
                ", carColor='" + carColor + '\'' +
                ", carEngineSize='" + carEngineSize + '\'' +
                ", maxSpeed='" + maxSpeed + '\'' +
                ", countryOfOrigin='" + countryOfOrigin + '\'' +
                '}';
    }


    public String getCarBrand() {
        return carBrand;
    }

    public void setCarBrand(String carBrand) {
        this.carBrand = carBrand;
    }

    public String getCarColor(String red) {
        return carColor;
    }

    public void setCarColor(String carColor) {
        this.carColor = carColor;
    }

    public String getCarEngineSize() {
        return carEngineSize;
    }

    public void setCarEngineSize(String carEngineSize) {
        this.carEngineSize = carEngineSize;
    }

    public String getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(String maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public String getCountryOfOrigin() {
        return countryOfOrigin;
    }

    public void setCountryOfOrigin(String countryOfOrigin) {
        this.countryOfOrigin = countryOfOrigin;
    }
}
