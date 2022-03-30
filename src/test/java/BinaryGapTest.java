import lombok.extern.log4j.Log4j2;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

@Log4j2
class BinaryGapTest {

    @Test
    void solution() {
        BinaryGap binaryGap= new BinaryGap();

        int num1 = 1041;
        String bnum1 = Integer.toBinaryString(num1);
        log.debug("num1:{},  bnum1:{}",num1,bnum1);
        assertEquals(5, binaryGap.solution(num1));


        int num2 = 15;
        String bnum2 = Integer.toBinaryString(num2);
        log.debug("num2:{}, bnum2:{}",num2,bnum2);
        assertEquals(0, binaryGap.solution(num2));

        int num3 = 32;
        String bnum3 = Integer.toBinaryString(num3);
        log.debug("num3:{}, bnum3:{}",num3,bnum3);
        assertEquals(0, binaryGap.solution(num3));

    }
}