package tudelft.ghappy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;


public class GHappyTest {

    @ParameterizedTest (name="string={0}, result={1}")
    @CsvSource({"\"\", true", "\"a\", true","\"abcdxxyy\", true"})
    public void shortString(String initialString, Boolean expectedResult){
        GHappy gH = new GHappy();
        boolean result = gH.gHappy(initialString);
        Assertions.assertEquals(expectedResult,result);
    }

    @ParameterizedTest (name="string={0}, result={1}")
    @CsvSource({"\"g\", false", "\"agb\", false","\"gab\", false","\"abg\", false"})
    public void shortStringWithG(String initialString, Boolean expectedResult){
        GHappy gH = new GHappy();
        boolean result = gH.gHappy(initialString);
        Assertions.assertEquals(expectedResult,result);
    }

    @ParameterizedTest (name="string={0}, result={1}")
    @CsvSource({"\"gg\", true", "\"aggb\", true","\"abgg\", true","\"ggab\", true"})
    public void shortStringWithDoubleG(String initialString, Boolean expectedResult){
        GHappy gH = new GHappy();
        boolean result = gH.gHappy(initialString);
        Assertions.assertEquals(expectedResult,result);
    }

    @ParameterizedTest (name="string={0}, result={1}")
    @CsvSource({"\"ggg\", true", "\"agggb\", true","\"abggg\", true","\"gggab\", true"})
    public void shortStringWithTripleG(String initialString, Boolean expectedResult){
        GHappy gH = new GHappy();
        boolean result = gH.gHappy(initialString);
        Assertions.assertEquals(expectedResult,result);
    }

    @ParameterizedTest (name="string={0}, result={1}")
    @CsvSource({"\"agxxxggb\", false","\"gaxxggb\", false","\"bgaxxggb\", false","\"aagxxxbgg\", false", "\"aggxxxgb\", false","\"ggaxxgb\", false ","\"aaggxxxbg\", false" })
    public void shortStringWithCombinations(String initialString, Boolean expectedResult){
        GHappy gH = new GHappy();
        boolean result = gH.gHappy(initialString);
        Assertions.assertEquals(expectedResult,result);
    }


    //Parameters
          //      { "", true },
         //       { "a", true },
        //        { "abcdxxyy", true },
         //       { "g", false },
         //       { "agb", false },
         //       { "gab", false },
         //       { "abg", false },
         //       { "gg", true },
         //       { "aggb", true },
         //       { "ggab", true },
         //       { "abgg", true },
         //       { "ggg", true },
         //       { "agggb", true },
         //       { "gggab", true },
         //       { "abggg", true },
        //        { "agxxxggb", false },
        //        { "gaxxggb", false },
        //        { "bgaxxggb", false },
        //        { "aagxxxbgg", false },
        //        { "aggxxxgb", false },
         //       { "ggaxxgb", false },
        //        { "aaggxxxbg", false }





}
