package uap.mains;

import java.util.Scanner;
import uap.models.*;

public class KalkulatorPabrik {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=============================================");
        System.out.println("Kalkulator Pabrik Cetakan Donat Rumahan");
        System.out.println("MUHAMMAD FARHAN MUZAKKIY");
        System.out.println("245150707111048");
        System.out.println("=============================================");
        System.out.println("Donat dengan lubang");
        System.out.println("=============================================");
        System.out.print("Isikan Radius   : ");
        double major = input.nextDouble();
        System.out.print("Isikan radius   : ");
        double minor = input.nextDouble();
        Torus t = new Torus(major, minor);
        t.printInfo();

        System.out.println("=============================================");
        System.out.println("Donat tanpa lubang");
        System.out.println("=============================================");
        System.out.print("Isikan radius   : ");
        double radius = input.nextDouble();
        Sphere s = new Sphere(radius);
        s.printInfo();
    }
}
