package chem.util;

import java.util.HashMap;
import java.util.List;

import chem.util.types.*;

public abstract class Agents {
	//Agents
	public static HashMap <Agent, Double> mol = new HashMap<Agent, Double>();
	public static HashMap <Agent, Integer> force = new HashMap<Agent, Integer>();
	public static HashMap <Agent, Agent[]> ions = new HashMap<Agent, Agent[]>();
	public static HashMap <String, Agent> agents = new HashMap<String, Agent>(); 
	
	public static Alkaline Li = new Alkaline("Li");
	public static Alkaline Rb = new Alkaline("Rb");
	public static Alkaline K = new Alkaline("K");
	public static Metal Ba = new Metal("Ba", AgentStat.hard);
	public static Metal Sr = new Metal("Sr", AgentStat.hard);
	public static Metal Ca = new Metal("Ca", AgentStat.hard);
	public static Alkaline Na = new Alkaline("Na");
	public static Metal Al = new Metal("Al", AgentStat.hard);
	public static Metal Mg = new Metal("Mg", AgentStat.hard);
	public static Metal Cr = new Metal("Cr", AgentStat.hard);
	public static Metal Zn = new Metal("Zn", AgentStat.hard);
	public static Metal Fe = new Metal("Fe", AgentStat.hard);
	public static Metal Cd = new Metal("Cd", AgentStat.hard);
	public static Metal Co = new Metal("Co", AgentStat.hard);
	public static Metal Ni = new Metal("Ni", AgentStat.hard);
	public static Metal Sn = new Metal("Sn", AgentStat.hard);
	public static Metal Pb = new Metal("Pb", AgentStat.hard);
	public static Metal H2 = new Metal("H2", AgentStat.gas);
	public static Metal Sb = new Metal("Sb", AgentStat.hard);
	public static Metal Bi = new Metal("Bi", AgentStat.hard);
	public static Metal Cu = new Metal("Cu", AgentStat.hard);
	public static Metal Hg = new Metal("Hg", AgentStat.liquid);
	public static Metal Ag = new Metal("Ag", AgentStat.hard);
	public static Metal Pd = new Metal("Pd", AgentStat.hard);
	public static Metal Pt = new Metal("Pt", AgentStat.hard);
	public static Metal Au = new Metal("Au", AgentStat.hard);

	public static Agent Li_p = new Agent("Li+", AgentStat.ion, true, false);
	public static Agent Rb_p = new Agent("Rb+", AgentStat.ion, true, false);
	public static Agent K_p = new Agent("K+", AgentStat.ion, true, false);
	public static Agent Ba_2p = new Agent("Ba++", AgentStat.ion, true, false);
	public static Agent Sr_2p = new Agent("Sr++", AgentStat.ion, true, false);
	public static Agent Ca_2p = new Agent("Ca++", AgentStat.ion, true, false);
	public static Agent Na_p = new Agent("Na+", AgentStat.ion, true, false);
	public static Agent Al_3p = new Agent("Al+++", AgentStat.ion, true, false);
	public static Agent Mg_2p = new Agent("Mg++", AgentStat.ion, true, false);
	public static Agent Cr_3p = new Agent("Cr+++", AgentStat.ion, true, false);
	public static Agent Zn_2p = new Agent("Zn++", AgentStat.ion, true, false);
	public static Agent Fe_2p = new Agent("Fe++", AgentStat.ion, true, false);
	public static Agent Fe_3p = new Agent("Fe+++", AgentStat.ion, true, false);
	public static Agent Cd_2p = new Agent("Cd++", AgentStat.ion, true, false);
	public static Agent Co_2p = new Agent("Co++", AgentStat.ion, true, false);
	public static Agent Ni_2p = new Agent("Ni++", AgentStat.ion, true, false);
	public static Agent Sn_2p = new Agent("Sn++", AgentStat.ion, true, false);
	public static Agent Pb_4p = new Agent("Pb++++", AgentStat.ion, true, false);
	public static Agent Pb_2p = new Agent("Pb++", AgentStat.ion, true, false);
	public static Agent H_p = new Agent("H+", AgentStat.ion, false, false);
	public static Agent H_n = new Agent("H-", AgentStat.ion, false, false);
	public static Agent Sb_3p = new Agent("Sb+++", AgentStat.ion, true, false);
	public static Agent Bi_3p = new Agent("Bi+++", AgentStat.ion, true, false);
	public static Agent Bi_5p = new Agent("Bi+++++", AgentStat.ion, true, false);
	public static Agent Cu_2p = new Agent("Cu++", AgentStat.ion, true, false);
	public static Agent Cu_p = new Agent("Cu+", AgentStat.ion, true, false);
	public static Agent Hg_2p = new Agent("Hg++", AgentStat.ion, true, false);
	public static Agent Ag_p = new Agent("Ag+", AgentStat.ion, true, false);
	public static Agent Pd_p = new Agent("Pd+", AgentStat.ion, true, false);
	public static Agent Pd_2p = new Agent("Pd++", AgentStat.ion, true, false);
	public static Agent Pd_3p = new Agent("Pd+++", AgentStat.ion, true, false);
	public static Agent Pd_4p = new Agent("Pd++++", AgentStat.ion, true, false);
	public static Agent Pt_2p = new Agent("Pt++", AgentStat.ion, true, false);
	public static Agent Pt_4p = new Agent("Pt++++", AgentStat.ion, true, false);
	public static Agent Au_p = new Agent("Au+", AgentStat.ion, true, false);

	
	public static Salt NaCl = new Salt("NaCl", AgentStat.hard, true, new Pair());
	//public static Acid HCl = new Acid("HCl", AgentStat.liquid, true, Agents.Cl_n);
	public static Agent H2O = new Agent("H2O", AgentStat.liquid, false);
	
	
	public static Hydroxide NaOH = new Hydroxide("NaOH", AgentStat.hard, true, Agents.Na_p);
	
	//Agents' ions
	public static Agent Cl_n = new Agent("Cl-", AgentStat.ion, true, false);
	public static Agent OH_n = new Agent("OH-", AgentStat.ion, true, true);
	
	public static void init() {
		NaCl.setDissat(new Pair(Na_p, Cl_n));
		NaOH.setDissat(new Pair(Na_p, OH_n));
		
		mol.put(NaCl, 58.5);
		mol.put(Na, 23.0);
		mol.put(H2, 2.0);
		mol.put(H2O, 18.0);
		
		force.put(Li, 0); ions.put(Li, new Agent[] {Li_p});
		force.put(Rb, 1); ions.put(Rb, new Agent[] {Rb_p});
		force.put(K, 2); ions.put(K, new Agent[] {K_p});
		force.put(Ba, 3); ions.put(Ba, new Agent[] {Ba_2p});
		force.put(Sr, 4); ions.put(Sr, new Agent[] {Sr_2p});
		force.put(Ca, 5); ions.put(Ca, new Agent[] {Ca_2p});
		force.put(Na, 6); ions.put(Na, new Agent[] {Na_p});
		force.put(Al, 7); ions.put(Al, new Agent[] {Al_3p});
		force.put(Mg, 8); ions.put(Mg, new Agent[] {Mg_2p});
		force.put(Cr, 9); ions.put(Cr, new Agent[] {Cr_3p});
		force.put(Zn, 10); ions.put(Zn, new Agent[] {Zn_2p});
		force.put(Fe, 11); ions.put(Fe, new Agent[] {Fe_2p, Fe_3p});
		force.put(Cd, 12); ions.put(Cd, new Agent[] {Cd_2p});
		force.put(Co, 13); ions.put(Co, new Agent[] {Co_2p});
		force.put(Ni, 14); ions.put(Ni, new Agent[] {Ni_2p});
		force.put(Sn, 15); ions.put(Sn, new Agent[] {Sn_2p});
		force.put(Pb, 16); ions.put(Pb, new Agent[] {Pb_4p, Pb_2p});
		force.put(H2, 17); ions.put(H2, new Agent[] {H_p, H_n});
		force.put(Sb, 18); ions.put(Sb, new Agent[] {Sb_3p});
		force.put(Bi, 19); ions.put(Bi, new Agent[] {Bi_3p, Bi_5p});
		force.put(Cu, 20); ions.put(Cu, new Agent[] {Cu_p, Cu_2p});
		force.put(Hg, 21); ions.put(Hg, new Agent[] {Hg_2p});
		force.put(Ag, 22); ions.put(Ag, new Agent[] {Ag_p});
		force.put(Pd, 23); ions.put(Pd, new Agent[] {Pd_p, Pd_2p, Pd_3p, Pd_4p});
		force.put(Pt, 24); ions.put(Pt, new Agent[] {Pt_2p, Pt_4p});
		force.put(Au, 25); ions.put(Au, new Agent[] {Au_p});
						   
		agents.put(NaCl.getType(), NaCl);
		agents.put(NaOH.getType(), NaOH);
		//agents.put(HCl.getType(), HCl);
		agents.put(H2.getType(), H2);
		
		agents.put(Li.getType(), Li);
		agents.put(Rb.getType(), Rb);
		agents.put(K.getType(), K);
		agents.put(Ba.getType(), Ba);
		agents.put(Sr.getType(), Sr);
		agents.put(Ca.getType(), Ca);
		agents.put(Na.getType(), Na);
		agents.put(Al.getType(), Al);
		agents.put(Mg.getType(), Mg);
		agents.put(Cr.getType(), Cr);
		agents.put(Zn.getType(), Zn);
		agents.put(Fe.getType(), Fe);
		agents.put(Cd.getType(), Cd);
		agents.put(Co.getType(), Co);
		agents.put(Ni.getType(), Ni);
		agents.put(Sn.getType(), Sn);
		agents.put(Pb.getType(), Pb);
		agents.put(H2.getType(), H2);
		agents.put(Sb.getType(), Sb);
		agents.put(Bi.getType(), Bi);
		agents.put(Cu.getType(), Cu);
		agents.put(Hg.getType(), Hg);
		agents.put(Ag.getType(), Ag);
		agents.put(Pd.getType(), Pd);
		agents.put(Pt.getType(), Pt);
		agents.put(Au.getType(), Au);
	}
	
	public static int getForce(Agent a) {
		if(force.containsKey(a))
			return force.get(a);
		else 
			return -1;
	}
	
	public static double getMol(Agent a) {
		double n = a.getM() / mol.get(a);
		return n;
	}
	
	public static boolean isStronger(Agent a, Agent b) {
		return force.get(a) > force.get(b);
	}
	
}
