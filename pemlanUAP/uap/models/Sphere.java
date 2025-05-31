package uap.models;

import uap.bases.Shape;
import uap.interfaces.*;

public class Sphere extends Shape implements ShippingCostCalculator, MassConverter, ThreeDimensional, PiRequired, MassCalculable {
    private double radius;

    public Sphere(){}

    public Sphere(double radius){
        this.radius = radius;
    }

    @Override
    public double getVolume() {
        return (4.0/3.0) * PI * Math.pow(radius,3);
    }

    @Override
    public double getSurfaceArea() {
        return 4.0 * PI * Math.pow(radius,2);
    }

    @Override
    public double getMass() {
        return DENSITY * getSurfaceArea() * THICKNESS;
    }

    @Override
    public void printInfo() {
        System.out.println("=============================================");
        System.out.printf("Volume          : %.1f\n", getVolume());
        System.out.printf("Luas permukaan  : %.1f\n", getSurfaceArea());
        System.out.printf("Massa           : %.1f\n", getMass());
        System.out.printf("Massa dalam kg  : %.2f\n", gramToKilogram());
        System.out.printf("Biaya kirim     : Rp%d\n", (int) calculateCost());
    }

    @Override
    public Double gramToKilogram() {
        return getMass() / DENOMINATOR;
    }

    @Override
    public double calculateCost() {
        double berat = gramToKilogram();
        int dibulatkan = (int) Math.ceil(berat);
        return dibulatkan * PRICE_PER_KG;
    }
}
