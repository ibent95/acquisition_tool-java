/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ibent95.acquisition;

import java.awt.EventQueue;

import com.ibent95.acquisition.view.MainFrame;

/**
 *
 * @author ibent95
 */
public class AcquisitionTool {

	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args) {
		System.out.println("Welcome to Acquisition Tool...");
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainFrame frame = new MainFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

}