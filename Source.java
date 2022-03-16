package testjava;

public class Source {

	public String searchForJob(int age, String highestQualification){
		try{
		if(age >= 200 || age <= 0){
			throw new NotEligibleException("The age entered is not typical for a human being");
		}
		else{
			return	CompanyJobRepository.getJobPrediction(age, highestQualification);
		}
		}catch(NotEligibleException nee){
			return nee.getMessage();
		}

	}
	
	public static void main(String args[]) throws Exception {
		Source s = new Source();
//		Activity a = new Activity("Nikhil","Dubey","+");
//		System.out.println(s.doOperation(a));
		
		System.out.println(s.searchForJob(15, "B.E"));
		System.out.println(s.searchForJob(26, "B.E"));
		System.out.println(s.searchForJob(21, "BTech"));
		System.out.println(s.searchForJob(40, "M.S"));
		System.out.println(s.searchForJob(26, "M.S"));
		System.out.println(s.searchForJob(2100, "PhD"));
		
		
		
		
	}
	
}
