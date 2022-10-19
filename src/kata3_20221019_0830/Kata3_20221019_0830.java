package kata3_20221019_0830;

public class Kata3_20221019_0830 {

    public static void main(String[] args) {
        Histogram<String> histogram = new Histogram<String>();
        
        histogram.increment("ulpgc.es");
        histogram.increment("ulpgc.es");
        histogram.increment("dis.ulpgc.es");
        histogram.increment("ulpgc.es");
        histogram.increment("dis.ulpgc.es");
        histogram.increment("gmail.com");
        histogram.increment("hotmail.com");
        histogram.increment("hotmail.com");
        
        HistogramDisplay histogramDisplay = new HistogramDisplay(histogram,"Histogram Display...");
        histogramDisplay.execute();
    }
    
}
