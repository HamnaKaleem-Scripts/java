public class h_task3{
	public static void main(String[] args ){
		 double payAmount=20000.00;
		 int payperiod=12;
		 double annualPay=myFunc(payAmount,payperiod);
		 System.out.println ("annual pay is : " + annualPay);
		
	}
	public static double myFunc(double payAmount,int payperiod){
		return payAmount*payperiod;
	}
}