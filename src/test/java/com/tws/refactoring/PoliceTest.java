package com.tws.refactoring;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PoliceTest {
    @Test
    public void should_return_TRUE_when_Driver_age_over_18(){
        //given
        Driver driver = new Driver(20);
        Police police = new Police();
        //when
        boolean isstatus=police.checkDriver(driver);
        //then
        Assertions.assertEquals(true,isstatus);
    }
    @Test
    public void should_return_false_when_Driver_age_over_16(){
        //given
        Driver driver = new Driver(16);
        Police police = new Police();
        //when
        boolean isstatus=police.checkDriver(driver);
        //then
        Assertions.assertEquals(false,isstatus);
    }
}
