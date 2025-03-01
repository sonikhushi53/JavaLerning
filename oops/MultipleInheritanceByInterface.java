package oops;

// Interface 1: Camera
interface Camera {
    void takePhoto();
}

// Interface 2: Basic Music Player
interface MusicPlayer {
    void playMusic();
}

// Interface 3: Advanced Music Player (Extends Basic Music Player)
interface AdvancedMusicPlayer extends MusicPlayer {
    void streamMusic(); // Extra feature for streaming
}


// Smartphone implements both Camera and AdvancedMusicPlayer
class Smartphone implements Camera, AdvancedMusicPlayer {
    public void takePhoto() {
        System.out.println("Capturing a photo...");
    }

    public void playMusic() {
        System.out.println("Playing music from storage...");
    }

    public void streamMusic() {
        System.out.println("Streaming music online...");
    }
}
public class MultipleInheritanceByInterface {
     public static void main(String[] args) {
        Smartphone myPhone = new Smartphone();
        
        myPhone.takePhoto();    // From Camera interface
        myPhone.playMusic();    // From Basic Music Player
        myPhone.streamMusic();  // From Advanced Music Player 
    }
}
