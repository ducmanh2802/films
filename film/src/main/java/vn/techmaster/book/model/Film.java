package vn.techmaster.book.model;

public class Film {
    String name;
    String director;
    int yearProduce;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getdirector() {
        return director;
    }

    public void setdirector(String director) {
        this.director = director;
    }

    public int getYearProduce() {
        return yearProduce;
    }

    public void setYearProduce(int yearProduce) {
        this.yearProduce = yearProduce;
    }

    public Film() {
    }

    public Film(String name, String director, int yearProduce) {
        this.name = name;
        this.director = director;
        this.yearProduce = yearProduce;
    }

    @Override
    public String toString() {
        return "Film [director=" + director + ", name=" + name + ", yearProduce=" + yearProduce + "]";
    }

}
