package com.spring_core.conveyor;

import com.spring_core.interfaces.Robot;
import com.spring_core.interfaces.RobotConveyor;

public abstract class T1000Conveyor implements RobotConveyor {

    @Override
    public abstract Robot createRobot();
}
