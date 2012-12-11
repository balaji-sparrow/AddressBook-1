/*
 * Copyright (c) 2010, Oracle. All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 * * Redistributions of source code must retain the above copyright notice,
 *   this list of conditions and the following disclaimer.
 *
 * * Redistributions in binary form must reproduce the above copyright notice,
 *   this list of conditions and the following disclaimer in the documentation
 *   and/or other materials provided with the distribution.
 *
 * * Neither the name of Oracle nor the names of its contributors
 *   may be used to endorse or promote products derived from this software without
 *   specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS"
 * AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE
 * IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE
 * ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE
 * LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR
 * CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF
 * SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS
 * INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN
 * CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE)
 * ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF
 * THE POSSIBILITY OF SUCH DAMAGE.
 */

package com.genix.addressbook.presentation;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import javax.swing.JOptionPane;

import com.genix.addressbook.entity.Person;
import com.genix.addressbook.entity.Phone;
import com.genix.addressbook.exception.CheckedException;
import com.genix.addressbook.exception.ValidationFailException;
import com.genix.addressbook.manager.PersonManager;
import com.genix.addressbook.util.PersonBuilder;
import com.genix.addressbook.util.PhoneBuilder;
import com.genix.addressbook.util.ResourceLocator;

public class AddressForm extends javax.swing.JFrame {

	private final static String newline = "\n";

	/**
	 * Creates new form ContactEditor
	 */
	public AddressForm() {
		initComponents();
	}

	/**
	 * This method is called from within the constructor to initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is always
	 * regenerated by the Form Editor.
	 */
	// <editor-fold defaultstate="collapsed" desc="Generated Code">
	private void initComponents() {

		buttonGroup1 = new javax.swing.ButtonGroup();
		jPanel1 = new javax.swing.JPanel();
		jLabel1 = new javax.swing.JLabel();
		txtfName = new javax.swing.JTextField();
		jLabel3 = new javax.swing.JLabel();
		txtlName = new javax.swing.JTextField();
		jLabel5 = new javax.swing.JLabel();
		txtStreet = new javax.swing.JTextField();
		txtSuburb = new javax.swing.JTextField();
		jLabel8 = new javax.swing.JLabel();
		jLabel9 = new javax.swing.JLabel();
		txtState = new javax.swing.JTextField();
		jLabel10 = new javax.swing.JLabel();
		txtPostCode = new javax.swing.JTextField();
		jLabel12 = new javax.swing.JLabel();
		txtPhoneNumbers = new javax.swing.JTextField();
		jScrollPane2 = new javax.swing.JScrollPane();
		txtAreaNumbers = new javax.swing.JTextArea();
		jButton8 = new javax.swing.JButton();
		btnFindPerson = new javax.swing.JButton();
		btnDeletePerson = new javax.swing.JButton();
		btnAddPerson = new javax.swing.JButton();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		setTitle("E-mail Contacts");

		jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(" Name "));

		jLabel1.setText("First Name:");

		jLabel3.setText("Last Name");

		jLabel5.setText("Street");

		jLabel8.setText("Suburb");

		jLabel9.setText("State");

		jLabel10.setText("Post Code");

		jLabel12.setText("Phone NUmber");

		txtPhoneNumbers.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				txtPhoneNumbersActionPerformed(evt);
			}
		});

		txtAreaNumbers.setColumns(20);
		txtAreaNumbers.setRows(5);
		jScrollPane2.setViewportView(txtAreaNumbers);

		jButton8.setText("add");
		jButton8.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton8ActionPerformed(evt);
			}
		});

		org.jdesktop.layout.GroupLayout jPanel1Layout = new org.jdesktop.layout.GroupLayout(jPanel1);
		jPanel1.setLayout(jPanel1Layout);
		jPanel1Layout.setHorizontalGroup(jPanel1Layout
		                .createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
		                .add(jPanel1Layout
		                                .createSequentialGroup()
		                                .addContainerGap()
		                                .add(jPanel1Layout
		                                                .createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
		                                                .add(jPanel1Layout.createSequentialGroup().add(jLabel12).add(314, 314, 314)
		                                                                .add(jButton8))
		                                                .add(org.jdesktop.layout.GroupLayout.TRAILING,
		                                                                jPanel1Layout.createSequentialGroup()
		                                                                                .add(jPanel1Layout
		                                                                                                .createParallelGroup(
		                                                                                                                org.jdesktop.layout.GroupLayout.LEADING)
		                                                                                                .add(jPanel1Layout
		                                                                                                                .createParallelGroup(
		                                                                                                                                org.jdesktop.layout.GroupLayout.TRAILING)
		                                                                                                                .add(jLabel5)
		                                                                                                                .add(jLabel3)
		                                                                                                                .add(jLabel1))
		                                                                                                .add(org.jdesktop.layout.GroupLayout.TRAILING,
		                                                                                                                jLabel8)
		                                                                                                .add(org.jdesktop.layout.GroupLayout.TRAILING,
		                                                                                                                jLabel9)
		                                                                                                .add(org.jdesktop.layout.GroupLayout.TRAILING,
		                                                                                                                jLabel10))
		                                                                                .addPreferredGap(
		                                                                                                org.jdesktop.layout.LayoutStyle.RELATED,
		                                                                                                org.jdesktop.layout.GroupLayout.DEFAULT_SIZE,
		                                                                                                Short.MAX_VALUE)
		                                                                                .add(jPanel1Layout
		                                                                                                .createParallelGroup(
		                                                                                                                org.jdesktop.layout.GroupLayout.LEADING)
		                                                                                                .add(txtPhoneNumbers,
		                                                                                                                org.jdesktop.layout.GroupLayout.PREFERRED_SIZE,
		                                                                                                                260,
		                                                                                                                org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
		                                                                                                .add(jPanel1Layout
		                                                                                                                .createParallelGroup(
		                                                                                                                                org.jdesktop.layout.GroupLayout.TRAILING,
		                                                                                                                                false)
		                                                                                                                .add(txtPostCode,
		                                                                                                                                org.jdesktop.layout.GroupLayout.DEFAULT_SIZE,
		                                                                                                                                319,
		                                                                                                                                Short.MAX_VALUE)
		                                                                                                                .add(txtStreet)
		                                                                                                                .add(txtlName)
		                                                                                                                .add(txtfName)
		                                                                                                                .add(org.jdesktop.layout.GroupLayout.LEADING,
		                                                                                                                                txtSuburb)
		                                                                                                                .add(org.jdesktop.layout.GroupLayout.LEADING,
		                                                                                                                                txtState))))
		                                                .add(org.jdesktop.layout.GroupLayout.TRAILING, jScrollPane2,
		                                                                org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 319,
		                                                                org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)).add(67, 67, 67)));
		jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING).add(
		                jPanel1Layout.createSequentialGroup()
		                                .add(jPanel1Layout
		                                                .createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
		                                                .add(jLabel1)
		                                                .add(txtfName, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE,
		                                                                org.jdesktop.layout.GroupLayout.DEFAULT_SIZE,
		                                                                org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
		                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
		                                .add(jPanel1Layout
		                                                .createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
		                                                .add(jLabel3)
		                                                .add(txtlName, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE,
		                                                                org.jdesktop.layout.GroupLayout.DEFAULT_SIZE,
		                                                                org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
		                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
		                                .add(jPanel1Layout
		                                                .createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
		                                                .add(jLabel5)
		                                                .add(txtStreet, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE,
		                                                                org.jdesktop.layout.GroupLayout.DEFAULT_SIZE,
		                                                                org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
		                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
		                                .add(jPanel1Layout
		                                                .createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
		                                                .add(txtSuburb, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE,
		                                                                org.jdesktop.layout.GroupLayout.DEFAULT_SIZE,
		                                                                org.jdesktop.layout.GroupLayout.PREFERRED_SIZE).add(jLabel8))
		                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
		                                .add(jPanel1Layout
		                                                .createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
		                                                .add(txtState, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE,
		                                                                org.jdesktop.layout.GroupLayout.DEFAULT_SIZE,
		                                                                org.jdesktop.layout.GroupLayout.PREFERRED_SIZE).add(jLabel9))
		                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
		                                .add(jPanel1Layout
		                                                .createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
		                                                .add(txtPostCode, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE,
		                                                                org.jdesktop.layout.GroupLayout.DEFAULT_SIZE,
		                                                                org.jdesktop.layout.GroupLayout.PREFERRED_SIZE).add(jLabel10))
		                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
		                                .add(jPanel1Layout
		                                                .createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
		                                                .add(jLabel12)
		                                                .add(jPanel1Layout
		                                                                .createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
		                                                                .add(txtPhoneNumbers,
		                                                                                org.jdesktop.layout.GroupLayout.PREFERRED_SIZE,
		                                                                                org.jdesktop.layout.GroupLayout.DEFAULT_SIZE,
		                                                                                org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
		                                                                .add(jButton8)))
		                                .add(7, 7, 7)
		                                .add(jScrollPane2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE,
		                                                org.jdesktop.layout.GroupLayout.DEFAULT_SIZE,
		                                                org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
		                                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));

		btnFindPerson.setText("Find Person");
		btnFindPerson.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				btnFindPersonActionPerformed(evt);
			}
		});

		btnDeletePerson.setText("Delete Person");
		btnDeletePerson.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				btnDeletePersonActionPerformed(evt);
			}
		});

		btnAddPerson.setText("Save Person");
		btnAddPerson.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				btnAddPersonActionPerformed(evt);
			}
		});

		org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout
		                .createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
		                .add(layout.createSequentialGroup()
		                                .addContainerGap()
		                                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
		                                                .add(org.jdesktop.layout.GroupLayout.TRAILING,
		                                                                layout.createSequentialGroup()
		                                                                                .add(0, 0, Short.MAX_VALUE)
		                                                                                .add(btnAddPerson)
		                                                                                .add(18, 18, 18)
		                                                                                .add(btnDeletePerson)
		                                                                                .addPreferredGap(
		                                                                                                org.jdesktop.layout.LayoutStyle.RELATED)
		                                                                                .add(btnFindPerson))
		                                                .add(jPanel1, 0, 528, Short.MAX_VALUE)).addContainerGap()));

		layout.linkSize(new java.awt.Component[] { btnDeletePerson, btnFindPerson }, org.jdesktop.layout.GroupLayout.HORIZONTAL);

		layout.setVerticalGroup(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING).add(
		                layout.createSequentialGroup()
		                                .addContainerGap()
		                                .add(jPanel1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE,
		                                                org.jdesktop.layout.GroupLayout.DEFAULT_SIZE,
		                                                org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
		                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED,
		                                                org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
		                                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE).add(btnFindPerson)
		                                                .add(btnDeletePerson).add(btnAddPerson)).addContainerGap()));

		jPanel1.getAccessibleContext().setAccessibleName(" Name");

		pack();
	}// </editor-fold>

	private void txtPhoneNumbersActionPerformed(java.awt.event.ActionEvent evt) {
		String newline = "\n";
		String text = txtPhoneNumbers.getText();
		txtAreaNumbers.append(text + newline);
		txtPhoneNumbers.setText("");
		txtPhoneNumbers.selectAll();
	}

	private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {
		String newline = "\n";
		String text = txtPhoneNumbers.getText();
		txtAreaNumbers.append(text + newline);
		txtPhoneNumbers.setText("");
		txtPhoneNumbers.selectAll();
	}

	private void btnAddPersonActionPerformed(java.awt.event.ActionEvent evt) {
		try {
			Person person = transformFormToPersonDto();
			PersonManager manager = (PersonManager) ResourceLocator.getBean("personManager");
			Person savedPerson = null;

			savedPerson = manager.create(person);

			if (savedPerson != null && savedPerson.getId() > -1) {
				JOptionPane.showMessageDialog(this, ResourceLocator.getI18NMessage("save.person.pass"));
				clearForm(false);
			} else {
				JOptionPane.showMessageDialog(this, ResourceLocator.getI18NMessage("save.person.fail"));
			}
		} catch (ValidationFailException e) {
			JOptionPane.showMessageDialog(this, e.getMessage());
		}
	}

	private void btnDeletePersonActionPerformed(java.awt.event.ActionEvent evt) {
		try {
			Person person = transformFormToPersonDto();
			PersonManager manager = (PersonManager) ResourceLocator.getBean("personManager");
			Person deletedPerson = manager.delete(person);
			if (deletedPerson == null) {
				JOptionPane.showMessageDialog(this, ResourceLocator.getI18NMessage("delete.person.pass"));
				clearForm(false);
			} else {
				JOptionPane.showMessageDialog(this, ResourceLocator.getI18NMessage("delete.person.fail"));
			}
		} catch (ValidationFailException e) {
			JOptionPane.showMessageDialog(this, e.getMessage());
		}
	}

	private void btnFindPersonActionPerformed(java.awt.event.ActionEvent evt) {
		try {
			Person person = transformFormToPersonDto();
			PersonManager manager = (PersonManager) ResourceLocator.getBean("personManager");
			Person foundPerson = manager.findByFirstNameAndLastName(person.getFirstName(), person.getLastName());
			if (foundPerson != null && foundPerson.getId() > -1) {
				JOptionPane.showMessageDialog(this, ResourceLocator.getI18NMessage("find.person.pass"));
				transformPersonDtoTotoForm(foundPerson);
			} else {
				JOptionPane.showMessageDialog(this, ResourceLocator.getI18NMessage("find.person.fail"));
			}
		} catch (ValidationFailException e) {
			JOptionPane.showMessageDialog(this, e.getMessage());
		}
	}

	private Person transformFormToPersonDto() {

		if (txtfName.getText() != null && !txtfName.getText().isEmpty() && txtlName.getText() != null && !txtlName.getText().isEmpty()) {

			Person person = null;
			PersonBuilder personBuilder = PersonBuilder.getPersonBuiler();
			PhoneBuilder builder = PhoneBuilder.getPhoneBuilder();
			Set<Phone> numbers = new HashSet<Phone>();

			String[] lines = txtAreaNumbers.getText().split("\\n");
			for (int i = 0; i < lines.length; i++) {
				if (lines[i].trim().length() > 1)
					numbers.add(builder.withNumber(lines[i]).withType("Home").build());
			}
			personBuilder.withFirstName(txtfName.getText()).withLastName(txtlName.getText()).withStreet(txtStreet.getText())
			                .withSuburb(txtSuburb.getText()).withPostCode(txtPostCode.getText()).withState(txtState.getText());
			personBuilder.withPhoneNumbers(numbers);
			person = personBuilder.build();

			return person;
		} else {
			throw new ValidationFailException(ResourceLocator.getI18NMessage("mandetory.firstName.lastName"));
		}
	}

	private void transformPersonDtoTotoForm(Person person) {

		txtfName.setText(person.getFirstName());
		txtlName.setText(person.getLastName());
		txtStreet.setText(person.getStreet());
		txtSuburb.setText(person.getSuburb());
		txtPostCode.setText(person.getPostCode());
		txtState.setText(person.getState());
		txtAreaNumbers.setText("");
		for (Iterator<Phone> i = person.getPhones().iterator(); i.hasNext();) {
			txtAreaNumbers.append(i.next().getNumber() + newline);
		}

	}

	private void clearForm(boolean keepKeys) {
		if (!keepKeys) {
			txtfName.setText("");
			txtlName.setText("");
		}
		txtStreet.setText("");
		txtSuburb.setText("");
		txtPostCode.setText("");
		txtState.setText("");
		txtPhoneNumbers.setText("");
		txtAreaNumbers.setText("");
	}

	/**
	 * @param args
	 *            the command line arguments
	 */
	public static void main(String args[]) {
		/* Set the Nimbus look and feel */
		// <editor-fold defaultstate="collapsed"
		// desc=" Look and feel setting code (optional) ">
		/*
		 * If Nimbus (introduced in Java SE 6) is not available, stay with the
		 * default look and feel. For details see
		 * http://download.oracle.com/javase
		 * /tutorial/uiswing/lookandfeel/plaf.html
		 */
		try {
			javax.swing.UIManager.LookAndFeelInfo[] installedLookAndFeels = javax.swing.UIManager.getInstalledLookAndFeels();
			for (int idx = 0; idx < installedLookAndFeels.length; idx++)
				if ("Nimbus".equals(installedLookAndFeels[idx].getName())) {
					javax.swing.UIManager.setLookAndFeel(installedLookAndFeels[idx].getClassName());
					break;
				}
		} catch (ClassNotFoundException ex) {
			java.util.logging.Logger.getLogger(AddressForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(AddressForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(AddressForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(AddressForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		}
		// </editor-fold>

		/* Create and display the form */
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new AddressForm().setVisible(true);
			}
		});
	}

	// Variables declaration - do not modify
	private javax.swing.JButton btnAddPerson;
	private javax.swing.JButton btnDeletePerson;
	private javax.swing.JButton btnFindPerson;
	private javax.swing.ButtonGroup buttonGroup1;
	private javax.swing.JButton jButton8;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel10;
	private javax.swing.JLabel jLabel12;
	private javax.swing.JLabel jLabel3;
	private javax.swing.JLabel jLabel5;
	private javax.swing.JLabel jLabel8;
	private javax.swing.JLabel jLabel9;
	private javax.swing.JPanel jPanel1;
	private javax.swing.JScrollPane jScrollPane2;
	private javax.swing.JTextArea txtAreaNumbers;
	private javax.swing.JTextField txtPhoneNumbers;
	private javax.swing.JTextField txtPostCode;
	private javax.swing.JTextField txtState;
	private javax.swing.JTextField txtStreet;
	private javax.swing.JTextField txtSuburb;
	private javax.swing.JTextField txtfName;
	private javax.swing.JTextField txtlName;
	// End of variables declaration

}
