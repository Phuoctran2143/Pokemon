package poke.view;

import java.awt.Color;
import poke.controller.PokemonController;
import javax.swing.*;
import java.awt.Dimension;
import java.awt.event.*;

public class PokemonPanel extends JPanel
{
	private PokemonController baseController;
	private ImageIcon pokemonIcon;
	private SpringLayout baseLayout;
	private JButton updateButton;
	private JComboBox pokedexSelector;
	private JLabel pokemonLabel;
	private JLabel healthLabel;
	private JLabel combatLabel;
	private JLabel speedLabel;
	private JLabel nameLabel;
	private JLabel numberLabel;
	private JLabel advancedLabel;
	private JLabel typeLabel;
	private JTextField healthField;
	private JTextField combatField;
	private JTextField speedField;
	private JTextField nameField;
	private JTextField numberField;
	private JTextArea advancedArea;
	private JTextField typeField;
	
	public PokemonPanel(PokemonController baseController)
	{
		super();
		
		this.baseController = baseController;
		baseLayout = new SpringLayout();
		this.pokemonIcon = new ImageIcon(getClass().getResource("/poke/view/images/pokeBall.png"));
		this.updateButton = new JButton("update");
		this.pokedexSelector = new JComboBox(baseController.getPokedexNames());
		this.pokemonLabel = new JLabel("Current pokemon", new ImageIcon(PokemonPanel.class.getResource("/poke/view/images/pokeBall.png")), SwingConstants.CENTER);
		this.healthLabel = new JLabel("HP:");
		this.combatLabel = new JLabel("CP:");
		this.speedLabel = new JLabel("Speed:");
		this.nameLabel = new JLabel("My Pokemons name:");
		this.numberLabel = new JLabel("Pokemon Number:");
		this.advancedLabel = new JLabel("Advanced Information:");
		this.typeLabel = new JLabel("Type:");
		this.healthField = new JTextField(5);
		this.combatField = new JTextField(5);
		this.speedField = new JTextField(5);
		this.advancedArea = new JTextArea(10,25);
		this.nameField = new JTextField(20);
		this.numberField = new JTextField(5);
		this.typeField = new JTextField(5);
		
		
		setupPanel();
		setupLayout();
		setupListeners();
	}
	
	private void setupPanel()
	{
		this.setLayout(baseLayout);
		this.setPreferredSize(new Dimension(900, 500));
		numberField.setEditable(false);
		advancedArea.setEditable(false);
		this.add(updateButton);
		this.add(pokedexSelector);
		this.add(pokemonLabel);
		this.add(healthLabel);
		this.add(combatLabel);
		this.add(speedLabel);
		this.add(nameLabel);
		this.add(numberLabel);
		this.add(advancedLabel);
		this.add(typeLabel);
		this.add(healthField);
		this.add(combatField);
		this.add(speedField);
		this.add(advancedArea);
		this.add(nameField);
		this.add(numberField);
		this.add(typeField);
	}
	
	private void setupLayout()
	{
		pokemonLabel.setVerticalTextPosition(JLabel.BOTTOM);
		pokemonLabel.setHorizontalTextPosition(JLabel.CENTER);	
		baseLayout.putConstraint(SpringLayout.EAST, healthField, 0, SpringLayout.EAST, numberField);
		baseLayout.putConstraint(SpringLayout.NORTH, numberField, 0, SpringLayout.NORTH, pokedexSelector);
		baseLayout.putConstraint(SpringLayout.WEST, numberField, 6, SpringLayout.EAST, numberLabel);
		baseLayout.putConstraint(SpringLayout.WEST, numberLabel, 6, SpringLayout.EAST, nameField);
		baseLayout.putConstraint(SpringLayout.WEST, nameLabel, 0, SpringLayout.WEST, nameField);
		baseLayout.putConstraint(SpringLayout.SOUTH, nameLabel, -7, SpringLayout.NORTH, nameField);
		baseLayout.putConstraint(SpringLayout.SOUTH, nameField, -6, SpringLayout.NORTH, pokemonLabel);
		baseLayout.putConstraint(SpringLayout.EAST, nameField, 0, SpringLayout.EAST, pokemonLabel);
		baseLayout.putConstraint(SpringLayout.NORTH, speedLabel, 3, SpringLayout.NORTH, speedField);
		baseLayout.putConstraint(SpringLayout.NORTH, speedField, 6, SpringLayout.SOUTH, combatField);
		baseLayout.putConstraint(SpringLayout.WEST, speedField, 0, SpringLayout.WEST, healthField);
		baseLayout.putConstraint(SpringLayout.NORTH, combatLabel, 3, SpringLayout.NORTH, combatField);
		baseLayout.putConstraint(SpringLayout.NORTH, combatField, 6, SpringLayout.SOUTH, healthField);
		baseLayout.putConstraint(SpringLayout.EAST, combatField, 0, SpringLayout.EAST, healthField);
		baseLayout.putConstraint(SpringLayout.NORTH, healthField, 0, SpringLayout.NORTH, pokemonLabel);
		baseLayout.putConstraint(SpringLayout.NORTH, numberLabel, 3, SpringLayout.NORTH, pokedexSelector);
		baseLayout.putConstraint(SpringLayout.WEST, pokemonLabel, 10, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.WEST, pokedexSelector, 0, SpringLayout.WEST, pokemonLabel);
		baseLayout.putConstraint(SpringLayout.SOUTH, pokedexSelector, -6, SpringLayout.NORTH, pokemonLabel);
		baseLayout.putConstraint(SpringLayout.NORTH, pokemonLabel, 89, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.SOUTH, pokemonLabel, -10, SpringLayout.SOUTH, this);
		baseLayout.putConstraint(SpringLayout.WEST, healthLabel, 417, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.EAST, pokemonLabel, -6, SpringLayout.WEST, healthLabel);
		baseLayout.putConstraint(SpringLayout.NORTH, healthLabel, 0, SpringLayout.NORTH, pokemonLabel);
		baseLayout.putConstraint(SpringLayout.WEST, combatLabel, 6, SpringLayout.EAST, pokemonLabel);
		baseLayout.putConstraint(SpringLayout.WEST, speedLabel, 6, SpringLayout.EAST, pokemonLabel);
		pokemonLabel.setVerticalAlignment(SwingConstants.BOTTOM);
		baseLayout.putConstraint(SpringLayout.EAST, pokedexSelector, -730, SpringLayout.EAST, this);
		baseLayout.putConstraint(SpringLayout.SOUTH, typeLabel, 0, SpringLayout.SOUTH, typeField);
		baseLayout.putConstraint(SpringLayout.NORTH, typeField, 6, SpringLayout.SOUTH, speedField);
		baseLayout.putConstraint(SpringLayout.EAST, typeField, 0, SpringLayout.EAST, healthField);
		baseLayout.putConstraint(SpringLayout.NORTH, updateButton, 6, SpringLayout.SOUTH, advancedArea);
		baseLayout.putConstraint(SpringLayout.EAST, updateButton, 0, SpringLayout.EAST, advancedArea);
		baseLayout.putConstraint(SpringLayout.NORTH, advancedArea, 6, SpringLayout.SOUTH, advancedLabel);
		baseLayout.putConstraint(SpringLayout.WEST, advancedArea, 6, SpringLayout.EAST, pokemonLabel);
		baseLayout.putConstraint(SpringLayout.WEST, advancedLabel, 6, SpringLayout.EAST, pokemonLabel);
		baseLayout.putConstraint(SpringLayout.NORTH, advancedLabel, 6, SpringLayout.SOUTH, typeLabel);
		baseLayout.putConstraint(SpringLayout.WEST, typeLabel, 6, SpringLayout.EAST, pokemonLabel);
		baseLayout.putConstraint(SpringLayout.WEST, updateButton, 6, SpringLayout.EAST, pokemonLabel);
	}
	
	private void setupListeners()
	{
		pokedexSelector.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent selection)
			{
				int selected = pokedexSelector.getSelectedIndex();
				nameField.setText(baseController.getPokedex().get(selected).getName());
				numberField.setText(baseController.getPokedex().get(selected).getNumber() + "");
				combatField.setText(baseController.getPokedex().get(selected).getAttackPoints() + "");
				speedField.setText(baseController.getPokedex().get(selected).getSpeed() + "");
				healthField.setText(baseController.getPokedex().get(selected).getHealthPoints() + ""); 
				typeField.setText(baseController.getPokedex().get(selected).getPokemonTypes());
				changeColorBasedOnData(baseController.getPokedex().get(selected).getPokemonTypes());
				changeImageDisplay(baseController.getPokedex().get(selected).getClass().getSimpleName());
			}
		});
		
		
		
		
		
		this.addMouseListener(new MouseListener()
		{
			public void mouseEntered(MouseEvent entered)
			{
//				JOptionPane.showMessageDialog(baseController.getBaseFrame(), "The mouse is in!");
			}
			
			public void mouseExited(MouseEvent exited)
			{
//				JOptionPane.showMessageDialog(baseController.getBaseFrame(), "The mouse is out!");
			}
			
			public void mousePressed(MouseEvent pressed)
			{
//				JOptionPane.showMessageDialog(baseController.getBaseFrame(), "The mouse was pressed!");
			}
			
			public void mouseReleased(MouseEvent released)
			{
//				JOptionPane.showMessageDialog(baseController.getBaseFrame(), "The mouse was released!");
			}
			
			public void mouseClicked(MouseEvent click)
			{
//				JOptionPane.showMessageDialog(baseController.getBaseFrame(), "The mouse was clicked!");
			}
		
		});
		
		this.addMouseMotionListener(new MouseMotionListener()
		{
			public void mouseDragged(MouseEvent dragged)
			{
				setRandomColor();
		
			}
			
			public void mouseMoved(MouseEvent moved)
			{

			}
			
		});
		
	}
	
	private void setRandomColor()
	{
		int red, green, blue;
		red = (int) (Math.random() * 256);
		green = (int) (Math.random() * 256);
		blue = (int) (Math.random() * 256);
		
		this.setBackground(new Color(red, green, blue));
		
		
		
	}
	
	private void changeColorBasedOnData(String data)
	{
		if (data.contains("Grass"))
		{
			this.setBackground(Color.GREEN);
		}
		else if (data.contains("Fire"))
		{
			this.setBackground(Color.RED);
		}
		else if (data.contains("Rock"))
		{
			this.setBackground(Color.GRAY);
		}
		else if (data.contains("Water"))
		{
			this.setBackground(Color.BLUE);
		}
		else if (data.contains("Electric"))
		{
			this.setBackground(Color.YELLOW);
		}
		
		repaint();
	}
	
	private void changeImageDisplay(String name)
	{
		String path = "/poke/view/images/";
		String defaultName = "Select Pokemon";
		String extension = ".jpg";


		
		try
		{
			pokemonIcon = new ImageIcon(getClass().getResource(path + name + extension));
			
		}
		catch (NullPointerException missingFile)
		{
			pokemonIcon = new ImageIcon(getClass().getResource(path + defaultName + extension));
		}
		pokemonLabel.setIcon(pokemonIcon);
		repaint();
		
		
		
		
	}
}
