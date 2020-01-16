/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Battle;

import Display.DisplayFrame;
import static Display.DisplayFrame.coinLabel;
import static Display.DisplayFrame.coins;
import static Display.DisplayFrame.hBar;
import java.awt.event.*;
import java.util.Date;
import java.util.Random;
import javax.sound.sampled.*;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Timer;
import sun.audio.*;
import java.awt.Color;

/**
 *
 * @author 068685601
 */
public class SkeletonMinion extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    //Intialize timer
    Timer t1 = new Timer(252000, new TimerListener());

    public SkeletonMinion() {
        //Start timer
        t1.start();

        initComponents();
        getContentPane().setBackground(new Color(102, 51, 0)); //Change background colour
        //Plays a random song
        song = rand.nextInt(5);
        if (song == 0) {
            Sound.play("Minion1.1.wav");
        } else if (song == 1) {
            Sound.play("Minion2.1.wav");
        } else if (song == 2) {
            Sound.play("Minion3.1.wav");
        } else if (song == 3) {
            Sound.play("Minion4.1.wav");
        } else if (song == 4) {
            Sound.play("Minion5.1.wav");
        }

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jPanel2 = new javax.swing.JPanel();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jScrollPane3 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList();
        jButton4 = new javax.swing.JButton();
        ShowPlayerHealth = new javax.swing.JProgressBar();
        ShowEnemyHealth = new javax.swing.JProgressBar();
        jPanel1 = new javax.swing.JPanel();
        AttackButton = new javax.swing.JButton();
        EndButton = new javax.swing.JButton();
        Ability = new javax.swing.JButton();
        attackBuff = new javax.swing.JButton();
        attackDebuff = new javax.swing.JButton();
        items = new javax.swing.JButton();
        healthPotions = new javax.swing.JButton();
        manaPotion = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jProgressBar1 = new javax.swing.JProgressBar();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jList1.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane3.setViewportView(jList1);

        jButton4.setText("jButton4");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        ShowPlayerHealth.setBackground(java.awt.Color.lightGray);
        ShowPlayerHealth.setForeground(java.awt.Color.green);
        ShowPlayerHealth.setValue(100);
        ShowPlayerHealth.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Health", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.BELOW_TOP));

        ShowEnemyHealth.setBackground(java.awt.Color.lightGray);
        ShowEnemyHealth.setForeground(java.awt.Color.green);
        ShowEnemyHealth.setMaximum(oppHP);
        ShowEnemyHealth.setValue(currentoppHP);
        ShowEnemyHealth.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Health", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.BELOW_TOP));

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        AttackButton.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        AttackButton.setText("Attack");
        AttackButton.setMaximumSize(new java.awt.Dimension(100, 30));
        AttackButton.setMinimumSize(new java.awt.Dimension(100, 40));
        AttackButton.setPreferredSize(new java.awt.Dimension(100, 30));
        AttackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AttackButtonActionPerformed(evt);
            }
        });

        EndButton.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        EndButton.setForeground(new java.awt.Color(255, 0, 51));
        EndButton.setText("End Turn");
        EndButton.setMinimumSize(new java.awt.Dimension(100, 40));
        EndButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EndButtonActionPerformed(evt);
            }
        });

        Ability.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        Ability.setText("Abilities");
        Ability.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AbilityActionPerformed(evt);
            }
        });

        attackBuff.setText("Attack Buff");
        attackBuff.setEnabled(false);
        attackBuff.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                attackBuffActionPerformed(evt);
            }
        });

        attackDebuff.setText("Lower Enemy Attack");
        attackDebuff.setEnabled(false);
        attackDebuff.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                attackDebuffActionPerformed(evt);
            }
        });

        items.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        items.setText("Items");
        items.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemsActionPerformed(evt);
            }
        });

        healthPotions.setText("Health Potions x" + hpPotions);
        healthPotions.setEnabled(false);
        healthPotions.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                healthPotionsActionPerformed(evt);
            }
        });

        manaPotion.setText("Mana Potions x" + manaPotions);
        manaPotion.setEnabled(false);
        manaPotion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ManaPotionUse(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(AttackButton, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Ability, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(attackBuff)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(attackDebuff)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(items, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(EndButton, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(healthPotions)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(manaPotion)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Ability, javax.swing.GroupLayout.DEFAULT_SIZE, 59, Short.MAX_VALUE)
                    .addComponent(AttackButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(items, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(EndButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(healthPotions)
                    .addComponent(manaPotion)
                    .addComponent(attackDebuff)
                    .addComponent(attackBuff))
                .addGap(24, 24, 24))
        );

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Player");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setForeground(java.awt.Color.white);
        jLabel2.setText("Skeleton Minion");

        jTextArea2.setEditable(false);
        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jTextArea2.setText(combatText);
        jScrollPane2.setViewportView(jTextArea2);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Battle/Skeleton 3.1.gif"))); // NOI18N

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Battle/link.gif"))); // NOI18N

        jProgressBar1.setBackground(java.awt.Color.lightGray);
        jProgressBar1.setForeground(java.awt.Color.blue);
        jProgressBar1.setValue(playerMana);
        jProgressBar1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Mana", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.BELOW_TOP));
        jProgressBar1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ShowPlayerHealth, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(ShowEnemyHealth, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 362, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(35, 35, 35)))
                .addGap(0, 20, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(16, 16, 16)
                        .addComponent(ShowEnemyHealth, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(108, Short.MAX_VALUE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ShowPlayerHealth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)
                        .addComponent(jProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7)))
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
//Whenever the song ends a new song starts

    private class TimerListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            song = rand.nextInt(5);
            if (song == 0) {
                Sound.play("Minion1.1.wav");
            } else if (song == 1) {
                Sound.play("Minion2.1.wav");
            } else if (song == 2) {
                Sound.play("Minion3.1.wav");
            } else if (song == 3) {
                Sound.play("Minion4.1.wav");
            } else if (song == 4) {
                Sound.play("Minion5.1.wav");
            }
        }
    }

       //When the attack button is clicked
    private void AttackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AttackButtonActionPerformed

        if (turn == true) {
            accuracy = rand.nextInt(100 + 1);

            if (accuracy > 25) {
                playerDMG = (rand.nextInt(playerATK) + 2);
                playertotDMG = (playerDMG + playerATKMod);
                currentoppHP = currentoppHP - playerDMG;
                ShowEnemyHealth.setValue(currentoppHP);
                turn = false;
                EndButton.setEnabled(true);
                combatText = combatText + " \nYou attack for " + playertotDMG + " damage";
                jTextArea2.setText(combatText);
                jLabel5.setLocation(oppx + 30, oppy);

                Sound.play("PlayerHit.wav");

            } else {
                combatText = combatText + " \nYOU MISSED!";
                jTextArea2.setText(combatText);
                EndButton.setEnabled(true);
                turn = false;
                Sound.play("Miss.wav");
            }
        }
        if (currentoppHP <= 0) {
            goldfound = rand.nextInt(8) + 10;
            combatText = "\nYOU WIN! \nYou scavanged " + goldfound + " gold from the dead skeleton!";
            jTextArea2.setText(combatText);
            attackBuff.setEnabled(false);
            attackDebuff.setEnabled(false);
            AttackButton.setEnabled(false);
            Ability.setEnabled(false);
            items.setEnabled(false);
            healthPotions.setEnabled(false);
            AttackButton.setEnabled(false);
            jLabel3.setVisible(false);
            jPanel1.setVisible(false);
            ShowPlayerHealth.setVisible(false);
            ShowEnemyHealth.setVisible(false);
            jLabel2.setVisible(false);
            jProgressBar1.setVisible(false);
            jLabel5.setVisible(false);
            jLabel1.setVisible(false);
            //coin return value
            DisplayFrame.coins += goldfound;
            DisplayFrame.coinLabel.setText("x" + coins);
            //health pots return value
            DisplayFrame.potionsHP = hpPotions;
            DisplayFrame.HPLabel.setText("x" + DisplayFrame.potionsHP);
            //mana pots return value
            DisplayFrame.potionsM = manaPotions;
            DisplayFrame.MLabel.setText("x" + DisplayFrame.potionsM);
            //health bar value
            DisplayFrame.hBar.setValue(currentPlayerHP);
            hBar.update(hBar.getGraphics());
            //mana bar value
            DisplayFrame.mBar.setValue(currentPlayerMana);
            DisplayFrame.mBar.update(DisplayFrame.mBar.getGraphics());
            setVisible(false); //hides the frame
            dispose(); //Destroy the JFrame object
        }
        if (currentoppHP < oppHP / 2 && currentPlayerHP > 100 / 4) {
            ShowEnemyHealth.setForeground(Color.YELLOW);
        } else if (currentoppHP < oppHP / 4) {
            ShowEnemyHealth.setForeground(Color.RED);
        }
        attackBuff.setEnabled(false);
        attackDebuff.setEnabled(false);
        AttackButton.setEnabled(false);
        Ability.setEnabled(false);
        items.setEnabled(false);
        healthPotions.setEnabled(false);
    }//GEN-LAST:event_AttackButtonActionPerformed
//When the end button is clicked
    private void EndButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EndButtonActionPerformed
        if (turn == true) {
            combatText = combatText + " \nYou don't take an action and recover a bit of health and mana.";
            jTextArea2.setText(combatText);
            currentPlayerHP += +rand.nextInt(5);
            currentPlayerMana += rand.nextInt(5);
            if (currentPlayerHP > 100) {
                currentPlayerHP = 100;
            }
            if (currentPlayerMana > playerMana) {
                currentPlayerMana = playerMana;
            }
            ShowPlayerHealth.setValue(currentPlayerHP);
            ShowPlayerHealth.update(ShowPlayerHealth.getGraphics());
            jProgressBar1.setValue(currentPlayerMana);
            turn = false;

        }
        if (turn == false) {
            jLabel5.setLocation(oppx - 30, oppy);
            accuracy = rand.nextInt(100 + 1);
            if (accuracy > 25) {
                oppability = rand.nextInt(10);
                if (oppability < 9) {
                    oppDMG = (rand.nextInt(oppATK) + 2);
                    opptotDMG = (oppDMG + oppATKMod);
                    currentPlayerHP = currentPlayerHP - oppDMG;
                    ShowPlayerHealth.setValue(currentPlayerHP);
                    ShowPlayerHealth.update(ShowPlayerHealth.getGraphics());
                    turn = true;
                    EndButton.setEnabled(true);
                    combatText = combatText + " \nThe minion swings its sword dealing " + opptotDMG + " damage";
                    jTextArea2.setText(combatText);
                    Sound.play("EnemyHit.wav");
                } else {
                    oppDMG = (int) ((rand.nextInt(oppATK) * 0.8) + 1);
                    opptotDMG = (oppDMG + oppATKMod);
                    currentPlayerHP = currentPlayerHP - oppDMG;
                    ShowPlayerHealth.setValue(currentPlayerHP);
                    ShowPlayerHealth.update(ShowPlayerHealth.getGraphics());
                    turn = true;
                    EndButton.setEnabled(true);
                    if (playerATKMod > -4) {
                        combatText = combatText + " \nThe minion bashes his sheild dealing " + opptotDMG + " damage\nand raises his sheild raising defence";
                        jTextArea2.setText(combatText);
                        playerATKMod -= 1;
                        Sound.play("EnemyHit.wav");
                    } else {
                        combatText = combatText + " \nThe minion swings its sheild dealing " + opptotDMG + " damage";
                        jTextArea2.setText(combatText);
                        Sound.play("EnemyHit.wav");
                    }

                }

            } else {
                combatText = combatText + " \nThe enemy swung their sword and missed";
                jTextArea2.setText(combatText);
                EndButton.setEnabled(true);
                turn = true;
                Sound.play("Miss.wav");
            }
        }
        if (currentPlayerHP <= 0) {
            combatText = "YOU DEAD \nTry playing again";
            jTextArea2.setText(combatText);
            attackBuff.setEnabled(false);
            attackDebuff.setEnabled(false);
            AttackButton.setEnabled(false);
            Ability.setEnabled(false);
            items.setEnabled(false);
            healthPotions.setEnabled(false);
            AttackButton.setEnabled(false);
            jLabel3.setVisible(false);
            jPanel1.setVisible(false);
            ShowPlayerHealth.setVisible(false);
            ShowEnemyHealth.setVisible(false);
            jLabel2.setVisible(false);
            jProgressBar1.setVisible(false);
            jLabel5.setVisible(false);
            jLabel1.setVisible(false);
            DisplayFrame.dead = true;
            setVisible(false); //hides the frame
            dispose(); //Destroy the JFrame object

        }
        if (currentPlayerHP < 100 / 2 && currentPlayerHP > 100 / 4) {
            ShowPlayerHealth.setForeground(Color.YELLOW);
        } else if (currentPlayerHP < 100 / 4) {
            ShowPlayerHealth.setForeground(Color.RED);
        }
        attackBuff.setEnabled(false);
        attackDebuff.setEnabled(false);
        AttackButton.setEnabled(true);
        Ability.setEnabled(true);
        items.setEnabled(true);
        healthPotions.setEnabled(false);

    }//GEN-LAST:event_EndButtonActionPerformed
//When the ability button is pressed
    private void AbilityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AbilityActionPerformed
        if (abilities == false) {
            attackBuff.setEnabled(true);
            attackDebuff.setEnabled(true);
            AttackButton.setEnabled(false);
            items.setEnabled(false);
            healthPotions.setEnabled(false);
            abilities = true;
        } else if (abilities == true) {
            attackBuff.setEnabled(false);
            attackDebuff.setEnabled(false);
            AttackButton.setEnabled(true);
            abilities = false;
            items.setEnabled(true);
            EndButton.setEnabled(true);

        }
    }//GEN-LAST:event_AbilityActionPerformed
//When attack buff is pressed
    private void attackBuffActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_attackBuffActionPerformed
        if (turn == true) {
            if (currentPlayerMana > 10) {
                playerATKMod += 2;
                currentPlayerMana -= 10;
                jProgressBar1.setValue(currentPlayerMana);
                turn = false;
                EndButton.setEnabled(true);
                attackBuff.setEnabled(false);
                attackDebuff.setEnabled(false);
                combatText = combatText + " \nYou roared a battle cry raising your attack";
                jTextArea2.setText(combatText);
                Ability.setEnabled(false);
            } else {
                combatText = combatText + " \nNot enough mana!";
                jTextArea2.setText(combatText);
            }
        }
    }//GEN-LAST:event_attackBuffActionPerformed
//When attack debuff is pressed
    private void attackDebuffActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_attackDebuffActionPerformed
        if (turn == true) {
            if (playerMana > 15) {
                if (oppATKMod > -2) {
                    oppATKMod -= 1;
                    currentPlayerMana -= 15;
                    jProgressBar1.setValue(currentPlayerMana);
                    turn = false;
                    EndButton.setEnabled(true);
                    attackBuff.setEnabled(false);
                    attackDebuff.setEnabled(false);
                    combatText = combatText + " \nYou raised your shield raising your defence";
                    jTextArea2.setText(combatText);
                    Ability.setEnabled(false);

                } else {
                    combatText = combatText + " \nYour shield is already raised!";
                    jTextArea2.setText(combatText);
                }
            } else {
                combatText = combatText + " \nNot enough mana!";
                jTextArea2.setText(combatText);
            }
        }
    }//GEN-LAST:event_attackDebuffActionPerformed

    private void itemsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemsActionPerformed
        if (item == false) {
            healthPotions.setEnabled(true);
            manaPotion.setEnabled(true);
            AttackButton.setEnabled(false);
            Ability.setEnabled(false);
            item = true;
        } else if (item == true) {
            healthPotions.setEnabled(false);
            manaPotion.setEnabled(false);
            AttackButton.setEnabled(true);
            Ability.setEnabled(true);
            item = false;
            EndButton.setEnabled(true);
        }
    }//GEN-LAST:event_itemsActionPerformed

    private void healthPotionsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_healthPotionsActionPerformed
        if (turn == true && hpPotions > 0 && currentPlayerHP < 100 - 30) {
            currentPlayerHP += 30;
            ShowPlayerHealth.setValue(currentPlayerHP);
           ShowPlayerHealth.update(ShowPlayerHealth.getGraphics());
            combatText = combatText + " \nYou used a potion to heal 30HP!";
            jTextArea2.setText(combatText);
            hpPotions -= 1;
            healthPotions.setText("Health Potions x" + hpPotions);
            turn = false;
            EndButton.setEnabled(true);
            healthPotions.setEnabled(false);
            manaPotion.setEnabled(false);
            items.setEnabled(false);
        } else {
            combatText = combatText + " \nYour health is high enough!";
            jTextArea2.setText(combatText);
        }
    }//GEN-LAST:event_healthPotionsActionPerformed

    private void ManaPotionUse(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ManaPotionUse
        if (turn == true && manaPotions > 0 && currentPlayerMana < playerMana - 20) {
            currentPlayerMana += 20;
            jProgressBar1.setValue(currentPlayerMana);
            combatText = combatText + " \nYou used a mana potion to recover 20 Mana!";
            jTextArea2.setText(combatText);
            manaPotions -= 1;
            manaPotion.setText("Mana Potions x" + manaPotions);
            turn = false;
            EndButton.setEnabled(true);
            healthPotions.setEnabled(false);
            manaPotion.setEnabled(false);
            items.setEnabled(false);
        } else {
            combatText = combatText + " \nYour mana is high enough!";
            jTextArea2.setText(combatText);
        }
    }//GEN-LAST:event_ManaPotionUse

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */ //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */ //        try {
        //            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
        //                if ("Nimbus".equals(info.getName())) {
        //                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
        //                    break;
        //                }
        //            }
        //        } catch (ClassNotFoundException ex) {
        //            java.util.logging.Logger.getLogger(SkeletonMinion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        //        } catch (InstantiationException ex) {
        //            java.util.logging.Logger.getLogger(SkeletonMinion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        //        } catch (IllegalAccessException ex) {
        //            java.util.logging.Logger.getLogger(SkeletonMinion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        //        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
        //            java.util.logging.Logger.getLogger(SkeletonMinion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        //        }
        //</editor-fold>
        /* Create and display the form */

    }
    int song = 0; //initialize song to be randomized

    boolean death = false; //Checks if you are dead
    int oppHP = 60; //initialize var to show opp health

    int playerATK = 16; //initialize your atk

    //VARIABLES NEEDED TO SWITCH BETWEEN CLASSES
    public static int currentPlayerHP = DisplayFrame.hBar.getValue();// initialize current HP
    public static int goldfound = 0; //initialize gold found to be randomized
    
    int hpPotions = DisplayFrame.potionsHP;
    int manaPotions = DisplayFrame.potionsM;

    int gold = DisplayFrame.coins; //initialize your gold
    int currentoppHP = oppHP; //initialize current enemy hp
    int oppATK = 12; //initialize opp attack
    int oppATKMod = 0; //initialize opponents attack modifier
    int playerATKMod = 0; //initialize players attack modifier
    int playerDMG = 0;
    int oppDMG = 0;
    int playertotDMG = 0;
    int opptotDMG = 0;
    public static int playerMana = 100;
    public static int currentPlayerMana = playerMana; 
    boolean turn = true;
    String combatText = "";
    Random rand = new Random();
    int accuracy = 0;
    boolean hit = false;
    boolean abilities = false;
    boolean item = false;
    int oppability = 0;
    int oppx = 500;
    int oppy = 75;

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Ability;
    private javax.swing.JButton AttackButton;
    private javax.swing.JButton EndButton;
    private javax.swing.JProgressBar ShowEnemyHealth;
    private javax.swing.JProgressBar ShowPlayerHealth;
    private javax.swing.JButton attackBuff;
    private javax.swing.JButton attackDebuff;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton healthPotions;
    private javax.swing.JButton items;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JList jList1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JButton manaPotion;
    // End of variables declaration//GEN-END:variables

}