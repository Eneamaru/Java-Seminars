package Homework_6;

public class Notebook {
    private int ram;
    private int storage;
    private String OS;
    private String color;

    public Notebook(int ram, int storage, String OS, String color) {
        this.ram = ram;
        this.storage = storage;
        this.OS = OS;
        this.color = color;
    }

    public int getRAM() {
        return ram;
    }

    public void setRAM(int ram) {
        this.ram = ram;
    }

    public int getStorage() {
        return storage;
    }

    public void setStorage(int storage) {
        this.storage = storage;
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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        // sb.append("Ноутбук ");
        // sb.append(this.id);
        sb.append(System.lineSeparator());
        sb.append(this.color);
        // sb.append(" ");
        // sb.append(this.brand);
        // sb.append(" ");
        // sb.append(this.model);
        sb.append(System.lineSeparator());
        sb.append("OS " + this.OS);
        sb.append(System.lineSeparator());
        sb.append("HDD " + this.storage);
        sb.append(System.lineSeparator());
        sb.append("RAM " + this.ram);
        sb.append(System.lineSeparator());
        // if (this.isBooked == false)
        //     sb.append("Не резерв ");
        // else
        //     sb.append("Резерв ");

        return (sb.toString());
    }
}