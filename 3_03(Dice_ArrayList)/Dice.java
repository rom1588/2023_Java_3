import java.util.Random;

public class Dice{
	private Random random = new Random();
	private int value = 1;
	public Dice(){
	}
	public void cast(){
		//this.value‚É1‚©‚ç6‚Ì®”’l‚ğƒ‰ƒ“ƒ_ƒ€‚ÅŠi”[‚·‚é
		this.value = this.random.nextInt(6) + 1;
	}
	public int getValue(){
		return this.value;
	}
}