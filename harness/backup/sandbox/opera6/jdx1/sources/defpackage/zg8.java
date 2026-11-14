package defpackage;

import androidx.core.app.NotificationCompat;
import java.nio.ByteOrder;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Map;

/* loaded from: classes.dex */
public final class zg8 {
    public static final lh8[] b;
    public static final lh8[][] c;
    public static final HashSet d;
    public static final String e;
    public final ArrayList a;

    static {
        lh8[] lh8VarArr = {new lh8(NotificationCompat.FLAG_LOCAL_ONLY, 3, 4, "ImageWidth"), new lh8(257, 3, 4, "ImageLength"), new lh8("Make", 271, 2), new lh8("Model", 272, 2), new lh8("Orientation", 274, 3), new lh8("XResolution", 282, 5), new lh8("YResolution", 283, 5), new lh8("ResolutionUnit", 296, 3), new lh8("Software", 305, 2), new lh8("DateTime", 306, 2), new lh8("YCbCrPositioning", 531, 3), new lh8("SubIFDPointer", 330, 4), new lh8("ExifIFDPointer", 34665, 4), new lh8("GPSInfoIFDPointer", 34853, 4)};
        lh8[] lh8VarArr2 = {new lh8("ExposureTime", 33434, 5), new lh8("FNumber", 33437, 5), new lh8("ExposureProgram", 34850, 3), new lh8("PhotographicSensitivity", 34855, 3), new lh8("SensitivityType", 34864, 3), new lh8("ExifVersion", 36864, 2), new lh8("DateTimeOriginal", 36867, 2), new lh8("DateTimeDigitized", 36868, 2), new lh8("ComponentsConfiguration", 37121, 7), new lh8("ShutterSpeedValue", 37377, 10), new lh8("ApertureValue", 37378, 5), new lh8("BrightnessValue", 37379, 10), new lh8("ExposureBiasValue", 37380, 10), new lh8("MaxApertureValue", 37381, 5), new lh8("MeteringMode", 37383, 3), new lh8("LightSource", 37384, 3), new lh8("Flash", 37385, 3), new lh8("FocalLength", 37386, 5), new lh8("SubSecTime", 37520, 2), new lh8("SubSecTimeOriginal", 37521, 2), new lh8("SubSecTimeDigitized", 37522, 2), new lh8("FlashpixVersion", 40960, 7), new lh8("ColorSpace", 40961, 3), new lh8(40962, 3, 4, "PixelXDimension"), new lh8(40963, 3, 4, "PixelYDimension"), new lh8("InteroperabilityIFDPointer", 40965, 4), new lh8("FocalPlaneResolutionUnit", 41488, 3), new lh8("SensingMethod", 41495, 3), new lh8("FileSource", 41728, 7), new lh8("SceneType", 41729, 7), new lh8("CustomRendered", 41985, 3), new lh8("ExposureMode", 41986, 3), new lh8("WhiteBalance", 41987, 3), new lh8("SceneCaptureType", 41990, 3), new lh8("Contrast", 41992, 3), new lh8("Saturation", 41993, 3), new lh8("Sharpness", 41994, 3)};
        lh8[] lh8VarArr3 = {new lh8("GPSVersionID", 0, 1), new lh8("GPSLatitudeRef", 1, 2), new lh8(2, 5, 10, "GPSLatitude"), new lh8("GPSLongitudeRef", 3, 2), new lh8(4, 5, 10, "GPSLongitude"), new lh8("GPSAltitudeRef", 5, 1), new lh8("GPSAltitude", 6, 5), new lh8("GPSTimeStamp", 7, 5), new lh8("GPSSpeedRef", 12, 2), new lh8("GPSTrackRef", 14, 2), new lh8("GPSImgDirectionRef", 16, 2), new lh8("GPSDestBearingRef", 23, 2), new lh8("GPSDestDistanceRef", 25, 2)};
        b = new lh8[]{new lh8("SubIFDPointer", 330, 4), new lh8("ExifIFDPointer", 34665, 4), new lh8("GPSInfoIFDPointer", 34853, 4), new lh8("InteroperabilityIFDPointer", 40965, 4)};
        c = new lh8[][]{lh8VarArr, lh8VarArr2, lh8VarArr3, new lh8[]{new lh8("InteroperabilityIndex", 1, 2)}};
        d = new HashSet(Arrays.asList("FNumber", "ExposureTime", "GPSTimeStamp"));
        e = new String(new byte[]{1, 2, 3, 0}, StandardCharsets.UTF_8);
    }

    public zg8(ArrayList arrayList) {
        ByteOrder byteOrder = ByteOrder.BIG_ENDIAN;
        jpo.n("Malformed attributes list. Number of IFDs mismatch.", arrayList.size() == 4);
        this.a = arrayList;
    }

    public final Map a(int i) {
        jpo.k(i, 0, 4, p3p.i(i, "Invalid IFD index: ", ". Index should be between [0, EXIF_TAGS.length] "));
        return (Map) this.a.get(i);
    }
}
