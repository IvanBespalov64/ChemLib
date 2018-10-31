package chem.util.types;

import java.util.ArrayList;

import chem.util.*;

public class Alkaline extends Metal {

	String type;
	
	public Alkaline(String type) {
		super(type, AgentStat.hard);
		this.type = type;
	}
	
	public Agent[] react(Agent[] a) {
		ArrayList<Agent> res = new ArrayList<>();
		for(Agent b : a) {
			if(b == Agents.H2O) {
				return new Agent().getHydroxide(this).react(a);
			}
			/*if(b instanceof Hydroxide && b.getSubType().equals("Amphoteric")) {
				
			}*/
		}
		return (Agent[]) res.toArray();
	}

}
