/** Class that organizes gains used when assigning values to slots */
package frc.robot;

// This class only exists to create a more organized way of initializing PID values.

public class Gains {
  /*
  It's about drive
  It's about power
  We stay hungry
  We devour
  Put in the work
  Put in the hours
  and take whats ours
  */
  public final double kP;
  public final double kI;
  public final double kD;
  public final double kF;
  public final int kIzone;
  public final double kPeakOutput;

  public Gains(double _kP, double _kI, double _kD, double _kF, int _kIzone, double _kPeakOutput) {
    kP = _kP;
    kI = _kI;
    kD = _kD;
    kF = _kF;
    kIzone = _kIzone;
    kPeakOutput = _kPeakOutput;
  }
}
