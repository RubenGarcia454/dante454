
//Database based on http://pokemontabletop.wikidot.com/dragon
public class Move 
{
	//Private data types are listed in the order they appear in the library.
	private String name;
	private String type;
	private String damage;
	private String frequency; //Frequency a pokemon could make an attack per turn
					          // Battle (once per battle) EOT (every other turn) 
	private String accuracy; //Must roll higher than this number to land
	private String range;
	private String fieldeffect;
	private String description; //Description is just a long string with an ending /n
	private String contest; //The effect of the move in a contest
	
	
	public Move(String n)
	{
		name = n;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
	}


	public String getDamage() {
		return damage;
	}


	public void setDamage(String damage) {
		this.damage = damage;
	}


	public String getFrequency() {
		return frequency;
	}


	public void setFrequency(String frequency) {
		this.frequency = frequency;
	}


	public String getAccuracy() {
		return accuracy;
	}


	public void setAccuracy(String accuracy) {
		this.accuracy = accuracy;
	}


	public String getRange() {
		return range;
	}


	public void setRange(String range) {
		this.range = range;
	}


	public String getFieldeffect() {
		return fieldeffect;
	}


	public void setFieldeffect(String fieldeffect) {
		this.fieldeffect = fieldeffect;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public String getContest() {
		return contest;
	}


	public void setContest(String contest) {
		this.contest = contest;
	}
	
	

}
