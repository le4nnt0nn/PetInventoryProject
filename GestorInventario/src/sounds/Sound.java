package sounds;

import java.io.File;

import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

public class Sound {
	
	
	/*Normal button sound*/
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
	
	/*Fail login sound*/
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
	
	/*Successful login sound*/
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
	
	/*Entered option sound*/
	public static void enteredOption() {
		try {
			File sound = new File("src\\sounds\\enteredOption.wav");
			Clip c = AudioSystem.getClip();
			c.open(AudioSystem.getAudioInputStream(sound));
			c.start();
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	
	/*Bark sound for userPage*/
	public static void barkClicked() {
		try {
			File sound = new File("src\\sounds\\doggieBarkUser.wav");
			Clip c = AudioSystem.getClip();
			c.open(AudioSystem.getAudioInputStream(sound));
			c.start();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}


}
