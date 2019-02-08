package colorsComparison;

public class Colors {

	public static double colorDifference(Colors Color1, Colors Color2) {
		double colorDifference = Math
				.sqrt(2 * Math.pow(Color1.getRedDecimal() - Color2.getRedDecimal(), 2)
						+ 4 * Math.pow(Color1.getGreenDecimal() - Color2.getGreenDecimal(), 2)
						+ 3 * Math.pow(Color1.getBlueDecimal() - Color2.getBlueDecimal(),
								2)
						+ (Color1.getRedDecimal() + Color2.getRedDecimal()) / 2
								* (Math.pow(Color1.getRedDecimal() - Color2.getRedDecimal(), 2)
										- Math.pow(Color1.getBlueDecimal() - Color2.getBlueDecimal(), 2))
								/ 256);
		return Math.round(colorDifference);
	}

	int redDecimal;
	int greenDecimal;

	int blueDecimal;

	public Colors(int red, int green, int blue) {
		redDecimal = red;
		greenDecimal = green;
		blueDecimal = blue;
	}

	public int getBlueDecimal() {
		return blueDecimal;
	}

	public int getGreenDecimal() {
		return greenDecimal;
	}

	public int getRedDecimal() {
		return redDecimal;
	}

	public double luminosity() {
		double lumin = (.299 * redDecimal + .587 * greenDecimal + .114 * blueDecimal) / 255;
		return lumin;
	}

	public void setBlueDecimal(int blueDecimal) {
		this.blueDecimal = blueDecimal;
	}

	public void setGreenDecimal(int greenDecimal) {
		this.greenDecimal = greenDecimal;
	}

	public void setRedDecimal(int redDecimal) {
		this.redDecimal = redDecimal;
	}

}
