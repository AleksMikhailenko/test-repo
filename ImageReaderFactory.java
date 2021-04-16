import common.*;

public class ImageReaderFactory {
    public static ImageReader getImageReader(ImageTypes imageType) {
        ImageReader imageReader;

        if (imageType == null) {
            throw new IllegalArgumentException("Неизвестный тип картинки");
        }

        switch (imageType) {
            case BMP:
                imageReader = new BmpReader();
                break;
            case JPG:
                imageReader = new JpgReader();
                break;
            case PNG:
                imageReader = new PngReader();
                break;
            default:
                throw new IllegalArgumentException("Неизвестный тип картинки");
        }

        return imageReader;
    }
}
