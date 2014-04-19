package questboard.app;

/**
 * Created by Asdra on 4/19/14.
 */

public class Quest
{
	private String title;
	private int alignment;
	private String description;
	private double quest_location_x, quest_location_y;
	private String questGiverName;
	private double quest_giver_location_x, quest_giver_location_y;

	public Quest()
	{
		title = "";
		alignment = 0;//default to neutral
		description = "";
		quest_location_x = 0;
		quest_location_y = 0;
		questGiverName = "Miracle Max";
		quest_giver_location_x = 25;
		quest_giver_location_y = 25;
	}

	public Quest(String quest, int align, String desc, double q_loc_x, double q_loc_y,
				 String npc_name, double npc_loc_x, double npc_loc_y)
	{
		title = quest;
		alignment = align;
		description = desc;
		quest_location_x = q_loc_x;
		quest_location_y = q_loc_y;
		questGiverName = npc_name;
		quest_giver_location_x = npc_loc_x;
		quest_giver_location_y = npc_loc_y;
	}

	public String getQuestTitle() {return title;}

	public String getQuestAlignment()
	{
		if(this.alignment == 0)
			return "Neutral";
		else if(this.alignment == 1)
			return "Good";
		else
			return "Evil";
	}

	public String getQuestDescription() {return description;}

	public String getQuestLocation()
	{
		String x = String.valueOf(quest_location_x);
		String y = String.valueOf(quest_location_y);

		return x + ", " + y;
		//finish?
	}

	public String getQuestGiverName() {return questGiverName;}

	public String getQuestGiverLocation()
	{
		String x = String.valueOf(quest_giver_location_x);
		String y = String.valueOf(quest_giver_location_y);

		return x + ", " + y;
		//finish?
	}

	public void setQuestTitle(String new_title) {title = new_title;}

	public void setQuestAlignment (String new_alignment)
	{
		if(new_alignment.equalsIgnoreCase("neutral"))
			alignment = 0;
		else if(new_alignment.equalsIgnoreCase("good"))
			alignment = 1;
		else if(new_alignment.equalsIgnoreCase("evil"))
			alignment = 2;

		//finish?
	}

	public void setQuestDescription(String desc) {description = desc;}

	public void setQuestLocation(double x, double y)
	{
		quest_location_x = x;
		quest_location_y = y;
	}

	public void setQuestGiverName(String name) {questGiverName = name;}

	public void setQuestGiverLocation(double x, double y)
	{
		quest_giver_location_x = x;
		quest_giver_location_y = y;
	}

	//finish?
}
