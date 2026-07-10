/**
* Horizontal bar graph creation for integer values
*
* @author Nery Chapeton-Lamas <nery@miracosta.edu>
*
* @version 1.0
*/

public class BarGraph
{
	// CONSTANT VARIABLES
	public static final int  BLOCK_VALUE = 8;
	public static final char BLOCK_EIGTH_1 = '▏'; // 1/8 (eigth) block
	public static final char BLOCK_EIGTH_2 = '▎'; // 2/8 (quarter) block
	public static final char BLOCK_EIGTH_3 = '▍'; // 3/8 block
	public static final char BLOCK_EIGTH_4 = '▌'; // 4/8 (half) block
	public static final char BLOCK_EIGTH_5 = '▋'; // 5/8 block
	public static final char BLOCK_EIGTH_6 = '▊'; // 6/8 (three quarters) block
	public static final char BLOCK_EIGTH_7 = '▉'; // 7/8 block
	public static final char BLOCK_EIGTH_8 = '█'; // 8/8 (full) block

	// (public) STATIC METHODS
	
	/**
	 * Returns horizontal bar graph with value at end (graph and value separated by a space)
	 * 
	 * @param value number to base graph off of
	 * 
	 * @return String of complete horizontal bar graph with value at end (no new line)
	 */
	public static String getHorizontal(int value)
	{
		String bar = "";
		int length = value / 8;
		while (length > 0){
			bar = bar + BLOCK_EIGTH_8;
			length--;
		}
		int remainderBar;
		remainderBar = value % 8;
		if (remainderBar != 0){
			switch (remainderBar)
			{
				case 1:
					bar += BLOCK_EIGTH_1;
					break;
				case 2:
					bar += BLOCK_EIGTH_2;
					break;
				case 3:
					bar += BLOCK_EIGTH_3;
					break;
				case 4:
					bar += BLOCK_EIGTH_4;
					break;
				case 5:
					bar += BLOCK_EIGTH_5;
					break;
				case 6:
					bar += BLOCK_EIGTH_6;
					break;
				case 7:
					bar += BLOCK_EIGTH_7;
					break;
			}
			bar += value;
		}


		
		return bar;
	}
}