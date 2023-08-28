// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class WeightConversion {
    private long weight;

    final double VENUS = 0.91;
    final double MARS = 0.38;
    final double JUPITER = 2.54;
    final double SATURN = 1.08;
    final double URANUS = 0.91;
    final double NEPTUNE =  1.19;
    public WeightConversion(long weight){
        this.weight = weight;
        this.weight = 150;
    }


    public long getWeight(){
        return this.weight;
    }
    public long getVenus(){
        long venusWeight = Math.round(this.weight * VENUS);
        return venusWeight;
    }
    public long getMars(){
        long marsWeight = Math.round(this.weight * MARS);
        return marsWeight;
    }
    public long getJupiter(){
        long jupiterWeight = Math.round(this.weight*JUPITER);
        return jupiterWeight;
    }
    public long getSaturn(){
        long saturnWeight = Math.round(this.weight * SATURN);
        return saturnWeight;
    }
    public long getUranus(){
        long uranusWeight = Math.round(this.weight * URANUS);
        return uranusWeight;
    }
    public long getNeptune(){
        long neptuneWeight = Math.round(this.weight * NEPTUNE);
        return neptuneWeight;
    }

}