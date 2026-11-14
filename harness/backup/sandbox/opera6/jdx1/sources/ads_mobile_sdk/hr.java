package ads_mobile_sdk;

import androidx.core.app.NotificationCompat;
import defpackage.p3p;
import defpackage.z1m;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.Serializable;
import java.nio.charset.StandardCharsets;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Locale;

/* loaded from: classes.dex */
public abstract class hr implements Iterable, Serializable {
    public static final fr b = new fr(yb1.a);
    public static final tmj c;
    public int a = 0;

    static {
        c = qe.b() ? new tmj((byte) 14) : new tmj((byte) 12);
    }

    public static int a(int i, int i2, int i3) {
        int i4 = i2 - i;
        if ((i | i2 | i4 | (i3 - i2)) >= 0) {
            return i4;
        }
        if (i < 0) {
            h9o.u(p3p.i(i, "Beginning index: ", " < 0"));
            return 0;
        }
        if (i2 < i) {
            h9o.u(sko.h(i, i2, "Beginning index larger than ending index: ", ", "));
            return 0;
        }
        h9o.u(sko.h(i2, i3, "End index: ", " >= "));
        return 0;
    }

    public static fr a(int i, int i2, byte[] bArr) {
        try {
            return b(i, i2, bArr);
        } catch (bj1 e) {
            h9o.v("Expected no InvalidProtocolBufferException as data UTF8 validity is not checked.", e);
            return null;
        }
    }

    public static hr a(FileInputStream fileInputStream) throws IOException {
        ArrayList arrayList = new ArrayList();
        int iMin = NotificationCompat.FLAG_LOCAL_ONLY;
        while (true) {
            byte[] bArr = new byte[iMin];
            int i = 0;
            while (i < iMin) {
                int i2 = fileInputStream.read(bArr, i, iMin - i);
                if (i2 == -1) {
                    break;
                }
                i += i2;
            }
            fr frVarA = i == 0 ? null : a(0, i, bArr);
            if (frVarA == null) {
                break;
            }
            arrayList.add(frVarA);
            iMin = Math.min(iMin << 1, 8192);
        }
        int size = arrayList.size();
        return size == 0 ? b : a(arrayList.iterator(), size);
    }

    public static hr a(Iterator it, int i) {
        if (i < 1) {
            Locale locale = Locale.ROOT;
            qp2.o(p3p.i(i, "length (", ") must be >= 1"));
            return null;
        }
        if (i == 1) {
            return (hr) it.next();
        }
        int i2 = i >>> 1;
        hr hrVarA = a(it, i2);
        hr hrVarA2 = a(it, i - i2);
        if (Integer.MAX_VALUE - hrVarA.size() < hrVarA2.size()) {
            qp2.o(sko.h(hrVarA.size(), hrVarA2.size(), "ByteString would be too long: ", "+"));
            return null;
        }
        if (hrVarA2.size() == 0) {
            return hrVarA;
        }
        if (hrVarA.size() == 0) {
            return hrVarA2;
        }
        int size = hrVarA2.size() + hrVarA.size();
        fr frVar = b;
        if (size < 128) {
            int size2 = hrVarA.size();
            int size3 = hrVarA2.size();
            int i3 = size2 + size3;
            byte[] bArr = new byte[i3];
            a(0, size2, hrVarA.size());
            a(0, size2, i3);
            if (size2 > 0) {
                hrVarA.a(0, 0, size2, bArr);
            }
            a(0, size3, hrVarA2.size());
            a(size2, i3, i3);
            if (size3 > 0) {
                hrVarA2.a(0, size2, size3, bArr);
            }
            if (i3 == 0) {
                return frVar;
            }
            try {
                return new fr(bArr);
            } catch (bj1 e) {
                h9o.v("Expected no InvalidProtocolBufferException as data UTF8 validity is not checked.", e);
                return null;
            }
        }
        if (hrVarA instanceof zx2) {
            zx2 zx2Var = (zx2) hrVarA;
            hr hrVar = zx2Var.e;
            hr hrVar2 = zx2Var.f;
            if (hrVarA2.size() + hrVar2.size() < 128) {
                int size4 = hrVar2.size();
                int size5 = hrVarA2.size();
                int i4 = size4 + size5;
                byte[] bArr2 = new byte[i4];
                a(0, size4, hrVar2.size());
                a(0, size4, i4);
                if (size4 > 0) {
                    hrVar2.a(0, 0, size4, bArr2);
                }
                a(0, size5, hrVarA2.size());
                a(size4, i4, i4);
                if (size5 > 0) {
                    hrVarA2.a(0, size4, size5, bArr2);
                }
                if (i4 != 0) {
                    try {
                        frVar = new fr(bArr2);
                    } catch (bj1 e2) {
                        h9o.v("Expected no InvalidProtocolBufferException as data UTF8 validity is not checked.", e2);
                        return null;
                    }
                }
                return new zx2(hrVar, frVar);
            }
            if (hrVar.a() > hrVar2.a() && zx2Var.h > hrVarA2.a()) {
                return new zx2(hrVar, new zx2(hrVar2, hrVarA2));
            }
        }
        if (size >= zx2.c(Math.max(hrVarA.a(), hrVarA2.a()) + 1)) {
            return new zx2(hrVarA, hrVarA2);
        }
        gt3 gt3Var = new gt3((byte) 1);
        gt3Var.a(hrVarA);
        gt3Var.a(hrVarA2);
        ArrayDeque arrayDeque = gt3Var.a;
        hr zx2Var2 = (hr) arrayDeque.pop();
        while (!arrayDeque.isEmpty()) {
            zx2Var2 = new zx2((hr) arrayDeque.pop(), zx2Var2);
        }
        return zx2Var2;
    }

    public static boolean a(byte[] bArr, int i, byte[] bArr2, int i2, int i3) {
        int i4 = i + i3;
        a(i, i4, bArr.length);
        a(i2, i3 + i2, bArr2.length);
        while (i < i4) {
            if (bArr[i] != bArr2[i2]) {
                return false;
            }
            i++;
            i2++;
        }
        return true;
    }

    public static fr b(int i, int i2, byte[] bArr) {
        byte[] bArrCopyOfRange;
        if (i2 == 0) {
            return b;
        }
        a(i, i + i2, bArr.length);
        switch (c.a) {
            case 12:
                bArrCopyOfRange = Arrays.copyOfRange(bArr, i, i2 + i);
                break;
            default:
                bArrCopyOfRange = new byte[i2];
                System.arraycopy(bArr, i, bArrCopyOfRange, 0, i2);
                break;
        }
        return new fr(bArrCopyOfRange);
    }

    public int a() {
        return 0;
    }

    public abstract hr a(int i, int i2);

    /* renamed from: a, reason: collision with other method in class */
    public String mo2a() {
        return new String(c(), StandardCharsets.ISO_8859_1);
    }

    public abstract void a(int i, int i2, int i3, byte[] bArr);

    public abstract void a(ov ovVar);

    public abstract byte b(int i);

    public abstract int b(int i, int i2, int i3);

    public abstract hr b(int i, int i2);

    public boolean b() {
        return true;
    }

    public abstract boolean b(hr hrVar);

    public final byte[] c() {
        int size = size();
        if (size == 0) {
            return yb1.a;
        }
        byte[] bArr = new byte[size];
        a(0, 0, size, bArr);
        return bArr;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof hr)) {
            return false;
        }
        hr hrVar = (hr) obj;
        int size = size();
        if (size != hrVar.size()) {
            return false;
        }
        if (size == 0) {
            return true;
        }
        int i = this.a;
        int i2 = hrVar.a;
        if (i == 0 || i2 == 0 || i == i2) {
            return b(hrVar);
        }
        return false;
    }

    public final int hashCode() {
        int iB = this.a;
        if (iB == 0) {
            int size = size();
            iB = b(size, 0, size);
            if (iB == 0) {
                iB = 1;
            }
            this.a = iB;
        }
        return iB;
    }

    public abstract int size();

    public final String toString() {
        String strConcat;
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        int size = size();
        if (size() <= 50) {
            String[] strArr = wc3.a;
            strConcat = wc3.a(c());
        } else {
            hr hrVarB = b(0, 47);
            String[] strArr2 = wc3.a;
            strConcat = wc3.a(hrVarB.c()).concat("...");
        }
        return z1m.l(sko.p(size, "<ByteString@", hexString, " size=", " contents=\""), strConcat, "\">");
    }
}
