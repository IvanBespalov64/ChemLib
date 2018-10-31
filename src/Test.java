import chem.lab.*;
import chem.util.*;
import chem.util.types.Salt;
import chem.tools.*;

public class Test {

	public static void main(String[] args) {
		Agents.init();
		System.out.println(new Agent().compare(Agents.NaCl.getKation(), Agents.NaOH.getAnion()).getType());
	}

}
