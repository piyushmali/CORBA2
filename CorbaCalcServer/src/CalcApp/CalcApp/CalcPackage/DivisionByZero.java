package CalcApp.CalcPackage;


/**
* CalcApp/CalcPackage/DivisionByZero.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from Calc.idl
* Tuesday, 28 September, 2021 10:25:13 PM IST
*/

public final class DivisionByZero extends org.omg.CORBA.UserException
{

  public DivisionByZero ()
  {
    super(DivisionByZeroHelper.id());
  } // ctor


  public DivisionByZero (String $reason)
  {
    super(DivisionByZeroHelper.id() + "  " + $reason);
  } // ctor

} // class DivisionByZero
