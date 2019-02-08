package colorsComparison;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Collections;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.UIManager;
import javax.swing.border.TitledBorder;

public class ComparisonFrame extends JFrame {

	private JTextField hexTripField;
	Colors userColor = new Colors(0, 0, 0);
	private JTextPane chosenColor;
	JPanel singMatchPanel = new JPanel();
	JLabel singMatchLabel = new JLabel("red");
	JPanel avgMatchPanel = new JPanel();
	JLabel avgMatchLabel = new JLabel("red");
	JLabel best2label = new JLabel("Next best");
	JLabel best3label = new JLabel("Next best");
	JLabel best4label = new JLabel("Next best");
	JLabel best5label = new JLabel("Next best");
	JLabel best6label = new JLabel("Next best");

	public ComparisonFrame() {

		// shades of red
		Colors red = new Colors(255, 0, 0);
		Colors geraldine = new Colors(254, 133, 133);
		Colors rosewood = new Colors(82, 0, 0);
		Colors torchRed = new Colors(254, 26, 26);
		Colors guardsmanRed = new Colors(187, 0, 0);
		Colors bittersweet = new Colors(254, 92, 92);
		Colors monza = new Colors(220, 0, 0);
		Colors lonestar = new Colors(107, 0, 0);
		Colors redOrange = new Colors(254, 54, 54);
		Colors sunsetOrange = new Colors(254, 76, 76);

		ArrayList<Colors> redShades = new ArrayList<Colors>();
		redShades.add(red);
		redShades.add(geraldine);
		redShades.add(rosewood);
		redShades.add(torchRed);
		redShades.add(guardsmanRed);
		redShades.add(bittersweet);
		redShades.add(monza);
		redShades.add(lonestar);
		redShades.add(redOrange);
		redShades.add(sunsetOrange);

		// shades of orange
		Colors orange = new Colors(255, 127, 0);
		Colors contessa = new Colors(197, 111, 89);
		Colors apricotPeach = new Colors(252, 204, 169);
		Colors hitPink = new Colors(255, 165, 120);
		Colors diSerria = new Colors(221, 162, 102);
		Colors carrotOrange = new Colors(234, 136, 37);
		Colors paarl = new Colors(172, 83, 48);
		Colors desert = new Colors(185, 99, 32);
		Colors ochre = new Colors(203, 132, 33);
		Colors koromiko = new Colors(252, 188, 110);

		ArrayList<Colors> orangeShades = new ArrayList<Colors>();
		orangeShades.add(orange);
		orangeShades.add(contessa);
		orangeShades.add(apricotPeach);
		orangeShades.add(hitPink);
		orangeShades.add(diSerria);
		orangeShades.add(carrotOrange);
		orangeShades.add(paarl);
		orangeShades.add(desert);
		orangeShades.add(ochre);
		orangeShades.add(koromiko);

		// shades of yellow
		Colors yellow = new Colors(255, 255, 0);
		Colors gamboge = new Colors(239, 155, 15);
		Colors schoolBusYellow = new Colors(255, 216, 0);
		Colors kournikova = new Colors(255, 238, 117);
		Colors selectiveYellow = new Colors(255, 186, 0);
		Colors schoolBusYellow2 = new Colors(255, 223, 0);
		Colors parisDaisy = new Colors(255, 247, 125);
		Colors lemonChiffon = new Colors(255, 250, 205);
		Colors amber = new Colors(255, 191, 9);

		ArrayList<Colors> yellowShades = new ArrayList<Colors>();
		yellowShades.add(yellow);
		yellowShades.add(gamboge);
		yellowShades.add(schoolBusYellow);
		yellowShades.add(kournikova);
		yellowShades.add(selectiveYellow);
		yellowShades.add(schoolBusYellow2);
		yellowShades.add(parisDaisy);
		yellowShades.add(lemonChiffon);
		yellowShades.add(amber);

		// shades of green
		Colors green = new Colors(0, 128, 0);
		Colors mintGreen = new Colors(157, 255, 137);
		Colors malachite = new Colors(0, 188, 34);
		Colors springGreen = new Colors(0, 226, 120);
		Colors laPalma = new Colors(44, 175, 30);
		Colors screaminGreen = new Colors(126, 244, 130);
		Colors lima = new Colors(118, 220, 20);
		Colors malachite2 = new Colors(28, 239, 91);
		Colors salem = new Colors(8, 120, 41);
		Colors harlequin = new Colors(59, 216, 13);

		ArrayList<Colors> greenShades = new ArrayList<Colors>();
		greenShades.add(green);
		greenShades.add(mintGreen);
		greenShades.add(malachite);
		greenShades.add(springGreen);
		greenShades.add(laPalma);
		greenShades.add(screaminGreen);
		greenShades.add(lima);
		greenShades.add(malachite2);
		greenShades.add(salem);
		greenShades.add(harlequin);

		// shades of cyan
		Colors cyan = new Colors(0, 255, 255);
		Colors elm = new Colors(35, 128, 126);
		Colors aquamarine = new Colors(74, 252, 254);
		Colors malibu = new Colors(85, 218, 253);
		Colors bostonBlue = new Colors(46, 149, 180);
		Colors viking = new Colors(89, 211, 200);
		Colors aquamarine2 = new Colors(65, 255, 201);
		Colors matisse = new Colors(29, 119, 145);
		Colors frenchPass = new Colors(178, 254, 254);
		Colors puertoRico = new Colors(65, 187, 172);

		ArrayList<Colors> cyanShades = new ArrayList<Colors>();
		cyanShades.add(cyan);
		cyanShades.add(elm);
		cyanShades.add(aquamarine);
		cyanShades.add(malibu);
		cyanShades.add(bostonBlue);
		cyanShades.add(viking);
		cyanShades.add(aquamarine2);
		cyanShades.add(matisse);
		cyanShades.add(frenchPass);
		cyanShades.add(puertoRico);

		// shades of blue
		Colors blue = new Colors(0, 0, 255);
		Colors malibu2 = new Colors(136, 170, 255);
		Colors darkBlue = new Colors(17, 0, 187);
		Colors matisse2 = new Colors(34, 119, 170);
		Colors royalBlue = new Colors(68, 34, 238);
		Colors cornflowerBlue = new Colors(119, 136, 238);
		Colors blueRibbon = new Colors(0, 51, 238);
		Colors deepKoamaru = new Colors(34, 17, 119);
		Colors cornflowerBlue2 = new Colors(102, 102, 255);
		Colors cornflowerBlue3 = new Colors(85, 136, 238);

		ArrayList<Colors> blueShades = new ArrayList<Colors>();
		blueShades.add(blue);
		blueShades.add(malibu2);
		blueShades.add(darkBlue);
		blueShades.add(matisse2);
		blueShades.add(royalBlue);
		blueShades.add(cornflowerBlue);
		blueShades.add(blueRibbon);
		blueShades.add(deepKoamaru);
		blueShades.add(cornflowerBlue2);
		blueShades.add(cornflowerBlue3);

		// shades of indigo
		Colors indigo = new Colors(63, 0, 255);
		Colors electricViolet6 = new Colors(111, 0, 255);
		Colors purpleHeart2 = new Colors(138, 43, 226);
		Colors pigmentIndigo = new Colors(75, 0, 130);
		Colors portage = new Colors(150, 131, 236);

		ArrayList<Colors> indigoShades = new ArrayList<Colors>();
		indigoShades.add(indigo);
		indigoShades.add(electricViolet6);
		indigoShades.add(purpleHeart2);
		indigoShades.add(pigmentIndigo);
		indigoShades.add(portage);

		// shades of violet
		Colors violet = new Colors(143, 0, 255);
		Colors purpleHeart = new Colors(157, 34, 186);
		Colors eastSide = new Colors(183, 126, 202);
		Colors electricViolet = new Colors(160, 0, 255);
		Colors amethyst = new Colors(154, 102, 205);
		Colors electricViolet2 = new Colors(137, 1, 207);
		Colors honeyFlower = new Colors(79, 30, 100);
		Colors meteorite = new Colors(75, 35, 131);
		Colors lavender = new Colors(182, 127, 221);
		Colors mauve = new Colors(225, 178, 255);

		ArrayList<Colors> violetShades = new ArrayList<Colors>();
		violetShades.add(violet);
		violetShades.add(purpleHeart);
		violetShades.add(eastSide);
		violetShades.add(electricViolet);
		violetShades.add(amethyst);
		violetShades.add(electricViolet2);
		violetShades.add(honeyFlower);
		violetShades.add(meteorite);
		violetShades.add(lavender);
		violetShades.add(mauve);

		// shades of purple
		Colors purple = new Colors(128, 0, 128);
		Colors heliotrope = new Colors(212, 123, 255);
		Colors ripePlum = new Colors(46, 0, 73);
		Colors electricViolet3 = new Colors(176, 19, 247);
		Colors purple2 = new Colors(116, 0, 173);
		Colors heliotrope2 = new Colors(199, 82, 255);
		Colors electricViolet4 = new Colors(135, 0, 201);
		Colors ripePlum2 = new Colors(65, 0, 100);
		Colors electricViolet5 = new Colors(188, 46, 255);
		Colors heliotrope3 = new Colors(194, 67, 255);

		ArrayList<Colors> purpleShades = new ArrayList<Colors>();
		purpleShades.add(purple);
		purpleShades.add(heliotrope);
		purpleShades.add(ripePlum);
		purpleShades.add(electricViolet3);
		purpleShades.add(purple2);
		purpleShades.add(heliotrope2);
		purpleShades.add(electricViolet4);
		purpleShades.add(ripePlum2);
		purpleShades.add(electricViolet5);
		purpleShades.add(heliotrope3);

		// shades of magenta
		Colors magenta = new Colors(255, 0, 255);
		Colors disco = new Colors(129, 26, 116);
		Colors heliotrope4 = new Colors(254, 140, 255);
		Colors razzleDazzleRose = new Colors(255, 53, 197);
		Colors flirt = new Colors(184, 0, 131);
		Colors orchid = new Colors(214, 78, 207);
		Colors fuchsia = new Colors(255, 0, 255);
		Colors freshEggplant = new Colors(151, 0, 103);
		Colors lavenderRose = new Colors(255, 174, 244);
		Colors mediumRedViolet = new Colors(189, 37, 180);

		ArrayList<Colors> magentaShades = new ArrayList<Colors>();
		magentaShades.add(magenta);
		magentaShades.add(disco);
		magentaShades.add(heliotrope4);
		magentaShades.add(razzleDazzleRose);
		magentaShades.add(flirt);
		magentaShades.add(orchid);
		magentaShades.add(fuchsia);
		magentaShades.add(freshEggplant);
		magentaShades.add(lavenderRose);
		magentaShades.add(mediumRedViolet);

		// shades of pink
		Colors pink = new Colors(255, 192, 203);
		Colors cinderellaPink = new Colors(253, 212, 206);
		Colors clamShellPink = new Colors(209, 169, 174);
		Colors cupidPink = new Colors(252, 198, 226);
		Colors violaPink = new Colors(192, 128, 156);
		Colors yourPinkPink = new Colors(255, 190, 194);
		Colors cinderellaPink2 = new Colors(252, 227, 226);
		Colors roseBudPink = new Colors(247, 178, 165);
		Colors wePeepPink = new Colors(248, 220, 225);
		Colors petiteOrchidPink = new Colors(219, 143, 141);

		ArrayList<Colors> pinkShades = new ArrayList<Colors>();
		pinkShades.add(pink);
		pinkShades.add(cinderellaPink);
		pinkShades.add(clamShellPink);
		pinkShades.add(cupidPink);
		pinkShades.add(violaPink);
		pinkShades.add(yourPinkPink);
		pinkShades.add(cinderellaPink2);
		pinkShades.add(roseBudPink);
		pinkShades.add(wePeepPink);
		pinkShades.add(petiteOrchidPink);

		// shades of brown
		Colors brown = new Colors(150, 75, 0);
		Colors pottersClay = new Colors(133, 84, 57);
		Colors whiskey = new Colors(207, 167, 110);
		Colors brownBramble = new Colors(107, 37, 4);
		Colors espresso = new Colors(92, 25, 22);
		Colors peruTan = new Colors(132, 66, 4);
		Colors sandal = new Colors(176, 140, 119);
		Colors leather = new Colors(151, 114, 84);
		Colors rawUmber = new Colors(103, 62, 15);
		Colors clinker = new Colors(63, 29, 11);

		ArrayList<Colors> brownShades = new ArrayList<Colors>();
		brownShades.add(brown);
		brownShades.add(pottersClay);
		brownShades.add(whiskey);
		brownShades.add(brownBramble);
		brownShades.add(espresso);
		brownShades.add(peruTan);
		brownShades.add(sandal);
		brownShades.add(leather);
		brownShades.add(rawUmber);
		brownShades.add(clinker);

		// shades of black
		Colors black = new Colors(0, 0, 0);
		Colors limedSpruce = new Colors(54, 69, 79);
		Colors kelp = new Colors(59, 60, 54);
		Colors gondola = new Colors(26, 17, 16);
		Colors capeCod = new Colors(53, 56, 57);
		Colors iroko = new Colors(75, 54, 33);
		Colors bean = new Colors(61, 12, 2);
		Colors capeCod2 = new Colors(65, 74, 76);
		Colors siam = new Colors(85, 93, 80);

		ArrayList<Colors> blackShades = new ArrayList<Colors>();
		blackShades.add(black);
		blackShades.add(limedSpruce);
		blackShades.add(kelp);
		blackShades.add(gondola);
		blackShades.add(capeCod);
		blackShades.add(iroko);
		blackShades.add(bean);
		blackShades.add(capeCod2);
		blackShades.add(siam);

		// shades of gray
		Colors gray = new Colors(128, 128, 128);
		Colors tundora = new Colors(67, 63, 64);
		Colors nobel = new Colors(178, 172, 171);
		Colors doveGray = new Colors(114, 107, 104);
		Colors osloGray = new Colors(131, 135, 141);
		Colors boulder = new Colors(121, 121, 121);
		Colors tundora2 = new Colors(72, 61, 65);
		Colors silver2 = new Colors(200, 200, 200);
		Colors corduroy = new Colors(88, 98, 97);
		Colors starDust = new Colors(148, 147, 145);

		ArrayList<Colors> grayShades = new ArrayList<Colors>();
		grayShades.add(gray);
		grayShades.add(tundora);
		grayShades.add(nobel);
		grayShades.add(doveGray);
		grayShades.add(osloGray);
		grayShades.add(boulder);
		grayShades.add(tundora2);
		grayShades.add(silver2);
		grayShades.add(corduroy);
		grayShades.add(starDust);

		// shades of white
		Colors white = new Colors(255, 255, 255);
		Colors ivory = new Colors(255, 255, 240);
		Colors twilightBlue = new Colors(240, 255, 255);
		Colors aliceBlue = new Colors(240, 248, 255);
		Colors roseWhite = new Colors(255, 250, 250);
		Colors aliceBlue2 = new Colors(240, 248, 255);
		Colors varden = new Colors(255, 248, 220);

		ArrayList<Colors> whiteShades = new ArrayList<Colors>();
		whiteShades.add(white);
		whiteShades.add(ivory);
		whiteShades.add(twilightBlue);
		whiteShades.add(aliceBlue);
		whiteShades.add(roseWhite);
		whiteShades.add(aliceBlue2);
		whiteShades.add(varden);

		// shades of cream
		Colors cream = new Colors(255, 253, 208);

		ArrayList<Colors> creamShades = new ArrayList<Colors>();
		creamShades.add(cream);

		// shades of teal
		Colors teal = new Colors(0, 128, 128);
		Colors paradiso = new Colors(64, 117, 136);

		ArrayList<Colors> tealShades = new ArrayList<Colors>();
		tealShades.add(teal);
		tealShades.add(paradiso);

		// shades of gold
		Colors gold = new Colors(255, 215, 0);
		Colors oldGold2 = new Colors(212, 175, 55);
		Colors oldGold1 = new Colors(207, 181, 59);
		Colors schoolBusYellow3 = new Colors(255, 223, 0);
		Colors amber2 = new Colors(252, 194, 0);
		Colors sunglow = new Colors(255, 198, 39);
		Colors supernova = new Colors(255, 204, 0);
		Colors sun = new Colors(253, 181, 21);
		Colors buddhaGold = new Colors(198, 147, 10);
		Colors gold2 = new Colors(255, 209, 0);

		ArrayList<Colors> goldShades = new ArrayList<Colors>();
		goldShades.add(gold);
		goldShades.add(oldGold2);
		goldShades.add(oldGold1);
		goldShades.add(schoolBusYellow3);
		goldShades.add(amber2);
		goldShades.add(sunglow);
		goldShades.add(supernova);
		goldShades.add(sun);
		goldShades.add(buddhaGold);
		goldShades.add(gold2);

		// shades of silver
		Colors silver = new Colors(192, 192, 192);
		Colors silverRust = new Colors(201, 192, 187);
		Colors coldTurkey = new Colors(196, 174, 173);
		Colors silverSand = new Colors(191, 193, 194);
		Colors silverChalice = new Colors(172, 172, 172);
		Colors osloGray2 = new Colors(131, 137, 150);
		Colors friarGray = new Colors(132, 132, 130);
		Colors boulder2 = new Colors(117, 117, 117);
		Colors gullGray = new Colors(156, 170, 189);

		ArrayList<Colors> silverShades = new ArrayList<Colors>();
		silverShades.add(silver);
		silverShades.add(silverRust);
		silverShades.add(coldTurkey);
		silverShades.add(silverSand);
		silverShades.add(silverChalice);
		silverShades.add(osloGray2);
		silverShades.add(friarGray);
		silverShades.add(boulder2);
		silverShades.add(gullGray);

		// shades of tan
		Colors tan = new Colors(210, 180, 140);
		Colors lightApricot = new Colors(253, 217, 181);
		Colors rajah = new Colors(250, 167, 108);
		Colors brownRust = new Colors(174, 104, 56);
		Colors barleyCorn = new Colors(166, 123, 91);

		ArrayList<Colors> tanShades = new ArrayList<Colors>();
		tanShades.add(tan);
		tanShades.add(lightApricot);
		tanShades.add(rajah);
		tanShades.add(brownRust);
		tanShades.add(barleyCorn);

		// shades of beige
		Colors beige = new Colors(245, 245, 220);
		Colors earlyDawn = new Colors(255, 248, 231);
		Colors cream2 = new Colors(255, 253, 208);
		Colors tuftBush = new Colors(255, 221, 202);
		Colors corvette = new Colors(250, 214, 165);
		Colors buff = new Colors(240, 220, 130);
		Colors desertSand = new Colors(237, 201, 175);
		Colors indianKhaki2 = new Colors(194, 178, 128);
		Colors indianKhaki = new Colors(195, 176, 145);
		Colors sorrellBrown = new Colors(200, 173, 127);

		ArrayList<Colors> beigeShades = new ArrayList<Colors>();
		beigeShades.add(beige);
		beigeShades.add(earlyDawn);
		beigeShades.add(cream2);
		beigeShades.add(tuftBush);
		beigeShades.add(corvette);
		beigeShades.add(buff);
		beigeShades.add(desertSand);
		beigeShades.add(indianKhaki2);
		beigeShades.add(indianKhaki);
		beigeShades.add(sorrellBrown);

		// shades of turquoise
		Colors turquoise = new Colors(64, 224, 208);
		Colors frenchPass2 = new Colors(178, 255, 255);
		Colors blizzardBlue = new Colors(175, 238, 238);
		Colors cyan2 = new Colors(0, 255, 239);
		Colors turquoise2 = new Colors(72, 209, 204);
		Colors robinsEggBlue = new Colors(0, 206, 209);

		ArrayList<Colors> turquoiseShades = new ArrayList<Colors>();
		turquoiseShades.add(turquoise);
		turquoiseShades.add(frenchPass2);
		turquoiseShades.add(blizzardBlue);
		turquoiseShades.add(cyan2);
		turquoiseShades.add(turquoise2);
		turquoiseShades.add(robinsEggBlue);

		// array list of all color objects
		ArrayList<Colors> allShades = new ArrayList<Colors>();
		allShades.addAll(redShades);
		allShades.addAll(orangeShades);
		allShades.addAll(yellowShades);
		allShades.addAll(greenShades);
		allShades.addAll(cyanShades);
		allShades.addAll(blueShades);
		allShades.addAll(indigoShades);
		allShades.addAll(violetShades);
		allShades.addAll(purpleShades);
		allShades.addAll(magentaShades);
		allShades.addAll(pinkShades);
		allShades.addAll(brownShades);
		allShades.addAll(whiteShades);
		allShades.addAll(grayShades);
		allShades.addAll(blackShades);
		allShades.addAll(creamShades);
		allShades.addAll(tealShades);
		allShades.addAll(goldShades);
		allShades.addAll(silverShades);
		allShades.addAll(tanShades);
		allShades.addAll(beigeShades);
		allShades.addAll(turquoiseShades);

		getContentPane().setLayout(new BorderLayout(0, 0));

		JPanel inputColorPanel = new JPanel();
		getContentPane().add(inputColorPanel, BorderLayout.NORTH);

		JLabel hexTripLabel = new JLabel("Input hex triplet: ");
		inputColorPanel.add(hexTripLabel);

		hexTripField = new JTextField();
		inputColorPanel.add(hexTripField);
		hexTripField.setColumns(10);

		JButton lookUpButton = new JButton("Look up color");
		lookUpButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String inputColor = hexTripField.getText();
				chosenColor.setText(inputColor);

				String redValue = inputColor.substring(0, 2);
				int redDec = Integer.parseInt(redValue, 16);
				String greenValue = inputColor.substring(2, 4);
				int greenDec = Integer.parseInt(greenValue, 16);
				String blueValue = inputColor.substring(4, 6);
				int blueDec = Integer.parseInt(blueValue, 16);

				userColor.setRedDecimal(redDec);
				userColor.setGreenDecimal(greenDec);
				userColor.setBlueDecimal(blueDec);

				// set chosen color visual
				chosenColor.setBackground(
						new Color(userColor.getRedDecimal(), userColor.getGreenDecimal(), userColor.getBlueDecimal()));
				if (userColor.luminosity() > 0.5)
					chosenColor.setForeground(new Color(0, 0, 0));
				else
					chosenColor.setForeground(new Color(255, 255, 255));

				// find best singular match
				Colors singMatch = allShades.get(0);
				for (int i = 1; i < allShades.size(); i++)
					if (Colors.colorDifference(userColor, allShades.get(i)) < Colors.colorDifference(userColor,
							singMatch))
						singMatch = allShades.get(i);
				singMatchPanel.setBackground(
						new Color(singMatch.getRedDecimal(), singMatch.getGreenDecimal(), singMatch.getBlueDecimal()));
				double redTotal = 0;
				for (Colors element : redShades)
					redTotal = redTotal + Colors.colorDifference(userColor, element);
				double redAverage = 0;
				if (redShades.size() > 0)
					redAverage = redTotal / redShades.size();

				double orangeTotal = 0;
				for (Colors element : orangeShades)
					orangeTotal = orangeTotal + Colors.colorDifference(userColor, element);
				double orangeAverage = 0;
				if (orangeShades.size() > 0)
					orangeAverage = orangeTotal / orangeShades.size();

				double yellowTotal = 0;
				for (Colors element : yellowShades)
					yellowTotal = yellowTotal + Colors.colorDifference(userColor, element);
				double yellowAverage = 0;
				if (yellowShades.size() > 0)
					yellowAverage = yellowTotal / yellowShades.size();

				double greenTotal = 0;
				for (Colors element : greenShades)
					greenTotal = greenTotal + Colors.colorDifference(userColor, element);
				double greenAverage = 0;
				if (greenShades.size() > 0)
					greenAverage = greenTotal / greenShades.size();

				double cyanTotal = 0;
				for (Colors element : cyanShades)
					cyanTotal = cyanTotal + Colors.colorDifference(userColor, element);
				double cyanAverage = 0;
				if (cyanShades.size() > 0)
					cyanAverage = cyanTotal / cyanShades.size();

				double blueTotal = 0;
				for (Colors element : blueShades)
					blueTotal = blueTotal + Colors.colorDifference(userColor, element);
				double blueAverage = 0;
				if (blueShades.size() > 0)
					blueAverage = blueTotal / blueShades.size();

				double indigoTotal = 0;
				for (Colors element : indigoShades)
					indigoTotal = indigoTotal + Colors.colorDifference(userColor, element);
				double indigoAverage = 0;
				if (indigoShades.size() > 0)
					indigoAverage = indigoTotal / indigoShades.size();

				double violetTotal = 0;
				for (Colors element : violetShades)
					violetTotal = violetTotal + Colors.colorDifference(userColor, element);
				double violetAverage = 0;
				if (violetShades.size() > 0)
					violetAverage = violetTotal / violetShades.size();

				double purpleTotal = 0;
				for (Colors element : purpleShades)
					purpleTotal = purpleTotal + Colors.colorDifference(userColor, element);
				double purpleAverage = 0;
				if (purpleShades.size() > 0)
					purpleAverage = purpleTotal / purpleShades.size();

				double magentaTotal = 0;
				for (Colors element : magentaShades)
					magentaTotal = magentaTotal + Colors.colorDifference(userColor, element);
				double magentaAverage = 0;
				if (magentaShades.size() > 0)
					magentaAverage = magentaTotal / magentaShades.size();

				double pinkTotal = 0;
				for (Colors element : pinkShades)
					pinkTotal = pinkTotal + Colors.colorDifference(userColor, element);
				double pinkAverage = 0;
				if (pinkShades.size() > 0)
					pinkAverage = pinkTotal / pinkShades.size();

				double brownTotal = 0;
				for (Colors element : brownShades)
					brownTotal = brownTotal + Colors.colorDifference(userColor, element);
				double brownAverage = 0;
				if (brownShades.size() > 0)
					brownAverage = brownTotal / brownShades.size();

				double whiteTotal = 0;
				for (Colors element : whiteShades)
					whiteTotal = whiteTotal + Colors.colorDifference(userColor, element);
				double whiteAverage = 0;
				if (whiteShades.size() > 0)
					whiteAverage = whiteTotal / whiteShades.size();

				double grayTotal = 0;
				for (Colors element : grayShades)
					grayTotal = grayTotal + Colors.colorDifference(userColor, element);
				double grayAverage = 0;
				if (grayShades.size() > 0)
					grayAverage = grayTotal / grayShades.size();

				double blackTotal = 0;
				for (Colors element : blackShades)
					blackTotal = blackTotal + Colors.colorDifference(userColor, element);
				double blackAverage = 0;
				if (blackShades.size() > 0)
					blackAverage = blackTotal / blackShades.size();

				double creamTotal = 0;
				for (Colors element : creamShades)
					creamTotal = creamTotal + Colors.colorDifference(userColor, element);
				double creamAverage = 0;
				if (creamShades.size() > 0)
					creamAverage = creamTotal / creamShades.size();

				double tealTotal = 0;
				for (Colors element : tealShades)
					tealTotal = tealTotal + Colors.colorDifference(userColor, element);
				double tealAverage = 0;
				if (tealShades.size() > 0)
					tealAverage = tealTotal / tealShades.size();

				double goldTotal = 0;
				for (Colors element : goldShades)
					goldTotal = goldTotal + Colors.colorDifference(userColor, element);
				double goldAverage = 0;
				if (goldShades.size() > 0)
					goldAverage = goldTotal / goldShades.size();

				double silverTotal = 0;
				for (Colors element : silverShades)
					silverTotal = silverTotal + Colors.colorDifference(userColor, element);
				double silverAverage = 0;
				if (silverShades.size() > 0)
					silverAverage = silverTotal / silverShades.size();

				double tanTotal = 0;
				for (Colors element : tanShades)
					tanTotal = tanTotal + Colors.colorDifference(userColor, element);
				double tanAverage = 0;
				if (tanShades.size() > 0)
					tanAverage = tanTotal / tanShades.size();

				double beigeTotal = 0;
				for (Colors element : beigeShades)
					beigeTotal = beigeTotal + Colors.colorDifference(userColor, element);
				double beigeAverage = 0;
				if (beigeShades.size() > 0)
					beigeAverage = beigeTotal / beigeShades.size();

				double turquoiseTotal = 0;
				for (Colors element : turquoiseShades)
					turquoiseTotal = turquoiseTotal + Colors.colorDifference(userColor, element);
				double turquoiseAverage = 0;
				if (turquoiseShades.size() > 0)
					turquoiseAverage = turquoiseTotal / turquoiseShades.size();

				ArrayList<Double> allAverages = new ArrayList<Double>();
				allAverages.add(redAverage);
				allAverages.add(orangeAverage);
				allAverages.add(yellowAverage);
				allAverages.add(greenAverage);
				allAverages.add(cyanAverage);
				allAverages.add(blueAverage);
				allAverages.add(indigoAverage);
				allAverages.add(violetAverage);
				allAverages.add(purpleAverage);
				allAverages.add(magentaAverage);
				allAverages.add(pinkAverage);
				allAverages.add(brownAverage);
				allAverages.add(whiteAverage);
				allAverages.add(grayAverage);
				allAverages.add(blackAverage);
				allAverages.add(creamAverage);
				allAverages.add(tealAverage);
				allAverages.add(goldAverage);
				allAverages.add(silverAverage);
				allAverages.add(tanAverage);
				allAverages.add(beigeAverage);
				allAverages.add(turquoiseAverage);

				if (singMatch.luminosity() > 0.5)
					singMatchLabel.setForeground(new Color(0, 0, 0));
				else
					singMatchLabel.setForeground(new Color(255, 255, 255));

				if (redShades.contains(singMatch))
					singMatchLabel.setText("red");
				else if (orangeShades.contains(singMatch))
					singMatchLabel.setText("orange");
				else if (yellowShades.contains(singMatch))
					singMatchLabel.setText("yellow");
				else if (greenShades.contains(singMatch))
					singMatchLabel.setText("green");
				else if (cyanShades.contains(singMatch))
					singMatchLabel.setText("cyan");
				else if (blueShades.contains(singMatch))
					singMatchLabel.setText("blue");
				else if (indigoShades.contains(singMatch))
					singMatchLabel.setText("indigo");
				else if (violetShades.contains(singMatch))
					singMatchLabel.setText("violet");
				else if (purpleShades.contains(singMatch))
					singMatchLabel.setText("purple");
				else if (magentaShades.contains(singMatch))
					singMatchLabel.setText("magenta");
				else if (pinkShades.contains(singMatch))
					singMatchLabel.setText("pink");
				else if (brownShades.contains(singMatch))
					singMatchLabel.setText("brown");
				else if (whiteShades.contains(singMatch))
					singMatchLabel.setText("white");
				else if (grayShades.contains(singMatch))
					singMatchLabel.setText("gray");
				else if (blackShades.contains(singMatch))
					singMatchLabel.setText("black");
				else if (creamShades.contains(singMatch))
					singMatchLabel.setText("cream");
				else if (tealShades.contains(singMatch))
					singMatchLabel.setText("teal");
				else if (goldShades.contains(singMatch))
					singMatchLabel.setText("gold");
				else if (silverShades.contains(singMatch))
					singMatchLabel.setText("silver");
				else if (tanShades.contains(singMatch))
					singMatchLabel.setText("tan");
				else if (beigeShades.contains(singMatch))
					singMatchLabel.setText("beige");
				else if (turquoiseShades.contains(singMatch))
					singMatchLabel.setText("turquoise");

				// find best average match
				Double avgMatch = allAverages.get(0);
				for (int i = 1; i < allAverages.size(); i++)
					if (allAverages.get(i) < avgMatch)
						avgMatch = allAverages.get(i);

				if (redAverage == avgMatch) {
					avgMatchLabel.setText("red");
					avgMatchPanel.setBackground(new Color(255, 0, 0));
				} else if (orangeAverage == avgMatch) {
					avgMatchLabel.setText("orange");
					avgMatchPanel.setBackground(new Color(255, 127, 0));
				} else if (yellowAverage == avgMatch) {
					avgMatchLabel.setText("yellow");
					avgMatchPanel.setBackground(new Color(255, 255, 0));
				} else if (greenAverage == avgMatch) {
					avgMatchLabel.setText("green");
					avgMatchPanel.setBackground(new Color(0, 128, 0));
				} else if (cyanAverage == avgMatch) {
					avgMatchLabel.setText("cyan");
					avgMatchPanel.setBackground(new Color(0, 255, 255));
				} else if (blueAverage == avgMatch) {
					avgMatchLabel.setText("blue");
					avgMatchPanel.setBackground(new Color(0, 0, 255));
				} else if (indigoAverage == avgMatch) {
					avgMatchLabel.setText("indigo");
					avgMatchPanel.setBackground(new Color(65, 0, 255));
				} else if (violetAverage == avgMatch) {
					avgMatchLabel.setText("violet");
					avgMatchPanel.setBackground(new Color(143, 0, 255));
				} else if (purpleAverage == avgMatch) {
					avgMatchLabel.setText("purple");
					avgMatchPanel.setBackground(new Color(128, 0, 128));
				} else if (magentaAverage == avgMatch) {
					avgMatchLabel.setText("magenta");
					avgMatchPanel.setBackground(new Color(255, 0, 255));
				} else if (pinkAverage == avgMatch) {
					avgMatchLabel.setText("pink");
					avgMatchPanel.setBackground(new Color(255, 192, 203));
				} else if (brownAverage == avgMatch) {
					avgMatchLabel.setText("brown");
					avgMatchPanel.setBackground(new Color(150, 75, 0));
				} else if (whiteAverage == avgMatch) {
					avgMatchLabel.setText("white");
					avgMatchPanel.setBackground(new Color(255, 255, 255));
				} else if (grayAverage == avgMatch) {
					avgMatchLabel.setText("gray");
					avgMatchPanel.setBackground(new Color(128, 128, 128));
				} else if (blackAverage == avgMatch) {
					avgMatchLabel.setText("black");
					avgMatchPanel.setBackground(new Color(0, 0, 0));
				} else if (creamAverage == avgMatch) {
					avgMatchLabel.setText("cream");
					avgMatchPanel.setBackground(new Color(255, 253, 208));
				} else if (tealAverage == avgMatch) {
					avgMatchLabel.setText("teal");
					avgMatchPanel.setBackground(new Color(0, 128, 128));
				} else if (goldAverage == avgMatch) {
					avgMatchLabel.setText("gold");
					avgMatchPanel.setBackground(new Color(255, 215, 0));
				} else if (silverAverage == avgMatch) {
					avgMatchLabel.setText("silver");
					avgMatchPanel.setBackground(new Color(192, 192, 192));
				} else if (tanAverage == avgMatch) {
					avgMatchLabel.setText("tan");
					avgMatchPanel.setBackground(new Color(210, 180, 140));
				} else if (beigeAverage == avgMatch) {
					avgMatchLabel.setText("beige");
					avgMatchPanel.setBackground(new Color(245, 245, 220));
				} else if (turquoiseAverage == avgMatch) {
					avgMatchLabel.setText("turquoise");
					avgMatchPanel.setBackground(new Color(64, 224, 208));
				}

				Collections.sort(allAverages);
				// find second best
				if (redAverage == allAverages.get(1)) {
					best2label.setText("red");
					best2label.setForeground(new Color(255, 0, 0));
				} else if (orangeAverage == allAverages.get(1)) {
					best2label.setText("orange");
					best2label.setForeground(new Color(255, 127, 0));
				} else if (yellowAverage == allAverages.get(1)) {
					best2label.setText("yellow");
					best2label.setForeground(new Color(128, 128, 0));
				} else if (greenAverage == allAverages.get(1)) {
					best2label.setText("green");
					best2label.setForeground(new Color(0, 128, 0));
				} else if (cyanAverage == allAverages.get(1)) {
					best2label.setText("cyan");
					best2label.setForeground(new Color(0, 255, 255));
				} else if (blueAverage == allAverages.get(1)) {
					best2label.setText("blue");
					best2label.setForeground(new Color(0, 0, 255));
				} else if (indigoAverage == allAverages.get(1)) {
					best2label.setText("indigo");
					best2label.setForeground(new Color(65, 0, 255));
				} else if (violetAverage == allAverages.get(1)) {
					best2label.setText("violet");
					best2label.setForeground(new Color(143, 0, 255));
				} else if (purpleAverage == allAverages.get(1)) {
					best2label.setText("purple");
					best2label.setForeground(new Color(128, 0, 128));
				} else if (magentaAverage == allAverages.get(1)) {
					best2label.setText("magenta");
					best2label.setForeground(new Color(255, 0, 255));
				} else if (pinkAverage == allAverages.get(1)) {
					best2label.setText("pink");
					best2label.setForeground(new Color(255, 192, 203));
				} else if (brownAverage == allAverages.get(1)) {
					best2label.setText("brown");
					best2label.setForeground(new Color(150, 75, 0));
				} else if (whiteAverage == allAverages.get(1)) {
					best2label.setText("white");
					best2label.setForeground(new Color(128, 128, 128));
				} else if (grayAverage == allAverages.get(1)) {
					best2label.setText("gray");
					best2label.setForeground(new Color(128, 128, 128));
				} else if (blackAverage == allAverages.get(1)) {
					best2label.setText("black");
					best2label.setForeground(new Color(0, 0, 0));
				} else if (creamAverage == allAverages.get(1)) {
					best2label.setText("cream");
					best2label.setForeground(new Color(128, 127, 104));
				} else if (tealAverage == allAverages.get(1)) {
					best2label.setText("teal");
					best2label.setForeground(new Color(0, 128, 128));
				} else if (goldAverage == allAverages.get(1)) {
					best2label.setText("gold");
					best2label.setForeground(new Color(255, 215, 0));
				} else if (silverAverage == allAverages.get(1)) {
					best2label.setText("silver");
					best2label.setForeground(new Color(96, 96, 96));
				} else if (tanAverage == allAverages.get(1)) {
					best2label.setText("tan");
					best2label.setForeground(new Color(210, 180, 140));
				} else if (beigeAverage == allAverages.get(1)) {
					best2label.setText("beige");
					best2label.setForeground(new Color(123, 123, 110));
				} else if (turquoiseAverage == allAverages.get(1)) {
					best2label.setText("turquoise");
					best2label.setForeground(new Color(64, 224, 208));
				}

				// find third best
				if (redAverage == allAverages.get(2)) {
					best3label.setText("red");
					best3label.setForeground(new Color(255, 0, 0));
				} else if (orangeAverage == allAverages.get(2)) {
					best3label.setText("orange");
					best3label.setForeground(new Color(255, 127, 0));
				} else if (yellowAverage == allAverages.get(2)) {
					best3label.setText("yellow");
					best3label.setForeground(new Color(128, 128, 0));
				} else if (greenAverage == allAverages.get(2)) {
					best3label.setText("green");
					best3label.setForeground(new Color(0, 128, 0));
				} else if (cyanAverage == allAverages.get(2)) {
					best3label.setText("cyan");
					best3label.setForeground(new Color(0, 255, 255));
				} else if (blueAverage == allAverages.get(2)) {
					best3label.setText("blue");
					best3label.setForeground(new Color(0, 0, 255));
				} else if (indigoAverage == allAverages.get(2)) {
					best3label.setText("indigo");
					best3label.setForeground(new Color(65, 0, 255));
				} else if (violetAverage == allAverages.get(2)) {
					best3label.setText("violet");
					best3label.setForeground(new Color(143, 0, 255));
				} else if (purpleAverage == allAverages.get(2)) {
					best3label.setText("purple");
					best3label.setForeground(new Color(128, 0, 128));
				} else if (magentaAverage == allAverages.get(2)) {
					best3label.setText("magenta");
					best3label.setForeground(new Color(255, 0, 255));
				} else if (pinkAverage == allAverages.get(2)) {
					best3label.setText("pink");
					best3label.setForeground(new Color(255, 192, 203));
				} else if (brownAverage == allAverages.get(2)) {
					best3label.setText("brown");
					best3label.setForeground(new Color(150, 75, 0));
				} else if (whiteAverage == allAverages.get(2)) {
					best3label.setText("white");
					best3label.setForeground(new Color(128, 128, 128));
				} else if (grayAverage == allAverages.get(2)) {
					best3label.setText("gray");
					best3label.setForeground(new Color(128, 128, 128));
				} else if (blackAverage == allAverages.get(2)) {
					best3label.setText("black");
					best3label.setForeground(new Color(0, 0, 0));
				} else if (creamAverage == allAverages.get(2)) {
					best3label.setText("cream");
					best3label.setForeground(new Color(128, 127, 104));
				} else if (tealAverage == allAverages.get(2)) {
					best3label.setText("teal");
					best3label.setForeground(new Color(0, 128, 128));
				} else if (goldAverage == allAverages.get(2)) {
					best3label.setText("gold");
					best3label.setForeground(new Color(255, 215, 0));
				} else if (silverAverage == allAverages.get(2)) {
					best3label.setText("silver");
					best3label.setForeground(new Color(96, 96, 96));
				} else if (tanAverage == allAverages.get(2)) {
					best3label.setText("tan");
					best3label.setForeground(new Color(210, 180, 140));
				} else if (beigeAverage == allAverages.get(2)) {
					best3label.setText("beige");
					best3label.setForeground(new Color(123, 123, 110));
				} else if (turquoiseAverage == allAverages.get(2)) {
					best3label.setText("turquoise");
					best3label.setForeground(new Color(64, 224, 208));
				}

				// find fourth best
				if (redAverage == allAverages.get(3)) {
					best4label.setText("red");
					best4label.setForeground(new Color(255, 0, 0));
				} else if (orangeAverage == allAverages.get(3)) {
					best4label.setText("orange");
					best4label.setForeground(new Color(255, 127, 0));
				} else if (yellowAverage == allAverages.get(3)) {
					best4label.setText("yellow");
					best4label.setForeground(new Color(128, 128, 0));
				} else if (greenAverage == allAverages.get(3)) {
					best4label.setText("green");
					best4label.setForeground(new Color(0, 128, 0));
				} else if (cyanAverage == allAverages.get(3)) {
					best4label.setText("cyan");
					best4label.setForeground(new Color(0, 255, 255));
				} else if (blueAverage == allAverages.get(3)) {
					best4label.setText("blue");
					best4label.setForeground(new Color(0, 0, 255));
				} else if (indigoAverage == allAverages.get(3)) {
					best4label.setText("indigo");
					best4label.setForeground(new Color(65, 0, 255));
				} else if (violetAverage == allAverages.get(3)) {
					best4label.setText("violet");
					best4label.setForeground(new Color(143, 0, 255));
				} else if (purpleAverage == allAverages.get(3)) {
					best4label.setText("purple");
					best4label.setForeground(new Color(128, 0, 128));
				} else if (magentaAverage == allAverages.get(3)) {
					best4label.setText("magenta");
					best4label.setForeground(new Color(255, 0, 255));
				} else if (pinkAverage == allAverages.get(3)) {
					best4label.setText("pink");
					best4label.setForeground(new Color(255, 192, 203));
				} else if (brownAverage == allAverages.get(3)) {
					best4label.setText("brown");
					best4label.setForeground(new Color(150, 75, 0));
				} else if (whiteAverage == allAverages.get(3)) {
					best4label.setText("white");
					best4label.setForeground(new Color(128, 128, 128));
				} else if (grayAverage == allAverages.get(3)) {
					best4label.setText("gray");
					best4label.setForeground(new Color(128, 128, 128));
				} else if (blackAverage == allAverages.get(3)) {
					best4label.setText("black");
					best4label.setForeground(new Color(0, 0, 0));
				} else if (creamAverage == allAverages.get(3)) {
					best4label.setText("cream");
					best4label.setForeground(new Color(128, 127, 104));
				} else if (tealAverage == allAverages.get(3)) {
					best4label.setText("teal");
					best4label.setForeground(new Color(0, 128, 128));
				} else if (goldAverage == allAverages.get(3)) {
					best4label.setText("gold");
					best4label.setForeground(new Color(255, 215, 0));
				} else if (silverAverage == allAverages.get(3)) {
					best4label.setText("silver");
					best4label.setForeground(new Color(96, 96, 96));
				} else if (tanAverage == allAverages.get(3)) {
					best4label.setText("tan");
					best4label.setForeground(new Color(210, 180, 140));
				} else if (beigeAverage == allAverages.get(3)) {
					best4label.setText("beige");
					best4label.setForeground(new Color(123, 123, 110));
				} else if (turquoiseAverage == allAverages.get(3)) {
					best4label.setText("turquoise");
					best4label.setForeground(new Color(64, 224, 208));
				}
				// find fifth best
				if (redAverage == allAverages.get(4)) {
					best5label.setText("red");
					best5label.setForeground(new Color(255, 0, 0));
				} else if (orangeAverage == allAverages.get(4)) {
					best5label.setText("orange");
					best5label.setForeground(new Color(255, 127, 0));
				} else if (yellowAverage == allAverages.get(4)) {
					best5label.setText("yellow");
					best5label.setForeground(new Color(128, 128, 0));
				} else if (greenAverage == allAverages.get(4)) {
					best5label.setText("green");
					best5label.setForeground(new Color(0, 128, 0));
				} else if (cyanAverage == allAverages.get(4)) {
					best5label.setText("cyan");
					best5label.setForeground(new Color(0, 255, 255));
				} else if (blueAverage == allAverages.get(4)) {
					best5label.setText("blue");
					best5label.setForeground(new Color(0, 0, 255));
				} else if (indigoAverage == allAverages.get(4)) {
					best5label.setText("indigo");
					best5label.setForeground(new Color(65, 0, 255));
				} else if (violetAverage == allAverages.get(4)) {
					best5label.setText("violet");
					best5label.setForeground(new Color(143, 0, 255));
				} else if (purpleAverage == allAverages.get(4)) {
					best5label.setText("purple");
					best5label.setForeground(new Color(128, 0, 128));
				} else if (magentaAverage == allAverages.get(4)) {
					best5label.setText("magenta");
					best5label.setForeground(new Color(255, 0, 255));
				} else if (pinkAverage == allAverages.get(4)) {
					best5label.setText("pink");
					best5label.setForeground(new Color(255, 192, 203));
				} else if (brownAverage == allAverages.get(4)) {
					best5label.setText("brown");
					best5label.setForeground(new Color(150, 75, 0));
				} else if (whiteAverage == allAverages.get(4)) {
					best5label.setText("white");
					best5label.setForeground(new Color(128, 128, 128));
				} else if (grayAverage == allAverages.get(4)) {
					best5label.setText("gray");
					best5label.setForeground(new Color(128, 128, 128));
				} else if (blackAverage == allAverages.get(4)) {
					best5label.setText("black");
					best5label.setForeground(new Color(0, 0, 0));
				} else if (creamAverage == allAverages.get(4)) {
					best5label.setText("cream");
					best5label.setForeground(new Color(128, 127, 104));
				} else if (tealAverage == allAverages.get(4)) {
					best5label.setText("teal");
					best5label.setForeground(new Color(0, 128, 128));
				} else if (goldAverage == allAverages.get(4)) {
					best5label.setText("gold");
					best5label.setForeground(new Color(255, 215, 0));
				} else if (silverAverage == allAverages.get(4)) {
					best5label.setText("silver");
					best5label.setForeground(new Color(96, 96, 96));
				} else if (tanAverage == allAverages.get(4)) {
					best5label.setText("tan");
					best5label.setForeground(new Color(210, 180, 140));
				} else if (beigeAverage == allAverages.get(4)) {
					best5label.setText("beige");
					best5label.setForeground(new Color(123, 123, 110));
				} else if (turquoiseAverage == allAverages.get(4)) {
					best5label.setText("turquoise");
					best5label.setForeground(new Color(64, 224, 208));
				}
				// find sixth best
				if (redAverage == allAverages.get(5)) {
					best6label.setText("red");
					best6label.setForeground(new Color(255, 0, 0));
				} else if (orangeAverage == allAverages.get(5)) {
					best6label.setText("orange");
					best6label.setForeground(new Color(255, 127, 0));
				} else if (yellowAverage == allAverages.get(5)) {
					best6label.setText("yellow");
					best6label.setForeground(new Color(128, 128, 0));
				} else if (greenAverage == allAverages.get(5)) {
					best6label.setText("green");
					best6label.setForeground(new Color(0, 128, 0));
				} else if (cyanAverage == allAverages.get(5)) {
					best6label.setText("cyan");
					best6label.setForeground(new Color(0, 255, 255));
				} else if (blueAverage == allAverages.get(5)) {
					best6label.setText("blue");
					best6label.setForeground(new Color(0, 0, 255));
				} else if (indigoAverage == allAverages.get(5)) {
					best6label.setText("indigo");
					best6label.setForeground(new Color(65, 0, 255));
				} else if (violetAverage == allAverages.get(5)) {
					best6label.setText("violet");
					best6label.setForeground(new Color(143, 0, 255));
				} else if (purpleAverage == allAverages.get(5)) {
					best6label.setText("purple");
					best6label.setForeground(new Color(128, 0, 128));
				} else if (magentaAverage == allAverages.get(5)) {
					best6label.setText("magenta");
					best6label.setForeground(new Color(255, 0, 255));
				} else if (pinkAverage == allAverages.get(5)) {
					best6label.setText("pink");
					best6label.setForeground(new Color(255, 192, 203));
				} else if (brownAverage == allAverages.get(5)) {
					best6label.setText("brown");
					best6label.setForeground(new Color(150, 75, 0));
				} else if (whiteAverage == allAverages.get(5)) {
					best6label.setText("white");
					best6label.setForeground(new Color(128, 128, 128));
				} else if (grayAverage == allAverages.get(5)) {
					best6label.setText("gray");
					best6label.setForeground(new Color(128, 128, 128));
				} else if (blackAverage == allAverages.get(5)) {
					best6label.setText("black");
					best6label.setForeground(new Color(0, 0, 0));
				} else if (creamAverage == allAverages.get(5)) {
					best6label.setText("cream");
					best6label.setForeground(new Color(128, 127, 104));
				} else if (tealAverage == allAverages.get(5)) {
					best6label.setText("teal");
					best6label.setForeground(new Color(0, 128, 128));
				} else if (goldAverage == allAverages.get(5)) {
					best6label.setText("gold");
					best6label.setForeground(new Color(255, 215, 0));
				} else if (silverAverage == allAverages.get(5)) {
					best6label.setText("silver");
					best6label.setForeground(new Color(96, 96, 96));
				} else if (tanAverage == allAverages.get(5)) {
					best6label.setText("tan");
					best6label.setForeground(new Color(210, 180, 140));
				} else if (beigeAverage == allAverages.get(5)) {
					best6label.setText("beige");
					best6label.setForeground(new Color(123, 123, 110));
				} else if (turquoiseAverage == allAverages.get(5)) {
					best6label.setText("turquoise");
					best6label.setForeground(new Color(64, 224, 208));
				}

			}
		});
		inputColorPanel.add(lookUpButton);

		chosenColor = new JTextPane();

		inputColorPanel.add(chosenColor);

		JPanel bestMatchPanel = new JPanel();
		getContentPane().add(bestMatchPanel, BorderLayout.CENTER);
		bestMatchPanel.setLayout(new GridLayout(1, 0, 0, 0));

		singMatchPanel.setForeground(new Color(0, 0, 0));
		singMatchPanel.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Best singular match",
				TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		bestMatchPanel.add(singMatchPanel);

		singMatchPanel.add(singMatchLabel);

		avgMatchPanel.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Best average match",
				TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		bestMatchPanel.add(avgMatchPanel);

		avgMatchPanel.add(avgMatchLabel);

		JPanel otherColorsPanel = new JPanel();
		getContentPane().add(otherColorsPanel, BorderLayout.SOUTH);
		otherColorsPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));

		JPanel otherColorsBorder = new JPanel();
		otherColorsBorder.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Other similar colors",
				TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		otherColorsPanel.add(otherColorsBorder);

		otherColorsBorder.add(best2label);

		otherColorsBorder.add(best3label);

		otherColorsBorder.add(best4label);

		otherColorsBorder.add(best5label);

		otherColorsBorder.add(best6label);
	}
}