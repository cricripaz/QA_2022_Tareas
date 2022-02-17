package test_tarea_16_02;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import tarea_16_02.DateUtils;

public class DateTest {


    @ParameterizedTest
    @CsvSource({
            "31,marzo,2022, 1 abril 2022",
            "29,julio,2012, 30 julio 2012",
            "1,fevrero,2012, mes incorrecto",
            "-20,noviembre,2011, dia incorrecto",
            "5,febrero,9999, gestion incorrecta",
            // +2 datos incorrectos
            "0,noviembree,2020, ingresar nuevos datos"
    })
    public void verifyDate(int day, String month, int year, String expectedResult){
        DateUtils dateUtils = new DateUtils();
        String actualResult = dateUtils.getDate(day, month, year);
        Assertions.assertEquals(expectedResult,actualResult,"ERROR el mensaje es incorrecto");
    }
}