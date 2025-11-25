package MavenTutorialYouTube;

import org.example.MavenTutorialYouTube.Mp3Util;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.nio.file.Paths;

public class Mp3UtilTest {

    @Test
    void getArtist_shouldBe_Marco() {
        String artist = Mp3Util.getArtist(Paths.get("./my.mp3"));
        Assertions.assertEquals("Maaarrrcoooo", artist);
    }
}