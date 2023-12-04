package lesson7;

public class Tour {
    private String country;
    private int daysCount;
    private String transport = "Не указан";
    private int price = 0;


    // конструкторы
    public Tour(){

    }
    public Tour(String country, int daysCount, String transport, int price){
        this.country = country;
        this.daysCount = daysCount;
        this.transport = transport;
        this.price = price;
    }

    public Tour(String country, int daysCount){
        this.country = country;
        this.daysCount = daysCount;
    }
    public Tour(String country, int daysCount, int price){
        this.country = country;
        this.daysCount = daysCount;
        this.price = price;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getDaysCount() {
        return daysCount;
    }

    public void setDaysCount(int daysCount) {
        this.daysCount = daysCount;
    }

    public String getTransport() {
        return transport;
    }

    public void setTransport(String transport) {
        this.transport = transport;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    // медот для ввывода информацию про Тур

    public void displayTourInfo() {
        System.out.println("страна" + " " + country);
        System.out.println("на" + " " + daysCount + " " + "дней");
        System.out.println("транспорт" + " " + transport);
        System.out.println("цена тура" + " " + price);
    }
}
