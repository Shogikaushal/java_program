class ArithmaticOperatorEx1{
 int add(int a,int b){
	int addResult =a+b;
	return addResult;
			}

 int mul(int a,int b){
		int mulResult=a*b;
		return mulResult;
			}

 int sub(int a,int b){
	int subResult=a-b;
	return subResult;
			}

 int div(int a,int b){
	int divResult=a/b;
	return divResult;
			}
	
public static void main(String [] arg){
	ArithmaticOperatorEx1 ex=new ArithmaticOperatorEx1();
		

	
	System.out.println("addResult :"+ex.add(10,20));
	
	
	System.out.println("mulResult :"+ex.mul(10,20));
	
	
	System.out.println("divResult :"+ex.div(10,20));
	
	
	System.out.println("subResult :"+ex.sub(10,20));
	}


}