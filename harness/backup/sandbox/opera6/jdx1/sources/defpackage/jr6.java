package defpackage;

import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;

/* loaded from: classes.dex */
public final class jr6 implements rxa {
    public static final byte[] a = "Exif\u0000\u0000".getBytes(Charset.forName("UTF-8"));
    public static final int[] b = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8};

    public static ImageHeaderParser$ImageType d(ir6 ir6Var) {
        try {
            int iA = ir6Var.a();
            if (iA == 65496) {
                return ImageHeaderParser$ImageType.JPEG;
            }
            int iK = (iA << 8) | ir6Var.k();
            if (iK == 4671814) {
                return ImageHeaderParser$ImageType.GIF;
            }
            int iK2 = (iK << 8) | ir6Var.k();
            if (iK2 == -1991225785) {
                ir6Var.skip(21L);
                try {
                    return ir6Var.k() >= 3 ? ImageHeaderParser$ImageType.PNG_A : ImageHeaderParser$ImageType.PNG;
                } catch (hr6 unused) {
                    return ImageHeaderParser$ImageType.PNG;
                }
            }
            if (iK2 != 1380533830) {
                return ImageHeaderParser$ImageType.UNKNOWN;
            }
            ir6Var.skip(4L);
            if (((ir6Var.a() << 16) | ir6Var.a()) != 1464156752) {
                return ImageHeaderParser$ImageType.UNKNOWN;
            }
            int iA2 = (ir6Var.a() << 16) | ir6Var.a();
            if ((iA2 & (-256)) != 1448097792) {
                return ImageHeaderParser$ImageType.UNKNOWN;
            }
            int i = iA2 & 255;
            if (i == 88) {
                ir6Var.skip(4L);
                return (ir6Var.k() & 16) != 0 ? ImageHeaderParser$ImageType.WEBP_A : ImageHeaderParser$ImageType.WEBP;
            }
            if (i != 76) {
                return ImageHeaderParser$ImageType.WEBP;
            }
            ir6Var.skip(4L);
            return (ir6Var.k() & 8) != 0 ? ImageHeaderParser$ImageType.WEBP_A : ImageHeaderParser$ImageType.WEBP;
        } catch (hr6 unused2) {
            return ImageHeaderParser$ImageType.UNKNOWN;
        }
    }

    public static int e(tw2 tw2Var, byte[] bArr, int i) throws hr6 {
        int i2;
        int i3;
        int i4 = 0;
        int i5 = 0;
        while (i4 < i && (i5 = ((InputStream) tw2Var.b).read(bArr, i4, i - i4)) != -1) {
            i4 += i5;
        }
        if (i4 == 0 && i5 == -1) {
            throw new hr6();
        }
        if (i4 == i) {
            byte[] bArr2 = a;
            boolean z = bArr != null && i > bArr2.length;
            if (z) {
                int i6 = 0;
                while (true) {
                    if (i6 >= bArr2.length) {
                        break;
                    }
                    if (bArr[i6] != bArr2[i6]) {
                        z = false;
                        break;
                    }
                    i6++;
                }
            }
            if (z) {
                ByteBuffer byteBuffer = (ByteBuffer) ByteBuffer.wrap(bArr).order(ByteOrder.BIG_ENDIAN).limit(i);
                short s = byteBuffer.remaining() - 6 >= 2 ? byteBuffer.getShort(6) : (short) -1;
                byteBuffer.order(s != 18761 ? s != 19789 ? ByteOrder.BIG_ENDIAN : ByteOrder.BIG_ENDIAN : ByteOrder.LITTLE_ENDIAN);
                int i7 = byteBuffer.remaining() - 10 >= 4 ? byteBuffer.getInt(10) : -1;
                int i8 = i7 + 6;
                short s2 = byteBuffer.remaining() - i8 >= 2 ? byteBuffer.getShort(i8) : (short) -1;
                for (int i9 = 0; i9 < s2; i9++) {
                    int i10 = (i9 * 12) + i7 + 8;
                    if ((byteBuffer.remaining() - i10 >= 2 ? byteBuffer.getShort(i10) : (short) -1) == 274) {
                        int i11 = i10 + 2;
                        short s3 = byteBuffer.remaining() - i11 >= 2 ? byteBuffer.getShort(i11) : (short) -1;
                        if (s3 >= 1 && s3 <= 12) {
                            int i12 = i10 + 4;
                            int i13 = byteBuffer.remaining() - i12 >= 4 ? byteBuffer.getInt(i12) : -1;
                            if (i13 >= 0 && (i2 = i13 + b[s3]) <= 4 && (i3 = i10 + 8) >= 0 && i3 <= byteBuffer.remaining() && i2 >= 0 && i2 + i3 <= byteBuffer.remaining()) {
                                if (byteBuffer.remaining() - i3 >= 2) {
                                    return byteBuffer.getShort(i3);
                                }
                                return -1;
                            }
                        }
                    }
                }
            }
        }
        return -1;
    }

    @Override // defpackage.rxa
    public final int a(InputStream inputStream, jl6 jl6Var) {
        int iA;
        short sK;
        qyn.l(inputStream, "Argument must not be null");
        tw2 tw2Var = new tw2(inputStream, (byte) 29);
        try {
            int iA2 = tw2Var.a();
            if ((iA2 & 65496) == 65496 || iA2 == 19789 || iA2 == 18761) {
                while (tw2Var.k() == 255 && (sK = tw2Var.k()) != 218 && sK != 217) {
                    iA = tw2Var.a() - 2;
                    if (sK == 225) {
                        break;
                    }
                    long j = iA;
                    if (tw2Var.skip(j) != j) {
                        break;
                    }
                }
                iA = -1;
                if (iA != -1) {
                    byte[] bArr = (byte[]) jl6Var.i(byte[].class, iA);
                    try {
                        return e(tw2Var, bArr, iA);
                    } finally {
                        jl6Var.o(bArr);
                    }
                }
            }
        } catch (hr6 unused) {
        }
        return -1;
    }

    @Override // defpackage.rxa
    public final ImageHeaderParser$ImageType b(ByteBuffer byteBuffer) {
        return d(new h34((byte) 1, byteBuffer));
    }

    @Override // defpackage.rxa
    public final ImageHeaderParser$ImageType c(InputStream inputStream) {
        qyn.l(inputStream, "Argument must not be null");
        return d(new tw2(inputStream, (byte) 29));
    }
}
