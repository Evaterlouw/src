package Assignment1;


public class MainSIQR
	{
		/// DEFINIEREN VAN MODEL PARAMETERS
		// Model paramters
		private static int population_size = 100; // grootte van de population
		private static double beta = 0.2; // transitie rate naar besmet.
		private static double alpha = 0.25; // is infected naar quarantined.
		private static double gamma = 0.005; // is de recorvery rate
		private static double delta = 0.005; // is de death rate

		private static int days = 365; // aantal dagen in horizon.

		// initiele waarden van fracties.
		private static double S = 1.0; // Fractie besmetbare mensen
		private static double I = 1.0 / population_size; // Fractie besmette mensen
		private static double Q = 0.0; // Fractie mensen in quarantine
		private static double R = 0.0; // Fractie herstelde of overleden mense

		public static void main (String[]args){
		double[] output = getSIQRPerformance();
		System.out.println("Final size: " + output[0]);
		System.out.println("Deceased: " + output[1]);

			System.out.println("hoi");

		}

		public static double[] getSIQRPerformance () {
			double[] output = new double[2];

			for (int day = 1; day <= days; day++) {
				double contactRate = 5.0; // aantal contacten pp
				double contacts = contactRate * S; // Contacten die resulteren in besmetting
				double transmission = beta * contacts * I; //

			}
			return output;
		}

}

