package chem.util.types;

import chem.util.*;

public class Hydroxide extends Salt {
	static String type;
	static String prevail = "OH";

	public Hydroxide(String type, AgentStat stat, boolean dissat) {
		super(type, stat, dissat);
		this.type = type;
	}
	
	public static String getSubType() {
		/*if(Agents.getForce(this.getKation()) <= 8)
			return "Alkaline";*/
		return null;
	}
	
	public Agent[] react(Agent[] a) {
		return a;
	}

}
