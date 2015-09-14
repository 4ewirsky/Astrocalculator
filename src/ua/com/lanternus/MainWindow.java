package ua.com.lanternus;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.GridBagLayout;

import javax.swing.JFrame;

import java.awt.BorderLayout;

import javax.swing.JTextField;

import java.awt.Dimension;

import javax.swing.JPanel;

import java.awt.GridLayout;

import javax.swing.JButton;
import java.awt.GridBagConstraints;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import java.awt.Component;
import javax.swing.border.EmptyBorder;
import java.awt.Insets;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import javax.swing.DropMode;


public class MainWindow {

	private JFrame frame;
	private JTextField[] InputField = new JTextField[20];
	
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainWindow window = new MainWindow();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		}

	/**
	 * Create the application.
	 */
	public MainWindow() {
		initialize();		
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setResizable(false);
		frame.setBounds(100, 100, 950, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new BorderLayout(0, 0));
		
		JPanel WindowPanel = new JPanel();
		frame.getContentPane().add(WindowPanel, BorderLayout.NORTH);
	
		WindowPanel.setLayout(new GridLayout(1, 20, 0, 0));
		
		for (int i = 0; i < 20; i++){
			
		InputField[i] = new JTextField();
		InputField[i].setBorder(new EmptyBorder(0, 0, 0, 0));
		InputField[i].setEnabled(false);
		InputField[i].setPreferredSize(new Dimension(4, 50));
		WindowPanel.add(InputField[i]);
		}
		
		//InputTextField.setMargin(new Insets(0, 0, 0, 0));
		
	 /**переписать через цикл и массив
		//придумать хранилище для кнопок... переопределить класс кнопки?
		переменные: счетчик текущей позиции - булеан массив(?) является ли...
		у каждой кнопки: может ли быть она нажата
		
		*/
				
	
		
		JPanel panel_Planet = new JPanel();
		panel_Planet.setBorder(new EmptyBorder(5, 5, 5, 5));
		frame.getContentPane().add(panel_Planet, BorderLayout.WEST);
			GridBagLayout gbl_panel_Planet = new GridBagLayout();
			gbl_panel_Planet.columnWidths = new int[]{300};
			//gbl_panel_Planet.rowHeights = new int[]{101, 101, 101, 101, 0};
			gbl_panel_Planet.columnWeights = new double[]{0.0};
			gbl_panel_Planet.rowWeights = new double[]{3.0, 1.0, 4.0, 1.0, 1.0};
			panel_Planet.setLayout(gbl_panel_Planet);
				
					JPanel panel_MainPlanet = new JPanel();
					panel_MainPlanet.setBorder(new EmptyBorder(5, 5, 5, 5));
					GridBagConstraints gbc_panel_MainPlanet = new GridBagConstraints();
					gbc_panel_MainPlanet.fill = GridBagConstraints.BOTH;
					gbc_panel_MainPlanet.insets = new Insets(0, 0, 5, 0);
					gbc_panel_MainPlanet.gridx = 0;
					gbc_panel_MainPlanet.gridy = 0;
					panel_Planet.add(panel_MainPlanet, gbc_panel_MainPlanet);
					panel_MainPlanet.setLayout(new GridLayout(3, 4, 3, 3));
					
							JButton SunButton = new JButton("\u2609");
							SunButton.setAlignmentX(Component.CENTER_ALIGNMENT);
							panel_MainPlanet.add(SunButton);
							SunButton.addActionListener(new ActionListener(){
								public void actionPerformed(ActionEvent e){
									InputField[1].setText(InputField[1].getText()+"\u2609");
							}
							}
							);
								
							
							
							
							JButton VenusButton = new JButton("\u2640");
							VenusButton.setAlignmentX(Component.TOP_ALIGNMENT);
							panel_MainPlanet.add(VenusButton);
							VenusButton.addActionListener(new ActionListener(){
								public void actionPerformed(ActionEvent e){
									InputField[2].setText(InputField[2].getText()+"\u2640".toUpperCase());
							}
							}
							);
							
								
							JButton SaturnButton = new JButton("\u2644");
							SaturnButton.setAlignmentX(Component.CENTER_ALIGNMENT);
							panel_MainPlanet.add(SaturnButton);
											
							JButton PlutoButton = new JButton("\u2647");
							PlutoButton.setAlignmentX(Component.CENTER_ALIGNMENT);
							panel_MainPlanet.add(PlutoButton);
													
							JButton MoonButton = new JButton("\u263D");
							MoonButton.setAlignmentX(Component.CENTER_ALIGNMENT);
							panel_MainPlanet.add(MoonButton);
															
							JButton MarsButton = new JButton("\u2642");
							MarsButton.setAlignmentX(Component.CENTER_ALIGNMENT);
							panel_MainPlanet.add(MarsButton);
																	
							JButton UranusButton = new JButton("\u2645");
							UranusButton.setAlignmentX(Component.CENTER_ALIGNMENT);
							panel_MainPlanet.add(UranusButton);
																			
							JButton ProserpineButton = new JButton("]\u00B7[");
							ProserpineButton.setAlignmentX(Component.CENTER_ALIGNMENT);
							panel_MainPlanet.add(ProserpineButton);
																					
							JButton MercuryButton = new JButton("\u263F");
							MercuryButton.setAlignmentX(Component.CENTER_ALIGNMENT);
							panel_MainPlanet.add(MercuryButton);
																							
							JButton JupiterButton = new JButton("\u2643");
							JupiterButton.setAlignmentX(Component.CENTER_ALIGNMENT);
							panel_MainPlanet.add(JupiterButton);
																									
							JButton NeptuneButton = new JButton("\u2646");
							NeptuneButton.setAlignmentX(Component.CENTER_ALIGNMENT);
							panel_MainPlanet.add(NeptuneButton);
																											
																													JButton ChironButton = new JButton("\u26B7");
																													ChironButton.setAlignmentX(Component.CENTER_ALIGNMENT);
																													panel_MainPlanet.add(ChironButton);
				
				
						JPanel panel_AdditionalPlanet = new JPanel();
						panel_AdditionalPlanet.setBorder(new EmptyBorder(5, 5, 5, 5));
						GridBagConstraints gbc_panel_AdditionalPlanet = new GridBagConstraints();
						gbc_panel_AdditionalPlanet.fill = GridBagConstraints.BOTH;
						gbc_panel_AdditionalPlanet.insets = new Insets(0, 0, 5, 0);
						gbc_panel_AdditionalPlanet.gridx = 0;
						gbc_panel_AdditionalPlanet.gridy = 1;
						panel_Planet.add(panel_AdditionalPlanet, gbc_panel_AdditionalPlanet);
						panel_AdditionalPlanet.setLayout(new GridLayout(1, 5, 3, 3));
			
					JButton SeleneButton = new JButton("\u26B3");
					SeleneButton.setAlignmentX(Component.CENTER_ALIGNMENT);
					panel_AdditionalPlanet.add(SeleneButton);
					
					
							JButton LiLithButton = new JButton("\u26B8");
							LiLithButton.setAlignmentX(Component.CENTER_ALIGNMENT);
							panel_AdditionalPlanet.add(LiLithButton);
							
									JButton RahuButton = new JButton("\u260A");
									RahuButton.setAlignmentX(Component.CENTER_ALIGNMENT);
									panel_AdditionalPlanet.add(RahuButton);
									
											JButton KetuButton = new JButton("\u260B");
											KetuButton.setAlignmentX(Component.CENTER_ALIGNMENT);
											panel_AdditionalPlanet.add(KetuButton);
											
													JButton WheelOFFortuneButton = new JButton("\u2295");
													WheelOFFortuneButton.setAlignmentX(Component.CENTER_ALIGNMENT);
													panel_AdditionalPlanet.add(WheelOFFortuneButton);
													
															JButton DoomCrossButton = new JButton("\u2670");
															DoomCrossButton.setAlignmentX(Component.CENTER_ALIGNMENT);
															panel_AdditionalPlanet.add(DoomCrossButton);
			
			
				JPanel panel_Asteroid = new JPanel();
				panel_Asteroid.setBorder(new EmptyBorder(5, 5, 5, 5));
				GridBagConstraints gbc_panel_Asteroid = new GridBagConstraints();
				gbc_panel_Asteroid.fill = GridBagConstraints.BOTH;
				gbc_panel_Asteroid.insets = new Insets(0, 0, 5, 0);
				gbc_panel_Asteroid.gridx = 0;
				gbc_panel_Asteroid.gridy = 2;
				panel_Planet.add(panel_Asteroid, gbc_panel_Asteroid);
				panel_Asteroid.setLayout(new GridLayout(4, 4, 3, 3));
				
						JButton VestaButton = new JButton("\u26B6");
						VestaButton.setAlignmentX(Component.CENTER_ALIGNMENT);
						panel_Asteroid.add(VestaButton);
						
								JButton PalladaButton = new JButton("\u26B4");
								PalladaButton.setAlignmentX(Component.CENTER_ALIGNMENT);
								panel_Asteroid.add(PalladaButton);
								
										JButton CereraButton = new JButton("\u26B3");
										CereraButton.setAlignmentX(Component.CENTER_ALIGNMENT);
										panel_Asteroid.add(CereraButton);
										
												JButton JunoButton = new JButton("\u26B5");
												JunoButton.setAlignmentX(Component.CENTER_ALIGNMENT);
												panel_Asteroid.add(JunoButton);
												
														JButton HygieaButton = new JButton("\u2695");
														HygieaButton.setAlignmentX(Component.CENTER_ALIGNMENT);
														panel_Asteroid.add(HygieaButton);
														
																JButton PsycheButton = new JButton(" ");
																PsycheButton.setAlignmentX(Component.CENTER_ALIGNMENT);
																panel_Asteroid.add(PsycheButton);
																
																		JButton GaiaButton = new JButton("\u2641");
																		GaiaButton.setAlignmentX(Component.CENTER_ALIGNMENT);
																		panel_Asteroid.add(GaiaButton);
																		
																				JButton IridaButton = new JButton(" ");
																				IridaButton.setAlignmentX(Component.CENTER_ALIGNMENT);
																				panel_Asteroid.add(IridaButton);
																				
																						JButton ErothButton = new JButton("\u03B5");
																						ErothButton.setAlignmentX(Component.CENTER_ALIGNMENT);
																						panel_Asteroid.add(ErothButton);
																						
																								JButton AmourButton = new JButton("\u03B1");
																								AmourButton.setAlignmentX(Component.CENTER_ALIGNMENT);
																								panel_Asteroid.add(AmourButton);
																								
																										JButton KupidonButton = new JButton("\u039A");
																										KupidonButton.setAlignmentX(Component.CENTER_ALIGNMENT);
																										panel_Asteroid.add(KupidonButton);
																										
																												JButton SaphoButton = new JButton("\u03C3");
																												SaphoButton.setAlignmentX(Component.CENTER_ALIGNMENT);
																												panel_Asteroid.add(SaphoButton);
																												
																														JButton IkarButton = new JButton("\u0399");
																														IkarButton.setAlignmentX(Component.CENTER_ALIGNMENT);
																														panel_Asteroid.add(IkarButton);
																														
																																JButton BachusButton = new JButton("\u0392");
																																BachusButton.setAlignmentX(Component.CENTER_ALIGNMENT);
																																panel_Asteroid.add(BachusButton);
																																
																																		JButton PandoraButton = new JButton("\u03A1");
																																		PandoraButton.setAlignmentX(Component.CENTER_ALIGNMENT);
																																		panel_Asteroid.add(PandoraButton);
																																		
																																				JButton UraniaButton = new JButton("\u039F\u03C5");
																																				UraniaButton.setAlignmentX(Component.CENTER_ALIGNMENT);
																																				panel_Asteroid.add(UraniaButton);
			
	JPanel panel_Moon = new JPanel();
	panel_Moon.setBorder(new EmptyBorder(5, 5, 5, 5));
	GridBagConstraints gbc_panel_Moon = new GridBagConstraints();
	gbc_panel_Moon.fill = GridBagConstraints.BOTH;
	gbc_panel_Moon.gridx = 0;
	gbc_panel_Moon.gridy = 3;
	panel_Planet.add(panel_Moon, gbc_panel_Moon);
	panel_Moon.setLayout(new GridLayout(1, 6, 3, 3));
	
					JButton NewMoonButton = new JButton("\u25CF");
					NewMoonButton.setAlignmentX(Component.CENTER_ALIGNMENT);
					panel_Moon.add(NewMoonButton);
					
					JButton FullMoonButton = new JButton("\u25CB");
					FullMoonButton.setAlignmentX(Component.CENTER_ALIGNMENT);
					panel_Moon.add(FullMoonButton);
					
							JButton FirstQuarthButton = new JButton("\u263D");
							FirstQuarthButton.setAlignmentX(Component.CENTER_ALIGNMENT);
							panel_Moon.add(FirstQuarthButton);
							
									JButton LastQuarthButton = new JButton("\u263E");
									LastQuarthButton.setAlignmentX(Component.CENTER_ALIGNMENT);
									panel_Moon.add(LastQuarthButton);
									
											JButton FirstQuarth1Button = new JButton("\u25D0");
											FirstQuarth1Button.setAlignmentX(Component.CENTER_ALIGNMENT);
											panel_Moon.add(FirstQuarth1Button);
											
													JButton LastQuarth1Button = new JButton("\u25D1");
													LastQuarth1Button.setAlignmentX(Component.CENTER_ALIGNMENT);
													panel_Moon.add(LastQuarth1Button);
		
													
		JPanel panel_functional = new JPanel();
		panel_functional.setBorder(new EmptyBorder(5, 5, 5, 5));
		GridBagConstraints gbc_panel_functional = new GridBagConstraints();
		gbc_panel_functional.fill = GridBagConstraints.BOTH;
		gbc_panel_functional.gridx = 0;
		gbc_panel_functional.gridy = 4;
		panel_Planet.add(panel_functional, gbc_panel_functional);
		panel_functional.setLayout(new GridLayout(1,5,3,3));
															
		
		
														JButton LeftParenthButton = new JButton("(");
														panel_functional.add(LeftParenthButton);
														
														JButton RightParenthButton = new JButton(")");
														panel_functional.add(RightParenthButton);
														
														JButton TopRegisterButton = new JButton("\u2E22");
														panel_functional.add(TopRegisterButton);
														
														JButton SaveButton = new JButton("S");												
														panel_functional.add(SaveButton);
														
														JButton DeleteButton = new JButton(" ");												
														panel_functional.add(DeleteButton);
														
														JButton CalculateButton = new JButton("\u21B5");
														
														panel_functional.add(CalculateButton);												
													
													
													
													
	JPanel panel_Houses_Signs = new JPanel();
	panel_Houses_Signs.setBorder(new EmptyBorder(5, 5, 5, 5));
	frame.getContentPane().add(panel_Houses_Signs, BorderLayout.CENTER);
		GridBagLayout gbl_panel_Houses_Signs = new GridBagLayout();
		gbl_panel_Houses_Signs.columnWidths = new int[]{315, 0};
		//gbl_panel_Houses_Signs.rowHeights = new int[]{135, 135, 135, 0};
		gbl_panel_Houses_Signs.columnWeights = new double[]{0.0, Double.MIN_VALUE};
		gbl_panel_Houses_Signs.rowWeights = new double[]{3.0, 5.0, 4.0};
		panel_Houses_Signs.setLayout(gbl_panel_Houses_Signs);
		
			JPanel panel_Signs = new JPanel();
			panel_Signs.setBorder(new EmptyBorder(5, 5, 5, 5));
			GridBagConstraints gbc_panel_Signs = new GridBagConstraints();
			gbc_panel_Signs.fill = GridBagConstraints.BOTH;
			gbc_panel_Signs.insets = new Insets(0, 0, 5, 0);
			gbc_panel_Signs.gridx = 0;
			gbc_panel_Signs.gridy = 0;
			panel_Houses_Signs.add(panel_Signs, gbc_panel_Signs);
			panel_Signs.setLayout(new GridLayout(3, 4, 3, 3));
			
					JButton AriesButton = new JButton("\u2648");
					AriesButton.setAlignmentX(Component.CENTER_ALIGNMENT);
					panel_Signs.add(AriesButton);
					
						JButton TaurusButton = new JButton("\u2649");
						TaurusButton.setAlignmentX(Component.CENTER_ALIGNMENT);
						panel_Signs.add(TaurusButton);
						
						JButton GeminiButton = new JButton("\u264A");
						GeminiButton.setAlignmentX(Component.CENTER_ALIGNMENT);
						panel_Signs.add(GeminiButton);
						
									JButton CancerButton = new JButton("\u264B");
									CancerButton.setAlignmentX(Component.CENTER_ALIGNMENT);
									panel_Signs.add(CancerButton);
									
												JButton LeoButton = new JButton("\u264C");
												LeoButton.setAlignmentX(Component.CENTER_ALIGNMENT);
												panel_Signs.add(LeoButton);
												
															JButton VirgoButton = new JButton("\u264D");
															VirgoButton.setAlignmentX(Component.CENTER_ALIGNMENT);
															panel_Signs.add(VirgoButton);
															
																		JButton LibraButton = new JButton("\u264E");
																		LibraButton.setAlignmentX(Component.CENTER_ALIGNMENT);
																		panel_Signs.add(LibraButton);
																		
																					JButton ScorpiusButton = new JButton("\u264F");
																					ScorpiusButton.setAlignmentX(Component.CENTER_ALIGNMENT);
																					panel_Signs.add(ScorpiusButton);
																					
																								JButton SaggutariusButton = new JButton("\u2650");
																								SaggutariusButton.setAlignmentX(Component.CENTER_ALIGNMENT);
																								panel_Signs.add(SaggutariusButton);
																								
																											JButton CapricornusButton = new JButton("\u2651");
																											CapricornusButton.setAlignmentX(Component.CENTER_ALIGNMENT);
																											panel_Signs.add(CapricornusButton);
																											
																														JButton AquariusButton = new JButton("\u2652");
																														AquariusButton.setAlignmentX(Component.CENTER_ALIGNMENT);
																														panel_Signs.add(AquariusButton);
																														
																																	JButton PiscesButton = new JButton("\u2653");
																																	PiscesButton.setAlignmentX(Component.CENTER_ALIGNMENT);
																																	panel_Signs.add(PiscesButton);
	
			JPanel panel_Houses = new JPanel();
			panel_Houses.setBorder(new EmptyBorder(5, 5, 5, 5));
			GridBagConstraints gbc_panel_Houses = new GridBagConstraints();
			gbc_panel_Houses.fill = GridBagConstraints.BOTH;
			gbc_panel_Houses.insets = new Insets(0, 0, 5, 0);
			gbc_panel_Houses.gridx = 0;
			gbc_panel_Houses.gridy = 1;
			panel_Houses_Signs.add(panel_Houses, gbc_panel_Houses);
			panel_Houses.setLayout(new GridLayout(5, 4, 3, 3));
			
				JButton FirstButton = new JButton("AC");
				FirstButton.setAlignmentX(Component.CENTER_ALIGNMENT);
				panel_Houses.add(FirstButton);
				
					JButton SecondButton = new JButton("\u2161");
					SecondButton.setAlignmentX(Component.CENTER_ALIGNMENT);
					panel_Houses.add(SecondButton);
					
						JButton ThirdButton = new JButton("\u2162");
						ThirdButton.setAlignmentX(Component.CENTER_ALIGNMENT);
						panel_Houses.add(ThirdButton);
						
							JButton ForthButton = new JButton("IC");
							ForthButton.setAlignmentX(Component.CENTER_ALIGNMENT);
							panel_Houses.add(ForthButton);
							
								JButton FifthButton = new JButton("\u2164");
								FifthButton.setAlignmentX(Component.CENTER_ALIGNMENT);
								panel_Houses.add(FifthButton);
								
									JButton SixthButton = new JButton("\u2165");
									SixthButton.setAlignmentX(Component.CENTER_ALIGNMENT);
									panel_Houses.add(SixthButton);
									
										JButton SeventhButton = new JButton("DC");
										SeventhButton.setAlignmentX(Component.CENTER_ALIGNMENT);
										panel_Houses.add(SeventhButton);
										
											JButton EighthButton = new JButton("\u2167");
											EighthButton.setAlignmentX(Component.CENTER_ALIGNMENT);
											panel_Houses.add(EighthButton);
											
												JButton NinthButton = new JButton("\u2168");
												NinthButton.setAlignmentX(Component.CENTER_ALIGNMENT);
												panel_Houses.add(NinthButton);
												
													JButton TenthButton = new JButton("MC");
													TenthButton.setAlignmentX(Component.CENTER_ALIGNMENT);
													panel_Houses.add(TenthButton);
													
														JButton EleventhButton = new JButton("\u216A");
														EleventhButton.setAlignmentX(Component.CENTER_ALIGNMENT);
														panel_Houses.add(EleventhButton);
														
															JButton TvelfthButton = new JButton("\u216B");
															TvelfthButton.setAlignmentX(Component.CENTER_ALIGNMENT);
															panel_Houses.add(TvelfthButton);
															
																JButton FirstThirdButton = new JButton("1/3");
																FirstThirdButton.setAlignmentX(Component.CENTER_ALIGNMENT);
																panel_Houses.add(FirstThirdButton);
																
																	JButton SecondThirdButton = new JButton("2/3");
																	SecondThirdButton.setAlignmentX(Component.CENTER_ALIGNMENT);
																	panel_Houses.add(SecondThirdButton);
																	
																		JButton ThirdThirdButton = new JButton("3/3");
																		ThirdThirdButton.setAlignmentX(Component.CENTER_ALIGNMENT);
																		panel_Houses.add(ThirdThirdButton);
																		
																			JButton KuspidButton = new JButton("Ksp");
																			KuspidButton.setAlignmentX(Component.CENTER_ALIGNMENT);
																			panel_Houses.add(KuspidButton);
																			
																				JButton VortexButton = new JButton("Vrtx");
																				VortexButton.setAlignmentX(Component.CENTER_ALIGNMENT);
																				panel_Houses.add(VortexButton);
			
	JPanel panel_Degrees = new JPanel();
	panel_Degrees.setBorder(new EmptyBorder(5, 5, 5, 5));
	GridBagConstraints gbc_panel_Degrees = new GridBagConstraints();
	gbc_panel_Degrees.fill = GridBagConstraints.BOTH;
	gbc_panel_Degrees.gridx = 0;
	gbc_panel_Degrees.gridy = 2;
	panel_Houses_Signs.add(panel_Degrees, gbc_panel_Degrees);
	panel_Degrees.setLayout(new GridLayout(4, 4, 3, 3));
	
		JButton Button1 = new JButton("1");
		Button1.setAlignmentX(Component.CENTER_ALIGNMENT);
		panel_Degrees.add(Button1);
		
			JButton Button2 = new JButton("2");
			Button2.setAlignmentX(Component.CENTER_ALIGNMENT);
			panel_Degrees.add(Button2);
			
				JButton Button3 = new JButton("3");
				Button3.setAlignmentX(Component.CENTER_ALIGNMENT);
				panel_Degrees.add(Button3);
				
					JButton Button4 = new JButton("4");
					Button4.setAlignmentX(Component.CENTER_ALIGNMENT);
					panel_Degrees.add(Button4);
					
						JButton Button5 = new JButton("5");
						Button5.setAlignmentX(Component.CENTER_ALIGNMENT);
						panel_Degrees.add(Button5);
						
							JButton Button6 = new JButton("6");
							Button6.setAlignmentX(Component.CENTER_ALIGNMENT);
							panel_Degrees.add(Button6);
							
								JButton Button7 = new JButton("7");
								Button7.setAlignmentX(Component.CENTER_ALIGNMENT);
								panel_Degrees.add(Button7);
								
									JButton Button8 = new JButton("8");
									Button8.setAlignmentX(Component.CENTER_ALIGNMENT);
									panel_Degrees.add(Button8);
									
										JButton Button9 = new JButton("9");
										Button9.setAlignmentX(Component.CENTER_ALIGNMENT);
										panel_Degrees.add(Button9);
										
											JButton Button0 = new JButton("0");
											Button0.setAlignmentX(Component.CENTER_ALIGNMENT);
											panel_Degrees.add(Button0);
											
												JButton ButtonDegree = new JButton("\u00B0");
												ButtonDegree.setAlignmentX(Component.CENTER_ALIGNMENT);
												panel_Degrees.add(ButtonDegree);
				
	JPanel panel_Zones = new JPanel();
	panel_Zones.setBorder(new EmptyBorder(5, 5, 5, 5));
	frame.getContentPane().add(panel_Zones, BorderLayout.EAST);
		GridBagLayout gbl_panel_Zones = new GridBagLayout();
		gbl_panel_Zones.columnWidths = new int[]{300, 0};
		//gbl_panel_Zones.rowHeights = new int[]{103, 103, 103, 103, 0};
		gbl_panel_Zones.columnWeights = new double[]{0.0, Double.MIN_VALUE};
		gbl_panel_Zones.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0};
		panel_Zones.setLayout(gbl_panel_Zones);
		
		JPanel panel_Aspect = new JPanel();
		panel_Aspect.setBorder(new EmptyBorder(5, 5, 5, 5));
		GridBagConstraints gbc_panel_Aspect = new GridBagConstraints();
		gbc_panel_Aspect.fill = GridBagConstraints.BOTH;
		gbc_panel_Aspect.insets = new Insets(0, 0, 5, 0);
		gbc_panel_Aspect.gridx = 0;
		gbc_panel_Aspect.gridy = 0;
		panel_Zones.add(panel_Aspect, gbc_panel_Aspect);
		panel_Aspect.setLayout(new GridLayout(5, 4, 3, 3));
		
		
			JButton OppositionButton = new JButton("\u260D");
			OppositionButton.setAlignmentX(Component.CENTER_ALIGNMENT);
			panel_Aspect.add(OppositionButton);
			
				JButton ConjunctionButton = new JButton("\u260C");
				ConjunctionButton.setAlignmentX(Component.CENTER_ALIGNMENT);
				panel_Aspect.add(ConjunctionButton);
				
					JButton TrinButton = new JButton("\u25B3");
					TrinButton.setAlignmentX(Component.CENTER_ALIGNMENT);
					panel_Aspect.add(TrinButton);
					
						JButton QudratureButton = new JButton("\u25A1");
						QudratureButton.setAlignmentX(Component.CENTER_ALIGNMENT);
						panel_Aspect.add(QudratureButton);
						
							JButton QuintilButton = new JButton("Q");
							QuintilButton.setAlignmentX(Component.CENTER_ALIGNMENT);
							panel_Aspect.add(QuintilButton);
							
								JButton HalfQudratureButton = new JButton("\u27E4");
								HalfQudratureButton.setAlignmentX(Component.CENTER_ALIGNMENT);
								panel_Aspect.add(HalfQudratureButton);
								
									JButton HalfQudrature2Button = new JButton("\u27E5");
									HalfQudrature2Button.setAlignmentX(Component.CENTER_ALIGNMENT);
									panel_Aspect.add(HalfQudrature2Button);
									
										JButton SextileButton = new JButton("\u2731");
										SextileButton.setAlignmentX(Component.CENTER_ALIGNMENT);
										panel_Aspect.add(SextileButton);
										
										JButton Aspect1Button = new JButton("\u2731");
										Aspect1Button.setAlignmentX(Component.CENTER_ALIGNMENT);
										panel_Aspect.add(Aspect1Button);
										
											JButton Aspect2Button = new JButton("\u2731");
											Aspect2Button.setAlignmentX(Component.CENTER_ALIGNMENT);
											panel_Aspect.add(Aspect2Button);
											
												JButton Aspect3Button = new JButton("\u2731");
												Aspect3Button.setAlignmentX(Component.CENTER_ALIGNMENT);
												panel_Aspect.add(Aspect3Button);
												
													JButton Aspect4Button = new JButton("\u2731");
													Aspect4Button.setAlignmentX(Component.CENTER_ALIGNMENT);
													panel_Aspect.add(Aspect4Button);
													
														JButton Aspect5Button = new JButton("\u2731");
														Aspect5Button.setAlignmentX(Component.CENTER_ALIGNMENT);
														panel_Aspect.add(Aspect5Button);
														
															JButton Aspect6Button = new JButton("\u2731");
															Aspect6Button.setAlignmentX(Component.CENTER_ALIGNMENT);
															panel_Aspect.add(Aspect6Button);
															
																JButton Aspect7Button = new JButton("\u2731");
																Aspect7Button.setAlignmentX(Component.CENTER_ALIGNMENT);
																panel_Aspect.add(Aspect7Button);
																
																		JButton Aspect8Button = new JButton("\u2731");
																		Aspect8Button.setAlignmentX(Component.CENTER_ALIGNMENT);
																		panel_Aspect.add(Aspect8Button);
																		
																			JButton Aspect9Button = new JButton("\u2731");
																			Aspect9Button.setAlignmentX(Component.CENTER_ALIGNMENT);
																			panel_Aspect.add(Aspect9Button);
																			
																				JButton NeutralAspectButton = new JButton("\u21D4");
																				NeutralAspectButton.setAlignmentX(Component.CENTER_ALIGNMENT);
																				panel_Aspect.add(NeutralAspectButton);
																				
																					JButton GarmonicAspectButton = new JButton("\u21D4");
																					GarmonicAspectButton.setAlignmentX(Component.CENTER_ALIGNMENT);
																					panel_Aspect.add(GarmonicAspectButton);
																					
																						JButton DisGarmonicAspectButton = new JButton("\u21D4");
																						DisGarmonicAspectButton.setAlignmentX(Component.CENTER_ALIGNMENT);
																						panel_Aspect.add(DisGarmonicAspectButton);
		
		JPanel panel_Time_Birth_Elements_Directions = new JPanel();
		panel_Time_Birth_Elements_Directions.setBorder(new EmptyBorder(5, 5, 5, 5));
		GridBagConstraints gbc_panel_Time_Birth_Elements_Directions = new GridBagConstraints();
		gbc_panel_Time_Birth_Elements_Directions.fill = GridBagConstraints.BOTH;
		gbc_panel_Time_Birth_Elements_Directions.insets = new Insets(0, 0, 5, 0);
		gbc_panel_Time_Birth_Elements_Directions.gridx = 0;
		gbc_panel_Time_Birth_Elements_Directions.gridy = 1;
		panel_Zones.add(panel_Time_Birth_Elements_Directions, gbc_panel_Time_Birth_Elements_Directions);
		panel_Time_Birth_Elements_Directions.setLayout(new GridLayout(3, 4, 3, 3));
		
			JButton FireButton = new JButton("\u25B3");
			FireButton.setAlignmentX(Component.CENTER_ALIGNMENT);
			panel_Time_Birth_Elements_Directions.add(FireButton);
			
				JButton WaterButton = new JButton("\u25BD");
				WaterButton.setAlignmentX(Component.CENTER_ALIGNMENT);
				panel_Time_Birth_Elements_Directions.add(WaterButton);
				
					JButton AirButton = new JButton("\u2A3A");
					AirButton.setAlignmentX(Component.CENTER_ALIGNMENT);
					panel_Time_Birth_Elements_Directions.add(AirButton);
					
						JButton EarthButton = new JButton("\u25BC");
						EarthButton.setAlignmentX(Component.CENTER_ALIGNMENT);
						panel_Time_Birth_Elements_Directions.add(EarthButton);
						
							JButton DawnButton = new JButton(" ");
							DawnButton.setAlignmentX(Component.CENTER_ALIGNMENT);
							panel_Time_Birth_Elements_Directions.add(DawnButton);
							
								JButton NoonButton = new JButton(" ");
								NoonButton.setAlignmentX(Component.CENTER_ALIGNMENT);
								panel_Time_Birth_Elements_Directions.add(NoonButton);
								
									JButton EveningButton = new JButton(" ");
									EveningButton.setAlignmentX(Component.CENTER_ALIGNMENT);
									panel_Time_Birth_Elements_Directions.add(EveningButton);
									
										JButton NightButton = new JButton(" ");
										NightButton.setAlignmentX(Component.CENTER_ALIGNMENT);
										panel_Time_Birth_Elements_Directions.add(NightButton);
										
											JButton EastButton = new JButton("E");
											EastButton.setAlignmentX(Component.CENTER_ALIGNMENT);
											panel_Time_Birth_Elements_Directions.add(EastButton);
											
												JButton SouthButton = new JButton("S");
												SouthButton.setAlignmentX(Component.CENTER_ALIGNMENT);
												panel_Time_Birth_Elements_Directions.add(SouthButton);
												
													JButton WestButton = new JButton("W");
													WestButton.setAlignmentX(Component.CENTER_ALIGNMENT);
													panel_Time_Birth_Elements_Directions.add(WestButton);
													
														JButton NorthButton = new JButton("N");
														NorthButton.setAlignmentX(Component.CENTER_ALIGNMENT);
														panel_Time_Birth_Elements_Directions.add(NorthButton);
		
		JPanel panel_Trimurti_Cross_Decan = new JPanel();
		panel_Trimurti_Cross_Decan.setBorder(new EmptyBorder(5, 5, 5, 5));
		GridBagConstraints gbc_panel_Trimurti_Cross_Decan = new GridBagConstraints();
		gbc_panel_Trimurti_Cross_Decan.fill = GridBagConstraints.BOTH;
		gbc_panel_Trimurti_Cross_Decan.insets = new Insets(0, 0, 5, 0);
		gbc_panel_Trimurti_Cross_Decan.gridx = 0;
		gbc_panel_Trimurti_Cross_Decan.gridy = 2;
		panel_Zones.add(panel_Trimurti_Cross_Decan, gbc_panel_Trimurti_Cross_Decan);
		panel_Trimurti_Cross_Decan.setLayout(new GridLayout(4, 3, 3, 3));
		
			JButton BrahmaButton = new JButton("\u29B6");
			BrahmaButton.setAlignmentX(Component.CENTER_ALIGNMENT);
			panel_Trimurti_Cross_Decan.add(BrahmaButton);
			
				JButton VishnuButton = new JButton("\u29B5");
				VishnuButton.setAlignmentX(Component.CENTER_ALIGNMENT);
				panel_Trimurti_Cross_Decan.add(VishnuButton);
				
					JButton ShivaButton = new JButton("\u25F7");
					ShivaButton.setAlignmentX(Component.CENTER_ALIGNMENT);
					panel_Trimurti_Cross_Decan.add(ShivaButton);
					
						JButton CardinalCrossButton = new JButton("\u22A1");
						CardinalCrossButton.setAlignmentX(Component.CENTER_ALIGNMENT);
						panel_Trimurti_Cross_Decan.add(CardinalCrossButton);
						
							JButton FixedCrossButton = new JButton("\u229E");
							FixedCrossButton.setAlignmentX(Component.CENTER_ALIGNMENT);
							panel_Trimurti_Cross_Decan.add(FixedCrossButton);
							
								JButton MutableCrossButton = new JButton("\u233A");
								MutableCrossButton.setAlignmentX(Component.CENTER_ALIGNMENT);
								panel_Trimurti_Cross_Decan.add(MutableCrossButton);
								
									JButton FirstDecanButton = new JButton("\u0387");
									FirstDecanButton.setAlignmentX(Component.CENTER_ALIGNMENT);
									panel_Trimurti_Cross_Decan.add(FirstDecanButton);
									
												JButton SecondDecanButton = new JButton("\u2236");
												SecondDecanButton.setAlignmentX(Component.CENTER_ALIGNMENT);
												panel_Trimurti_Cross_Decan.add(SecondDecanButton);
												
															JButton ThirdDecanButton = new JButton("\u2235");
															ThirdDecanButton.setAlignmentX(Component.CENTER_ALIGNMENT);
															panel_Trimurti_Cross_Decan.add(ThirdDecanButton);
															
																		JButton MineButton = new JButton("\u25DA");
																		MineButton.setAlignmentX(Component.CENTER_ALIGNMENT);
																		panel_Trimurti_Cross_Decan.add(MineButton);
																		
																			JButton RethroButton = new JButton("R");
																			RethroButton.setAlignmentX(Component.CENTER_ALIGNMENT);
																			panel_Trimurti_Cross_Decan.add(RethroButton);
																			
																						JButton AlmutenButton = new JButton("A");
																						AlmutenButton.setAlignmentX(Component.CENTER_ALIGNMENT);
																						panel_Trimurti_Cross_Decan.add(AlmutenButton);
		
		JPanel panel_Aspectation = new JPanel();
		panel_Aspectation.setBorder(new EmptyBorder(5, 5, 5, 5));
		GridBagConstraints gbc_panel_Aspectation = new GridBagConstraints();
		gbc_panel_Aspectation.fill = GridBagConstraints.BOTH;
		gbc_panel_Aspectation.gridx = 0;
		gbc_panel_Aspectation.gridy = 3;
		panel_Zones.add(panel_Aspectation, gbc_panel_Aspectation);
		panel_Aspectation.setLayout(new GridLayout(1, 4, 3, 3));	
		
			JButton PositiveButton = new JButton("+");
			PositiveButton.setAlignmentX(Component.CENTER_ALIGNMENT);
			panel_Aspectation.add(PositiveButton);
			
				JButton NegativeButton = new JButton("-");
				NegativeButton.setAlignmentX(Component.CENTER_ALIGNMENT);
				panel_Aspectation.add(NegativeButton);
				
					JButton JanButton = new JButton("\u268C");
					JanButton.setAlignmentX(Component.CENTER_ALIGNMENT);
					panel_Aspectation.add(JanButton);
					
						JButton InButton = new JButton("\u268F");
						InButton.setAlignmentX(Component.CENTER_ALIGNMENT);
						panel_Aspectation.add(InButton);
		
	/** JPanel panel_functional = new JPanel();
	panel_functional.setBorder(new EmptyBorder(5, 5, 5, 5));
	frame.getContentPane().add(panel_functional, BorderLayout.SOUTH);
	panel_functional.setLayout(new GridLayout());
				
		JButton LeftParenthButton = new JButton("(");
		panel_functional.add(LeftParenthButton);
		
		JButton RightParenthButton = new JButton(")");
		panel_functional.add(RightParenthButton);
		
		JButton TopRegisterButton = new JButton("\u2E22");
		panel_functional.add(TopRegisterButton);
		
		JButton SaveButton = new JButton("S");
		panel_functional.add(SaveButton);
		
		JButton CalculateButton = new JButton("\u21B5");
		
		panel_functional.add(CalculateButton);
		**/
	}
}


