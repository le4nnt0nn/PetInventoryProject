package sounds;

import java.io.File;

import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

public class Sound {
	
	public Sound() {
		
	}
	
	public void button_sound() {
		try {
			File sound = new File("src\\sounds\\pressButton.wav");
			Clip c = AudioSystem.getClip();
			c.open(AudioSystem.getAudioInputStream(sound));
			c.start();
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}

}
