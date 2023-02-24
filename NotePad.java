package GUI;

import javax.swing.*;
import java.awt.*;

public class NotePad {
    NotePad(){
        JFrame frame=new JFrame();
        frame.setTitle("Notepad");
        frame.setSize(800,500);
        frame.setLayout(null);
        frame.setVisible(true);



        JMenuBar menuBar=new JMenuBar();
        menuBar.setBounds(02,05,200,20);
        JMenu file = new JMenu("File");
        JMenuItem New=new JMenuItem("New CTRL+N");
        JMenuItem new_window=new JMenuItem("New Window");
        JMenuItem open=new JMenuItem("Open");
        JMenuItem save=new JMenuItem("Save..");
        JMenuItem saveAs=new JMenuItem("SaveAs..");
        JMenuItem pageSetUp=new JMenuItem("PageSetUp..");
        JMenuItem print=new JMenuItem("Print");
        JMenuItem exit=new JMenuItem("Exit");


        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        file.add(New);
        file.add(new_window);
        file.add(open);
        file.add(save);
        file.add(saveAs);
        file.add(pageSetUp);
        file.add(print);
        file.add(exit);
        exit.addActionListener(e->{
            frame.dispose();
        });
        menuBar.add(file);

        JMenu edit = new JMenu("Edit");
        JMenuItem undo=new JMenuItem("Undo");
        JMenuItem copy=new JMenuItem("Copy");
        JMenuItem paste=new JMenuItem("Paste");
        JMenuItem delete=new JMenuItem("Delete");
        JMenuItem searchWithBing=new JMenuItem("Search With Bing");
        JMenuItem find=new JMenuItem("Find");
        JMenuItem findNext=new JMenuItem("Find Next");
        JMenuItem findPrevious=new JMenuItem("Find Previous");
        JMenuItem replace=new JMenuItem("Replace");
        JMenuItem goTo=new JMenuItem("GO TO");
        JMenuItem selectAll=new JMenuItem("Select All");
        JMenuItem date=new JMenuItem("Time/Date");
        edit.add(undo);
        edit.add(copy);
        edit.add(paste);
        edit.add(delete);
        edit.add(searchWithBing);
        edit.add(find);
        edit.add(findNext);
        edit.add(findPrevious);
        edit.add(replace);
        edit.add(goTo);
        edit.add(selectAll);
        edit.add(date);
        menuBar.add(edit);

        JMenu format = new JMenu("Format");
        JMenuItem wrap=new JMenuItem("Word Wrap");
        JMenuItem font=new JMenuItem("Font");
        format.add(wrap);
        format.add(font);
        menuBar.add(format);

        JMenu view = new JMenu("View");
        JMenuItem zoom=new JMenuItem("Zoom");
        JMenuItem statusBar=new JMenuItem("Status Bar");
        view.add(zoom);
        view.add(statusBar);
        menuBar.add(view);

        JMenu help = new JMenu("Help");
        JMenuItem viewHelp=new JMenuItem("View Help");
        JMenuItem sendFeedBack=new JMenuItem("Send Feedback");
        JMenuItem aboutNotepad=new JMenuItem("About Note Pad");
        help.add(viewHelp);
        help.add(sendFeedBack);
        help.add(aboutNotepad);
        menuBar.add(help);
        TextArea tArea= new TextArea();
        tArea.setBounds(0,30,1300,650);

        frame.add(menuBar);
        frame.add(tArea);
    }
    public static void main(String args[]){
        NotePad obj=new NotePad();
    }
}
