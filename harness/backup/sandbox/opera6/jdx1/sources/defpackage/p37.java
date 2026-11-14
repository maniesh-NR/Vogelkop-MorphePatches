package defpackage;

import android.graphics.Color;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.core.app.NotificationCompat;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public abstract class p37 {
    public static final ue5 a = new ue5(45913764, new ef5((byte) 14), false);
    public static final ue5 b = new ue5(-119505377, new ef5((byte) 15), false);
    public static final byte[] c = {0, 8, 8, 8, 8, 8, 7, 7, 6, 6, 5};
    public static final long[] d = {3161836309350906777L, -7642453882179322845L, -3821226941089661423L, 7312758566309945096L, -556661012383879292L, 8945041530681231562L, -4750851271514160027L, 6847946401097695794L, 541669439031730457L};
    public static final Object e = new Object();
    public static final eko f = new eko(27);
    public static u03 g;
    public static i06 h;

    public static final void A(View view, Object obj, dh4 dh4Var, ViewTreeObserver.OnDrawListener onDrawListener) {
        Object tag = view.getTag(2131365023);
        rcf rcfVar = tag instanceof rcf ? (rcf) tag : null;
        if (rcfVar == null) {
            rcfVar = new rcf(view);
        }
        rcfVar.b.put(obj, onDrawListener);
        if (dh4Var != null) {
            rcfVar.c.add(dh4Var);
        }
    }

    public static final n01 A0(di1 di1Var) {
        return new n01(C0(di1Var.a), di1Var.b);
    }

    public static void B(View view, Object obj, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
        Object tag = view.getTag(2131365024);
        yy9 yy9Var = tag instanceof yy9 ? (yy9) tag : null;
        if (yy9Var == null) {
            yy9Var = new yy9(view);
        }
        yy9Var.b.put(obj, onGlobalLayoutListener);
    }

    public static final ArrayList B0(List list) {
        List list2 = list;
        ArrayList arrayList = new ArrayList(k95.o(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(A0((di1) it.next()));
        }
        return arrayList;
    }

    public static final void C(View view, Object obj, dh4 dh4Var, ViewTreeObserver.OnPreDrawListener onPreDrawListener) {
        Object tag = view.getTag(2131365025);
        xcf xcfVar = tag instanceof xcf ? (xcf) tag : null;
        if (xcfVar == null) {
            xcfVar = new xcf(view);
        }
        xcfVar.b.put(obj, onPreDrawListener);
        if (dh4Var != null) {
            xcfVar.c.add(dh4Var);
        }
    }

    public static final l01 C0(fi1 fi1Var) {
        int i = gi1.a[fi1Var.ordinal()];
        if (i == 1) {
            return l01.e;
        }
        if (i == 2) {
            return l01.f;
        }
        if (i == 3) {
            return l01.g;
        }
        if (i == 4) {
            return l01.h;
        }
        if (i == 5) {
            return l01.i;
        }
        h9o.p();
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static e1o D(uo5 uo5Var, int i, ArrayList arrayList, e1o e1oVar) {
        int i2;
        int i3 = i == 0 ? uo5Var.m0 : uo5Var.n0;
        if (i3 != -1) {
            if (e1oVar != null && i3 == e1oVar.b) {
                return e1oVar;
            }
            int i4 = 0;
            while (true) {
                if (i4 >= arrayList.size()) {
                    break;
                }
                e1o e1oVar2 = (e1o) arrayList.get(i4);
                if (e1oVar2.b == i3) {
                    if (e1oVar != null) {
                        e1oVar.c(i, e1oVar2);
                        arrayList.remove(e1oVar);
                    }
                    e1oVar = e1oVar2;
                } else {
                    i4++;
                }
            }
        }
        if (e1oVar == null) {
            if (uo5Var instanceof gaa) {
                gaa gaaVar = (gaa) uo5Var;
                int i5 = 0;
                while (true) {
                    if (i5 >= gaaVar.q0) {
                        i2 = -1;
                        break;
                    }
                    uo5 uo5Var2 = gaaVar.p0[i5];
                    if ((i == 0 && (i2 = uo5Var2.m0) != -1) || (i == 1 && (i2 = uo5Var2.n0) != -1)) {
                        break;
                    }
                    i5++;
                }
                if (i2 != -1) {
                    int i6 = 0;
                    while (true) {
                        if (i6 >= arrayList.size()) {
                            break;
                        }
                        e1o e1oVar3 = (e1o) arrayList.get(i6);
                        if (e1oVar3.b == i2) {
                            e1oVar = e1oVar3;
                            break;
                        }
                        i6++;
                    }
                }
            }
            if (e1oVar == null) {
                e1oVar = new e1o();
                e1oVar.a = new ArrayList();
                e1oVar.d = null;
                e1oVar.e = -1;
                int i7 = e1o.f;
                e1o.f = i7 + 1;
                e1oVar.b = i7;
                e1oVar.c = i;
            }
            arrayList.add(e1oVar);
        }
        ArrayList arrayList2 = e1oVar.a;
        if (arrayList2.contains(uo5Var)) {
            return e1oVar;
        }
        arrayList2.add(uo5Var);
        if (uo5Var instanceof r5a) {
            r5a r5aVar = (r5a) uo5Var;
            r5aVar.s0.c(r5aVar.t0 == 0 ? 1 : 0, e1oVar, arrayList);
        }
        int i8 = e1oVar.b;
        if (i == 0) {
            uo5Var.m0 = i8;
            uo5Var.H.c(i, e1oVar, arrayList);
            uo5Var.J.c(i, e1oVar, arrayList);
        } else {
            uo5Var.n0 = i8;
            uo5Var.I.c(i, e1oVar, arrayList);
            uo5Var.L.c(i, e1oVar, arrayList);
            uo5Var.K.c(i, e1oVar, arrayList);
        }
        uo5Var.O.c(i, e1oVar, arrayList);
        return e1oVar;
    }

    public static final int D0(View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams == null) {
            return 0;
        }
        return marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    public static final n37 E(Bundle bundle) {
        bundle.setClassLoader(p37.class.getClassLoader());
        n37 parcelable = bundle.getParcelable("__dest_bundle_key");
        if (parcelable != null) {
            return parcelable;
        }
        qp2.o("__dest_bundle_key not found");
        return null;
    }

    public static int E0(byte[] bArr, int i, int i2, byte[] bArr2, int i3) {
        int i4 = 1 << i;
        int i5 = ((i4 * i2) + 7) >> 3;
        if (i5 <= i3) {
            int i6 = (1 << i2) - 1;
            int i7 = 1 << (i2 - 1);
            int i8 = 0;
            int i9 = 0;
            int i10 = 0;
            int i11 = 0;
            loop0: while (true) {
                if (i8 >= i4) {
                    if ((i9 & ((1 << i10) - 1)) != 0) {
                        break loop0;
                    }
                    return i5;
                }
                int i12 = i11 + 1;
                i9 = (i9 << 8) | (bArr2[i11] & 255);
                i10 += 8;
                while (i10 >= i2 && i8 < i4) {
                    i10 -= i2;
                    int i13 = (i9 >>> i10) & i6;
                    int i14 = i13 | (-(i13 & i7));
                    if (i14 == (-i7)) {
                        break loop0;
                    }
                    bArr[i8] = (byte) i14;
                    i8++;
                }
                i11 = i12;
            }
        }
        return 0;
    }

    public static int F(int i, int i2, int i3) {
        float fT = t(i);
        if (t(i2) <= 0.5f ? fT < 0.1f : fT > 0.95f) {
            int iR = r(i, i2);
            int iR2 = r(i, i3);
            double[] dArrU = u(i);
            if (ab5.j(dArrU, u(iR)) <= ab5.j(dArrU, u(iR2))) {
                return i3;
            }
        }
        return i2;
    }

    public static boolean F0(int i, int i2, int i3, int i4) {
        return (i3 == 1 || i3 == 2 || (i3 == 4 && i != 2)) || (i4 == 1 || i4 == 2 || (i4 == 4 && i2 != 2));
    }

    public static final Rect G(View view) {
        if (!q9n.x(view)) {
            return null;
        }
        int[] iArr = new int[2];
        view.getLocationInWindow(iArr);
        int i = iArr[0];
        return new Rect(i, iArr[1], view.getWidth() + i, view.getHeight() + iArr[1]);
    }

    public static int H(int i) {
        if (i == 20) {
            return 63750;
        }
        if (i == 30) {
            return 2250000;
        }
        switch (i) {
            case 5:
                return 80000;
            case 6:
                return 768000;
            case 7:
                return 192000;
            case 8:
                return 2250000;
            case 9:
                return 40000;
            case 10:
                return 100000;
            case 11:
                return 16000;
            case 12:
                return 7000;
            default:
                switch (i) {
                    case 14:
                        return 3062500;
                    case 15:
                        return 8000;
                    case 16:
                        return 256000;
                    case 17:
                        return 336000;
                    case 18:
                        return 768000;
                    default:
                        return -2147483647;
                }
        }
    }

    public static int I(jl6 jl6Var, InputStream inputStream, ArrayList arrayList) throws IOException {
        if (inputStream != null) {
            if (!inputStream.markSupported()) {
                inputStream = new cph(inputStream, jl6Var);
            }
            inputStream.mark(5242880);
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                try {
                    int iA = ((rxa) arrayList.get(i)).a(inputStream, jl6Var);
                    if (iA != -1) {
                        return iA;
                    }
                } finally {
                    inputStream.reset();
                }
            }
        }
        return -1;
    }

    public static t03 J() {
        u03 u03Var = g;
        if (u03Var != null) {
            return u03Var;
        }
        u03 u03Var2 = new u03(new v03());
        g = u03Var2;
        return u03Var2;
    }

    public static ImageHeaderParser$ImageType K(jl6 jl6Var, InputStream inputStream, ArrayList arrayList) throws IOException {
        if (inputStream == null) {
            return ImageHeaderParser$ImageType.UNKNOWN;
        }
        if (!inputStream.markSupported()) {
            inputStream = new cph(inputStream, jl6Var);
        }
        inputStream.mark(5242880);
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            try {
                ImageHeaderParser$ImageType imageHeaderParser$ImageTypeC = ((rxa) arrayList.get(i)).c(inputStream);
                inputStream.reset();
                if (imageHeaderParser$ImageTypeC != ImageHeaderParser$ImageType.UNKNOWN) {
                    return imageHeaderParser$ImageTypeC;
                }
            } catch (Throwable th) {
                inputStream.reset();
                throw th;
            }
        }
        return ImageHeaderParser$ImageType.UNKNOWN;
    }

    public static void L(nq7 nq7Var) {
        if (nq7Var.i(false, false)) {
            return;
        }
        qp2.n("Invalid result");
    }

    public static void M(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] jArr4 = new long[16];
        for (int i = 0; i < 9; i++) {
            O(jArr4, jArr[i], jArr2[i], jArr3, i << 1);
        }
        long j = jArr3[0];
        long j2 = jArr3[1];
        long j3 = jArr3[2] ^ j;
        long j4 = j3 ^ j2;
        jArr3[1] = j4;
        long j5 = j2 ^ jArr3[3];
        long j6 = j3 ^ jArr3[4];
        long j7 = j6 ^ j5;
        jArr3[2] = j7;
        long j8 = j5 ^ jArr3[5];
        long j9 = j6 ^ jArr3[6];
        long j10 = j9 ^ j8;
        jArr3[3] = j10;
        long j11 = j8 ^ jArr3[7];
        long j12 = j9 ^ jArr3[8];
        long j13 = j12 ^ j11;
        jArr3[4] = j13;
        long j14 = j11 ^ jArr3[9];
        long j15 = j12 ^ jArr3[10];
        long j16 = j15 ^ j14;
        jArr3[5] = j16;
        long j17 = j14 ^ jArr3[11];
        long j18 = j15 ^ jArr3[12];
        long j19 = j18 ^ j17;
        jArr3[6] = j19;
        long j20 = j17 ^ jArr3[13];
        long j21 = j18 ^ jArr3[14];
        long j22 = j21 ^ j20;
        jArr3[7] = j22;
        long j23 = j20 ^ jArr3[15];
        long j24 = j21 ^ jArr3[16];
        long j25 = j24 ^ j23;
        jArr3[8] = j25;
        long j26 = j24 ^ (j23 ^ jArr3[17]);
        jArr3[9] = j ^ j26;
        jArr3[10] = j4 ^ j26;
        jArr3[11] = j7 ^ j26;
        jArr3[12] = j10 ^ j26;
        jArr3[13] = j13 ^ j26;
        jArr3[14] = j16 ^ j26;
        jArr3[15] = j19 ^ j26;
        jArr3[16] = j22 ^ j26;
        jArr3[17] = j25 ^ j26;
        O(jArr4, jArr[0] ^ jArr[1], jArr2[0] ^ jArr2[1], jArr3, 1);
        O(jArr4, jArr[0] ^ jArr[2], jArr2[0] ^ jArr2[2], jArr3, 2);
        O(jArr4, jArr[0] ^ jArr[3], jArr2[0] ^ jArr2[3], jArr3, 3);
        O(jArr4, jArr[1] ^ jArr[2], jArr2[1] ^ jArr2[2], jArr3, 3);
        O(jArr4, jArr[0] ^ jArr[4], jArr2[0] ^ jArr2[4], jArr3, 4);
        O(jArr4, jArr[1] ^ jArr[3], jArr2[1] ^ jArr2[3], jArr3, 4);
        O(jArr4, jArr[0] ^ jArr[5], jArr2[0] ^ jArr2[5], jArr3, 5);
        O(jArr4, jArr[1] ^ jArr[4], jArr2[1] ^ jArr2[4], jArr3, 5);
        O(jArr4, jArr[2] ^ jArr[3], jArr2[2] ^ jArr2[3], jArr3, 5);
        O(jArr4, jArr[0] ^ jArr[6], jArr2[0] ^ jArr2[6], jArr3, 6);
        O(jArr4, jArr[1] ^ jArr[5], jArr2[1] ^ jArr2[5], jArr3, 6);
        O(jArr4, jArr[2] ^ jArr[4], jArr2[2] ^ jArr2[4], jArr3, 6);
        O(jArr4, jArr[0] ^ jArr[7], jArr2[0] ^ jArr2[7], jArr3, 7);
        O(jArr4, jArr[1] ^ jArr[6], jArr2[1] ^ jArr2[6], jArr3, 7);
        O(jArr4, jArr[2] ^ jArr[5], jArr2[2] ^ jArr2[5], jArr3, 7);
        O(jArr4, jArr[3] ^ jArr[4], jArr2[3] ^ jArr2[4], jArr3, 7);
        O(jArr4, jArr[0] ^ jArr[8], jArr2[0] ^ jArr2[8], jArr3, 8);
        O(jArr4, jArr[1] ^ jArr[7], jArr2[1] ^ jArr2[7], jArr3, 8);
        O(jArr4, jArr[2] ^ jArr[6], jArr2[2] ^ jArr2[6], jArr3, 8);
        O(jArr4, jArr[3] ^ jArr[5], jArr2[3] ^ jArr2[5], jArr3, 8);
        O(jArr4, jArr[1] ^ jArr[8], jArr2[1] ^ jArr2[8], jArr3, 9);
        O(jArr4, jArr[2] ^ jArr[7], jArr2[2] ^ jArr2[7], jArr3, 9);
        O(jArr4, jArr[3] ^ jArr[6], jArr2[3] ^ jArr2[6], jArr3, 9);
        O(jArr4, jArr[4] ^ jArr[5], jArr2[4] ^ jArr2[5], jArr3, 9);
        O(jArr4, jArr[2] ^ jArr[8], jArr2[2] ^ jArr2[8], jArr3, 10);
        O(jArr4, jArr[3] ^ jArr[7], jArr2[3] ^ jArr2[7], jArr3, 10);
        O(jArr4, jArr[4] ^ jArr[6], jArr2[4] ^ jArr2[6], jArr3, 10);
        O(jArr4, jArr[3] ^ jArr[8], jArr2[3] ^ jArr2[8], jArr3, 11);
        O(jArr4, jArr[4] ^ jArr[7], jArr2[4] ^ jArr2[7], jArr3, 11);
        O(jArr4, jArr[5] ^ jArr[6], jArr2[5] ^ jArr2[6], jArr3, 11);
        O(jArr4, jArr[4] ^ jArr[8], jArr2[4] ^ jArr2[8], jArr3, 12);
        O(jArr4, jArr[5] ^ jArr[7], jArr2[5] ^ jArr2[7], jArr3, 12);
        O(jArr4, jArr[5] ^ jArr[8], jArr2[5] ^ jArr2[8], jArr3, 13);
        O(jArr4, jArr[6] ^ jArr[7], jArr2[6] ^ jArr2[7], jArr3, 13);
        O(jArr4, jArr[6] ^ jArr[8], jArr2[6] ^ jArr2[8], jArr3, 14);
        O(jArr4, jArr[7] ^ jArr[8], jArr2[7] ^ jArr2[8], jArr3, 15);
    }

    public static void N(long[] jArr, long[] jArr2, long[] jArr3) {
        int i = 56;
        while (true) {
            long j = 0;
            int i2 = 0;
            if (i < 0) {
                break;
            }
            for (int i3 = 1; i3 < 9; i3 += 2) {
                int i4 = (int) (jArr[i3] >>> i);
                m(jArr2, (i4 & 15) * 9, jArr2, (((i4 >>> 4) & 15) + 16) * 9, jArr3, i3 - 1);
            }
            while (i2 < 16) {
                long j2 = jArr3[i2];
                jArr3[i2] = (j2 << 8) | (j >>> (-8));
                i2++;
                j = j2;
            }
            i -= 8;
        }
        for (int i5 = 56; i5 >= 0; i5 -= 8) {
            int i6 = 0;
            while (i6 < 9) {
                int i7 = (int) (jArr[i6] >>> i5);
                int i8 = i6;
                m(jArr2, (i7 & 15) * 9, jArr2, (((i7 >>> 4) & 15) + 16) * 9, jArr3, i8);
                i6 = i8 + 2;
            }
            if (i5 > 0) {
                long j3 = 0;
                int i9 = 0;
                while (i9 < 18) {
                    long j4 = jArr3[i9];
                    jArr3[i9] = (j4 << 8) | (j3 >>> (-8));
                    i9++;
                    j3 = j4;
                }
            }
        }
    }

    public static void O(long[] jArr, long j, long j2, long[] jArr2, int i) {
        jArr[1] = j2;
        long j3 = 0;
        long j4 = j2;
        long j5 = j;
        for (int i2 = 2; i2 < 16; i2 += 2) {
            long j6 = jArr[i2 >>> 1] << 1;
            jArr[i2] = j6;
            jArr[i2 + 1] = j6 ^ j2;
            j5 = (j5 & (-72340172838076674L)) >>> 1;
            j3 ^= (j4 >> 63) & j5;
            j4 <<= 1;
        }
        int i3 = (int) j;
        long j7 = jArr[i3 & 15] ^ (jArr[(i3 >>> 4) & 15] << 4);
        int i4 = 56;
        do {
            int i5 = (int) (j >>> i4);
            long j8 = jArr[i5 & 15] ^ (jArr[(i5 >>> 4) & 15] << 4);
            j7 ^= j8 << i4;
            j3 ^= j8 >>> (-i4);
            i4 -= 8;
        } while (i4 > 0);
        jArr2[i] = jArr2[i] ^ j7;
        int i6 = i + 1;
        jArr2[i6] = jArr2[i6] ^ j3;
    }

    public static nq7 P(nq7[] nq7VarArr, nq7[] nq7VarArr2, byte[] bArr, nq7[] nq7VarArr3, nq7[] nq7VarArr4, byte[] bArr2) {
        nq7 nq7VarA;
        int iMax = Math.max(bArr.length, bArr2.length);
        nq7 nq7VarM = nq7VarArr[0].a.m();
        int i = iMax - 1;
        int i2 = 0;
        nq7 nq7VarW = nq7VarM;
        while (i >= 0) {
            byte b2 = i < bArr.length ? bArr[i] : (byte) 0;
            byte b3 = i < bArr2.length ? bArr2[i] : (byte) 0;
            if ((b2 | b3) == 0) {
                i2++;
            } else {
                if (b2 != 0) {
                    nq7VarA = nq7VarM.a((b2 < 0 ? nq7VarArr2 : nq7VarArr)[Math.abs((int) b2) >>> 1]);
                } else {
                    nq7VarA = nq7VarM;
                }
                if (b3 != 0) {
                    nq7VarA = nq7VarA.a((b3 < 0 ? nq7VarArr4 : nq7VarArr3)[Math.abs((int) b3) >>> 1]);
                }
                if (i2 > 0) {
                    nq7VarW = nq7VarW.u(i2);
                    i2 = 0;
                }
                nq7VarW = nq7VarW.w(nq7VarA);
            }
            i--;
        }
        return i2 > 0 ? nq7VarW.u(i2) : nq7VarW;
    }

    public static void Q(long[] jArr, long[] jArr2) {
        ui6.t(jArr, jArr2, 9);
    }

    public static int R(float f2, int i, int i2) {
        return Color.argb((int) (((Color.alpha(i2) - Color.alpha(i)) * f2) + Color.alpha(i)), (int) (((Color.red(i2) - Color.red(i)) * f2) + Color.red(i)), (int) (((Color.green(i2) - Color.green(i)) * f2) + Color.green(i)), (int) (((Color.blue(i2) - Color.blue(i)) * f2) + Color.blue(i)));
    }

    public static final boolean S(float[] fArr) {
        return fArr.length >= 16 && fArr[0] == 1.0f && fArr[1] == 0.0f && fArr[2] == 0.0f && fArr[3] == 0.0f && fArr[4] == 0.0f && fArr[5] == 1.0f && fArr[6] == 0.0f && fArr[7] == 0.0f && fArr[8] == 0.0f && fArr[9] == 0.0f && fArr[10] == 1.0f && fArr[11] == 0.0f && fArr[12] == 0.0f && fArr[13] == 0.0f && fArr[14] == 0.0f && fArr[15] == 1.0f;
    }

    public static final boolean T(float f2) {
        return Float.isNaN(f2) || Math.abs(f2) < 0.5f;
    }

    public static final LayoutInflater U(View view) {
        return LayoutInflater.from(view.getContext());
    }

    public static void V(ro0 ro0Var, int i, long j) {
        hf0 hf0Var;
        int iA = vep.A(i);
        if (iA == 0) {
            ro0Var.e(0);
            List list = (List) ro0Var.n(4);
            if (list == null || list.isEmpty()) {
                ArrayList arrayList = new ArrayList();
                ro0Var.q(4, 1, arrayList);
                hf0Var = new hf0(ro0Var, 4, arrayList);
            } else {
                hf0Var = new hf0(ro0Var, 4, list);
            }
            hf0Var.add(Long.valueOf(j));
            return;
        }
        if (iA == 1) {
            ro0Var.e(1);
            ro0Var.x().add(Long.valueOf(j));
            return;
        }
        if (iA == 2) {
            ro0Var.e(1);
            ro0Var.e(2);
            ro0Var.x().add(Long.valueOf(j));
        } else {
            if (iA != 3) {
                h9o.p();
                return;
            }
            ro0Var.e(1);
            ro0Var.e(3);
            ro0Var.x().add(Long.valueOf(j));
        }
    }

    public static final cs4 W(String str) {
        h58 h58Var = cs4.q;
        w4 w4VarE = sko.e(h58Var, h58Var);
        while (w4VarE.hasNext()) {
            cs4 cs4Var = (cs4) w4VarE.next();
            if (cs4Var.a.equals(str)) {
                return cs4Var;
            }
        }
        return null;
    }

    public static int X(int i, int i2) {
        return Color.argb((Color.alpha(i2) * Color.alpha(i)) / 255, (Color.red(i2) * Color.red(i)) / 255, (Color.green(i2) * Color.green(i)) / 255, (Color.blue(i2) * Color.blue(i)) / 255);
    }

    public static void Y(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] jArr4 = new long[18];
        M(jArr, jArr2, jArr4);
        g0(jArr4, jArr3);
    }

    public static void Z(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] jArr4 = new long[18];
        M(jArr, jArr2, jArr4);
        o(jArr3, jArr4, jArr3);
    }

    public static final void a(b3m b3mVar, c8e c8eVar, Function1 function1, td3 td3Var, Function1 function12, ue5 ue5Var, ih5 ih5Var, int i) {
        int i2;
        vt9 vt9Var = (vt9) ih5Var;
        vt9Var.Y(511725103);
        if ((i & 6) == 0) {
            i2 = (vt9Var.f(b3mVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= vt9Var.f(c8eVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= vt9Var.h(function1) ? NotificationCompat.FLAG_LOCAL_ONLY : NotificationCompat.FLAG_HIGH_PRIORITY;
        }
        if ((i & 3072) == 0) {
            i2 |= vt9Var.f(td3Var) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= vt9Var.h(function12) ? 16384 : 8192;
        }
        if ((i & 196608) == 0) {
            i2 |= vt9Var.h(ue5Var) ? 131072 : 65536;
        }
        if (vt9Var.N(i2 & 1, (74899 & i2) != 74898)) {
            Object objK = vt9Var.K();
            if (objK == hh5.a) {
                objK = h50.l;
                vt9Var.g0(objK);
            }
            c(b3mVar, c8eVar, function1, td3Var, function12, (Function1) objK, ue5Var, vt9Var, (i2 & 14) | 196608 | (i2 & 112) | (i2 & 896) | (i2 & 7168) | (57344 & i2) | ((i2 << 3) & 3670016));
        } else {
            vt9Var.Q();
        }
        znh znhVarR = vt9Var.r();
        if (znhVarR != null) {
            znhVarR.d = new od1(b3mVar, c8eVar, function1, td3Var, function12, ue5Var, i);
        }
    }

    public static int a0(float f2, int i) {
        return f2 == 1.0f ? i : m0(i, (int) (Color.alpha(i) * f2));
    }

    public static final void b(Object obj, c8e c8eVar, Function1 function1, td3 td3Var, String str, Function1 function12, ue5 ue5Var, ih5 ih5Var, int i) {
        c8e c8eVar2;
        Function1 function13;
        td3 td3Var2;
        String str2;
        vt9 vt9Var = (vt9) ih5Var;
        vt9Var.Y(1501828832);
        int i2 = i | (vt9Var.f(obj) ? 4 : 2) | 28080;
        if (vt9Var.N(i2 & 1, (599187 & i2) != 599186)) {
            Object objK = vt9Var.K();
            if (objK == hh5.a) {
                objK = h50.k;
                vt9Var.g0(objK);
            }
            Function1 function14 = (Function1) objK;
            td3 td3Var3 = rbe.b;
            b3m b3mVarV = r9h.v(obj, "AnimatedContent", vt9Var, (i2 & 14) | 48, 0);
            z7e z7eVar = z7e.b;
            a(b3mVarV, z7eVar, function14, td3Var3, function12, ue5Var, vt9Var, 224688);
            c8eVar2 = z7eVar;
            function13 = function14;
            td3Var2 = td3Var3;
            str2 = "AnimatedContent";
        } else {
            vt9Var.Q();
            c8eVar2 = c8eVar;
            function13 = function1;
            td3Var2 = td3Var;
            str2 = str;
        }
        znh znhVarR = vt9Var.r();
        if (znhVarR != null) {
            znhVarR.d = new td1(obj, c8eVar2, function13, td3Var2, str2, function12, ue5Var, i);
        }
    }

    public static void b0(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] jArr4 = new long[18];
        N(jArr, jArr2, jArr4);
        g0(jArr4, jArr3);
    }

    public static final void c(b3m b3mVar, c8e c8eVar, Function1 function1, td3 td3Var, Function1 function12, Function1 function13, ue5 ue5Var, ih5 ih5Var, int i) {
        Function1 function14;
        vt9 vt9Var;
        q2m q2mVar;
        Object obj;
        see seeVar;
        q2m q2mVar2;
        de1 de1Var;
        puj pujVar;
        puj pujVar2;
        q2m q2mVarM;
        boolean z;
        int i2;
        int i3;
        vt9 vt9Var2 = (vt9) ih5Var;
        vt9Var2.Y(1935038908);
        int i4 = (i & 6) == 0 ? (vt9Var2.f(b3mVar) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i4 |= vt9Var2.f(c8eVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i4 |= vt9Var2.h(function1) ? NotificationCompat.FLAG_LOCAL_ONLY : NotificationCompat.FLAG_HIGH_PRIORITY;
        }
        if ((i & 3072) == 0) {
            i4 |= vt9Var2.f(td3Var) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i4 |= vt9Var2.h(function12) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i4 |= vt9Var2.h(function13) ? 131072 : 65536;
        }
        ue5 ue5Var2 = ue5Var;
        if ((1572864 & i) == 0) {
            i4 |= vt9Var2.h(ue5Var2) ? 1048576 : 524288;
        }
        if (vt9Var2.N(i4 & 1, (599187 & i4) != 599186)) {
            int i5 = i4 & 14;
            boolean z2 = i5 == 4;
            Object objK = vt9Var2.K();
            zpa zpaVar = hh5.a;
            if (z2 || objK == zpaVar) {
                objK = new de1(b3mVar, td3Var);
                vt9Var2.g0(objK);
            }
            de1 de1Var2 = (de1) objK;
            boolean z3 = i5 == 4;
            Object objK2 = vt9Var2.K();
            Object obj2 = objK2;
            if (z3 || objK2 == zpaVar) {
                Object[] objArr = {b3mVar.c()};
                puj pujVar3 = new puj();
                pujVar3.addAll(e82.B(objArr));
                vt9Var2.g0(pujVar3);
                obj2 = pujVar3;
            }
            puj pujVar4 = (puj) obj2;
            t0g t0gVar = b3mVar.e;
            int i6 = i4;
            t0g t0gVar2 = b3mVar.d;
            boolean zF = (i5 == 4) | vt9Var2.f(t0gVar.getValue());
            Object objK3 = vt9Var2.K();
            if (zF || objK3 == zpaVar) {
                long[] jArr = imi.a;
                objK3 = new see();
                vt9Var2.g0(objK3);
            }
            see seeVar2 = (see) objK3;
            if (!pujVar4.contains(b3mVar.c())) {
                pujVar4.clear();
                pujVar4.add(b3mVar.c());
            }
            if (Intrinsics.a(b3mVar.c(), t0gVar2.getValue()) && t0gVar.getValue() == null) {
                if (pujVar4.size() != 1 || !Intrinsics.a(pujVar4.get(0), b3mVar.c())) {
                    pujVar4.clear();
                    pujVar4.add(b3mVar.c());
                }
                if (seeVar2.e != 1 || seeVar2.c(b3mVar.c())) {
                    seeVar2.a();
                }
                de1Var2.b = td3Var;
            }
            Object value = t0gVar.getValue();
            if (value != null && !value.equals(b3mVar.c())) {
                mea meaVarListIterator = pujVar4.listIterator();
                int i7 = 0;
                while (true) {
                    mea meaVar = meaVarListIterator;
                    if (!meaVar.hasNext()) {
                        i3 = -1;
                        break;
                    } else {
                        if (Intrinsics.a(function12.invoke(meaVar.next()), function12.invoke(value))) {
                            i3 = i7;
                            break;
                        }
                        i7++;
                    }
                }
                if (i3 == -1) {
                    pujVar4.add(value);
                } else if (!Intrinsics.a(pujVar4.get(i3), value)) {
                    pujVar4.set(i3, value);
                }
            }
            if (!Intrinsics.a(b3mVar.c(), t0gVar2.getValue())) {
                mea meaVarListIterator2 = pujVar4.listIterator();
                int i8 = 0;
                while (true) {
                    mea meaVar2 = meaVarListIterator2;
                    if (!meaVar2.hasNext()) {
                        i2 = -1;
                        break;
                    } else {
                        if (Intrinsics.a(function12.invoke(meaVar2.next()), function12.invoke(t0gVar2.getValue()))) {
                            i2 = i8;
                            break;
                        }
                        i8++;
                    }
                }
                if (i2 == -1) {
                    pujVar4.add(t0gVar2.getValue());
                } else if (!Intrinsics.a(pujVar4.get(i2), t0gVar2.getValue()) || i2 != pujVar4.size() - 1) {
                    Intrinsics.a(t0gVar2.getValue(), pujVar4.get(i2));
                    pujVar4.remove(i2);
                    pujVar4.add(t0gVar2.getValue());
                }
            }
            Object value2 = t0gVar.getValue();
            boolean zF2 = vt9Var2.f(value2);
            Object objK4 = vt9Var2.K();
            if (zF2 || objK4 == zpaVar) {
                objK4 = value2 != null ? new p8g(de1Var2, t0gVar2.getValue(), value2) : null;
                vt9Var2.g0(objK4);
            }
            p8g p8gVar = (p8g) objK4;
            boolean zF3 = vt9Var2.f(p8gVar) | ((i6 & 458752) == 131072);
            Object objK5 = vt9Var2.K();
            if (!zF3 && objK5 != zpaVar) {
                obj = objK5;
                q2mVar = null;
            } else if (p8gVar != null && function13.invoke(p8gVar) != null) {
                h9o.t();
                return;
            } else {
                q2mVar = null;
                vt9Var2.g0(null);
                obj = null;
            }
            if (obj != null) {
                h9o.t();
                return;
            }
            if (seeVar2.b(t0gVar2.getValue()) && seeVar2.b(b3mVar.c()) && (value2 == null || seeVar2.b(value2))) {
                vt9Var2.W(-297322234);
                vt9Var2.p(false);
                seeVar = seeVar2;
                q2mVar2 = q2mVar;
                de1Var = de1Var2;
                pujVar = pujVar4;
                function14 = function1;
            } else {
                vt9Var2.W(-302069574);
                seeVar2.a();
                int size = pujVar4.size();
                int i9 = 0;
                while (i9 < size) {
                    int i10 = size;
                    Object obj3 = pujVar4.get(i9);
                    see seeVar3 = seeVar2;
                    seeVar3.m(obj3, gyg.P(427839334, new td1(obj3, b3mVar, p8gVar, function1, de1Var2, pujVar4, ue5Var2), vt9Var2));
                    i9++;
                    pujVar4 = pujVar4;
                    seeVar2 = seeVar3;
                    size = i10;
                    q2mVar = q2mVar;
                    ue5Var2 = ue5Var;
                }
                seeVar = seeVar2;
                q2mVar2 = q2mVar;
                de1Var = de1Var2;
                pujVar = pujVar4;
                function14 = function1;
                vt9Var2.p(false);
            }
            boolean zF4 = vt9Var2.f(de1Var) | vt9Var2.f(b3mVar.f()) | vt9Var2.f(t0gVar.getValue());
            Object objK6 = vt9Var2.K();
            if (zF4 || objK6 == zpaVar) {
                objK6 = (or5) function14.invoke(de1Var);
                vt9Var2.g0(objK6);
            }
            or5 or5Var = (or5) objK6;
            b3m b3mVar2 = de1Var.a;
            boolean zF5 = vt9Var2.f(de1Var);
            Object objK7 = vt9Var2.K();
            if (zF5 || objK7 == zpaVar) {
                objK7 = hyg.k(Boolean.FALSE);
                vt9Var2.g0(objK7);
            }
            afe afeVar = (afe) objK7;
            afe afeVarO = hyg.o(or5Var.d, vt9Var2);
            if (Intrinsics.a(b3mVar2.c(), b3mVar2.d.getValue())) {
                afeVar.setValue(Boolean.FALSE);
            } else if (afeVarO.getValue() != null) {
                afeVar.setValue(Boolean.TRUE);
            }
            boolean zBooleanValue = ((Boolean) afeVar.getValue()).booleanValue();
            c8e c8eVar2 = z7e.b;
            if (zBooleanValue) {
                vt9Var2.W(1353077497);
                pujVar2 = pujVar;
                vt9Var = vt9Var2;
                q2mVarM = r9h.m(de1Var.a, a26.l, (String) null, vt9Var, 0, 2);
                boolean zF6 = vt9Var.f(q2mVarM);
                Object objK8 = vt9Var.K();
                if (zF6 || objK8 == zpaVar) {
                    objK8 = x1p.m(c8eVar2);
                    vt9Var.g0(objK8);
                }
                c8eVar2 = (c8e) objK8;
                vt9Var.p(false);
            } else {
                vt9Var = vt9Var2;
                pujVar2 = pujVar;
                vt9Var.W(1353343539);
                vt9Var.p(false);
                q2mVarM = q2mVar2;
            }
            c8e c8eVarD = c8eVar.d(c8eVar2.d(new zd1(q2mVarM, afeVarO, de1Var)));
            Object objK9 = vt9Var.K();
            if (objK9 == zpaVar) {
                objK9 = new vd1(de1Var);
                vt9Var.g0(objK9);
            }
            vd1 vd1Var = (vd1) objK9;
            int iHashCode = Long.hashCode(vt9Var.T);
            oag oagVarL = vt9Var.l();
            c8e c8eVarP = qyn.P(vt9Var, c8eVarD);
            bh5.To.getClass();
            vt9Var.a0();
            if (vt9Var.S) {
                vt9Var.k(m3c.S);
            } else {
                vt9Var.j0();
            }
            y4h.o(vt9Var, vd1Var, ujp.f);
            y4h.o(vt9Var, oagVarL, ujp.e);
            y4h.j(vt9Var, Integer.valueOf(iHashCode));
            y4h.m(vt9Var);
            y4h.o(vt9Var, c8eVarP, ujp.d);
            vt9Var.W(758586195);
            int size2 = pujVar2.size();
            for (int i11 = 0; i11 < size2; i11++) {
                Object obj4 = pujVar2.get(i11);
                vt9Var.U(1420119555, function12.invoke(obj4));
                Function2 function2 = (Function2) seeVar.g(obj4);
                if (function2 == null) {
                    vt9Var.W(1074069702);
                    z = false;
                } else {
                    z = false;
                    vt9Var.W(1420120731);
                    function2.invoke(vt9Var, 0);
                }
                vt9Var.p(z);
                vt9Var.p(z);
            }
            vt9Var.p(false);
            vt9Var.p(true);
        } else {
            function14 = function1;
            vt9Var = vt9Var2;
            vt9Var.Q();
        }
        znh znhVarR = vt9Var.r();
        if (znhVarR != null) {
            znhVarR.d = new pd1(b3mVar, c8eVar, function14, td3Var, function12, function13, ue5Var, i);
        }
    }

    public static final afe c0(ekc ekcVar, Object obj, vt9 vt9Var) {
        ndc ndcVar = (ndc) vt9Var.j(tuc.a);
        Object objK = vt9Var.K();
        zpa zpaVar = hh5.a;
        if (objK == zpaVar) {
            if (ekcVar.i()) {
                obj = ekcVar.g();
            }
            objK = hyg.k(obj);
            vt9Var.g0(objK);
        }
        afe afeVar = (afe) objK;
        boolean zH = vt9Var.h(ekcVar) | vt9Var.h(ndcVar);
        Object objK2 = vt9Var.K();
        if (zH || objK2 == zpaVar) {
            objK2 = new yo7(ekcVar, ndcVar, afeVar, (byte) 15);
            vt9Var.g0(objK2);
        }
        rm5.a(ekcVar, ndcVar, (Function1) objK2, vt9Var);
        return afeVar;
    }

    public static final void d(c8e c8eVar, w62 w62Var, z62 z62Var, sd3 sd3Var, int i, int i2, ue5 ue5Var, ih5 ih5Var, int i3, int i4) {
        c8e c8eVar2;
        int i5;
        z62 z62Var2;
        int i6;
        sd3 sd3Var2;
        int i7;
        int i8;
        c8e c8eVar3;
        z62 z62Var3;
        vt9 vt9Var = (vt9) ih5Var;
        vt9Var.Y(-1303174015);
        int i9 = i4 & 1;
        if (i9 != 0) {
            i5 = i3 | 6;
            c8eVar2 = c8eVar;
        } else if ((i3 & 6) == 0) {
            c8eVar2 = c8eVar;
            i5 = i3 | (vt9Var.f(c8eVar2) ? 4 : 2);
        } else {
            c8eVar2 = c8eVar;
            i5 = i3;
        }
        if ((i3 & 48) == 0) {
            i5 |= vt9Var.f(w62Var) ? 32 : 16;
        }
        int i10 = i4 & 4;
        if (i10 != 0) {
            i6 = i5 | 384;
            z62Var2 = z62Var;
        } else {
            z62Var2 = z62Var;
            i6 = i5 | (vt9Var.f(z62Var2) ? NotificationCompat.FLAG_LOCAL_ONLY : NotificationCompat.FLAG_HIGH_PRIORITY);
        }
        int i11 = i6 | 224256;
        if (vt9Var.N(i11 & 1, (599187 & i11) != 599186)) {
            c8e c8eVar4 = i9 != 0 ? z7e.b : c8eVar2;
            z62 z62Var4 = i10 != 0 ? b72.c : z62Var2;
            sd3 sd3Var3 = rbe.k;
            int i12 = (i11 & 14) | 1572864 | (i11 & 112) | (i11 & 896) | 12807168;
            z62 z62Var5 = z62Var4;
            e(c8eVar4, w62Var, z62Var5, sd3Var3, vd9.a, ue5Var, vt9Var, i12);
            c8eVar3 = c8eVar4;
            i7 = Integer.MAX_VALUE;
            i8 = Integer.MAX_VALUE;
            z62Var3 = z62Var5;
            sd3Var2 = sd3Var3;
        } else {
            vt9Var.Q();
            sd3Var2 = sd3Var;
            i7 = i;
            i8 = i2;
            c8eVar3 = c8eVar2;
            z62Var3 = z62Var2;
        }
        znh znhVarR = vt9Var.r();
        if (znhVarR != null) {
            znhVarR.d = new bb9(c8eVar3, w62Var, z62Var3, sd3Var2, i7, i8, ue5Var, i3, i4);
        }
    }

    public static final void d0(View view, vt3 vt3Var) {
        q9n.g(view, new v9n(view, vt3Var));
    }

    public static final void e(c8e c8eVar, w62 w62Var, z62 z62Var, sd3 sd3Var, vd9 vd9Var, ue5 ue5Var, ih5 ih5Var, int i) {
        int i2;
        vd9 vd9Var2;
        byte b2;
        boolean z;
        Object obj;
        vt9 vt9Var = (vt9) ih5Var;
        vt9Var.Y(-1956591841);
        if ((i & 6) == 0) {
            i2 = (vt9Var.f(c8eVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= vt9Var.f(w62Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= vt9Var.f(z62Var) ? 256 : NotificationCompat.FLAG_HIGH_PRIORITY;
        }
        if ((i & 3072) == 0) {
            i2 |= vt9Var.f(sd3Var) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= vt9Var.d(Integer.MAX_VALUE) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= vt9Var.d(Integer.MAX_VALUE) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            vd9Var2 = vd9Var;
            i2 |= vt9Var.f(vd9Var2) ? 1048576 : 524288;
        } else {
            vd9Var2 = vd9Var;
        }
        if ((i & 12582912) == 0) {
            i2 |= vt9Var.h(ue5Var) ? 8388608 : 4194304;
        }
        int i3 = i2;
        if (vt9Var.N(i3 & 1, (i3 & 4793491) != 4793490)) {
            int i4 = i3 & 3670016;
            boolean z2 = i4 == 1048576;
            Object objK = vt9Var.K();
            zpa zpaVar = hh5.a;
            if (z2 || objK == zpaVar) {
                vd9Var2.getClass();
                cb9 cb9Var = cb9.a;
                objK = new db9();
                vt9Var.g0(objK);
            }
            db9 db9Var = (db9) objK;
            int i5 = i3 >> 3;
            boolean zF = ((((i5 & 14) ^ 6) > 4 && vt9Var.f(w62Var)) || (i5 & 6) == 4) | ((((i5 & 112) ^ 48) > 32 && vt9Var.f(z62Var)) || (i5 & 48) == 32) | ((((i5 & 896) ^ 384) > 256 && vt9Var.f(sd3Var)) || (i5 & 384) == 256) | ((((i5 & 7168) ^ 3072) > 2048 && vt9Var.d(Integer.MAX_VALUE)) || (i5 & 3072) == 2048) | ((((57344 & i5) ^ 24576) > 16384 && vt9Var.d(Integer.MAX_VALUE)) || (i5 & 24576) == 16384) | vt9Var.f(db9Var);
            Object objK2 = vt9Var.K();
            if (zF || objK2 == zpaVar) {
                gb9 gb9Var = new gb9(w62Var, z62Var, w62Var.b(), new j26(sd3Var), z62Var.b(), db9Var);
                vt9Var.g0(gb9Var);
                objK2 = gb9Var;
            }
            gb9 gb9Var2 = (gb9) objK2;
            boolean z3 = (i4 == 1048576) | ((i3 & 29360128) == 8388608) | ((i3 & 458752) == 131072);
            Object objK3 = vt9Var.K();
            if (z3 || objK3 == zpaVar) {
                ArrayList arrayList = new ArrayList();
                b2 = 2;
                z = true;
                arrayList.add(new ue5(-1192950673, new bg5(ue5Var, (byte) 2), true));
                vd9Var.getClass();
                cb9 cb9Var2 = cb9.a;
                vt9Var.g0(arrayList);
                obj = arrayList;
            } else {
                b2 = 2;
                z = true;
                obj = objK3;
            }
            ue5 ue5Var2 = new ue5(1271844412, new a7b((List) obj, b2), z);
            boolean zF2 = vt9Var.f(gb9Var2);
            Object objK4 = vt9Var.K();
            if (zF2 || objK4 == zpaVar) {
                objK4 = new nbe(gb9Var2);
                vt9Var.g0(objK4);
            }
            tfd tfdVar = (tfd) objK4;
            int iHashCode = Long.hashCode(vt9Var.T);
            oag oagVarL = vt9Var.l();
            c8e c8eVarP = qyn.P(vt9Var, c8eVar);
            bh5.To.getClass();
            vt9Var.a0();
            if (vt9Var.S) {
                vt9Var.k(m3c.S);
            } else {
                vt9Var.j0();
            }
            y4h.o(vt9Var, tfdVar, ujp.f);
            y4h.o(vt9Var, oagVarL, ujp.e);
            y4h.o(vt9Var, Integer.valueOf(iHashCode), ujp.g);
            y4h.m(vt9Var);
            y4h.o(vt9Var, c8eVarP, ujp.d);
            o18.r(0, ue5Var2, vt9Var, true);
        } else {
            vt9Var.Q();
        }
        znh znhVarR = vt9Var.r();
        if (znhVarR != null) {
            znhVarR.d = new se5(c8eVar, w62Var, z62Var, sd3Var, vd9Var, ue5Var, i);
        }
    }

    public static long[] e0(long[] jArr) {
        long j;
        long[] jArr2 = new long[288];
        int i = 0;
        System.arraycopy(jArr, 0, jArr2, 9, 9);
        int i2 = 7;
        int i3 = 0;
        while (true) {
            j = 0;
            if (i2 <= 0) {
                break;
            }
            int i4 = i3 + 18;
            int i5 = i4 >>> 1;
            int i6 = 0;
            while (i6 < 9) {
                long j2 = jArr2[i5 + i6];
                jArr2[i4 + i6] = (j2 << 1) | (j >>> 63);
                i6++;
                j = j2;
            }
            int i7 = i3 + 26;
            long j3 = jArr2[i7];
            long j4 = j3 >>> 59;
            jArr2[i4] = jArr2[i4] ^ ((((j4 << 2) ^ j4) ^ (j4 << 5)) ^ (j4 << 10));
            jArr2[i7] = j3 & 576460752303423487L;
            int i8 = i3 + 27;
            for (int i9 = 0; i9 < 9; i9++) {
                jArr2[i8 + i9] = jArr2[9 + i9] ^ jArr2[i4 + i9];
            }
            i2--;
            i3 = i4;
        }
        while (i < 144) {
            long j5 = jArr2[i];
            jArr2[144 + i] = (j5 << 4) | (j >>> (-4));
            i++;
            j = j5;
        }
        return jArr2;
    }

    public static final void f(List list, Function1 function1, c8e c8eVar, ih5 ih5Var, int i, int i2) {
        int i3;
        c8e c8eVar2;
        vt9 vt9Var = (vt9) ih5Var;
        vt9Var.Y(-1004602463);
        if ((i & 6) == 0) {
            i3 = ((i & 8) == 0 ? vt9Var.f(list) : vt9Var.h(list) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= vt9Var.h(function1) ? 32 : 16;
        }
        int i4 = i2 & 4;
        if (i4 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= vt9Var.f(c8eVar) ? NotificationCompat.FLAG_LOCAL_ONLY : NotificationCompat.FLAG_HIGH_PRIORITY;
        }
        if (vt9Var.N(i3 & 1, (i3 & 147) != 146)) {
            c8e c8eVar3 = i4 != 0 ? z7e.b : c8eVar;
            vt9Var.W(944680526);
            List list2 = list;
            ArrayList arrayList = new ArrayList(k95.o(list2, 10));
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(mzg.q(vt9Var, ((rdf) it.next()).a.a));
            }
            vt9Var.p(false);
            pof.b.getClass();
            x62 x62Var = new x62(8.0f, true, new bi(rbe.o, (byte) 26));
            List listAsList = Arrays.asList(gyg.P(425126898, new a7b(arrayList, (byte) 22), vt9Var), gyg.P(1003893043, new g9(list, function1, arrayList, (byte) 25), vt9Var));
            c8e c8eVarZ = a26.Z(c8eVar3.d(mpj.a), 16.0f, 0.0f, 2);
            boolean zF = vt9Var.f(x62Var);
            Object objK = vt9Var.K();
            zpa zpaVar = hh5.a;
            if (zF || objK == zpaVar) {
                objK = new rcg(x62Var);
                vt9Var.g0(objK);
            }
            mbe mbeVar = (mbe) objK;
            ue5 ue5Var = new ue5(1271844412, new a7b(listAsList, (byte) 2), true);
            boolean zF2 = vt9Var.f(mbeVar);
            Object objK2 = vt9Var.K();
            if (zF2 || objK2 == zpaVar) {
                objK2 = new nbe(mbeVar);
                vt9Var.g0(objK2);
            }
            tfd tfdVar = (tfd) objK2;
            int iHashCode = Long.hashCode(vt9Var.T);
            oag oagVarL = vt9Var.l();
            c8e c8eVarP = qyn.P(vt9Var, c8eVarZ);
            bh5.To.getClass();
            vt9Var.a0();
            if (vt9Var.S) {
                vt9Var.k(m3c.S);
            } else {
                vt9Var.j0();
            }
            y4h.o(vt9Var, tfdVar, ujp.f);
            y4h.o(vt9Var, oagVarL, ujp.e);
            y4h.o(vt9Var, Integer.valueOf(iHashCode), ujp.g);
            y4h.m(vt9Var);
            y4h.o(vt9Var, c8eVarP, ujp.d);
            o18.r(0, ue5Var, vt9Var, true);
            c8eVar2 = c8eVar3;
        } else {
            vt9Var.Q();
            c8eVar2 = c8eVar;
        }
        znh znhVarR = vt9Var.r();
        if (znhVarR != null) {
            znhVarR.d = new d57(list, function1, c8eVar2, i, i2, (byte) 1);
        }
    }

    public static final void f0(h07 h07Var, bd5 bd5Var) {
        h07Var.s(new cv2(h07Var, bd5Var, (byte) 20));
    }

    public static final void g(String str, String str2, Function0 function0, ih5 ih5Var, int i) {
        vt9 vt9Var;
        vt9 vt9Var2 = (vt9) ih5Var;
        vt9Var2.Y(2132900171);
        int i2 = i | (vt9Var2.f(str) ? 4 : 2) | (vt9Var2.f(str2) ? 32 : 16) | (vt9Var2.h(function0) ? NotificationCompat.FLAG_LOCAL_ONLY : NotificationCompat.FLAG_HIGH_PRIORITY);
        if (vt9Var2.N(i2 & 1, (i2 & 147) != 146)) {
            vt9Var = vt9Var2;
            i7e.a(function0, null, i7e.f(null, vt9Var2, 0, 3), 0.0f, false, null, 0L, 0L, 0L, null, null, null, gyg.P(2128580909, new f23(str, str2, function0, (byte) 10), vt9Var2), vt9Var, (i2 >> 6) & 14, 7162);
        } else {
            vt9Var = vt9Var2;
            vt9Var.Q();
        }
        znh znhVarR = vt9Var.r();
        if (znhVarR != null) {
            znhVarR.d = new g9(str, str2, function0, i, (byte) 21);
        }
    }

    public static void g0(long[] jArr, long[] jArr2) {
        long j = jArr[9];
        long j2 = jArr[17];
        long j3 = (((j ^ (j2 >>> 59)) ^ (j2 >>> 57)) ^ (j2 >>> 54)) ^ (j2 >>> 49);
        long j4 = (((jArr[8] ^ (j2 << 5)) ^ (j2 << 7)) ^ (j2 << 10)) ^ (j2 << 15);
        for (int i = 16; i >= 10; i--) {
            long j5 = jArr[i];
            jArr2[i - 8] = (((j4 ^ (j5 >>> 59)) ^ (j5 >>> 57)) ^ (j5 >>> 54)) ^ (j5 >>> 49);
            j4 = (((jArr[i - 9] ^ (j5 << 5)) ^ (j5 << 7)) ^ (j5 << 10)) ^ (j5 << 15);
        }
        jArr2[1] = (((j4 ^ (j3 >>> 59)) ^ (j3 >>> 57)) ^ (j3 >>> 54)) ^ (j3 >>> 49);
        long j6 = (((jArr[0] ^ (j3 << 5)) ^ (j3 << 7)) ^ (j3 << 10)) ^ (j3 << 15);
        long j7 = jArr2[8];
        long j8 = j7 >>> 59;
        jArr2[0] = (((j6 ^ j8) ^ (j8 << 2)) ^ (j8 << 5)) ^ (j8 << 10);
        jArr2[8] = j7 & 576460752303423487L;
    }

    public static final void h(String str, String str2, Function0 function0, ih5 ih5Var, int i) {
        int i2;
        Function0 function02;
        vt9 vt9Var = (vt9) ih5Var;
        vt9Var.Y(-1664500634);
        if ((i & 6) == 0) {
            i2 = (vt9Var.f(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = i2 | (vt9Var.f(str2) ? 32 : 16);
        if ((i & 384) == 0) {
            function02 = function0;
            i3 |= vt9Var.h(function02) ? NotificationCompat.FLAG_LOCAL_ONLY : NotificationCompat.FLAG_HIGH_PRIORITY;
        } else {
            function02 = function0;
        }
        if (vt9Var.N(i3 & 1, (i3 & 147) != 146)) {
            i39 i39Var = mpj.a;
            c8e c8eVarX = a26.X(wxe.Q(i39Var), 24.0f);
            db5 db5VarA = cb5.a(new x62(12.0f, false, new t40((byte) 18)), rbe.n, vt9Var, 6);
            int iHashCode = Long.hashCode(vt9Var.T);
            oag oagVarL = vt9Var.l();
            c8e c8eVarP = qyn.P(vt9Var, c8eVarX);
            bh5.To.getClass();
            vt9Var.a0();
            if (vt9Var.S) {
                vt9Var.k(m3c.S);
            } else {
                vt9Var.j0();
            }
            y4h.o(vt9Var, db5VarA, ujp.f);
            y4h.o(vt9Var, oagVarL, ujp.e);
            y4h.o(vt9Var, Integer.valueOf(iHashCode), ujp.g);
            y4h.m(vt9Var);
            y4h.o(vt9Var, c8eVarP, ujp.d);
            hp7 hp7Var = abm.a;
            int i4 = i3;
            ijl.b(str, i39Var, 0L, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, ((wam) vt9Var.j(hp7Var)).f, vt9Var, (i3 & 14) | 48, 0, 131068);
            ijl.b(str2, null, 0L, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, ((wam) vt9Var.j(hp7Var)).k, vt9Var, (i4 >> 3) & 14, 0, 131070);
            vt9Var = vt9Var;
            yi4.a(function02, i39Var, false, (paj) null, (z14) null, (e24) null, (go3) null, (zvf) null, a26.c, vt9Var, ((i4 >> 6) & 14) | 805306416, 508);
            vt9Var.p(true);
        } else {
            vt9Var.Q();
        }
        znh znhVarR = vt9Var.r();
        if (znhVarR != null) {
            znhVarR.d = new j51(str, str2, function0, i, (byte) 4);
        }
    }

    public static final void h0(View view) {
        if (view.isLaidOut()) {
            view.requestRectangleOnScreen(new Rect(0, 0, view.getWidth(), view.getHeight()));
        } else {
            B(view, e, new j21(view, (byte) 4));
        }
    }

    public static final void i(boolean z, Pair pair, List list, eef eefVar, Function1 function1, Function1 function12, agm agmVar, List list2, Function1 function13, Function0 function0, ih5 ih5Var, int i) {
        float f2;
        vt9 vt9Var = (vt9) ih5Var;
        vt9Var.Y(-2144201040);
        int i2 = i | (vt9Var.g(z) ? 4 : 2) | (vt9Var.f(pair) ? 32 : 16) | (vt9Var.f(list) ? NotificationCompat.FLAG_LOCAL_ONLY : NotificationCompat.FLAG_HIGH_PRIORITY) | (vt9Var.h(eefVar) ? 2048 : 1024) | (vt9Var.h(function1) ? 16384 : 8192) | (vt9Var.h(function12) ? 131072 : 65536) | (vt9Var.h(agmVar) ? 1048576 : 524288) | (vt9Var.f(list2) ? 8388608 : 4194304) | (vt9Var.h(function13) ? 67108864 : 33554432) | (vt9Var.h(function0) ? 536870912 : 268435456);
        if (vt9Var.N(i2 & 1, (306783379 & i2) != 306783378)) {
            a4o a4oVar = w0h.g(vt9Var).a;
            unf unfVar = pof.a;
            spf spfVar = (spf) vt9Var.j(tpf.a);
            l2n l2nVar = spfVar.b;
            uga ugaVar = spfVar.a;
            l2n l2nVar2 = l2n.a;
            boolean z2 = l2nVar != l2nVar2 || z;
            if (!z2) {
                pof.b.getClass();
                f2 = 16.0f;
            } else if (ugaVar != uga.a) {
                pof.b.getClass();
                f2 = 48.0f;
            } else {
                pof.b.getClass();
                f2 = 24.0f;
            }
            float f3 = f2;
            long jK = pof.a(vt9Var).a.k();
            ikl iklVar = pof.b(vt9Var).f;
            ikl iklVar2 = pof.b(vt9Var).j;
            fsf fsfVar = z2 ? fsf.b : fsf.a;
            e8m e8mVar = gef.a;
            utk.a(null, null, jK, 0L, 0.0f, 0.0f, gyg.P(-83828725, new t8d(new qcg(jK, z2, f3, iklVar, iklVar2, fsfVar, (spfVar.b != l2nVar2 || z) ? ugaVar == uga.c ? z ? fef.l : fef.m : ugaVar == uga.b ? fef.l : fef.k : a4oVar.a >= 720 ? fef.k : fef.j, z2 && a4oVar.b >= 640), pair, function1, function12, eefVar, list, agmVar, list2, function13, function0), vt9Var), vt9Var, 12582912, 123);
        } else {
            vt9Var.Q();
        }
        znh znhVarR = vt9Var.r();
        if (znhVarR != null) {
            znhVarR.d = new sa(z, pair, list, eefVar, function1, function12, agmVar, list2, function13, function0, i);
        }
    }

    public static final View i0(f17 f17Var) {
        if (!((b8e) f17Var).a.n) {
            a8b.b("Cannot get View because the Modifier node is not currently attached.");
        }
        return p3c.a(ui6.e0(f17Var));
    }

    public static final void j(qcg qcgVar, Function1 function1, Function1 function12, eef eefVar, List list, agm agmVar, List list2, Function1 function13, c8e c8eVar, Function0 function0, ih5 ih5Var, int i) {
        aln alnVar;
        vt9 vt9Var = (vt9) ih5Var;
        vt9Var.Y(-1730846241);
        int i2 = i | (vt9Var.f(qcgVar) ? 4 : 2) | (vt9Var.h(function1) ? 32 : 16) | (vt9Var.h(function12) ? NotificationCompat.FLAG_LOCAL_ONLY : NotificationCompat.FLAG_HIGH_PRIORITY) | (vt9Var.h(eefVar) ? 2048 : 1024) | (vt9Var.f(list) ? 16384 : 8192) | (vt9Var.h(agmVar) ? 131072 : 65536) | (vt9Var.f(list2) ? 1048576 : 524288) | (vt9Var.h(function13) ? 8388608 : 4194304) | (vt9Var.f(c8eVar) ? 67108864 : 33554432) | (vt9Var.h(function0) ? 536870912 : 268435456);
        if (vt9Var.N(i2 & 1, (306783379 & i2) != 306783378)) {
            i39 i39Var = mpj.c;
            c8e c8eVarD = c8eVar.d(i39Var);
            tfd tfdVarC = nr3.c(rbe.b, false);
            int iHashCode = Long.hashCode(vt9Var.T);
            oag oagVarL = vt9Var.l();
            c8e c8eVarP = qyn.P(vt9Var, c8eVarD);
            bh5.To.getClass();
            vt9Var.a0();
            boolean z = vt9Var.S;
            fza fzaVar = m3c.S;
            if (z) {
                vt9Var.k(fzaVar);
            } else {
                vt9Var.j0();
            }
            ah5 ah5Var = ujp.f;
            y4h.o(vt9Var, tfdVarC, ah5Var);
            ah5 ah5Var2 = ujp.e;
            y4h.o(vt9Var, oagVarL, ah5Var2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            ah5 ah5Var3 = ujp.g;
            y4h.o(vt9Var, numValueOf, ah5Var3);
            y4h.m(vt9Var);
            ah5 ah5Var4 = ujp.d;
            y4h.o(vt9Var, c8eVarP, ah5Var4);
            c8e c8eVarF = yi4.F(i39Var, new oij(720.0f, 0.0f, (byte) 0));
            unf unfVar = pof.a;
            pof.b.getClass();
            o9i o9iVarA = m9i.a(new x62(24.0f, true, new t40((byte) 19)), rbe.k, vt9Var, 0);
            int iHashCode2 = Long.hashCode(vt9Var.T);
            oag oagVarL2 = vt9Var.l();
            c8e c8eVarP2 = qyn.P(vt9Var, c8eVarF);
            vt9Var.a0();
            if (vt9Var.S) {
                vt9Var.k(fzaVar);
            } else {
                vt9Var.j0();
            }
            y4h.o(vt9Var, o9iVarA, ah5Var);
            y4h.o(vt9Var, oagVarL2, ah5Var2);
            u35.j(iHashCode2, vt9Var, ah5Var3, vt9Var);
            y4h.o(vt9Var, c8eVarP2, ah5Var4);
            if (4.0f <= 0.0d) {
                y7b.a("invalid weight; must be greater than zero");
            }
            g4c g4cVar = new g4c(4.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 4.0f, true);
            tfd tfdVarC2 = nr3.c(rbe.f, false);
            int iHashCode3 = Long.hashCode(vt9Var.T);
            oag oagVarL3 = vt9Var.l();
            c8e c8eVarP3 = qyn.P(vt9Var, g4cVar);
            vt9Var.a0();
            if (vt9Var.S) {
                vt9Var.k(fzaVar);
            } else {
                vt9Var.j0();
            }
            y4h.o(vt9Var, tfdVarC2, ah5Var);
            y4h.o(vt9Var, oagVarL3, ah5Var2);
            u35.j(iHashCode3, vt9Var, ah5Var3, vt9Var);
            y4h.o(vt9Var, c8eVarP3, ah5Var4);
            fr3.c(function1, function12, (eefVar == null || (alnVar = eefVar.a) == null) ? null : alnVar.getId(), list, agmVar, qcgVar.f, qcgVar.g, vt9Var, (i2 >> 3) & 64638);
            vt9Var.p(true);
            if (6.0f <= 0.0d) {
                y7b.a("invalid weight; must be greater than zero");
            }
            c8e c8eVarD2 = new g4c(6.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 6.0f, true).d(mpj.b);
            rd3 rd3Var = rbe.n;
            db5 db5VarA = cb5.a(b72.c, rd3Var, vt9Var, 0);
            int iHashCode4 = Long.hashCode(vt9Var.T);
            oag oagVarL4 = vt9Var.l();
            c8e c8eVarP4 = qyn.P(vt9Var, c8eVarD2);
            vt9Var.a0();
            if (vt9Var.S) {
                vt9Var.k(fzaVar);
            } else {
                vt9Var.j0();
            }
            y4h.o(vt9Var, db5VarA, ah5Var);
            y4h.o(vt9Var, oagVarL4, ah5Var2);
            u35.j(iHashCode4, vt9Var, ah5Var3, vt9Var);
            y4h.o(vt9Var, c8eVarP4, ah5Var4);
            c8e c8eVarS0 = oup.s0(new g4c(1.0f, true), oup.q0(vt9Var), true, false);
            db5 db5VarA2 = cb5.a(b72.e, rd3Var, vt9Var, 6);
            int iHashCode5 = Long.hashCode(vt9Var.T);
            oag oagVarL5 = vt9Var.l();
            c8e c8eVarP5 = qyn.P(vt9Var, c8eVarS0);
            vt9Var.a0();
            if (vt9Var.S) {
                vt9Var.k(fzaVar);
            } else {
                vt9Var.j0();
            }
            y4h.o(vt9Var, db5VarA2, ah5Var);
            y4h.o(vt9Var, oagVarL5, ah5Var2);
            u35.j(iHashCode5, vt9Var, ah5Var3, vt9Var);
            y4h.o(vt9Var, c8eVarP5, ah5Var4);
            z7e z7eVar = z7e.b;
            ocp.c(vt9Var, mpj.c(z7eVar, 8.0f));
            i39 i39Var2 = mpj.a;
            ijl.b(mzg.q(vt9Var, 2132021057), a26.Z(i39Var2, 16.0f, 0.0f, 2), pof.a(vt9Var).a.f(), 0L, null, 0L, null, new pel(3), 0L, 0, false, 0, 0, qcgVar.d, vt9Var, 0, 0, 129912);
            ocp.c(vt9Var, mpj.c(z7eVar, qcgVar.c));
            ijl.b(mzg.q(vt9Var, 2132019346), a26.Z(i39Var2, 16.0f, 0.0f, 2), pof.a(vt9Var).a.f(), 0L, null, 0L, null, new pel(3), 0L, 0, false, 0, 0, qcgVar.e, vt9Var, 0, 0, 130040);
            ocp.c(vt9Var, mpj.c(z7eVar, 16.0f));
            f(list2, function13, null, vt9Var, (i2 >> 18) & 126, 4);
            ocp.c(vt9Var, mpj.c(z7eVar, 8.0f));
            vt9Var.p(true);
            scd.f(function0, mzg.q(vt9Var, 2132021629), a26.X(z7eVar, 16.0f).d(i39Var2), false, false, smf.a, rmf.b, null, null, null, null, null, null, null, vt9Var, ((i2 >> 27) & 14) | 1769472, 0, 16280);
            vt9Var = vt9Var;
            vt9Var.p(true);
            vt9Var.p(true);
            vt9Var.p(true);
        } else {
            vt9Var.Q();
        }
        znh znhVarR = vt9Var.r();
        if (znhVarR != null) {
            znhVarR.d = new t8d(qcgVar, function1, function12, eefVar, list, agmVar, list2, function13, c8eVar, function0, i);
        }
    }

    public static int j0(float f2, int i) {
        return m0(i, (int) (f2 * 255.0f));
    }

    public static final void k(qcg qcgVar, Pair pair, Function1 function1, Function1 function12, eef eefVar, List list, agm agmVar, List list2, Function1 function13, Function0 function0, c8e c8eVar, ih5 ih5Var, int i) {
        aln alnVar;
        ikl iklVar = qcgVar.e;
        vt9 vt9Var = (vt9) ih5Var;
        vt9Var.Y(-1225452051);
        int i2 = i | (vt9Var.f(qcgVar) ? 4 : 2) | (vt9Var.f(pair) ? 32 : 16) | (vt9Var.h(function1) ? NotificationCompat.FLAG_LOCAL_ONLY : NotificationCompat.FLAG_HIGH_PRIORITY) | (vt9Var.h(function12) ? 2048 : 1024) | (vt9Var.h(eefVar) ? 16384 : 8192) | (vt9Var.f(list) ? 131072 : 65536) | (vt9Var.h(agmVar) ? 1048576 : 524288) | (vt9Var.f(list2) ? 8388608 : 4194304) | (vt9Var.h(function13) ? 67108864 : 33554432) | (vt9Var.h(function0) ? 536870912 : 268435456);
        if (vt9Var.N(i2 & 1, ((i2 & 306783379) == 306783378 && ((vt9Var.f(c8eVar) ? (char) 4 : (char) 2) & 3) == 2) ? false : true)) {
            c8e c8eVarD = c8eVar.d(mpj.c);
            rd3 rd3Var = rbe.o;
            v62 v62Var = b72.c;
            db5 db5VarA = cb5.a(v62Var, rd3Var, vt9Var, 48);
            int iHashCode = Long.hashCode(vt9Var.T);
            oag oagVarL = vt9Var.l();
            c8e c8eVarP = qyn.P(vt9Var, c8eVarD);
            bh5.To.getClass();
            vt9Var.a0();
            boolean z = vt9Var.S;
            fza fzaVar = m3c.S;
            if (z) {
                vt9Var.k(fzaVar);
            } else {
                vt9Var.j0();
            }
            ah5 ah5Var = ujp.f;
            y4h.o(vt9Var, db5VarA, ah5Var);
            ah5 ah5Var2 = ujp.e;
            y4h.o(vt9Var, oagVarL, ah5Var2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            ah5 ah5Var3 = ujp.g;
            y4h.o(vt9Var, numValueOf, ah5Var3);
            y4h.m(vt9Var);
            ah5 ah5Var4 = ujp.d;
            y4h.o(vt9Var, c8eVarP, ah5Var4);
            g4c g4cVar = new g4c(1.0f, true);
            tfd tfdVarC = nr3.c(rbe.f, false);
            int iHashCode2 = Long.hashCode(vt9Var.T);
            oag oagVarL2 = vt9Var.l();
            c8e c8eVarP2 = qyn.P(vt9Var, g4cVar);
            vt9Var.a0();
            if (vt9Var.S) {
                vt9Var.k(fzaVar);
            } else {
                vt9Var.j0();
            }
            y4h.o(vt9Var, tfdVarC, ah5Var);
            y4h.o(vt9Var, oagVarL2, ah5Var2);
            u35.j(iHashCode2, vt9Var, ah5Var3, vt9Var);
            y4h.o(vt9Var, c8eVarP2, ah5Var4);
            voi voiVarQ0 = oup.q0(vt9Var);
            z7e z7eVar = z7e.b;
            c8e c8eVarS0 = oup.s0(z7eVar, voiVarQ0, true, false);
            db5 db5VarA2 = cb5.a(v62Var, rbe.n, vt9Var, 0);
            int iHashCode3 = Long.hashCode(vt9Var.T);
            oag oagVarL3 = vt9Var.l();
            c8e c8eVarP3 = qyn.P(vt9Var, c8eVarS0);
            vt9Var.a0();
            if (vt9Var.S) {
                vt9Var.k(fzaVar);
            } else {
                vt9Var.j0();
            }
            y4h.o(vt9Var, db5VarA2, ah5Var);
            y4h.o(vt9Var, oagVarL3, ah5Var2);
            u35.j(iHashCode3, vt9Var, ah5Var3, vt9Var);
            y4h.o(vt9Var, c8eVarP3, ah5Var4);
            unf unfVar = pof.a;
            pof.b.getClass();
            ocp.c(vt9Var, mpj.c(z7eVar, 16.0f));
            c8e c8eVarM = j7h.m(vt9Var, z7eVar);
            i39 i39Var = mpj.a;
            c8e c8eVarZ = a26.Z(mpj.n(c8eVarM.d(i39Var), 3), 16.0f, 0.0f, 2);
            String strQ = mzg.q(vt9Var, 2132021057);
            long jF = pof.a(vt9Var).a.f();
            ikl iklVar2 = qcgVar.d;
            float f2 = qcgVar.c;
            ijl.b(strQ, c8eVarZ, jF, 0L, null, 0L, null, new pel(3), 0L, 0, false, 0, 0, iklVar2, vt9Var, 0, 0, 129912);
            ocp.c(vt9Var, mpj.c(z7eVar, f2));
            ijl.b(mzg.q(vt9Var, 2132018221), a26.Z(j7h.m(vt9Var, z7eVar).d(i39Var), 16.0f, 0.0f, 2), pof.a(vt9Var).a.f(), 0L, null, 0L, null, new pel(3), 0L, 0, false, 0, 0, iklVar, vt9Var, 0, 0, 130040);
            ocp.c(vt9Var, mpj.c(z7eVar, 16.0f));
            fr3.c(function1, function12, (eefVar == null || (alnVar = eefVar.a) == null) ? null : alnVar.getId(), list, agmVar, qcgVar.f, qcgVar.g, vt9Var, (i2 >> 6) & 64638);
            ocp.c(vt9Var, mpj.c(z7eVar, f2));
            ijl.b(mzg.q(vt9Var, 2132019346), a26.Z(j7h.m(vt9Var, z7eVar).d(i39Var), 16.0f, 0.0f, 2), pof.a(vt9Var).a.f(), 0L, null, 0L, null, new pel(3), 0L, 0, false, 0, 0, iklVar, vt9Var, 0, 0, 130040);
            vt9 vt9Var2 = vt9Var;
            ocp.c(vt9Var2, mpj.c(z7eVar, 16.0f));
            f(list2, function13, j7h.m(vt9Var2, z7eVar), vt9Var2, (i2 >> 21) & 126, 0);
            ocp.c(vt9Var2, mpj.c(z7eVar, 16.0f));
            vt9Var2.p(true);
            vt9Var2.p(true);
            if (qcgVar.h) {
                vt9Var2.W(-150162537);
                rnf.b(((Number) pair.a).intValue(), ((Number) pair.b).intValue(), a26.Z(z7eVar, 0.0f, 16.0f, 1), 0L, 0L, vt9Var2, 0);
                vt9Var2 = vt9Var2;
                vt9Var2.p(false);
            } else {
                vt9Var2.W(-149939585);
                vt9Var2.p(false);
            }
            vt9 vt9Var3 = vt9Var2;
            scd.f(function0, mzg.q(vt9Var2, 2132021629), a26.X(j7h.m(vt9Var2, z7eVar), 16.0f).d(i39Var), false, false, smf.a, rmf.b, null, null, null, null, null, null, null, vt9Var3, ((i2 >> 27) & 14) | 1769472, 0, 16280);
            vt9Var = vt9Var3;
            vt9Var.p(true);
        } else {
            vt9Var.Q();
        }
        znh znhVarR = vt9Var.r();
        if (znhVarR != null) {
            znhVarR.d = new w2(qcgVar, pair, function1, function12, eefVar, list, agmVar, list2, function13, function0, c8eVar, i);
        }
    }

    public static final void k0(View.OnClickListener onClickListener, View view) {
        view.setClickable(true);
        GestureDetector gestureDetector = new GestureDetector(view.getContext(), (GestureDetector.OnGestureListener) new sgh(onClickListener, view));
        gestureDetector.setIsLongpressEnabled(false);
        view.setOnTouchListener(new vfe(gestureDetector, (byte) 2));
    }

    public static void l(long[] jArr, long[] jArr2, long[] jArr3) {
        for (int i = 0; i < 9; i++) {
            jArr3[i] = jArr[i] ^ jArr2[i];
        }
    }

    public static final void l0(int i, View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (i == layoutParams.height) {
            return;
        }
        layoutParams.height = i;
        view.setLayoutParams(layoutParams);
    }

    public static void m(long[] jArr, int i, long[] jArr2, int i2, long[] jArr3, int i3) {
        for (int i4 = 0; i4 < 9; i4++) {
            int i5 = i3 + i4;
            jArr3[i5] = jArr3[i5] ^ (jArr[i + i4] ^ jArr2[i2 + i4]);
        }
    }

    public static int m0(int i, int i2) {
        return Color.argb(i2, Color.red(i), Color.green(i), Color.blue(i));
    }

    public static void n(long[] jArr, long[] jArr2, long[] jArr3) {
        for (int i = 0; i < 9; i++) {
            jArr3[i] = jArr3[i] ^ (jArr[i] ^ jArr2[i]);
        }
    }

    public static final void n0(View view, int i, int i2, int i3, int i4) {
        boolean z;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams != null) {
            boolean z2 = true;
            if (i == Integer.MIN_VALUE || marginLayoutParams.leftMargin == i) {
                z = false;
            } else {
                marginLayoutParams.leftMargin = i;
                z = true;
            }
            if (i2 != Integer.MIN_VALUE && marginLayoutParams.topMargin != i2) {
                marginLayoutParams.topMargin = i2;
                z = true;
            }
            if (i3 != Integer.MIN_VALUE && marginLayoutParams.rightMargin != i3) {
                marginLayoutParams.rightMargin = i3;
                z = true;
            }
            if (i4 == Integer.MIN_VALUE || marginLayoutParams.bottomMargin == i4) {
                z2 = z;
            } else {
                marginLayoutParams.bottomMargin = i4;
            }
            if (z2) {
                view.setLayoutParams(marginLayoutParams);
            }
        }
    }

    public static void o(long[] jArr, long[] jArr2, long[] jArr3) {
        for (int i = 0; i < 18; i++) {
            jArr3[i] = jArr[i] ^ jArr2[i];
        }
    }

    public static /* synthetic */ void o0(View view, int i, int i2, int i3, int i4, int i5) {
        if ((i5 & 1) != 0) {
            i = Integer.MIN_VALUE;
        }
        if ((i5 & 2) != 0) {
            i2 = Integer.MIN_VALUE;
        }
        if ((i5 & 4) != 0) {
            i3 = Integer.MIN_VALUE;
        }
        if ((i5 & 8) != 0) {
            i4 = Integer.MIN_VALUE;
        }
        n0(view, i, i2, i3, i4);
    }

    public static o94 p(cd5 cd5Var) {
        l94 l94Var = new l94();
        l94Var.c = new byh();
        o94 o94Var = new o94(l94Var);
        l94Var.b = o94Var;
        l94Var.a = vep.class;
        try {
            cd5Var.s(new cv2(l94Var, cd5Var, (byte) 21));
            l94Var.a = "Deferred.asListenableFuture";
            return o94Var;
        } catch (Exception e2) {
            o94Var.a(e2);
            return o94Var;
        }
    }

    public static final void p0(int i, View view) {
        view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight(), i);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object q(cd5 r5, long r6, nt5 r8) {
        /*
            boolean r0 = r8 instanceof bx5
            if (r0 == 0) goto L13
            r0 = r8
            bx5 r0 = (bx5) r0
            int r1 = r0.u
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.u = r1
            goto L18
        L13:
            bx5 r0 = new bx5
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.t
            px5 r1 = px5.a
            int r2 = r0.u
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L2e
            if (r2 != r4) goto L28
            defpackage.ybh.y(r8)
            goto L3f
        L28:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            qp2.n(r5)
            return r3
        L2e:
            defpackage.ybh.y(r8)
            w94 r8 = new w94
            r8.<init>(r5, r3, r4)
            r0.u = r4
            java.lang.Object r8 = uyg.w(r6, r8, r0)
            if (r8 != r1) goto L3f
            return r1
        L3f:
            if (r8 != 0) goto L42
            r4 = 0
        L42:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r4)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.p37.q(cd5, long, nt5):java.lang.Object");
    }

    public static final void q0(int i, View view) {
        view.setPadding(view.getPaddingLeft(), i, view.getPaddingRight(), view.getPaddingBottom());
    }

    public static int r(int i, int i2) {
        ha5[] ha5VarArr = ha5.a;
        int i3 = (i >> 24) & 255;
        int i4 = (i >> 16) & 255;
        int i5 = (i >> 8) & 255;
        int i6 = i & 255;
        int i7 = (i2 >> 24) & 255;
        return (((i3 + i7) - ((i3 * i7) / 255)) << 24) | (((((((i2 >> 16) & 255) - i4) * i7) / 255) + i4) << 16) | (((((((i2 >> 8) & 255) - i5) * i7) / 255) + i5) << 8) | (((((i2 & 255) - i6) * i7) / 255) + i6);
    }

    public static final void r0(View.OnClickListener onClickListener, View view) {
        view.setOnClickListener(new ks8(onClickListener, (byte) 2));
    }

    public static void s(String str, boolean z) throws s1g {
        if (!z) {
            throw s1g.d(str, null);
        }
    }

    public static final void s0(View view, int i, int i2) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            view.setLayoutParams(new ViewGroup.LayoutParams(i, i2));
        } else {
            if (layoutParams.width == i && layoutParams.height == i2) {
                return;
            }
            layoutParams.width = i;
            layoutParams.height = i2;
            view.setLayoutParams(layoutParams);
        }
    }

    public static float t(int i) {
        return ((i & 255) * 4.4705882E-4f) + (((i >> 8) & 255) * 0.0023019607f) + (((i >> 16) & 255) * 0.001172549f);
    }

    public static final void t0(int i, View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (i == layoutParams.width) {
            return;
        }
        layoutParams.width = i;
        view.setLayoutParams(layoutParams);
    }

    public static double[] u(int i) {
        double[] dArr = {Math.max(0.0d, (116.0d * dK) - 16.0d), (dK - dK) * 500.0d, (dK - dK) * 200.0d};
        ab5.b(Color.red(i), Color.green(i), Color.blue(i), dArr);
        double d2 = dArr[0];
        double d3 = dArr[1];
        double d4 = dArr[2];
        double dK = ab5.k(d2 / 95.047d);
        double dK2 = ab5.k(d3 / 100.0d);
        double dK3 = ab5.k(d4 / 108.883d);
        return dArr;
    }

    public static boolean u0(int i) {
        return t(i) > 0.6f;
    }

    public static int v(a35 a35Var) {
        switch (a35Var.ordinal()) {
            case 0:
            case 1:
            case 5:
            case 8:
            case 12:
            case 14:
            case 15:
                s49.l(a35Var, "Unsupported category: ");
                return 0;
            case 2:
                return 2;
            case 3:
                return 8;
            case 4:
                return 4;
            case 6:
                return 3;
            case 7:
                return 6;
            case 9:
                return 5;
            case 10:
                return 1;
            case 11:
                return 7;
            case 13:
                return 9;
            default:
                h9o.p();
                return 0;
        }
    }

    public static String v0(int i, String str, String str2) {
        return str.substring(0, i) + str2 + str.substring(i + 10);
    }

    public static int w(a35 a35Var) {
        switch (a35Var.ordinal()) {
            case 0:
                return 10;
            case 1:
                return 5;
            case 2:
                return 1;
            case 3:
                return 9;
            case 4:
                return 3;
            case 5:
                return 8;
            case 6:
                return 2;
            case 7:
                return 4;
            case 8:
                return 11;
            case 9:
                return 12;
            case 10:
                return 0;
            case 11:
                return 6;
            case 12:
                return 7;
            case 13:
                return 13;
            case 14:
                return 14;
            case 15:
                return 15;
            default:
                h9o.p();
                return 0;
        }
    }

    public static void w0(long[] jArr, long[] jArr2) {
        long[] jArr3 = new long[18];
        Q(jArr, jArr3);
        g0(jArr3, jArr2);
    }

    public static sfb x(orb orbVar) throws JSONException {
        wfb wfbVar;
        wfb wfbVar2;
        long j;
        JSONObject jSONObject = orbVar.a;
        long j2 = jSONObject.getLong("chatId");
        String strE = orbVar.e("title");
        String strM = orbVar.m("userId", (String) null);
        boolean z = jSONObject.getBoolean("hasContent");
        Boolean boolK = orbVar.k("isPrivate");
        orb orbVarI = orbVar.i("modifiers");
        qu4 qu4VarI = orbVarI != null ? sfe.I(orbVarI) : null;
        String strM2 = orbVar.m("conversationId", (String) null);
        ArrayList arrayList = new ArrayList();
        JSONArray jSONArray = orbVar.b("items").a;
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            arrayList.add(Long.valueOf(jSONArray.getLong(i)));
        }
        long j3 = jSONObject.getLong("created");
        long j4 = jSONObject.getLong("modified");
        String strE2 = orbVar.e("state");
        wfb[] wfbVarArrValues = wfb.values();
        int length2 = wfbVarArrValues.length;
        int i2 = 0;
        while (true) {
            if (i2 >= length2) {
                wfbVar = wfb.b;
                break;
            }
            int i3 = i2;
            wfbVar = wfbVarArrValues[i3];
            int i4 = length2;
            if (wfbVar != wfb.b && strE2.equals(wfbVar.a)) {
                break;
            }
            i2 = i3 + 1;
            length2 = i4;
        }
        vpb vpbVarH = orbVar.h("webpageContext");
        ArrayList arrayList2 = vpbVarH != null ? new ArrayList() : null;
        if (arrayList2 == null || vpbVarH == null) {
            wfbVar2 = wfbVar;
            j = j2;
        } else {
            wfbVar2 = wfbVar;
            int length3 = vpbVarH.a.length();
            j = j2;
            int i5 = 0;
            while (i5 < length3) {
                arrayList2.add(new xfb(vpbVarH.c(i5).e("id")));
                i5++;
                vpbVarH = vpbVarH;
            }
        }
        return new sfb(j, strE, strM, z, boolK, qu4VarI, strM2, arrayList, j3, j4, wfbVar2, arrayList2, orbVar.m("blob", (String) null));
    }

    public static void x0(long[] jArr, long[] jArr2, int i) {
        long[] jArr3 = new long[18];
        Q(jArr, jArr3);
        while (true) {
            g0(jArr3, jArr2);
            i--;
            if (i <= 0) {
                return;
            } else {
                Q(jArr2, jArr3);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:44:0x00d7 -> B:45:0x00db). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object y(d44 r8, java.nio.channels.WritableByteChannel r9, long r10, nt5 r12) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 261
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.p37.y(d44, java.nio.channels.WritableByteChannel, long, nt5):java.lang.Object");
    }

    public static boolean y0(String str) {
        return str == null || str.isEmpty();
    }

    public static final kze z(View view) {
        return (kze) new z61(view).b;
    }

    public static final ec z0(xh1 xh1Var) {
        String str = xh1Var.a;
        gpm gpmVarG = bwg.G(xh1Var.b);
        wh1 wh1Var = xh1Var.c;
        int i = wh1Var == null ? -1 : gi1.b[wh1Var.ordinal()];
        cc ccVar = null;
        if (i != -1) {
            if (i == 1) {
                ccVar = cc.b;
            } else {
                if (i != 2) {
                    h9o.p();
                    return null;
                }
                ccVar = cc.c;
            }
        }
        return new ec(str, gpmVarG, ccVar);
    }
}
