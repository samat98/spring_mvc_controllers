package web.model;

public class Car {
     private String model;
     private int series;
     private int production_year;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getSeries() {
        return series;
    }

    public void setSeries(int series) {
        this.series = series;
    }

    public int getProduction_year() {
        return production_year;
    }

    public void setProduction_year(int production_year) {
        this.production_year = production_year;
    }

    public Car(String model, int series, int production_year) {
        this.model = model;
        this.series = series;
        this.production_year = production_year;
    }
}
