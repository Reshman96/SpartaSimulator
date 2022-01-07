package model;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.InOrder;
import org.mockito.Mockito;

public class CentreGeneratorTests {

    private static CentreGenerator mockCentreGenerator;
    private static Centre mockCentre;

    @BeforeAll
    static void setup() {
        mockCentreGenerator = Mockito.mock(CentreGenerator.class);
        mockCentre = Mockito.mock(Centre.class);
    }

    //@Test
    //@DisplayName("Test centre created")
    //void testCentreCreated() {
    //    mockCentreGenerator.createCenter();
    //    InOrder inOrder = Mockito.inOrder(mockCentreGenerator);
    //    inOrder.verify(mockCentreGenerator).createCenter();
    //}
}

