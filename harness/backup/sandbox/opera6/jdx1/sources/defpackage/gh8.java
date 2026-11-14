package defpackage;

import ads_mobile_sdk.pd;
import android.content.res.AssetManager;
import android.media.MediaMetadataRetriever;
import android.os.Build;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import android.util.Log;
import android.util.Pair;
import androidx.core.app.NotificationCompat;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.TimeZone;
import java.util.regex.Pattern;
import java.util.zip.CRC32;

/* loaded from: classes.dex */
public final class gh8 {
    public static final dh8 W;
    public static final dh8[][] X;
    public static final dh8[] Y;
    public static final HashMap[] Z;
    public static final HashMap[] a0;
    public static final Set b0;
    public static final HashMap c0;
    public static final Charset d0;
    public static final byte[] e0;
    public static final byte[] f0;
    public static final Pattern g0;
    public static final Pattern h0;
    public static final Pattern i0;
    public final String a;
    public final FileDescriptor b;
    public final AssetManager.AssetInputStream c;
    public int d;
    public final boolean e;
    public final HashMap[] f;
    public final HashSet g;
    public ByteOrder h;
    public boolean i;
    public boolean j;
    public boolean k;
    public int l;
    public int m;
    public byte[] n;
    public int o;
    public int p;
    public int q;
    public int r;
    public int s;
    public ch8 t;
    public boolean u;
    public static final boolean v = Log.isLoggable("ExifInterface", 3);
    public static final List w = Arrays.asList(1, 6, 3, 8);
    public static final List x = Arrays.asList(2, 7, 4, 5);
    public static final int[] y = {8, 8, 8};
    public static final int[] z = {8};
    public static final byte[] A = {-1, -40, -1};
    public static final byte[] B = {102, 116, 121, 112};
    public static final byte[] C = {109, 105, 102, 49};
    public static final byte[] D = {104, 101, 105, 99};
    public static final byte[] E = {97, 118, 105, 102};
    public static final byte[] F = {97, 118, 105, 115};
    public static final byte[] G = {79, 76, 89, 77, 80, 0};
    public static final byte[] H = {79, 76, 89, 77, 80, 85, 83, 0, 73, 73};
    public static final byte[] I = {-119, 80, 78, 71, 13, 10, 26, 10};
    public static final byte[] J = "XML:com.adobe.xmp\u0000\u0000\u0000\u0000\u0000".getBytes(StandardCharsets.UTF_8);
    public static final byte[] K = {82, 73, 70, 70};
    public static final byte[] L = {87, 69, 66, 80};
    public static final byte[] M = {69, 88, 73, 70};
    public static final byte[] N = {-99, 1, 42};
    public static final byte[] O = "VP8X".getBytes(Charset.defaultCharset());
    public static final byte[] P = "VP8L".getBytes(Charset.defaultCharset());
    public static final byte[] Q = "VP8 ".getBytes(Charset.defaultCharset());
    public static final byte[] R = "ANIM".getBytes(Charset.defaultCharset());
    public static final byte[] S = "ANMF".getBytes(Charset.defaultCharset());
    public static final String[] T = {"", "BYTE", "STRING", "USHORT", "ULONG", "URATIONAL", "SBYTE", "UNDEFINED", "SSHORT", "SLONG", "SRATIONAL", "SINGLE", "DOUBLE", "IFD"};
    public static final int[] U = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8, 1};
    public static final byte[] V = {65, 83, 67, 73, 73, 0, 0, 0};

    static {
        dh8[] dh8VarArr = {new dh8("NewSubfileType", 254, 4), new dh8("SubfileType", 255, 4), new dh8(NotificationCompat.FLAG_LOCAL_ONLY, 3, 4, "ImageWidth"), new dh8(257, 3, 4, "ImageLength"), new dh8("BitsPerSample", 258, 3), new dh8("Compression", 259, 3), new dh8("PhotometricInterpretation", 262, 3), new dh8("ImageDescription", 270, 2), new dh8("Make", 271, 2), new dh8("Model", 272, 2), new dh8(273, 3, 4, "StripOffsets"), new dh8("Orientation", 274, 3), new dh8("SamplesPerPixel", 277, 3), new dh8(278, 3, 4, "RowsPerStrip"), new dh8(279, 3, 4, "StripByteCounts"), new dh8("XResolution", 282, 5), new dh8("YResolution", 283, 5), new dh8("PlanarConfiguration", 284, 3), new dh8("ResolutionUnit", 296, 3), new dh8("TransferFunction", pd.e1, 3), new dh8("Software", 305, 2), new dh8("DateTime", 306, 2), new dh8("Artist", 315, 2), new dh8("WhitePoint", 318, 5), new dh8("PrimaryChromaticities", 319, 5), new dh8("SubIFDPointer", 330, 4), new dh8("JPEGInterchangeFormat", 513, 4), new dh8("JPEGInterchangeFormatLength", 514, 4), new dh8("YCbCrCoefficients", 529, 5), new dh8("YCbCrSubSampling", 530, 3), new dh8("YCbCrPositioning", 531, 3), new dh8("ReferenceBlackWhite", 532, 5), new dh8("Copyright", 33432, 2), new dh8("ExifIFDPointer", 34665, 4), new dh8("GPSInfoIFDPointer", 34853, 4), new dh8("SensorTopBorder", 4, 4), new dh8("SensorLeftBorder", 5, 4), new dh8("SensorBottomBorder", 6, 4), new dh8("SensorRightBorder", 7, 4), new dh8("ISO", 23, 3), new dh8("JpgFromRaw", 46, 7), new dh8("Xmp", 700, 1)};
        dh8[] dh8VarArr2 = {new dh8("ExposureTime", 33434, 5), new dh8("FNumber", 33437, 5), new dh8("ExposureProgram", 34850, 3), new dh8("SpectralSensitivity", 34852, 2), new dh8("PhotographicSensitivity", 34855, 3), new dh8("OECF", 34856, 7), new dh8("SensitivityType", 34864, 3), new dh8("StandardOutputSensitivity", 34865, 4), new dh8("RecommendedExposureIndex", 34866, 4), new dh8("ISOSpeed", 34867, 4), new dh8("ISOSpeedLatitudeyyy", 34868, 4), new dh8("ISOSpeedLatitudezzz", 34869, 4), new dh8("ExifVersion", 36864, 2), new dh8("DateTimeOriginal", 36867, 2), new dh8("DateTimeDigitized", 36868, 2), new dh8("OffsetTime", 36880, 2), new dh8("OffsetTimeOriginal", 36881, 2), new dh8("OffsetTimeDigitized", 36882, 2), new dh8("ComponentsConfiguration", 37121, 7), new dh8("CompressedBitsPerPixel", 37122, 5), new dh8("ShutterSpeedValue", 37377, 10), new dh8("ApertureValue", 37378, 5), new dh8("BrightnessValue", 37379, 10), new dh8("ExposureBiasValue", 37380, 10), new dh8("MaxApertureValue", 37381, 5), new dh8("SubjectDistance", 37382, 5), new dh8("MeteringMode", 37383, 3), new dh8("LightSource", 37384, 3), new dh8("Flash", 37385, 3), new dh8("FocalLength", 37386, 5), new dh8("SubjectArea", 37396, 3), new dh8("MakerNote", 37500, 7), new dh8("UserComment", 37510, 7), new dh8("SubSecTime", 37520, 2), new dh8("SubSecTimeOriginal", 37521, 2), new dh8("SubSecTimeDigitized", 37522, 2), new dh8("FlashpixVersion", 40960, 7), new dh8("ColorSpace", 40961, 3), new dh8(40962, 3, 4, "PixelXDimension"), new dh8(40963, 3, 4, "PixelYDimension"), new dh8("RelatedSoundFile", 40964, 2), new dh8("InteroperabilityIFDPointer", 40965, 4), new dh8("FlashEnergy", 41483, 5), new dh8("SpatialFrequencyResponse", 41484, 7), new dh8("FocalPlaneXResolution", 41486, 5), new dh8("FocalPlaneYResolution", 41487, 5), new dh8("FocalPlaneResolutionUnit", 41488, 3), new dh8("SubjectLocation", 41492, 3), new dh8("ExposureIndex", 41493, 5), new dh8("SensingMethod", 41495, 3), new dh8("FileSource", 41728, 7), new dh8("SceneType", 41729, 7), new dh8("CFAPattern", 41730, 7), new dh8("CustomRendered", 41985, 3), new dh8("ExposureMode", 41986, 3), new dh8("WhiteBalance", 41987, 3), new dh8("DigitalZoomRatio", 41988, 5), new dh8("FocalLengthIn35mmFilm", 41989, 3), new dh8("SceneCaptureType", 41990, 3), new dh8("GainControl", 41991, 3), new dh8("Contrast", 41992, 3), new dh8("Saturation", 41993, 3), new dh8("Sharpness", 41994, 3), new dh8("DeviceSettingDescription", 41995, 7), new dh8("SubjectDistanceRange", 41996, 3), new dh8("ImageUniqueID", 42016, 2), new dh8("CameraOwnerName", 42032, 2), new dh8("BodySerialNumber", 42033, 2), new dh8("LensSpecification", 42034, 5), new dh8("LensMake", 42035, 2), new dh8("LensModel", 42036, 2), new dh8("Gamma", 42240, 5), new dh8("DNGVersion", 50706, 1), new dh8(50720, 3, 4, "DefaultCropSize")};
        dh8[] dh8VarArr3 = {new dh8("GPSVersionID", 0, 1), new dh8("GPSLatitudeRef", 1, 2), new dh8(2, 5, 10, "GPSLatitude"), new dh8("GPSLongitudeRef", 3, 2), new dh8(4, 5, 10, "GPSLongitude"), new dh8("GPSAltitudeRef", 5, 1), new dh8("GPSAltitude", 6, 5), new dh8("GPSTimeStamp", 7, 5), new dh8("GPSSatellites", 8, 2), new dh8("GPSStatus", 9, 2), new dh8("GPSMeasureMode", 10, 2), new dh8("GPSDOP", 11, 5), new dh8("GPSSpeedRef", 12, 2), new dh8("GPSSpeed", 13, 5), new dh8("GPSTrackRef", 14, 2), new dh8("GPSTrack", 15, 5), new dh8("GPSImgDirectionRef", 16, 2), new dh8("GPSImgDirection", 17, 5), new dh8("GPSMapDatum", 18, 2), new dh8("GPSDestLatitudeRef", 19, 2), new dh8("GPSDestLatitude", 20, 5), new dh8("GPSDestLongitudeRef", 21, 2), new dh8("GPSDestLongitude", 22, 5), new dh8("GPSDestBearingRef", 23, 2), new dh8("GPSDestBearing", 24, 5), new dh8("GPSDestDistanceRef", 25, 2), new dh8("GPSDestDistance", 26, 5), new dh8("GPSProcessingMethod", 27, 7), new dh8("GPSAreaInformation", 28, 7), new dh8("GPSDateStamp", 29, 2), new dh8("GPSDifferential", 30, 3), new dh8("GPSHPositioningError", 31, 5)};
        dh8[] dh8VarArr4 = {new dh8("InteroperabilityIndex", 1, 2)};
        dh8[] dh8VarArr5 = {new dh8("NewSubfileType", 254, 4), new dh8("SubfileType", 255, 4), new dh8(NotificationCompat.FLAG_LOCAL_ONLY, 3, 4, "ThumbnailImageWidth"), new dh8(257, 3, 4, "ThumbnailImageLength"), new dh8("BitsPerSample", 258, 3), new dh8("Compression", 259, 3), new dh8("PhotometricInterpretation", 262, 3), new dh8("ImageDescription", 270, 2), new dh8("Make", 271, 2), new dh8("Model", 272, 2), new dh8(273, 3, 4, "StripOffsets"), new dh8("ThumbnailOrientation", 274, 3), new dh8("SamplesPerPixel", 277, 3), new dh8(278, 3, 4, "RowsPerStrip"), new dh8(279, 3, 4, "StripByteCounts"), new dh8("XResolution", 282, 5), new dh8("YResolution", 283, 5), new dh8("PlanarConfiguration", 284, 3), new dh8("ResolutionUnit", 296, 3), new dh8("TransferFunction", pd.e1, 3), new dh8("Software", 305, 2), new dh8("DateTime", 306, 2), new dh8("Artist", 315, 2), new dh8("WhitePoint", 318, 5), new dh8("PrimaryChromaticities", 319, 5), new dh8("SubIFDPointer", 330, 4), new dh8("JPEGInterchangeFormat", 513, 4), new dh8("JPEGInterchangeFormatLength", 514, 4), new dh8("YCbCrCoefficients", 529, 5), new dh8("YCbCrSubSampling", 530, 3), new dh8("YCbCrPositioning", 531, 3), new dh8("ReferenceBlackWhite", 532, 5), new dh8("Copyright", 33432, 2), new dh8("ExifIFDPointer", 34665, 4), new dh8("GPSInfoIFDPointer", 34853, 4), new dh8("DNGVersion", 50706, 1), new dh8(50720, 3, 4, "DefaultCropSize")};
        W = new dh8("StripOffsets", 273, 3);
        X = new dh8[][]{dh8VarArr, dh8VarArr2, dh8VarArr3, dh8VarArr4, dh8VarArr5, dh8VarArr, new dh8[]{new dh8("ThumbnailImage", NotificationCompat.FLAG_LOCAL_ONLY, 7), new dh8("CameraSettingsIFDPointer", 8224, 4), new dh8("ImageProcessingIFDPointer", 8256, 4)}, new dh8[]{new dh8("PreviewImageStart", 257, 4), new dh8("PreviewImageLength", 258, 4)}, new dh8[]{new dh8("AspectFrame", 4371, 3)}, new dh8[]{new dh8("ColorSpace", 55, 3)}};
        Y = new dh8[]{new dh8("SubIFDPointer", 330, 4), new dh8("ExifIFDPointer", 34665, 4), new dh8("GPSInfoIFDPointer", 34853, 4), new dh8("InteroperabilityIFDPointer", 40965, 4), new dh8("CameraSettingsIFDPointer", 8224, 1), new dh8("ImageProcessingIFDPointer", 8256, 1)};
        Z = new HashMap[10];
        a0 = new HashMap[10];
        b0 = Collections.unmodifiableSet(new HashSet(Arrays.asList("FNumber", "DigitalZoomRatio", "ExposureTime", "SubjectDistance")));
        c0 = new HashMap();
        Charset charsetForName = Charset.forName("US-ASCII");
        d0 = charsetForName;
        e0 = "Exif\u0000\u0000".getBytes(charsetForName);
        f0 = "http://ns.adobe.com/xap/1.0/\u0000".getBytes(charsetForName);
        Locale locale = Locale.US;
        new SimpleDateFormat("yyyy:MM:dd HH:mm:ss", locale).setTimeZone(TimeZone.getTimeZone("UTC"));
        new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", locale).setTimeZone(TimeZone.getTimeZone("UTC"));
        int i = 0;
        while (true) {
            dh8[][] dh8VarArr6 = X;
            if (i >= dh8VarArr6.length) {
                HashMap map = c0;
                dh8[] dh8VarArr7 = Y;
                map.put(Integer.valueOf(dh8VarArr7[0].a), 5);
                map.put(Integer.valueOf(dh8VarArr7[1].a), 1);
                map.put(Integer.valueOf(dh8VarArr7[2].a), 2);
                map.put(Integer.valueOf(dh8VarArr7[3].a), 3);
                map.put(Integer.valueOf(dh8VarArr7[4].a), 7);
                map.put(Integer.valueOf(dh8VarArr7[5].a), 8);
                Pattern.compile(".*[1-9].*");
                g0 = Pattern.compile("^(\\d{2}):(\\d{2}):(\\d{2})$");
                h0 = Pattern.compile("^(\\d{4}):(\\d{2}):(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
                i0 = Pattern.compile("^(\\d{4})-(\\d{2})-(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
                return;
            }
            Z[i] = new HashMap();
            a0[i] = new HashMap();
            for (dh8 dh8Var : dh8VarArr6[i]) {
                Z[i].put(Integer.valueOf(dh8Var.a), dh8Var);
                a0[i].put(dh8Var.b, dh8Var);
            }
            i++;
        }
    }

    public gh8(FileDescriptor fileDescriptor) throws Throwable {
        boolean z2;
        dh8[][] dh8VarArr = X;
        this.f = new HashMap[dh8VarArr.length];
        this.g = new HashSet(dh8VarArr.length);
        this.h = ByteOrder.BIG_ENDIAN;
        FileInputStream fileInputStream = null;
        if (fileDescriptor == null) {
            t3p.q("fileDescriptor cannot be null");
            throw null;
        }
        this.c = null;
        this.a = null;
        try {
            Os.lseek(fileDescriptor, 0L, OsConstants.SEEK_CUR);
            this.b = fileDescriptor;
            try {
                fileDescriptor = Os.dup(fileDescriptor);
                z2 = true;
            } catch (Exception e) {
                throw new IOException("Failed to duplicate file descriptor", e);
            }
        } catch (Exception unused) {
            this.b = null;
            z2 = false;
        }
        try {
            FileInputStream fileInputStream2 = new FileInputStream(fileDescriptor);
            try {
                t(fileInputStream2);
                j14.u(fileInputStream2);
                if (z2) {
                    try {
                        Os.close(fileDescriptor);
                    } catch (ErrnoException unused2) {
                    }
                }
            } catch (Throwable th) {
                th = th;
                fileInputStream = fileInputStream2;
                j14.u(fileInputStream);
                if (z2) {
                    try {
                        Os.close(fileDescriptor);
                    } catch (ErrnoException unused3) {
                    }
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public gh8(InputStream inputStream) throws Throwable {
        dh8[][] dh8VarArr = X;
        this.f = new HashMap[dh8VarArr.length];
        this.g = new HashSet(dh8VarArr.length);
        this.h = ByteOrder.BIG_ENDIAN;
        if (inputStream == null) {
            t3p.q("inputStream cannot be null");
            throw null;
        }
        this.a = null;
        this.e = false;
        if (inputStream instanceof AssetManager.AssetInputStream) {
            this.c = (AssetManager.AssetInputStream) inputStream;
            this.b = null;
        } else if (inputStream instanceof FileInputStream) {
            FileInputStream fileInputStream = (FileInputStream) inputStream;
            try {
                Os.lseek(fileInputStream.getFD(), 0L, OsConstants.SEEK_CUR);
                this.c = null;
                this.b = fileInputStream.getFD();
            } catch (Exception unused) {
            }
        } else {
            this.c = null;
            this.b = null;
        }
        t(inputStream);
    }

    public gh8(String str) throws Throwable {
        boolean z2;
        dh8[][] dh8VarArr = X;
        this.f = new HashMap[dh8VarArr.length];
        this.g = new HashSet(dh8VarArr.length);
        this.h = ByteOrder.BIG_ENDIAN;
        FileInputStream fileInputStream = null;
        if (str == null) {
            t3p.q("filename cannot be null");
            throw null;
        }
        this.c = null;
        this.a = str;
        try {
            FileInputStream fileInputStream2 = new FileInputStream(str);
            try {
                try {
                    Os.lseek(fileInputStream2.getFD(), 0L, OsConstants.SEEK_CUR);
                    z2 = true;
                } catch (Exception unused) {
                    z2 = false;
                }
                if (z2) {
                    this.b = fileInputStream2.getFD();
                } else {
                    this.b = null;
                }
                t(fileInputStream2);
                j14.u(fileInputStream2);
            } catch (Throwable th) {
                th = th;
                fileInputStream = fileInputStream2;
                j14.u(fileInputStream);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public static double b(String str, String str2) {
        try {
            String[] strArrSplit = str.split(",", -1);
            String[] strArrSplit2 = strArrSplit[0].split("/", -1);
            double d = Double.parseDouble(strArrSplit2[0].trim()) / Double.parseDouble(strArrSplit2[1].trim());
            String[] strArrSplit3 = strArrSplit[1].split("/", -1);
            double d2 = Double.parseDouble(strArrSplit3[0].trim()) / Double.parseDouble(strArrSplit3[1].trim());
            String[] strArrSplit4 = strArrSplit[2].split("/", -1);
            double d3 = ((Double.parseDouble(strArrSplit4[0].trim()) / Double.parseDouble(strArrSplit4[1].trim())) / 3600.0d) + (d2 / 60.0d) + d;
            if (str2.equals("S") || str2.equals("W")) {
                return -d3;
            }
            if (str2.equals("N") || str2.equals("E")) {
                return d3;
            }
            throw new IllegalArgumentException();
        } catch (ArrayIndexOutOfBoundsException | NumberFormatException e) {
            t3p.n(e);
            return 0.0d;
        }
    }

    public static Pair q(String str) throws NumberFormatException {
        if (!str.contains(",")) {
            if (!str.contains("/")) {
                try {
                    try {
                        long j = Long.parseLong(str);
                        return (j < 0 || j > 65535) ? j < 0 ? new Pair(9, -1) : new Pair(4, -1) : new Pair(3, 4);
                    } catch (NumberFormatException unused) {
                        Double.parseDouble(str);
                        return new Pair(12, -1);
                    }
                } catch (NumberFormatException unused2) {
                    return new Pair(2, -1);
                }
            }
            String[] strArrSplit = str.split("/", -1);
            if (strArrSplit.length == 2) {
                try {
                    long j2 = (long) Double.parseDouble(strArrSplit[0]);
                    long j3 = (long) Double.parseDouble(strArrSplit[1]);
                    return (j2 < 0 || j3 < 0) ? new Pair(10, -1) : (j2 > 2147483647L || j3 > 2147483647L) ? new Pair(5, -1) : new Pair(10, 5);
                } catch (NumberFormatException unused3) {
                }
            }
            return new Pair(2, -1);
        }
        String[] strArrSplit2 = str.split(",", -1);
        Pair pairQ = q(strArrSplit2[0]);
        if (((Integer) pairQ.first).intValue() == 2) {
            return pairQ;
        }
        for (int i = 1; i < strArrSplit2.length; i++) {
            Pair pairQ2 = q(strArrSplit2[i]);
            int iIntValue = (((Integer) pairQ2.first).equals(pairQ.first) || ((Integer) pairQ2.second).equals(pairQ.first)) ? ((Integer) pairQ.first).intValue() : -1;
            int iIntValue2 = (((Integer) pairQ.second).intValue() == -1 || !(((Integer) pairQ2.first).equals(pairQ.second) || ((Integer) pairQ2.second).equals(pairQ.second))) ? -1 : ((Integer) pairQ.second).intValue();
            if (iIntValue == -1 && iIntValue2 == -1) {
                return new Pair(2, -1);
            }
            if (iIntValue == -1) {
                pairQ = new Pair(Integer.valueOf(iIntValue2), -1);
            } else if (iIntValue2 == -1) {
                pairQ = new Pair(Integer.valueOf(iIntValue), -1);
            }
        }
        return pairQ;
    }

    public static ByteOrder w(bh8 bh8Var) throws IOException {
        short s = bh8Var.readShort();
        if (s == 18761) {
            return ByteOrder.LITTLE_ENDIAN;
        }
        if (s == 19789) {
            return ByteOrder.BIG_ENDIAN;
        }
        t3p.p(Integer.toHexString(s), "Invalid byte order: ");
        return null;
    }

    public final void A(int i, String str, String str2) {
        HashMap[] mapArr = this.f;
        if (mapArr[i].isEmpty() || mapArr[i].get(str) == null) {
            return;
        }
        HashMap map = mapArr[i];
        map.put(str2, (ch8) map.get(str));
        mapArr[i].remove(str);
    }

    /* JADX WARN: Removed duplicated region for block: B:69:0x00d4 A[Catch: all -> 0x00f9, Exception -> 0x00fd, TRY_ENTER, TryCatch #18 {Exception -> 0x00fd, all -> 0x00f9, blocks: (B:69:0x00d4, B:71:0x00e6, B:70:0x00db), top: B:131:0x00d2 }] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00db A[Catch: all -> 0x00f9, Exception -> 0x00fd, TryCatch #18 {Exception -> 0x00fd, all -> 0x00f9, blocks: (B:69:0x00d4, B:71:0x00e6, B:70:0x00db), top: B:131:0x00d2 }] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x012c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void B() throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 337
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gh8.B():void");
    }

    public final void C(BufferedInputStream bufferedInputStream, BufferedOutputStream bufferedOutputStream) throws IOException {
        byte b;
        if (v) {
            Objects.toString(bufferedInputStream);
            Objects.toString(bufferedOutputStream);
        }
        bh8 bh8Var = new bh8(bufferedInputStream);
        z34 z34Var = new z34(bufferedOutputStream, ByteOrder.BIG_ENDIAN);
        if (bh8Var.readByte() != -1) {
            s49.m("Invalid marker");
            return;
        }
        z34Var.h(-1);
        if (bh8Var.readByte() != -40) {
            s49.m("Invalid marker");
            return;
        }
        z34Var.h(-40);
        z34Var.h(-1);
        z34Var.h(-31);
        this.p = K(z34Var);
        ch8 ch8Var = this.t;
        byte[] bArr = f0;
        if (ch8Var != null) {
            z34Var.write(-1);
            z34Var.h(-31);
            z34Var.n(bArr.length + 2 + this.t.d.length);
            z34Var.write(bArr);
            z34Var.write(this.t.d);
            this.u = true;
        }
        byte[] bArr2 = new byte[4096];
        while (bh8Var.readByte() == -1) {
            do {
                b = bh8Var.readByte();
            } while (b == -1);
            if (b == -39 || b == -38) {
                z34Var.h(-1);
                z34Var.h(b);
                j14.A(bh8Var, z34Var);
                return;
            }
            if (b != -31) {
                z34Var.h(-1);
                z34Var.h(b);
                int unsignedShort = bh8Var.readUnsignedShort();
                z34Var.n(unsignedShort);
                int i = unsignedShort - 2;
                if (i < 0) {
                    s49.m("Invalid length");
                    return;
                }
                while (i > 0) {
                    int i2 = bh8Var.read(bArr2, 0, Math.min(i, 4096));
                    if (i2 >= 0) {
                        z34Var.write(bArr2, 0, i2);
                        i -= i2;
                    }
                }
            } else {
                int unsignedShort2 = bh8Var.readUnsignedShort();
                int length = unsignedShort2 - 2;
                if (length < 0) {
                    s49.m("Invalid length");
                    return;
                }
                int length2 = bArr.length;
                byte[] bArr3 = e0;
                byte[] bArr4 = length >= length2 ? new byte[bArr.length] : length >= bArr3.length ? new byte[bArr3.length] : null;
                if (bArr4 != null) {
                    bh8Var.readFully(bArr4);
                    if (j14.l0(bArr4, bArr3) || j14.l0(bArr4, bArr)) {
                        bh8Var.h(length - bArr4.length);
                    }
                }
                z34Var.h(-1);
                z34Var.h(b);
                z34Var.n(unsignedShort2);
                if (bArr4 != null) {
                    length -= bArr4.length;
                    z34Var.write(bArr4);
                }
                while (length > 0) {
                    int i3 = bh8Var.read(bArr2, 0, Math.min(length, 4096));
                    if (i3 >= 0) {
                        z34Var.write(bArr2, 0, i3);
                        length -= i3;
                    }
                }
            }
        }
        s49.m("Invalid marker");
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0029 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x005c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x003c A[SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x005a -> B:10:0x0027). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void D(java.io.BufferedInputStream r9, java.io.BufferedOutputStream r10) {
        /*
            r8 = this;
            boolean r0 = defpackage.gh8.v
            if (r0 == 0) goto La
            java.util.Objects.toString(r9)
            java.util.Objects.toString(r10)
        La:
            bh8 r0 = new bh8
            r0.<init>(r9)
            z34 r9 = new z34
            java.nio.ByteOrder r1 = java.nio.ByteOrder.BIG_ENDIAN
            r9.<init>(r10, r1)
            byte[] r10 = defpackage.gh8.I
            int r10 = r10.length
            defpackage.j14.z(r0, r9, r10)
            ch8 r10 = r8.t
            r1 = 1
            r2 = 0
            if (r10 != 0) goto L26
            boolean r10 = r8.u
            if (r10 == 0) goto L5a
        L26:
            r10 = r1
        L27:
            if (r1 != 0) goto L2f
            if (r10 != 0) goto L2f
            defpackage.j14.A(r0, r9)
            return
        L2f:
            int r3 = r0.readInt()
            int r4 = r0.readInt()
            r5 = 1229472850(0x49484452, float:820293.1)
            if (r4 != r5) goto L5c
            r9.k(r3)
            r9.k(r4)
            int r3 = r3 + 4
            defpackage.j14.z(r0, r9, r3)
            int r3 = r8.p
            if (r3 != 0) goto L4f
            r8.L(r9)
            r1 = r2
        L4f:
            ch8 r3 = r8.t
            if (r3 == 0) goto L27
            boolean r3 = r8.u
            if (r3 != 0) goto L27
            r8.M(r9)
        L5a:
            r10 = r2
            goto L27
        L5c:
            r5 = 1700284774(0x65584966, float:6.383657E22)
            if (r4 != r5) goto L6d
            if (r1 == 0) goto L6d
            r8.L(r9)
            int r3 = r3 + 4
            r0.h(r3)
            r1 = r2
            goto L27
        L6d:
            r5 = 1767135348(0x69545874, float:1.6044374E25)
            if (r4 != r5) goto L9f
            byte[] r5 = defpackage.gh8.J
            int r6 = r5.length
            if (r3 < r6) goto L9f
            int r6 = r5.length
            byte[] r7 = new byte[r6]
            r0.readFully(r7)
            int r6 = r3 - r6
            int r6 = r6 + 4
            boolean r5 = java.util.Arrays.equals(r7, r5)
            if (r5 == 0) goto L92
            ch8 r10 = r8.t
            if (r10 == 0) goto L8e
            r8.M(r9)
        L8e:
            r0.h(r6)
            goto L5a
        L92:
            r9.k(r3)
            r9.k(r4)
            r9.write(r7)
            defpackage.j14.z(r0, r9, r6)
            goto L27
        L9f:
            r9.k(r3)
            r9.k(r4)
            int r3 = r3 + 4
            defpackage.j14.z(r0, r9, r3)
            goto L27
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gh8.D(java.io.BufferedInputStream, java.io.BufferedOutputStream):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:111:0x025c A[Catch: all -> 0x0268, Exception -> 0x026c, TRY_ENTER, TRY_LEAVE, TryCatch #11 {Exception -> 0x026c, all -> 0x0268, blocks: (B:111:0x025c, B:101:0x0223, B:106:0x0235), top: B:148:0x003c }] */
    /* JADX WARN: Type inference failed for: r24v0, types: [java.io.BufferedOutputStream, java.io.OutputStream, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r24v1 */
    /* JADX WARN: Type inference failed for: r24v10, types: [java.io.ByteArrayOutputStream] */
    /* JADX WARN: Type inference failed for: r24v13 */
    /* JADX WARN: Type inference failed for: r24v14 */
    /* JADX WARN: Type inference failed for: r24v2 */
    /* JADX WARN: Type inference failed for: r24v4 */
    /* JADX WARN: Type inference failed for: r24v8 */
    /* JADX WARN: Type inference failed for: r24v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void E(java.io.BufferedInputStream r23, java.io.BufferedOutputStream r24) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 670
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gh8.E(java.io.BufferedInputStream, java.io.BufferedOutputStream):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:121:0x0215  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0259  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x02c9  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x030f  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x034d  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0374  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x039b  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x03a8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void F(java.lang.String r30, java.lang.String r31) throws java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 994
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gh8.F(java.lang.String, java.lang.String):void");
    }

    public final void G(bh8 bh8Var) throws Throwable {
        ch8 ch8Var;
        HashMap map = this.f[4];
        ch8 ch8Var2 = (ch8) map.get("Compression");
        if (ch8Var2 == null) {
            this.o = 6;
            r(bh8Var, map);
            return;
        }
        int i = ch8Var2.i(this.h);
        this.o = i;
        if (i != 1) {
            if (i == 6) {
                r(bh8Var, map);
                return;
            } else if (i != 7) {
                return;
            }
        }
        ch8 ch8Var3 = (ch8) map.get("BitsPerSample");
        if (ch8Var3 != null) {
            int[] iArr = (int[]) ch8Var3.k(this.h);
            int[] iArr2 = y;
            if (!Arrays.equals(iArr2, iArr)) {
                if (this.d != 3 || (ch8Var = (ch8) map.get("PhotometricInterpretation")) == null) {
                    return;
                }
                int i2 = ch8Var.i(this.h);
                if ((i2 != 1 || !Arrays.equals(iArr, z)) && (i2 != 6 || !Arrays.equals(iArr, iArr2))) {
                    return;
                }
            }
            ch8 ch8Var4 = (ch8) map.get("StripOffsets");
            ch8 ch8Var5 = (ch8) map.get("StripByteCounts");
            if (ch8Var4 == null || ch8Var5 == null) {
                return;
            }
            long[] jArrY = j14.y(ch8Var4.k(this.h));
            long[] jArrY2 = j14.y(ch8Var5.k(this.h));
            if (jArrY == null || jArrY.length == 0 || jArrY2 == null || jArrY2.length == 0 || jArrY.length != jArrY2.length) {
                return;
            }
            long j = 0;
            for (long j2 : jArrY2) {
                j += j2;
            }
            int i3 = (int) j;
            byte[] bArr = new byte[i3];
            this.k = true;
            this.j = true;
            this.i = true;
            int i4 = 0;
            int i5 = 0;
            for (int i6 = 0; i6 < jArrY.length; i6++) {
                int i7 = (int) jArrY[i6];
                int i8 = (int) jArrY2[i6];
                if (i6 < jArrY.length - 1 && i7 + i8 != jArrY[i6 + 1]) {
                    this.k = false;
                }
                int i9 = i7 - i4;
                if (i9 < 0) {
                    return;
                }
                try {
                    bh8Var.h(i9);
                    int i10 = i4 + i9;
                    byte[] bArr2 = new byte[i8];
                    bh8Var.readFully(bArr2);
                    i4 = i10 + i8;
                    System.arraycopy(bArr2, 0, bArr, i5, i8);
                    i5 += i8;
                } catch (EOFException unused) {
                    return;
                }
            }
            this.n = bArr;
            if (this.k) {
                this.l = (int) jArrY[0];
                this.m = i3;
            }
        }
    }

    public final void H(int i, int i2) throws Throwable {
        HashMap[] mapArr = this.f;
        if (mapArr[i].isEmpty() || mapArr[i2].isEmpty()) {
            return;
        }
        ch8 ch8Var = (ch8) mapArr[i].get("ImageLength");
        ch8 ch8Var2 = (ch8) mapArr[i].get("ImageWidth");
        ch8 ch8Var3 = (ch8) mapArr[i2].get("ImageLength");
        ch8 ch8Var4 = (ch8) mapArr[i2].get("ImageWidth");
        if (ch8Var == null || ch8Var2 == null || ch8Var3 == null || ch8Var4 == null) {
            return;
        }
        int i3 = ch8Var.i(this.h);
        int i4 = ch8Var2.i(this.h);
        int i5 = ch8Var3.i(this.h);
        int i6 = ch8Var4.i(this.h);
        if (i3 >= i5 || i4 >= i6) {
            return;
        }
        HashMap map = mapArr[i];
        mapArr[i] = mapArr[i2];
        mapArr[i2] = map;
    }

    public final void I(fh8 fh8Var, int i) throws Throwable {
        ch8 ch8VarF;
        ch8 ch8VarF2;
        HashMap[] mapArr = this.f;
        ch8 ch8Var = (ch8) mapArr[i].get("DefaultCropSize");
        ch8 ch8Var2 = (ch8) mapArr[i].get("SensorTopBorder");
        ch8 ch8Var3 = (ch8) mapArr[i].get("SensorLeftBorder");
        ch8 ch8Var4 = (ch8) mapArr[i].get("SensorBottomBorder");
        ch8 ch8Var5 = (ch8) mapArr[i].get("SensorRightBorder");
        if (ch8Var != null) {
            int i2 = ch8Var.a;
            ByteOrder byteOrder = this.h;
            if (i2 == 5) {
                eh8[] eh8VarArr = (eh8[]) ch8Var.k(byteOrder);
                if (eh8VarArr == null || eh8VarArr.length != 2) {
                    Arrays.toString(eh8VarArr);
                    return;
                }
                ch8VarF = ch8.e(new eh8[]{eh8VarArr[0]}, this.h);
                ch8VarF2 = ch8.e(new eh8[]{eh8VarArr[1]}, this.h);
            } else {
                int[] iArr = (int[]) ch8Var.k(byteOrder);
                if (iArr == null || iArr.length != 2) {
                    Arrays.toString(iArr);
                    return;
                } else {
                    ch8VarF = ch8.f(iArr[0], this.h);
                    ch8VarF2 = ch8.f(iArr[1], this.h);
                }
            }
            mapArr[i].put("ImageWidth", ch8VarF);
            mapArr[i].put("ImageLength", ch8VarF2);
            return;
        }
        if (ch8Var2 != null && ch8Var3 != null && ch8Var4 != null && ch8Var5 != null) {
            int i3 = ch8Var2.i(this.h);
            int i4 = ch8Var4.i(this.h);
            int i5 = ch8Var5.i(this.h);
            int i6 = ch8Var3.i(this.h);
            if (i4 <= i3 || i5 <= i6) {
                return;
            }
            ch8 ch8VarF3 = ch8.f(i4 - i3, this.h);
            ch8 ch8VarF4 = ch8.f(i5 - i6, this.h);
            mapArr[i].put("ImageLength", ch8VarF3);
            mapArr[i].put("ImageWidth", ch8VarF4);
            return;
        }
        ch8 ch8Var6 = (ch8) mapArr[i].get("ImageLength");
        ch8 ch8Var7 = (ch8) mapArr[i].get("ImageWidth");
        if (ch8Var6 == null || ch8Var7 == null) {
            ch8 ch8Var8 = (ch8) mapArr[i].get("JPEGInterchangeFormat");
            ch8 ch8Var9 = (ch8) mapArr[i].get("JPEGInterchangeFormatLength");
            if (ch8Var8 == null || ch8Var9 == null) {
                return;
            }
            int i7 = ch8Var8.i(this.h);
            int i8 = ch8Var8.i(this.h);
            fh8Var.k(i7);
            byte[] bArr = new byte[i8];
            fh8Var.readFully(bArr);
            g(new bh8(bArr), i7, i);
        }
    }

    public final void J() throws Throwable {
        H(0, 5);
        H(0, 4);
        H(5, 4);
        HashMap[] mapArr = this.f;
        ch8 ch8Var = (ch8) mapArr[1].get("PixelXDimension");
        ch8 ch8Var2 = (ch8) mapArr[1].get("PixelYDimension");
        if (ch8Var != null && ch8Var2 != null) {
            mapArr[0].put("ImageWidth", ch8Var);
            mapArr[0].put("ImageLength", ch8Var2);
        }
        if (mapArr[4].isEmpty() && s(mapArr[5])) {
            mapArr[4] = mapArr[5];
            mapArr[5] = new HashMap();
        }
        s(mapArr[4]);
        A(0, "ThumbnailOrientation", "Orientation");
        A(0, "ThumbnailImageLength", "ImageLength");
        A(0, "ThumbnailImageWidth", "ImageWidth");
        A(5, "ThumbnailOrientation", "Orientation");
        A(5, "ThumbnailImageLength", "ImageLength");
        A(5, "ThumbnailImageWidth", "ImageWidth");
        A(4, "Orientation", "ThumbnailOrientation");
        A(4, "ImageLength", "ThumbnailImageLength");
        A(4, "ImageWidth", "ThumbnailImageWidth");
    }

    public final int K(z34 z34Var) throws IOException {
        HashMap[] mapArr;
        int i;
        int i2;
        char c;
        char c2;
        int[] iArr;
        int i3;
        dh8[][] dh8VarArr = X;
        int[] iArr2 = new int[dh8VarArr.length];
        int[] iArr3 = new int[dh8VarArr.length];
        dh8[] dh8VarArr2 = Y;
        for (dh8 dh8Var : dh8VarArr2) {
            z(dh8Var.b);
        }
        if (this.i) {
            if (this.j) {
                z("StripOffsets");
                z("StripByteCounts");
            } else {
                z("JPEGInterchangeFormat");
                z("JPEGInterchangeFormatLength");
            }
        }
        int i4 = 0;
        while (true) {
            int length = dh8VarArr.length;
            mapArr = this.f;
            if (i4 >= length) {
                break;
            }
            Iterator it = mapArr[i4].entrySet().iterator();
            while (it.hasNext()) {
                if (((Map.Entry) it.next()).getValue() == null) {
                    it.remove();
                }
            }
            i4++;
        }
        if (mapArr[1].isEmpty()) {
            i = 1;
            i2 = 0;
        } else {
            i = 1;
            i2 = 0;
            mapArr[0].put(dh8VarArr2[1].b, ch8.c(0L, this.h));
        }
        if (mapArr[2].isEmpty()) {
            c = 2;
        } else {
            c = 2;
            mapArr[i2].put(dh8VarArr2[2].b, ch8.c(0L, this.h));
        }
        if (mapArr[3].isEmpty()) {
            c2 = 3;
        } else {
            c2 = 3;
            mapArr[i].put(dh8VarArr2[3].b, ch8.c(0L, this.h));
        }
        int i5 = 4;
        if (this.i) {
            if (this.j) {
                mapArr[4].put("StripOffsets", ch8.f(i2, this.h));
                mapArr[4].put("StripByteCounts", ch8.f(this.m, this.h));
            } else {
                mapArr[4].put("JPEGInterchangeFormat", ch8.c(0L, this.h));
                mapArr[4].put("JPEGInterchangeFormatLength", ch8.c(this.m, this.h));
            }
        }
        int i6 = 0;
        while (true) {
            int length2 = dh8VarArr.length;
            iArr = U;
            if (i6 >= length2) {
                break;
            }
            Iterator it2 = mapArr[i6].entrySet().iterator();
            int i7 = 0;
            while (it2.hasNext()) {
                ch8 ch8Var = (ch8) ((Map.Entry) it2.next()).getValue();
                ch8Var.getClass();
                int i8 = iArr[ch8Var.a] * ch8Var.b;
                if (i8 > 4) {
                    i7 += i8;
                }
            }
            iArr3[i6] = iArr3[i6] + i7;
            i6++;
        }
        int size = 8;
        for (int i9 = 0; i9 < dh8VarArr.length; i9++) {
            if (!mapArr[i9].isEmpty()) {
                iArr2[i9] = size;
                size = (mapArr[i9].size() * 12) + 6 + iArr3[i9] + size;
            }
        }
        if (this.i) {
            if (this.j) {
                mapArr[4].put("StripOffsets", ch8.f(size, this.h));
            } else {
                mapArr[4].put("JPEGInterchangeFormat", ch8.c(size, this.h));
            }
            this.l = size;
            size += this.m;
        }
        if (this.d == 4) {
            size += 8;
        }
        if (v) {
            for (int i10 = 0; i10 < dh8VarArr.length; i10++) {
                String.format("index: %d, offsets: %d, tag count: %d, data sizes: %d, total size: %d", Integer.valueOf(i10), Integer.valueOf(iArr2[i10]), Integer.valueOf(mapArr[i10].size()), Integer.valueOf(iArr3[i10]), Integer.valueOf(size));
            }
        }
        if (!mapArr[i].isEmpty()) {
            mapArr[0].put(dh8VarArr2[i].b, ch8.c(iArr2[i], this.h));
        }
        if (!mapArr[c].isEmpty()) {
            mapArr[0].put(dh8VarArr2[c].b, ch8.c(iArr2[c], this.h));
        }
        if (!mapArr[c2].isEmpty()) {
            mapArr[i].put(dh8VarArr2[c2].b, ch8.c(iArr2[c2], this.h));
        }
        int i11 = this.d;
        if (i11 == 4) {
            if (size > 65535) {
                qp2.n(p3p.i(size, "Size of exif data (", " bytes) exceeds the max size of a JPEG APP1 segment (65536 bytes)"));
                return 0;
            }
            z34Var.n(size);
            z34Var.write(e0);
        } else if (i11 == 13) {
            z34Var.k(size);
            z34Var.k(1700284774);
        } else if (i11 == 14) {
            z34Var.write(M);
            z34Var.k(size);
        }
        int size2 = ((DataOutputStream) z34Var.c).size();
        z34Var.l(this.h == ByteOrder.BIG_ENDIAN ? (short) 19789 : (short) 18761);
        z34Var.b = this.h;
        z34Var.n(42);
        z34Var.m(8L);
        int i12 = 0;
        while (i12 < dh8VarArr.length) {
            if (mapArr[i12].isEmpty()) {
                i3 = i5;
            } else {
                z34Var.n(mapArr[i12].size());
                int size3 = (mapArr[i12].size() * 12) + iArr2[i12] + 2 + i5;
                for (Map.Entry entry : mapArr[i12].entrySet()) {
                    char c3 = ((dh8) a0[i12].get(entry.getKey())).a;
                    ch8 ch8Var2 = (ch8) entry.getValue();
                    ch8Var2.getClass();
                    int i13 = ch8Var2.b;
                    int i14 = ch8Var2.a;
                    int i15 = iArr[i14] * i13;
                    z34Var.n(c3);
                    z34Var.n(i14);
                    z34Var.k(i13);
                    if (i15 > 4) {
                        z34Var.m(size3);
                        size3 += i15;
                    } else {
                        z34Var.write(ch8Var2.d);
                        if (i15 < 4) {
                            while (i15 < 4) {
                                z34Var.h(0);
                                i15++;
                            }
                        }
                    }
                    i5 = 4;
                }
                int i16 = i5;
                if (i12 != 0 || mapArr[i16].isEmpty()) {
                    z34Var.m(0L);
                } else {
                    z34Var.m(iArr2[i16]);
                }
                Iterator it3 = mapArr[i12].entrySet().iterator();
                while (it3.hasNext()) {
                    byte[] bArr = ((ch8) ((Map.Entry) it3.next()).getValue()).d;
                    if (bArr.length > 4) {
                        z34Var.write(bArr, 0, bArr.length);
                    }
                }
                i3 = 4;
            }
            i12++;
            i5 = i3;
        }
        if (this.i) {
            z34Var.write(o());
        }
        if (this.d == 14 && size % 2 == i) {
            z34Var.h(0);
        }
        z34Var.b = ByteOrder.BIG_ENDIAN;
        return size2;
    }

    public final void L(z34 z34Var) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        this.p = ((DataOutputStream) z34Var.c).size() + K(new z34(byteArrayOutputStream, ByteOrder.BIG_ENDIAN));
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        z34Var.write(byteArray);
        CRC32 crc32 = new CRC32();
        crc32.update(byteArray, 4, byteArray.length - 4);
        z34Var.k((int) crc32.getValue());
    }

    public final void M(z34 z34Var) throws IOException {
        z34Var.k(this.t.d.length + 22);
        CRC32 crc32 = new CRC32();
        z34Var.k(1767135348);
        crc32.update(pd.W0);
        crc32.update(26964);
        crc32.update(6902872);
        crc32.update(1767135348);
        byte[] bArr = J;
        z34Var.write(bArr);
        crc32.update(bArr);
        z34Var.write(this.t.d);
        crc32.update(this.t.d);
        z34Var.k((int) crc32.getValue());
        this.u = true;
    }

    public final void a() {
        String strC = c("DateTimeOriginal");
        HashMap[] mapArr = this.f;
        if (strC != null && c("DateTime") == null) {
            mapArr[0].put("DateTime", ch8.b(strC));
        }
        if (c("ImageWidth") == null) {
            mapArr[0].put("ImageWidth", ch8.c(0L, this.h));
        }
        if (c("ImageLength") == null) {
            mapArr[0].put("ImageLength", ch8.c(0L, this.h));
        }
        if (c("Orientation") == null) {
            mapArr[0].put("Orientation", ch8.c(0L, this.h));
        }
        if (c("LightSource") == null) {
            mapArr[1].put("LightSource", ch8.c(0L, this.h));
        }
    }

    public final String c(String str) {
        if (str == null) {
            t3p.q("tag shouldn't be null");
            return null;
        }
        ch8 ch8VarE = e(str);
        if (ch8VarE != null) {
            if (str.equals("GPSTimeStamp")) {
                int i = ch8VarE.a;
                if (i == 5 || i == 10) {
                    eh8[] eh8VarArr = (eh8[]) ch8VarE.k(this.h);
                    if (eh8VarArr == null || eh8VarArr.length != 3) {
                        Arrays.toString(eh8VarArr);
                        return null;
                    }
                    eh8 eh8Var = eh8VarArr[0];
                    Integer numValueOf = Integer.valueOf((int) (eh8Var.a / eh8Var.b));
                    eh8 eh8Var2 = eh8VarArr[1];
                    Integer numValueOf2 = Integer.valueOf((int) (eh8Var2.a / eh8Var2.b));
                    eh8 eh8Var3 = eh8VarArr[2];
                    return String.format("%02d:%02d:%02d", numValueOf, numValueOf2, Integer.valueOf((int) (eh8Var3.a / eh8Var3.b)));
                }
            } else {
                if (!b0.contains(str)) {
                    return ch8VarE.j(this.h);
                }
                try {
                    return Double.toString(ch8VarE.h(this.h));
                } catch (NumberFormatException unused) {
                }
            }
        }
        return null;
    }

    public final int d(int i, String str) {
        ch8 ch8VarE = e(str);
        if (ch8VarE != null) {
            try {
                return ch8VarE.i(this.h);
            } catch (NumberFormatException unused) {
            }
        }
        return i;
    }

    public final ch8 e(String str) {
        ch8 ch8Var;
        int i;
        ch8 ch8Var2;
        if (str == null) {
            t3p.q("tag shouldn't be null");
            return null;
        }
        if ("ISOSpeedRatings".equals(str)) {
            str = "PhotographicSensitivity";
        }
        if ("Xmp".equals(str) && (i = this.d) != 4 && ((i == 9 || i == 15 || i == 12 || i == 13) && (ch8Var2 = this.t) != null)) {
            return ch8Var2;
        }
        for (int i2 = 0; i2 < X.length; i2++) {
            ch8 ch8Var3 = (ch8) this.f[i2].get(str);
            if (ch8Var3 != null) {
                return ch8Var3;
            }
        }
        if (!"Xmp".equals(str) || (ch8Var = this.t) == null) {
            return null;
        }
        return ch8Var;
    }

    public final void f(fh8 fh8Var, int i) throws IOException {
        String strExtractMetadata;
        String strExtractMetadata2;
        String strExtractMetadata3;
        if (i == 15 && Build.VERSION.SDK_INT < 31) {
            yt7.k("Reading EXIF from AVIF files is supported from SDK 31 and above");
            return;
        }
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        try {
            try {
                mediaMetadataRetriever.setDataSource(new ah8(fh8Var));
                String strExtractMetadata4 = mediaMetadataRetriever.extractMetadata(33);
                String strExtractMetadata5 = mediaMetadataRetriever.extractMetadata(34);
                String strExtractMetadata6 = mediaMetadataRetriever.extractMetadata(26);
                String strExtractMetadata7 = mediaMetadataRetriever.extractMetadata(17);
                if ("yes".equals(strExtractMetadata6)) {
                    strExtractMetadata = mediaMetadataRetriever.extractMetadata(29);
                    strExtractMetadata3 = mediaMetadataRetriever.extractMetadata(30);
                    strExtractMetadata2 = mediaMetadataRetriever.extractMetadata(31);
                } else if ("yes".equals(strExtractMetadata7)) {
                    strExtractMetadata = mediaMetadataRetriever.extractMetadata(18);
                    strExtractMetadata3 = mediaMetadataRetriever.extractMetadata(19);
                    strExtractMetadata2 = mediaMetadataRetriever.extractMetadata(24);
                } else {
                    strExtractMetadata = null;
                    strExtractMetadata2 = null;
                    strExtractMetadata3 = null;
                }
                HashMap[] mapArr = this.f;
                if (strExtractMetadata != null) {
                    mapArr[0].put("ImageWidth", ch8.f(Integer.parseInt(strExtractMetadata), this.h));
                }
                if (strExtractMetadata3 != null) {
                    mapArr[0].put("ImageLength", ch8.f(Integer.parseInt(strExtractMetadata3), this.h));
                }
                if (strExtractMetadata2 != null) {
                    int i2 = Integer.parseInt(strExtractMetadata2);
                    mapArr[0].put("Orientation", ch8.f(i2 != 90 ? i2 != 180 ? i2 != 270 ? 1 : 8 : 3 : 6, this.h));
                }
                if (strExtractMetadata4 != null && strExtractMetadata5 != null) {
                    int i3 = Integer.parseInt(strExtractMetadata4);
                    int i4 = Integer.parseInt(strExtractMetadata5);
                    if (i4 <= 6) {
                        throw new IOException("Invalid exif length");
                    }
                    fh8Var.k(i3);
                    byte[] bArr = new byte[6];
                    fh8Var.readFully(bArr);
                    int i5 = i3 + 6;
                    int i6 = i4 - 6;
                    if (!Arrays.equals(bArr, e0)) {
                        throw new IOException("Invalid identifier");
                    }
                    byte[] bArr2 = new byte[i6];
                    fh8Var.readFully(bArr2);
                    this.p = i5;
                    x(0, bArr2);
                }
                String strExtractMetadata8 = mediaMetadataRetriever.extractMetadata(41);
                String strExtractMetadata9 = mediaMetadataRetriever.extractMetadata(42);
                if (strExtractMetadata8 != null && strExtractMetadata9 != null) {
                    int i7 = Integer.parseInt(strExtractMetadata8);
                    int i8 = Integer.parseInt(strExtractMetadata9);
                    long j = i7;
                    fh8Var.k(j);
                    byte[] bArr3 = new byte[i8];
                    fh8Var.readFully(bArr3);
                    this.t = new ch8(j, bArr3, 1, i8);
                    this.u = true;
                }
                try {
                    mediaMetadataRetriever.release();
                } catch (IOException unused) {
                }
            } catch (RuntimeException e) {
                throw new UnsupportedOperationException("Failed to read EXIF from HEIF file. Given stream is either malformed or unsupported.", e);
            }
        } finally {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:55:0x0108, code lost:
    
        r19.c = r18.h;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x010c, code lost:
    
        return;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:24:0x0050. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:25:0x0053. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:26:0x0056. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:29:0x005e A[FALL_THROUGH] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00fa A[LOOP:0: B:10:0x0023->B:50:0x00fa, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0100 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void g(defpackage.bh8 r19, int r20, int r21) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 346
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gh8.g(bh8, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x014c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:110:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x00e5 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:156:0x011c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00e4 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x011a A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int h(java.io.BufferedInputStream r20) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 405
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gh8.h(java.io.BufferedInputStream):int");
    }

    public final void i(fh8 fh8Var) throws Throwable {
        int i;
        int i2;
        l(fh8Var);
        HashMap[] mapArr = this.f;
        ch8 ch8Var = (ch8) mapArr[1].get("MakerNote");
        if (ch8Var != null) {
            fh8 fh8Var2 = new fh8(ch8Var.d);
            fh8Var2.c = this.h;
            byte[] bArr = G;
            byte[] bArr2 = new byte[bArr.length];
            fh8Var2.readFully(bArr2);
            fh8Var2.k(0L);
            byte[] bArr3 = H;
            byte[] bArr4 = new byte[bArr3.length];
            fh8Var2.readFully(bArr4);
            if (Arrays.equals(bArr2, bArr)) {
                fh8Var2.k(8L);
            } else if (Arrays.equals(bArr4, bArr3)) {
                fh8Var2.k(12L);
            }
            y(fh8Var2, 6);
            ch8 ch8Var2 = (ch8) mapArr[7].get("PreviewImageStart");
            ch8 ch8Var3 = (ch8) mapArr[7].get("PreviewImageLength");
            if (ch8Var2 != null && ch8Var3 != null) {
                mapArr[5].put("JPEGInterchangeFormat", ch8Var2);
                mapArr[5].put("JPEGInterchangeFormatLength", ch8Var3);
            }
            ch8 ch8Var4 = (ch8) mapArr[8].get("AspectFrame");
            if (ch8Var4 != null) {
                int[] iArr = (int[]) ch8Var4.k(this.h);
                if (iArr == null || iArr.length != 4) {
                    Arrays.toString(iArr);
                    return;
                }
                int i3 = iArr[2];
                int i4 = iArr[0];
                if (i3 <= i4 || (i = iArr[3]) <= (i2 = iArr[1])) {
                    return;
                }
                int i5 = (i3 - i4) + 1;
                int i6 = (i - i2) + 1;
                if (i5 < i6) {
                    int i7 = i5 + i6;
                    i6 = i7 - i6;
                    i5 = i7 - i6;
                }
                ch8 ch8VarF = ch8.f(i5, this.h);
                ch8 ch8VarF2 = ch8.f(i6, this.h);
                mapArr[0].put("ImageWidth", ch8VarF);
                mapArr[0].put("ImageLength", ch8VarF2);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0043, code lost:
    
        r18.u = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0045, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void j(defpackage.bh8 r19) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 236
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gh8.j(bh8):void");
    }

    public final void k(bh8 bh8Var) throws Throwable {
        if (v) {
            Objects.toString(bh8Var);
        }
        bh8Var.h(84);
        byte[] bArr = new byte[4];
        byte[] bArr2 = new byte[4];
        byte[] bArr3 = new byte[4];
        bh8Var.readFully(bArr);
        bh8Var.readFully(bArr2);
        bh8Var.readFully(bArr3);
        int i = ByteBuffer.wrap(bArr).getInt();
        int i2 = ByteBuffer.wrap(bArr2).getInt();
        int i3 = ByteBuffer.wrap(bArr3).getInt();
        byte[] bArr4 = new byte[i2];
        bh8Var.h(i - bh8Var.b);
        bh8Var.readFully(bArr4);
        g(new bh8(bArr4), i, 5);
        bh8Var.h(i3 - bh8Var.b);
        bh8Var.c = ByteOrder.BIG_ENDIAN;
        int i4 = bh8Var.readInt();
        for (int i5 = 0; i5 < i4; i5++) {
            int unsignedShort = bh8Var.readUnsignedShort();
            int unsignedShort2 = bh8Var.readUnsignedShort();
            if (unsignedShort == W.a) {
                short s = bh8Var.readShort();
                short s2 = bh8Var.readShort();
                ch8 ch8VarF = ch8.f(s, this.h);
                ch8 ch8VarF2 = ch8.f(s2, this.h);
                HashMap[] mapArr = this.f;
                mapArr[0].put("ImageLength", ch8VarF);
                mapArr[0].put("ImageWidth", ch8VarF2);
                return;
            }
            bh8Var.h(unsignedShort2);
        }
    }

    public final void l(fh8 fh8Var) throws Throwable {
        u(fh8Var);
        y(fh8Var, 0);
        I(fh8Var, 0);
        I(fh8Var, 5);
        I(fh8Var, 4);
        J();
        if (this.d == 8) {
            HashMap[] mapArr = this.f;
            ch8 ch8Var = (ch8) mapArr[1].get("MakerNote");
            if (ch8Var != null) {
                fh8 fh8Var2 = new fh8(ch8Var.d);
                fh8Var2.c = this.h;
                fh8Var2.h(6);
                y(fh8Var2, 9);
                ch8 ch8Var2 = (ch8) mapArr[9].get("ColorSpace");
                if (ch8Var2 != null) {
                    mapArr[1].put("ColorSpace", ch8Var2);
                }
            }
        }
    }

    public final void m(fh8 fh8Var) throws Throwable {
        if (v) {
            Objects.toString(fh8Var);
        }
        l(fh8Var);
        HashMap[] mapArr = this.f;
        ch8 ch8Var = (ch8) mapArr[0].get("JpgFromRaw");
        if (ch8Var != null) {
            g(new bh8(ch8Var.d), (int) ch8Var.c, 5);
        }
        ch8 ch8Var2 = (ch8) mapArr[0].get("ISO");
        ch8 ch8Var3 = (ch8) mapArr[1].get("PhotographicSensitivity");
        if (ch8Var2 == null || ch8Var3 != null) {
            return;
        }
        mapArr[1].put("PhotographicSensitivity", ch8Var2);
    }

    public final boolean n(fh8 fh8Var) throws IOException {
        byte[] bArr = e0;
        byte[] bArr2 = new byte[bArr.length];
        fh8Var.readFully(bArr2);
        if (!Arrays.equals(bArr2, bArr)) {
            return false;
        }
        byte[] bArrCopyOf = new byte[1024];
        int i = 0;
        while (true) {
            if (i == bArrCopyOf.length) {
                bArrCopyOf = Arrays.copyOf(bArrCopyOf, bArrCopyOf.length << 1);
            }
            int i2 = fh8Var.a.read(bArrCopyOf, i, bArrCopyOf.length - i);
            if (i2 == -1) {
                byte[] bArrCopyOf2 = Arrays.copyOf(bArrCopyOf, i);
                this.p = bArr.length;
                x(0, bArrCopyOf2);
                return true;
            }
            i += i2;
            fh8Var.b += i2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x005e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x007c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0071 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final byte[] o() throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r7.i
            r1 = 0
            if (r0 == 0) goto L7f
            byte[] r0 = r7.n
            if (r0 == 0) goto La
            return r0
        La:
            android.content.res.AssetManager$AssetInputStream r0 = r7.c     // Catch: java.lang.Throwable -> L6a java.lang.Exception -> L75
            if (r0 == 0) goto L23
            boolean r2 = r0.markSupported()     // Catch: java.lang.Throwable -> L1d java.lang.Exception -> L21
            if (r2 == 0) goto L19
            r0.reset()     // Catch: java.lang.Throwable -> L1d java.lang.Exception -> L21
        L17:
            r2 = r1
            goto L43
        L19:
            defpackage.j14.u(r0)
            return r1
        L1d:
            r7 = move-exception
            r2 = r1
        L1f:
            r1 = r0
            goto L6c
        L21:
            r2 = r1
            goto L77
        L23:
            java.lang.String r0 = r7.a
            if (r0 == 0) goto L2e
            java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L6a java.lang.Exception -> L75
            r2.<init>(r0)     // Catch: java.lang.Throwable -> L6a java.lang.Exception -> L75
            r0 = r2
            goto L17
        L2e:
            java.io.FileDescriptor r0 = r7.b     // Catch: java.lang.Throwable -> L6a java.lang.Exception -> L75
            java.io.FileDescriptor r0 = android.system.Os.dup(r0)     // Catch: java.lang.Throwable -> L6a java.lang.Exception -> L75
            int r2 = android.system.OsConstants.SEEK_SET     // Catch: java.lang.Throwable -> L64 java.lang.Exception -> L67
            r3 = 0
            android.system.Os.lseek(r0, r3, r2)     // Catch: java.lang.Throwable -> L64 java.lang.Exception -> L67
            java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L64 java.lang.Exception -> L67
            r2.<init>(r0)     // Catch: java.lang.Throwable -> L64 java.lang.Exception -> L67
            r6 = r2
            r2 = r0
            r0 = r6
        L43:
            bh8 r3 = new bh8     // Catch: java.lang.Throwable -> L62 java.lang.Exception -> L77
            r3.<init>(r0)     // Catch: java.lang.Throwable -> L62 java.lang.Exception -> L77
            int r4 = r7.l     // Catch: java.lang.Throwable -> L62 java.lang.Exception -> L77
            int r5 = r7.p     // Catch: java.lang.Throwable -> L62 java.lang.Exception -> L77
            int r4 = r4 + r5
            r3.h(r4)     // Catch: java.lang.Throwable -> L62 java.lang.Exception -> L77
            int r4 = r7.m     // Catch: java.lang.Throwable -> L62 java.lang.Exception -> L77
            byte[] r4 = new byte[r4]     // Catch: java.lang.Throwable -> L62 java.lang.Exception -> L77
            r3.readFully(r4)     // Catch: java.lang.Throwable -> L62 java.lang.Exception -> L77
            r7.n = r4     // Catch: java.lang.Throwable -> L62 java.lang.Exception -> L77
            defpackage.j14.u(r0)
            if (r2 == 0) goto L61
            android.system.Os.close(r2)     // Catch: android.system.ErrnoException -> L61
        L61:
            return r4
        L62:
            r7 = move-exception
            goto L1f
        L64:
            r7 = move-exception
            r2 = r0
            goto L6c
        L67:
            r2 = r0
            r0 = r1
            goto L77
        L6a:
            r7 = move-exception
            r2 = r1
        L6c:
            defpackage.j14.u(r1)
            if (r2 == 0) goto L74
            android.system.Os.close(r2)     // Catch: android.system.ErrnoException -> L74
        L74:
            throw r7
        L75:
            r0 = r1
            r2 = r0
        L77:
            defpackage.j14.u(r0)
            if (r2 == 0) goto L7f
            android.system.Os.close(r2)     // Catch: android.system.ErrnoException -> L7f
        L7f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gh8.o():byte[]");
    }

    public final void p(bh8 bh8Var) throws Throwable {
        if (v) {
            Objects.toString(bh8Var);
        }
        bh8Var.c = ByteOrder.LITTLE_ENDIAN;
        bh8Var.h(K.length);
        int i = bh8Var.readInt() + 8;
        byte[] bArr = L;
        bh8Var.h(bArr.length);
        int length = bArr.length + 8;
        while (true) {
            try {
                byte[] bArr2 = new byte[4];
                bh8Var.readFully(bArr2);
                int i2 = bh8Var.readInt();
                int i3 = length + 8;
                if (Arrays.equals(M, bArr2)) {
                    byte[] bArrCopyOfRange = new byte[i2];
                    bh8Var.readFully(bArrCopyOfRange);
                    byte[] bArr3 = e0;
                    if (j14.l0(bArrCopyOfRange, bArr3)) {
                        bArrCopyOfRange = Arrays.copyOfRange(bArrCopyOfRange, bArr3.length, i2);
                    }
                    this.p = i3;
                    x(0, bArrCopyOfRange);
                    G(new bh8(bArrCopyOfRange));
                    return;
                }
                if (i2 % 2 == 1) {
                    i2++;
                }
                length = i3 + i2;
                if (length == i) {
                    return;
                }
                if (length > i) {
                    throw new IOException("Encountered WebP file with invalid chunk size");
                }
                bh8Var.h(i2);
            } catch (EOFException e) {
                throw new IOException("Encountered corrupt WebP file.", e);
            }
        }
    }

    public final void r(bh8 bh8Var, HashMap map) throws Throwable {
        ch8 ch8Var = (ch8) map.get("JPEGInterchangeFormat");
        ch8 ch8Var2 = (ch8) map.get("JPEGInterchangeFormatLength");
        if (ch8Var == null || ch8Var2 == null) {
            return;
        }
        int i = ch8Var.i(this.h);
        int i2 = ch8Var2.i(this.h);
        if (this.d == 7) {
            i += this.q;
        }
        if (i <= 0 || i2 <= 0) {
            return;
        }
        this.i = true;
        if (this.a == null && this.c == null && this.b == null) {
            byte[] bArr = new byte[i2];
            bh8Var.h(i);
            bh8Var.readFully(bArr);
            this.n = bArr;
        }
        this.l = i;
        this.m = i2;
    }

    public final boolean s(HashMap map) {
        ch8 ch8Var = (ch8) map.get("ImageLength");
        ch8 ch8Var2 = (ch8) map.get("ImageWidth");
        if (ch8Var == null || ch8Var2 == null) {
            return false;
        }
        return ch8Var.i(this.h) <= 512 && ch8Var2.i(this.h) <= 512;
    }

    public final void t(InputStream inputStream) throws Throwable {
        boolean z2 = v;
        for (int i = 0; i < X.length; i++) {
            try {
                try {
                    this.f[i] = new HashMap();
                } catch (IOException | UnsupportedOperationException unused) {
                    if (z2) {
                        return;
                    } else {
                        return;
                    }
                }
            } finally {
                a();
                if (z2) {
                    v();
                }
            }
        }
        boolean z3 = this.e;
        if (!z3) {
            BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream, 5000);
            this.d = h(bufferedInputStream);
            inputStream = bufferedInputStream;
        }
        int i2 = this.d;
        if (i2 == 4 || i2 == 9 || i2 == 13 || i2 == 14) {
            bh8 bh8Var = new bh8(inputStream);
            int i3 = this.d;
            if (i3 == 4) {
                g(bh8Var, 0, 0);
            } else if (i3 == 13) {
                j(bh8Var);
            } else if (i3 == 9) {
                k(bh8Var);
            } else if (i3 == 14) {
                p(bh8Var);
            }
        } else {
            fh8 fh8Var = new fh8(inputStream);
            if (!z3) {
                int i4 = this.d;
                if (i4 == 12 || i4 == 15) {
                    f(fh8Var, i4);
                } else if (i4 == 7) {
                    i(fh8Var);
                } else if (i4 == 10) {
                    m(fh8Var);
                } else {
                    l(fh8Var);
                }
            } else if (!n(fh8Var)) {
                a();
                if (!z2) {
                    return;
                }
                v();
            }
            fh8Var.k(this.p);
            G(fh8Var);
        }
        a();
        if (!z2) {
            return;
        }
        v();
    }

    public final void u(fh8 fh8Var) throws IOException {
        ByteOrder byteOrderW = w(fh8Var);
        this.h = byteOrderW;
        fh8Var.c = byteOrderW;
        int unsignedShort = fh8Var.readUnsignedShort();
        int i = this.d;
        if (i != 7 && i != 10 && unsignedShort != 42) {
            t3p.p(Integer.toHexString(unsignedShort), "Invalid start code: ");
            return;
        }
        int i2 = fh8Var.readInt();
        if (i2 < 8) {
            s49.m(sko.i(i2, "Invalid first Ifd offset: "));
            return;
        }
        int i3 = i2 - 8;
        if (i3 > 0) {
            fh8Var.h(i3);
        }
    }

    public final void v() throws Throwable {
        int i = 0;
        while (true) {
            HashMap[] mapArr = this.f;
            if (i >= mapArr.length) {
                return;
            }
            mapArr[i].size();
            for (Map.Entry entry : mapArr[i].entrySet()) {
                ch8 ch8Var = (ch8) entry.getValue();
                ch8Var.toString();
                ch8Var.j(this.h);
            }
            i++;
        }
    }

    public final void x(int i, byte[] bArr) throws IOException {
        fh8 fh8Var = new fh8(bArr);
        u(fh8Var);
        y(fh8Var, i);
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x018f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void y(defpackage.fh8 r27, int r28) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 635
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gh8.y(fh8, int):void");
    }

    public final void z(String str) {
        for (int i = 0; i < X.length; i++) {
            this.f[i].remove(str);
        }
    }
}
