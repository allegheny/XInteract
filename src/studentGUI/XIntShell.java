/*
 * XIntShell.java
 *
 * Created on Jun 25, 2009, 5:04:26 PM
 */
package studentGUI;

import cayenne.DBobjects.Problem;
import dynamic.ClassFormatException;
import dynamic.RuntimeException;
import dynamic.CodeRunner;
import dynamic.CompilationException;
import dynamic.LoadClassTaskException;
import java.awt.Color;
import java.io.IOException;
import java.util.Arrays;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import org.syntax.jedit.tokenmarker.JavaTokenMarker;
import professorGUI.LogInCondition;
import xidb.convert.AttemptCauseConverter;
import xidb.convert.AttemptCodeConverter;
import xidb.convert.ClassAssignmentsConverter;
import xidb.convert.ProblemDescriptionConverter;
import xidb.convert.StudentEnrollmentConverter;

/**
 *
 * @author Radu Creanga <rdcrng@gmail.com>
 */
public class XIntShell extends javax.swing.JFrame {

    boolean needPassword = false;
    private static Process vncThumb;
    private static Process vncBig;

    /** Creates new form XIntShell */
    public XIntShell() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        databaseManager = new xidb.DBManager();
        logInDialog = new javax.swing.JDialog();
        usernameLBL = new javax.swing.JLabel();
        passwordLBL = new javax.swing.JLabel();
        usernameTF = new javax.swing.JTextField();
        passwordPF = new javax.swing.JPasswordField();
        logInBTN = new javax.swing.JButton();
        logInStatusLBL = new javax.swing.JLabel();
        attemptController = new xidb.AttemptController();
        passwordChangeDialog = new javax.swing.JDialog();
        passwordChangeLBL = new javax.swing.JLabel();
        passwordChange2LBL = new javax.swing.JLabel();
        passwordChangePF = new javax.swing.JPasswordField();
        passwordChange2PF = new javax.swing.JPasswordField();
        passwordChangeBTN = new javax.swing.JButton();
        toolbar = new javax.swing.JPanel();
        classLBL = new javax.swing.JLabel();
        classesCB = new javax.swing.JComboBox();
        problemLBL = new javax.swing.JLabel();
        problemsCB = new javax.swing.JComboBox();
        tryBTN = new javax.swing.JButton();
        tabs = new javax.swing.JTabbedPane();
        problemsTabPNL = new javax.swing.JPanel();
        problemDescriptionSP = new javax.swing.JScrollPane();
        problemDescriptionTA = new javax.swing.JTextArea();
        studentCodeJTA = new org.syntax.jedit.JEditTextArea();
        studentCodeJTA.setTokenMarker(new JavaTokenMarker());
        attemptsTabPNL = new javax.swing.JPanel();
        attempsSP = new javax.swing.JScrollPane();
        attempsList = new javax.swing.JList();
        atemptCodeSP = new javax.swing.JScrollPane();
        attemptCode = new javax.swing.JTextArea();
        causeSP = new javax.swing.JScrollPane();
        causeTA = new javax.swing.JTextArea();

        logInDialog.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        logInDialog.setTitle("XInteract Student Log In");
        logInDialog.setMinimumSize(new java.awt.Dimension(400, 200));
        logInDialog.setModal(true);
        logInDialog.addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                logInDialogWindowClosed(evt);
            }
        });
        logInDialog.getContentPane().setLayout(new java.awt.GridBagLayout());

        usernameLBL.setText("Username:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        logInDialog.getContentPane().add(usernameLBL, gridBagConstraints);

        passwordLBL.setText("Password:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        logInDialog.getContentPane().add(passwordLBL, gridBagConstraints);

        usernameTF.setPreferredSize(new java.awt.Dimension(100, 25));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        logInDialog.getContentPane().add(usernameTF, gridBagConstraints);

        passwordPF.setPreferredSize(new java.awt.Dimension(100, 25));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        logInDialog.getContentPane().add(passwordPF, gridBagConstraints);

        logInBTN.setText("Log In");
        logInBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logInBTNActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        logInDialog.getContentPane().add(logInBTN, gridBagConstraints);

        logInStatusLBL.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logInStatusLBL.setText("Please enter your credentials and press the log in button.");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        logInDialog.getContentPane().add(logInStatusLBL, gridBagConstraints);

        logInDialog.setVisible(true);

        org.jdesktop.beansbinding.Binding binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ, problemsCB, org.jdesktop.beansbinding.ELProperty.create("${selectedItem}"), attemptController, org.jdesktop.beansbinding.BeanProperty.create("problem"));
        binding.setSourceNullValue(null);
        bindingGroup.addBinding(binding);
        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ, databaseManager, org.jdesktop.beansbinding.ELProperty.create("${studentUser}"), attemptController, org.jdesktop.beansbinding.BeanProperty.create("student"));
        binding.setSourceNullValue(null);
        bindingGroup.addBinding(binding);

        passwordChangeDialog.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        passwordChangeDialog.setTitle("Please Set a Password!");
        passwordChangeDialog.setMinimumSize(new java.awt.Dimension(400, 200));
        passwordChangeDialog.setModal(true);
        passwordChangeDialog.getContentPane().setLayout(new java.awt.GridBagLayout());

        passwordChangeLBL.setText("New Password:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        passwordChangeDialog.getContentPane().add(passwordChangeLBL, gridBagConstraints);

        passwordChange2LBL.setText("Repeat Password:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        passwordChangeDialog.getContentPane().add(passwordChange2LBL, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        passwordChangeDialog.getContentPane().add(passwordChangePF, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        passwordChangeDialog.getContentPane().add(passwordChange2PF, gridBagConstraints);

        passwordChangeBTN.setText("Set Password");
        passwordChangeBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordChangeBTNActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        passwordChangeDialog.getContentPane().add(passwordChangeBTN, gridBagConstraints);

        if (needPassword) passwordChangeDialog.setVisible(true);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("XInteract Student ");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });
        getContentPane().setLayout(new java.awt.GridBagLayout());

        toolbar.setLayout(new java.awt.GridBagLayout());

        classLBL.setText("Class:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        toolbar.add(classLBL, gridBagConstraints);

        org.jdesktop.beansbinding.ELProperty eLProperty = org.jdesktop.beansbinding.ELProperty.create("${studentUser}");
        org.jdesktop.swingbinding.JComboBoxBinding jComboBoxBinding = org.jdesktop.swingbinding.SwingBindings.createJComboBoxBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ, databaseManager, eLProperty, classesCB);
        jComboBoxBinding.setSourceNullValue(null);
        jComboBoxBinding.setConverter(new StudentEnrollmentConverter());
        bindingGroup.addBinding(jComboBoxBinding);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        toolbar.add(classesCB, gridBagConstraints);

        problemLBL.setText("Problem:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        toolbar.add(problemLBL, gridBagConstraints);

        eLProperty = org.jdesktop.beansbinding.ELProperty.create("${selectedItem}");
        jComboBoxBinding = org.jdesktop.swingbinding.SwingBindings.createJComboBoxBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ, classesCB, eLProperty, problemsCB);
        jComboBoxBinding.setConverter(new ClassAssignmentsConverter());
        bindingGroup.addBinding(jComboBoxBinding);

        problemsCB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                problemsCBActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        toolbar.add(problemsCB, gridBagConstraints);

        tryBTN.setText("Try");
        tryBTN.setFocusable(false);
        tryBTN.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        tryBTN.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        tryBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tryBTNActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        toolbar.add(tryBTN, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        getContentPane().add(toolbar, gridBagConstraints);

        tabs.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                tabsStateChanged(evt);
            }
        });

        problemsTabPNL.setLayout(new java.awt.GridBagLayout());

        problemDescriptionSP.setBorder(javax.swing.BorderFactory.createTitledBorder("Description"));
        problemDescriptionSP.setPreferredSize(new java.awt.Dimension(500, 200));

        problemDescriptionTA.setEditable(false);
        problemDescriptionTA.setBorder(null);
        problemDescriptionTA.setFocusable(false);

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ, problemsCB, org.jdesktop.beansbinding.ELProperty.create("${selectedItem}"), problemDescriptionTA, org.jdesktop.beansbinding.BeanProperty.create("text"));
        binding.setConverter(new ProblemDescriptionConverter());
        bindingGroup.addBinding(binding);

        problemDescriptionSP.setViewportView(problemDescriptionTA);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        problemsTabPNL.add(problemDescriptionSP, gridBagConstraints);

        studentCodeJTA.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED), "Answer"));
        studentCodeJTA.setPreferredSize(new java.awt.Dimension(500, 400));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        problemsTabPNL.add(studentCodeJTA, gridBagConstraints);

        tabs.addTab("Assignments", problemsTabPNL);

        attemptsTabPNL.setLayout(new java.awt.GridBagLayout());

        attempsSP.setBorder(javax.swing.BorderFactory.createTitledBorder("Problem Attempts"));
        attempsSP.setPreferredSize(new java.awt.Dimension(500, 200));

        attempsList.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);

        eLProperty = org.jdesktop.beansbinding.ELProperty.create("${attempts}");
        org.jdesktop.swingbinding.JListBinding jListBinding = org.jdesktop.swingbinding.SwingBindings.createJListBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ, attemptController, eLProperty, attempsList);
        jListBinding.setSourceNullValue(null);
        bindingGroup.addBinding(jListBinding);

        attempsSP.setViewportView(attempsList);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        attemptsTabPNL.add(attempsSP, gridBagConstraints);

        atemptCodeSP.setBorder(javax.swing.BorderFactory.createTitledBorder("Attempt Code"));
        atemptCodeSP.setPreferredSize(new java.awt.Dimension(500, 200));

        attemptCode.setColumns(20);
        attemptCode.setEditable(false);
        attemptCode.setRows(5);

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ, attempsList, org.jdesktop.beansbinding.ELProperty.create("${selectedElement}"), attemptCode, org.jdesktop.beansbinding.BeanProperty.create("text"));
        binding.setConverter(new AttemptCodeConverter());
        bindingGroup.addBinding(binding);

        atemptCodeSP.setViewportView(attemptCode);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        attemptsTabPNL.add(atemptCodeSP, gridBagConstraints);

        causeSP.setBorder(javax.swing.BorderFactory.createTitledBorder("Cause"));
        causeSP.setPreferredSize(new java.awt.Dimension(500, 200));

        causeTA.setColumns(20);
        causeTA.setEditable(false);
        causeTA.setRows(5);

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ, attempsList, org.jdesktop.beansbinding.ELProperty.create("${selectedElement}"), causeTA, org.jdesktop.beansbinding.BeanProperty.create("text"));
        binding.setConverter(new AttemptCauseConverter());
        bindingGroup.addBinding(binding);

        causeSP.setViewportView(causeTA);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        attemptsTabPNL.add(causeSP, gridBagConstraints);

        tabs.addTab("Attempt Log", attemptsTabPNL);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        getContentPane().add(tabs, gridBagConstraints);

        bindingGroup.bind();

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tryBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tryBTNActionPerformed
        if (studentCodeJTA.getText().contains("DataContext")) {
            JOptionPane.showMessageDialog(this, "Your code contains a restricted word and can not be tested!", "Restricted Word Found!", JOptionPane.INFORMATION_MESSAGE);
        } else {
            Problem selectedProblem = (Problem) problemsCB.getSelectedItem();
            TryOutput dialog = new TryOutput(this, false, selectedProblem);
            dialog.setVisible(true);
            try {
                CodeRunner runner = new CodeRunner();
                dialog.addText("Compiling your code...\n");
                runner.compile(selectedProblem.getCode(), studentCodeJTA.getText());
                dialog.addText("Compilation Successfull!\n\n");
                dialog.addText("Running the compiled program...\n");
                runner.run(selectedProblem.getInputData());
                dialog.addText("Run Successfull!\n\n");
                if (runner.testOutput(selectedProblem.getOutputData())) {
                    dialog.addText("Your program returned the correct values!");
                } else {
                    dialog.addText("Your program did not return the expected values. Try Again");
                }
            } catch (CompilationException ex) {
                dialog.addText("Your code didn't compile, Javac returned:\n" + ex.getMessage() + "\n\nTry Again!\n");
            } catch (LoadClassTaskException ex) {
                dialog.addText("Internal System Error Occured.\n\n" + ex.getCause().getMessage() + "\n\nPlease let your intructor know about this.\n");
            } catch (RuntimeException ex) {
                dialog.addText("Run failed...\n" + ex.getMessage() + "\nTry Again!\n\n");
            } catch (ClassFormatException ex) {
                dialog.addText("Internal System Error Occured.\n\n" + ex.getCause().getMessage() + "\n\nPlease let your intructor know about this.\n");
            }
            databaseManager.createAttempt(new Date(System.currentTimeMillis()), studentCodeJTA.getText(), dialog.getText(), databaseManager.getStudentUser(), selectedProblem);
        }
    }//GEN-LAST:event_tryBTNActionPerformed

    private void tabsStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_tabsStateChanged
        switch (tabs.getSelectedIndex()) {
            case 0:
                tryBTN.setEnabled(true);
                break;
            case 1:
                tryBTN.setEnabled(false);
                Problem selectedProblem = (Problem) problemsCB.getSelectedItem();
                problemsCB.setSelectedIndex(-1);
                problemsCB.setSelectedItem(selectedProblem);
                break;
        }
    }//GEN-LAST:event_tabsStateChanged

    private void logInBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logInBTNActionPerformed
        LogInCondition condition = databaseManager.logInStudent(usernameTF.getText(), new String(passwordPF.getPassword()));
        switch (condition) {
            case INVALID_CREDENTIALS:
                logInStatusLBL.setForeground(Color.RED);
                logInStatusLBL.setText("Invalid credentials.");
                break;
            case STUDENT:
                logInStatusLBL.setForeground(Color.BLACK);
                logInStatusLBL.setText("Log In Successful!");
                if (Arrays.equals(passwordPF.getPassword(), new char[0])) {
                    System.out.println("New password needed!");
                    needPassword = true;
                }
                logInDialog.setVisible(false);
                break;
            default:
                System.err.println("logInProfessor() returned " + condition + " --> this should be impossible!");
            	if (vncThumb != null) {
            		vncThumb.destroy();
            	}
            	if (vncBig != null) {
            		vncBig.destroy();
            	}
                System.exit(-1);
        }
}//GEN-LAST:event_logInBTNActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        databaseManager.setStudentUser(databaseManager.getStudentUser());
    }//GEN-LAST:event_formWindowOpened

    private void problemsCBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_problemsCBActionPerformed
        studentCodeJTA.setText("");
    }//GEN-LAST:event_problemsCBActionPerformed

    private void logInDialogWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_logInDialogWindowClosed
    	
    	if (vncThumb != null) {
    		vncThumb.destroy();
    	}
    	if (vncBig != null) {
    		vncBig.destroy();
    	}
    	
        System.exit(0);
    }//GEN-LAST:event_logInDialogWindowClosed

    private void passwordChangeBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordChangeBTNActionPerformed
        if (Arrays.equals(passwordChangePF.getPassword(), passwordChange2PF.getPassword())) {
            if (passwordChangePF.getPassword().length < 5) {
                JOptionPane.showMessageDialog(this, "Please choose a password that is atleast 5 characters long.", "Password Change Failed", JOptionPane.WARNING_MESSAGE);
            } else {
                boolean pass = databaseManager.changeStudentPassword(new char[0], passwordChangePF.getPassword());
                if (pass == false) {
                    JOptionPane.showMessageDialog(this, "Wrong Current Password!", "Password Change Failed", JOptionPane.WARNING_MESSAGE);
                } else {
                    passwordChangePF.setText("");
                    passwordChange2PF.setText("");
                    JOptionPane.showMessageDialog(this, "Your password was changed, please remember it.", "Password Changed", JOptionPane.INFORMATION_MESSAGE);
                    passwordChangeDialog.setVisible(false);
                }
            }
        } else {
            JOptionPane.showMessageDialog(this, "New Passwords Don't Match!", "Password Change Failed", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_passwordChangeBTNActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        if (vncThumb != null) {
            vncThumb.destroy();
        }
        if (vncBig != null) {
            vncBig.destroy();
        }
    }//GEN-LAST:event_formWindowClosing

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {


        try {
            String vncThumbCmd = "x11vnc -display :0 -viewonly -forever -rfbport 9000 -passwd 0m6+4Co5 -scale 1/6";
            vncThumb =
                    Runtime.getRuntime().exec(vncThumbCmd);
            String vncBigCmd = "x11vnc -display :0 -viewonly -forever -rfbport 9001 -passwd 0m6+4Co5";
            vncBig =
                    Runtime.getRuntime().exec(vncBigCmd);
        } catch (IOException e) {
            //should never happen
            System.out.println("Unable to invoke VNC display(s), IOException");
            e.printStackTrace();
        }

        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                try {
                    UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
                } catch (Exception ex) {
                    ex.printStackTrace();
                }

                new XIntShell().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane atemptCodeSP;
    private javax.swing.JList attempsList;
    private javax.swing.JScrollPane attempsSP;
    private javax.swing.JTextArea attemptCode;
    private xidb.AttemptController attemptController;
    private javax.swing.JPanel attemptsTabPNL;
    private javax.swing.JScrollPane causeSP;
    private javax.swing.JTextArea causeTA;
    private javax.swing.JLabel classLBL;
    private javax.swing.JComboBox classesCB;
    private xidb.DBManager databaseManager;
    private javax.swing.JButton logInBTN;
    private javax.swing.JDialog logInDialog;
    private javax.swing.JLabel logInStatusLBL;
    private javax.swing.JLabel passwordChange2LBL;
    private javax.swing.JPasswordField passwordChange2PF;
    private javax.swing.JButton passwordChangeBTN;
    private javax.swing.JDialog passwordChangeDialog;
    private javax.swing.JLabel passwordChangeLBL;
    private javax.swing.JPasswordField passwordChangePF;
    private javax.swing.JLabel passwordLBL;
    private javax.swing.JPasswordField passwordPF;
    private javax.swing.JScrollPane problemDescriptionSP;
    private javax.swing.JTextArea problemDescriptionTA;
    private javax.swing.JLabel problemLBL;
    private javax.swing.JComboBox problemsCB;
    private javax.swing.JPanel problemsTabPNL;
    private org.syntax.jedit.JEditTextArea studentCodeJTA;
    private javax.swing.JTabbedPane tabs;
    private javax.swing.JPanel toolbar;
    private javax.swing.JButton tryBTN;
    private javax.swing.JLabel usernameLBL;
    private javax.swing.JTextField usernameTF;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables
}
