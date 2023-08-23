public class WeightConversionTester{
    public static void main(String args[]) {
      final long weight = 150;
      final double VENUS = 0.91;
      final double MARS = 0.38;
      final double JUPITER = 2.54;
      final double SATURN = 1.08;
      final double URANUS = 0.91;
      final double NEPTUNE =  1.19;
      long venusWeight = Math.round(weight * VENUS);
      long marsWeight = Math.round(weight * MARS);
      long jupiterWeight = Math.round(weight*JUPITER);
      long saturnWeight = Math.round(weight * SATURN);
      long uranusWeight = Math.round(weight * URANUS);
      long neptuneWeight = Math.round(weight * NEPTUNE);
      //Output
      System.out.println("Weight on Earth: " + Long.toString(weight));
      System.out.println("Weight on Venus: " + Long.toString(venusWeight));
      System.out.println("Weight on Mars: " + Long.toString(marsWeight));
      System.out.println("Weight on Jupiter: " + Long.toString(jupiterWeight));
      System.out.println("Weight on Saturn: " + Long.toString(saturnWeight));
      System.out.println("Weight on Uranus: " + Long.toString(uranusWeight));
      System.out.println("Weight on Neptune: " + Long.toString(neptuneWeight));
    }   
}