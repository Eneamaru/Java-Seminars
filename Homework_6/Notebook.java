package Homework_6;

public class Notebook {

    private String name;
    private Integer RAM;
    private Integer HD;
    private String OS;
    private String color;

    public Notebook(String name, Integer RAM, Integer HD, String OS, String color) {
        this.name = name;
        this.RAM = RAM;
        this.HD = HD;
        this.OS = OS;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getRAM() {
        return RAM;
    }

    public void setRAM(int RAM) {
        this.RAM = RAM;
    }

    public Integer getHD() {
        return HD;
    }

    public void setHD(int HD) {
        this.HD = HD;
    }

    public String getOS() {
        return OS;
    }

    public void setOS(String OS) {
        this.OS = OS;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    private String getInfo() {
        return String.format("\n" + name + "\n" + "Операционная система: " + OS + " \nОперативная память: " + RAM
                + "Гб \nЖёсткий диск: " + HD + "Гб" + "\nЦвет: " + color);
    }

    @Override
    public String toString() {

        return getInfo();
    }
}