import chem.lab.*;
import chem.util.*;
import chem.tools.*;

public class Test {

	public static void main(String[] args) {
		/*Lab l = new Lab();
		l.setTemp(new Temp('K', 273));
		l.setAtmos(Atmos.Air);
		l.addTool("Gl", new Glass());
		l.getTool("Gl").put(new Agent[] {Agents.H2O, Agents.NaOH, Agents.HCl});		
		for(int i = 0; i < l.tools.get(0).getIn().size(); i++) {
			System.out.print(l.tools.get(0).getIn().get(i).getType() + ", ");
		}*/
		System.out.println(new Agent().compare(Agents.Al_3p, Agents.Cl_n).getType());
	}

}
