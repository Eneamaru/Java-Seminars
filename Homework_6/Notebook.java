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
    public Integer getHD(){
        return HD;
    }
    public String getOS(){
        return OS;
    }
    public String getColor(){
        return color;
    }
    private String getInfo(){
        return String.format("\n"+" - OS: " +OS +" \n RAM: %d GB \n HD: %d GB \n color: " + color, ram, storage);
    }
@Override
    public String toString(){

        return getInfo();
}


}