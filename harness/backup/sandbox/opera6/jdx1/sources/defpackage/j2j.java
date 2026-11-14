package defpackage;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;

/* loaded from: classes.dex */
public final class j2j implements KSerializer {
    public static final j2j a = new j2j();
    public static final cyg b = xug.a("SerializableContainer", xxg.j);

    public final Object deserialize(Decoder decoder) {
        byte[] bArrCopyOf;
        String strB = decoder.B();
        byte[] bArr = null;
        if (Intrinsics.a(strB, ".")) {
            strB = null;
        }
        if (strB != null) {
            int i = 0;
            if (StringsKt.N(strB)) {
                bArrCopyOf = new byte[0];
            } else {
                int length = strB.length();
                byte[] bArr2 = new byte[length];
                int[] iArr = h87.b;
                int i2 = 0;
                int i3 = 0;
                int i4 = 0;
                int i5 = 0;
                while (i2 < strB.length()) {
                    int i6 = i2 + 1;
                    char cCharAt = strB.charAt(i2);
                    if (Intrinsics.b(cCharAt, 32) > 0) {
                        if (cCharAt == '=') {
                            break;
                        }
                        int i7 = (cCharAt < 0 || cCharAt >= iArr.length) ? -1 : iArr[cCharAt];
                        if (i7 == -1) {
                            throw new IllegalStateException(("Unexpected character " + cCharAt + " (" + ((int) cCharAt) + ")) in " + strB).toString());
                        }
                        i4 = (i4 << 6) | i7;
                        i5++;
                        if (i5 == 4) {
                            bArr2[i3] = (byte) (i4 >> 16);
                            bArr2[i3 + 1] = (byte) ((i4 >> 8) & 255);
                            bArr2[i3 + 2] = (byte) (i4 & 255);
                            i3 += 3;
                            i4 = 0;
                            i5 = 0;
                        }
                    }
                    i2 = i6;
                }
                int i8 = 0;
                while (i2 < strB.length()) {
                    int i9 = i2 + 1;
                    char cCharAt2 = strB.charAt(i2);
                    if (Intrinsics.b(cCharAt2, 32) > 0) {
                        if (cCharAt2 != '=') {
                            qp2.n("Check failed.");
                            return null;
                        }
                        i8++;
                        i4 <<= 6;
                        i5++;
                    }
                    i2 = i9;
                }
                if (i5 == 4) {
                    bArr2[i3] = (byte) (i4 >> 16);
                    bArr2[i3 + 1] = (byte) ((i4 >> 8) & 255);
                    bArr2[i3 + 2] = (byte) (i4 & 255);
                    i3 = (i3 + 3) - i8;
                } else {
                    i = i5;
                }
                if (i != 0) {
                    t14.c(sko.i(i, "buffered: "));
                    return null;
                }
                if (i3 < length) {
                    bArrCopyOf = Arrays.copyOf(bArr2, i3);
                } else {
                    bArr = bArr2;
                }
            }
            bArr = bArrCopyOf;
        }
        return new k2j(bArr);
    }

    public final SerialDescriptor getDescriptor() {
        return b;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void serialize(kotlinx.serialization.encoding.Encoder r8, java.lang.Object r9) {
        /*
            Method dump skipped, instructions count: 195
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.j2j.serialize(kotlinx.serialization.encoding.Encoder, java.lang.Object):void");
    }
}
