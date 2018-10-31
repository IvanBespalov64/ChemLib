package chem.util.types;

import chem.util.*;

public class Hydroxide extends Salt {
	String type;
	
	int pH = 14;

	public Hydroxide(String type, AgentStat stat, boolean dissat, Agent base_ion) {
		super(type, stat, dissat, new Pair(base_ion, Agents.OH_n));
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
