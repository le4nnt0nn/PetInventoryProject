package sounds;

import java.io.File;

import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

public class Sound {
	
	public Sound() {
		
	}
	
	//Normal button sound
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
	
	//Fail login sound
	public void fail_login() {
		try {
			File sound = new File("src\\sounds\\failLogin.wav");
			Clip c = AudioSystem.getClip();
			c.open(AudioSystem.getAudioInputStream(sound));
			c.start();
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	
	//Successful login sound
	public void successfulLogin() {
		try {
			File sound = new File("src\\sounds\\successfulLogin.wav");
			Clip c = AudioSystem.getClip();
			c.open(AudioSystem.getAudioInputStream(sound));
			c.start();
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}


}
