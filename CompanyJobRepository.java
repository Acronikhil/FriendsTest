package testjava;

public class CompanyJobRepository {
	static String getJobPrediction(int age, String highestQualification) {
		// defination
		try {
			if (!(age >= 19)) {
				throw new NotEligibleException("You are underage for any jab");
			} else if (age >= 21 && highestQualification.equals("B.E")) {
				return "We have openings for junior developer";
			} else if (age >= 26 && (highestQualification.equals("M.S") || highestQualification.equals("PhD"))) {
				return "We have openings for senior developer";
			} else if (age >= 19 && !(highestQualification.equals("M.S") || highestQualification.equals("PhD")
					|| highestQualification.equals("B.E"))) {
				throw new NotEligibleException("We do not have any job that matches your qualifications");
			} else {
				return "Sorry we have no openings for now";
			}
		} catch (NotEligibleException nee) {
			return nee.getMessage();
		}

	}

}
