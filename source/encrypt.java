import java.math.BigInteger;
import javax.swing.ButtonGroup;
public class encrypt extends javax.swing.JFrame {

    
    private void groupButton()
    {
        ButtonGroup bg1=new ButtonGroup();
        bg1.add(atbash);
        bg1.add(untested);
        bg1.add(untested2);
    }
    public encrypt() {
        initComponents();
        groupButton();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jDialog1 = new javax.swing.JDialog();
        encrypt = new javax.swing.JButton();
        decrypt = new javax.swing.JButton();
        key = new javax.swing.JButton();
        textbox = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        atbash = new javax.swing.JRadioButton();
        untested2 = new javax.swing.JRadioButton();
        untested = new javax.swing.JRadioButton();
        jLabel4 = new javax.swing.JLabel();
        textboxe = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        textboxd = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        label = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        labelat = new javax.swing.JLabel();

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));
        setForeground(new java.awt.Color(0, 0, 0));

        encrypt.setText("ENCRYPT");
        encrypt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                encryptActionPerformed(evt);
            }
        });

        decrypt.setText("DECRYPT");
        decrypt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                decryptActionPerformed(evt);
            }
        });

        key.setText("GENERATE KEY");
        key.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                keyActionPerformed(evt);
            }
        });

        jLabel1.setText("ENTER MESSAGE");

        jLabel2.setText("ENCRYPTED TEXT");

        atbash.setText("ATBASH ALGORTHM");
        atbash.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atbashActionPerformed(evt);
            }
        });

        untested2.setText("UNTESTED ALGORITHM 2");

        untested.setText("UNTESTED ALGORITHM");
        untested.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                untestedActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(untested, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(atbash)
                .addGap(40, 40, 40)
                .addComponent(untested2)
                .addContainerGap(40, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(atbash)
                    .addComponent(untested2)
                    .addComponent(untested)))
        );

        textboxe.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jLabel5.setText("DECRYPTED TEXT");

        textboxd.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jButton1.setText("CLEAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("GO TO MAIN PAGE");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel5))
                        .addGap(196, 196, 196)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(textboxe, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(93, 93, 93)
                                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(127, 127, 127))
                            .addComponent(textbox, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textboxd, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(98, 98, 98))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(176, 176, 176)
                        .addComponent(encrypt)
                        .addGap(226, 226, 226)
                        .addComponent(decrypt))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(312, 312, 312)
                        .addComponent(labelat, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(270, 270, 270)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(key, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(89, 89, 89)
                .addComponent(label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textbox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(textboxe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(textboxd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addComponent(label, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(labelat)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(key)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1)
                        .addGap(18, 18, 18)
                        .addComponent(jButton2)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(encrypt)
                            .addComponent(decrypt))
                        .addGap(200, 200, 200))))
        );

        pack();
    }// </editor-fold>                        

    private void keyActionPerformed(java.awt.event.ActionEvent evt) {                                    
       if(untested2.isSelected())
       {generate dialog=new generate(new javax.swing.JFrame(),true);
       encrypt e=new encrypt();
       e.setVisible(false);
        dialog.setVisible(true);}
       else if(untested.isSelected())
       {
           untestedd di = new untestedd(new javax.swing.JFrame(), true);
           di.setVisible(true);
       }
       else if(atbash.isSelected())
       {
           label.setText("ATBASH ALGORITHM DOESN'T USE ANY KEY");
       }
    }                                   

    private void encryptActionPerformed(java.awt.event.ActionEvent evt) {                                        
    String s,m,z;z= "";
int k,i,len;long j=0;
    char f[];
    f=new char[30];
    s=textbox.getText();
    len=s.length();
    m=s.toLowerCase();
    char[] ch;char[] translate;
    ch = s.toCharArray();
    translate = m.toCharArray();
    if("".equals(s))
    {
        label.setText("Please enter text to be encrypted");
    }
    else
    {
    if(untested2.isSelected())
    {
     for(i=0;i<len;i++)
     {
       k=(int)ch[i];
       j=k+(Cryptosystem.e+Cryptosystem.d);
       
       j=j%255;
       
       f[i]=(char) j;
       
       z=z+f[i];
     }textboxe.setText(z);}
     else if(untested.isSelected())
     {
        for(i=0;i<len;i++)
        {
            k=(int)ch[i];
            k=k+Cryptosystem.e;
            f[i]=(char)k;
            z=z+f[i];
        }textboxe.setText(z);
     }
     else if(atbash.isSelected())
     { 
         
         for(i=0;i<len;i++)
         {
           k=(int)ch[i];
           if(k<97||k>122)
           {
               label.setText("PLEASE ENTER ENGLISH LANGUAGE ALPHABETS");
               break;
           }
           else
           {
               k=122-k+97;
           }
           f[i]=(char)k;
           z=z+f[i];
         }textboxe.setText(z);
     }
     
    }
    }                                       
    
    private void atbashActionPerformed(java.awt.event.ActionEvent evt) {                                       
        
    }                                      

    private void decryptActionPerformed(java.awt.event.ActionEvent evt) {                                        
     String s,z="";int k,i,len;long j = 0;
    char f[];
    f=new char[30];
    s=textboxe.getText();
    len=s.length();
    char[] ch;
    ch = s.toCharArray();
    if("".equals(s))
    {
       label.setText("Please enter text to be decrypted");  
    }
    else
    {
    if(untested2.isSelected())
    {
      for(i=0;i<len;i++)
     {
       k=(int)ch[i];
       
       j=k-(Cryptosystem.e+Cryptosystem.d);
       j=j%255;
       
       f[i]=(char) j;
       z=z+f[i];
     }
        textboxd.setText(z);
     }
 
    else if(untested.isSelected())
     {
        for(i=0;i<len;i++)
        {
            k=(int)ch[i];
            k=k-Cryptosystem.e;
            f[i]=(char)k;
            z=z+f[i];
        }
     textboxd.setText(z);}
    
    else if(atbash.isSelected())
     {
        for(i=0;i<len;i++)
         {
           k=(int)ch[i];
           k=122-k+97;
           f[i]=(char)k;
           z=z+f[i];
         }textboxd.setText(z);
      }}
    }                                       

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
textbox.setText("");
textboxe.setText("");
textboxd.setText("");
label.setText("");
    }                                        

    private void untestedActionPerformed(java.awt.event.ActionEvent evt) {                                         
       
    }                                        

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {                                         
 new start().setVisible(true);
 dispose();
    }                                        

    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new encrypt().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JRadioButton atbash;
    private javax.swing.JButton decrypt;
    private javax.swing.JButton encrypt;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton key;
    private javax.swing.JLabel label;
    private javax.swing.JLabel labelat;
    private javax.swing.JTextField textbox;
    private javax.swing.JTextField textboxd;
    private javax.swing.JTextField textboxe;
    private javax.swing.JRadioButton untested;
    private javax.swing.JRadioButton untested2;
    // End of variables declaration                   
}
