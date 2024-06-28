package Objects;
import java.util.Objects;

public class Edge2 extends Edge{
    private final String source;

    public Edge2(String source, String destination, int weight) {
        super(destination, weight);
        this.source = source;
    }

    public String getSource() {
        return source;
    }


}
