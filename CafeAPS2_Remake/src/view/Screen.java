package view;

import cafeaps.Altitude;
import cafeaps.Area;
import cafeaps.EpocaPlantar;
import cafeaps.Precipitacao;
import cafeaps.Profundidade;
import cafeaps.SoloArenoso;
import cafeaps.SoloDrenagem;
import cafeaps.SoloFertil;
import cafeaps.SoloPedregoso;
import cafeaps.Temperatura;
import java.awt.CardLayout;
import javax.swing.JOptionPane;

public class Screen extends javax.swing.JFrame {
    
    private int varDados = 1;
    private double progBarStatus = 100/7;
    
    public Screen() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    
    private void mensagem(String msg) {
        JOptionPane.showMessageDialog(null, msg);
    }
    
    private void proximo() {
        progbar.setValue(progbar.getValue() + 15);
        CardLayout cl2 = (CardLayout) informacoes.getLayout();
        cl2.show(informacoes, "dados" + ++varDados);
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tela = new javax.swing.JPanel();
        inicio = new javax.swing.JPanel();
        btnComecar = new javax.swing.JButton();
        btnSobre = new javax.swing.JButton();
        img = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        sobre = new javax.swing.JPanel();
        btnVoltar = new javax.swing.JButton();
        lblSobre = new javax.swing.JTextArea();
        dados = new javax.swing.JPanel();
        informacoes = new javax.swing.JPanel();
        tamanho = new javax.swing.JPanel();
        lblComprimento = new javax.swing.JLabel();
        lblLargura = new javax.swing.JLabel();
        btnTamanho = new javax.swing.JButton();
        txtLargura = new javax.swing.JTextField();
        txtComprimento = new javax.swing.JTextField();
        profundidade = new javax.swing.JPanel();
        lblProfundidade = new javax.swing.JLabel();
        btnProfundidade = new javax.swing.JButton();
        txtProfundidade = new javax.swing.JTextField();
        tipoSolo = new javax.swing.JPanel();
        btnTipoSolo = new javax.swing.JButton();
        lblTipoSolo = new javax.swing.JLabel();
        soloPedregoso = new javax.swing.JRadioButton();
        soloArenoso = new javax.swing.JRadioButton();
        soloFertil = new javax.swing.JRadioButton();
        soloDrenagem = new javax.swing.JRadioButton();
        altitude = new javax.swing.JPanel();
        lblAltitude = new javax.swing.JLabel();
        txtAltitude = new javax.swing.JTextField();
        btnAltitude = new javax.swing.JButton();
        temperatura = new javax.swing.JPanel();
        lblTemperatura = new javax.swing.JLabel();
        txtTemperatura = new javax.swing.JTextField();
        btnTemperatura = new javax.swing.JButton();
        precipitacao = new javax.swing.JPanel();
        lblPrecipitacao = new javax.swing.JLabel();
        btnPrecipitacao = new javax.swing.JButton();
        txtPrecipitacao = new javax.swing.JTextField();
        epoca = new javax.swing.JPanel();
        btnEpoca = new javax.swing.JButton();
        cbEpoca = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        lblInformacoes = new javax.swing.JLabel();
        progbar = new javax.swing.JProgressBar();
        relatorio = new javax.swing.JPanel();
        txtRelatorioFinal = new javax.swing.JTextArea();
        scrollNegativos = new javax.swing.JScrollPane();
        txtRelatorioNegativo = new javax.swing.JTextArea();
        scrollPositivos = new javax.swing.JScrollPane();
        txtRelatorioPositivo = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cafhélper");
        setLocation(new java.awt.Point(0, 0));
        setLocationByPlatform(true);
        setMaximumSize(new java.awt.Dimension(600, 300));
        setMinimumSize(new java.awt.Dimension(600, 300));
        setName("Cafe"); // NOI18N
        setResizable(false);

        tela.setForeground(new java.awt.Color(0, 127, 16));
        tela.setMaximumSize(new java.awt.Dimension(600, 300));
        tela.setMinimumSize(new java.awt.Dimension(600, 500));
        tela.setLayout(new java.awt.CardLayout());

        inicio.setBackground(new java.awt.Color(0, 67, 16));
        inicio.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        inicio.setMaximumSize(new java.awt.Dimension(800, 500));
        inicio.setMinimumSize(new java.awt.Dimension(800, 500));
        inicio.setPreferredSize(new java.awt.Dimension(600, 300));

        btnComecar.setBackground(new java.awt.Color(227, 247, 235));
        btnComecar.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnComecar.setText("Começar");
        btnComecar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnComecar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnComecar.setNextFocusableComponent(btnSobre);
        btnComecar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnComecarActionPerformed(evt);
            }
        });

        btnSobre.setBackground(new java.awt.Color(227, 247, 235));
        btnSobre.setText("Sobre");
        btnSobre.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnSobre.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSobre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSobreActionPerformed(evt);
            }
        });

        img.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/cafefolha.png"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Cafhélper");

        javax.swing.GroupLayout inicioLayout = new javax.swing.GroupLayout(inicio);
        inicio.setLayout(inicioLayout);
        inicioLayout.setHorizontalGroup(
            inicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(inicioLayout.createSequentialGroup()
                .addGroup(inicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(inicioLayout.createSequentialGroup()
                        .addGap(97, 97, 97)
                        .addComponent(img, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(inicioLayout.createSequentialGroup()
                        .addGap(183, 183, 183)
                        .addComponent(btnComecar, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(inicioLayout.createSequentialGroup()
                        .addGap(244, 244, 244)
                        .addComponent(btnSobre, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(269, Short.MAX_VALUE))
        );
        inicioLayout.setVerticalGroup(
            inicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(inicioLayout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addGroup(inicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(img, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addComponent(btnComecar, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSobre)
                .addGap(72, 72, 72))
        );

        tela.add(inicio, "inicio");

        sobre.setBackground(new java.awt.Color(0, 67, 16));
        sobre.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        sobre.setMaximumSize(new java.awt.Dimension(800, 500));
        sobre.setMinimumSize(new java.awt.Dimension(800, 500));
        sobre.setPreferredSize(new java.awt.Dimension(600, 300));

        btnVoltar.setBackground(new java.awt.Color(227, 247, 235));
        btnVoltar.setText("Voltar");
        btnVoltar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnVoltar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnVoltar.setMaximumSize(new java.awt.Dimension(45, 20));
        btnVoltar.setMinimumSize(new java.awt.Dimension(45, 20));
        btnVoltar.setPreferredSize(new java.awt.Dimension(45, 20));
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });

        lblSobre.setEditable(false);
        lblSobre.setColumns(20);
        lblSobre.setFont(new java.awt.Font("MS PGothic", 0, 14)); // NOI18N
        lblSobre.setLineWrap(true);
        lblSobre.setRows(5);
        lblSobre.setWrapStyleWord(true);

        javax.swing.GroupLayout sobreLayout = new javax.swing.GroupLayout(sobre);
        sobre.setLayout(sobreLayout);
        sobreLayout.setHorizontalGroup(
            sobreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sobreLayout.createSequentialGroup()
                .addGroup(sobreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(sobreLayout.createSequentialGroup()
                        .addGap(248, 248, 248)
                        .addComponent(btnVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(sobreLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(lblSobre, javax.swing.GroupLayout.PREFERRED_SIZE, 562, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        sobreLayout.setVerticalGroup(
            sobreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sobreLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblSobre, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tela.add(sobre, "sobre");

        dados.setBackground(new java.awt.Color(0, 67, 16));
        dados.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        dados.setMaximumSize(new java.awt.Dimension(800, 500));
        dados.setMinimumSize(new java.awt.Dimension(800, 500));
        dados.setPreferredSize(new java.awt.Dimension(600, 300));

        informacoes.setLayout(new java.awt.CardLayout());

        tamanho.setBackground(new java.awt.Color(0, 132, 47));
        tamanho.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblComprimento.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblComprimento.setForeground(new java.awt.Color(255, 255, 255));
        lblComprimento.setText("Comprimento do terreno:");

        lblLargura.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblLargura.setForeground(new java.awt.Color(255, 255, 255));
        lblLargura.setText("Largura do terreno:");

        btnTamanho.setBackground(new java.awt.Color(227, 247, 235));
        btnTamanho.setText("Próximo");
        btnTamanho.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnTamanho.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnTamanho.setMaximumSize(new java.awt.Dimension(45, 20));
        btnTamanho.setMinimumSize(new java.awt.Dimension(45, 20));
        btnTamanho.setPreferredSize(new java.awt.Dimension(45, 20));
        btnTamanho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTamanhoActionPerformed(evt);
            }
        });

        txtLargura.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtLargura.setForeground(new java.awt.Color(96, 57, 27));
        txtLargura.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtLargura.setText("0");

        txtComprimento.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtComprimento.setForeground(new java.awt.Color(96, 57, 27));
        txtComprimento.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtComprimento.setText("0");

        javax.swing.GroupLayout tamanhoLayout = new javax.swing.GroupLayout(tamanho);
        tamanho.setLayout(tamanhoLayout);
        tamanhoLayout.setHorizontalGroup(
            tamanhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tamanhoLayout.createSequentialGroup()
                .addGroup(tamanhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(tamanhoLayout.createSequentialGroup()
                        .addGap(259, 259, 259)
                        .addComponent(btnTamanho, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(tamanhoLayout.createSequentialGroup()
                        .addGap(86, 86, 86)
                        .addGroup(tamanhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblComprimento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtComprimento))
                        .addGap(52, 52, 52)
                        .addGroup(tamanhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblLargura, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtLargura))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tamanhoLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {lblComprimento, lblLargura});

        tamanhoLayout.setVerticalGroup(
            tamanhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tamanhoLayout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(tamanhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblComprimento)
                    .addComponent(lblLargura))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(tamanhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtLargura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtComprimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnTamanho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        tamanhoLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {lblComprimento, lblLargura});

        tamanhoLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {txtComprimento, txtLargura});

        informacoes.add(tamanho, "dados1");

        profundidade.setBackground(new java.awt.Color(0, 132, 47));
        profundidade.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblProfundidade.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblProfundidade.setForeground(new java.awt.Color(255, 255, 255));
        lblProfundidade.setText("Profundidade do solo em metros:");

        btnProfundidade.setBackground(new java.awt.Color(227, 247, 235));
        btnProfundidade.setText("Próximo");
        btnProfundidade.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnProfundidade.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnProfundidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProfundidadeActionPerformed(evt);
            }
        });

        txtProfundidade.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtProfundidade.setForeground(new java.awt.Color(96, 57, 27));
        txtProfundidade.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtProfundidade.setText("0");

        javax.swing.GroupLayout profundidadeLayout = new javax.swing.GroupLayout(profundidade);
        profundidade.setLayout(profundidadeLayout);
        profundidadeLayout.setHorizontalGroup(
            profundidadeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(profundidadeLayout.createSequentialGroup()
                .addGroup(profundidadeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(profundidadeLayout.createSequentialGroup()
                        .addGap(253, 253, 253)
                        .addComponent(btnProfundidade, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(profundidadeLayout.createSequentialGroup()
                        .addGap(164, 164, 164)
                        .addGroup(profundidadeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblProfundidade, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtProfundidade))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        profundidadeLayout.setVerticalGroup(
            profundidadeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, profundidadeLayout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(lblProfundidade)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtProfundidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnProfundidade)
                .addContainerGap())
        );

        informacoes.add(profundidade, "dados2");

        tipoSolo.setBackground(new java.awt.Color(0, 132, 47));
        tipoSolo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        btnTipoSolo.setBackground(new java.awt.Color(227, 247, 235));
        btnTipoSolo.setText("Próximo");
        btnTipoSolo.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnTipoSolo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnTipoSolo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTipoSoloActionPerformed(evt);
            }
        });

        lblTipoSolo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblTipoSolo.setForeground(new java.awt.Color(255, 255, 255));
        lblTipoSolo.setText("Tipo de solo:");

        soloPedregoso.setBackground(new java.awt.Color(0, 132, 47));
        soloPedregoso.setForeground(new java.awt.Color(255, 255, 255));
        soloPedregoso.setText("Pedregoso");

        soloArenoso.setBackground(new java.awt.Color(0, 132, 47));
        soloArenoso.setForeground(new java.awt.Color(255, 255, 255));
        soloArenoso.setText("Arenoso");

        soloFertil.setBackground(new java.awt.Color(0, 132, 47));
        soloFertil.setForeground(new java.awt.Color(255, 255, 255));
        soloFertil.setText("Fértil");

        soloDrenagem.setBackground(new java.awt.Color(0, 132, 47));
        soloDrenagem.setForeground(new java.awt.Color(255, 255, 255));
        soloDrenagem.setText("Boa drenagem");

        javax.swing.GroupLayout tipoSoloLayout = new javax.swing.GroupLayout(tipoSolo);
        tipoSolo.setLayout(tipoSoloLayout);
        tipoSoloLayout.setHorizontalGroup(
            tipoSoloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tipoSoloLayout.createSequentialGroup()
                .addGroup(tipoSoloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(tipoSoloLayout.createSequentialGroup()
                        .addGap(257, 257, 257)
                        .addComponent(btnTipoSolo, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(tipoSoloLayout.createSequentialGroup()
                        .addGap(245, 245, 245)
                        .addGroup(tipoSoloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(soloPedregoso)
                            .addComponent(lblTipoSolo)
                            .addComponent(soloArenoso)
                            .addComponent(soloFertil)
                            .addComponent(soloDrenagem))))
                .addContainerGap(249, Short.MAX_VALUE))
        );
        tipoSoloLayout.setVerticalGroup(
            tipoSoloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tipoSoloLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(lblTipoSolo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(soloPedregoso)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(soloArenoso)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(soloFertil)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(soloDrenagem)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addComponent(btnTipoSolo)
                .addContainerGap())
        );

        informacoes.add(tipoSolo, "dados3");

        altitude.setBackground(new java.awt.Color(0, 132, 47));
        altitude.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblAltitude.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblAltitude.setForeground(new java.awt.Color(255, 255, 255));
        lblAltitude.setText("Altitude do terreno em metros:");

        txtAltitude.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtAltitude.setForeground(new java.awt.Color(96, 57, 27));
        txtAltitude.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtAltitude.setText("0");

        btnAltitude.setBackground(new java.awt.Color(227, 247, 235));
        btnAltitude.setText("Próximo");
        btnAltitude.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnAltitude.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAltitude.setMaximumSize(new java.awt.Dimension(45, 20));
        btnAltitude.setMinimumSize(new java.awt.Dimension(45, 20));
        btnAltitude.setPreferredSize(new java.awt.Dimension(45, 20));
        btnAltitude.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAltitudeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout altitudeLayout = new javax.swing.GroupLayout(altitude);
        altitude.setLayout(altitudeLayout);
        altitudeLayout.setHorizontalGroup(
            altitudeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(altitudeLayout.createSequentialGroup()
                .addGroup(altitudeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(altitudeLayout.createSequentialGroup()
                        .addGap(259, 259, 259)
                        .addComponent(btnAltitude, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(altitudeLayout.createSequentialGroup()
                        .addGap(168, 168, 168)
                        .addGroup(altitudeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblAltitude, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtAltitude, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        altitudeLayout.setVerticalGroup(
            altitudeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(altitudeLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblAltitude)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtAltitude, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addComponent(btnAltitude, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        informacoes.add(altitude, "dados4");

        temperatura.setBackground(new java.awt.Color(0, 132, 47));
        temperatura.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblTemperatura.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblTemperatura.setForeground(new java.awt.Color(255, 255, 255));
        lblTemperatura.setText("Temperatura média do local:");

        txtTemperatura.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtTemperatura.setForeground(new java.awt.Color(96, 57, 27));
        txtTemperatura.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtTemperatura.setText("0");

        btnTemperatura.setBackground(new java.awt.Color(227, 247, 235));
        btnTemperatura.setText("Próximo");
        btnTemperatura.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnTemperatura.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnTemperatura.setMaximumSize(new java.awt.Dimension(45, 20));
        btnTemperatura.setMinimumSize(new java.awt.Dimension(45, 20));
        btnTemperatura.setPreferredSize(new java.awt.Dimension(45, 20));
        btnTemperatura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTemperaturaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout temperaturaLayout = new javax.swing.GroupLayout(temperatura);
        temperatura.setLayout(temperaturaLayout);
        temperaturaLayout.setHorizontalGroup(
            temperaturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(temperaturaLayout.createSequentialGroup()
                .addGroup(temperaturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(temperaturaLayout.createSequentialGroup()
                        .addGap(256, 256, 256)
                        .addComponent(btnTemperatura, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(temperaturaLayout.createSequentialGroup()
                        .addGap(237, 237, 237)
                        .addComponent(txtTemperatura, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(temperaturaLayout.createSequentialGroup()
                        .addGap(178, 178, 178)
                        .addComponent(lblTemperatura)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        temperaturaLayout.setVerticalGroup(
            temperaturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(temperaturaLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(lblTemperatura)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtTemperatura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnTemperatura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        informacoes.add(temperatura, "dados5");

        precipitacao.setBackground(new java.awt.Color(0, 132, 47));
        precipitacao.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblPrecipitacao.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblPrecipitacao.setForeground(new java.awt.Color(255, 255, 255));
        lblPrecipitacao.setText("Precipitacao média do local:");

        btnPrecipitacao.setBackground(new java.awt.Color(227, 247, 235));
        btnPrecipitacao.setText("Próximo");
        btnPrecipitacao.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnPrecipitacao.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPrecipitacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrecipitacaoActionPerformed(evt);
            }
        });

        txtPrecipitacao.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtPrecipitacao.setForeground(new java.awt.Color(96, 57, 27));
        txtPrecipitacao.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtPrecipitacao.setText("0");

        javax.swing.GroupLayout precipitacaoLayout = new javax.swing.GroupLayout(precipitacao);
        precipitacao.setLayout(precipitacaoLayout);
        precipitacaoLayout.setHorizontalGroup(
            precipitacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(precipitacaoLayout.createSequentialGroup()
                .addGroup(precipitacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(precipitacaoLayout.createSequentialGroup()
                        .addGap(255, 255, 255)
                        .addComponent(btnPrecipitacao, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(precipitacaoLayout.createSequentialGroup()
                        .addGap(186, 186, 186)
                        .addComponent(lblPrecipitacao))
                    .addGroup(precipitacaoLayout.createSequentialGroup()
                        .addGap(228, 228, 228)
                        .addComponent(txtPrecipitacao, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        precipitacaoLayout.setVerticalGroup(
            precipitacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(precipitacaoLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblPrecipitacao)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtPrecipitacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(69, 69, 69)
                .addComponent(btnPrecipitacao)
                .addContainerGap())
        );

        informacoes.add(precipitacao, "dados6");

        epoca.setBackground(new java.awt.Color(0, 132, 47));
        epoca.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        btnEpoca.setBackground(new java.awt.Color(227, 247, 235));
        btnEpoca.setText("Finalizar");
        btnEpoca.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnEpoca.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEpoca.setMinimumSize(new java.awt.Dimension(45, 20));
        btnEpoca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEpocaActionPerformed(evt);
            }
        });

        cbEpoca.setBackground(new java.awt.Color(227, 247, 235));
        cbEpoca.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cbEpoca.setForeground(new java.awt.Color(96, 57, 27));
        cbEpoca.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Janeiro", "Feveiro", "Março", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro" }));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Mês previsto para plantação:");

        javax.swing.GroupLayout epocaLayout = new javax.swing.GroupLayout(epoca);
        epoca.setLayout(epocaLayout);
        epocaLayout.setHorizontalGroup(
            epocaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(epocaLayout.createSequentialGroup()
                .addGroup(epocaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(epocaLayout.createSequentialGroup()
                        .addGap(256, 256, 256)
                        .addComponent(btnEpoca, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(epocaLayout.createSequentialGroup()
                        .addGap(182, 182, 182)
                        .addGroup(epocaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(epocaLayout.createSequentialGroup()
                                .addGap(50, 50, 50)
                                .addComponent(cbEpoca, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel1))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        epocaLayout.setVerticalGroup(
            epocaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, epocaLayout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbEpoca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnEpoca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        informacoes.add(epoca, "dados7");

        lblInformacoes.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        lblInformacoes.setForeground(new java.awt.Color(255, 255, 255));
        lblInformacoes.setText("Cafhélper");

        progbar.setBackground(new java.awt.Color(227, 247, 235));
        progbar.setForeground(new java.awt.Color(72, 28, 12));

        javax.swing.GroupLayout dadosLayout = new javax.swing.GroupLayout(dados);
        dados.setLayout(dadosLayout);
        dadosLayout.setHorizontalGroup(
            dadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(informacoes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(dadosLayout.createSequentialGroup()
                .addGroup(dadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(dadosLayout.createSequentialGroup()
                        .addGap(219, 219, 219)
                        .addComponent(progbar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(dadosLayout.createSequentialGroup()
                        .addGap(207, 207, 207)
                        .addComponent(lblInformacoes, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        dadosLayout.setVerticalGroup(
            dadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dadosLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(lblInformacoes)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(informacoes, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(progbar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tela.add(dados, "dados");

        relatorio.setBackground(new java.awt.Color(0, 67, 16));
        relatorio.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        relatorio.setMaximumSize(new java.awt.Dimension(800, 500));
        relatorio.setMinimumSize(new java.awt.Dimension(800, 500));

        txtRelatorioFinal.setEditable(false);
        txtRelatorioFinal.setColumns(20);
        txtRelatorioFinal.setLineWrap(true);
        txtRelatorioFinal.setRows(5);
        txtRelatorioFinal.setWrapStyleWord(true);

        txtRelatorioNegativo.setEditable(false);
        txtRelatorioNegativo.setColumns(20);
        txtRelatorioNegativo.setLineWrap(true);
        txtRelatorioNegativo.setRows(5);
        txtRelatorioNegativo.setWrapStyleWord(true);
        txtRelatorioNegativo.setBorder(javax.swing.BorderFactory.createTitledBorder("Pontos negativos"));
        scrollNegativos.setViewportView(txtRelatorioNegativo);

        txtRelatorioPositivo.setEditable(false);
        txtRelatorioPositivo.setColumns(20);
        txtRelatorioPositivo.setLineWrap(true);
        txtRelatorioPositivo.setRows(5);
        txtRelatorioPositivo.setWrapStyleWord(true);
        txtRelatorioPositivo.setBorder(javax.swing.BorderFactory.createTitledBorder("Pontos positivos"));
        scrollPositivos.setViewportView(txtRelatorioPositivo);

        javax.swing.GroupLayout relatorioLayout = new javax.swing.GroupLayout(relatorio);
        relatorio.setLayout(relatorioLayout);
        relatorioLayout.setHorizontalGroup(
            relatorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(relatorioLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(relatorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtRelatorioFinal)
                    .addGroup(relatorioLayout.createSequentialGroup()
                        .addComponent(scrollPositivos, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(scrollNegativos, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        relatorioLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {scrollNegativos, scrollPositivos});

        relatorioLayout.setVerticalGroup(
            relatorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(relatorioLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(relatorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(scrollPositivos)
                    .addComponent(scrollNegativos))
                .addGap(18, 18, 18)
                .addComponent(txtRelatorioFinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tela.add(relatorio, "relatorio");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tela, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tela, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        setBounds(0, 0, 616, 339);
    }// </editor-fold>//GEN-END:initComponents

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        CardLayout cl = (CardLayout) tela.getLayout();
        cl.show(tela, "inicio");
    }//GEN-LAST:event_btnVoltarActionPerformed

    private void btnTamanhoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTamanhoActionPerformed
        // TODO add your handling code here:
        int largura = Integer.parseInt(txtLargura.getText());
        int comprimento = Integer.parseInt(txtComprimento.getText());
        try {
            Area area = new Area(largura, comprimento);
            proximo();
        } catch (Exception e) {
            mensagem("Por favor, digite um número inteiro!");
        }
    }//GEN-LAST:event_btnTamanhoActionPerformed

    private void btnAltitudeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAltitudeActionPerformed
        // TODO add your handling code here:
        try {
            Altitude altitude = new Altitude(Integer.parseInt(txtAltitude.getText()));
            proximo();
        } catch (Exception e) {
            mensagem("Por favor, digite um número inteiro!");
        }
    }//GEN-LAST:event_btnAltitudeActionPerformed

    private void btnTemperaturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTemperaturaActionPerformed
        // TODO add your handling code here:
        try {
            Temperatura temperatura = new Temperatura(Integer.parseInt(txtTemperatura.getText()));
            proximo();
        } catch (Exception e) {
            mensagem("Por favor, digite um número inteiro!");
        }
    }//GEN-LAST:event_btnTemperaturaActionPerformed

    private void btnPrecipitacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrecipitacaoActionPerformed
        // TODO add your handling code here:
        try {
            Precipitacao prec = new Precipitacao(Integer.parseInt(txtPrecipitacao.getText()));
            proximo();
        } catch (Exception e) {
            mensagem("Por favor, digite um número inteiro (milimetros)!");
        }
    }//GEN-LAST:event_btnPrecipitacaoActionPerformed

    private void btnProfundidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProfundidadeActionPerformed
        // TODO add your handling code here:
        try {
            Profundidade profundidade = new Profundidade(Integer.parseInt(txtProfundidade.getText()));
            proximo();
        } catch (Exception e) {
            mensagem("Por favor, digite um número inteiro (metros)!");
        }  
    }//GEN-LAST:event_btnProfundidadeActionPerformed

    private void btnTipoSoloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTipoSoloActionPerformed
        // TODO add your handling code here:
        proximo();
        System.out.println(soloFertil.isSelected());
        
        SoloArenoso arenoso = new SoloArenoso(soloArenoso.isSelected());
        SoloPedregoso pedregoso = new SoloPedregoso(soloPedregoso.isSelected());
        SoloFertil fertil = new SoloFertil(soloFertil.isSelected());
        SoloDrenagem drenagem = new SoloDrenagem(soloArenoso.isSelected());
    }//GEN-LAST:event_btnTipoSoloActionPerformed

    private void btnEpocaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEpocaActionPerformed
        // TODO add your handling code here:
        EpocaPlantar epoca = new EpocaPlantar(cbEpoca.getSelectedIndex() + 1);

        CardLayout cl = (CardLayout) tela.getLayout();
        cl.show(tela, "relatorio");
        txtRelatorioPositivo.setText(cafeaps.CafeAPS.relatorio.getRelatorioPositivo());
        txtRelatorioNegativo.setText(cafeaps.CafeAPS.relatorio.getRelatorioNegativo());
        txtRelatorioFinal.setText(cafeaps.CafeAPS.relatorio.getRelatorioFinal());
        txtRelatorioNegativo.setVisible(true);
    }//GEN-LAST:event_btnEpocaActionPerformed

    private void btnSobreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSobreActionPerformed
        lblSobre.setText(cafeaps.CafeAPS.textoSobre());
        CardLayout cl = (CardLayout) tela.getLayout();
        cl.show(tela, "sobre");
    }//GEN-LAST:event_btnSobreActionPerformed

    private void btnComecarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnComecarActionPerformed
        CardLayout cl = (CardLayout) tela.getLayout();
        cl.show(tela, "dados");
    }//GEN-LAST:event_btnComecarActionPerformed
    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Screen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel altitude;
    private javax.swing.JButton btnAltitude;
    private javax.swing.JButton btnComecar;
    private javax.swing.JButton btnEpoca;
    private javax.swing.JButton btnPrecipitacao;
    private javax.swing.JButton btnProfundidade;
    private javax.swing.JButton btnSobre;
    private javax.swing.JButton btnTamanho;
    private javax.swing.JButton btnTemperatura;
    private javax.swing.JButton btnTipoSolo;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JComboBox<String> cbEpoca;
    private javax.swing.JPanel dados;
    private javax.swing.JPanel epoca;
    private javax.swing.JLabel img;
    private javax.swing.JPanel informacoes;
    private javax.swing.JPanel inicio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lblAltitude;
    private javax.swing.JLabel lblComprimento;
    private javax.swing.JLabel lblInformacoes;
    private javax.swing.JLabel lblLargura;
    private javax.swing.JLabel lblPrecipitacao;
    private javax.swing.JLabel lblProfundidade;
    private javax.swing.JTextArea lblSobre;
    private javax.swing.JLabel lblTemperatura;
    private javax.swing.JLabel lblTipoSolo;
    private javax.swing.JPanel precipitacao;
    private javax.swing.JPanel profundidade;
    private javax.swing.JProgressBar progbar;
    private javax.swing.JPanel relatorio;
    private javax.swing.JScrollPane scrollNegativos;
    private javax.swing.JScrollPane scrollPositivos;
    private javax.swing.JPanel sobre;
    private javax.swing.JRadioButton soloArenoso;
    private javax.swing.JRadioButton soloDrenagem;
    private javax.swing.JRadioButton soloFertil;
    private javax.swing.JRadioButton soloPedregoso;
    private javax.swing.JPanel tamanho;
    private javax.swing.JPanel tela;
    private javax.swing.JPanel temperatura;
    private javax.swing.JPanel tipoSolo;
    private javax.swing.JTextField txtAltitude;
    private javax.swing.JTextField txtComprimento;
    private javax.swing.JTextField txtLargura;
    private javax.swing.JTextField txtPrecipitacao;
    private javax.swing.JTextField txtProfundidade;
    private javax.swing.JTextArea txtRelatorioFinal;
    private javax.swing.JTextArea txtRelatorioNegativo;
    private javax.swing.JTextArea txtRelatorioPositivo;
    private javax.swing.JTextField txtTemperatura;
    // End of variables declaration//GEN-END:variables
}
