package chem.util;

public class Agent {
	String type;
	AgentStat stat = AgentStat.hard; // def
	boolean dissat = true; // def
	double m = -1;
	
	public Agent() {
		
	}

	public Agent compare(Agent a, Agent b) {
		int a_ind = a.getType().length() - a.getType().indexOf('+');
		int b_ind = b.getType().length() - b.getType().indexOf('-');
		String a_t = a.getType().substring(0, a.getType().indexOf('+'));
		String b_t = b.getType().substring(0, b.getType().indexOf('-'));
		int gcd = gcd(a_ind, b_ind);
		String ans = "";
		if(b_ind / gcd > 1) 
			ans += "(" + a_t + ")" + (b_ind / gcd);
		else
			ans += a_t;
		if(a_ind / gcd > 1)
			ans += "(" + b_t + ")" + (a_ind / gcd);
		else
			ans += b_t;
		if(Agents.agents.containsKey(ans)) {
			return Agents.agents.get(ans);
		}else {
			return new Agent(ans, stat, dissat);
		}
	}
	 
	public Agent(String type, AgentStat stat, boolean dissat) {
		this.type = type;
		this.stat = stat;
		this.dissat = dissat;
	}
	public Agent(Agent a, double m) {
		this.type = a.getType();
		this.stat = a.getAgentStat();
		this.dissat = a.isDissat();
		this.m = m;
		
	}
	
	public void setM(double m) {
		this.m = m;
	}
	
	public void setStat(AgentStat a) {
		this.stat = a;
	}
	
	public void setDissat(boolean a) {
		this.dissat = a;
	}
	
	public Agent[] getIon() {
		return  ((this.stat == AgentStat.ion) ? new Agent[] {this} : Agents.ions.get(this));
	}
	
	public boolean empty() {
		return ((m == -1) ? true : false);
	}
	public double getM() {
		return m;
	}
	public String getType() {
		return type;
	}
	public AgentStat getAgentStat() {
		return stat;
	}
	public boolean isDissat() {
		return dissat;
	}
	public Agent[] react(Agent[] a) {
		return a;
	}
	private int gcd(int a, int b) {
		while(a > 0 && b > 0) {
			a %= b;
			int z = a;
			a = b;
			b = z;
		}
		return Math.max(a, b);
	}
}
