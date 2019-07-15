package com.tws.refactoring;

public class Police {
    private static int supAge = 18;
    public boolean checkDriver(Driver driver) {
//        if(driver.age >= 18) return true;
//        else return false;
        return driver.getAge()>= Police.supAge?true:false;
    }
}
