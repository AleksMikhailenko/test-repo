import common.*;

public class ImageReaderFactory {
    public static ImageReader getImageReader(ImageTypes imageType) {

        if (imageType == null) {
            throw new IllegalArgumentException("Неизвестный тип картинки");
        }

        ImageReader imageReader = switch (imageType) {
            case BMP -> new BmpReader();
            case JPG -> new JpgReader();
            case PNG -> new PngReader();
            default -> throw new IllegalArgumentException("Неизвестный тип картинки");
        };

        return imageReader;
    }
}
