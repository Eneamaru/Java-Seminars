package Homework_6;

public class Notebook {

    private  Integer RAM;
    private  Integer HD;
    private  String OS;
    private  String color;

    public Notebook (Integer RAM, Integer HD, String OS, String color){
        this.RAM = RAM;
        this.HD = HD;
        this.OS = OS;
        this.color = color;
    }

    public Integer getRAM(){
        return RAM;
    }
    public void setRAM(int RAM) {
        this.RAM = RAM;
    }
    public Integer getHD(){
        return HD;
    }
    public void setHD(int HD) {
        this.HD = HD;
    }
    public String getOS(){
        return OS;
    }
    public void setOS(String OS) {
        this.OS = OS;
    }
    public String getColor(){
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    private String getInfo(){
        return String.format("\n"+" - Операционная система: " + OS +" \n Оперативная память: " + RAM + "Гб \n Жёсткий диск: " + HD + " Гб \n Цвет: " + color);
    }
@Override
    public String toString(){

        return getInfo();
    }
}