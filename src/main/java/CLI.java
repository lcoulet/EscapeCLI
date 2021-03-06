/*
 * Copyright 2017 Loic.Coulet.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.UIManager;
import javax.swing.text.DefaultCaret;


/**
 *
 * @author Loic.Coulet
 */
public class CLI extends javax.swing.JFrame {

    private String answerProvided;
    private static final String MAIL1_MESSAGE = "FROM: Keith Richards\n"
            + "Subject: Hack in the company authentication database\n"
            + "\n"
            + "Dear Heather,\n"
            + "we have evidences that our datacenter has been hacked, \n"
            + "somebody has stolen the employees database.\n"
            + "Therefore personal details and authentication \n"
            + "information for all employees is in the wild.\n"
            + "\n"
            + "Fortunately we have established a 2-factor authentication \n"
            + "for our personal CLI, but I'd like you and your team to investigate.\n"
            + "Questions you have to answer are the following:\n"
            + "When this happened? Who hacked our system? \n"
            + "How can we secure back our system to safe operations?\n"
            + "\n"
            + "Let's have a meeting next week for debriefing this security issue.\n"
            + "\n"
            + "Thanks,\n"
            + "Keith\n";

    /**
     * Creates new form CLI
     */
    public CLI() throws IOException {
        initComponents();

        // for autoscroll change caret policy on text area
        DefaultCaret caret = (DefaultCaret) jtaOutput.getCaret();
        caret.setUpdatePolicy(DefaultCaret.ALWAYS_UPDATE);

        ArrayList<BufferedImage> imagesIcons = new ArrayList<>();
        imagesIcons.add(ImageIO.read(ClassLoader.getSystemResource("icon.png")));
        super.setIconImages(imagesIcons);


    }

    final String asciiArt
            = "                          ,(%%%%%%%%%%%%%%%%%%%(,                                             \n"
            + "                     ,%%%%%%%%%%%%%%%%%%%%%%%%%%%%%##,             Strange Corp OS v12.8.54R1\n"
            + "                 .##%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%#.  Copyright Strange Corp. Inc. 1987 \n"
            + "              .%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%.                                 \n"
            + "            (%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%*                               \n"
            + "          (%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%#                             \n"
            + "        ,%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%*#%%%%%%%%%%%%%%%%%%%%%%%,                           \n"
            + "       #%%%%%%%%%%%%%%%%%%%%%%%%%%%%%,     /%%%%%%%%%%%%%%%%%%%%%%%#                          \n"
            + "      %%%%%%%%%%%%%%%%%%%%%%%%#%%/           #%%%%%%%%%%%%%%%%%%%%%%%                         \n"
            + "     %%%%%%%%%%%%%%%%%%%%%%%%/                .%%%%%%%%%%%%%%%%%%%%%%%                        \n"
            + "    %%%%%%%%%%%%%%%%%%%%%/                .%&& #%%%%%%%%%%%%%%%%%%%%%                         \n"
            + "   #%%%%%%%%%%%%%%%%%*                /&&&&/       /%%%%%%%%%%%%%%%%%%%%                      \n"
            + "  ,%%%%%%%%%%%%%%*                ,&&&&/             (%%%%%%%%%%%%%%%%%%,                     \n"
            + "  #%%%%%%%%%%/                *&&&                   (%%%%%%%%%%%%%%%%%                       \n"
            + "  #%%%%%%%%#               *&&                         #%%%%%%%%%%%%%%%                       \n"
            + "  %%%%%%%%%%%/                           (&                #%%%%%%%%%%%%#                     \n"
            + "  %%%%%%%%%%%%%*                     (&&&&&&&.               %%%%%%%%%%%%                     \n"
            + "  %%%%%%%%%%%%%%%(               #&&&&&&&%                 %&&%%%%%%%%%%%                     \n"
            + "  #%%%%%%%%%%%%%%%%(         #&&&&&&%%                 %&&&&&&&%%%%%%%%%#                     \n"
            + "   %%%%%%%%%%%%%%%%%%/   #&&&&&&%%.                %&&&&&&&&%%%%%%%%%%%%.                     \n"
            + "   (%%%%%%%%%%%%%%%%%%%%&&&&&%.                (&&&&&&&&%%%%%%%%%%%%%%%#                      \n"
            + "    %%%%%%%%%%%%%%%%%%%%%%.                (&&&&&&&&&%%%%%%%%%%%%%%%%%%                       \n"
            + "     %%%%%%%%%%%%%%%%%%%%%%*           (&&&&&&&&%%%%%%%%%%%%%%%%%%%%%%                        \n"
            + "      #%%%%%%%%%%%%%%%%%%%%%%/     #&&&&&&&&%%%%%%%%%%%%%%%%%%%%%%%%#                         \n"
            + "       *%%%%%%%%%%%%%%%%%%%%%%%#%&&&&&&&%%%%%%%%%%%%%%%%%%%%%%%%%%#*                          \n"
            + "         %%%%%%%%%%%%%%%%%%%%%%%%%&&%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%                            \n"
            + "           %%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%                              \n"
            + "            .%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%                                \n"
            + "               (%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%#(                                  \n"
            + "                  .%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%.                                     \n"
            + "                      .#%#%%%%%%%%%%%%%%%%%%%%%%%%##.                                         \n"
            + "                            ,(#%%%%%%%%%%%%%#(,                                               \n"
            + "                                                                                              ";

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jtfInput = new javax.swing.JTextField();
        jlQuestion = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtaOutput = new javax.swing.JTextArea();
        jlCaret = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Strange Corp - confidential employee CLI ");
        setBackground(new java.awt.Color(0, 0, 0));
        setResizable(false);
        addWindowFocusListener(new java.awt.event.WindowFocusListener() {
            public void windowGainedFocus(java.awt.event.WindowEvent evt) {
                formWindowGainedFocus(evt);
            }
            public void windowLostFocus(java.awt.event.WindowEvent evt) {
            }
        });

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setForeground(new java.awt.Color(0, 255, 0));

        jtfInput.setBackground(new java.awt.Color(0, 0, 0));
        jtfInput.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N
        jtfInput.setForeground(new java.awt.Color(0, 255, 0));
        jtfInput.setBorder(null);
        jtfInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfInputActionPerformed(evt);
            }
        });

        jlQuestion.setBackground(new java.awt.Color(0, 0, 0));
        jlQuestion.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N
        jlQuestion.setForeground(new java.awt.Color(0, 255, 0));
        jlQuestion.setText(" ");
        jlQuestion.setOpaque(true);

        jScrollPane1.setBackground(new java.awt.Color(0, 0, 0));
        jScrollPane1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jScrollPane1.setForeground(new java.awt.Color(0, 255, 0));
        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        jScrollPane1.setAutoscrolls(true);

        jtaOutput.setEditable(false);
        jtaOutput.setBackground(new java.awt.Color(0, 0, 0));
        jtaOutput.setColumns(20);
        jtaOutput.setFont(new java.awt.Font("Courier New", 0, 13)); // NOI18N
        jtaOutput.setForeground(new java.awt.Color(51, 255, 51));
        jtaOutput.setRows(5);
        jtaOutput.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jtaOutputFocusGained(evt);
            }
        });
        jScrollPane1.setViewportView(jtaOutput);

        jlCaret.setBackground(new java.awt.Color(0, 0, 0));
        jlCaret.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N
        jlCaret.setForeground(new java.awt.Color(0, 255, 0));
        jlCaret.setText(">");
        jlCaret.setOpaque(true);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlQuestion, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jlCaret, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtfInput))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 834, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 670, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jlQuestion, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jtfInput, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
                    .addComponent(jlCaret, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtfInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfInputActionPerformed
        answerProvided = jtfInput.getText();
        jtfInput.setText("");
    }//GEN-LAST:event_jtfInputActionPerformed

    private void formWindowGainedFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowGainedFocus
        jtfInput.requestFocus();
    }//GEN-LAST:event_formWindowGainedFocus

    private void jtaOutputFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtaOutputFocusGained
        jtfInput.requestFocus();
    }//GEN-LAST:event_jtaOutputFocusGained

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) throws IOException {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            //UIManager.setLookAndFeel("com.sun.java.swing.plaf.motif.MotifLookAndFeel");
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CLI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CLI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CLI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CLI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        final CLI cli = new CLI();
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                cli.setVisible(true);
            }
        });
        try {
            cli.initializeSequence();
        } catch (InterruptedException ex) {
            Logger.getLogger(CLI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void startAnimateCaret() {
        new Thread(() -> animate()).start();
    }



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel jlCaret;
    private javax.swing.JLabel jlQuestion;
    private javax.swing.JTextArea jtaOutput;
    private javax.swing.JTextField jtfInput;
    // End of variables declaration//GEN-END:variables

    private Thread animate() {
        boolean caretOn = true;
        while (true) {
            jlCaret.setText(caretOn ? ">" : " ");
            caretOn = !caretOn;
            try {
                Thread.sleep(500);
            } catch (InterruptedException ex) {
                Logger.getLogger(CLI.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }

    private void initializeSequence() throws InterruptedException {
        appendMessage(asciiArt, 1);
        appendMessage("Connecting to cerberus authentication server...");
        appendMessage("...       ");
        appendMessage("...       ");
        appendMessage("Welcome to Strange Corp. CLI client");
        appendMessage("CLI v2.1.32");
        appendMessage("Proceeding to authentication mode...");
        appendMessage("Authentication mode ready.");

        startAnimateCaret();
        followExpectations();
    }

    private void appendMessage(String msg) throws InterruptedException {
        appendMessage(msg, DEFAULT_DELAY_BETWEEN_CHAR_OUTPUT);
    }
    protected static final int DEFAULT_DELAY_BETWEEN_CHAR_OUTPUT = 30;

    private void question(String question) {
        jlQuestion.setText(question);
        jtfInput.setText("");
        jtfInput.requestFocus();
    }


    Expectation[] authSequence = {
        Expectation.by("Employee ID?", "43857-0037"),
        Expectation.byImmediate("Password?", "XG92Si3QzZ"),
        rollingSequence()
    };


    private void waitForAnswer(Expectation step) throws InterruptedException {
        waitForInput();
        step.providedAnswer = answerProvided;
        if (step.expectsImmediateAnswer() && !step.checkAnswer()) {
            abortWithError();
        }
        jtfInput.setText("");
    }

    protected String waitForInput() throws InterruptedException {
        answerProvided = null;
        while (answerProvided == null) {
            Thread.sleep(10);
        }
        return answerProvided;
    }

    private void abortWithError() throws InterruptedException {
        jtfInput.setText("ERROR!");
        appendMessage("Sorry you could not be authenticated");
        Thread.sleep(500);
        appendMessage("Aborting application...");
        Thread.sleep(2000);
        System.exit(1);
    }

    private Expectation rollingSequence() {
        Expectation possibilities[] = {
            Expectation.byImmediate("Code P245/L1/W2?", "principe"),
            Expectation.byImmediate("Code P106/L12/W5?", "vide"),
            Expectation.byImmediate("Code P483/L1/W2?", "technologie"),
            Expectation.byImmediate("Code P552/L6/W1?", "PREAO"),
            Expectation.byImmediate("Code P112/L1/W2?", "cristallin"),
            Expectation.byImmediate("Code P278/L3/W3?", "modification")
        };

        return oneOf(possibilities);
    }

    private Expectation oneOf(Expectation[] possibilities) {
        int idx = oneOf(possibilities.length);
        return possibilities[idx];
    }

    private void appendMessage(String msg, int delay) throws InterruptedException {
        for (char c : msg.toCharArray()) {
            jtaOutput.append(String.valueOf(c));
            Thread.sleep(delay);
        }
        jtaOutput.append("\n");
    }

    private void processCommands() throws InterruptedException {
        question("Command?");
        while (true) {
            String cmd = waitForInput();
            switch (cmd.trim()) {
                case "log":
                    appendMessage(LOG_MESSAGE, 1);
                    break;
                
                case "exit":
                    System.exit(0);
                    break;

                case "mail":
                    appendMessage(MAIL_MESSAGE, 1);
                    break;
                case "read mail":
                    appendMessage(MAIL1_MESSAGE, 1);
                    break;

                case "odds":
                    appendMessage(oneOf(ODDS_STRINGS), 1);
                    break;

                case "help":
                    appendMessage(HELP_MESSAGE,2);
                    break;
                default:
                    appendMessage("Invalid command: " + cmd);
                    appendMessage(HELP_MESSAGE, 2);
            }
            appendMessage(SEP_STRING, 1);
        }
    }
    protected static final String SEP_STRING = "\n==========================================================================================\n";
    protected static final String LOG_MESSAGE = "12/10 Hacker has been identified on the CLI system... Leading investigations\n"
            + "12/14 Haha - I found the hacker USB key, data is still there and did not exit the building\n"
            + "12/15 I will lock out strangers until the hacker is found\n"
            + "12/15 Memento: Padlock code is 1039 times 2";
    protected static final String MAIL_MESSAGE = "You have one new message, to read enter the command \"read mail\"";

    String oneOf(String[] strs) {
        int idx = oneOf(strs.length);
        return strs[idx];
    }

    protected static final String HELP_MESSAGE = "Available commands: \n"
            + "    help: show this help\n"
            + "    exit: exit the secured CLI\n"
            + "    odds: special CLI features\n"
            + "    mail: tell about new mail messages\n"
            + "    log:  access personal log messages\n";


    static final String[] ODDS_STRINGS={
    "                   _\n" +
"                 _(_)_                      \n" +
"     @@@@       (_)@(_)  vVVVv    _     @@@@\n" +
"    @@()@@ wWWWw  (_)\\   (___)  _(_)_  @@()@@\n" +
"     @@@@  (___)     `|/   Y   (_)@(_)  @@@@\n" +
"      /      Y       \\|   \\|/   /(_)    \\|\n" +
"   \\ |     \\ |/       | /\\ | / \\|/       |/\n" +
"  jgs|///  \\\\|/// \\\\\\\\|//\\\\|///\\|///  \\\\\\|//\n" +
"  ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^ ",
        "Close the world, Open the next"," _                                          \n" +
"//\\                                         \n" +
"V  \\                                        \n" +
" \\  \\_         DON'T LOOK AT ME             \n" +
"  \\,'.`-.       I'M IRRELEVANT              \n" +
"   |\\ `. `.                                 \n" +
"   ( \\  `. `-.                        _,.-:\\\n" +
"    \\ \\   `.  `-._             __..--' ,-';/\n" +
"     \\ `.   `-.   `-..___..---'   _.--' ,'/ \n" +
"      `. `.    `-._        __..--'    ,' /  \n" +
"        `. `-_     ``--..''       _.-' ,'   \n" +
"          `-_ `-.___        __,--'   ,'     \n" +
"             `-.__  `----\"\"\"    __.-'       \n" +
"hh                `--..____..--'            ","                                                                     \n" +
"        TAKE US TO YOUR LEADER               WE COME IN PEACE        \n" +
"                                                                     \n" +
"                  \\                                 /                \n" +
"                   \\    .-\"\"\"\"-.       .-\"\"\"\"-.    /                 \n" +
"                    \\  /        \\     /        \\  /                  \n" +
"                      /_        _\\   /_        _\\                    \n" +
"                     // \\      / \\\\ // \\      / \\\\                   \n" +
"                     |\\__\\    /__/| |\\__\\    /__/|                   \n" +
"                      \\    ||    /   \\    ||    /                    \n" +
"                       \\        /     \\        /                     \n" +
"                        \\  __  /       \\  __  /                      \n" +
"                .-\"\"\"\"-. '.__.'.-\"\"\"\"-. '.__.'.-\"\"\"\"-.               \n" +
"               /        \\ |  |/        \\ |  |/        \\              \n" +
"              /_        _\\|  /_        _\\|  /_        _\\             \n" +
"             // \\      / \\\\ // \\      / \\\\ // \\      / \\\\            \n" +
"             |\\__\\    /__/| |\\__\\    /__/| |\\__\\    /__/|            \n" +
"              \\    ||    /   \\    ||    /   \\    ||    /             \n" +
"               \\        /     \\        /     \\        /              \n" +
"            /   \\  __  /       \\  __  /       \\  __  /  \\            \n" +
"           /     '.__.'         '.__.'         '.__.'    \\           \n" +
"          /  jgs  |  |           |  |           |  |      \\          \n" +
"         /        |  |           |  |           |  |       \\         \n" +
"                                                                     \n" +
"  I THINK I STOPPED               |                 WHAT WE NEED HERE\n" +
"UP YOUR HUMAN TOILETS             |                  IS A SALAD BAR  \n" +
"                                  |                                  \n" +
"                                                                     \n" +
"                            HOLY GOD I'M                             \n" +
"                           GOING TO BURST                            ","             ONE WORD SAYS IT ALL:                \n" +
" ____ ___    _    ____  ____  _   _ _____    _    \n" +
"|  _ \\_ _|  / \\  |  _ \\|  _ \\| | | | ____|  / \\   \n" +
"| | | | |  / _ \\ | |_) | |_) | |_| |  _|   / _ \\  \n" +
"| |_| | | / ___ \\|  _ <|  _ <|  _  | |___ / ___ \\ \n" +
"|____/___/_/   \\_\\_| \\_\\_| \\_\\_| |_|_____/_/   \\_\\"," .           ..         .           .       .           .           .          \n" +
"      .         .            .          .       .                              \n" +
"            .         ..xxxxxxxxxx....               .       .             .   \n" +
"    .             MWMWMWWMWMWMWMWMWMWMWMWMW                       .            \n" +
"              IIIIMWMWMWMWMWMWMWMWMWMWMWMWMWMttii:        .           .        \n" +
" .      IIYVVXMWMWMWMWMWMWMWMWMWMWMWMWMWMWMWMWMWMWMWxx...         .           .\n" +
"     IWMWMWMWMWMWMWMWMWMWMWMWMWMWMWMWMWMWMWMWMWMWMWMWMWMWMx..                  \n" +
"   IIWMWMWMWMWMWMWMWMWBY%ZACH%AND%OWENMWMWMWMWMWMWMWMWMWMWMWMWMx..        .    \n" +
"    \"\"MWMWMWMWMWM\"\"\"\"\"\"\"\".  .:..   .\"\"\"\"\"MWMWMWMWMWMWMWMWMWMWMWMWMWti.         \n" +
" .     \"\"   . `  .: . :. : .  . :.  .  . . .  \"\"\"\"MWMWMWMWMWMWMWMWMWMWMWMWMti= \n" +
"        . .   :` . :   .  .'.' '....xxxxx...,'. '   ' .\"\"\"YWMWMWMWMWMWMWMWMWMW+\n" +
"     ; . ` .  . : . .' :  . ..XXXXXXXXXXXXXXXXXXXXx.    `     . \"YWMWMWMWMWMWMW\n" +
".    .  .  .    . .   .  ..XXXXXXXXWWWWWWWWWWWWWWWWXXXX.  .     .     \"\"\"\"\"\"\"  \n" +
"        ' :  : . : .  ...XXXXXWWW\"   W88N88@888888WWWWWXX.   .   .       . .   \n" +
"   . ' .    . :   ...XXXXXXWWW\"    M88N88GGGGGG888^8M \"WMBX.          .   ..  :\n" +
"         :     ..XXXXXXXXWWW\"     M88888WWRWWWMW8oo88M   WWMX.     .    :    . \n" +
"           \"XXXXXXXXXXXXWW\"       WN8888WWWWW  W8@@@8M    BMBRX.         .  : :\n" +
"  .       XXXXXXXX=MMWW\":  .      W8N888WWWWWWWW88888W      XRBRXX.  .       . \n" +
"     ....  \"\"XXXXXMM::::. .        W8@889WWWWWM8@8N8W      . . :RRXx.    .     \n" +
"         ``...'''  MMM::.:.  .      W888N89999888@8W      . . ::::\"RXV    .  : \n" +
" .       ..'''''      MMMm::.  .      WW888N88888WW     .  . mmMMMMMRXx        \n" +
"      ..' .            \"\"MMmm .  .       WWWWWWW   . :. :,miMM\"\"\"  : \"\"`    .  \n" +
"   .                .       \"\"MMMMmm . .  .  .   ._,mMMMM\"\"\"  :  ' .  :        \n" +
"               .                  \"\"MMMMMMMMMMMMM\"\"\" .  : . '   .        .     \n" +
"          .              .     .    .                   HM                     \n" +
".                                         .          .         .               \n" +
"                                                                               \n" +
"                                 I CAN SEE YOU                  \n" 
,
        "quu..__                                                               \n" +
" $$$b  `---.__                                                        \n" +
"  \"$$b        `--.                          ___.---uuudP              \n" +
"   `$$b           `.__.------.__     __.---'      $$$$\"              .\n" +
"     \"$b          -' _          `-.-'            $$$\"              .'|\n" +
"       \".           | |                         d$\"             _.'  |\n" +
"         `.   /     | |                      ...\"             .'     |\n" +
"           `./      | |___               ..::-'            _.'       |\n" +
"            /       |_____|           .:::-'            .-'         .'\n" +
"           :                          ::''\\          _.'            | \n" +
"          .' .-.             .-.           `.      .'               | \n" +
"          : /'$$|           .@\"$\\           `.   .'              _.-' \n" +
"         .'|$u$$|          |$$,$$|           |  <            _.-'     \n" +
"         | `:$$:'          :$$$$$:           `.  `.       .-'         \n" +
"         :                  `\"--'             |    `-.     \\          \n" +
"        :##.       ==             .###.       `.      `.    `\\        \n" +
"        |##:                      :###:        |        >     >       \n" +
"        |#'     `..'`..'          `###'        x:      /     /        \n" +
"         \\                                   xXX|     /    ./         \n" +
"          \\                                xXXX'|    /   ./           \n" +
"          /`-.                                  `.  /   /             \n" +
"         :    `-  ...........,                   | /  .'              \n" +
"         |         ``:::::::'       .            |<    `.             \n" +
"         |             ```          |           x| \\ `.:``.           \n" +
"         |                         .'    /'   xXX|  `:`M`M':.         \n" +
"         |    |                    ;    /:' xXXX'|  -'MMMMM:'         \n" +
"         `.  .'                   :    /:'       |-'MMMM.-'           \n" +
"          |  |                   .'   /'        .'MMM.-'              \n" +
"          `'`'                   :  ,'          |MMM<                 \n" +
"            |                     `'            |tbap\\                \n" +
"             \\                                  :MM.-'                \n" +
"              \\                 |              .''                    \n" +
"               \\.               `.            /                       \n" +
"                /     .:::::::.. :           /                        \n" +
"               |     .:::::::::::`.         /                         \n" +
"               |   .:::------------\\       /                          \n" +
"              /   .''               >::'  /                           \n" +
"              `',:                 :    .'                            \n" +
"                                   `:.:' TP/tQn  "," .'/,-Y\"     \"~-.                             \n" +
" l.Y             ^.                           \n" +
" /\\               _\\_      D'OH\n" +
"i            ___/\"   \"\\                       \n" +
"|          /\"   \"\\   o !                      \n" +
"l         ]     o !__./                       \n" +
" \\ _  _    \\.___./    \"~\\                     \n" +
"  X \\/ \\            ___./                     \n" +
" ( \\ ___.   _..--~~\"   ~`-.                   \n" +
"  ` Z,--   /               \\                  \n" +
"    \\__.  (   /       ______)                 \n" +
"      \\   l  /-----~~\" /                  \n" +
"       Y   \\          /                       \n" +
"       |    \"x______.^                        \n" +
"       |           \\                          \n" +
"       j            Y       "
    };

    private int oneOf(int length) {
        return (int) Math.floor(Math.random() * length);
    }

    public static class Expectation {
        String question;
        String expectedAnswer;
        String providedAnswer;
        boolean immediateCheck = false;

        Expectation(String question, String expectedAnswer) {
            this.question = question;
            this.expectedAnswer = expectedAnswer;
        }

        static Expectation by(String question, String expectedAnswer) {
            return new Expectation(question, expectedAnswer);
        }

        static Expectation byImmediate(String question, String expectedAnswer) {
            return new Expectation(question, expectedAnswer, true);
        }

        private Expectation(String question, String expectedAnswer, boolean b) {
            this(question, expectedAnswer);
            immediateCheck = true;
        }

        private boolean expectsImmediateAnswer() {
            return immediateCheck;
        }

        private boolean checkAnswer() {
            return expectedAnswer.equalsIgnoreCase(providedAnswer);
        }

    }

    private void followExpectations() throws InterruptedException {
        authQuestions();
        appendMessage("Authentication OK, welcome home Heather!");
        appendMessage("Ready to accept commands (need help?).");
        processCommands();

    }

    protected void authQuestions() throws InterruptedException {
        for (Expectation step : authSequence) {
            answerProvided=null;
            question(step.question);
            waitForAnswer(step);
            appendMessage("OK");
        }
        for (Expectation step : authSequence) {
            if(!step.checkAnswer()){
                appendMessage("!"+step.question);
                abortWithError();
            }
        }
    }
}
