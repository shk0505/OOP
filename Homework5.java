class Computer {
    private String cpu;
    private String memory;
    private String hd;
    private String color;
    private String power;
    Computer() {
        cpu = "Core i7";
        memory = "32GB";
        hd = "2TB";
        color = "White";
        power = "700W";
    }
    public void turnOn() {
        System.out.println("Turning on the computer.");
    }
    public void printInfo() {
        System.out.println("The spec of the computer.");
        System.out.printf(" CPU: %s\n", cpu);
        System.out.printf(" Memory: %s\n", memory);
        System.out.printf(" HDD: %s\n", hd);
        System.out.printf(" Color: %s\n", color);
        System.out.printf(" Power: %s\n", power);
    }
}

class Monitor {
    private String monitorSize;
    private String color;
    private String power;
    Monitor() {
        monitorSize = "32 inch";
        color = "Black";
        power = "45W";
    }
    public void turnOn() {
        System.out.println("Turning on the monitor.");
    }
    public void printInfo() {
        System.out.println("The spec of the monitor.");
        System.out.printf(" Size: %s\n", monitorSize);
        System.out.printf(" Color: %s\n", color);
        System.out.printf(" Power: %s\n", power);
    }
}

class PersonalComputer {
    private Computer c;
    private Monitor m;
    PersonalComputer(Computer c, Monitor m) {
        this.c = c;
        this.m = m;
    }
    public void turnOn() {
        c.turnOn();
        m.turnOn();
    }
    public void printInfo() {
        c.printInfo();
        m.printInfo();
    }
}

public class Homework5 {
    public static void main(String[] args) {
        Computer c = new Computer();
        Monitor m = new Monitor();
        PersonalComputer pc = new PersonalComputer(c, m);
        pc.turnOn();
        pc.printInfo();
    }
}