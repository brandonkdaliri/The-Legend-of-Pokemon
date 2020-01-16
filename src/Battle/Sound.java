/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Battle;

/**
 *
 * @author 068685601
 */
import java.io.File;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineEvent;
import javax.sound.sampled.LineListener;


public class Sound {
	/**
	 * play is used to play sound effects (.wav) 
	 */
	
    public static synchronized void play(final String fileName) 
    {           
        new Thread(new Runnable() { 
            public void run() {
                try {
                    Clip clip = AudioSystem.getClip();
                    AudioInputStream inputStream = AudioSystem.getAudioInputStream(new File(fileName));
                    clip.open(inputStream);
                    
                    clip.addLineListener(new LineListener(){
                    	public void update(LineEvent event){
                    		if(event.getType()==LineEvent.Type.STOP){
                    			event.getLine().close();
                    		}
                    		
                    	}
                    });
                    clip.start();
                    Thread.sleep(253000);
                    
                    if(clip.isOpen()){
                    	clip.close();
                        inputStream.close();
                    }
                } catch (Exception e) {
                }
            }
        }).start();
    }
}
//Sound.play("repeat.wav");