package uap.models;

import uap.bases.*;
import uap.interfaces.*;

public class Torus extends Shape implements ThreeDimensional, MassCalculable, ShippingCostCalculator, MassConverter, PiRequired  {
    private double majorRadius;
    private double minorRadius;

    public Torus(){}

    public Torus(double majorRadius, double minorRadius){
        this.majorRadius = majorRadius;
        this.minorRadius = minorRadius;
    }

    @Override
    public double getVolume(){
        return 2.0 * Math.pow(PI,2) * majorRadius * Math.pow(minorRadius,2);
    }

    @Override
    public double getSurfaceArea() {
        return 4.0 * Math.pow(PI,2) * majorRadius * minorRadius;
    }

    @Override
    public double getMass(){
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
