import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Melon {

    private final String type;
    private final int weight;

  

        public Melon(String type, int weight) {
        this.type = type;
        this.weight = weight;
    }
  public String getType() {
        return this.type;
    }
    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Melon)) {
            return false;
        }
        Melon melon = (Melon) o;
        return Objects.equals(type, melon.type) && weight == melon.weight;
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, weight);
    }

    @Override
    public String toString() {
        return "{" +
            " type='" + getType() + "'" +
            ", weight='" + getWeight() + "'" +
            "}";
    }


    public int getWeight() {
        return this.weight;
    }

  
    // constructor, getters, equals(), hashCode(),
    // toString() omitted for brevity
  public static void main(String[] args) {

     Map<Integer, Melon> melons1Map = new HashMap<>();
    Map<Integer, Melon> melons2Map = new HashMap<>();
  melons1Map.put(1, new Melon("Apollo", 3000));
  melons1Map.put(2,new Melon("Jade Dew", 3500));
  melons1Map.put(3, new Melon("Cantaloupe", 1500));
  System.out.println("Melon set map 1:" + melons1Map);
  melons2Map.put(1, new Melon("Apollo", 3000));
  melons2Map.put(2, new Melon("Jade Dew", 3500));
  melons2Map.put(3, new Melon("Cantaloupe", 1500));
    System.out.println("Melon set map 2:" + melons2Map);

System.out.println("Equality check" + melons1Map.equals(melons2Map));

  }
  
 
}