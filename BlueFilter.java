import java.awt.Color;

/**
 * An image filter to add a blue tint on top of every pixel.
 * 
 * Connor Richardson
 * 12/12/17
 */
public class BlueFilter extends Filter
{
    /**
     * Constructor for objects of class InvertFilter.
     * @param name The name of the filter.
     */
    public BlueFilter(String name)
    {
        super(name);
    }

    /**
     * Apply this filter to an image.
     * 
     * @param  image  The image to be changed by this filter.
     */
    public void apply(OFImage image)
    {
        int height = image.getHeight();
        int width = image.getWidth();
        for(int y = 0; y < height; y++) {
            for(int x = 0; x < width; x++) {
                Color pix = image.getPixel(x, y);
                image.setPixel(x, y, new Color(pix.getRed() + pix.getGreen()
                + (pix.getBlue()+50)));
            }
        }
    }
}