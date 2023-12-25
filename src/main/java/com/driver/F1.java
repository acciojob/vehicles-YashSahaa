package com.driver;

public class F1 extends Car {

    public F1(String name, boolean isManual) {
        //Use arbitrary values for parameters which are not mentioned
        super(name,4,2,6,isManual,"Racing",2);
    }

    public void accelerate(int rate){
        int newSpeed = 0; //set the value of new speed by using currentSpeed and rate
        /**
         * speed 0: gear 1
         * speed 1-50: gear 1
         * speed 51-100: gear 2
         * speed 101-150: gear 3
         * speed 151-200: gear 4
         * speed 201-250: gear 5
         * speed more than 250: gear 6
         */
        newSpeed = super.getCurrentSpeed()+rate;
        if(newSpeed == 0) {
            //Stop the car, set gear as 1
            super.changeGear(1);
            super.stop();
        } else if (newSpeed<51) {
            super.changeGear(1);
        } else if (newSpeed<101) {
            super.changeGear(2);
        } else if (newSpeed<151) {
            super.changeGear(3);
        }else if (newSpeed<201) {
            super.changeGear(4);
        }else if (newSpeed<251) {
            super.changeGear(5);
        }else {
            super.changeGear(6);
        }
        //for all other cases, change the gear accordingly


        if(newSpeed > 0) {
            changeSpeed(newSpeed, getCurrentDirection());
        }
    }
}
