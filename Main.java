package testMain;

import java.io.*;

import utils.Contexte;
import utils.IGRobot;
import utils.Initialiser;
import utils.Programme;
import utils.Robot;
import utils.Terminal;
import utils.Terrain;

public class Main {
	public static void main(String[] args) throws Exception {
		
		Contexte ctx = Initialiser.initialiserContexte();
		Terrain terMio =Initialiser.initialiserTerrain(ctx);
		Programme prg = Initialiser.initialiserProgramme();
		Robot rbt = new Robot();
		
		IGRobot igr = new IGRobot();
		igr.initialiser(terMio.getTerrain());
		//igr.associerCharImage('A', "r-robot-ter.png");
		rbt.ingressoRobot(terMio);
		
		igr.afficher();
		terMio.AfficheTerrain();
		
		//il rpogramma finisce se nn ci sono + $
		//nn funziona
		//prg.setTerminerSiplusde$(true);
		prg.executerProgramme(prg, ctx, rbt, terMio, igr);
		
		

	}

}
