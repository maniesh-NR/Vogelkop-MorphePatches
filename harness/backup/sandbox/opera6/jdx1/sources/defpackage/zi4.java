package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.net.Uri;
import android.provider.Settings;
import android.text.Layout;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.ImageView;
import androidx.core.app.NotificationCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* loaded from: classes.dex */
public abstract class zi4 implements m94 {
    public static int v;
    public static final ue5 a = new ue5(1605384865, new cf5((byte) 15), false);
    public static final ue5 b = new ue5(1457293888, new cf5((byte) 16), false);
    public static final ue5 c = new ue5(2119223443, new cf5((byte) 17), false);
    public static final ue5 d = new ue5(676814647, new ef5((byte) 5), false);
    public static final ue5 e = new ue5(1096285280, new bf5((byte) 1), false);
    public static final ue5 f = new ue5(246684613, new ef5((byte) 6), false);
    public static final ue5 g = new ue5(-480856895, new ef5((byte) 7), false);
    public static final ue5 h = new ue5(126327601, new ef5((byte) 8), false);
    public static final ue5 i = new ue5(-1637681634, new ef5((byte) 9), false);
    public static final int[] j = {-1, -1, -1, -1, -1, -1, -1, -2, -1, -1, -1, -1, -1, -1};
    public static final int[] k = {118276190, 40534716, 9670182, 135141552, 85017403, 259173222, 68333082, 171784774, 174973732, 15824510, 73756743, 57518561, 94773951, 248652241, 107736333, 82941708};
    public static final int[] l = {36764180, 8885695, 130592152, 20104429, 163904957, 30304195, 121295871, 5901357, 125344798, 171541512, 175338348, 209069246, 3626697, 38307682, 24032956, 110359655};
    public static final int[] m = {110141154, 30892124, 160820362, 264558960, 217232225, 47722141, 19029845, 8326902, 183409749, 170134547, 90340180, 222600478, 61097333, 7431335, 198491505, 102372861};
    public static final int[] n = {221945828, 50763449, 132637478, 109250759, 216053960, 61612587, 50649998, 138339097, 98949899, 248139835, 186410297, 126520782, 47339196, 78164062, 198835543, 169622712};
    public static final Object o = new Object();
    public static f1p[] p = null;
    public static f1p[] q = null;
    public static int[] r = null;
    public static final int[] s = {-1, -1, -1, 0, 0, 0, 1, -1};
    public static final int[] t = {1, 0, 0, -2, -1, -1, -2, 1, -2, 1, -2, 1, 1, -2, 2, -2};
    public static final Object u = new Object();
    public static final eko w = new eko(22);

    public static String A(Context context) {
        String string = Settings.Secure.getString(context.getContentResolver(), "android_id");
        if (string == null) {
            return null;
        }
        return f8a.h.a(string);
    }

    public static final int B(Layout layout, int i2, boolean z) {
        if (i2 <= 0) {
            return 0;
        }
        if (i2 >= layout.getText().length()) {
            return layout.getLineCount() - 1;
        }
        int lineForOffset = layout.getLineForOffset(i2);
        return layout.getLineStart(lineForOffset) != i2 ? (layout.getLineEnd(lineForOffset) != i2 || z) ? lineForOffset : lineForOffset + 1 : z ? lineForOffset - 1 : lineForOffset;
    }

    public static final d9e C(CoroutineContext coroutineContext) {
        d9e d9eVar = (d9e) coroutineContext.get(ujp.k);
        if (d9eVar != null) {
            return d9eVar;
        }
        qp2.n("A MonotonicFrameClock is not available in this CoroutineContext. Callers should supply an appropriate MonotonicFrameClock using withContext.");
        return null;
    }

    public static void D(g77[] g77VarArr) {
        int length = g77VarArr.length;
        int[] iArr = new int[length << 4];
        int[] iArr2 = new int[16];
        k1g.m(0, 0, (int[]) g77VarArr[0].c, iArr2);
        k1g.m(0, 0, iArr2, iArr);
        int i2 = 0;
        while (true) {
            int i3 = i2 + 1;
            if (i3 >= length) {
                break;
            }
            k1g.L(iArr2, (int[]) g77VarArr[i3].c, iArr2);
            k1g.m(0, i3 << 4, iArr2, iArr);
            i2 = i3;
        }
        int[] iArr3 = new int[16];
        int[] iArr4 = new int[14];
        k1g.m(0, 0, iArr2, iArr3);
        k1g.b0(1, iArr3);
        k1g.b0(-1, iArr3);
        k1g.q(0, 0, iArr3, iArr4);
        k1g.q(8, 7, iArr3, iArr4);
        scd.V(k1g.g, iArr4, iArr4);
        k1g.o(0, 0, iArr4, iArr2);
        k1g.o(7, 8, iArr4, iArr2);
        int[] iArr5 = new int[16];
        while (i2 > 0) {
            int i4 = i2 - 1;
            k1g.m(i4 << 4, 0, iArr, iArr5);
            k1g.L(iArr5, iArr2, iArr5);
            k1g.L(iArr2, (int[]) g77VarArr[i2].c, iArr2);
            k1g.m(0, 0, iArr5, (int[]) g77VarArr[i2].c);
            i2 = i4;
        }
        k1g.m(0, 0, iArr2, (int[]) g77VarArr[0].c);
    }

    public static boolean E(Uri uri) {
        String scheme = uri.normalizeScheme().getScheme();
        return "file".equals(scheme) || "content".equals(scheme);
    }

    public static final c8e G(f5c f5cVar, nv6 nv6Var, fsf fsfVar) {
        return new b5c(f5cVar, nv6Var, fsfVar);
    }

    public static dd1 H(vsb vsbVar, p2d p2dVar) {
        return new dd1(cwb.a(vsbVar, p2dVar, 1.0f, ydp.c, false), (byte) 0);
    }

    public static ed1 I(esb esbVar, p2d p2dVar, boolean z) {
        return new ed1(cwb.a(esbVar, p2dVar, z ? dzm.c() : 1.0f, ydp.e, false), (byte) 3);
    }

    public static dd1 J(vsb vsbVar, p2d p2dVar, int i2) {
        sa2 sa2Var = new sa2((byte) 11, false);
        sa2Var.b = i2;
        ArrayList arrayListA = cwb.a(vsbVar, p2dVar, 1.0f, sa2Var, false);
        for (int i3 = 0; i3 < arrayListA.size(); i3++) {
            zvb zvbVar = (zvb) arrayListA.get(i3);
            g2a g2aVar = (g2a) zvbVar.b;
            g2a g2aVar2 = (g2a) zvbVar.c;
            if (g2aVar != null && g2aVar2 != null) {
                float[] fArr = g2aVar.a;
                int length = fArr.length;
                float[] fArr2 = g2aVar2.a;
                if (length != fArr2.length) {
                    int length2 = fArr.length + fArr2.length;
                    float[] fArr3 = new float[length2];
                    System.arraycopy(fArr, 0, fArr3, 0, fArr.length);
                    System.arraycopy(fArr2, 0, fArr3, fArr.length, fArr2.length);
                    Arrays.sort(fArr3);
                    float f2 = Float.NaN;
                    int i4 = 0;
                    for (int i5 = 0; i5 < length2; i5++) {
                        float f3 = fArr3[i5];
                        if (f3 != f2) {
                            fArr3[i4] = f3;
                            i4++;
                            f2 = fArr3[i5];
                        }
                    }
                    float[] fArrCopyOfRange = Arrays.copyOfRange(fArr3, 0, i4);
                    zvbVar = new zvb(g2aVar.a(fArrCopyOfRange), g2aVar2.a(fArrCopyOfRange));
                }
            }
            arrayListA.set(i3, zvbVar);
        }
        return new dd1(arrayListA, (byte) 1);
    }

    public static dd1 K(vsb vsbVar, p2d p2dVar) {
        return new dd1(cwb.a(vsbVar, p2dVar, 1.0f, ydp.f, false), (byte) 2);
    }

    public static dd1 L(vsb vsbVar, p2d p2dVar) {
        return new dd1(cwb.a(vsbVar, p2dVar, dzm.c(), y55.f, true), (byte) 3);
    }

    public static final apc M(String str) {
        if (Intrinsics.a(str, "football")) {
            return apc.c;
        }
        if (Intrinsics.a(str, "basketball")) {
            return apc.d;
        }
        qp2.o(sko.j("Unknown sport: ", str));
        return null;
    }

    public static void N(g77 g77Var, g77 g77Var2, p12 p12Var) {
        int[] iArr = (int[]) p12Var.a;
        int[] iArr2 = (int[]) p12Var.b;
        int[] iArr3 = (int[]) p12Var.c;
        int[] iArr4 = (int[]) p12Var.d;
        int[] iArr5 = (int[]) p12Var.e;
        int[] iArr6 = (int[]) p12Var.f;
        int[] iArr7 = (int[]) p12Var.g;
        int[] iArr8 = (int[]) p12Var.h;
        k1g.L((int[]) g77Var.c, (int[]) g77Var2.c, iArr);
        k1g.d0(iArr, iArr2);
        int[] iArr9 = (int[]) g77Var.a;
        int[] iArr10 = (int[]) g77Var2.a;
        k1g.L(iArr9, iArr10, iArr3);
        int[] iArr11 = (int[]) g77Var.b;
        int[] iArr12 = (int[]) g77Var2.b;
        k1g.L(iArr11, iArr12, iArr4);
        k1g.L(iArr3, iArr4, iArr5);
        k1g.K(iArr5, iArr5);
        k1g.g(iArr2, iArr5, iArr6);
        k1g.g0(iArr2, iArr5, iArr7);
        k1g.g(iArr11, iArr9, iArr8);
        k1g.g(iArr12, iArr10, iArr5);
        k1g.L(iArr8, iArr5, iArr8);
        k1g.g(iArr4, iArr3, iArr2);
        k1g.g0(iArr4, iArr3, iArr5);
        k1g.k(iArr2);
        k1g.g0(iArr8, iArr2, iArr8);
        k1g.L(iArr8, iArr, iArr8);
        k1g.L(iArr5, iArr, iArr5);
        k1g.L(iArr6, iArr8, iArr10);
        k1g.L(iArr5, iArr7, iArr12);
        k1g.L(iArr6, iArr7, (int[]) g77Var2.c);
    }

    public static void O(g77 g77Var, g77 g77Var2) {
        k1g.m(0, 0, (int[]) g77Var.a, (int[]) g77Var2.a);
        k1g.m(0, 0, (int[]) g77Var.b, (int[]) g77Var2.b);
        k1g.m(0, 0, (int[]) g77Var.c, (int[]) g77Var2.c);
    }

    public static void P(f1p f1pVar, g77 g77Var) {
        k1g.m(0, 0, (int[]) f1pVar.a, (int[]) g77Var.a);
        k1g.m(0, 0, (int[]) f1pVar.b, (int[]) g77Var.b);
        int[] iArr = (int[]) g77Var.c;
        iArr[0] = 1;
        for (int i2 = 1; i2 < 16; i2++) {
            iArr[i2] = 0;
        }
    }

    public static void Q(g77 g77Var, p12 p12Var) {
        int[] iArr = (int[]) p12Var.b;
        int[] iArr2 = (int[]) p12Var.c;
        int[] iArr3 = (int[]) p12Var.d;
        int[] iArr4 = (int[]) p12Var.e;
        int[] iArr5 = (int[]) p12Var.h;
        int[] iArr6 = (int[]) p12Var.a;
        int[] iArr7 = (int[]) g77Var.a;
        int[] iArr8 = (int[]) g77Var.b;
        k1g.g(iArr7, iArr8, iArr);
        k1g.d0(iArr, iArr);
        k1g.d0(iArr7, iArr2);
        k1g.d0(iArr8, iArr3);
        k1g.g(iArr2, iArr3, iArr4);
        k1g.k(iArr4);
        int[] iArr9 = (int[]) g77Var.c;
        k1g.d0(iArr9, iArr5);
        k1g.g(iArr5, iArr5, iArr5);
        k1g.k(iArr5);
        k1g.g0(iArr4, iArr5, iArr6);
        k1g.g0(iArr, iArr4, iArr);
        k1g.g0(iArr2, iArr3, iArr2);
        k1g.L(iArr, iArr6, iArr7);
        k1g.L(iArr4, iArr2, iArr8);
        k1g.L(iArr4, iArr6, iArr9);
    }

    public static void R(f1p f1pVar, g77[] g77VarArr, int i2, p12 p12Var) {
        g77 g77Var = new g77((byte) 5);
        P(f1pVar, g77Var);
        Q(g77Var, p12Var);
        g77 g77Var2 = new g77((byte) 5);
        g77VarArr[i2] = g77Var2;
        P(f1pVar, g77Var2);
        for (int i3 = 1; i3 < 32; i3++) {
            int i4 = i2 + i3;
            g77 g77Var3 = new g77((byte) 5);
            g77VarArr[i4] = g77Var3;
            O(g77VarArr[i4 - 1], g77Var3);
            N(g77Var, g77VarArr[i4], p12Var);
        }
    }

    public static void S(byte[] bArr, byte[] bArr2) {
        System.arraycopy(bArr, 0, bArr2, 0, 56);
        bArr2[0] = (byte) (bArr2[0] & 252);
        bArr2[55] = (byte) (bArr2[55] | 128);
        bArr2[56] = 0;
    }

    public static void T(int[] iArr, int[] iArr2) {
        long j2 = iArr[9] & 4294967295L;
        long j3 = iArr[10] & 4294967295L;
        long j4 = iArr[11] & 4294967295L;
        long j5 = iArr[12] & 4294967295L;
        long j6 = iArr[13] & 4294967295L;
        long j7 = iArr[14] & 4294967295L;
        long j8 = iArr[15] & 4294967295L;
        long j9 = (iArr[8] & 4294967295L) - 6;
        long j10 = j9 + j2;
        long j11 = j2 + j3;
        long j12 = (j3 + j4) - j8;
        long j13 = j4 + j5;
        long j14 = j5 + j6;
        long j15 = j6 + j7;
        long j16 = j7 + j8;
        long j17 = j15 - j10;
        long j18 = ((iArr[0] & 4294967295L) - j13) - j17;
        iArr2[0] = (int) j18;
        long j19 = ((((iArr[1] & 4294967295L) + j11) - j14) - j16) + (j18 >> 32);
        iArr2[1] = (int) j19;
        long j20 = (((iArr[2] & 4294967295L) + j12) - j15) + (j19 >> 32);
        iArr2[2] = (int) j20;
        long j21 = ((((iArr[3] & 4294967295L) + (j13 << 1)) + j17) - j16) + (j20 >> 32);
        iArr2[3] = (int) j21;
        long j22 = ((((iArr[4] & 4294967295L) + (j14 << 1)) + j7) - j11) + (j21 >> 32);
        iArr2[4] = (int) j22;
        long j23 = (((iArr[5] & 4294967295L) + (j15 << 1)) - j12) + (j22 >> 32);
        iArr2[5] = (int) j23;
        long j24 = (iArr[6] & 4294967295L) + (j16 << 1) + j17 + (j23 >> 32);
        iArr2[6] = (int) j24;
        long j25 = (((((iArr[7] & 4294967295L) + (j8 << 1)) + j9) - j12) - j14) + (j24 >> 32);
        iArr2[7] = (int) j25;
        U((int) ((j25 >> 32) + 6), iArr2);
    }

    public static void U(int i2, int[] iArr) {
        long j2;
        if (i2 != 0) {
            long j3 = i2 & 4294967295L;
            long j4 = (iArr[0] & 4294967295L) + j3;
            iArr[0] = (int) j4;
            long j5 = j4 >> 32;
            if (j5 != 0) {
                long j6 = j5 + (iArr[1] & 4294967295L);
                iArr[1] = (int) j6;
                long j7 = (j6 >> 32) + (iArr[2] & 4294967295L);
                iArr[2] = (int) j7;
                j5 = j7 >> 32;
            }
            long j8 = ((iArr[3] & 4294967295L) - j3) + j5;
            iArr[3] = (int) j8;
            long j9 = j8 >> 32;
            if (j9 != 0) {
                long j10 = j9 + (iArr[4] & 4294967295L);
                iArr[4] = (int) j10;
                long j11 = (j10 >> 32) + (iArr[5] & 4294967295L);
                iArr[5] = (int) j11;
                j9 = j11 >> 32;
            }
            long j12 = ((iArr[6] & 4294967295L) - j3) + j9;
            iArr[6] = (int) j12;
            long j13 = (iArr[7] & 4294967295L) + j3 + (j12 >> 32);
            iArr[7] = (int) j13;
            j2 = j13 >> 32;
        } else {
            j2 = 0;
        }
        if (j2 != 0 || (iArr[7] == -1 && o0g.a0(iArr, s))) {
            j(iArr);
        }
    }

    public static void V(byte[] bArr, g77 g77Var) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        synchronized (o) {
            i2 = 14;
            int i7 = 4;
            i3 = 5;
            int i8 = 0;
            if (r != null) {
                i4 = 4;
                i5 = 1;
            } else {
                g77[] g77VarArr = new g77[144];
                p12 p12Var = new p12((byte) 3);
                f1p f1pVar = new f1p((byte) 14);
                k1g.m(0, 0, k, (int[]) f1pVar.a);
                k1g.m(0, 0, l, (int[]) f1pVar.b);
                R(f1pVar, g77VarArr, 0, p12Var);
                f1p f1pVar2 = new f1p((byte) 14);
                k1g.m(0, 0, m, (int[]) f1pVar2.a);
                k1g.m(0, 0, n, (int[]) f1pVar2.b);
                R(f1pVar2, g77VarArr, 32, p12Var);
                g77 g77Var2 = new g77((byte) 5);
                P(f1pVar, g77Var2);
                g77[] g77VarArr2 = new g77[5];
                for (int i9 = 0; i9 < 5; i9++) {
                    g77VarArr2[i9] = new g77((byte) 5);
                }
                int i10 = 0;
                int i11 = 64;
                while (i10 < 5) {
                    g77 g77Var3 = new g77((byte) 5);
                    for (int i12 = i8; i12 < 5; i12++) {
                        if (i12 == 0) {
                            O(g77Var2, g77Var3);
                        } else {
                            N(g77Var2, g77Var3, p12Var);
                        }
                        Q(g77Var2, p12Var);
                        O(g77Var2, g77VarArr2[i12]);
                        if (i10 + i12 != 8) {
                            for (int i13 = 1; i13 < 18; i13++) {
                                Q(g77Var2, p12Var);
                            }
                        }
                    }
                    int[] iArr = (int[]) g77Var3.a;
                    k1g.g0(new int[16], iArr, iArr);
                    g77VarArr[i11] = g77Var3;
                    i11++;
                    for (int i14 = 0; i14 < i7; i14++) {
                        int i15 = 1 << i14;
                        int i16 = 0;
                        while (i16 < i15) {
                            g77 g77Var4 = new g77((byte) 5);
                            g77VarArr[i11] = g77Var4;
                            O(g77VarArr[i11 - i15], g77Var4);
                            N(g77VarArr2[i14], g77VarArr[i11], p12Var);
                            i16++;
                            i11++;
                            i7 = i7;
                        }
                    }
                    i10++;
                    i8 = 0;
                }
                i4 = i7;
                i5 = 1;
                D(g77VarArr);
                p = new f1p[32];
                for (int i17 = 0; i17 < 32; i17++) {
                    g77 g77Var5 = g77VarArr[i17];
                    f1p f1pVar3 = new f1p((byte) 14);
                    k1g.L((int[]) g77Var5.a, (int[]) g77Var5.c, (int[]) f1pVar3.a);
                    k1g.P((int[]) f1pVar3.a);
                    k1g.L((int[]) g77Var5.b, (int[]) g77Var5.c, (int[]) f1pVar3.b);
                    k1g.P((int[]) f1pVar3.b);
                    p[i17] = f1pVar3;
                }
                q = new f1p[32];
                for (int i18 = 0; i18 < 32; i18++) {
                    g77 g77Var6 = g77VarArr[32 + i18];
                    f1p f1pVar4 = new f1p((byte) 14);
                    k1g.L((int[]) g77Var6.a, (int[]) g77Var6.c, (int[]) f1pVar4.a);
                    k1g.P((int[]) f1pVar4.a);
                    k1g.L((int[]) g77Var6.b, (int[]) g77Var6.c, (int[]) f1pVar4.b);
                    k1g.P((int[]) f1pVar4.b);
                    q[i18] = f1pVar4;
                }
                r = new int[2560];
                int i19 = 0;
                for (int i20 = 64; i20 < 144; i20++) {
                    g77 g77Var7 = g77VarArr[i20];
                    int[] iArr2 = (int[]) g77Var7.a;
                    k1g.L(iArr2, (int[]) g77Var7.c, iArr2);
                    k1g.P((int[]) g77Var7.a);
                    int[] iArr3 = (int[]) g77Var7.b;
                    k1g.L(iArr3, (int[]) g77Var7.c, iArr3);
                    k1g.P((int[]) g77Var7.b);
                    k1g.m(0, i19, (int[]) g77Var7.a, r);
                    k1g.m(0, i19 + 16, (int[]) g77Var7.b, r);
                    i19 += 32;
                }
            }
        }
        int i21 = 15;
        int[] iArr4 = new int[15];
        for (int i22 = 0; i22 < 14; i22++) {
            iArr4[i22] = c26.l(i22 << 2, bArr);
        }
        int i23 = ~iArr4[0];
        int[] iArr5 = vtp.f;
        long j2 = 4294967295L;
        long j3 = (-(i23 & 1)) & 4294967295L;
        long j4 = 0;
        int i24 = 0;
        while (i24 < i2) {
            int i25 = i21;
            long j5 = (iArr4[i24] & j2) + (iArr5[i24] & j3) + j4;
            iArr4[i24] = (int) j5;
            j4 = j5 >>> 32;
            i24++;
            i2 = i2;
            i21 = i25;
            j2 = 4294967295L;
        }
        iArr4[i2] = i4 + ((int) j4);
        int i26 = 0;
        while (true) {
            i21--;
            if (i21 < 0) {
                break;
            }
            int i27 = iArr4[i21];
            iArr4[i21] = (i27 >>> 1) | (i26 << 31);
            i26 = i27;
        }
        int[] iArr6 = new int[16];
        int[] iArr7 = new int[16];
        int[] iArr8 = new int[16];
        int[] iArr9 = new int[16];
        int[] iArr10 = new int[16];
        int[] iArr11 = new int[16];
        int[] iArr12 = new int[16];
        int[] iArr13 = new int[16];
        int[] iArr14 = new int[16];
        int[] iArr15 = new int[16];
        int[] iArr16 = (int[]) g77Var.a;
        int i28 = 0;
        while (true) {
            i6 = 0;
            if (i28 >= 16) {
                break;
            }
            iArr16[i28] = 0;
            i28++;
        }
        int[] iArr17 = (int[]) g77Var.b;
        iArr17[0] = i5;
        for (int i29 = i5; i29 < 16; i29++) {
            iArr17[i29] = 0;
        }
        int[] iArr18 = (int[]) g77Var.c;
        iArr18[0] = i5;
        int i30 = i5;
        while (i30 < 16) {
            iArr18[i30] = i6;
            i30++;
            i6 = 0;
        }
        int i31 = 17;
        while (true) {
            int i32 = i31;
            int i33 = 0;
            while (i33 < i3) {
                int i34 = i32;
                int i35 = 0;
                int i36 = 0;
                while (i35 < i3) {
                    i36 = (i36 & (~(i5 << i35))) ^ ((iArr4[i34 >>> 5] >>> (i34 & 31)) << i35);
                    i34 += 18;
                    i35++;
                    i3 = 5;
                }
                int i37 = -((i36 >>> 4) & 1);
                int i38 = (i36 ^ i37) & 15;
                int i39 = i33 << 9;
                int i40 = i31;
                int[] iArr19 = iArr4;
                int i41 = 0;
                while (i41 < 16) {
                    int i42 = ((i41 ^ i38) - 1) >> 31;
                    k1g.l(i42, i39, r, iArr6);
                    k1g.l(i42, i39 + 16, r, iArr7);
                    i39 += 32;
                    i41++;
                    i33 = i33;
                }
                int[] iArr20 = new int[16];
                k1g.g0(iArr20, iArr6, iArr20);
                k1g.l(i37, 0, iArr20, iArr6);
                k1g.d0((int[]) g77Var.c, iArr9);
                int[] iArr21 = (int[]) g77Var.a;
                k1g.L(iArr6, iArr21, iArr10);
                int[] iArr22 = (int[]) g77Var.b;
                k1g.L(iArr7, iArr22, iArr11);
                k1g.L(iArr10, iArr11, iArr12);
                k1g.K(iArr12, iArr12);
                k1g.g(iArr9, iArr12, iArr13);
                k1g.g0(iArr9, iArr12, iArr14);
                k1g.g(iArr7, iArr6, iArr15);
                k1g.g(iArr22, iArr21, iArr12);
                k1g.L(iArr15, iArr12, iArr15);
                k1g.g(iArr11, iArr10, iArr9);
                k1g.g0(iArr11, iArr10, iArr12);
                k1g.k(iArr9);
                k1g.g0(iArr15, iArr9, iArr15);
                int[] iArr23 = (int[]) g77Var.c;
                k1g.L(iArr15, iArr23, iArr15);
                k1g.L(iArr12, iArr23, iArr12);
                k1g.L(iArr13, iArr15, iArr21);
                k1g.L(iArr12, iArr14, iArr22);
                k1g.L(iArr13, iArr14, iArr23);
                i33++;
                i32 = i34;
                iArr4 = iArr19;
                i3 = 5;
                i31 = i40;
            }
            int[] iArr24 = iArr4;
            i31--;
            if (i31 < 0) {
                return;
            }
            int[] iArr25 = (int[]) g77Var.a;
            int[] iArr26 = (int[]) g77Var.b;
            k1g.g(iArr25, iArr26, iArr9);
            k1g.d0(iArr9, iArr9);
            int[] iArr27 = (int[]) g77Var.a;
            k1g.d0(iArr27, iArr10);
            k1g.d0(iArr26, iArr11);
            k1g.g(iArr10, iArr11, iArr12);
            k1g.k(iArr12);
            int[] iArr28 = (int[]) g77Var.c;
            k1g.d0(iArr28, iArr15);
            k1g.g(iArr15, iArr15, iArr15);
            k1g.k(iArr15);
            k1g.g0(iArr12, iArr15, iArr8);
            k1g.g0(iArr9, iArr12, iArr9);
            k1g.g0(iArr10, iArr11, iArr10);
            k1g.L(iArr9, iArr8, iArr27);
            k1g.L(iArr12, iArr10, iArr26);
            k1g.L(iArr12, iArr8, iArr28);
            iArr4 = iArr24;
            i3 = 5;
        }
    }

    public static Long W(Integer num) {
        if (num != null) {
            return Long.valueOf(num.intValue() * 1000);
        }
        return null;
    }

    public static final String Z(apc apcVar) {
        int iOrdinal = apcVar.ordinal();
        if (iOrdinal == 0) {
            return "football";
        }
        if (iOrdinal == 1) {
            return "basketball";
        }
        h9o.p();
        return null;
    }

    public static final void a(cn4 cn4Var, String str, String str2, o01 o01Var, n01 n01Var, Function1 function1, Function0 function0, xvf xvfVar, ih5 ih5Var, int i2) {
        int i3;
        vt9 vt9Var;
        int i4;
        ue5 ue5Var;
        vt9 vt9Var2 = (vt9) ih5Var;
        vt9Var2.Y(1306515162);
        if ((i2 & 6) == 0) {
            i3 = ((i2 & 8) == 0 ? vt9Var2.f(cn4Var) : vt9Var2.h(cn4Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= vt9Var2.f(str) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= vt9Var2.f(str2) ? NotificationCompat.FLAG_LOCAL_ONLY : NotificationCompat.FLAG_HIGH_PRIORITY;
        }
        if ((i2 & 3072) == 0) {
            i3 |= (i2 & 4096) == 0 ? vt9Var2.f(o01Var) : vt9Var2.h(o01Var) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= (32768 & i2) == 0 ? vt9Var2.f(n01Var) : vt9Var2.h(n01Var) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i3 |= vt9Var2.h(function1) ? 131072 : 65536;
        }
        if ((1572864 & i2) == 0) {
            i3 |= vt9Var2.h(function0) ? 1048576 : 524288;
        }
        if ((12582912 & i2) == 0) {
            i3 |= vt9Var2.f(xvfVar) ? 8388608 : 4194304;
        }
        int i5 = i3;
        if (vt9Var2.N(i5 & 1, (i5 & 4793491) != 4793490)) {
            c8e c8eVarW = a26.W(a26.Y(oup.s0(wxe.F(mpj.c), oup.q0(vt9Var2), true, true), 24.0f, 16.0f), xvfVar);
            db5 db5VarA = cb5.a(b72.c, rbe.n, vt9Var2, 0);
            int iHashCode = Long.hashCode(vt9Var2.T);
            oag oagVarL = vt9Var2.l();
            c8e c8eVarP = qyn.P(vt9Var2, c8eVarW);
            bh5.To.getClass();
            vt9Var2.a0();
            boolean z = vt9Var2.S;
            fza fzaVar = m3c.S;
            if (z) {
                vt9Var2.k(fzaVar);
            } else {
                vt9Var2.j0();
            }
            ah5 ah5Var = ujp.f;
            y4h.o(vt9Var2, db5VarA, ah5Var);
            ah5 ah5Var2 = ujp.e;
            y4h.o(vt9Var2, oagVarL, ah5Var2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            ah5 ah5Var3 = ujp.g;
            y4h.o(vt9Var2, numValueOf, ah5Var3);
            y4h.m(vt9Var2);
            ah5 ah5Var4 = ujp.d;
            y4h.o(vt9Var2, c8eVarP, ah5Var4);
            String strQ = uyg.q((shk) ahk.h.getValue(), vt9Var2);
            ikl iklVar = rbe.z(vt9Var2).l;
            long j2 = rbe.y(vt9Var2).s;
            z7e z7eVar = z7e.b;
            ijl.b(strQ, a26.b0(z7eVar, 0.0f, 0.0f, 0.0f, 8.0f, 7), j2, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, iklVar, vt9Var2, 48, 0, 131064);
            ijl.b(n01Var != null ? sko.k(qyn.B(n01Var), " ", n01Var.a.c.toUpperCase(Locale.ROOT)) : "-", a26.b0(z7eVar, 0.0f, 0.0f, 0.0f, 32.0f, 7), 0L, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, rbe.z(vt9Var2).j, vt9Var2, 48, 0, 131068);
            i39 i39Var = mpj.a;
            c8e c8eVarB0 = a26.b0(i39Var, 0.0f, 0.0f, 0.0f, 32.0f, 7);
            boolean z2 = o01Var != null;
            ue5 ue5VarP = null;
            if (str2 == null) {
                vt9Var2.W(-2084736036);
                vt9Var2.p(false);
                ue5Var = null;
                i4 = 4;
            } else {
                vt9Var2.W(-2084736035);
                i4 = 4;
                ue5 ue5VarP2 = gyg.P(1395476684, new lx0(str2, (byte) 4), vt9Var2);
                vt9Var2.p(false);
                ue5Var = ue5VarP2;
            }
            if (o01Var == null) {
                vt9Var2.W(-2084391006);
                vt9Var2.p(false);
            } else {
                vt9Var2.W(-2084391005);
                ue5VarP = gyg.P(-298299799, new whf(o01Var, (byte) 5), vt9Var2);
                vt9Var2.p(false);
            }
            ue5 ue5Var2 = ue5VarP;
            rvb rvbVar = new rvb(9, i4, 115);
            boolean z3 = (i5 & 3670016) == 1048576;
            Object objK = vt9Var2.K();
            if (z3 || objK == hh5.a) {
                objK = new p01(function0, (byte) 0);
                vt9Var2.g0(objK);
            }
            qbe.i(str, function1, c8eVarB0, false, false, null, vtp.a, null, null, null, null, ue5Var, ue5Var2, z2, null, rvbVar, new ovb(31, (Function1) objK), true, 0, 0, null, null, null, vt9Var2, ((i5 >> 3) & 14) | 1573248 | ((i5 >> 12) & 112), 12779520, 0, 8144824);
            ijl.b(uyg.q((shk) ahk.u.getValue(), vt9Var2), a26.b0(z7eVar, 0.0f, 0.0f, 0.0f, 8.0f, 7), rbe.y(vt9Var2).s, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, rbe.z(vt9Var2).l, vt9Var2, 48, 0, 131064);
            ijl.b(cn4Var.a, a26.b0(z7eVar, 0.0f, 0.0f, 0.0f, 32.0f, 7), 0L, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, rbe.z(vt9Var2).j, vt9Var2, 48, 0, 131068);
            sd3 sd3Var = rbe.l;
            x62 x62Var = new x62(4.0f, true, new t40((byte) 19));
            c8e c8eVarB02 = a26.b0(z7eVar, 0.0f, 0.0f, 0.0f, 32.0f, 7);
            o9i o9iVarA = m9i.a(x62Var, sd3Var, vt9Var2, 54);
            int iHashCode2 = Long.hashCode(vt9Var2.T);
            oag oagVarL2 = vt9Var2.l();
            c8e c8eVarP2 = qyn.P(vt9Var2, c8eVarB02);
            vt9Var2.a0();
            if (vt9Var2.S) {
                vt9Var2.k(fzaVar);
            } else {
                vt9Var2.j0();
            }
            y4h.o(vt9Var2, o9iVarA, ah5Var);
            y4h.o(vt9Var2, oagVarL2, ah5Var2);
            u35.j(iHashCode2, vt9Var2, ah5Var3, vt9Var2);
            y4h.o(vt9Var2, c8eVarP2, ah5Var4);
            wta.a(y9m.N(), null, mpj.h(z7eVar, 16.0f), rbe.y(vt9Var2).s, vt9Var2, 432, 0);
            ijl.b(uyg.q((shk) ahk.q.getValue(), vt9Var2), null, rbe.y(vt9Var2).s, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, rbe.z(vt9Var2).l, vt9Var2, 0, 0, 131066);
            vt9Var = vt9Var2;
            vt9Var.p(true);
            yi4.a(function0, a26.b0(i39Var, 0.0f, 16.0f, 0.0f, 24.0f, 5), !StringsKt.N(str), (paj) null, (z14) null, (e24) null, (go3) null, new zvf(16.0f, 16.0f, 16.0f, 16.0f), vtp.b, vt9Var, ((i5 >> 18) & 14) | 817889328, 376);
            vt9Var.p(true);
        } else {
            vt9Var = vt9Var2;
            vt9Var.Q();
        }
        znh znhVarR = vt9Var.r();
        if (znhVarR != null) {
            znhVarR.d = new k8d(cn4Var, str, str2, o01Var, n01Var, function1, function0, xvfVar, i2);
        }
    }

    public static void a0(int i2, int[] iArr, int[] iArr2, int[] iArr3) {
        o0g.D0(iArr, iArr3);
        while (true) {
            T(iArr3, iArr2);
            i2--;
            if (i2 <= 0) {
                return;
            } else {
                o0g.D0(iArr2, iArr3);
            }
        }
    }

    public static final void b(String str, Function1 function1, Function0 function0, c8e c8eVar, String str2, String str3, Integer num, ih5 ih5Var, int i2) {
        c8e c8eVar2;
        vt9 vt9Var = (vt9) ih5Var;
        vt9Var.Y(1389687098);
        int i3 = i2 | (vt9Var.f(str) ? 4 : 2) | (vt9Var.h(function1) ? 32 : 16) | 3072 | (vt9Var.f(str2) ? 16384 : 8192) | (vt9Var.f(str3) ? 131072 : 65536);
        if (vt9Var.N(i3 & 1, (599187 & i3) != 599186)) {
            Object objK = vt9Var.K();
            zpa zpaVar = hh5.a;
            if (objK == zpaVar) {
                objK = new kg9();
                vt9Var.g0(objK);
            }
            kg9 kg9Var = (kg9) objK;
            Unit unit = Unit.a;
            Object objK2 = vt9Var.K();
            if (objK2 == zpaVar) {
                objK2 = new bz1((byte) 22, (mt5) null, kg9Var);
                vt9Var.g0(objK2);
            }
            rm5.e(vt9Var, unit, (Function2) objK2);
            utk.a(wxe.W(mpj.c), null, ((sa5) vt9Var.j(ua5.a)).p, 0L, 0.0f, 0.0f, gyg.P(1768869631, new skf(str, num, function1, kg9Var, str2, str3, function0), vt9Var), vt9Var, 12582912, 122);
            c8eVar2 = z7e.b;
        } else {
            vt9Var.Q();
            c8eVar2 = c8eVar;
        }
        znh znhVarR = vt9Var.r();
        if (znhVarR != null) {
            znhVarR.d = new skf(str, function1, function0, c8eVar2, str2, str3, num, i2);
        }
    }

    public static void b0(int[] iArr, int[] iArr2, int[] iArr3) {
        if (o0g.F0(iArr, iArr2, iArr3) != 0) {
            long j2 = (iArr3[0] & 4294967295L) - 1;
            iArr3[0] = (int) j2;
            long j3 = j2 >> 32;
            if (j3 != 0) {
                long j4 = j3 + (iArr3[1] & 4294967295L);
                iArr3[1] = (int) j4;
                long j5 = (j4 >> 32) + (iArr3[2] & 4294967295L);
                iArr3[2] = (int) j5;
                j3 = j5 >> 32;
            }
            long j6 = (iArr3[3] & 4294967295L) + 1 + j3;
            iArr3[3] = (int) j6;
            long j7 = j6 >> 32;
            if (j7 != 0) {
                long j8 = j7 + (iArr3[4] & 4294967295L);
                iArr3[4] = (int) j8;
                long j9 = (j8 >> 32) + (iArr3[5] & 4294967295L);
                iArr3[5] = (int) j9;
                j7 = j9 >> 32;
            }
            long j10 = (iArr3[6] & 4294967295L) + 1 + j7;
            iArr3[6] = (int) j10;
            iArr3[7] = (int) (((iArr3[7] & 4294967295L) - 1) + (j10 >> 32));
        }
    }

    public static final void c(c8e c8eVar, String str, ikl iklVar, Function0 function0, hyf hyfVar, String str2, ue5 ue5Var, cec cecVar, nul nulVar, rul rulVar, ih5 ih5Var, int i2) {
        vt9 vt9Var;
        vt9 vt9Var2 = (vt9) ih5Var;
        vt9Var2.Y(-303957938);
        int i3 = i2 | (vt9Var2.f(c8eVar) ? 4 : 2) | (vt9Var2.f(str) ? 32 : 16) | (vt9Var2.f(iklVar) ? NotificationCompat.FLAG_LOCAL_ONLY : NotificationCompat.FLAG_HIGH_PRIORITY) | (vt9Var2.h(function0) ? 2048 : 1024) | (vt9Var2.h(hyfVar) ? 16384 : 8192) | (vt9Var2.f(str2) ? 131072 : 65536) | (vt9Var2.h(ue5Var) ? 1048576 : 524288) | (vt9Var2.f(cecVar) ? 8388608 : 4194304) | (vt9Var2.f(nulVar) ? 67108864 : 33554432) | (vt9Var2.f(rulVar) ? 536870912 : 268435456);
        byte b2 = 0;
        byte b3 = 1;
        if (vt9Var2.N(i3 & 1, (306783379 & i3) != 306783378)) {
            int i4 = ((i3 << 3) & 112) | 28038;
            int i5 = i3 >> 3;
            vt9Var = vt9Var2;
            so1.b(gyg.P(712229941, new okf(str, iklVar, b3), vt9Var2), c8eVar, gyg.P(12163571, new wof(function0, hyfVar, str2, b2), vt9Var2), gyg.P(382209066, new uhf(ue5Var, (byte) 4), vt9Var2), 56.0f, 0.0f, cecVar, nulVar, rulVar, vt9Var, i4 | (i5 & 3670016) | (i5 & 29360128) | (i5 & 234881024));
        } else {
            vt9Var = vt9Var2;
            vt9Var.Q();
        }
        znh znhVarR = vt9Var.r();
        if (znhVarR != null) {
            znhVarR.d = new xof(c8eVar, str, iklVar, function0, hyfVar, str2, ue5Var, cecVar, nulVar, rulVar, i2, (byte) 0);
        }
    }

    public static final List c0(List list) {
        int size = list.size();
        return size != 0 ? size != 1 ? Collections.unmodifiableList(new ArrayList(list)) : Collections.singletonList(CollectionsKt.K(list)) : l08.a;
    }

    public static final void d(c8e c8eVar, String str, ikl iklVar, Function0 function0, hyf hyfVar, String str2, ue5 ue5Var, cec cecVar, nul nulVar, rul rulVar, ih5 ih5Var, int i2) {
        vt9 vt9Var;
        vt9 vt9Var2 = (vt9) ih5Var;
        vt9Var2.Y(-1532920910);
        byte b2 = 2;
        int i3 = i2 | (vt9Var2.f(c8eVar) ? 4 : 2) | (vt9Var2.f(str) ? 32 : 16) | (vt9Var2.f(iklVar) ? NotificationCompat.FLAG_LOCAL_ONLY : NotificationCompat.FLAG_HIGH_PRIORITY) | (vt9Var2.h(function0) ? 2048 : 1024) | (vt9Var2.h(hyfVar) ? 16384 : 8192) | (vt9Var2.f(str2) ? 131072 : 65536) | (vt9Var2.h(ue5Var) ? 1048576 : 524288) | (vt9Var2.f(cecVar) ? 8388608 : 4194304) | (vt9Var2.f(nulVar) ? 67108864 : 33554432) | (vt9Var2.f(rulVar) ? 536870912 : 268435456);
        if (vt9Var2.N(i3 & 1, (306783379 & i3) != 306783378)) {
            int i4 = ((i3 << 3) & 112) | 28038;
            int i5 = i3 >> 3;
            vt9Var = vt9Var2;
            so1.c(gyg.P(-35586823, new okf(str, iklVar, (byte) 3), vt9Var2), c8eVar, gyg.P(1510497079, new wof(function0, hyfVar, str2, b2), vt9Var2), gyg.P(641932206, new uhf(ue5Var, (byte) 6), vt9Var2), 56.0f, 0.0f, cecVar, nulVar, rulVar, vt9Var, i4 | (i5 & 3670016) | (i5 & 29360128) | (i5 & 234881024));
        } else {
            vt9Var = vt9Var2;
            vt9Var.Q();
        }
        znh znhVarR = vt9Var.r();
        if (znhVarR != null) {
            znhVarR.d = new xof(c8eVar, str, iklVar, function0, hyfVar, str2, ue5Var, cecVar, nulVar, rulVar, i2, (byte) 1);
        }
    }

    public static final Map d0(Map map) {
        int size = map.size();
        if (size == 0) {
            return n08.a;
        }
        if (size != 1) {
            return Collections.unmodifiableMap(new LinkedHashMap(map));
        }
        Map.Entry entry = (Map.Entry) CollectionsKt.J(map.entrySet());
        return Collections.singletonMap(entry.getKey(), entry.getValue());
    }

    public static final void e(final c8e c8eVar, final String str, final Function0 function0, final hyf hyfVar, final String str2, final ue5 ue5Var, final cec cecVar, final nul nulVar, final rul rulVar, ih5 ih5Var, final int i2) {
        vt9 vt9Var = (vt9) ih5Var;
        vt9Var.Y(1358279698);
        int i3 = i2 | (vt9Var.f(c8eVar) ? 4 : 2) | (vt9Var.f(str) ? 32 : 16) | (vt9Var.h(function0) ? NotificationCompat.FLAG_LOCAL_ONLY : NotificationCompat.FLAG_HIGH_PRIORITY) | (vt9Var.h(hyfVar) ? 2048 : 1024) | (vt9Var.f(str2) ? 16384 : 8192) | (vt9Var.h(ue5Var) ? 131072 : 65536) | (vt9Var.f(cecVar) ? 1048576 : 524288) | (vt9Var.f(nulVar) ? 8388608 : 4194304) | (vt9Var.f(rulVar) ? 67108864 : 33554432);
        byte b2 = 1;
        if (vt9Var.N(i3 & 1, (306783379 & i3) != 306783378)) {
            int i4 = ((i3 << 3) & 112) | 28038;
            int i5 = i3 >> 3;
            so1.e(gyg.P(-7788586, new lx0(str, (byte) 13), vt9Var), c8eVar, gyg.P(330714584, new wof(function0, hyfVar, str2, b2), vt9Var), gyg.P(-593587071, new uhf(ue5Var, (byte) 5), vt9Var), 56.0f, cecVar, nulVar, rulVar, vt9Var, i4 | (458752 & i5) | (3670016 & i5) | (i5 & 29360128), 0);
        } else {
            vt9Var.Q();
        }
        znh znhVarR = vt9Var.r();
        if (znhVarR != null) {
            znhVarR.d = new Function2(str, function0, hyfVar, str2, ue5Var, cecVar, nulVar, rulVar, i2) { // from class: zof
                public final /* synthetic */ String b;
                public final /* synthetic */ Function0 c;
                public final /* synthetic */ hyf d;
                public final /* synthetic */ String e;
                public final /* synthetic */ ue5 f;
                public final /* synthetic */ cec g;
                public final /* synthetic */ nul h;
                public final /* synthetic */ rul i;

                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iM = aoh.m(805310465);
                    zi4.e(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, (ih5) obj, iM);
                    return Unit.a;
                }
            };
        }
    }

    public static int e0(g97 g97Var, lli lliVar) {
        if (g97Var instanceof e97) {
            return ((e97) g97Var).a;
        }
        int iOrdinal = lliVar.ordinal();
        if (iOrdinal == 0) {
            return LinearLayoutManager.INVALID_OFFSET;
        }
        if (iOrdinal == 1) {
            return Integer.MAX_VALUE;
        }
        h9o.p();
        return 0;
    }

    public static final void f(final String str, final Function0 function0, c8e c8eVar, tof tofVar, hyf hyfVar, String str2, cec cecVar, rul rulVar, final ue5 ue5Var, ih5 ih5Var, final int i2, final int i3) {
        rul rulVar2;
        int i4;
        final c8e c8eVar2;
        final tof tofVar2;
        final hyf hyfVar2;
        final String str3;
        final cec cecVar2;
        final rul rulVar3;
        c8e c8eVar3;
        tof tofVar3;
        final cec cecVar3;
        vt9 vt9Var = (vt9) ih5Var;
        vt9Var.Y(-49589123);
        int i5 = i2 | (vt9Var.f(str) ? 4 : 2);
        if ((i2 & 48) == 0) {
            i5 |= vt9Var.h(function0) ? 32 : 16;
        }
        int i6 = 599424 | i5;
        int i7 = i3 & NotificationCompat.FLAG_HIGH_PRIORITY;
        if (i7 != 0) {
            i4 = i5 | 13182336;
            rulVar2 = rulVar;
        } else {
            rulVar2 = rulVar;
            i4 = i6 | (vt9Var.f(rulVar2) ? 8388608 : 4194304);
        }
        if (vt9Var.N(i4 & 1, (38347923 & i4) != 38347922)) {
            vt9Var.S();
            if ((i2 & 1) == 0 || vt9Var.x()) {
                tof tofVar4 = uof.a;
                hyf hyfVarH0 = phj.h0(vt9Var, 2131231986);
                String strQ = mzg.q(vt9Var, 2132021917);
                WeakHashMap weakHashMap = k3o.x;
                cec cecVar4 = new cec(fac.m(vt9Var).g, 16 | a4h.a);
                if (i7 != 0) {
                    rulVar2 = null;
                }
                c8eVar3 = z7e.b;
                tofVar3 = tofVar4;
                hyfVar2 = hyfVarH0;
                cecVar3 = cecVar4;
                str3 = strQ;
            } else {
                vt9Var.Q();
                c8eVar3 = c8eVar;
                tofVar3 = tofVar;
                hyfVar2 = hyfVar;
                str3 = str2;
                cecVar3 = cecVar;
            }
            final rul rulVar4 = rulVar2;
            vt9Var.q();
            float f2 = oul.a;
            unf unfVar = pof.a;
            long jK = pof.a(vt9Var).a.k();
            long jL = pof.a(vt9Var).a.L();
            long jF = pof.a(vt9Var).a.f();
            long jF2 = pof.a(vt9Var).a.f();
            long jF3 = pof.a(vt9Var).a.f();
            long j2 = u95.g;
            nul nulVarA = oul.a((sa5) vt9Var.j(ua5.a));
            if (jK == 16) {
                jK = nulVarA.a;
            }
            long j3 = jK;
            if (jL == 16) {
                jL = nulVarA.b;
            }
            final nul nulVar = new nul(j3, jL, jF != 16 ? jF : nulVarA.c, jF2 != 16 ? jF2 : nulVarA.d, jF3 != 16 ? jF3 : nulVarA.e, j2 != 16 ? j2 : nulVarA.f);
            ikl iklVar = pof.b(vt9Var).f;
            final ikl iklVar2 = pof.b(vt9Var).e;
            final ikl iklVar3 = pof.b(vt9Var).d;
            tof tofVar5 = pjm.a ? tof.a : tofVar3;
            wam wamVar = (wam) vt9Var.j(abm.a);
            wam wamVar2 = new wam(wamVar.a, wamVar.b, wamVar.c, wamVar.d, iklVar3, iklVar2, iklVar, wamVar.h, wamVar.i, wamVar.j, wamVar.k, wamVar.l, wamVar.m, wamVar.n, wamVar.o, wamVar.p, wamVar.q, wamVar.r, wamVar.s, wamVar.t, wamVar.u, wamVar.v, wamVar.w, wamVar.x, wamVar.y, wamVar.z, wamVar.A, wamVar.B, wamVar.C, wamVar.D);
            final tof tofVar6 = tofVar5;
            final c8e c8eVar4 = c8eVar3;
            fed.b(null, null, wamVar2, gyg.P(-1122478039, new Function2() { // from class: vof
                /* JADX INFO: Thrown type has an unknown type hierarchy: oye */
                public final Object invoke(Object obj, Object obj2) throws oye {
                    ih5 ih5Var2 = (ih5) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    vt9 vt9Var2 = (vt9) ih5Var2;
                    if (vt9Var2.N(iIntValue & 1, (iIntValue & 3) != 2)) {
                        int iOrdinal = tofVar6.ordinal();
                        c8e c8eVar5 = c8eVar4;
                        String str4 = str;
                        Function0 function02 = function0;
                        hyf hyfVar3 = hyfVar2;
                        String str5 = str3;
                        ue5 ue5Var2 = ue5Var;
                        cec cecVar5 = cecVar3;
                        nul nulVar2 = nulVar;
                        rul rulVar5 = rulVar4;
                        if (iOrdinal == 0) {
                            vt9Var2.W(872188928);
                            zi4.e(c8eVar5, str4, function02, hyfVar3, str5, ue5Var2, cecVar5, nulVar2, rulVar5, vt9Var2, 805310464);
                            vt9Var2.p(false);
                        } else if (iOrdinal == 1) {
                            vt9Var2.W(872797179);
                            zi4.d(c8eVar5, str4, iklVar2, function02, hyfVar3, str5, ue5Var2, cecVar5, nulVar2, rulVar5, vt9Var2, 32768);
                            vt9Var2.p(false);
                        } else {
                            if (iOrdinal != 2) {
                                throw fki.m(vt9Var2, -664601872, false);
                            }
                            vt9Var2.W(873470685);
                            zi4.c(c8eVar5, str4, iklVar3, function02, hyfVar3, str5, ue5Var2, cecVar5, nulVar2, rulVar5, vt9Var2, 32768);
                            vt9Var2.p(false);
                        }
                    } else {
                        vt9Var2.Q();
                    }
                    return Unit.a;
                }
            }, vt9Var), vt9Var, 3072, 3);
            c8eVar2 = c8eVar4;
            cecVar2 = cecVar3;
            rulVar3 = rulVar4;
            tofVar2 = tofVar3;
        } else {
            vt9Var.Q();
            c8eVar2 = c8eVar;
            tofVar2 = tofVar;
            hyfVar2 = hyfVar;
            str3 = str2;
            cecVar2 = cecVar;
            rulVar3 = rulVar2;
        }
        znh znhVarR = vt9Var.r();
        if (znhVarR != null) {
            znhVarR.d = new Function2() { // from class: yof
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    zi4.f(str, function0, c8eVar2, tofVar2, hyfVar2, str3, cecVar2, rulVar3, ue5Var, (ih5) obj, aoh.m(i2 | 1), i3);
                    return Unit.a;
                }
            };
        }
    }

    public static final CharSequence f0(CharSequence charSequence) {
        return charSequence.length() <= 5000 ? charSequence : (Character.isHighSurrogate(charSequence.charAt(4999)) && Character.isLowSurrogate(charSequence.charAt(5000))) ? pik.C(4999, charSequence) : pik.C(5000, charSequence);
    }

    public static final void g(String str, String str2, c8e c8eVar, ue5 ue5Var, ih5 ih5Var, int i2) {
        int i3;
        vt9 vt9Var = (vt9) ih5Var;
        vt9Var.Y(-546453775);
        if ((i2 & 6) == 0) {
            i3 = (vt9Var.f(str) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= vt9Var.f(str2) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= vt9Var.f(c8eVar) ? NotificationCompat.FLAG_LOCAL_ONLY : NotificationCompat.FLAG_HIGH_PRIORITY;
        }
        if ((i2 & 3072) == 0) {
            i3 |= vt9Var.h(ue5Var) ? 2048 : 1024;
        }
        byte b2 = 1;
        if (vt9Var.N(i3 & 1, (i3 & 1171) != 1170)) {
            c26.a(c8eVar, null, null, null, gyg.P(-704996893, new f23(ue5Var, str, str2, b2), vt9Var), vt9Var, ((i3 >> 6) & 14) | 196608, 30);
        } else {
            vt9Var.Q();
        }
        znh znhVarR = vt9Var.r();
        if (znhVarR != null) {
            znhVarR.d = new fz0((Object) str, (Object) str2, c8eVar, ue5Var, i2, (byte) 8);
        }
    }

    public static final void h(String str, ikl iklVar, ih5 ih5Var, int i2) {
        vt9 vt9Var;
        vt9 vt9Var2 = (vt9) ih5Var;
        vt9Var2.Y(737032942);
        int i3 = i2 | (vt9Var2.f(str) ? 4 : 2) | (vt9Var2.f(iklVar) ? 32 : 16);
        if (vt9Var2.N(i3 & 1, (i3 & 19) != 18)) {
            vt9Var = vt9Var2;
            ijl.b(str, null, 0L, 0L, null, 0L, null, null, 0L, 2, false, rkl.a(((ikl) vt9Var2.j(ijl.a)).a.b, iklVar.a.b) ? 3 : 1, 0, null, vt9Var, i3 & 14, 384, 241662);
        } else {
            vt9Var = vt9Var2;
            vt9Var.Q();
        }
        znh znhVarR = vt9Var.r();
        if (znhVarR != null) {
            znhVarR.d = new okf(str, iklVar, i2);
        }
    }

    public static final c8e i(vt9 vt9Var) {
        return a26.b0(i41.V(z7e.b, -4.0f, 0.0f, 2), 0.0f, 0.0f, (((Configuration) vt9Var.j(j41.a)).smallestScreenWidthDp >= 600 ? 80.0f : 72.0f) - 56.0f, 0.0f, 11);
    }

    public static void j(int[] iArr) {
        long j2 = (iArr[0] & 4294967295L) + 1;
        iArr[0] = (int) j2;
        long j3 = j2 >> 32;
        if (j3 != 0) {
            long j4 = j3 + (iArr[1] & 4294967295L);
            iArr[1] = (int) j4;
            long j5 = (j4 >> 32) + (iArr[2] & 4294967295L);
            iArr[2] = (int) j5;
            j3 = j5 >> 32;
        }
        long j6 = ((iArr[3] & 4294967295L) - 1) + j3;
        iArr[3] = (int) j6;
        long j7 = j6 >> 32;
        if (j7 != 0) {
            long j8 = j7 + (iArr[4] & 4294967295L);
            iArr[4] = (int) j8;
            long j9 = (j8 >> 32) + (iArr[5] & 4294967295L);
            iArr[5] = (int) j9;
            j7 = j9 >> 32;
        }
        long j10 = ((iArr[6] & 4294967295L) - 1) + j7;
        iArr[6] = (int) j10;
        iArr[7] = (int) ((iArr[7] & 4294967295L) + 1 + (j10 >> 32));
    }

    public static void l(int i2, View view) {
        m(view, i2 != 0 ? view.getContext().getColorStateList(i2) : null);
    }

    public static void m(View view, ColorStateList colorStateList) {
        if (view instanceof ImageView) {
            ((ImageView) view).setImageTintList(colorStateList);
            return;
        }
        if (view instanceof CompoundButton) {
            ((CompoundButton) view).setButtonTintList(colorStateList);
            return;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i2 = 0; i2 < viewGroup.getChildCount(); i2++) {
                m(viewGroup.getChildAt(i2), colorStateList);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.io.Serializable n(f99 r6, l99 r7, nt5 r8) throws java.lang.Throwable {
        /*
            boolean r0 = r8 instanceof defpackage.ba9
            if (r0 == 0) goto L13
            r0 = r8
            ba9 r0 = (defpackage.ba9) r0
            int r1 = r0.v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.v = r1
            goto L18
        L13:
            ba9 r0 = new ba9
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.u
            px5 r1 = px5.a
            int r2 = r0.v
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L32
            if (r2 != r3) goto L2c
            pqh r6 = r0.t
            defpackage.ybh.y(r8)     // Catch: java.lang.Throwable -> L2a
            return r4
        L2a:
            r7 = move-exception
            goto L4a
        L2c:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            qp2.n(r6)
            return r4
        L32:
            pqh r8 = sko.f(r8)
            o23 r2 = new o23     // Catch: java.lang.Throwable -> L48
            r5 = 6
            r2.<init>(r7, r8, r5)     // Catch: java.lang.Throwable -> L48
            r0.t = r8     // Catch: java.lang.Throwable -> L48
            r0.v = r3     // Catch: java.lang.Throwable -> L48
            java.lang.Object r6 = r6.collect(r2, r0)     // Catch: java.lang.Throwable -> L48
            if (r6 != r1) goto L47
            return r1
        L47:
            return r4
        L48:
            r7 = move-exception
            r6 = r8
        L4a:
            java.lang.Object r6 = r6.a
            java.lang.Throwable r6 = (java.lang.Throwable) r6
            if (r6 == 0) goto L56
            boolean r8 = r6.equals(r7)
            if (r8 != 0) goto L76
        L56:
            kotlin.coroutines.CoroutineContext r8 = r0.getContext()
            ulp r0 = defpackage.ulp.h
            kotlin.coroutines.CoroutineContext$Element r8 = r8.get(r0)
            unb r8 = (unb) r8
            if (r8 == 0) goto L77
            boolean r0 = r8.isCancelled()
            if (r0 == 0) goto L77
            java.util.concurrent.CancellationException r8 = r8.p()
            if (r8 == 0) goto L77
            boolean r8 = r8.equals(r7)
            if (r8 == 0) goto L77
        L76:
            throw r7
        L77:
            if (r6 != 0) goto L7a
            return r7
        L7a:
            boolean r8 = r7 instanceof java.util.concurrent.CancellationException
            if (r8 == 0) goto L82
            defpackage.wf8.a(r6, r7)
            throw r6
        L82:
            defpackage.wf8.a(r7, r6)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zi4.n(f99, l99, nt5):java.io.Serializable");
    }

    public static void o(long j2, String str) {
        if (j2 >= 0) {
            return;
        }
        throw new IllegalArgumentException(str + " (" + j2 + ") must be >= 0");
    }

    public static void p(boolean z) {
        if (!z) {
            throw new ArithmeticException("mode was UNNECESSARY, but rounding was necessary");
        }
    }

    public static final long q(int i2, int i3, apj apjVar, lli lliVar, apj apjVar2) {
        int i4;
        int i5;
        if (!Intrinsics.a(apjVar, apj.c)) {
            i2 = e0(apjVar.a, lliVar);
            i3 = e0(apjVar.b, lliVar);
        }
        g97 g97Var = apjVar2.a;
        g97 g97Var2 = apjVar2.b;
        if ((g97Var instanceof e97) && i2 != Integer.MIN_VALUE && i2 != Integer.MAX_VALUE && i2 > (i5 = ((e97) g97Var).a)) {
            i2 = i5;
        }
        if ((g97Var2 instanceof e97) && i3 != Integer.MIN_VALUE && i3 != Integer.MAX_VALUE && i3 > (i4 = ((e97) g97Var2).a)) {
            i3 = i4;
        }
        return (i2 << 32) | (i3 & 4294967295L);
    }

    public static final double r(int i2, int i3, int i4, int i5, lli lliVar, apj apjVar) {
        double dMax;
        double d2 = i2;
        double d3 = i4 / d2;
        double d4 = i3;
        double d5 = i5 / d4;
        int iOrdinal = lliVar.ordinal();
        if (iOrdinal == 0) {
            dMax = Math.max(d3, d5);
        } else {
            if (iOrdinal != 1) {
                h9o.p();
                return 0.0d;
            }
            dMax = Math.min(d3, d5);
        }
        if (apjVar.a instanceof e97) {
            double d6 = ((e97) r9).a / d2;
            if (dMax > d6) {
                dMax = d6;
            }
        }
        if (apjVar.b instanceof e97) {
            double d7 = ((e97) r9).a / d4;
            if (dMax > d7) {
                return d7;
            }
        }
        return dMax;
    }

    public static gic s(e5d e5dVar, dic dicVar) {
        Set set = Collections.EMPTY_SET;
        pma pmaVar = new pma((byte) 2);
        gic gicVar = new gic(e5dVar, dicVar);
        gicVar.a(0, new f4c(2131558959), new pma((byte) 3));
        gicVar.a(1, new f4c(2131558954), pmaVar);
        gicVar.a(2, new f4c(2131558953), new pma((byte) 4));
        gicVar.a(3, new f4c(2131558956), new pma((byte) 5));
        gicVar.a(4, new f4c(2131558958), new pma((byte) 6));
        gicVar.a(5, new f4c(2131558957), new pma((byte) 7));
        return gicVar;
    }

    public static ua7 t(String str, cm cmVar) {
        Context context = t8.a;
        return new ua7(context, str, new ws4(wub.D(), context.getResources()), cmVar);
    }

    public static void u(Context context, ic4 ic4Var) {
        Intent intentB = mdb.b(context);
        intentB.setAction("android.intent.action.MAIN");
        intentB.addCategory("android.intent.category.LAUNCHER");
        ic4Var.q(intentB);
        context.startActivity(intentB);
    }

    public static final mk8 v(long j2, long j3, long j4, long j5) {
        return new mk8(cs5.d(j2), cs5.d(j3), cs5.d(j4), cs5.d(j5));
    }

    public static Rect w(int i2, int i3, int i4) {
        double radians = Math.toRadians(i4);
        double d2 = i3;
        double d3 = i2;
        int i5 = Math.sin(radians) < 0.0d ? -1 : 1;
        int i6 = Math.cos(radians) < 0.0d ? -1 : 1;
        double dTan = (Math.tan(radians) * d2) / d3;
        double d4 = dTan * dTan;
        double d5 = d4 + 1.0d;
        double dAtan2 = (radians - Math.atan2(Math.sqrt(d4 / d5) * i5, Math.sqrt(1.0d / d5) * i6)) + radians;
        while (dAtan2 > 3.141592653589793d) {
            dAtan2 -= 6.283185307179586d;
        }
        while (dAtan2 <= -3.141592653589793d) {
            dAtan2 += 6.283185307179586d;
        }
        double d6 = d3 / 2.0d;
        double d7 = d2 / 2.0d;
        double d8 = dAtan2 - 1.5707963267948966d;
        double dAbs = (Math.abs(Math.cos(d8) * d2) + Math.abs(Math.sin(d8) * d3)) / 2.0d;
        double dCos = Math.cos(dAtan2) * dAbs;
        double dSin = Math.sin(dAtan2) * dAbs;
        return new Rect((int) Math.floor(d6 + dCos), (int) Math.floor(d7 - dSin), (int) Math.ceil(d6 - dCos), (int) Math.ceil(d7 + dSin));
    }

    public static final ruc x(mme mmeVar, oi9 oi9Var) {
        int iIntValue;
        int i2;
        String str;
        lme lmeVar = mmeVar.r;
        nne nneVar = mmeVar.p;
        long j2 = mmeVar.a;
        nne nneVar2 = mmeVar.o;
        String str2 = nneVar2.b;
        String str3 = nneVar2.e;
        if (str3 == null) {
            str3 = "";
        }
        Integer num = nneVar2.h;
        int iIntValue2 = num != null ? num.intValue() : 0;
        Integer num2 = nneVar2.i;
        if (num2 != null) {
            iIntValue = num2.intValue();
            i2 = 0;
        } else {
            iIntValue = 0;
            i2 = 0;
        }
        String str4 = nneVar.b;
        String str5 = nneVar.e;
        String str6 = str5 != null ? str5 : "";
        Integer num3 = nneVar.h;
        int iIntValue3 = num3 != null ? num3.intValue() : i2;
        Integer num4 = nneVar.i;
        int iIntValue4 = num4 != null ? num4.intValue() : i2;
        jnc jncVar = mmeVar.j;
        switch (jncVar == null ? -1 : tu5.a[jncVar.ordinal()]) {
            case -1:
            case 1:
                str = "not started";
                break;
            case 0:
            default:
                h9o.p();
                return null;
            case 2:
                str = "in progress";
                break;
            case 3:
                str = "finished";
                break;
            case 4:
                str = "cancelled";
                break;
            case 5:
                str = "delayed";
                break;
            case 6:
                str = "interrupted";
                break;
            case 7:
                str = "deleted";
                break;
        }
        String str7 = str;
        String str8 = mmeVar.l;
        ene eneVar = mmeVar.m;
        String str9 = eneVar != null ? eneVar.a : null;
        Long l2 = lmeVar.a;
        return new ruc(j2, oi9Var, str2, str3, iIntValue2, iIntValue, str4, str6, iIntValue3, iIntValue4, str7, str8, str9, l2 != null ? l2.longValue() * 1000 : 0L, W(lmeVar.j), W(lmeVar.b), W(lmeVar.c), W(lmeVar.d), W(lmeVar.e), W(lmeVar.f), W(lmeVar.g), W(lmeVar.h), W(lmeVar.i));
    }

    public static m24 y(Context context) {
        return (m24) context.getSystemService("com.opera.android.BPR_SERVICE");
    }

    public static is7 z(byte[] bArr) {
        alo.g0(0, 57, bArr);
        byte[] bArr2 = new byte[114];
        vci vciVar = new vci(NotificationCompat.FLAG_LOCAL_ONLY);
        vciVar.g(0, 57, bArr);
        vciVar.o(0, 114, bArr2);
        byte[] bArr3 = new byte[57];
        S(bArr2, bArr3);
        g77 g77Var = new g77((byte) 5);
        V(bArr3, g77Var);
        int[] iArr = new int[16];
        int[] iArr2 = new int[16];
        k1g.H((int[]) g77Var.c, iArr2);
        k1g.L(iArr2, (int[]) g77Var.a, iArr);
        k1g.L(iArr2, (int[]) g77Var.b, iArr2);
        k1g.b0(1, iArr);
        k1g.b0(-1, iArr);
        k1g.b0(1, iArr2);
        k1g.b0(-1, iArr2);
        int[] iArr3 = new int[16];
        int[] iArr4 = new int[16];
        int[] iArr5 = new int[16];
        k1g.d0(iArr, iArr4);
        k1g.d0(iArr2, iArr5);
        k1g.L(iArr4, iArr5, iArr3);
        k1g.g(iArr4, iArr5, iArr4);
        k1g.K(iArr3, iArr3);
        int[] iArr6 = new int[16];
        iArr6[0] = 1;
        k1g.g0(iArr3, iArr6, iArr3);
        k1g.g(iArr3, iArr4, iArr3);
        k1g.b0(1, iArr3);
        k1g.b0(-1, iArr3);
        k1g.b0(1, iArr5);
        k1g.b0(-1, iArr5);
        if ((k1g.J(iArr3) & (~k1g.J(iArr5))) == 0) {
            h9o.e();
            return null;
        }
        int[] iArr7 = new int[32];
        k1g.m(0, 0, iArr, iArr7);
        k1g.m(0, 16, iArr2, iArr7);
        return new is7(iArr7);
    }

    public boolean F() {
        return true;
    }

    public boolean X(float f2) {
        return false;
    }

    public boolean Y(laj lajVar) {
        return false;
    }

    public void k(Canvas canvas, Function1 function1) {
    }
}
