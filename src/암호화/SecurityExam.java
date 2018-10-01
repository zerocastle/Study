package 암호화;

public class SecurityExam {

	public static void main(String[] args) throws Exception {

		SecurityUtil securityUtil = new SecurityUtil();
			
		String rtn1 = securityUtil.encryptSHA256("123456");
		/*test*/System.out.println(">" + rtn1);
		
		String rtn2 = securityUtil.encryptSHA256("hg741111#!");
		/*test*/System.out.println(">" + rtn2);
		
		if( rtn1.equals(rtn2) ){
			/*test*/System.out.println(">>> Equals!");
		}
		
	}
}