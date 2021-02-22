package sk.stuba.fei.uim.oop;

public class App {
    public static void main(String[] args){

        uloha1();
        System.out.println("Vrátilo mi:" + uloha2());

    }

    static void uloha1() {
        System.out.println("Hello World");
    }

    static int uloha2() {
        int prveCislo=KeyboardInput.readInt("Zadaj prve cislo: ");
        int druheCislo=KeyboardInput.readInt("Zadaj druhe cislo: ");
        if (prveCislo > druheCislo) {
            return prveCislo;
        } else if (prveCislo == druheCislo) {
            return 0;
        } else {
            return druheCislo;
        }
    }

    }


