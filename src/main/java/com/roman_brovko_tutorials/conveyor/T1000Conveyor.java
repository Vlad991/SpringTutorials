package com.roman_brovko_tutorials.conveyor;

import com.roman_brovko_tutorials.interfaces.Robot;
import com.roman_brovko_tutorials.interfaces.RobotConveyor;

public abstract class T1000Conveyor implements RobotConveyor {

    @Override
    public abstract Robot createRobot();
}
