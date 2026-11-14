package defpackage;

import ads_mobile_sdk.u62;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.graphics.drawable.shapes.RoundRectShape;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.opengl.Matrix;
import android.os.Build;
import android.util.Pair;
import android.util.TypedValue;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.view.animation.PathInterpolator;
import androidx.camera.camera2.compat.quirk.ExtraSupportedSurfaceCombinationsQuirk;
import androidx.core.app.NotificationCompat;
import java.io.EOFException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.c;

/* loaded from: classes.dex */
public abstract class ui6 {
    public static final ef1 a = new ef1(Float.POSITIVE_INFINITY);
    public static final ff1 b = new ff1(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY);
    public static final gf1 c = new gf1(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY);
    public static final hf1 d = new hf1(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY);
    public static final ef1 e = new ef1(Float.NEGATIVE_INFINITY);
    public static final ff1 f = new ff1(Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY);
    public static final gf1 g = new gf1(Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY);
    public static final hf1 h = new hf1(Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY);
    public static final ue5 i = new ue5(1514798035, new cf5((byte) 29), false);
    public static final ue5 j = new ue5(412232675, new gf5((byte) 0), false);
    public static final ue5 k = new ue5(257093856, new ef5((byte) 13), false);
    public static final gd7 l;
    public static final gd7 m;
    public static final lag[] n;
    public static final lag[] o;
    public static final long[] p;
    public static final bxl q;
    public static final u62 r;

    static {
        byte b2 = 4;
        l = new gd7("REMOVED_TASK", b2);
        m = new gd7("CLOSED_EMPTY", b2);
        lag lagVar = lag.c;
        lag lagVar2 = lag.i;
        lag lagVar3 = lag.b;
        lag lagVar4 = lag.d;
        lag lagVar5 = lag.e;
        lag lagVar6 = lag.f;
        n = new lag[]{lagVar, lagVar2, lagVar3, lagVar4, lagVar5, lagVar6};
        o = new lag[]{lagVar, lagVar2, lagVar3, lagVar4, lagVar5, lagVar6, lag.h};
        p = new long[]{878416384462358536L, 3513665537849438403L, -9076969306111048948L, 585610922974906400L, 34087042};
        q = new bxl((byte) 20);
        r = new u62();
    }

    public static float A(String[] strArr, int i2) throws NumberFormatException {
        float f2 = Float.parseFloat(strArr[i2]);
        if (f2 >= 0.0f && f2 <= 1.0f) {
            return f2;
        }
        throw new IllegalArgumentException("Motion easing control point value must be between 0 and 1; instead got: " + f2);
    }

    public static ArrayList B(boolean z, boolean z2, String str, lag[] lagVarArr) {
        ArrayList arrayList = new ArrayList();
        jag jagVarF = s9g.h.f(str, z);
        if (jagVarF != null) {
            for (lag lagVar : lagVarArr) {
                kag kagVarA = null;
                if (z2) {
                    kag kagVarA2 = jagVarF.a(lagVar, null);
                    if (kagVarA2 != null) {
                        kagVarA = Boolean.TRUE.equals(jagVarF.b(lagVar)) ? kagVarA2 : kag.d;
                    }
                } else {
                    kagVarA = jagVarF.a(lagVar, null);
                }
                if (kagVarA != null) {
                    arrayList.add(new Pair(lagVar, kagVarA));
                }
            }
        }
        return arrayList;
    }

    public static void C(long[] jArr, long[] jArr2) {
        long j2 = jArr[0];
        long j3 = jArr[1];
        long j4 = jArr[2];
        long j5 = jArr[3];
        long j6 = jArr[4];
        jArr2[0] = j2 & 144115188075855871L;
        jArr2[1] = ((j2 >>> 57) ^ (j3 << 7)) & 144115188075855871L;
        jArr2[2] = ((j3 >>> 50) ^ (j4 << 14)) & 144115188075855871L;
        jArr2[3] = ((j4 >>> 43) ^ (j5 << 21)) & 144115188075855871L;
        jArr2[4] = (j5 >>> 36) ^ (j6 << 28);
    }

    public static void D(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] jArr4 = new long[5];
        long[] jArr5 = new long[5];
        C(jArr, jArr4);
        C(jArr2, jArr5);
        long[] jArr6 = new long[26];
        E(jArr3, jArr4[0], jArr5[0], jArr6, 0);
        E(jArr3, jArr4[1], jArr5[1], jArr6, 2);
        E(jArr3, jArr4[2], jArr5[2], jArr6, 4);
        E(jArr3, jArr4[3], jArr5[3], jArr6, 6);
        E(jArr3, jArr4[4], jArr5[4], jArr6, 8);
        long j2 = jArr4[0];
        long j3 = j2 ^ jArr4[1];
        long j4 = jArr5[0];
        long j5 = j4 ^ jArr5[1];
        long j6 = jArr4[2];
        long j7 = j2 ^ j6;
        long j8 = jArr5[2];
        long j9 = j4 ^ j8;
        long j10 = jArr4[4];
        long j11 = j6 ^ j10;
        long j12 = jArr5[4];
        long j13 = j8 ^ j12;
        long j14 = jArr4[3];
        long j15 = j14 ^ j10;
        long j16 = jArr5[3];
        long j17 = j16 ^ j12;
        E(jArr3, j7 ^ j14, j9 ^ j16, jArr6, 18);
        E(jArr3, j11 ^ jArr4[1], j13 ^ jArr5[1], jArr6, 20);
        long j18 = j3 ^ j15;
        long j19 = j5 ^ j17;
        long j20 = j18 ^ jArr4[2];
        long j21 = jArr5[2] ^ j19;
        E(jArr3, j18, j19, jArr6, 22);
        E(jArr3, j20, j21, jArr6, 24);
        E(jArr3, j3, j5, jArr6, 10);
        E(jArr3, j7, j9, jArr6, 12);
        E(jArr3, j11, j13, jArr6, 14);
        E(jArr3, j15, j17, jArr6, 16);
        long j22 = jArr6[0];
        jArr3[0] = j22;
        long j23 = jArr6[9];
        jArr3[9] = j23;
        long j24 = jArr6[0];
        long j25 = jArr6[1] ^ j24;
        long j26 = j25 ^ jArr6[2];
        long j27 = j26 ^ jArr6[10];
        jArr3[1] = j27;
        long j28 = jArr6[3] ^ jArr6[4];
        long j29 = j26 ^ (j28 ^ (jArr6[11] ^ jArr6[12]));
        jArr3[2] = j29;
        long j30 = j25 ^ j28;
        long j31 = jArr6[5] ^ jArr6[6];
        long j32 = jArr6[8];
        long j33 = (j30 ^ j31) ^ j32;
        long j34 = jArr6[13] ^ jArr6[14];
        long j35 = jArr6[18];
        long j36 = jArr6[22];
        long j37 = jArr6[24];
        long j38 = (j33 ^ j34) ^ ((j35 ^ j36) ^ j37);
        jArr3[3] = j38;
        long j39 = jArr6[7] ^ j32;
        long j40 = jArr6[9];
        long j41 = j39 ^ j40;
        long j42 = j41 ^ jArr6[17];
        jArr3[8] = j42;
        long j43 = (j41 ^ j31) ^ (jArr6[15] ^ jArr6[16]);
        jArr3[7] = j43;
        long j44 = jArr6[19] ^ jArr6[20];
        long j45 = jArr6[25];
        long j46 = jArr6[23];
        long j47 = j44 ^ (j45 ^ j37);
        long j48 = (j47 ^ (j35 ^ j46)) ^ (j43 ^ j27);
        jArr3[4] = j48;
        long j49 = jArr6[21];
        long j50 = (j47 ^ (j29 ^ j42)) ^ (j49 ^ j36);
        jArr3[5] = j50;
        long j51 = (((((j33 ^ j24) ^ j40) ^ j34) ^ j49) ^ j46) ^ j45;
        jArr3[6] = j51;
        jArr3[0] = j22 ^ (j27 << 57);
        jArr3[1] = (j27 >>> 7) ^ (j29 << 50);
        jArr3[2] = (j29 >>> 14) ^ (j38 << 43);
        jArr3[3] = (j38 >>> 21) ^ (j48 << 36);
        jArr3[4] = (j48 >>> 28) ^ (j50 << 29);
        jArr3[5] = (j50 >>> 35) ^ (j51 << 22);
        jArr3[6] = (j51 >>> 42) ^ (j43 << 15);
        jArr3[7] = (j43 >>> 49) ^ (j42 << 8);
        jArr3[8] = (j42 >>> 56) ^ (j23 << 1);
        jArr3[9] = j23 >>> 63;
    }

    public static void E(long[] jArr, long j2, long j3, long[] jArr2, int i2) {
        jArr[1] = j3;
        long j4 = j3 << 1;
        jArr[2] = j4;
        long j5 = j4 ^ j3;
        jArr[3] = j5;
        long j6 = j3 << 2;
        jArr[4] = j6;
        jArr[5] = j6 ^ j3;
        long j7 = j5 << 1;
        jArr[6] = j7;
        jArr[7] = j7 ^ j3;
        long j8 = jArr[((int) j2) & 7];
        long j9 = 0;
        int i3 = 48;
        do {
            int i4 = (int) (j2 >>> i3);
            long j10 = (jArr[i4 & 7] ^ (jArr[(i4 >>> 3) & 7] << 3)) ^ (jArr[(i4 >>> 6) & 7] << 6);
            j8 ^= j10 << i3;
            j9 ^= j10 >>> (-i3);
            i3 -= 9;
        } while (i3 > 0);
        jArr2[i2] = 144115188075855871L & j8;
        jArr2[i2 + 1] = (j8 >>> 57) ^ ((j9 ^ (((j2 & 72198606942111744L) & ((j3 << 7) >> 63)) >>> 8)) << 7);
    }

    public static void F(long[] jArr, long[] jArr2) {
        t(jArr, jArr2, 4);
        jArr2[8] = s((int) jArr[4]);
    }

    /* JADX WARN: Code restructure failed: missing block: B:128:0x0304, code lost:
    
        if (r13 != r3) goto L216;
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x0389, code lost:
    
        if (r1 != r3) goto L156;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0123, code lost:
    
        if (r32.g(1, r2) == r3) goto L175;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0287 A[Catch: all -> 0x02b7, TRY_LEAVE, TryCatch #6 {all -> 0x02b7, blocks: (B:107:0x027f, B:109:0x0287, B:116:0x02a5), top: B:222:0x027f }] */
    /* JADX WARN: Removed duplicated region for block: B:115:0x02a1  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x02d1 A[Catch: all -> 0x0420, TryCatch #2 {all -> 0x0420, blocks: (B:177:0x03ff, B:179:0x0407, B:129:0x0306, B:74:0x01be, B:81:0x01dc, B:87:0x01ef, B:94:0x0212, B:98:0x0221, B:104:0x024c, B:123:0x02cb, B:125:0x02d1, B:127:0x02db, B:122:0x02c1), top: B:216:0x0306 }] */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0341 A[Catch: all -> 0x04a0, TryCatch #3 {all -> 0x04a0, blocks: (B:16:0x0045, B:188:0x0425, B:189:0x043b, B:156:0x038b, B:160:0x039c, B:161:0x03b6, B:139:0x033b, B:141:0x0341, B:143:0x0347, B:147:0x0353, B:152:0x0364, B:154:0x036e, B:192:0x043e, B:193:0x0445, B:196:0x044c, B:201:0x0461, B:202:0x0475, B:203:0x0476, B:204:0x049f), top: B:217:0x0030 }] */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0353 A[Catch: all -> 0x04a0, TRY_ENTER, TryCatch #3 {all -> 0x04a0, blocks: (B:16:0x0045, B:188:0x0425, B:189:0x043b, B:156:0x038b, B:160:0x039c, B:161:0x03b6, B:139:0x033b, B:141:0x0341, B:143:0x0347, B:147:0x0353, B:152:0x0364, B:154:0x036e, B:192:0x043e, B:193:0x0445, B:196:0x044c, B:201:0x0461, B:202:0x0475, B:203:0x0476, B:204:0x049f), top: B:217:0x0030 }] */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0359  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x03c9 A[Catch: all -> 0x043c, TRY_LEAVE, TryCatch #9 {all -> 0x043c, blocks: (B:163:0x03bb, B:165:0x03c9, B:173:0x03e3), top: B:228:0x03bb }] */
    /* JADX WARN: Removed duplicated region for block: B:170:0x03de  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0407 A[Catch: all -> 0x0420, TRY_LEAVE, TryCatch #2 {all -> 0x0420, blocks: (B:177:0x03ff, B:179:0x0407, B:129:0x0306, B:74:0x01be, B:81:0x01dc, B:87:0x01ef, B:94:0x0212, B:98:0x0221, B:104:0x024c, B:123:0x02cb, B:125:0x02d1, B:127:0x02db, B:122:0x02c1), top: B:216:0x0306 }] */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0476 A[Catch: all -> 0x04a0, TryCatch #3 {all -> 0x04a0, blocks: (B:16:0x0045, B:188:0x0425, B:189:0x043b, B:156:0x038b, B:160:0x039c, B:161:0x03b6, B:139:0x033b, B:141:0x0341, B:143:0x0347, B:147:0x0353, B:152:0x0364, B:154:0x036e, B:192:0x043e, B:193:0x0445, B:196:0x044c, B:201:0x0461, B:202:0x0475, B:203:0x0476, B:204:0x049f), top: B:217:0x0030 }] */
    /* JADX WARN: Removed duplicated region for block: B:211:0x04aa  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x015d A[Catch: all -> 0x04a2, TryCatch #4 {all -> 0x04a2, blocks: (B:49:0x0157, B:51:0x015d, B:53:0x0163), top: B:218:0x0157 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Type inference failed for: r11v21, types: [int, short] */
    /* JADX WARN: Type inference failed for: r11v8, types: [int, short] */
    /* JADX WARN: Type inference failed for: r15v12, types: [int, short] */
    /* JADX WARN: Type inference failed for: r1v29, types: [int, short] */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v20 */
    /* JADX WARN: Type inference failed for: r5v23 */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v30 */
    /* JADX WARN: Type inference failed for: r5v31 */
    /* JADX WARN: Type inference failed for: r5v32 */
    /* JADX WARN: Type inference failed for: r5v39 */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r8v3, types: [int, short] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:124:0x02cf -> B:132:0x0319). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:126:0x02d9 -> B:132:0x0319). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:128:0x0304 -> B:216:0x0306). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object G(d44 r32, ct4 r33, long r34, boolean r36, boolean r37, nt5 r38) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 1206
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ui6.G(d44, ct4, long, boolean, boolean, nt5):java.lang.Object");
    }

    public static final void H(pqh pqhVar, ct4 ct4Var, dwj dwjVar, oqh oqhVar, long j2) throws EOFException {
        if (pqhVar.a != null) {
            I(pqhVar, dwjVar, oqhVar, j2);
        } else if (j2 > 0) {
            dwjVar.v(j2);
            ct4Var.append(mfh.k(dwjVar.u(), j2));
            oqhVar.a += j2;
        }
    }

    public static final void I(pqh pqhVar, dwj dwjVar, oqh oqhVar, long j2) throws EOFException {
        if (j2 > 0) {
            if (pqhVar.a == null) {
                pqhVar.a = new c04();
            }
            c04 c04Var = (c04) pqhVar.a;
            c04Var.getClass();
            if (j2 >= 0) {
                long j3 = j2;
                while (j3 > 0) {
                    long jI0 = dwjVar.I0(c04Var, j3);
                    if (jI0 == -1) {
                        throw new EOFException(j7c.o(j2 - j3, " were read.", p3p.q(j2, "Source exhausted before reading ", " bytes. Only ")));
                    }
                    j3 -= jI0;
                }
            } else {
                bxl.d(z1m.j(j2, "byteCount (", ") < 0"));
            }
            oqhVar.a += j2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object J(dwj r10, d44 r11, boolean r12, nt5 r13) {
        /*
            boolean r0 = r13 instanceof defpackage.h44
            if (r0 == 0) goto L13
            r0 = r13
            h44 r0 = (defpackage.h44) r0
            int r1 = r0.w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.w = r1
            goto L18
        L13:
            h44 r0 = new h44
            r0.<init>(r13)
        L18:
            java.lang.Object r13 = r0.v
            px5 r1 = px5.a
            int r2 = r0.w
            r3 = 1
            r5 = 2
            r7 = 1
            if (r2 == 0) goto L36
            if (r2 != r7) goto L2f
            boolean r12 = r0.u
            dwj r10 = r0.t
            defpackage.ybh.y(r13)
            goto L51
        L2f:
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            qp2.n(r10)
            r10 = 0
            return r10
        L36:
            defpackage.ybh.y(r13)
            c04 r13 = r10.u()
            long r8 = r13.c
            int r13 = (r8 > r5 ? 1 : (r8 == r5 ? 0 : -1))
            if (r13 >= 0) goto L59
            r0.t = r10
            r0.u = r12
            r0.w = r7
            r13 = 2
            java.lang.Object r13 = r11.g(r13, r0)
            if (r13 != r1) goto L51
            return r1
        L51:
            java.lang.Boolean r13 = (java.lang.Boolean) r13
            boolean r11 = r13.booleanValue()
            if (r11 == 0) goto L6b
        L59:
            c04 r11 = r10.u()
            byte r11 = r11.h(r3)
            r13 = 10
            if (r11 != r13) goto L6b
            c09.k(r10, r5)
            java.lang.Boolean r10 = java.lang.Boolean.TRUE
            return r10
        L6b:
            if (r12 == 0) goto L73
            c09.k(r10, r3)
            java.lang.Boolean r10 = java.lang.Boolean.TRUE
            return r10
        L73:
            java.lang.Boolean r10 = java.lang.Boolean.FALSE
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ui6.J(dwj, d44, boolean, nt5):java.lang.Object");
    }

    public static final float[] K(float[] fArr) {
        float f2 = fArr[0];
        float f3 = fArr[3];
        float f4 = fArr[6];
        float f5 = fArr[1];
        float f6 = fArr[4];
        float f7 = fArr[7];
        float f8 = fArr[2];
        float f9 = fArr[5];
        float f10 = fArr[8];
        float f11 = (f6 * f10) - (f7 * f9);
        float f12 = (f7 * f8) - (f5 * f10);
        float f13 = (f5 * f9) - (f6 * f8);
        float f14 = (f4 * f13) + (f3 * f12) + (f2 * f11);
        float[] fArr2 = new float[fArr.length];
        fArr2[0] = f11 / f14;
        fArr2[1] = f12 / f14;
        fArr2[2] = f13 / f14;
        fArr2[3] = ((f4 * f9) - (f3 * f10)) / f14;
        fArr2[4] = ((f10 * f2) - (f4 * f8)) / f14;
        fArr2[5] = ((f8 * f3) - (f9 * f2)) / f14;
        fArr2[6] = ((f3 * f7) - (f4 * f6)) / f14;
        fArr2[7] = ((f4 * f5) - (f7 * f2)) / f14;
        fArr2[8] = ((f2 * f6) - (f3 * f5)) / f14;
        return fArr2;
    }

    public static boolean L(String str, String str2) {
        return str.startsWith(str2.concat("(")) && str.endsWith(")");
    }

    public static final boolean M(m3c m3cVar) {
        if (m3cVar.h == null) {
            return false;
        }
        m3c m3cVarU = m3cVar.u();
        return (m3cVarU != null ? m3cVarU.h : null) == null || m3cVar.G.b;
    }

    public static final float[] N(float[] fArr, float[] fArr2) {
        float[] fArr3 = new float[9];
        if (fArr.length < 9 || fArr2.length < 9) {
            return fArr3;
        }
        float f2 = fArr[0] * fArr2[0];
        float f3 = fArr[3];
        float f4 = fArr2[1];
        float f5 = fArr[6];
        float f6 = fArr2[2];
        fArr3[0] = (f5 * f6) + (f3 * f4) + f2;
        float f7 = fArr[1];
        float f8 = fArr2[0];
        float f9 = fArr[4];
        float f10 = fArr[7];
        float f11 = f10 * f6;
        fArr3[1] = f11 + (f4 * f9) + (f7 * f8);
        float f12 = fArr[2] * f8;
        float f13 = fArr[5];
        float f14 = (fArr2[1] * f13) + f12;
        float f15 = fArr[8];
        fArr3[2] = (f6 * f15) + f14;
        float f16 = fArr[0];
        float f17 = fArr2[3] * f16;
        float f18 = fArr2[4];
        float f19 = (f3 * f18) + f17;
        float f20 = fArr2[5];
        fArr3[3] = (f5 * f20) + f19;
        float f21 = fArr[1];
        float f22 = fArr2[3];
        float f23 = f9 * f18;
        fArr3[4] = (f10 * f20) + f23 + (f21 * f22);
        float f24 = fArr[2];
        float f25 = f20 * f15;
        fArr3[5] = f25 + (f13 * fArr2[4]) + (f22 * f24);
        float f26 = f16 * fArr2[6];
        float f27 = fArr[3];
        float f28 = fArr2[7];
        float f29 = (f27 * f28) + f26;
        float f30 = fArr2[8];
        fArr3[6] = (f5 * f30) + f29;
        float f31 = fArr2[6];
        float f32 = f10 * f30;
        fArr3[7] = f32 + (fArr[4] * f28) + (f21 * f31);
        float f33 = f15 * f30;
        fArr3[8] = f33 + (fArr[5] * fArr2[7]) + (f24 * f31);
        return fArr3;
    }

    public static final float[] O(float[] fArr, float[] fArr2) {
        if (fArr.length < 9 || fArr2.length < 3) {
            return fArr2;
        }
        float f2 = fArr2[0];
        float f3 = fArr2[1];
        float f4 = fArr2[2];
        fArr2[0] = (fArr[6] * f4) + (fArr[3] * f3) + (fArr[0] * f2);
        fArr2[1] = (fArr[7] * f4) + (fArr[4] * f3) + (fArr[1] * f2);
        fArr2[2] = (fArr[8] * f4) + (fArr[5] * f3) + (fArr[2] * f2);
        return fArr2;
    }

    public static void P(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] jArr4 = new long[10];
        D(jArr, jArr2, jArr4);
        a0(jArr4, jArr3);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Comparable Q(d44 r5, int r6, nt5 r7) {
        /*
            boolean r0 = r7 instanceof defpackage.i44
            if (r0 == 0) goto L13
            r0 = r7
            i44 r0 = (defpackage.i44) r0
            int r1 = r0.w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.w = r1
            goto L18
        L13:
            i44 r0 = new i44
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.v
            px5 r1 = px5.a
            int r2 = r0.w
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L32
            if (r2 != r3) goto L2c
            int r6 = r0.u
            d44 r5 = r0.t
            defpackage.ybh.y(r7)
            goto L48
        L2c:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            qp2.n(r5)
            return r4
        L32:
            defpackage.ybh.y(r7)
            boolean r7 = r5.h()
            if (r7 != 0) goto L50
            r0.t = r5
            r0.u = r6
            r0.w = r3
            java.lang.Object r7 = r5.g(r6, r0)
            if (r7 != r1) goto L48
            return r1
        L48:
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            if (r7 != 0) goto L51
        L50:
            return r4
        L51:
            c04 r5 = r5.f()
            r5.getClass()
            m8g r7 = new m8g
            r7.<init>(r5)
            cmh r5 = new cmh
            r5.<init>(r7)
            byte[] r5 = w0h.l(r5, r6)
            f54 r6 = new f54
            r6.<init>(r5)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ui6.Q(d44, int, nt5):java.lang.Comparable");
    }

    public static String R(Context context, lag lagVar, kag kagVar, String str) {
        if (lagVar == lag.h) {
            int iOrdinal = kagVar.ordinal();
            if (iOrdinal == 0) {
                return str == null ? context.getString(2132020426) : context.getString(2132018021, str);
            }
            if (iOrdinal == 1) {
                return str == null ? context.getString(2132020445) : context.getString(2132017537, str);
            }
            if (iOrdinal == 2) {
                return str == null ? context.getString(2132020444) : context.getString(2132020422);
            }
        } else {
            int iOrdinal2 = kagVar.ordinal();
            if (iOrdinal2 == 0) {
                return context.getString(2132020426);
            }
            if (iOrdinal2 == 1) {
                return context.getString(2132020425);
            }
            if (iOrdinal2 == 2) {
                return context.getString(2132020422);
            }
        }
        hai.d();
        return null;
    }

    public static String S(Context context, lag lagVar) {
        switch (lagVar.ordinal()) {
            case 1:
                return context.getString(2132021553);
            case 2:
                return context.getString(2132021549);
            case 3:
                return context.getString(2132020582);
            case 4:
                return context.getString(2132021552);
            case 5:
                return context.getString(2132021539);
            case 6:
            default:
                return null;
            case 7:
                return context.getString(2132020447);
            case 8:
                return context.getString(2132019549);
        }
    }

    public static void T(AnimatorSet animatorSet, ArrayList arrayList) {
        int size = arrayList.size();
        long jMax = 0;
        for (int i2 = 0; i2 < size; i2++) {
            Animator animator = (Animator) arrayList.get(i2);
            jMax = Math.max(jMax, animator.getDuration() + animator.getStartDelay());
        }
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(0, 0);
        valueAnimatorOfInt.setDuration(jMax);
        arrayList.add(0, valueAnimatorOfInt);
        animatorSet.playTogether(arrayList);
    }

    public static final b8e U(dfe dfeVar) {
        int i2;
        if (dfeVar == null || (i2 = dfeVar.c) == 0) {
            return null;
        }
        return (b8e) dfeVar.l(i2 - 1);
    }

    public static void V(float[] fArr, float f2) {
        Matrix.translateM(fArr, 0, 0.5f, 0.5f, 0.0f);
        Matrix.rotateM(fArr, 0, f2, 0.0f, 0.0f, 1.0f);
        Matrix.translateM(fArr, 0, -0.5f, -0.5f, 0.0f);
    }

    public static void W(float[] fArr) {
        Matrix.translateM(fArr, 0, 0.0f, 0.5f, 0.0f);
        Matrix.scaleM(fArr, 0, 1.0f, -1.0f, 1.0f);
        Matrix.translateM(fArr, 0, -0.0f, -0.5f, 0.0f);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object X(d44 r4, nt5 r5) throws java.lang.Throwable {
        /*
            boolean r0 = r5 instanceof defpackage.j44
            if (r0 == 0) goto L13
            r0 = r5
            j44 r0 = (defpackage.j44) r0
            int r1 = r0.w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.w = r1
            goto L18
        L13:
            j44 r0 = new j44
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.v
            px5 r1 = px5.a
            int r2 = r0.w
            r3 = 1
            if (r2 == 0) goto L34
            if (r2 != r3) goto L2d
            c04 r4 = r0.u
            d44 r2 = r0.t
            defpackage.ybh.y(r5)
            r5 = r4
            r4 = r2
            goto L3c
        L2d:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            qp2.n(r4)
            r4 = 0
            return r4
        L34:
            defpackage.ybh.y(r5)
            c04 r5 = new c04
            r5.<init>()
        L3c:
            boolean r2 = r4.h()
            if (r2 != 0) goto L56
            c04 r2 = r4.f()
            r5.p(r2)
            r0.t = r4
            r0.u = r5
            r0.w = r3
            java.lang.Object r2 = r4.g(r3, r0)
            if (r2 != r1) goto L3c
            return r1
        L56:
            java.lang.Throwable r4 = r4.e()
            if (r4 != 0) goto L5d
            return r5
        L5d:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ui6.X(d44, nt5):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x009b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x004e -> B:24:0x0063). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x005f -> B:23:0x0061). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object Y(d44 r11, int r12, nt5 r13) throws java.io.EOFException {
        /*
            boolean r0 = r13 instanceof defpackage.k44
            if (r0 == 0) goto L13
            r0 = r13
            k44 r0 = (defpackage.k44) r0
            int r1 = r0.x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.x = r1
            goto L18
        L13:
            k44 r0 = new k44
            r0.<init>(r13)
        L18:
            java.lang.Object r13 = r0.w
            px5 r1 = px5.a
            int r2 = r0.x
            r3 = 1
            if (r2 == 0) goto L34
            if (r2 != r3) goto L2d
            int r11 = r0.v
            c04 r12 = r0.u
            d44 r2 = r0.t
            defpackage.ybh.y(r13)
            goto L61
        L2d:
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            qp2.n(r11)
            r11 = 0
            return r11
        L34:
            defpackage.ybh.y(r13)
            c04 r13 = new c04
            r13.<init>()
            r10 = r13
            r13 = r12
            r12 = r10
        L3f:
            long r4 = r12.c
            long r6 = (long) r13
            int r2 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r2 >= 0) goto L94
            c04 r2 = r11.f()
            boolean r2 = r2.x()
            if (r2 == 0) goto L63
            r0.t = r11
            r0.u = r12
            r0.v = r13
            r0.x = r3
            java.lang.Object r2 = r11.g(r3, r0)
            if (r2 != r1) goto L5f
            return r1
        L5f:
            r2 = r11
            r11 = r13
        L61:
            r13 = r11
            r11 = r2
        L63:
            boolean r2 = r11.h()
            if (r2 != 0) goto L94
            c04 r2 = r11.f()
            r2.getClass()
            long r4 = r2.c
            long r6 = (long) r13
            long r8 = r12.c
            long r8 = r6 - r8
            int r2 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r2 <= 0) goto L86
            c04 r2 = r11.f()
            long r4 = r12.c
            long r6 = r6 - r4
            r2.l(r12, r6)
            goto L3f
        L86:
            c04 r2 = r11.f()
            long r4 = r2.q(r12)
            java.lang.Long r2 = new java.lang.Long
            r2.<init>(r4)
            goto L3f
        L94:
            long r0 = r12.c
            long r2 = (long) r13
            int r11 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r11 < 0) goto L9c
            return r12
        L9c:
            java.io.EOFException r11 = new java.io.EOFException
            java.lang.String r0 = "Not enough data available, required "
            java.lang.String r1 = " bytes but only "
            java.lang.StringBuilder r13 = defpackage.p3p.o(r13, r0, r1)
            long r0 = r12.c
            java.lang.String r12 = " available"
            java.lang.String r12 = j7c.o(r0, r12, r13)
            r11.<init>(r12)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ui6.Y(d44, int, nt5):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object Z(d44 r4, mt5 r5) throws java.lang.Throwable {
        /*
            boolean r0 = r5 instanceof defpackage.l44
            if (r0 == 0) goto L13
            r0 = r5
            l44 r0 = (defpackage.l44) r0
            int r1 = r0.w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.w = r1
            goto L18
        L13:
            l44 r0 = new l44
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.v
            px5 r1 = px5.a
            int r2 = r0.w
            r3 = 1
            if (r2 == 0) goto L34
            if (r2 != r3) goto L2d
            c04 r4 = r0.u
            d44 r2 = r0.t
            defpackage.ybh.y(r5)
            r5 = r4
            r4 = r2
            goto L3c
        L2d:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            qp2.n(r4)
            r4 = 0
            return r4
        L34:
            defpackage.ybh.y(r5)
            c04 r5 = new c04
            r5.<init>()
        L3c:
            boolean r2 = r4.h()
            if (r2 != 0) goto L56
            c04 r2 = r4.f()
            r5.p(r2)
            r0.t = r4
            r0.u = r5
            r0.w = r3
            java.lang.Object r2 = r4.g(r3, r0)
            if (r2 != r1) goto L3c
            return r1
        L56:
            java.lang.Throwable r4 = r4.e()
            if (r4 != 0) goto L60
            r5.u()
            return r5
        L60:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ui6.Z(d44, mt5):java.lang.Object");
    }

    public static cd1 a(float f2) {
        return new cd1(Float.valueOf(f2), a26.e, Float.valueOf(0.01f), 8);
    }

    public static void a0(long[] jArr, long[] jArr2) {
        long j2 = jArr[0];
        long j3 = jArr[1];
        long j4 = jArr[2];
        long j5 = jArr[3];
        long j6 = jArr[4];
        long j7 = jArr[5];
        long j8 = jArr[6];
        long j9 = jArr[7];
        long j10 = jArr[8];
        long j11 = j6 ^ ((((j10 >>> 27) ^ (j10 >>> 22)) ^ (j10 >>> 20)) ^ (j10 >>> 15));
        long j12 = j2 ^ ((((j7 << 37) ^ (j7 << 42)) ^ (j7 << 44)) ^ (j7 << 49));
        long j13 = (j3 ^ ((((j8 << 37) ^ (j8 << 42)) ^ (j8 << 44)) ^ (j8 << 49))) ^ ((((j7 >>> 27) ^ (j7 >>> 22)) ^ (j7 >>> 20)) ^ (j7 >>> 15));
        long j14 = j11 >>> 27;
        jArr2[0] = (((j12 ^ j14) ^ (j14 << 5)) ^ (j14 << 7)) ^ (j14 << 12);
        jArr2[1] = j13;
        jArr2[2] = (j4 ^ ((((j9 << 37) ^ (j9 << 42)) ^ (j9 << 44)) ^ (j9 << 49))) ^ ((((j8 >>> 27) ^ (j8 >>> 22)) ^ (j8 >>> 20)) ^ (j8 >>> 15));
        jArr2[3] = (j5 ^ ((((j10 << 37) ^ (j10 << 42)) ^ (j10 << 44)) ^ (j10 << 49))) ^ ((((j9 >>> 27) ^ (j9 >>> 22)) ^ (j9 >>> 20)) ^ (j9 >>> 15));
        jArr2[4] = j11 & 134217727;
    }

    public static final void b(boolean z, Function0 function0, ih5 ih5Var, int i2) {
        int i3;
        vt9 vt9Var = (vt9) ih5Var;
        vt9Var.Y(-1339183247);
        if ((i2 & 6) == 0) {
            i3 = (vt9Var.g(z) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= vt9Var.h(function0) ? 32 : 16;
        }
        byte b2 = 0;
        if (vt9Var.N(i3 & 1, (i3 & 19) != 18)) {
            nb6.b(z, function0, vt9Var, i3 & 126, 0);
        } else {
            vt9Var.Q();
        }
        znh znhVarR = vt9Var.r();
        if (znhVarR != null) {
            znhVarR.d = new tz2(b2, i2, function0, z);
        }
    }

    public static final void b0(f17 f17Var) throws pxb {
        p21 p21Var;
        m3c m3cVarE0 = e0(f17Var);
        if (m3cVarE0.t || (p21Var = p3c.a(m3cVarE0).I) == null) {
            return;
        }
        Rect rect = p21Var.f;
        yoh yohVar = p21Var.d;
        m3c m3cVar = (m3c) yohVar.a.e(m3cVarE0.b);
        if (m3cVar == null || m3cVar.g == -4) {
            return;
        }
        ro9 ro9Var = yohVar.c;
        int iD = yohVar.d(m3cVar);
        long[] jArr = (long[]) ro9Var.c;
        long j2 = jArr[iD];
        long j3 = jArr[iD + 1];
        rect.set((int) (j2 >> 32), (int) j2, (int) (j3 >> 32), (int) j3);
        p21Var.a.J().requestAutofill(p21Var.c, m3cVarE0.b, rect);
    }

    public static final void c(String str, ih5 ih5Var, int i2) {
        String str2;
        vt9 vt9Var = (vt9) ih5Var;
        vt9Var.Y(1790675622);
        int i3 = vt9Var.S ? -vt9Var.I.v : vt9Var.G.i;
        int i4 = (vt9Var.f(str) ? 4 : 2) | i2;
        if (vt9Var.N(i4 & 1, (i4 & 3) != 2)) {
            c8e c8eVarD = a26.Y(sfe.C(mpj.e(z7e.b, 128.0f, 2), ((sa5) vt9Var.j(ua5.a)).r, kfo.i), 24.0f, 16.0f).d(mpj.a);
            tfd tfdVarC = nr3.c(rbe.f, false);
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
            y4h.o(vt9Var, tfdVarC, ujp.f);
            y4h.o(vt9Var, oagVarL, ujp.e);
            y4h.o(vt9Var, Integer.valueOf(iHashCode), ujp.g);
            y4h.m(vt9Var);
            y4h.o(vt9Var, c8eVarP, ujp.d);
            vt9Var.W(-422406400);
            if (str == null) {
                if (i3 >= 0) {
                    if (vt9Var.S) {
                        lqj lqjVar = vt9Var.I;
                        while (vt9Var.S) {
                            vt9Var.p(lqjVar.x(lqjVar.v));
                        }
                    }
                    hqj hqjVar = vt9Var.G;
                    while (true) {
                        int i5 = hqjVar.i;
                        if (i5 <= i3) {
                            break;
                        } else {
                            vt9Var.p(hqjVar.l(i5));
                        }
                    }
                } else {
                    int i6 = -i3;
                    lqj lqjVar2 = vt9Var.I;
                    while (true) {
                        int i7 = lqjVar2.v;
                        if (i7 <= i6) {
                            break;
                        } else {
                            vt9Var.p(lqjVar2.x(i7));
                        }
                    }
                }
                znh znhVarR = vt9Var.r();
                if (znhVarR != null) {
                    znhVarR.d = new lx0(str, i2, (byte) 8);
                    return;
                }
                return;
            }
            c61 c61VarF = a26.F(vt9Var);
            ikl iklVar = ((wam) vt9Var.j(abm.a)).k;
            boolean zH = vt9Var.h(c61VarF);
            Object objK = vt9Var.K();
            if (zH || objK == hh5.a) {
                objK = new nna((Object) c61VarF, (byte) 23);
                vt9Var.g0(objK);
            }
            int i8 = i4 & 14;
            str2 = str;
            na2.b(str2, null, 0L, iklVar, null, (Function1) objK, vt9Var, i8);
            vt9Var.p(false);
            vt9Var.p(true);
        } else {
            str2 = str;
            vt9Var.Q();
        }
        znh znhVarR2 = vt9Var.r();
        if (znhVarR2 != null) {
            znhVarR2.d = new lx0(str2, i2, (byte) 9);
        }
    }

    public static final wye c0(f17 f17Var, int i2) {
        wye wyeVar = ((b8e) f17Var).a.h;
        return (wyeVar.Z0() == f17Var && xye.g(i2)) ? wyeVar.v : wyeVar;
    }

    public static final void d(g1b g1bVar, jbg jbgVar, n7i n7iVar, Function1 function1, c8e c8eVar, v1b v1bVar, ih5 ih5Var, int i2) {
        vt9 vt9Var;
        v1b v1bVar2;
        v1b v1bVar3;
        int i3;
        v1b v1bVar4;
        vt9 vt9Var2 = (vt9) ih5Var;
        vt9Var2.Y(-1462669425);
        int i4 = (i2 & 6) == 0 ? (vt9Var2.f(g1bVar) ? 4 : 2) | i2 : i2;
        if ((i2 & 48) == 0) {
            i4 |= vt9Var2.f(jbgVar) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i4 |= vt9Var2.h(n7iVar) ? NotificationCompat.FLAG_LOCAL_ONLY : NotificationCompat.FLAG_HIGH_PRIORITY;
        }
        if ((i2 & 3072) == 0) {
            i4 |= vt9Var2.h(function1) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i4 |= vt9Var2.f(c8eVar) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i4 |= 65536;
        }
        byte b2 = 0;
        if (vt9Var2.N(i4 & 1, (74899 & i4) != 74898)) {
            vt9Var2.S();
            if ((i2 & 1) == 0 || vt9Var2.x()) {
                v08 v08Var = v08.a;
                v1b v1bVar5 = v08Var instanceof v1b ? (v1b) v08Var : null;
                if (v1bVar5 == null) {
                    v1bVar3 = rbg.e;
                    if (v08Var != null) {
                        v1bVar3.getClass();
                    } else {
                        v1bVar3.getClass();
                        tbg tbgVar = new tbg(v1bVar3);
                        o95.t(v08Var, tbgVar);
                        v1b v1bVar6 = tbgVar.a;
                        if (v1bVar6 == null) {
                            v1b rbgVar = new rbg(tbgVar.b, tbgVar.c, tbgVar.d.e());
                            tbgVar.a = rbgVar;
                            v1bVar6 = rbgVar;
                        }
                        v1bVar3 = v1bVar6;
                    }
                } else {
                    v1bVar3 = v1bVar5;
                }
                i3 = i4 & (-458753);
                v1bVar4 = v1bVar3;
            } else {
                vt9Var2.Q();
                i3 = i4 & (-458753);
                v1bVar4 = v1bVar;
            }
            vt9Var2.q();
            Object objK = vt9Var2.K();
            Object obj = objK;
            if (objK == hh5.a) {
                ruj rujVar = new ruj();
                int iA = qbd.a(k95.o(v1bVar4, 10));
                LinkedHashMap linkedHashMap = new LinkedHashMap(iA >= 16 ? iA : 16);
                for (Object obj2 : v1bVar4) {
                    ((Number) obj2).intValue();
                    linkedHashMap.put(obj2, Unit.a);
                }
                rujVar.putAll(linkedHashMap);
                vt9Var2.g0(rujVar);
                obj = rujVar;
            }
            vt9Var = vt9Var2;
            w1h.a(c8eVar, gyg.P(-2021229237, new zbc(n7iVar, b2), vt9Var2), null, null, null, 0, 0L, 0L, null, gyg.P(1092442976, new l5c(g1bVar, function1, jbgVar, (ruj) obj, (byte) 5), vt9Var2), vt9Var, ((i3 >> 12) & 14) | 805306416, 508);
            v1bVar2 = v1bVar4;
        } else {
            vt9Var = vt9Var2;
            vt9Var.Q();
            v1bVar2 = v1bVar;
        }
        znh znhVarR = vt9Var.r();
        if (znhVarR != null) {
            znhVarR.d = new se5(g1bVar, jbgVar, n7iVar, function1, c8eVar, v1bVar2, i2, (byte) 2);
        }
    }

    public static final wye d0(f17 f17Var) {
        if (!((b8e) f17Var).a.n) {
            a8b.b("Cannot get LayoutCoordinates, Modifier.Node is not attached.");
        }
        wye wyeVarC0 = c0(f17Var, 2);
        wyeVarC0.getClass();
        if (!wyeVarC0.Z0().n) {
            a8b.b("LayoutCoordinates is not attached.");
        }
        return wyeVarC0;
    }

    public static final void e(gcc gccVar, c8e c8eVar, ih5 ih5Var, int i2) {
        vt9 vt9Var;
        c8e c8eVar2;
        vt9 vt9Var2 = (vt9) ih5Var;
        vt9Var2.Y(-1086635073);
        int i3 = (vt9Var2.f(gccVar) ? 4 : 2) | i2 | 48;
        if (vt9Var2.N(i3 & 1, (i3 & 19) != 18)) {
            afe afeVarH = dyg.h(((jcc) gccVar).f, vt9Var2);
            jcc jccVar = (jcc) gccVar;
            afe afeVarH2 = dyg.h(jccVar.h, vt9Var2);
            g1b g1bVar = (g1b) afeVarH.getValue();
            jbg jbgVar = (jbg) afeVarH2.getValue();
            n7i n7iVar = jccVar.c.a;
            boolean z = (i3 & 14) == 4;
            Object objK = vt9Var2.K();
            if (z || objK == hh5.a) {
                objK = new ci7(1, gccVar, gcc.class, "loadLicense", "loadLicense(Lcom/opera/momi/clientsdk/ui/licenses/Dep;)V", 0, (byte) 17);
                vt9Var2.g0(objK);
            }
            c8eVar2 = z7e.b;
            vt9Var = vt9Var2;
            d(g1bVar, jbgVar, n7iVar, (mtb) objK, c8eVar2, null, vt9Var, 24576);
        } else {
            vt9Var = vt9Var2;
            vt9Var.Q();
            c8eVar2 = c8eVar;
        }
        znh znhVarR = vt9Var.r();
        if (znhVarR != null) {
            znhVarR.d = new hda(gccVar, c8eVar2, i2, (byte) 11);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: pxb */
    public static final m3c e0(f17 f17Var) throws pxb {
        wye wyeVar = ((b8e) f17Var).a.h;
        if (wyeVar != null) {
            return wyeVar.u;
        }
        throw vep.q("Cannot obtain node coordinator. Is the Modifier.Node attached?");
    }

    public static va5 f(va5 va5Var) {
        r0o r0oVar = x1p.f;
        u59 u59Var = u59.e;
        if (a26.E(va5Var.b, 12884901888L)) {
            e5i e5iVar = (e5i) va5Var;
            r0o r0oVar2 = e5iVar.d;
            if (!m(r0oVar2, r0oVar)) {
                return new e5i(e5iVar.a, e5iVar.h, r0oVar, N(l((float[]) u59Var.b, r0oVar2.a(), r0oVar.a()), e5iVar.i), e5iVar.k, e5iVar.n, e5iVar.e, e5iVar.f, e5iVar.g, -1);
            }
        }
        return va5Var;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: pxb */
    public static final v31 f0(f17 f17Var) throws pxb {
        v31 v31Var = e0(f17Var).n;
        if (v31Var != null) {
            return v31Var;
        }
        throw vep.q("This node does not have an owner.");
    }

    public static void g(long[] jArr, long[] jArr2, long[] jArr3) {
        jArr3[0] = jArr[0] ^ jArr2[0];
        jArr3[1] = jArr[1] ^ jArr2[1];
        jArr3[2] = jArr[2] ^ jArr2[2];
        jArr3[3] = jArr[3] ^ jArr2[3];
        jArr3[4] = jArr[4] ^ jArr2[4];
        jArr3[5] = jArr[5] ^ jArr2[5];
        jArr3[6] = jArr[6] ^ jArr2[6];
        jArr3[7] = jArr[7] ^ jArr2[7];
        jArr3[8] = jArr[8] ^ jArr2[8];
    }

    public static TimeInterpolator g0(Context context, int i2, Interpolator interpolator) {
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(i2, typedValue, true)) {
            return interpolator;
        }
        if (typedValue.type != 3) {
            qp2.o("Motion easing theme attribute must be an @interpolator resource for ?attr/motionEasing*Interpolator attributes or a string for ?attr/motionEasing* attributes.");
            return null;
        }
        String strValueOf = String.valueOf(typedValue.string);
        if (!L(strValueOf, "cubic-bezier") && !L(strValueOf, "path")) {
            return AnimationUtils.loadInterpolator(context, typedValue.resourceId);
        }
        if (!L(strValueOf, "cubic-bezier")) {
            if (L(strValueOf, "path")) {
                return new PathInterpolator(oup.S(p3p.h(1, 5, strValueOf)));
            }
            qp2.o("Invalid motion easing type: ".concat(strValueOf));
            return null;
        }
        String[] strArrSplit = strValueOf.substring(13, strValueOf.length() - 1).split(",");
        if (strArrSplit.length == 4) {
            return new PathInterpolator(A(strArrSplit, 0), A(strArrSplit, 1), A(strArrSplit, 2), A(strArrSplit, 3));
        }
        s49.h(strArrSplit.length, "Motion easing theme attribute must have 4 control points if using bezier curve format; instead got: ");
        return null;
    }

    public static final void h(dfe dfeVar, b8e b8eVar) {
        dfe dfeVarZ = e0(b8eVar).z();
        int i2 = dfeVarZ.c - 1;
        Object[] objArr = dfeVarZ.a;
        if (i2 < objArr.length) {
            while (i2 >= 0) {
                dfeVar.c((b8e) ((m3c) objArr[i2]).F.g);
                i2--;
            }
        }
    }

    public static y1k h0(Context context) {
        TypedValue typedValueZ = f03.Z(context.getTheme(), 2130970420);
        int[] iArr = ihh.G;
        TypedArray typedArrayObtainStyledAttributes = typedValueZ == null ? context.obtainStyledAttributes(null, iArr, 0, 2132083289) : context.obtainStyledAttributes(typedValueZ.resourceId, iArr);
        y1k y1kVar = new y1k();
        try {
            float f2 = typedArrayObtainStyledAttributes.getFloat(1, Float.MIN_VALUE);
            if (f2 == Float.MIN_VALUE) {
                throw new IllegalArgumentException("A MaterialSpring style must have stiffness value.");
            }
            float f3 = typedArrayObtainStyledAttributes.getFloat(0, Float.MIN_VALUE);
            if (f3 == Float.MIN_VALUE) {
                throw new IllegalArgumentException("A MaterialSpring style must have a damping value.");
            }
            y1kVar.b(f2);
            y1kVar.a(f3);
            return y1kVar;
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final e3c i(b8e b8eVar) {
        if ((b8eVar.c & 2) != 0) {
            if (b8eVar instanceof e3c) {
                return (e3c) b8eVar;
            }
            if (b8eVar instanceof i17) {
                b8e b8eVar2 = ((i17) b8eVar).p;
                while (b8eVar2 != 0) {
                    if (b8eVar2 instanceof e3c) {
                        return (e3c) b8eVar2;
                    }
                    b8eVar2 = (!(b8eVar2 instanceof i17) || (b8eVar2.c & 2) == 0) ? b8eVar2.f : ((i17) b8eVar2).p;
                }
            }
        }
        return null;
    }

    public static final void i0(erf erfVar, int i2, Object obj) {
        erfVar.m[(erfVar.n - erfVar.i[erfVar.j - 1].c) + i2] = obj;
    }

    public static kag[] j(lag lagVar) {
        lag lagVar2 = lag.b;
        kag kagVar = kag.c;
        kag kagVar2 = kag.b;
        return lagVar == lagVar2 ? new kag[]{kagVar2, kagVar} : new kag[]{kag.d, kagVar2, kagVar};
    }

    public static final void j0(erf erfVar, int i2, Object obj, int i3, Object obj2) {
        int i4 = erfVar.n - erfVar.i[erfVar.j - 1].c;
        Object[] objArr = erfVar.m;
        objArr[i2 + i4] = obj;
        objArr[i4 + i3] = obj2;
    }

    public static final boolean k(ip7 ip7Var, Set set) {
        Object next;
        if (ip7Var.b()) {
            return set.contains(ip7Var);
        }
        Iterator it = set.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            ip7 ip7Var2 = (ip7) next;
            jpo.n("Fully specified range is not actually fully specified.", ip7Var2.b());
            int i2 = ip7Var.b;
            if (i2 == 0 || i2 == ip7Var2.b) {
                jpo.n("Fully specified range is not actually fully specified.", ip7Var2.b());
                int i3 = ip7Var.a;
                if (i3 == 0) {
                    break;
                }
                int i4 = ip7Var2.a;
                if ((i3 == 2 && i4 != 1) || i3 == i4) {
                    break;
                }
            }
        }
        return next != null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x005f, code lost:
    
        if (r(r6, r7, r0) == r1) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object k0(d44 r6, f54 r7, nt5 r8) {
        /*
            boolean r0 = r8 instanceof defpackage.m44
            if (r0 == 0) goto L13
            r0 = r8
            m44 r0 = (defpackage.m44) r0
            int r1 = r0.w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.w = r1
            goto L18
        L13:
            m44 r0 = new m44
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.v
            px5 r1 = px5.a
            int r2 = r0.w
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L39
            if (r2 == r5) goto L31
            if (r2 != r4) goto L2b
            defpackage.ybh.y(r8)
            goto L62
        L2b:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            qp2.n(r6)
            return r3
        L31:
            f54 r7 = r0.u
            d44 r6 = r0.t
            defpackage.ybh.y(r8)
            goto L4b
        L39:
            defpackage.ybh.y(r8)
            byte[] r8 = r7.a
            int r8 = r8.length
            r0.t = r6
            r0.u = r7
            r0.w = r5
            java.lang.Comparable r8 = Q(r6, r8, r0)
            if (r8 == r1) goto L61
        L4b:
            boolean r8 = kotlin.jvm.internal.Intrinsics.a(r8, r7)
            if (r8 == 0) goto L65
            byte[] r7 = r7.a
            int r7 = r7.length
            long r7 = (long) r7
            r0.t = r3
            r0.u = r3
            r0.w = r4
            java.lang.Object r6 = r(r6, r7, r0)
            if (r6 != r1) goto L62
        L61:
            return r1
        L62:
            java.lang.Boolean r6 = java.lang.Boolean.TRUE
            return r6
        L65:
            java.lang.Boolean r6 = java.lang.Boolean.FALSE
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ui6.k0(d44, f54, nt5):java.lang.Object");
    }

    public static final float[] l(float[] fArr, float[] fArr2, float[] fArr3) {
        O(fArr, fArr2);
        O(fArr, fArr3);
        float[] fArr4 = {fArr3[0] / fArr2[0], fArr3[1] / fArr2[1], fArr3[2] / fArr2[2]};
        float[] fArrK = K(fArr);
        float f2 = fArr4[0];
        float f3 = fArr[0] * f2;
        float f4 = fArr4[1];
        float f5 = fArr[1] * f4;
        float f6 = fArr4[2];
        return N(fArrK, new float[]{f3, f5, fArr[2] * f6, fArr[3] * f2, fArr[4] * f4, fArr[5] * f6, f2 * fArr[6], f4 * fArr[7], f6 * fArr[8]});
    }

    public static void l0(long[] jArr, long[] jArr2) {
        long[] jArr3 = new long[9];
        F(jArr, jArr3);
        a0(jArr3, jArr2);
    }

    public static final boolean m(r0o r0oVar, r0o r0oVar2) {
        if (r0oVar == r0oVar2) {
            return true;
        }
        return Math.abs(r0oVar.a - r0oVar2.a) < 0.001f && Math.abs(r0oVar.b - r0oVar2.b) < 0.001f;
    }

    public static void m0(long[] jArr, long[] jArr2, int i2) {
        long[] jArr3 = new long[9];
        F(jArr, jArr3);
        while (true) {
            a0(jArr3, jArr2);
            i2--;
            if (i2 <= 0) {
                return;
            } else {
                F(jArr2, jArr3);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x008d, code lost:
    
        if (r1.g(r7, r13) != r2) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00bb, code lost:
    
        if (r0 == r2) goto L51;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /* JADX WARN: Type inference failed for: r3v0, types: [int] */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v4, types: [i54] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x00bb -> B:36:0x00bd). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object n(d44 r17, i54 r18, long r19, nt5 r21) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 258
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ui6.n(d44, i54, long, nt5):java.lang.Object");
    }

    public static boolean n0() {
        if (!c.m(Build.MANUFACTURER, "Google", true) && !c.m(Build.BRAND, "Google", true)) {
            return false;
        }
        return ExtraSupportedSurfaceCombinationsQuirk.c.contains(Build.MODEL.toUpperCase(Locale.ROOT));
    }

    public static ShapeDrawable o(Context context) {
        ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
        int dimensionPixelSize = (context.getResources().getDimensionPixelSize(2131165329) - (wz3.a.k(context) << 1)) - (z7h.h(context, 2.0f) << 1);
        shapeDrawable.setIntrinsicWidth(dimensionPixelSize);
        shapeDrawable.setIntrinsicHeight(dimensionPixelSize);
        shapeDrawable.getPaint().setColor(j7h.k(2130969328, context));
        return shapeDrawable;
    }

    public static boolean o0() {
        if (c.m(Build.MANUFACTURER, "Samsung", true) || c.m(Build.BRAND, "Samsung", true)) {
            String upperCase = Build.MODEL.toUpperCase(Locale.ROOT);
            Iterator it = ExtraSupportedSurfaceCombinationsQuirk.d.iterator();
            while (it.hasNext()) {
                if (c.q(upperCase, (String) it.next(), false)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static final zm5 p(va5 va5Var, va5 va5Var2) {
        return va5Var == va5Var2 ? new vm5(va5Var, va5Var, 1) : (a26.E(va5Var.b, 12884901888L) && a26.E(va5Var2.b, 12884901888L)) ? new wm5((e5i) va5Var, (e5i) va5Var2) : new zm5(va5Var, va5Var2, 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r4v2, types: [byte[], java.io.Serializable] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.io.Serializable p0(d44 r4, nt5 r5) throws java.lang.Throwable {
        /*
            boolean r0 = r5 instanceof defpackage.n44
            if (r0 == 0) goto L13
            r0 = r5
            n44 r0 = (defpackage.n44) r0
            int r1 = r0.u
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.u = r1
            goto L18
        L13:
            n44 r0 = new n44
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.t
            px5 r1 = px5.a
            int r2 = r0.u
            r3 = 1
            if (r2 == 0) goto L2e
            if (r2 != r3) goto L27
            defpackage.ybh.y(r5)
            goto L3a
        L27:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            qp2.n(r4)
            r4 = 0
            return r4
        L2e:
            defpackage.ybh.y(r5)
            r0.u = r3
            java.lang.Object r5 = X(r4, r0)
            if (r5 != r1) goto L3a
            return r1
        L3a:
            c04 r5 = (c04) r5
            long r0 = r5.c
            int r4 = (int) r0
            byte[] r4 = w0h.l(r5, r4)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ui6.p0(d44, nt5):java.io.Serializable");
    }

    public static ShapeDrawable q(float f2, float f3, float f4, float f5) {
        return new ShapeDrawable(new RoundRectShape(new float[]{f2, f2, f3, f3, f4, f4, f5, f5}, null, null));
    }

    public static final String q0(mt5 mt5Var) {
        String q0iVar;
        if (mt5Var instanceof ia7) {
            return ((ia7) mt5Var).toString();
        }
        try {
            p0i p0iVar = t0i.b;
            q0iVar = mt5Var + '@' + y(mt5Var);
        } catch (Throwable th) {
            p0i p0iVar2 = t0i.b;
            q0iVar = new q0i(th);
        }
        if (t0i.d(q0iVar) != null) {
            q0iVar = mt5Var.getClass().getName() + '@' + y(mt5Var);
        }
        return q0iVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x004e -> B:26:0x0065). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x005f -> B:25:0x0062). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object r(d44 r10, long r11, nt5 r13) {
        /*
            boolean r0 = r13 instanceof defpackage.f44
            if (r0 == 0) goto L13
            r0 = r13
            f44 r0 = (defpackage.f44) r0
            int r1 = r0.x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.x = r1
            goto L18
        L13:
            f44 r0 = new f44
            r0.<init>(r13)
        L18:
            java.lang.Object r13 = r0.w
            px5 r1 = px5.a
            int r2 = r0.x
            r3 = 1
            if (r2 == 0) goto L34
            if (r2 != r3) goto L2d
            long r10 = r0.v
            long r4 = r0.u
            d44 r12 = r0.t
            defpackage.ybh.y(r13)
            goto L62
        L2d:
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            qp2.n(r10)
            r10 = 0
            return r10
        L34:
            defpackage.ybh.y(r13)
            r4 = r11
        L38:
            r6 = 0
            int r13 = (r11 > r6 ? 1 : (r11 == r6 ? 0 : -1))
            if (r13 <= 0) goto L7b
            boolean r13 = r10.h()
            if (r13 != 0) goto L7b
            c04 r13 = r10.f()
            r13.getClass()
            long r6 = r13.c
            int r13 = (int) r6
            if (r13 != 0) goto L65
            r0.t = r10
            r0.u = r4
            r0.v = r11
            r0.x = r3
            java.lang.Object r13 = r10.g(r3, r0)
            if (r13 != r1) goto L5f
            return r1
        L5f:
            r8 = r11
            r12 = r10
            r10 = r8
        L62:
            r8 = r10
            r10 = r12
            r11 = r8
        L65:
            c04 r13 = r10.f()
            r13.getClass()
            long r6 = r13.c
            long r6 = java.lang.Math.min(r11, r6)
            c04 r13 = r10.f()
            c09.k(r13, r6)
            long r11 = r11 - r6
            goto L38
        L7b:
            long r4 = r4 - r11
            java.lang.Long r10 = new java.lang.Long
            r10.<init>(r4)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ui6.r(d44, long, nt5):java.lang.Object");
    }

    public static long r0(long j2) {
        return phj.x(16, phj.x(8, phj.x(4, phj.x(2, phj.x(1, j2, 2459565876494606882L), 868082074056920076L), 67555025218437360L), 280375465148160L), 4294901760L);
    }

    public static long s(int i2) {
        return (((r6 >>> 1) & 1431655765) << 32) | (phj.w(phj.w(phj.w(phj.w(i2, 65280, 8), 15728880, 4), 202116108, 2), 572662306, 1) & 1431655765);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object s0(kotlin.coroutines.CoroutineContext r5, java.lang.Object r6, java.lang.Object r7, kotlin.jvm.functions.Function2 r8, mt5 r9) throws java.lang.Throwable {
        /*
            boolean r0 = r9 instanceof defpackage.vr4
            if (r0 == 0) goto L13
            r0 = r9
            vr4 r0 = (defpackage.vr4) r0
            int r1 = r0.y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.y = r1
            goto L18
        L13:
            vr4 r0 = new vr4
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.x
            px5 r1 = px5.a
            int r2 = r0.y
            r3 = 1
            if (r2 == 0) goto L40
            if (r2 != r3) goto L39
            java.lang.Object r5 = r0.w
            kotlin.coroutines.CoroutineContext r6 = r0.v
            kotlin.coroutines.CoroutineContext r6 = (kotlin.coroutines.CoroutineContext) r6
            kotlin.coroutines.CoroutineContext r7 = r0.t
            kotlin.coroutines.CoroutineContext r7 = (kotlin.coroutines.CoroutineContext) r7
            defpackage.ybh.y(r9)     // Catch: java.lang.Throwable -> L33
            r7 = r5
            r5 = r6
            goto L6f
        L33:
            r7 = move-exception
            r4 = r7
            r7 = r5
            r5 = r6
            r6 = r4
            goto L74
        L39:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            qp2.n(r5)
            r5 = 0
            return r5
        L40:
            defpackage.ybh.y(r9)
            java.lang.Object r7 = eml.b(r5, r7)
            r9 = r5
            kotlin.coroutines.CoroutineContext r9 = (kotlin.coroutines.CoroutineContext) r9     // Catch: java.lang.Throwable -> L73
            r0.t = r9     // Catch: java.lang.Throwable -> L73
            r0.u = r6     // Catch: java.lang.Throwable -> L73
            r9 = r5
            kotlin.coroutines.CoroutineContext r9 = (kotlin.coroutines.CoroutineContext) r9     // Catch: java.lang.Throwable -> L73
            r0.v = r9     // Catch: java.lang.Throwable -> L73
            r0.w = r7     // Catch: java.lang.Throwable -> L73
            r0.y = r3     // Catch: java.lang.Throwable -> L73
            q2k r9 = new q2k     // Catch: java.lang.Throwable -> L73
            r9.<init>(r0, r5)     // Catch: java.lang.Throwable -> L73
            if (r8 != 0) goto L63
            java.lang.Object r6 = hib.c(r6, r8, r9)     // Catch: java.lang.Throwable -> L73
            goto L6b
        L63:
            r0 = 2
            defpackage.y9m.t(r0, r8)     // Catch: java.lang.Throwable -> L73
            java.lang.Object r6 = r8.invoke(r6, r9)     // Catch: java.lang.Throwable -> L73
        L6b:
            r9 = r6
            if (r9 != r1) goto L6f
            return r1
        L6f:
            eml.a(r5, r7)
            return r9
        L73:
            r6 = move-exception
        L74:
            eml.a(r5, r7)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ui6.s0(kotlin.coroutines.CoroutineContext, java.lang.Object, java.lang.Object, kotlin.jvm.functions.Function2, mt5):java.lang.Object");
    }

    public static void t(long[] jArr, long[] jArr2, int i2) {
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            long jX = phj.x(1, phj.x(2, phj.x(4, phj.x(8, phj.x(16, jArr[i4], 4294901760L), 280375465148160L), 67555025218437360L), 868082074056920076L), 2459565876494606882L);
            jArr2[i3] = jX & 6148914691236517205L;
            jArr2[i3 + 1] = (jX >>> 1) & 6148914691236517205L;
            i3 += 2;
        }
    }

    public static bj0 u(Context context, bj0 bj0Var) {
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        zi0 zi0Var = zi0.n;
        aj0 aj0Var = aj0.g;
        if (connectivityManager == null) {
            bj0Var.r(0, 1, false);
            bj0Var.q(5, 1, aj0Var);
            bj0Var.q(6, 1, zi0Var);
            return bj0Var;
        }
        NetworkInfo networkInfo = connectivityManager.getNetworkInfo(1);
        bj0Var.r(1, 1, networkInfo != null && networkInfo.isConnected());
        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        bj0Var.r(0, 1, activeNetworkInfo != null && activeNetworkInfo.isConnected());
        bj0Var.r(2, 1, connectivityManager.isActiveNetworkMetered());
        if (activeNetworkInfo != null) {
            bj0Var.r(3, 1, activeNetworkInfo.isRoaming());
            int i2 = b5f.b[activeNetworkInfo.getState().ordinal()];
            if (i2 == 1) {
                aj0Var = aj0.b;
            } else if (i2 == 2) {
                aj0Var = aj0.c;
            } else if (i2 == 3) {
                aj0Var = aj0.d;
            } else if (i2 == 4) {
                aj0Var = aj0.e;
            } else if (i2 == 5) {
                aj0Var = aj0.f;
            }
            bj0Var.q(5, 1, aj0Var);
            switch (b5f.a[activeNetworkInfo.getDetailedState().ordinal()]) {
                case 1:
                    zi0Var = zi0.b;
                    break;
                case 2:
                    zi0Var = zi0.c;
                    break;
                case 3:
                    zi0Var = zi0.d;
                    break;
                case 4:
                    zi0Var = zi0.e;
                    break;
                case 5:
                    zi0Var = zi0.f;
                    break;
                case 6:
                    zi0Var = zi0.g;
                    break;
                case 7:
                    zi0Var = zi0.h;
                    break;
                case 8:
                    zi0Var = zi0.i;
                    break;
                case 9:
                    zi0Var = zi0.j;
                    break;
                case 10:
                    zi0Var = zi0.k;
                    break;
                case 11:
                    zi0Var = zi0.l;
                    break;
                case 12:
                    zi0Var = zi0.m;
                    break;
                case 13:
                    zi0Var = zi0.o;
                    break;
            }
            bj0Var.q(6, 1, zi0Var);
        }
        int restrictBackgroundStatus = connectivityManager.getRestrictBackgroundStatus();
        bj0Var.q(4, 1, restrictBackgroundStatus != 1 ? restrictBackgroundStatus != 2 ? restrictBackgroundStatus != 3 ? wo0.b : wo0.e : wo0.d : wo0.c);
        return bj0Var;
    }

    public static String v(v3g v3gVar, String str) {
        for (t4g t4gVar : v3gVar.E) {
            if (t4gVar.d && Intrinsics.a(t4gVar.a, str)) {
                return t4gVar.b;
            }
        }
        return null;
    }

    public static ArrayList x(String str, lag[] lagVarArr, boolean z) {
        kag kagVarK;
        ArrayList arrayListB = B(z, false, str, lagVarArr);
        HashSet hashSet = new HashSet();
        int size = arrayListB.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayListB.get(i2);
            i2++;
            hashSet.add((lag) ((Pair) obj).first);
        }
        for (lag lagVar : lagVarArr) {
            if (!hashSet.contains(lagVar) && (kagVarK = s9g.h.b.k(lagVar)) == kag.b) {
                arrayListB.add(new Pair(lagVar, kagVarK));
            }
        }
        return arrayListB;
    }

    public static final String y(Object obj) {
        return Integer.toHexString(System.identityHashCode(obj));
    }

    public static int z(lag lagVar, kag kagVar) {
        boolean z = kagVar == kag.c;
        switch (lagVar.ordinal()) {
            case 1:
                return z ? 2131232160 : 2131232158;
            case 2:
                return z ? 2131232129 : 2131232127;
            case 3:
                return z ? 2131232134 : 2131232133;
            case 4:
                return z ? 2131232138 : 2131232137;
            case 5:
                return z ? 2131232014 : 2131232013;
            case 6:
            default:
                return 0;
            case 7:
                return 2131232067;
            case 8:
                return 2131232126;
        }
    }

    public void w(mbj mbjVar, float f2, float f3) {
        float f4 = f3 * f2;
        mbjVar.d(0.0f, f4, 180.0f, 90.0f);
        double d2 = f4;
        mbjVar.c((float) (1.0d * d2), (float) (Math.sin(Math.toRadians(0.0d)) * d2));
    }
}
