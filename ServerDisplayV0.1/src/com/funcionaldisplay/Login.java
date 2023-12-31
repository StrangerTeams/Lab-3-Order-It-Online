package com.funcionaldisplay;

import controlador.Controlador;
import java.awt.Color;
import java.io.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

public class Login extends javax.swing.JFrame implements IVista {
    Controlador control;
    int xmouse, ymouse;
    int t = 0;
    BufferedReader input;
    PrintWriter output;
    BufferedReader inputUsuario;

    public Login() {
        initComponents();

        usertxt.setText("");

        //usertxt.setText("");
        usertxt.setBackground(new java.awt.Color(7, 146,146));
        resultxt.setBackground(new java.awt.Color(7, 146, 146));
        advert.setVisible(false);
        ordenarbutton.requestFocusInWindow();
        ordenamientoop.setUI(Propiedades.createUI(rootPane));
        //ordenamientoop.set
        //ordenamientoop.setBackground(new java.awt.Color(34,82,98));
        //ordenamientoop.setBorder(BorderFactory.createLineBorder(new java.awt.Color(34,255,98)));
        usertxt.getDocument().addDocumentListener(new DocumentListener() {
            public void insertUpdate(DocumentEvent e) {
                if (isPasteAction(e)) {

                    // Acciones a realizar cuando se detecta un pegado de texto
                    if (usertxt.getText().matches("[a-zA-Z]+") || (usertxt.getText().matches("[a-zA-Z]+")) && usertxt.getText().contains(",")) {
                        /* try {
                            Thread.sleep(1000); // Retraso de 1 segundo (1000 milisegundos)
                        } catch (InterruptedException h) {
                            h.printStackTrace();
                        }*/
                        usertxt.cut();

                        advert.setVisible(true);
                    } else {
                        //advert.setVisible(false);

                    }
                    System.out.println("Texto pegado");
                }
            }

            public void removeUpdate(DocumentEvent e) {
                // Texto eliminado
            }

            public void changedUpdate(DocumentEvent e) {
                // Cambio en atributos del documento

            }

            private boolean isPasteAction(DocumentEvent e) {
                // Verificar si la longitud del texto ha aumentado
                return e.getLength() > 1;
            }
        });
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        background = new javax.swing.JPanel();
        header = new javax.swing.JPanel();
        exitbutton = new javax.swing.JPanel();
        exittxt = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        tminus = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        welcomelabel = new javax.swing.JLabel();
        contralabel = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        datoslabel1 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        ordenarbutton = new javax.swing.JPanel();
        ordenarbuttontext = new javax.swing.JLabel();
        usertxt = new javax.swing.JTextField();
        ordenamientoop = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        logolabel = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        resultxt = new javax.swing.JTextField();
        jSeparator5 = new javax.swing.JSeparator();
        advert = new javax.swing.JLabel();
        fondoyel = new javax.swing.JLabel();

        jLabel2.setText("jLabel2");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);
        setResizable(false);

        background.setBackground(new java.awt.Color(255, 255, 255));
        background.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        header.setBackground(new java.awt.Color(0, 0, 0));
        header.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                headerMouseDragged(evt);
            }
        });
        header.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                headerMousePressed(evt);
            }
        });

        exitbutton.setBackground(new java.awt.Color(0, 0, 0));
        exitbutton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitbuttonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                exitbuttonMouseEntered(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                exitbuttonMousePressed(evt);
            }
        });

        exittxt.setFont(new java.awt.Font("Play", 1, 18)); // NOI18N
        exittxt.setForeground(new java.awt.Color(157, 157, 157));
        exittxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        exittxt.setText("X");
        exittxt.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        exittxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exittxtMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                exittxtMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                exittxtMouseExited(evt);
            }
        });

        javax.swing.GroupLayout exitbuttonLayout = new javax.swing.GroupLayout(exitbutton);
        exitbutton.setLayout(exitbuttonLayout);
        exitbuttonLayout.setHorizontalGroup(
            exitbuttonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(exittxt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 20, Short.MAX_VALUE)
        );
        exitbuttonLayout.setVerticalGroup(
            exitbuttonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(exitbuttonLayout.createSequentialGroup()
                .addComponent(exittxt)
                .addGap(0, 6, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout headerLayout = new javax.swing.GroupLayout(header);
        header.setLayout(headerLayout);
        headerLayout.setHorizontalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, headerLayout.createSequentialGroup()
                .addGap(0, 780, Short.MAX_VALUE)
                .addComponent(exitbutton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        headerLayout.setVerticalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, headerLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(exitbutton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        background.add(header, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 20));

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setOpaque(true);
        background.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 20, 5, 500));

        tminus.setFont(new java.awt.Font("Play", 1, 14)); // NOI18N
        tminus.setForeground(new java.awt.Color(51, 51, 51));
        tminus.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tminus.setText("!:______________:¡");
        background.add(tminus, new org.netbeans.lib.awtextra.AbsoluteConstraints(417, 470, 250, 30));

        jLabel4.setFont(new java.awt.Font("Play", 3, 10)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 204, 204));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("(Ej: 12,34,23)");
        background.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 160, 220, 20));

        welcomelabel.setFont(new java.awt.Font("Play", 1, 36)); // NOI18N
        welcomelabel.setForeground(new java.awt.Color(255, 255, 255));
        welcomelabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com.resources/cubo3.png"))); // NOI18N
        background.add(welcomelabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 30, 90, 90));

        contralabel.setFont(new java.awt.Font("Play", 1, 22)); // NOI18N
        contralabel.setForeground(new java.awt.Color(255, 255, 153));
        contralabel.setText("TIPO DE ORDENAMIENTO");
        background.add(contralabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(405, 250, 280, 40));
        background.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 350, 320, 10));

        datoslabel1.setFont(new java.awt.Font("Play", 1, 22)); // NOI18N
        datoslabel1.setForeground(new java.awt.Color(255, 255, 153));
        datoslabel1.setText("CONJUNTO DE DATOS");
        background.add(datoslabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 120, 240, 40));
        background.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 220, 310, 30));

        jSeparator4.setForeground(new java.awt.Color(255, 255, 255));
        background.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(485, 400, 110, 30));

        ordenarbutton.setBackground(new java.awt.Color(7, 146, 146));
        ordenarbutton.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        ordenarbutton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ordenarbuttonMouseExited(evt);
            }
        });

        ordenarbuttontext.setBackground(new java.awt.Color(34, 82, 98));
        ordenarbuttontext.setFont(new java.awt.Font("Play", 1, 22)); // NOI18N
        ordenarbuttontext.setForeground(new java.awt.Color(0, 255, 204));
        ordenarbuttontext.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ordenarbuttontext.setText("ORDENAR");
        ordenarbuttontext.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ordenarbuttontextMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ordenarbuttontextMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ordenarbuttontextMouseExited(evt);
            }
        });

        javax.swing.GroupLayout ordenarbuttonLayout = new javax.swing.GroupLayout(ordenarbutton);
        ordenarbutton.setLayout(ordenarbuttonLayout);
        ordenarbuttonLayout.setHorizontalGroup(
            ordenarbuttonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ordenarbuttonLayout.createSequentialGroup()
                .addComponent(ordenarbuttontext)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        ordenarbuttonLayout.setVerticalGroup(
            ordenarbuttonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ordenarbuttonLayout.createSequentialGroup()
                .addComponent(ordenarbuttontext)
                .addGap(0, 4, Short.MAX_VALUE))
        );

        background.add(ordenarbutton, new org.netbeans.lib.awtextra.AbsoluteConstraints(485, 375, 120, 30));

        usertxt.setFont(new java.awt.Font("Play", 0, 12)); // NOI18N
        usertxt.setForeground(new java.awt.Color(0, 0, 0));
        usertxt.setBorder(null);
        usertxt.setDisabledTextColor(new java.awt.Color(51, 51, 51));
        usertxt.setSelectedTextColor(new java.awt.Color(51, 51, 51));
        usertxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usertxtActionPerformed(evt);
            }
        });
        usertxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                usertxtKeyTyped(evt);
            }
        });
        background.add(usertxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 190, 310, 30));

        ordenamientoop.setBackground(new java.awt.Color(204, 204, 204));
        ordenamientoop.setFont(new java.awt.Font("Play", 1, 14)); // NOI18N
        ordenamientoop.setForeground(new java.awt.Color(20, 20, 20));
        ordenamientoop.setMaximumRowCount(8);
        ordenamientoop.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ordenamiento Burbuja", "Ordenamiento Por Insercion", "Ordenamiento Por Seleccion", "Ordenamiento Heap Sort", "Ordenamiento Quick Sort", "Ordenamiento Shell Sort", "Ordenamiento Radix Sort", "Ordenamiento Mezcla Natural" }));
        ordenamientoop.setAutoscrolls(true);
        ordenamientoop.setBorder(null);
        ordenamientoop.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        ordenamientoop.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        ordenamientoop.setOpaque(true);
        ordenamientoop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ordenamientoopActionPerformed(evt);
            }
        });
        background.add(ordenamientoop, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 320, 320, 30));

        jLabel5.setFont(new java.awt.Font("Play", 3, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 204, 204));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Por favor seleccione el  tipo ordenamiento a ejecutar:");
        background.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 290, 310, 20));

        jLabel6.setFont(new java.awt.Font("Play", 3, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(204, 204, 204));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Por favor ingrese el conjunto de datos:");
        background.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 160, 220, 20));

        logolabel.setBackground(new java.awt.Color(0, 204, 204));
        logolabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        logolabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com.resources/fondonol (2).png"))); // NOI18N
        logolabel.setOpaque(true);
        background.add(logolabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 290, 500));

        jLabel7.setFont(new java.awt.Font("Play", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(153, 0, 0));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Tiempo de Ejecucion!!");
        background.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(418, 450, 250, 30));

        resultxt.setEditable(false);
        resultxt.setBackground(new java.awt.Color(255, 255, 255));
        resultxt.setFont(new java.awt.Font("Play", 0, 12)); // NOI18N
        resultxt.setForeground(new java.awt.Color(0, 0, 0));
        resultxt.setBorder(null);
        resultxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resultxtActionPerformed(evt);
            }
        });
        background.add(resultxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 415, 310, 30));
        background.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 445, 310, 30));

        advert.setFont(new java.awt.Font("Play", 3, 12)); // NOI18N
        advert.setForeground(new java.awt.Color(204, 204, 204));
        advert.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        advert.setText("Los datos a ingresar deben tener el formato correcto");
        background.add(advert, new org.netbeans.lib.awtextra.AbsoluteConstraints(385, 230, 320, 20));

        fondoyel.setBackground(new java.awt.Color(162, 226, 248));
        fondoyel.setForeground(new java.awt.Color(162, 226, 248));
        fondoyel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com.resources/fondo3.png"))); // NOI18N
        background.add(fondoyel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 520));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void headerMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_headerMousePressed
        xmouse = evt.getX();
        ymouse = evt.getY();

    }//GEN-LAST:event_headerMousePressed

    private void headerMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_headerMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xmouse, y - ymouse);
    }//GEN-LAST:event_headerMouseDragged

    private void exitbuttonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitbuttonMousePressed

    }//GEN-LAST:event_exitbuttonMousePressed

    private void exittxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exittxtMouseClicked
        this.dispose();
    }//GEN-LAST:event_exittxtMouseClicked

    private void exitbuttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitbuttonMouseClicked
        this.dispose();
    }//GEN-LAST:event_exitbuttonMouseClicked

    private void exitbuttonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitbuttonMouseEntered


    }//GEN-LAST:event_exitbuttonMouseEntered

    private void exittxtMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exittxtMouseEntered
        exitbutton.setBackground(new java.awt.Color(104, 0, 0));
        exittxt.setForeground(Color.white);
    }//GEN-LAST:event_exittxtMouseEntered

    private void exittxtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exittxtMouseExited
        exitbutton.setBackground(new java.awt.Color(0, 0, 0));
        exittxt.setForeground(new java.awt.Color(157, 157, 157));

    }//GEN-LAST:event_exittxtMouseExited

    private void ordenarbuttontextMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ordenarbuttontextMouseEntered
        ordenarbuttontext.setForeground(new java.awt.Color(157, 157, 157));
        //entrarbutton.setBackground(new java.awt.Color(157,157,157));
    }//GEN-LAST:event_ordenarbuttontextMouseEntered

    private void ordenarbuttontextMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ordenarbuttontextMouseExited
        ordenarbuttontext.setForeground(new java.awt.Color(0, 255, 204));
        //entrarbutton.setBackground(new java.awt.Color(0, 0, 0, 1));
    }//GEN-LAST:event_ordenarbuttontextMouseExited

    private void ordenarbuttonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ordenarbuttonMouseExited
        //entrarbuttontext.setForeground(new java.awt.Color(104, 0, 0));
    }//GEN-LAST:event_ordenarbuttonMouseExited

    private void usertxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usertxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usertxtActionPerformed

    private void ordenamientoopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ordenamientoopActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ordenamientoopActionPerformed

    private void resultxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resultxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_resultxtActionPerformed

    private void ordenarbuttontextMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ordenarbuttontextMouseClicked
        /*String validao = usertxt.getText();    
        while(validao.contains(",")){
                
            for (int i = 0; i < validao.length(); i++) {
                String dato = String.valueOf(validao.charAt(i));
                if (dato.matches("[a-zA-Z]+")) {
                    //elimina la letra del campo de texto
                    usertxt.setText(validao.replaceAll(dato, ""));
                }

                if (dato.matches(",") && String.valueOf(validao.charAt(i + 1)).matches(",")) {
                    //elimina la letra del campo de texto
                    String part1 = validao.substring(0, i);
                    String part2 = validao.substring(i + 2, validao.length());
                    usertxt.setText(part1 + part2);
                    System.out.println("dd");
                    advert.setVisible(true);
                }else{
                    advert.setVisible(true);
                }
            }
            
        }*/
        usertxt.setText(usertxt.getText().replaceAll(",+", ","));
        usertxt.setText(usertxt.getText().replaceAll("^,|,$", ""));
        usertxt.setText(usertxt.getText().replaceAll("[a-zA-Z]", ""));

        // Remove leading and trailing commas
        //encuentra la posicion de un string en un texto
        do {

            //encuentra una letra en el campo de texto y la elimina
            if (usertxt.getText().matches("[a-zA-Z]+")) {
                usertxt.setText(usertxt.getText().replaceAll("[a-zA-Z]+", ""));
            }
            //entro

            if (usertxt.getText().matches("[a-zA-Z]+") || usertxt.getText().matches(",")) {
                usertxt.setText("");
                advert.setVisible(true);
            } else {
                advert.setVisible(false);

            }
            //valida que el campo de texto no posea mas de 2 comas
            if (usertxt.getText().length() > 0) {
                char c = usertxt.getText().charAt(usertxt.getText().length() - 1);
                if (c == ',' && usertxt.getText().charAt(usertxt.getText().length() - 2) == ',') {
                    usertxt.setText(usertxt.getText().substring(0, usertxt.getText().length() - 1));
                }
            }
            //valida que el campo de texto no posea una coma al final
            if (usertxt.getText().length() > 0) {
                char c = usertxt.getText().charAt(usertxt.getText().length() - 1);
                if (c == ',') {
                    usertxt.setText(usertxt.getText().substring(0, usertxt.getText().length() - 1));
                }
            }
            //valida que el campo de texto no posea una coma al inicio
            if (usertxt.getText().length() > 0) {
                char c = usertxt.getText().charAt(0);
                if (c == ',') {
                    usertxt.setText(usertxt.getText().substring(1, usertxt.getText().length()));
                }
            }
            //valida que el campo de texto no posea letras
            if (usertxt.getText().length() > 0) {
                char c = usertxt.getText().charAt(usertxt.getText().length() - 1);
                if (c == 'a' || c == 'b' || c == 'c' || c == 'd' || c == 'e'
                        || c == 'f' || c == 'g' || c == 'h' || c == 'i' || c == 'j'
                        || c == 'k' || c == 'l' || c == 'm' || c == 'n' || c == 'ñ'
                        || c == 'o' || c == 'p' || c == 'q' || c == 'r' || c == 's'
                        || c == 't' || c == 'u' || c == 'v' || c == 'w' || c == 'x'
                        || c == 'y' || c == 'z' || c == 'A' || c == 'B' || c == 'C'
                        || c == 'D' || c == 'E' || c == 'F' || c == 'G' || c == 'H'
                        || c == 'I' || c == 'J' || c == 'K' || c == 'L' || c == 'M'
                        || c == 'N' || c == 'Ñ' || c == 'O' || c == 'P' || c == 'Q'
                        || c == 'R' || c == 'S' || c == 'T' || c == 'U' || c == 'V'
                        || c == 'W' || c == 'X' || c == 'Y' || c == 'Z') {
                    usertxt.setText(usertxt.getText().substring(0, usertxt.getText().length() - 1));
                }
            }

            advert.setVisible(false);
            //revisa si el texto poseo alguna letra
        } while (usertxt.getText().matches("[a-zA-Z]+"));
        //revisa si el texto posee solo comas

        if (usertxt.getText().matches(",+")) {
            usertxt.setText("");

        } else {
            if (usertxt.getText().length() == 1) {
                if (usertxt.getText().charAt(0) == ',') {
                    usertxt.setText("");
                }
            }
            advert.setVisible(false);

        }

        System.out.println("todo bien");
        //////////////////////////////////////////////////////////////////////////////////////////////////////
        String tipOrden = ordenamientoop.getSelectedItem().toString();
        String datoValidado = usertxt.getText();
        control.enviarMensaje(tipOrden);
        control.enviarMensaje(datoValidado);
        
        }//GEN-LAST:event_ordenarbuttontextMouseClicked

    private void usertxtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_usertxtKeyTyped
        //detecta si algo diferente a un numero o una coma es ingresado
        if (usertxt.getText().matches("[a-zA-Z]+") || usertxt.getText().matches(",")) {
            usertxt.setText("");
            advert.setVisible(true);
        } else {
            advert.setVisible(false);

        }

        if (usertxt.getText().length() > 0) {
            char c = evt.getKeyChar();
            if (c != ',' && (c < '0' || c > '9')) {
                evt.consume();
            }
        }
        //valida que no se puedan escribir mas de una coma de manera consecutiva
        if (usertxt.getText().length() > 0) {
            char c = evt.getKeyChar();
            if (c == ',' && usertxt.getText().charAt(usertxt.getText().length() - 1) == ',') {
                evt.consume();
            }
        }
    }//GEN-LAST:event_usertxtKeyTyped
    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;

                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Login.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel advert;
    private javax.swing.JPanel background;
    private javax.swing.JLabel contralabel;
    private javax.swing.JLabel datoslabel1;
    private javax.swing.JPanel exitbutton;
    private javax.swing.JLabel exittxt;
    private javax.swing.JLabel fondoyel;
    private javax.swing.JPanel header;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JLabel logolabel;
    private javax.swing.JComboBox<String> ordenamientoop;
    private javax.swing.JPanel ordenarbutton;
    private javax.swing.JLabel ordenarbuttontext;
    private javax.swing.JTextField resultxt;
    private javax.swing.JLabel tminus;
    private javax.swing.JTextField usertxt;
    private javax.swing.JLabel welcomelabel;
    // End of variables declaration//GEN-END:variables

    @Override
    public void setControl(Controlador control) {
        this.control = control;
    }
    
    @Override
    public void addMensaje(String mensaje){
        resultxt.setText(mensaje);
    }
    
    @Override
    public void isVisible(boolean visible){
        this.setVisible(visible);
    }
}
