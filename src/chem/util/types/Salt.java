package chem.util.types;

import java.util.HashMap;

import chem.util.*;

public class Salt extends NonMetal{
	
	String type;
	AgentStat stat;
	boolean dissat;
	public Pair<Agent, Agent> dissat_p;

	public Salt(String type, AgentStat stat, boolean dissat, Pair<Agent, Agent> dissat_p) {
		super(type, stat, dissat);
		this.type = type;
		this.stat = stat;
		this.dissat = dissat;
		this.dissat_p = dissat_p;
	}
	
	public void setKatoin(Agent a) {
		this.dissat_p.a = a;
	}
	
	public void setAnion(Agent a) {
		this.dissat_p.b = a;
	}
	
	public void setDissat(Pair<Agent, Agent> a) {
		this.dissat_p = a;
	}
	
	public Agent getKation() {
		return dissat_p.a;
	} 
	public Agent getAnion() {
		return dissat_p.b;
	}
	
}
