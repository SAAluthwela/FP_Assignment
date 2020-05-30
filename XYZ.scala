object XYZ extends App{
    
       
    
    def regular(rwh:Int):Int ={
        rwh*150;
     //rwh=regular work hours
    }
    def ot(owh:Int):Int ={
        owh*75;
    //owh=overtime work hours 
   }
    def income(rwh:Int,owh:Int):Int ={
        regular(rwh) + ot(owh);
    }
    def finalSalary(h1:Int,h2:Int):Double ={
        
        //total income multiply by 0.9 as 10% reduce from 
        // salary for Tax payment
        //assume that 4 weeks for month
        //to get the monthly salary multiply by 4
       
        (income(h1,h2) *0.9)*4;
    }
 
    printf("Rs:%.2f/=",finalSalary(40,20));
   
}  