import org.junit.Ignore;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;


public class PR7Test {


    @BeforeAll
    static void BeforeAll() {
        List<Double> expectedRoots = new ArrayList<>();
        Program program = new Program();
        List<Double> actual = program.FindRoots(4, 1, 4);
        System.out.println("First test. Discriminant < 0");
        expectedRoots.add(Double.NaN);
        expectedRoots.add(Double.NaN);
        assertEquals(expectedRoots, actual);
    }

    @org.junit.jupiter.api.Test
    void count() throws Exception {
        List<Double> expectedRoots = new ArrayList<>();
        Program program = new Program();
        List<Double> actual = program.FindRoots(1, 2, 1);
        System.out.println("First test. Discriminant = 0");
        expectedRoots.add((double) -1);
        expectedRoots.add(Double.NaN);
        assertEquals(expectedRoots, actual);
    }

    @Ignore
    static void Ignore() {
    }

    @AfterAll
    static void AfterAll() {
        List<Double> expectedRoots = new ArrayList<>();
        Program program = new Program();
        List<Double> actual = program.FindRoots(1, -70, 600);
        System.out.println("First test. Discriminant > 0");
        expectedRoots.add(3125035.0);
        expectedRoots.add(-3124930.0);
        assertEquals(expectedRoots, actual);
    }
}