package splitMethod.test;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import splitMethod.Cylinder;

public class CylinderTest {
    @Test
    @DisplayName("Testing getVolume(0, 0)")
    void testGetVolume0And0(){
        int radius = 0;
        int height = 0;
        double expected = 0;
        double result = Cylinder.getVolume(radius, height);
        assert result == expected;
    }

    @Test
    @DisplayName("Testing getVolume(1, 2)")
    void testGetVolume1And2(){
        int radius = 1;
        int height = 2;
        double expected = 14.566370614359172;
        double result = Cylinder.getVolume(radius, height);
        assert result == expected;
    }

}
