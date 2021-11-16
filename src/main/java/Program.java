import java.util.*;

public class Program {
    public static void main(String[] args) {

    }

    public List<Double> FindRoots(int a, int b, int c)
    {
        List<Double> roots = new ArrayList<>();
        double Discreet = (b * b) - (4 * a * c);

        if(Discreet>0)
        {
            double answer1 = (-b + Discreet * Discreet) / (2 * a);
            double answer2 = (-b - Discreet * Discreet / (2 * a));
            roots.add(answer1);
            roots.add(answer2);
            return roots;
        }
        else if(Discreet==0)
        {
            double dd = -b / (2*a);
            roots.add(dd);
            roots.add(Double.NaN);
            return roots;
        }
        else
        {
            roots.add(Double.NaN);
            roots.add(Double.NaN);
            return roots;
        }
    }
}
