package defpackage;

import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.graphics.Bitmap;
import android.graphics.Typeface;
import android.media.MediaMetadataRetriever;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Patterns;
import android.util.Property;
import android.view.View;
import android.view.animation.BaseInterpolator;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.core.app.NotificationCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.TreeMap;
import kotlin.text.c;
import org.chromium.url.GURL;

/* loaded from: classes.dex */
public abstract class dbh {
    public static final boolean A(dil dilVar, boolean z) {
        b2c b2cVarC;
        gbc gbcVar = dilVar.d;
        if (gbcVar == null || (b2cVarC = gbcVar.c()) == null) {
            return false;
        }
        voh vohVarU = rih.u(b2cVarC);
        long j = dilVar.j(z);
        float f = vohVarU.a;
        float f2 = vohVarU.c;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        if (f > fIntBitsToFloat || fIntBitsToFloat > f2) {
            return false;
        }
        float f3 = vohVarU.b;
        float f4 = vohVarU.d;
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        return f3 <= fIntBitsToFloat2 && fIntBitsToFloat2 <= f4;
    }

    public static boolean B(View view) {
        if (view.getVisibility() != 0) {
            return false;
        }
        Object parent = view.getParent();
        if (parent instanceof View) {
            return B((View) parent);
        }
        return true;
    }

    public static void C(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] jArr4 = new long[8];
        v(jArr, jArr2, jArr4);
        F(jArr4, jArr3);
    }

    public static void F(long[] jArr, long[] jArr2) {
        long j = jArr[0];
        long j2 = jArr[1];
        long j3 = jArr[2];
        long j4 = jArr[3];
        long j5 = jArr[4];
        long j6 = jArr[5];
        long j7 = jArr[6];
        long j8 = j5 ^ (j7 >>> 50);
        long j9 = (j4 ^ ((j7 >>> 1) ^ (j7 << 14))) ^ (j6 >>> 50);
        long j10 = j ^ (j8 << 63);
        long j11 = (j2 ^ (j6 << 63)) ^ ((j8 >>> 1) ^ (j8 << 14));
        long j12 = ((j3 ^ (j7 << 63)) ^ ((j6 >>> 1) ^ (j6 << 14))) ^ (j8 >>> 50);
        long j13 = j9 >>> 1;
        jArr2[0] = (j10 ^ j13) ^ (j13 << 15);
        jArr2[1] = j11 ^ (j9 >>> 50);
        jArr2[2] = j12;
        jArr2[3] = j9 & 1;
    }

    public static byte[] G(Object obj, byte[] bArr) throws IOException {
        if (obj instanceof zx2) {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeInt(1111773952);
            dataOutputStream.writeInt(1);
            a26.q0(dataOutputStream, (zx2) obj);
            dataOutputStream.flush();
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            int length = byteArray.length;
            qci qciVar = new qci();
            if (bArr != null) {
                qciVar.g(0, bArr.length, bArr);
            }
            qciVar.g(0, length, byteArray);
            byte[] bArr2 = new byte[32];
            qciVar.e(0, bArr2);
            byte[] bArrV = alo.v(byteArray, bArr2);
            a26.s(bArrV);
            return bArrV;
        }
        if (!(obj instanceof by2)) {
            throw new IllegalArgumentException("unsupported BDS state type: ".concat(obj != null ? obj.getClass().getName() : "null"));
        }
        by2 by2Var = (by2) obj;
        ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
        DataOutputStream dataOutputStream2 = new DataOutputStream(byteArrayOutputStream2);
        dataOutputStream2.writeInt(1111772416);
        dataOutputStream2.writeInt(1);
        dataOutputStream2.writeLong(by2Var.b);
        TreeMap treeMap = by2Var.a;
        if (treeMap.size() > 64) {
            s49.m("too many BDS states");
            return null;
        }
        dataOutputStream2.writeInt(treeMap.size());
        for (Integer num : treeMap.keySet()) {
            dataOutputStream2.writeInt(num.intValue());
            a26.q0(dataOutputStream2, (zx2) treeMap.get(num));
        }
        dataOutputStream2.flush();
        byte[] byteArray2 = byteArrayOutputStream2.toByteArray();
        int length2 = byteArray2.length;
        qci qciVar2 = new qci();
        if (bArr != null) {
            qciVar2.g(0, bArr.length, bArr);
        }
        qciVar2.g(0, length2, byteArray2);
        byte[] bArr3 = new byte[32];
        qciVar2.e(0, bArr3);
        byte[] bArrV2 = alo.v(byteArray2, bArr3);
        a26.s(bArrV2);
        return bArrV2;
    }

    public static void H(long[] jArr, long[] jArr2, int i) {
        long[] jArr3 = new long[8];
        x(jArr, jArr3);
        while (true) {
            F(jArr3, jArr2);
            i--;
            if (i <= 0) {
                return;
            } else {
                x(jArr2, jArr3);
            }
        }
    }

    public static byte[] I(int i, long j) {
        byte[] bArr = new byte[i];
        for (int i2 = i - 1; i2 >= 0; i2--) {
            bArr[i2] = (byte) j;
            j >>>= 8;
        }
        return bArr;
    }

    public static final void a(boolean z, hyh hyhVar, dil dilVar, ih5 ih5Var, int i) {
        ojl ojlVarD;
        vt9 vt9Var = (vt9) ih5Var;
        vt9Var.Y(-1344558920);
        int i2 = i | (vt9Var.d(hyhVar.ordinal()) ? 32 : 16) | (vt9Var.h(dilVar) ? NotificationCompat.FLAG_LOCAL_ONLY : NotificationCompat.FLAG_HIGH_PRIORITY);
        if (vt9Var.N(i2 & 1, (i2 & 147) != 146)) {
            boolean zF = vt9Var.f(dilVar);
            Object objK = vt9Var.K();
            zpa zpaVar = hh5.a;
            if (zF || objK == zpaVar) {
                objK = new ail(dilVar, z);
                vt9Var.g0(objK);
            }
            mgl mglVar = (mgl) objK;
            boolean zH = vt9Var.h(dilVar);
            Object objK2 = vt9Var.K();
            if (zH || objK2 == zpaVar) {
                objK2 = new eil(dilVar, z);
                vt9Var.g0(objK2);
            }
            k9f k9fVar = (k9f) objK2;
            boolean zG = xjl.g(dilVar.l().b);
            int i3 = (int) (z ? dilVar.l().b >> 32 : dilVar.l().b & 4294967295L);
            gbc gbcVar = dilVar.d;
            float fH = 0.0f;
            if (gbcVar != null && (ojlVarD = gbcVar.d()) != null) {
                njl njlVar = ojlVarD.a;
                if (i3 >= 0) {
                    mjl mjlVar = njlVar.a;
                    xbe xbeVar = njlVar.b;
                    if (mjlVar.a.b.length() != 0) {
                        int iMin = Math.min(xbeVar.d(i3), Math.min(xbeVar.b - 1, xbeVar.f - 1));
                        if (i3 <= xbeVar.c(iMin, false)) {
                            xbeVar.m(iMin);
                            ArrayList arrayList = xbeVar.h;
                            tzf tzfVar = (tzf) arrayList.get(sgb.z(iMin, arrayList));
                            fH = tzfVar.a.d.h(iMin - tzfVar.d);
                        }
                    }
                }
            }
            float f = fH;
            boolean zH2 = vt9Var.h(mglVar);
            Object objK3 = vt9Var.K();
            if (zH2 || objK3 == zpaVar) {
                objK3 = new u51(mglVar, (byte) 8);
                vt9Var.g0(objK3);
            }
            scd.h(k9fVar, z, hyhVar, zG, 0L, f, ruk.a(z7e.b, mglVar, (PointerInputEventHandler) objK3), vt9Var, (i2 << 3) & 1008);
        } else {
            vt9Var.Q();
        }
        znh znhVarR = vt9Var.r();
        if (znhVarR != null) {
            znhVarR.d = new q01((byte) 5, i, (Object) hyhVar, (Object) dilVar, z);
        }
    }

    public static Bitmap b(long j, String str) throws IOException, IllegalArgumentException {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
            mediaMetadataRetriever.setDataSource(str);
            try {
                Bitmap frameAtTime = mediaMetadataRetriever.getFrameAtTime(j, 3);
                mediaMetadataRetriever.release();
                return frameAtTime;
            } finally {
            }
        } catch (IOException unused) {
            return null;
        }
    }

    public static LinkedHashMap c(int i) {
        return new LinkedHashMap(i < 3 ? i + 1 : i < 1073741824 ? (int) ((i / 0.75f) + 1.0f) : Integer.MAX_VALUE);
    }

    public static void e(long[] jArr, long[] jArr2, long[] jArr3) {
        jArr3[0] = jArr[0] ^ jArr2[0];
        jArr3[1] = jArr[1] ^ jArr2[1];
        jArr3[2] = jArr[2] ^ jArr2[2];
        jArr3[3] = jArr[3] ^ jArr2[3];
        jArr3[4] = jArr[4] ^ jArr2[4];
        jArr3[5] = jArr[5] ^ jArr2[5];
        jArr3[6] = jArr[6] ^ jArr2[6];
    }

    public static List f(int i) {
        return i == 0 ? Collections.EMPTY_LIST : new ArrayList(i);
    }

    public static long h(int i, byte[] bArr) {
        long j = 0;
        if (bArr == null) {
            t3p.q("in == null");
            return 0L;
        }
        for (int i2 = 0; i2 < i; i2++) {
            j = (j << 8) | (bArr[i2] & 255);
        }
        return j;
    }

    public static final int i(String str, esi esiVar, int i, int i2) {
        int iA = esiVar.a(str);
        if (iA == -1) {
            return LinearLayoutManager.INVALID_OFFSET;
        }
        List list = nqk.a;
        double length = str.length();
        return (int) ((i2 * (((length - iA) * (esiVar.a.length() / length)) / length)) + i);
    }

    public static final int j(String str, esi esiVar, int i, int i2) {
        List list = nqk.a;
        if (!((Boolean) esiVar.c.getValue()).booleanValue()) {
            Iterator it = nqk.a.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                String str2 = (String) it.next();
                if (c.q(str, str2, true)) {
                    str = str.substring(str2.length());
                    break;
                }
            }
        }
        return i(str, esiVar, i, i2);
    }

    public static byte[] l(byte[] bArr) {
        if (bArr == null) {
            t3p.q("in == null");
            return null;
        }
        byte[] bArr2 = new byte[bArr.length];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        return bArr2;
    }

    public static byte[][] m(byte[][] bArr) {
        for (byte[] bArr2 : bArr) {
            if (bArr2 == null) {
                t3p.q("in has null pointers");
                return null;
            }
        }
        byte[][] bArr3 = new byte[bArr.length][];
        for (int i = 0; i < bArr.length; i++) {
            byte[] bArr4 = new byte[bArr[i].length];
            bArr3[i] = bArr4;
            byte[] bArr5 = bArr[i];
            System.arraycopy(bArr5, 0, bArr4, 0, bArr5.length);
        }
        return bArr3;
    }

    public static void n(int i, byte[] bArr, byte[] bArr2) {
        if (bArr2 == null) {
            t3p.q("src == null");
            return;
        }
        if (i < 0) {
            qp2.o("offset hast to be >= 0");
            return;
        }
        if (bArr2.length + i > bArr.length) {
            qp2.o("src length + offset must not be greater than size of destination");
            return;
        }
        for (int i2 = 0; i2 < bArr2.length; i2++) {
            bArr[i + i2] = bArr2[i2];
        }
    }

    public static ObjectAnimator o(View view, k3m k3mVar, int i, int i2, float f, float f2, float f3, float f4, BaseInterpolator baseInterpolator, xpj xpjVar) {
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        if (((int[]) k3mVar.b.getTag(2131364839)) != null) {
            f = (r2[0] - i) + translationX;
            f2 = (r2[1] - i2) + translationY;
        }
        view.setTranslationX(f);
        view.setTranslationY(f2);
        if (f == f3 && f2 == f4) {
            return null;
        }
        ObjectAnimator objectAnimatorOfPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(view, PropertyValuesHolder.ofFloat((Property<?, Float>) View.TRANSLATION_X, f, f3), PropertyValuesHolder.ofFloat((Property<?, Float>) View.TRANSLATION_Y, f2, f4));
        s4m s4mVar = new s4m(view, k3mVar.b, translationX, translationY);
        xpjVar.b(s4mVar);
        objectAnimatorOfPropertyValuesHolder.addListener(s4mVar);
        objectAnimatorOfPropertyValuesHolder.setInterpolator(baseInterpolator);
        return objectAnimatorOfPropertyValuesHolder;
    }

    public static Object p(byte[] bArr, Class cls, byte[] bArr2) throws ClassNotFoundException, IOException {
        if (cls == zx2.class || cls == by2.class) {
            a26.s(bArr);
            int i = 0;
            if (a26.I(1111773952, bArr)) {
                if (cls != zx2.class) {
                    s49.m("unexpected BDS state encoding");
                    return null;
                }
                a26.s(bArr);
                DataInputStream dataInputStream = new DataInputStream(new ByteArrayInputStream(bArr, 0, a26.u(bArr, bArr2)));
                if (dataInputStream.readInt() != 1111773952) {
                    s49.m("unexpected BDS state magic");
                    return null;
                }
                if (dataInputStream.readInt() != 1) {
                    s49.m("unsupported BDS state version");
                    return null;
                }
                zx2 zx2VarF0 = a26.f0(dataInputStream, new fr((byte) 3));
                if (dataInputStream.available() == 0) {
                    return zx2VarF0;
                }
                s49.m("unexpected data at end of BDS state");
                return null;
            }
            if (a26.I(1111772416, bArr)) {
                if (cls != by2.class) {
                    s49.m("unexpected BDS state map encoding");
                    return null;
                }
                a26.s(bArr);
                DataInputStream dataInputStream2 = new DataInputStream(new ByteArrayInputStream(bArr, 0, a26.u(bArr, bArr2)));
                if (dataInputStream2.readInt() != 1111772416) {
                    s49.m("unexpected BDS state magic");
                    return null;
                }
                if (dataInputStream2.readInt() != 1) {
                    s49.m("unsupported BDS state version");
                    return null;
                }
                long j = dataInputStream2.readLong();
                if (j < 0) {
                    s49.m("negative BDS state map maxIndex");
                    return null;
                }
                int iH0 = a26.h0(dataInputStream2, 64, "BDS state map");
                by2 by2Var = new by2(j);
                fr frVar = new fr((byte) 3);
                int i2 = -1;
                while (i < iH0) {
                    int i3 = dataInputStream2.readInt();
                    if (i3 < 0 || i3 <= i2) {
                        s49.m("invalid BDS state map layer");
                        return null;
                    }
                    by2Var.a.put(Integer.valueOf(i3), a26.f0(dataInputStream2, frVar));
                    i++;
                    i2 = i3;
                }
                if (dataInputStream2.available() == 0) {
                    return by2Var;
                }
                s49.m("unexpected data at end of BDS state");
                return null;
            }
        }
        oao oaoVar = new oao(cls, new ByteArrayInputStream(bArr));
        Object object = oaoVar.readObject();
        if (oaoVar.available() != 0) {
            s49.m("unexpected data found at end of ObjectInputStream");
            return null;
        }
        if (cls.isInstance(object)) {
            return object;
        }
        s49.m("unexpected class found in ObjectInputStream");
        return null;
    }

    public static byte[] q(int i, int i2, byte[] bArr) {
        if (bArr == null) {
            t3p.q("src == null");
            return null;
        }
        if (i < 0) {
            qp2.o("offset hast to be >= 0");
            return null;
        }
        if (i2 < 0) {
            qp2.o("length hast to be >= 0");
            return null;
        }
        if (i + i2 > bArr.length) {
            qp2.o("offset + length must not be greater then size of source array");
            return null;
        }
        byte[] bArr2 = new byte[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            bArr2[i3] = bArr[i + i3];
        }
        return bArr2;
    }

    public static String r(String str) {
        GURL gurl = new GURL(str);
        return !gurl.b ? "" : ((gurl.f().equals("http") || gurl.f().equals("https")) && !Patterns.IP_ADDRESS.matcher(gurl.c()).matches()) ? gurl.d().g() : "";
    }

    public static Uri s(String str, String str2) {
        String strR = r(str2);
        return strR.isEmpty() ? Uri.EMPTY : new Uri.Builder().scheme("https").authority(str).path("icon").appendQueryParameter("url", strR).build();
    }

    public static String t(String str, String str2) {
        return s(str, str2).toString();
    }

    public static void u(long[] jArr, long[] jArr2) {
        long j = jArr[0];
        long j2 = jArr[1];
        long j3 = jArr[2];
        long j4 = jArr[3];
        jArr2[0] = j & 562949953421311L;
        jArr2[1] = ((j >>> 49) ^ (j2 << 15)) & 562949953421311L;
        jArr2[2] = ((j2 >>> 34) ^ (j3 << 30)) & 562949953421311L;
        jArr2[3] = (j3 >>> 19) ^ (j4 << 45);
    }

    public static void v(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] jArr4 = new long[4];
        long[] jArr5 = new long[4];
        u(jArr, jArr4);
        u(jArr2, jArr5);
        long[] jArr6 = new long[8];
        w(jArr6, jArr4[0], jArr5[0], jArr3, 0);
        w(jArr6, jArr4[1], jArr5[1], jArr3, 1);
        w(jArr6, jArr4[2], jArr5[2], jArr3, 2);
        w(jArr6, jArr4[3], jArr5[3], jArr3, 3);
        for (int i = 5; i > 0; i--) {
            jArr3[i] = jArr3[i] ^ jArr3[i - 1];
        }
        w(jArr6, jArr4[0] ^ jArr4[1], jArr5[0] ^ jArr5[1], jArr3, 1);
        w(jArr6, jArr4[2] ^ jArr4[3], jArr5[2] ^ jArr5[3], jArr3, 3);
        for (int i2 = 7; i2 > 1; i2--) {
            jArr3[i2] = jArr3[i2] ^ jArr3[i2 - 2];
        }
        long j = jArr4[0] ^ jArr4[2];
        long j2 = jArr4[1] ^ jArr4[3];
        long j3 = jArr5[0] ^ jArr5[2];
        long j4 = jArr5[3] ^ jArr5[1];
        w(jArr6, j ^ j2, j3 ^ j4, jArr3, 3);
        long[] jArr7 = new long[3];
        w(jArr6, j, j3, jArr7, 0);
        w(jArr6, j2, j4, jArr7, 1);
        long j5 = jArr7[0];
        long j6 = jArr7[1];
        long j7 = jArr7[2];
        long j8 = jArr3[2] ^ j5;
        jArr3[2] = j8;
        long j9 = jArr3[3] ^ (j5 ^ j6);
        jArr3[3] = j9;
        long j10 = jArr3[4] ^ (j6 ^ j7);
        jArr3[4] = j10;
        long j11 = jArr3[5] ^ j7;
        jArr3[5] = j11;
        long j12 = jArr3[0];
        long j13 = jArr3[1];
        long j14 = jArr3[6];
        long j15 = jArr3[7];
        jArr3[0] = j12 ^ (j13 << 49);
        jArr3[1] = (j13 >>> 15) ^ (j8 << 34);
        jArr3[2] = (j8 >>> 30) ^ (j9 << 19);
        jArr3[3] = ((j9 >>> 45) ^ (j10 << 4)) ^ (j11 << 53);
        jArr3[4] = ((j10 >>> 60) ^ (j14 << 38)) ^ (j11 >>> 11);
        jArr3[5] = (j14 >>> 26) ^ (j15 << 23);
        jArr3[6] = j15 >>> 41;
        jArr3[7] = 0;
    }

    public static void w(long[] jArr, long j, long j2, long[] jArr2, int i) {
        jArr[1] = j2;
        long j3 = j2 << 1;
        jArr[2] = j3;
        long j4 = j3 ^ j2;
        jArr[3] = j4;
        long j5 = j2 << 2;
        jArr[4] = j5;
        jArr[5] = j5 ^ j2;
        long j6 = j4 << 1;
        jArr[6] = j6;
        jArr[7] = j6 ^ j2;
        int i2 = (int) j;
        long j7 = jArr[i2 & 7] ^ (jArr[(i2 >>> 3) & 7] << 3);
        long j8 = 0;
        int i3 = 36;
        do {
            int i4 = (int) (j >>> i3);
            long j9 = (((jArr[i4 & 7] ^ (jArr[(i4 >>> 3) & 7] << 3)) ^ (jArr[(i4 >>> 6) & 7] << 6)) ^ (jArr[(i4 >>> 9) & 7] << 9)) ^ (jArr[(i4 >>> 12) & 7] << 12);
            j7 ^= j9 << i3;
            j8 ^= j9 >>> (-i3);
            i3 -= 15;
        } while (i3 > 0);
        jArr2[i] = jArr2[i] ^ (562949953421311L & j7);
        int i5 = i + 1;
        jArr2[i5] = jArr2[i5] ^ ((j7 >>> 49) ^ (j8 << 15));
    }

    public static void x(long[] jArr, long[] jArr2) {
        ui6.t(jArr, jArr2, 3);
        jArr2[6] = jArr[3] & 1;
    }

    public static boolean y(int i, long j) {
        if (j >= 0) {
            return j < (1 << i);
        }
        qp2.n("index must not be negative");
        return false;
    }

    public static boolean z(byte b) {
        return b > -65;
    }

    public void D(int i) {
    }

    public abstract void E(Typeface typeface);

    public abstract void d();

    public abstract boolean g();

    public final void k(int i) {
        new Handler(Looper.getMainLooper()).post(new oc4(this, i, (byte) 4));
    }
}
