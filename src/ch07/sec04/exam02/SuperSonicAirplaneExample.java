package ch07.sec04.exam02;

public class SuperSonicAirplaneExample {
    public static void main(String[] args) {
        SuperSonicAriplane sa = new SuperSonicAriplane();
        sa.takeOff();
        sa.fly();
        sa.flyMode = SuperSonicAriplane.SUPERSONIC;
        sa.fly();
        sa.flyMode = SuperSonicAriplane.NORMAL;
        sa.fly();
        sa.land();
    }
}

