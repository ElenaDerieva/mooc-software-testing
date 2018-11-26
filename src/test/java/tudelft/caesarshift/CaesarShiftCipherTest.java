package tudelft.caesarshift;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class CaesarShiftCipherTest {

    @ParameterizedTest(name="string:{0},shift:{1},result:{2}")
    @CsvSource({"'',1,''","' ',1,' '","'abC',1,invalid","'abc2',1,invalid","'*abc',1,invalid"})
    public void CaesarShiftInvalidCases(String initialString, int shift, String expectedResult){
        CaesarShiftCipher CSC = new CaesarShiftCipher();
        String result = CSC.CaesarShiftCipher(initialString,shift);
        Assertions.assertEquals(expectedResult,result);
    }

    @ParameterizedTest(name="string{0},shift{1}, result{2}")
    @CsvSource({"'abcd uvwxyz',0,'abcd uvwxyz'","'klmno',26,'klmno'","'klmno',-26,'klmno'"})
    public void CaesarNoShiftCases(String initialString, int shift, String expectedResult){
        CaesarShiftCipher CSC = new CaesarShiftCipher();
        String result = CSC.CaesarShiftCipher(initialString,shift);
        Assertions.assertEquals(expectedResult,result);
    }

    @ParameterizedTest(name="string{0},shift{1}, result{2}")
    @CsvSource({"' abcdef',1,' bcdefg'","'abcdef ',1,'bcdefg '","'uvwxyz',27,'vwxyza'","'uvwxyz',-25,'vwxyza'"})
    public void CaesarPlusOneCharShiftCases(String initialString, int shift, String expectedResult){
        CaesarShiftCipher CSC = new CaesarShiftCipher();
        String result = CSC.CaesarShiftCipher(initialString,shift);
        Assertions.assertEquals(expectedResult,result);
    }

    @ParameterizedTest(name="string{0},shift{1}, result{2}")
    @CsvSource({"'abcdef',-1,'zabcde'","'uvwxyz',-27,'tuvwxy'","'abcd',25,'zabc'"})
    public void CaesarMinusOneCharShiftCases(String initialString, int shift, String expectedResult){
        CaesarShiftCipher CSC = new CaesarShiftCipher();
        String result = CSC.CaesarShiftCipher(initialString,shift);
        Assertions.assertEquals(expectedResult,result);
    }

}

// test cases data {"initialString", shift, "shifted string"}
// edge cases
// {'',1,''}
// {' ',1,' '}
// {'abC',1,invalid}
// {'abc2',1,invalid}
// {'*abc',1,invalid}
// no shift
// {'klmno',0,''klmno''}
// {'abcd',26,'abcd'}
// {'uvwxyz',-26,'uvwxyz'}
// shift 1
// {' abcdef',1,' bcdefg'}
// {'abcdef ',1,'bcdefg '}
// {'uvwxyz',-25,'vwxyza'}
// {'uvwxyz',27,'vwxyza'}
// shift -1
// {'abcd',-1,'zabc'}
// {'abcd',25,'zabc'}
// {'abcd',-27,'zabc'}
// shift in range 2-24
// {'klmno',4,'opqrs'}






// {'uvwxyz',-27,'tuvwxy'}