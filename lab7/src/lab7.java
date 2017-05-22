import java.awt.*;

import java.awt.event.*;
import javax.swing.*;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Comparator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;


public class lab7
{
	JFileChooser chooser = new JFileChooser();
	//count the number of words
	public static int countWords(String sr){

	    int wordCount = 0;

	    boolean word = false;
	    int endOfLine = sr.length() - 1;

	    for (int i = 0; i < sr.length(); i++) {
	        // if the char is a letter, word = true.
	        if (Character.isLetter(sr.charAt(i)) && i != endOfLine) {
	            word = true;
	            // if char isn't a letter and there have been letters before,
	            // counter goes up.
	        } else if (!Character.isLetter(sr.charAt(i)) && word) {
	            wordCount++;
	            word = false;
	            // last word of String; if it doesn't end with a non letter, it
	            // wouldn't count without this.
	        } else if (Character.isLetter(sr.charAt(i)) && i == endOfLine) {
	            wordCount++;
	        }
	    }
	    return wordCount;
	}
	
	public static void main ( String[] args ) throws IOException
	{
	    //FRAME
		JFrame frame = new JFrame ("Text Analyzer");
		
		//pick file
		JFileChooser fileChooser = new JFileChooser();
		fileChooser.setCurrentDirectory(new File(System.getProperty("user.home")));
		int result = fileChooser.showOpenDialog(frame);
		if (result == JFileChooser.APPROVE_OPTION) {
		    File selectedFile = fileChooser.getSelectedFile();
			//Container
			Container contentPane = frame.getContentPane();
		    contentPane.setLayout(new BorderLayout());

		    //read in the file
		    String file="";
			try {
			    file = new Scanner(selectedFile).useDelimiter("\\Z").next();
			} catch(FileNotFoundException e) {
				e.printStackTrace();
			}
			
			
			//TEXT AREA
			JTextArea textArea = new JTextArea(file);
			textArea.setSize(600, 400);   

			textArea.setLineWrap(true);
			textArea.setEditable(false);
			textArea.setVisible(true);

			JScrollPane scroll = new JScrollPane (textArea);
			scroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
			scroll.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			StatusBar statusBar = new StatusBar();
			statusBar.setMessage(selectedFile.getAbsolutePath()+"    "+selectedFile.length()+" Bytes");
			frame.getContentPane().add(statusBar, java.awt.BorderLayout.SOUTH);
			frame.setTitle("Text Analyer");
			frame.add(scroll);
			frame.pack();
			frame.setResizable(true);
			frame.setSize(600, 400);
			frame.setVisible(true);
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		    
			
			//counting things
			int numWords = countWords(file);
			
		    int numChar= file.length();
		    
		    int numSentence=0;
		    try{
			    BufferedReader reader = new BufferedReader(new FileReader(selectedFile));
			    int sentenceCount = 0;
			    String line;
			    String delimiters = "?!.";

			    while ((line = reader.readLine()) != null) { // Continue reading until end of file is reached
			        for (int i = 0; i < line.length(); i++) {
			            if (delimiters.indexOf(line.charAt(i)) != -1) { // If the delimiters string contains the character
			                sentenceCount++;
			            }
			        }
			    }
			    
			    numSentence=sentenceCount;
			    reader.close();
		    } catch(FileNotFoundException e) {
				e.printStackTrace();
			}
		    
		    //find freq of each word
		    
	        Scanner input = new Scanner(selectedFile);
	        
	        // count occurrences of words
	        Map<String, Integer> wordCounts = new TreeMap<String, Integer>();
	        while (input.hasNext()) {
	            String original = input.next().toLowerCase();
	            String next=original.replaceAll("\\p{Punct}+", "");
	            if (!wordCounts.containsKey(next)) {
	                wordCounts.put(next, 1);
	            } else {
	                wordCounts.put(next, wordCounts.get(next) + 1);
	            }
	        }
	    
	        String freqList="";
	        
	        for (Entry<String, Integer> entry  : entriesSortedByValues(wordCounts)) {
	            freqList += entry.getValue()+":\t"+entry.getKey()+"\n";
	        }
	    
	        JFrame frame2 = new JFrame ("Test");
	        JTextArea freqlist = new JTextArea(freqList);
			freqlist.setSize(600, 400);   

			freqlist.setLineWrap(true);
			freqlist.setEditable(false);
			freqlist.setVisible(true);

			JScrollPane scroll1 = new JScrollPane (freqlist);
			scroll1.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
			scroll1.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			frame2.setTitle("Frequency List");
			frame2.add(scroll1);
			frame2.pack();
			frame2.setResizable(true);
			frame2.setSize(600, 400);
			frame2.setVisible(true);
			frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		    
			
			//print stats in dialog box
			String stats="\n# of Characters: "+numChar+"\n# of Words: "+numWords+"\n# of Sentences: "+numSentence+"\nAverage length of word: "+(numChar/numWords)+""
		    		+ "\nAverage length of sentences: "+(numWords/numSentence);
		    
			JOptionPane.showMessageDialog (null, stats);
			

			try{
			    PrintWriter writer = new PrintWriter("outputfile.txt", "UTF-8");
			    writer.println("Analyzed File: \n"+file + " ");
			    writer.println("\n\nWord Frequency List: \n"+freqList + " ");
			    writer.println("\n\nStats of Inputted File: \n"+stats + " ");
			    writer.close();
			} catch (Exception e) {
			   e.printStackTrace();
			}

		    
		}
		
	}
	
	static <K,V extends Comparable<? super V>>
	SortedSet<Map.Entry<K,V>> entriesSortedByValues(Map<K,V> map) {
	    SortedSet<Map.Entry<K,V>> sortedEntries = new TreeSet<Map.Entry<K,V>>(
	        new Comparator<Map.Entry<K,V>>() {
	            @Override public int compare(Map.Entry<K,V> e1, Map.Entry<K,V> e2) {
	                int res = e2.getValue().compareTo(e1.getValue());
	                return res != 0 ? res : 1;
	            }
	        }
	    );
	    sortedEntries.addAll(map.entrySet());
	    return sortedEntries;
	}
}


