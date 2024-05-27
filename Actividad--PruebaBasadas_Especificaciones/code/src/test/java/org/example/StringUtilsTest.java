package org.example;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class StringUtilsTest {

    @Test
    void Ejercicio1(){
        assertThat(StringUtils.substringsBetween("axcaycazc","a","c")).isEqualTo(new String[] {"x","y","z"});
    }

    @Test
    void Ejercicio2_1(){
        assertThat(StringUtils.substringsBetween("","","")).isEqualTo(null);
    }


    @Test
    void Ejercicio2_2(){
        assertThat(StringUtils.substringsBetween(null,null,null)).isEqualTo(null);
    }

    @Test
    void Ejercicio2_3(){
        assertThat(StringUtils.substringsBetween(null,"","")).isEqualTo(null);
    }

    @Test
    void Ejercicio4(){
        assertThat(StringUtils.substringsBetween("a","a","a")).isEqualTo(new String[] {"a"});
    }

    @Test
    void simpleCase(){
        assertThat(StringUtils.substringsBetween("abcd","a","d")).isEqualTo(new String[] {"bc"});
    }

    @Test
    void manyStrings(){
        assertThat(StringUtils.substringsBetween("abcdabcdab","a","d")).isEqualTo(new String [] {"bc","bc"});
    }

    @Test
    void openAndCloseTagsThatAreLongerThanOneChar(){
        assertThat(StringUtils.substringsBetween("aabcddaabfddaab","aa","dd")).isEqualTo(new String [] {"bc", "bf"});
    }

}