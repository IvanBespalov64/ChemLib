package chem.util.types;

import java.util.HashMap;

import chem.util.*;

public class Salt extends NonMetal{
	
	String type;
	AgentStat stat;
	boolean dissat;

	public Salt(String type, AgentStat stat, boolean dissat) {
		super(type, stat, dissat);
		this.type = type;
		this.stat = stat;
		this.dissat = dissat;
	}

	public Agent getKation() {
		String tmp = type;
		tmp.replaceAll(")", "");
		tmp.replaceAll("(", "");
		for (HashMap.Entry<Agent, Agent[]> pair: Agents.ions.entrySet())
	    {
			if(tmp.contains(pair.getKey().getType()) && tmp.indexOf(pair.getKey().getType()) == 0) {
				//foo:
				int kat_ind, an_ind;
				String kation = tmp.substring(0, pair.getKey().getType().length());
				kat_ind = Integer.parseInt(tmp.substring(pair.getKey().getType().length(), pair.getKey().getType().length() + 1));
				
			}
	    }
		return null;
	} 
	
}
