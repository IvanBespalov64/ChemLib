package chem.lab;

import java.util.ArrayList;
import java.util.HashMap;

import chem.tools.Tool;
import chem.util.*;

public class Lab {
	Temp def;
	Atmos cur_atmos;
	public static ArrayList<Agent> atmos = new ArrayList<>();
	public static HashMap<String, Tool> tools = new HashMap<>();
	public Lab() {
		Agents.init();
	}
	public Lab(Temp cur) {
		def = cur;
		Agents.init();
	}
	public Lab(Atmos cur) {
		cur_atmos = cur;
		Agents.init();
	}
	public Lab(Atmos a, Temp b) {
		cur_atmos = a;
		def = b;
		Agents.init();
	}
	public void addTool(String key, Tool t) {
		tools.put(key, t);
	}
	public Tool getTool(String key) {
		return tools.get(key);
	}
	public static void putInAtmos(Agent[] a) {
		for(int i = 0; i < a.length; i++)
			atmos.add(a[i]);
	}
	public void updateTemp(double val) {
		def.upd(val);
	}
	public void setTemp(double val) {
		def.setVal(val);
	}
	public void setTemp(Temp a) {
		def = a;
	}
	public void setAtmos(Atmos a) {
		cur_atmos = a;
	}
}
