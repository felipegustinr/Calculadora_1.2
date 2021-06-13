
import java.awt.Color;
import java.awt.Toolkit;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.swing.ImageIcon;




/**
 *
 * @author David Felipe Gustin Rivas
 */
public class Calculadora extends javax.swing.JFrame {

   
    
    ScriptEngineManager manager = new ScriptEngineManager();
    ScriptEngine engine = manager.getEngineByName("JavaScript");
    public Calculadora() {
        initComponents();
        setLocationRelativeTo(null);
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/Images/calculator.png")));
    }

   
     
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        txtOperation = new javax.swing.JLabel();
        txtResult = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btn_Luz = new javax.swing.JButton();
        btn_9 = new javax.swing.JButton();
        btn_Back = new javax.swing.JButton();
        btn_Resultado = new javax.swing.JButton();
        btn_Division = new javax.swing.JButton();
        btn_Multiplicacion = new javax.swing.JButton();
        btn_Resta = new javax.swing.JButton();
        btn_Suma = new javax.swing.JButton();
        btn_C = new javax.swing.JButton();
        btn_7 = new javax.swing.JButton();
        btn_8 = new javax.swing.JButton();
        btn_4 = new javax.swing.JButton();
        btn_5 = new javax.swing.JButton();
        btn_6 = new javax.swing.JButton();
        btn_2 = new javax.swing.JButton();
        btn_3 = new javax.swing.JButton();
        btn_1 = new javax.swing.JButton();
        btn_0 = new javax.swing.JButton();
        btn_00 = new javax.swing.JButton();
        btn_Punto = new javax.swing.JButton();

        jButton1.setText("jButton1");

        jButton2.setText("jButton2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMinimumSize(new java.awt.Dimension(340, 560));
        setPreferredSize(new java.awt.Dimension(340, 560));
        setResizable(false);
        setType(java.awt.Window.Type.POPUP);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(224, 244, 248));
        jPanel1.setForeground(new java.awt.Color(236, 250, 253));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtOperation.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        txtOperation.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jPanel1.add(txtOperation, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 320, 46));

        txtResult.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 48)); // NOI18N
        txtResult.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jPanel1.add(txtResult, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 52, 320, 40));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 330, 100));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_Luz.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        btn_Luz.setForeground(new java.awt.Color(51, 51, 51));
        btn_Luz.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/btn_Luz.png"))); // NOI18N
        btn_Luz.setBorderPainted(false);
        btn_Luz.setDefaultCapable(false);
        btn_Luz.setFocusPainted(false);
        btn_Luz.setFocusable(false);
        btn_Luz.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_Luz.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/btn_Luz.png"))); // NOI18N
        btn_Luz.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/btn_Luz_Roll.png"))); // NOI18N
        btn_Luz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_LuzActionPerformed(evt);
            }
        });
        jPanel2.add(btn_Luz, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 40, 50, 50));

        btn_9.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        btn_9.setForeground(new java.awt.Color(51, 51, 51));
        btn_9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/btn_9.png"))); // NOI18N
        btn_9.setToolTipText("");
        btn_9.setBorderPainted(false);
        btn_9.setDefaultCapable(false);
        btn_9.setFocusPainted(false);
        btn_9.setFocusable(false);
        btn_9.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_9.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/btn_9.png"))); // NOI18N
        btn_9.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/btn_9_Roll.png"))); // NOI18N
        btn_9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_9ActionPerformed(evt);
            }
        });
        jPanel2.add(btn_9, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 120, 50, 50));

        btn_Back.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        btn_Back.setForeground(new java.awt.Color(51, 51, 51));
        btn_Back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/btn_Back.png"))); // NOI18N
        btn_Back.setBorderPainted(false);
        btn_Back.setDefaultCapable(false);
        btn_Back.setFocusPainted(false);
        btn_Back.setFocusable(false);
        btn_Back.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_Back.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/btn_Back.png"))); // NOI18N
        btn_Back.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/btn_Back_Roll.png"))); // NOI18N
        btn_Back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_BackActionPerformed(evt);
            }
        });
        jPanel2.add(btn_Back, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 40, 50, 50));

        btn_Resultado.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        btn_Resultado.setForeground(new java.awt.Color(51, 51, 51));
        btn_Resultado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/btn_Resultado.png"))); // NOI18N
        btn_Resultado.setBorderPainted(false);
        btn_Resultado.setDefaultCapable(false);
        btn_Resultado.setFocusPainted(false);
        btn_Resultado.setFocusable(false);
        btn_Resultado.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_Resultado.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/btn_Resultado.png"))); // NOI18N
        btn_Resultado.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/btn_Resultado_Roll.png"))); // NOI18N
        btn_Resultado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ResultadoActionPerformed(evt);
            }
        });
        jPanel2.add(btn_Resultado, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 360, 50, 50));

        btn_Division.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        btn_Division.setForeground(new java.awt.Color(51, 51, 51));
        btn_Division.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/btn_Division.png"))); // NOI18N
        btn_Division.setBorderPainted(false);
        btn_Division.setDefaultCapable(false);
        btn_Division.setFocusPainted(false);
        btn_Division.setFocusable(false);
        btn_Division.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_Division.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/btn_Division.png"))); // NOI18N
        btn_Division.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/btn_Division_Roll.png"))); // NOI18N
        btn_Division.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_DivisionActionPerformed(evt);
            }
        });
        jPanel2.add(btn_Division, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 40, 50, 50));

        btn_Multiplicacion.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        btn_Multiplicacion.setForeground(new java.awt.Color(51, 51, 51));
        btn_Multiplicacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/btn_Multiplicacion.png"))); // NOI18N
        btn_Multiplicacion.setBorderPainted(false);
        btn_Multiplicacion.setDefaultCapable(false);
        btn_Multiplicacion.setFocusPainted(false);
        btn_Multiplicacion.setFocusable(false);
        btn_Multiplicacion.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_Multiplicacion.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/btn_Multiplicacion.png"))); // NOI18N
        btn_Multiplicacion.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/btn_Multiplicacion_Roll.png"))); // NOI18N
        btn_Multiplicacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_MultiplicacionActionPerformed(evt);
            }
        });
        jPanel2.add(btn_Multiplicacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 120, 50, 50));

        btn_Resta.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        btn_Resta.setForeground(new java.awt.Color(51, 51, 51));
        btn_Resta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/btn_Resta.png"))); // NOI18N
        btn_Resta.setBorderPainted(false);
        btn_Resta.setDefaultCapable(false);
        btn_Resta.setFocusPainted(false);
        btn_Resta.setFocusable(false);
        btn_Resta.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_Resta.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/btn_Resta.png"))); // NOI18N
        btn_Resta.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/btn_Resta_Roll.png"))); // NOI18N
        btn_Resta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_RestaActionPerformed(evt);
            }
        });
        jPanel2.add(btn_Resta, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 200, 50, 50));

        btn_Suma.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        btn_Suma.setForeground(new java.awt.Color(51, 51, 51));
        btn_Suma.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/btn_Suma.png"))); // NOI18N
        btn_Suma.setBorderPainted(false);
        btn_Suma.setDefaultCapable(false);
        btn_Suma.setFocusPainted(false);
        btn_Suma.setFocusable(false);
        btn_Suma.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_Suma.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/btn_Suma.png"))); // NOI18N
        btn_Suma.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/btn_Suma_Roll.png"))); // NOI18N
        btn_Suma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_SumaActionPerformed(evt);
            }
        });
        jPanel2.add(btn_Suma, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 280, 50, 50));

        btn_C.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        btn_C.setForeground(new java.awt.Color(51, 51, 51));
        btn_C.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/btn_C.png"))); // NOI18N
        btn_C.setDisabledIcon(null);
        btn_C.setFocusPainted(false);
        btn_C.setFocusable(false);
        btn_C.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_C.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/btn_C.png"))); // NOI18N
        btn_C.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/btn_C_Roll.png"))); // NOI18N
        btn_C.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_CActionPerformed(evt);
            }
        });
        jPanel2.add(btn_C, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 50, 50));

        btn_7.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        btn_7.setForeground(new java.awt.Color(51, 51, 51));
        btn_7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/btn_7.png"))); // NOI18N
        btn_7.setDisabledIcon(null);
        btn_7.setDisabledSelectedIcon(null);
        btn_7.setFocusPainted(false);
        btn_7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_7.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/btn_7.png"))); // NOI18N
        btn_7.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/btn_7_Roll.png"))); // NOI18N
        btn_7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_7ActionPerformed(evt);
            }
        });
        jPanel2.add(btn_7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 50, 50));

        btn_8.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        btn_8.setForeground(new java.awt.Color(51, 51, 51));
        btn_8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/btn_8.png"))); // NOI18N
        btn_8.setBorderPainted(false);
        btn_8.setDefaultCapable(false);
        btn_8.setFocusPainted(false);
        btn_8.setFocusable(false);
        btn_8.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_8.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/btn_8.png"))); // NOI18N
        btn_8.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/btn_8_Roll.png"))); // NOI18N
        btn_8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_8ActionPerformed(evt);
            }
        });
        jPanel2.add(btn_8, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 120, 50, 50));

        btn_4.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        btn_4.setForeground(new java.awt.Color(51, 51, 51));
        btn_4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/btn_4.png"))); // NOI18N
        btn_4.setBorderPainted(false);
        btn_4.setDefaultCapable(false);
        btn_4.setFocusPainted(false);
        btn_4.setFocusable(false);
        btn_4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_4.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/btn_4.png"))); // NOI18N
        btn_4.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/btn_4_Roll.png"))); // NOI18N
        btn_4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_4ActionPerformed(evt);
            }
        });
        jPanel2.add(btn_4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 50, 50));

        btn_5.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        btn_5.setForeground(new java.awt.Color(51, 51, 51));
        btn_5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/btn_5.png"))); // NOI18N
        btn_5.setBorderPainted(false);
        btn_5.setDefaultCapable(false);
        btn_5.setFocusPainted(false);
        btn_5.setFocusable(false);
        btn_5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_5.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/btn_5.png"))); // NOI18N
        btn_5.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/btn_5_Roll.png"))); // NOI18N
        btn_5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_5ActionPerformed(evt);
            }
        });
        jPanel2.add(btn_5, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 200, 50, 50));

        btn_6.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        btn_6.setForeground(new java.awt.Color(51, 51, 51));
        btn_6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/btn_6.png"))); // NOI18N
        btn_6.setBorderPainted(false);
        btn_6.setDefaultCapable(false);
        btn_6.setFocusPainted(false);
        btn_6.setFocusable(false);
        btn_6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_6.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/btn_6.png"))); // NOI18N
        btn_6.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/btn_6_Roll.png"))); // NOI18N
        btn_6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_6ActionPerformed(evt);
            }
        });
        jPanel2.add(btn_6, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 200, 50, 50));

        btn_2.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        btn_2.setForeground(new java.awt.Color(51, 51, 51));
        btn_2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/btn_2.png"))); // NOI18N
        btn_2.setBorderPainted(false);
        btn_2.setDefaultCapable(false);
        btn_2.setFocusPainted(false);
        btn_2.setFocusable(false);
        btn_2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_2.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/btn_2.png"))); // NOI18N
        btn_2.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/btn_2_Roll.png"))); // NOI18N
        btn_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_2ActionPerformed(evt);
            }
        });
        jPanel2.add(btn_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 280, 50, 50));

        btn_3.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        btn_3.setForeground(new java.awt.Color(51, 51, 51));
        btn_3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/btn_3.png"))); // NOI18N
        btn_3.setBorderPainted(false);
        btn_3.setDefaultCapable(false);
        btn_3.setFocusPainted(false);
        btn_3.setFocusable(false);
        btn_3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_3.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/btn_3.png"))); // NOI18N
        btn_3.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/btn_3_Roll.png"))); // NOI18N
        btn_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_3ActionPerformed(evt);
            }
        });
        jPanel2.add(btn_3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 280, 50, 50));

        btn_1.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        btn_1.setForeground(new java.awt.Color(51, 51, 51));
        btn_1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/btn_1.png"))); // NOI18N
        btn_1.setBorderPainted(false);
        btn_1.setDefaultCapable(false);
        btn_1.setFocusPainted(false);
        btn_1.setFocusable(false);
        btn_1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_1.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/btn_1.png"))); // NOI18N
        btn_1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/btn_1_Roll.png"))); // NOI18N
        btn_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_1ActionPerformed(evt);
            }
        });
        jPanel2.add(btn_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, 50, 50));

        btn_0.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        btn_0.setForeground(new java.awt.Color(51, 51, 51));
        btn_0.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/btn_0.png"))); // NOI18N
        btn_0.setBorderPainted(false);
        btn_0.setDefaultCapable(false);
        btn_0.setFocusPainted(false);
        btn_0.setFocusable(false);
        btn_0.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_0.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/btn_0.png"))); // NOI18N
        btn_0.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/btn_0_Roll.png"))); // NOI18N
        btn_0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_0ActionPerformed(evt);
            }
        });
        jPanel2.add(btn_0, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 360, 50, 50));

        btn_00.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        btn_00.setForeground(new java.awt.Color(51, 51, 51));
        btn_00.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/btn_00.png"))); // NOI18N
        btn_00.setBorderPainted(false);
        btn_00.setDefaultCapable(false);
        btn_00.setFocusPainted(false);
        btn_00.setFocusable(false);
        btn_00.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_00.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/btn_00.png"))); // NOI18N
        btn_00.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/btn_00_Roll.png"))); // NOI18N
        btn_00.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_00ActionPerformed(evt);
            }
        });
        jPanel2.add(btn_00, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 360, 50, 50));

        btn_Punto.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        btn_Punto.setForeground(new java.awt.Color(51, 51, 51));
        btn_Punto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/btn_punto.png"))); // NOI18N
        btn_Punto.setBorderPainted(false);
        btn_Punto.setDefaultCapable(false);
        btn_Punto.setFocusPainted(false);
        btn_Punto.setFocusable(false);
        btn_Punto.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_Punto.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/btn_punto.png"))); // NOI18N
        btn_Punto.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/btn_punto_Roll.png"))); // NOI18N
        btn_Punto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_PuntoActionPerformed(evt);
            }
        });
        jPanel2.add(btn_Punto, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 360, 50, 50));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 330, 480));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    boolean darkMode = false;
    
    private void btn_LuzActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_LuzActionPerformed
        // TODO add your handling code here:
        //si
        if (!darkMode){
        jPanel1.setBackground(Color.decode("#212b41"));
        jPanel2.setBackground(Color.decode("#2e3951"));
        txtOperation.setForeground(Color.decode("#0db387"));
        txtResult.setForeground(Color.decode("#0db387"));
        
        btn_1.setIcon(new ImageIcon(getClass().getResource("/Images/btn_1_dark.png")));
        btn_1.setPressedIcon(new ImageIcon(getClass().getResource("/Images/btn_1_dark.png")));
        btn_1.setRolloverIcon(new ImageIcon(getClass().getResource("/Images/btn_1_Roll dark.png")));
        
        btn_2.setIcon(new ImageIcon(getClass().getResource("/Images/btn_2_dark.png")));
        btn_2.setPressedIcon(new ImageIcon(getClass().getResource("/Images/btn_2_dark.png")));
        btn_2.setRolloverIcon(new ImageIcon(getClass().getResource("/Images/btn_2_Roll dark.png")));
        
        btn_3.setIcon(new ImageIcon(getClass().getResource("/Images/btn_3_dark.png")));
        btn_3.setPressedIcon(new ImageIcon(getClass().getResource("/Images/btn_3_dark.png")));
        btn_3.setRolloverIcon(new ImageIcon(getClass().getResource("/Images/btn_3_Roll dark.png")));
        
        btn_4.setIcon(new ImageIcon(getClass().getResource("/Images/btn_4_dark.png")));
        btn_4.setPressedIcon(new ImageIcon(getClass().getResource("/Images/btn_4_dark.png")));
        btn_4.setRolloverIcon(new ImageIcon(getClass().getResource("/Images/btn_4_Roll dark.png")));
        
        btn_5.setIcon(new ImageIcon(getClass().getResource("/Images/btn_5_dark.png")));
        btn_5.setPressedIcon(new ImageIcon(getClass().getResource("/Images/btn_5_dark.png")));
        btn_5.setRolloverIcon(new ImageIcon(getClass().getResource("/Images/btn_5_Roll dark.png")));
        
        btn_6.setIcon(new ImageIcon(getClass().getResource("/Images/btn_6_dark.png")));
        btn_6.setPressedIcon(new ImageIcon(getClass().getResource("/Images/btn_6_dark.png")));
        btn_6.setRolloverIcon(new ImageIcon(getClass().getResource("/Images/btn_6_Roll dark.png")));
        
        btn_7.setIcon(new ImageIcon(getClass().getResource("/Images/btn_7_dark.png")));
        btn_7.setPressedIcon(new ImageIcon(getClass().getResource("/Images/btn_7_dark.png")));
        btn_7.setRolloverIcon(new ImageIcon(getClass().getResource("/Images/btn_7_Roll dark.png")));
        
        btn_8.setIcon(new ImageIcon(getClass().getResource("/Images/btn_8_dark.png")));
        btn_8.setPressedIcon(new ImageIcon(getClass().getResource("/Images/btn_8_dark.png")));
        btn_8.setRolloverIcon(new ImageIcon(getClass().getResource("/Images/btn_8_Roll dark.png")));
        
        btn_9.setIcon(new ImageIcon(getClass().getResource("/Images/btn_9_dark.png")));
        btn_9.setPressedIcon(new ImageIcon(getClass().getResource("/Images/btn_9_dark.png")));
        btn_9.setRolloverIcon(new ImageIcon(getClass().getResource("/Images/btn_9_Roll dark.png")));
        
        btn_0.setIcon(new ImageIcon(getClass().getResource("/Images/btn_0_dark.png")));
        btn_0.setPressedIcon(new ImageIcon(getClass().getResource("/Images/btn_0_dark.png")));
        btn_0.setRolloverIcon(new ImageIcon(getClass().getResource("/Images/btn_0_Roll dark.png")));
        
        btn_00.setIcon(new ImageIcon(getClass().getResource("/Images/btn_00_dark.png")));
        btn_00.setPressedIcon(new ImageIcon(getClass().getResource("/Images/btn_00_dark.png")));
        btn_00.setRolloverIcon(new ImageIcon(getClass().getResource("/Images/btn_00_Roll dark.png")));
        
        btn_Punto.setIcon(new ImageIcon(getClass().getResource("/Images/btn_Punto_dark.png")));
        btn_Punto.setPressedIcon(new ImageIcon(getClass().getResource("/Images/btn_Punto_dark.png")));
        btn_Punto.setRolloverIcon(new ImageIcon(getClass().getResource("/Images/btn_Punto_Roll dark.png")));
        
       btn_Luz.setIcon(new ImageIcon(getClass().getResource("/Images/btn_Luz_dark.png")));
       btn_Luz.setPressedIcon(new ImageIcon(getClass().getResource("/Images/btn_Luz_dark.png")));
       btn_Luz.setRolloverIcon(new ImageIcon(getClass().getResource("/Images/btn_Luz_Roll dark.png")));
       
       btn_Back.setIcon(new ImageIcon(getClass().getResource("/Images/btn_Back_dark.png")));
       btn_Back.setPressedIcon(new ImageIcon(getClass().getResource("/Images/btn_Back_dark.png")));
       btn_Back.setRolloverIcon(new ImageIcon(getClass().getResource("/Images/btn_Back_Roll dark.png")));
       
       btn_C.setIcon(new ImageIcon(getClass().getResource("/Images/btn_C_dark.png")));
       btn_C.setPressedIcon(new ImageIcon(getClass().getResource("/Images/btn_C_dark.png")));
       btn_C.setRolloverIcon(new ImageIcon(getClass().getResource("/Images/btn_C_Roll dark.png")));
       
       btn_Multiplicacion.setIcon(new ImageIcon(getClass().getResource("/Images/btn_Multiplicacion_dark.png")));
       btn_Multiplicacion.setPressedIcon(new ImageIcon(getClass().getResource("/Images/btn_Multiplicacion_dark.png")));
       btn_Multiplicacion.setRolloverIcon(new ImageIcon(getClass().getResource("/Images/btn_Multiplicacion_Roll dark.png")));
       
       btn_Resta.setIcon(new ImageIcon(getClass().getResource("/Images/btn_Resta_dark.png")));
       btn_Resta.setPressedIcon(new ImageIcon(getClass().getResource("/Images/btn_Resta_dark.png")));
       btn_Resta.setRolloverIcon(new ImageIcon(getClass().getResource("/Images/btn_Resta_Roll dark.png")));
       
       btn_Resultado.setIcon(new ImageIcon(getClass().getResource("/Images/btn_Resultado_dark.png")));
       btn_Resultado.setPressedIcon(new ImageIcon(getClass().getResource("/Images/btn_Resultado_dark.png")));
       btn_Resultado.setRolloverIcon(new ImageIcon(getClass().getResource("/Images/btn_Resultado_Roll dark.png")));
       
       btn_Division.setIcon(new ImageIcon(getClass().getResource("/Images/btn_Division_dark.png")));
       btn_Division.setPressedIcon(new ImageIcon(getClass().getResource("/Images/btn_Division_dark.png")));
       btn_Division.setRolloverIcon(new ImageIcon(getClass().getResource("/Images/btn_Division_Roll dark.png")));
      
       btn_Suma.setIcon(new ImageIcon(getClass().getResource("/Images/btn_Suma_dark.png")));
       btn_Suma.setPressedIcon(new ImageIcon(getClass().getResource("/Images/btn_Suma_dark.png")));
       btn_Suma.setRolloverIcon(new ImageIcon(getClass().getResource("/Images/btn_Suma_Roll dark.png")));
       darkMode = true;
       //sino
        }else{
            
        jPanel1.setBackground(new java.awt.Color(224, 244, 248));
        jPanel1.setForeground(new java.awt.Color(236, 250, 253));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtOperation.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        txtOperation.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jPanel1.add(txtOperation, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 320, 46));
         txtOperation.setForeground(Color.decode("#00000"));
        

        txtResult.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 48)); // NOI18N
        txtResult.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jPanel1.add(txtResult, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 52, 320, 40));
        txtResult.setForeground(Color.decode("#000000"));
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 360, 100));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        
        
        btn_Luz.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/btn_Luz.png"))); // NOI18N
        btn_Luz.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/btn_Luz.png"))); // NOI18N
        btn_Luz.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/btn_Luz_Roll.png"))); // NOI18N
       
        btn_9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/btn_9.png"))); // NOI18N
        btn_9.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/btn_9.png"))); // NOI18N
        btn_9.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/btn_9_Roll.png"))); // NOI18N
        
        btn_Back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/btn_Back.png"))); // NOI18N
        btn_Back.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/btn_Back.png"))); // NOI18N
        btn_Back.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/btn_Back_Roll.png"))); // NOI18N
       
        btn_Resultado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/btn_Resultado.png"))); // NOI18N
        btn_Resultado.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/btn_Resultado.png"))); // NOI18N
        btn_Resultado.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/btn_Resultado_Roll.png"))); // NOI18N
       
        btn_Division.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/btn_Division.png"))); // NOI18N
        btn_Division.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/btn_Division.png"))); // NOI18N
        btn_Division.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/btn_Division_Roll.png"))); // NOI18N
       
        btn_Multiplicacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/btn_Multiplicacion.png"))); // NOI18N
        btn_Multiplicacion.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/btn_Multiplicacion.png"))); // NOI18N
        btn_Multiplicacion.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/btn_Multiplicacion_Roll.png"))); // NOI18N
       
        btn_Resta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/btn_Resta.png"))); // NOI18N
        btn_Resta.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/btn_Resta.png"))); // NOI18N
        btn_Resta.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/btn_Resta_Roll.png"))); // NOI18N
       
        btn_Suma.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/btn_Suma.png"))); // NOI18N
        btn_Suma.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/btn_Suma.png"))); // NOI18N
        btn_Suma.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/btn_Suma_Roll.png"))); // NOI18N
        
        btn_C.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/btn_C.png"))); // NOI18N
        btn_C.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/btn_C.png"))); // NOI18N
        btn_C.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/btn_C_Roll.png"))); // NOI18N
      
        btn_7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/btn_7.png"))); // NOI18N
        btn_7.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/btn_7.png"))); // NOI18N
        btn_7.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/btn_7_Roll.png"))); // NOI18N
      
        btn_8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/btn_8.png"))); // NOI18N
        btn_8.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/btn_8.png"))); // NOI18N
        btn_8.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/btn_8_Roll.png"))); // NOI18N
       
        btn_4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/btn_4.png"))); // NOI18N
        btn_4.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/btn_4.png"))); // NOI18N
        btn_4.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/btn_4_Roll.png"))); // NOI18N
       
        btn_5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/btn_5.png"))); // NOI18N
        btn_5.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/btn_5.png"))); // NOI18N
        btn_5.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/btn_5_Roll.png"))); // NOI18N
     
        btn_6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/btn_6.png"))); // NOI18N
        btn_6.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/btn_6.png"))); // NOI18N
        btn_6.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/btn_6_Roll.png"))); // NOI18N
       
        btn_2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/btn_2.png"))); // NOI18N
        btn_2.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/btn_2.png"))); // NOI18N
        btn_2.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/btn_2_Roll.png"))); // NOI18N
        
        btn_3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/btn_3.png"))); // NOI18N
        btn_3.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/btn_3.png"))); // NOI18N
        btn_3.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/btn_3_Roll.png"))); // NOI18N
       
        btn_1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/btn_1.png"))); // NOI18N
        btn_1.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/btn_1.png"))); // NOI18N
        btn_1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/btn_1_Roll.png"))); // NOI18N
       
        btn_0.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/btn_0.png"))); // NOI18N
        btn_0.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/btn_0.png"))); // NOI18N
        btn_0.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/btn_0_Roll.png"))); // NOI18N
      
        btn_00.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/btn_00.png"))); // NOI18N
        btn_00.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/btn_00.png"))); // NOI18N
        btn_00.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/btn_00_Roll.png"))); // NOI18N
        
        btn_Punto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/btn_punto.png"))); // NOI18N
        btn_Punto.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/btn_punto.png"))); // NOI18N
        btn_Punto.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/btn_punto_Roll.png"))); // NOI18N
       
       darkMode = false;
            
        }
        
    }//GEN-LAST:event_btn_LuzActionPerformed

    private void btn_9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_9ActionPerformed
        // TODO add your handling code here:
        agregarNumero("9");
        btn_Resultado.doClick();
    }//GEN-LAST:event_btn_9ActionPerformed

    private void btn_BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_BackActionPerformed
        // TODO add your handling code here:
        String texto = txtOperation.getText().substring(0,txtOperation.getText().length()-1);
        txtOperation.setText(texto);
        btn_Resultado.doClick();
    }//GEN-LAST:event_btn_BackActionPerformed

    private void btn_ResultadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ResultadoActionPerformed
        // TODO add your handling code here:
        try{
            
            String resultado =  (String) engine.eval(txtOperation.getText()).toString();
            
            txtResult.setText(resultado);
            
        }catch (Exception e){
            //txtOperation.setText("Syntax Error");
           
             
            
        }
       
        
    }//GEN-LAST:event_btn_ResultadoActionPerformed

    private void btn_DivisionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_DivisionActionPerformed
        // TODO add your handling code here:
        agregarNumero("/");
       
    }//GEN-LAST:event_btn_DivisionActionPerformed

    private void btn_MultiplicacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_MultiplicacionActionPerformed
        // TODO add your handling code here:
        agregarNumero("*");
        
    }//GEN-LAST:event_btn_MultiplicacionActionPerformed

    private void btn_RestaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_RestaActionPerformed
        // TODO add your handling code here:
        agregarNumero("-");
        
    }//GEN-LAST:event_btn_RestaActionPerformed

    private void btn_SumaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_SumaActionPerformed
        // TODO add your handling code here:
        agregarNumero("+");
        
    }//GEN-LAST:event_btn_SumaActionPerformed

    private void btn_CActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_CActionPerformed
        // TODO add your handling code here:
        txtOperation.setText("");
        txtResult.setText("");
    }//GEN-LAST:event_btn_CActionPerformed

    private void btn_7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_7ActionPerformed
        // TODO add your handling code here:
        agregarNumero("7");
        btn_Resultado.doClick();
    }//GEN-LAST:event_btn_7ActionPerformed

    private void btn_8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_8ActionPerformed
        // TODO add your handling code here:
        agregarNumero("8");
        btn_Resultado.doClick();
    }//GEN-LAST:event_btn_8ActionPerformed

    private void btn_4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_4ActionPerformed
        // TODO add your handling code here:
        agregarNumero("4");
        btn_Resultado.doClick();
    }//GEN-LAST:event_btn_4ActionPerformed

    private void btn_5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_5ActionPerformed
        // TODO add your handling code here:
        agregarNumero("5");
        btn_Resultado.doClick();
    }//GEN-LAST:event_btn_5ActionPerformed

    private void btn_6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_6ActionPerformed
        // TODO add your handling code here:
        agregarNumero("6");
        btn_Resultado.doClick();
    }//GEN-LAST:event_btn_6ActionPerformed

    private void btn_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_2ActionPerformed
        // TODO add your handling code here:
        agregarNumero("2");
        btn_Resultado.doClick();
    }//GEN-LAST:event_btn_2ActionPerformed

    private void btn_3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_3ActionPerformed
        // TODO add your handling code here:
        agregarNumero("3");
        btn_Resultado.doClick();
    }//GEN-LAST:event_btn_3ActionPerformed

    private void btn_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_1ActionPerformed
        // TODO add your handling code here:
        agregarNumero("1");
        btn_Resultado.doClick();
    }//GEN-LAST:event_btn_1ActionPerformed

    private void btn_0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_0ActionPerformed
        // TODO add your handling code here:
        agregarNumero("0");
        btn_Resultado.doClick();
    }//GEN-LAST:event_btn_0ActionPerformed

    private void btn_00ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_00ActionPerformed
        // TODO add your handling code here:
        agregarNumero("00");
        btn_Resultado.doClick();
    }//GEN-LAST:event_btn_00ActionPerformed

    private void btn_PuntoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_PuntoActionPerformed
        // TODO add your handling code here:
        agregarNumero(".");
        btn_Resultado.doClick();
    }//GEN-LAST:event_btn_PuntoActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calculadora().setVisible(true);
            }
        });
    }
    
    public void agregarNumero(String digito){
        txtOperation.setText(txtOperation.getText()+digito);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_0;
    private javax.swing.JButton btn_00;
    private javax.swing.JButton btn_1;
    private javax.swing.JButton btn_2;
    private javax.swing.JButton btn_3;
    private javax.swing.JButton btn_4;
    private javax.swing.JButton btn_5;
    private javax.swing.JButton btn_6;
    private javax.swing.JButton btn_7;
    private javax.swing.JButton btn_8;
    private javax.swing.JButton btn_9;
    private javax.swing.JButton btn_Back;
    private javax.swing.JButton btn_C;
    private javax.swing.JButton btn_Division;
    private javax.swing.JButton btn_Luz;
    private javax.swing.JButton btn_Multiplicacion;
    private javax.swing.JButton btn_Punto;
    private javax.swing.JButton btn_Resta;
    private javax.swing.JButton btn_Resultado;
    private javax.swing.JButton btn_Suma;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel txtOperation;
    private javax.swing.JLabel txtResult;
    // End of variables declaration//GEN-END:variables
}
