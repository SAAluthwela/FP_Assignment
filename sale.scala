import scala.math._

 object sale extends App{
  def purchase(x:Double)=x*0.6*24.95;
  def transport(x:Double)=3*50+(x-50)*0.75;
  def exp(x:Double)=purchase(x)+transport(x);
  println("Rounded value");
  println(math.round(exp(60)*100/100),"/=");//rounded value
  
}