package at.monkeybrain.gameframework;
import at.monkeybrain.gameframework.Graphics.ImageFormat;
/**
 * Created by captain on 12.11.14.
 */
public interface Image {
    public int getWidth();
    public int getHeight();
    public ImageFormat getFormat();
    public void dispose();
}
