package baseline;

public class Solution46 {
    public static void main(String[] args) {
        HistogramMaker jimmy = new HistogramMaker("data/exercise46_input.txt");
        String histogram = jimmy.makeHistogram();
        System.out.println(histogram);
    }
}
