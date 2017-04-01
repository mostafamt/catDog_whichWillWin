

package animation ;

import java.awt.Component;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.media.CannotRealizeException;
import javax.media.Manager;
import javax.media.NoPlayerException;
import javax.media.Player;



public class Audio {

    
    
    
    public void run() {
        
        URL mediaURL = null ;
            try {
                mediaURL = new File("src//sound.wav").toURI().toURL();
                Player mediaplayer = null ;
            try {
                mediaplayer = Manager.createRealizedPlayer( mediaURL );
            } catch (IOException ex) {
                Logger.getLogger(Audio.class.getName()).log(Level.SEVERE, null, ex);
            } catch (NoPlayerException ex) {
                Logger.getLogger(Audio.class.getName()).log(Level.SEVERE, null, ex);
            } catch (CannotRealizeException ex) {
                Logger.getLogger(Audio.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            Component video = mediaplayer.getVisualComponent();
            Component controls = mediaplayer.getControlPanelComponent();
            mediaplayer.start();
            } catch (MalformedURLException ex) {
                Logger.getLogger(Audio.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
    
    public void catSound()
    {
        URL mediaURL = null ;
            try {
                mediaURL = new File("src//catMeow.wav").toURI().toURL();
                Player mediaplayer = null ;
            try {
                mediaplayer = Manager.createRealizedPlayer( mediaURL );
            } catch (IOException ex) {
                Logger.getLogger(Audio.class.getName()).log(Level.SEVERE, null, ex);
            } catch (NoPlayerException ex) {
                Logger.getLogger(Audio.class.getName()).log(Level.SEVERE, null, ex);
            } catch (CannotRealizeException ex) {
                Logger.getLogger(Audio.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            Component video = mediaplayer.getVisualComponent();
            Component controls = mediaplayer.getControlPanelComponent();
            mediaplayer.start();
            } catch (MalformedURLException ex) {
                Logger.getLogger(Audio.class.getName()).log(Level.SEVERE, null, ex);
            }
    }
    
    
    public void dogSound()
    {
        URL mediaURL = null ;
            try {
                mediaURL = new File("src//Dog.wav").toURI().toURL();
                Player mediaplayer = null ;
            try {
                mediaplayer = Manager.createRealizedPlayer( mediaURL );
            } catch (IOException ex) {
                Logger.getLogger(Audio.class.getName()).log(Level.SEVERE, null, ex);
            } catch (NoPlayerException ex) {
                Logger.getLogger(Audio.class.getName()).log(Level.SEVERE, null, ex);
            } catch (CannotRealizeException ex) {
                Logger.getLogger(Audio.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            Component video = mediaplayer.getVisualComponent();
            Component controls = mediaplayer.getControlPanelComponent();
            mediaplayer.start();
            } catch (MalformedURLException ex) {
                Logger.getLogger(Audio.class.getName()).log(Level.SEVERE, null, ex);
            }
    }
    }
    

