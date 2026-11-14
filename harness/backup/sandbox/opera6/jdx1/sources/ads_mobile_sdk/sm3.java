package ads_mobile_sdk;

import defpackage.dgp;
import defpackage.ocp;

/* loaded from: classes.dex */
public abstract class sm3 {
    public static final ocp a;

    static {
        a = qe.b() ? new ocp((byte) 0) : System.getenv("PROTOBUF_FORCE_MOBILE_UTF8_PROCESSOR_FOR_TESTING") != null ? new ocp((byte) 0) : qm3.a != null ? new qm3((byte) 1) : new ocp((byte) 1);
    }

    public static int a(String str, int i) throws dgp {
        int length = str.length();
        int i2 = 0;
        while (i < length) {
            char cCharAt = str.charAt(i);
            if (cCharAt < 2048) {
                i2 += (127 - cCharAt) >>> 31;
            } else {
                i2 += 2;
                if (55296 <= cCharAt && cCharAt <= 57343) {
                    if (Character.codePointAt(str, i) < 65536) {
                        throw new dgp(sko.h(i, length, "Unpaired surrogate at index ", " of "));
                    }
                    i++;
                }
            }
            i++;
        }
        return i2;
    }

    public static boolean b(int i, int i2, byte[] bArr) {
        while (i < i2) {
            if (bArr[i] < 0) {
                while (i < i2) {
                    int i3 = i + 1;
                    byte b = bArr[i];
                    if (b >= 0) {
                        i = i3;
                    } else if (b < -32) {
                        if (i3 >= i2 || b < -62) {
                            return false;
                        }
                        i += 2;
                        if (bArr[i3] > -65) {
                            return false;
                        }
                    } else if (b < -16) {
                        if (i3 >= i2 - 1) {
                            return false;
                        }
                        int i4 = i + 2;
                        byte b2 = bArr[i3];
                        if (b2 > -65) {
                            return false;
                        }
                        if (b == -32 && b2 < -96) {
                            return false;
                        }
                        if (b == -19 && b2 >= -96) {
                            return false;
                        }
                        i += 3;
                        if (bArr[i4] > -65) {
                            return false;
                        }
                    } else {
                        if (i3 >= i2 - 2) {
                            return false;
                        }
                        int i5 = i + 2;
                        byte b3 = bArr[i3];
                        if (b3 > -65) {
                            return false;
                        }
                        if ((((b3 + 112) + (b << 28)) >> 30) != 0) {
                            return false;
                        }
                        int i6 = i + 3;
                        if (bArr[i5] > -65) {
                            return false;
                        }
                        i += 4;
                        if (bArr[i6] > -65) {
                            return false;
                        }
                    }
                }
                return true;
            }
            i++;
        }
        return true;
    }
}
