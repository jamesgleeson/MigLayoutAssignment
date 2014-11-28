package com.devx.miglayout.swing.samples;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSeparator;
import javax.swing.JTable;
import javax.swing.JTextField;

import net.miginfocom.swing.MigLayout;


import java.awt.Color;
import java.awt.LayoutManager;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSeparator;
import javax.swing.JTable;
import javax.swing.JTextField;

import net.miginfocom.swing.MigLayout;

/**
 * Complex MigLayout sample
 * @author Jacek Furmankiewicz
 */
public class ComplexSample extends AbstractSampleFrame {

	public ComplexSample() {
		super("Donkey Sanctuary : Query DB");
	}

	protected void initComponents() {
		MigLayout layout = new MigLayout("wrap 2","[] [grow] []","[] [grow] [grow] [grow] []");
		setLayout(layout);
		
		
		//put all the panels together
		
		
		add(getClientPanel(),"grow");
		add(getAdditionalInformationPanel(),"grow");
		add(getNotesPanel(),"grow, span 10");
		
		
		add(getButtonsPanel(),"grow, span 3");
		add(getInformationPanel(),"grow, span 10");
		pack();
	}
	
	
	
	private JPanel getInformationPanel() {
		JPanel panel = getPanel("Report Generator");
		panel.setBackground(new Color(204, 153, 255));
		panel.setOpaque(true);
		panel.setLayout(new MigLayout("wrap 3","[] 16 [grow] []"));
		panel.add(new JLabel("Species"),"right");
		panel.add(new JTextField("Horse"),"growx");
		panel.add(new JCheckBox("In shelter",true));
		panel.add(new JLabel("From"),"right");
		panel.add(new JTextField("  01-01-2014   "),"growx");
		panel.add(new JCheckBox("Adopted",false));
		//field1.setEditable(true);
		panel.add(new JLabel("To"),"right");
		panel.add(new JTextField("  01-07-2014   "),"growx");
		panel.add(new JCheckBox("Fostered",false));
		panel.add(new JSeparator(),"growx");
		//panel.add(getImageButton("images/edit-redo.png", "Generate Report"),"wrap");
		
			
		return panel;
	}
	
	private JPanel getClientPanel() {
		JPanel panel = getPanel("Enter in Animal Record");
		panel.setLayout(new MigLayout("wrap 2","[] 18 []"));
		panel.setBackground(new Color(204, 153, 255));
		panel.setOpaque(true);
		
		panel.add(new JLabel("Animal Type:"),"right");
		//panel.add(new JLabel("Donkey"));
		panel.add(new JTextField("Donkey"),"growx");
	
		
		panel.add(new JLabel("Animal name:"),"right");
		panel.add(new JTextField("Jack Donk"),"growx");
		
		panel.add(new JLabel("Vaccination Date:"),"right");
		panel.add(new JTextField("January 6th 2014"),"growx");
		
		panel.add(new JLabel("Vet:"),"right");
		panel.add(new JTextField("John Steer"),"growx");
		
		panel.add(new JLabel("Registration #:"),"right");
		panel.add(new JTextField("#4534-AAC-324"),"growx");
		
		panel.add(new JLabel("Age"),"right");
		panel.add(new JTextField("2"),"growx");
		
		panel.add(new JLabel("Micorchip Number:"),"right");
		panel.add(new JTextField("#9860000023456"),"growx");

		
		return panel;
		
	}
	
	private JPanel getAdditionalInformationPanel() {
		JPanel panel = getPanel("Additional information");
		panel.setLayout(new MigLayout("wrap 2","[] 16 [grow][] []"));
		panel.setBackground(new Color(204, 153, 255));
		panel.setOpaque(true);
		
		panel.add(new JLabel("Worming dose:"),"right");
		panel.add(new JTextField("2 packets"),"span 4");
		
		//panel.add(new JButton("test"));
		
		panel.add(new JLabel("Worming Date:"),"right");
		panel.add(new JTextField("01-01-2014"),"growx");
		
		panel.add(new JLabel("Wormed by:"),"right");
		panel.add(new JTextField("Bad Mama"),"growx");

		panel.add(new JLabel("Area found"),"right");
		panel.add(new JTextField("Co Clare"),"growx");

		panel.add(new JLabel("Handed in by "),"right");
		panel.add(new JTextField("Clare Co Co"),"growx");

		panel.add(new JLabel("Whereabouts"),"right");
		panel.add(new JTextField("In foster care"),"growx");

		panel.add(new JLabel("Available for homing"),"right");
		panel.add(new JTextField("No"),"growx");
		
		//panel.add(getImageButton("images/edit-redo.png","Edit"),"growx");
		panel.add(new JSeparator(),"growx");
		return panel;
	}
	
	private JPanel getNotesPanel() {
		JPanel panel = getPanel("NOTES");
		panel.setLayout(new MigLayout("wrap 4","[grow] 16 [] 32 [] []","[grow,:100:] [] [] []"));
		panel.setBackground(new Color(204, 153, 255));
		panel.setOpaque(true);
		
		panel.add(getTable(""),
				"grow, span 3");

		return panel;
	}
		
	private JPanel getButtonsPanel() {
		JPanel panel = new JPanel();
		panel.setLayout(new MigLayout("","[] [grow, right]"));
	
		return panel;
	}
	
	private JPanel getPanel(String title) {
		JPanel panel = new JPanel();
		panel.setBorder(BorderFactory.createTitledBorder(title));
		return panel;
	}
	

	private JScrollPane getTable(Object...columns) {
		JTable table = new JTable(new Object[0][0], columns);
		JScrollPane scrollPane = new JScrollPane(table);
		table.setFillsViewportHeight(true);
		return scrollPane;
	}
	

}
