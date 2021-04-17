import common.ImageReader;
import common.ImageTypes;

/* 
Factory method pattern
*/

public class Solution {
    public static void main(String[] args) {
        ImageReader reader = ImageReaderFactory.getImageReader(ImageTypes.JPG);
    }
}
