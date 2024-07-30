import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MeanTest {

    @Test
    @DisplayName("find the mean of all integers")
    void meanValueOfAllIntegers() {

        Mean average = new Mean();

        // Arrange
       // int[] input1 = new int[]{};
        //int[] input2 = new int[]{10, 10};
        //int[] input3 = new int[]{30, 70, 50};
       // int[] input4 = new int[]{1};
        int[] input5 = new int[]{3,1,6};

//
        //int expectedOutcome1 = 0;
        //int expectedOutcome2 = 10;
        //int expectedOutcome3 = 50;
        //int expectedOutcome4 = 1;
        double expectedOutcome5 = 3.3333333333333335;
;


        // Act
        //double testResult1 = average.meanValueOfAllIntegers(input1);
        //double testResult2 = average.meanValueOfAllIntegers(input2);
        //double testResult3 = average.meanValueOfAllIntegers(input3);
       //double testResult4 = average.meanValueOfAllIntegers(input4);
        double testResult5 = average.meanValueOfAllIntegers(input5);
//
//        // Assert
//
       // assertEquals(expectedOutcome1, testResult1);
       // assertEquals(expectedOutcome2, testResult2);
       // assertEquals(expectedOutcome3, testResult3);
        //assertEquals(expectedOutcome4, testResult4);
        assertEquals(expectedOutcome5, testResult5);
//
//        );
//
//
//    }
//}

    }
}
