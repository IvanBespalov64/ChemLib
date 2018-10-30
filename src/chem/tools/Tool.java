package chem.tools;

import java.util.ArrayList;

import chem.util.Agent;

public class Tool {
	public static ArrayList<Agent> in = new ArrayList<>();
	public Tool() {
		
	}
	public void put(Agent a) {
		in.add(a);
	}
	public ArrayList<Agent> getIn(){
		return in;
	}
	public void put(Agent[] a) {
		for(int i = 0; i < a.length; i++)
			in.add(a[i]);
	}
}
