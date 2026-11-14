package defpackage;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.ResolveInfo;
import android.content.pm.Signature;
import android.content.pm.SigningInfo;
import android.net.Uri;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import java.lang.reflect.InvocationTargetException;
import java.math.BigDecimal;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.cert.X509Certificate;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.ParseException;
import java.text.ParsePosition;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;
import kotlin.text.c;

/* loaded from: classes.dex */
public abstract class cs5 {
    public static final int[] a = {R.attr.name, R.attr.tint, R.attr.height, R.attr.width, R.attr.alpha, R.attr.autoMirrored, R.attr.tintMode, R.attr.viewportWidth, R.attr.viewportHeight};
    public static final int[] b = {R.attr.name, R.attr.pivotX, R.attr.pivotY, R.attr.scaleX, R.attr.scaleY, R.attr.rotation, R.attr.translateX, R.attr.translateY};
    public static final int[] c = {R.attr.name, R.attr.fillColor, R.attr.pathData, R.attr.strokeColor, R.attr.strokeWidth, R.attr.trimPathStart, R.attr.trimPathEnd, R.attr.trimPathOffset, R.attr.strokeLineCap, R.attr.strokeLineJoin, R.attr.strokeMiterLimit, R.attr.strokeAlpha, R.attr.fillAlpha, R.attr.fillType};
    public static final int[] d = {R.attr.name, R.attr.pathData};
    public static final ue5 e = new ue5(-557116275, new cf5((byte) 20), false);
    public static final ue5 f = new ue5(1712535468, new cf5((byte) 21), false);
    public static final u0b g = new u0b(false);
    public static final c9 h = new c9(22);
    public static final char[] i = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    public static final int[] j = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 511};
    public static final fr k = new fr(0, 0, (byte) 27);
    public static final eko l = new eko(24);

    public static final long A(long j2) {
        long j3 = j2 << 1;
        pn7.b.getClass();
        int i2 = rn7.a;
        return j3;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.io.Serializable A0(ozh r5, mt5 r6) {
        /*
            boolean r0 = r6 instanceof defpackage.ol8
            if (r0 == 0) goto L13
            r0 = r6
            ol8 r0 = (defpackage.ol8) r0
            int r1 = r0.w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.w = r1
            goto L18
        L13:
            ol8 r0 = new ol8
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.v
            px5 r1 = px5.a
            int r2 = r0.w
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L32
            if (r2 != r4) goto L2c
            int r5 = r0.u
            java.lang.String r0 = r0.t
            defpackage.ybh.y(r6)
            goto L5c
        L2c:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            qp2.n(r5)
            return r3
        L32:
            defpackage.ybh.y(r6)
            boolean r6 = r5.a()
            fr6 r5 = r5.a
            if (r6 != 0) goto L64
            zqa r6 = r5.e()
            int r6 = r6.a
            zqa r2 = r5.e()
            java.lang.String r2 = r2.toString()
            r0.t = r2
            r0.u = r6
            r0.w = r4
            java.lang.Object r5 = w(r5, r0)
            if (r5 != r1) goto L58
            return r1
        L58:
            r0 = r6
            r6 = r5
            r5 = r0
            r0 = r2
        L5c:
            ji1 r6 = (ji1) r6
            ooa r1 = new ooa
            r1.<init>(r5, r0, r6)
            return r1
        L64:
            java.lang.String r5 = "Failed requirement."
            qp2.o(r5)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cs5.A0(ozh, mt5):java.io.Serializable");
    }

    public static final void B(gbc gbcVar) {
        djl djlVar = gbcVar.e;
        if (djlVar != null) {
            gbcVar.v.invoke(mil.a((mil) gbcVar.d.a, null, 0L, 3));
            ajl ajlVar = djlVar.a;
            AtomicReference atomicReference = ajlVar.b;
            while (true) {
                if (atomicReference.compareAndSet(djlVar, null)) {
                    ajlVar.a.d();
                    break;
                } else if (atomicReference.get() != djlVar) {
                    break;
                }
            }
        }
        gbcVar.e = null;
    }

    public static final void B0(int i2, int i3, int i4) {
        boolean z = false;
        if (i2 >= 0 && i2 <= i3) {
            z = true;
        }
        if (z) {
            return;
        }
        StringBuilder sbO = sko.o(i4, i2, "OffsetMapping.originalToTransformed returned invalid mapping: ", " -> ", " is not in range of transformed text [0, ");
        sbO.append(i3);
        sbO.append("]");
        d8b.c(sbO.toString());
    }

    public static final j2m C(uac uacVar, sf1 sf1Var) {
        uacVar.getClass();
        int length = sf1Var.b.length();
        int length2 = sf1Var.b.length();
        int iMin = Math.min(length, 100);
        for (int i2 = 0; i2 < iMin; i2++) {
            B0(i2, length2, i2);
        }
        B0(length, length2, length);
        int iMin2 = Math.min(length2, 100);
        for (int i3 = 0; i3 < iMin2; i3++) {
            C0(i3, length, i3);
        }
        C0(length2, length, length2);
        return new j2m(sf1Var, new fr(sf1Var.b.length(), sf1Var.b.length(), (byte) 27));
    }

    public static final void C0(int i2, int i3, int i4) {
        boolean z = false;
        if (i2 >= 0 && i2 <= i3) {
            z = true;
        }
        if (z) {
            return;
        }
        StringBuilder sbO = sko.o(i4, i2, "OffsetMapping.transformedToOriginal returned invalid mapping: ", " -> ", " is not in range of original text [0, ");
        sbO.append(i3);
        sbO.append("]");
        d8b.c(sbO.toString());
    }

    public static final Activity D(Context context) {
        while (context instanceof ContextWrapper) {
            if (context instanceof Activity) {
                return (Activity) context;
            }
            context = ((ContextWrapper) context).getBaseContext();
        }
        return null;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: m2 */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0064 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object E(f99 r7, mt5 r8) throws m2 {
        /*
            gd7 r0 = defpackage.vtp.d
            boolean r1 = r8 instanceof defpackage.qa9
            if (r1 == 0) goto L15
            r1 = r8
            qa9 r1 = (defpackage.qa9) r1
            int r2 = r1.w
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.w = r2
            goto L1a
        L15:
            qa9 r1 = new qa9
            r1.<init>(r8)
        L1a:
            java.lang.Object r8 = r1.v
            px5 r2 = px5.a
            int r3 = r1.w
            r4 = 0
            r5 = 1
            if (r3 == 0) goto L36
            if (r3 != r5) goto L30
            na9 r7 = r1.u
            pqh r2 = r1.t
            defpackage.ybh.y(r8)     // Catch: m2 -> L2e
            goto L60
        L2e:
            r8 = move-exception
            goto L55
        L30:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            qp2.n(r7)
            return r4
        L36:
            pqh r8 = sko.f(r8)
            r8.a = r0
            na9 r3 = new na9
            r6 = 0
            r3.<init>(r8, r6)
            r1.t = r8     // Catch: m2 -> L51
            r1.u = r3     // Catch: m2 -> L51
            r1.w = r5     // Catch: m2 -> L51
            java.lang.Object r7 = r7.collect(r3, r1)     // Catch: m2 -> L51
            if (r7 != r2) goto L4f
            return r2
        L4f:
            r2 = r8
            goto L60
        L51:
            r7 = move-exception
            r2 = r8
            r8 = r7
            r7 = r3
        L55:
            java.lang.Object r3 = r8.a
            if (r3 != r7) goto L6b
            kotlin.coroutines.CoroutineContext r7 = r1.getContext()
            defpackage.o0g.H(r7)
        L60:
            java.lang.Object r7 = r2.a
            if (r7 == r0) goto L65
            return r7
        L65:
            java.lang.String r7 = "Expected at least one element"
            h9o.h(r7)
            return r4
        L6b:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cs5.E(f99, mt5):java.lang.Object");
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: m2 */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0064 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object F(f99 r7, kotlin.jvm.functions.Function2 r8, mt5 r9) throws m2 {
        /*
            gd7 r0 = defpackage.vtp.d
            boolean r1 = r9 instanceof defpackage.ra9
            if (r1 == 0) goto L15
            r1 = r9
            ra9 r1 = (defpackage.ra9) r1
            int r2 = r1.w
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.w = r2
            goto L1a
        L15:
            ra9 r1 = new ra9
            r1.<init>(r9)
        L1a:
            java.lang.Object r9 = r1.v
            px5 r2 = px5.a
            int r3 = r1.w
            r4 = 0
            r5 = 1
            if (r3 == 0) goto L36
            if (r3 != r5) goto L30
            pa9 r7 = r1.u
            pqh r8 = r1.t
            defpackage.ybh.y(r9)     // Catch: m2 -> L2e
            goto L60
        L2e:
            r9 = move-exception
            goto L55
        L30:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            qp2.n(r7)
            return r4
        L36:
            pqh r9 = sko.f(r9)
            r9.a = r0
            pa9 r3 = new pa9
            r6 = 0
            r3.<init>(r8, r9, r6)
            r1.t = r9     // Catch: m2 -> L51
            r1.u = r3     // Catch: m2 -> L51
            r1.w = r5     // Catch: m2 -> L51
            java.lang.Object r7 = r7.collect(r3, r1)     // Catch: m2 -> L51
            if (r7 != r2) goto L4f
            return r2
        L4f:
            r8 = r9
            goto L60
        L51:
            r7 = move-exception
            r8 = r9
            r9 = r7
            r7 = r3
        L55:
            java.lang.Object r2 = r9.a
            if (r2 != r7) goto L6b
            kotlin.coroutines.CoroutineContext r7 = r1.getContext()
            defpackage.o0g.H(r7)
        L60:
            java.lang.Object r7 = r8.a
            if (r7 == r0) goto L65
            return r7
        L65:
            java.lang.String r7 = "Expected at least one element matching the predicate"
            h9o.h(r7)
            return r4
        L6b:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cs5.F(f99, kotlin.jvm.functions.Function2, mt5):java.lang.Object");
    }

    public static Object G(Object obj, Object obj2) {
        if (obj != null) {
            return obj;
        }
        if (obj2 != null) {
            return obj2;
        }
        t3p.q("Both parameters are null");
        return null;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: m2 */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object H(f99 r4, mt5 r5) throws m2 {
        /*
            boolean r0 = r5 instanceof defpackage.ta9
            if (r0 == 0) goto L13
            r0 = r5
            ta9 r0 = (defpackage.ta9) r0
            int r1 = r0.w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.w = r1
            goto L18
        L13:
            ta9 r0 = new ta9
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.v
            px5 r1 = px5.a
            int r2 = r0.w
            r3 = 1
            if (r2 == 0) goto L34
            if (r2 != r3) goto L2d
            na9 r4 = r0.u
            pqh r1 = r0.t
            defpackage.ybh.y(r5)     // Catch: m2 -> L2b
            goto L5b
        L2b:
            r5 = move-exception
            goto L50
        L2d:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            qp2.n(r4)
            r4 = 0
            return r4
        L34:
            pqh r5 = sko.f(r5)
            na9 r2 = new na9
            r2.<init>(r5, r3)
            r0.t = r5     // Catch: m2 -> L4c
            r0.u = r2     // Catch: m2 -> L4c
            r0.w = r3     // Catch: m2 -> L4c
            java.lang.Object r4 = r4.collect(r2, r0)     // Catch: m2 -> L4c
            if (r4 != r1) goto L4a
            return r1
        L4a:
            r1 = r5
            goto L5b
        L4c:
            r4 = move-exception
            r1 = r5
            r5 = r4
            r4 = r2
        L50:
            java.lang.Object r2 = r5.a
            if (r2 != r4) goto L5e
            kotlin.coroutines.CoroutineContext r4 = r0.getContext()
            defpackage.o0g.H(r4)
        L5b:
            java.lang.Object r4 = r1.a
            return r4
        L5e:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cs5.H(f99, mt5):java.lang.Object");
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: m2 */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object I(f99 r4, kotlin.jvm.functions.Function2 r5, nt5 r6) throws m2 {
        /*
            boolean r0 = r6 instanceof defpackage.ua9
            if (r0 == 0) goto L13
            r0 = r6
            ua9 r0 = (defpackage.ua9) r0
            int r1 = r0.w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.w = r1
            goto L18
        L13:
            ua9 r0 = new ua9
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.v
            px5 r1 = px5.a
            int r2 = r0.w
            r3 = 1
            if (r2 == 0) goto L34
            if (r2 != r3) goto L2d
            pa9 r4 = r0.u
            pqh r5 = r0.t
            defpackage.ybh.y(r6)     // Catch: m2 -> L2b
            goto L5b
        L2b:
            r6 = move-exception
            goto L50
        L2d:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            qp2.n(r4)
            r4 = 0
            return r4
        L34:
            pqh r6 = sko.f(r6)
            pa9 r2 = new pa9
            r2.<init>(r5, r6, r3)
            r0.t = r6     // Catch: m2 -> L4c
            r0.u = r2     // Catch: m2 -> L4c
            r0.w = r3     // Catch: m2 -> L4c
            java.lang.Object r4 = r4.collect(r2, r0)     // Catch: m2 -> L4c
            if (r4 != r1) goto L4a
            return r1
        L4a:
            r5 = r6
            goto L5b
        L4c:
            r4 = move-exception
            r5 = r6
            r6 = r4
            r4 = r2
        L50:
            java.lang.Object r1 = r6.a
            if (r1 != r4) goto L5e
            kotlin.coroutines.CoroutineContext r4 = r0.getContext()
            defpackage.o0g.H(r4)
        L5b:
            java.lang.Object r4 = r5.a
            return r4
        L5e:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cs5.I(f99, kotlin.jvm.functions.Function2, nt5):java.lang.Object");
    }

    public static int J(CharSequence charSequence) {
        if (charSequence.length() == 0) {
            return 2;
        }
        int length = charSequence.length();
        int iCharCount = 0;
        while (iCharCount < length) {
            int iCodePointAt = Character.codePointAt(charSequence, iCharCount);
            byte directionality = Character.getDirectionality(iCodePointAt);
            if (directionality != 0) {
                if (directionality != 1 && directionality != 2) {
                    switch (directionality) {
                        case 14:
                        case 15:
                            break;
                        case 16:
                        case 17:
                            break;
                        default:
                            iCharCount += Character.charCount(iCodePointAt);
                    }
                }
                return 1;
            }
            return 0;
        }
        return 2;
    }

    public static PackageInfo K(String str, int i2) {
        try {
            return t8.a.getPackageManager().getPackageInfo(str, i2);
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    public static int L(View view) {
        k2c k2cVar;
        l2c l2cVarB;
        if (!(view instanceof k2c)) {
            ViewParent parent = view.getParent();
            while (true) {
                if (parent == null) {
                    k2cVar = null;
                    break;
                }
                if (parent instanceof k2c) {
                    k2cVar = (k2c) parent;
                    break;
                }
                parent = parent.getParent();
            }
        } else {
            k2cVar = (k2c) view;
        }
        return (k2cVar == null || (l2cVarB = k2cVar.b()) == null) ? l2c.a(view.getContext()) : l2cVarB.c();
    }

    public static void M(int[] iArr, int[] iArr2, int[] iArr3) {
        o0g.p0(iArr, iArr2, iArr3);
        long j2 = iArr2[8] & 4294967295L;
        long j3 = iArr2[9] & 4294967295L;
        long j4 = iArr2[10] & 4294967295L;
        long j5 = iArr2[11] & 4294967295L;
        long j6 = iArr2[12] & 4294967295L;
        long j7 = iArr2[13] & 4294967295L;
        long j8 = iArr2[14] & 4294967295L;
        long j9 = iArr2[15] & 4294967295L;
        long j10 = iArr[8] & 4294967295L;
        long j11 = j10 * j2;
        iArr3[16] = (int) j11;
        int i2 = 32;
        long j12 = (j10 * j3) + (j11 >>> 32);
        iArr3[17] = (int) j12;
        long j13 = (j10 * j4) + (j12 >>> 32);
        iArr3[18] = (int) j13;
        long j14 = (j10 * j5) + (j13 >>> 32);
        iArr3[19] = (int) j14;
        long j15 = (j10 * j6) + (j14 >>> 32);
        iArr3[20] = (int) j15;
        long j16 = (j10 * j7) + (j15 >>> 32);
        iArr3[21] = (int) j16;
        long j17 = (j10 * j8) + (j16 >>> 32);
        iArr3[22] = (int) j17;
        long j18 = (j10 * j9) + (j17 >>> 32);
        iArr3[23] = (int) j18;
        iArr3[24] = (int) (j18 >>> 32);
        int i3 = 16;
        int i4 = 1;
        while (i4 < 8) {
            int i5 = i3 + 1;
            int i6 = i4;
            long j19 = j6;
            int i7 = i2;
            long j20 = iArr[8 + i4] & 4294967295L;
            long j21 = j7;
            long j22 = (j20 * j2) + (iArr3[i5] & 4294967295L);
            iArr3[i5] = (int) j22;
            long j23 = (j20 * j3) + (iArr3[r15] & 4294967295L) + (j22 >>> i7);
            iArr3[i3 + 2] = (int) j23;
            long j24 = (j20 * j4) + (iArr3[r8] & 4294967295L) + (j23 >>> i7);
            iArr3[i3 + 3] = (int) j24;
            long j25 = (j20 * j5) + (iArr3[r8] & 4294967295L) + (j24 >>> i7);
            iArr3[i3 + 4] = (int) j25;
            long j26 = (j20 * j19) + (iArr3[r8] & 4294967295L) + (j25 >>> i7);
            iArr3[i3 + 5] = (int) j26;
            long j27 = (j20 * j21) + (iArr3[r8] & 4294967295L) + (j26 >>> i7);
            iArr3[i3 + 6] = (int) j27;
            long j28 = (j20 * j8) + (iArr3[r8] & 4294967295L) + (j27 >>> i7);
            iArr3[i3 + 7] = (int) j28;
            long j29 = (j20 * j9) + (iArr3[r8] & 4294967295L) + (j28 >>> i7);
            iArr3[i3 + 8] = (int) j29;
            iArr3[i3 + 9] = (int) (j29 >>> i7);
            i4 = i6 + 1;
            i3 = i5;
            i2 = i7;
            j6 = j19;
            j4 = j4;
            j7 = j21;
        }
        int i8 = i2;
        int iK = o0g.k(iArr3, iArr3);
        int i9 = 0;
        int iJ = o0g.j(24, 16, o0g.j(0, 8, 0, iArr3, iArr3) + iK, iArr3, iArr3) + iK;
        int[] iArr4 = new int[8];
        int[] iArr5 = new int[8];
        boolean z = o0g.D(iArr, iArr, iArr4) != o0g.D(iArr2, iArr2, iArr5);
        int[] iArr6 = new int[16];
        o0g.p0(iArr4, iArr5, iArr6);
        z5i.l(i8, iJ + (z ? z5i.j(16, 8, iArr6, iArr3) : z5i.z0(16, 8, iArr6, iArr3)), 24, iArr3);
        int i10 = iArr[16];
        int i11 = iArr2[16];
        long j30 = i10 & 4294967295L;
        long j31 = i11 & 4294967295L;
        long j32 = 0;
        while (true) {
            long j33 = j30;
            long j34 = ((iArr[i9] & 4294967295L) * j31) + (j33 * (iArr2[i9] & 4294967295L)) + (iArr3[r8] & 4294967295L) + j32;
            iArr3[16 + i9] = (int) j34;
            long j35 = j34 >>> 32;
            i9++;
            if (i9 >= 16) {
                iArr3[32] = (i10 * i11) + ((int) j35);
                return;
            } else {
                j32 = j35;
                j30 = j33;
            }
        }
    }

    public static void N(int[] iArr, int[] iArr2) {
        o0g.D0(iArr, iArr2);
        long j2 = 4294967295L;
        long j3 = iArr[8] & 4294967295L;
        char c2 = 16;
        int i2 = 7;
        int i3 = 16;
        int i4 = 0;
        while (true) {
            int i5 = i2 - 1;
            long j4 = iArr[i2 + 8] & j2;
            long j5 = j4 * j4;
            long j6 = j2;
            iArr2[i3 + 15] = (i4 << 31) | ((int) (j5 >>> 33));
            int i6 = i3 - 2;
            iArr2[i3 + 14] = (int) (j5 >>> 1);
            i4 = (int) j5;
            if (i5 <= 0) {
                long j7 = j3 * j3;
                iArr2[c2] = (int) j7;
                long j8 = iArr[9] & j6;
                long j9 = (j8 * j3) + (((i4 << 31) & j6) | (j7 >>> 33));
                int i7 = (int) j9;
                iArr2[17] = (i7 << 1) | (((int) (j7 >>> 32)) & 1);
                long j10 = (iArr2[18] & j6) + (j9 >>> 32);
                long j11 = iArr[10] & j6;
                long j12 = (j11 * j3) + j10;
                int i8 = (int) j12;
                iArr2[18] = (i8 << 1) | (i7 >>> 31);
                long jD = osp.d(j11, j8, j12 >>> 32, iArr2[19] & j6);
                long j13 = (iArr2[20] & j6) + (jD >>> 32);
                long j14 = iArr[11] & j6;
                long j15 = (iArr2[21] & j6) + (j13 >>> 32);
                long j16 = j13 & j6;
                long j17 = (iArr2[22] & j6) + (j15 >>> 32);
                long j18 = (j14 * j3) + (jD & j6);
                int i9 = (int) j18;
                iArr2[19] = (i9 << 1) | (i8 >>> 31);
                long jD2 = osp.d(j14, j8, j18 >>> 32, j16);
                long jD3 = osp.d(j14, j11, jD2 >>> 32, j15 & j6);
                long j19 = j17 + (jD3 >>> 32);
                long j20 = jD3 & j6;
                long j21 = iArr[12] & j6;
                long j22 = (iArr2[23] & j6) + (j19 >>> 32);
                long j23 = (iArr2[24] & j6) + (j22 >>> 32);
                long j24 = j22 & j6;
                long j25 = (j21 * j3) + (jD2 & j6);
                int i10 = (int) j25;
                iArr2[20] = (i10 << 1) | (i9 >>> 31);
                long jD4 = osp.d(j21, j8, j25 >>> 32, j20);
                long jD5 = osp.d(j21, j11, jD4 >>> 32, j19 & j6);
                long jD6 = osp.d(j21, j14, jD5 >>> 32, j24);
                long j26 = j23 + (jD6 >>> 32);
                long j27 = iArr[13] & j6;
                long j28 = (iArr2[25] & j6) + (j26 >>> 32);
                long j29 = j26 & j6;
                long j30 = (iArr2[26] & j6) + (j28 >>> 32);
                long j31 = j28 & j6;
                long j32 = (j27 * j3) + (jD4 & j6);
                int i11 = (int) j32;
                iArr2[21] = (i11 << 1) | (i10 >>> 31);
                long jD7 = osp.d(j27, j8, j32 >>> 32, jD5 & j6);
                long jD8 = osp.d(j27, j11, jD7 >>> 32, jD6 & j6);
                long jD9 = osp.d(j27, j14, jD8 >>> 32, j29);
                long j33 = jD8 & j6;
                long jD10 = osp.d(j27, j21, jD9 >>> 32, j31);
                long j34 = j30 + (jD10 >>> 32);
                long j35 = jD10 & j6;
                long j36 = iArr[14] & j6;
                long j37 = (iArr2[27] & j6) + (j34 >>> 32);
                long j38 = j34 & j6;
                long j39 = (iArr2[28] & j6) + (j37 >>> 32);
                long j40 = j37 & j6;
                long j41 = (j36 * j3) + (jD7 & j6);
                int i12 = (int) j41;
                iArr2[22] = (i12 << 1) | (i11 >>> 31);
                long jD11 = osp.d(j36, j8, j41 >>> 32, j33);
                long jD12 = osp.d(j36, j11, jD11 >>> 32, jD9 & j6);
                long jD13 = osp.d(j36, j14, jD12 >>> 32, j35);
                long j42 = jD12 & j6;
                long jD14 = osp.d(j36, j21, jD13 >>> 32, j38);
                long j43 = jD13 & j6;
                long jD15 = osp.d(j36, j27, jD14 >>> 32, j40);
                long j44 = j39 + (jD15 >>> 32);
                long j45 = iArr[15] & j6;
                long j46 = (iArr2[29] & j6) + (j44 >>> 32);
                long j47 = (j3 * j45) + (jD11 & j6);
                int i13 = (int) j47;
                iArr2[23] = (i13 << 1) | (i12 >>> 31);
                long jD16 = osp.d(j45, j8, j47 >>> 32, j42);
                long jD17 = osp.d(j45, j11, jD16 >>> 32, j43);
                long jD18 = osp.d(j45, j14, jD17 >>> 32, jD14 & j6);
                long jD19 = osp.d(j45, j21, jD18 >>> 32, jD15 & j6);
                long jD20 = osp.d(j45, j27, jD19 >>> 32, j44 & j6);
                long jD21 = osp.d(j45, j36, jD20 >>> 32, j46 & j6);
                long j48 = (iArr2[30] & j6) + (j46 >>> 32) + (jD21 >>> 32);
                int i14 = (int) jD16;
                iArr2[24] = (i14 << 1) | (i13 >>> 31);
                int i15 = (int) jD17;
                iArr2[25] = (i15 << 1) | (i14 >>> 31);
                int i16 = (int) jD18;
                iArr2[26] = (i16 << 1) | (i15 >>> 31);
                int i17 = (int) jD19;
                iArr2[27] = (i17 << 1) | (i16 >>> 31);
                int i18 = (int) jD20;
                iArr2[28] = (i18 << 1) | (i17 >>> 31);
                int i19 = (int) jD21;
                iArr2[29] = (i19 << 1) | (i18 >>> 31);
                int i20 = (int) j48;
                iArr2[30] = (i20 << 1) | (i19 >>> 31);
                iArr2[31] = ((iArr2[31] + ((int) (j48 >>> 32))) << 1) | (i20 >>> 31);
                int iK = o0g.k(iArr2, iArr2);
                int iJ = o0g.j(24, 16, o0g.j(0, 8, 0, iArr2, iArr2) + iK, iArr2, iArr2) + iK;
                int[] iArr3 = new int[8];
                o0g.D(iArr, iArr, iArr3);
                int[] iArr4 = new int[16];
                o0g.D0(iArr3, iArr4);
                z5i.l(32, z5i.z0(16, 8, iArr4, iArr2) + iJ, 24, iArr2);
                int i21 = iArr[16];
                iArr2[32] = (i21 * i21) + z5i.d0(16, i21 << 1, 16, iArr, iArr2);
                return;
            }
            i3 = i6;
            i2 = i5;
            c2 = c2;
            j2 = j6;
        }
    }

    public static float O(float f2, float f3, float f4) {
        return v0g.g(f3, f2, f4, f2);
    }

    public static void P(ViewGroup viewGroup) {
        for (int i2 = 0; i2 < viewGroup.getChildCount(); i2++) {
            k2c childAt = viewGroup.getChildAt(i2);
            if (childAt instanceof k2c) {
                l2c l2cVarB = childAt.b();
                if (l2cVarB.h) {
                    l2cVarB.h = false;
                    l2cVarB.c();
                }
            } else if (childAt instanceof ViewGroup) {
                P((ViewGroup) childAt);
            }
        }
    }

    public static final boolean Q(Context context) {
        Activity activityD = D(context);
        return activityD == null || activityD.isFinishing() || activityD.isDestroyed();
    }

    public static boolean R() {
        return (c.m(Build.MANUFACTURER, "Blu", true) || c.m(Build.BRAND, "Blu", true)) && "studio x10".equalsIgnoreCase(Build.MODEL);
    }

    public static boolean S() {
        return (c.m(Build.MANUFACTURER, "Itel", true) || c.m(Build.BRAND, "Itel", true)) && "itel w6004".equalsIgnoreCase(Build.MODEL);
    }

    public static boolean T(w06 w06Var) {
        return w06Var == w06.f;
    }

    public static boolean U() {
        return (c.m(Build.MANUFACTURER, "Motorola", true) || c.m(Build.BRAND, "Motorola", true)) && "moto e13".equalsIgnoreCase(Build.MODEL);
    }

    public static boolean V() {
        return (c.m(Build.MANUFACTURER, "Positivo", true) || c.m(Build.BRAND, "Positivo", true)) && "twist 2 pro".equalsIgnoreCase(Build.MODEL);
    }

    public static boolean W(View view) {
        return L(view) == 1;
    }

    public static boolean X() {
        return (c.m(Build.MANUFACTURER, "Samsung", true) || c.m(Build.BRAND, "Samsung", true)) && c.q(Build.MODEL, "SM-A536", false);
    }

    public static boolean Y() {
        if (!c.m(Build.MANUFACTURER, "Samsung", true) && !c.m(Build.BRAND, "Samsung", true)) {
            return false;
        }
        String str = Build.DEVICE;
        return "gta8".equalsIgnoreCase(str) || "gta8wifi".equalsIgnoreCase(str);
    }

    public static boolean Z(w06 w06Var) {
        return w06Var == w06.q || w06Var == w06.p || w06Var == w06.o;
    }

    public static xe1 a(int i2, float f2, float f3) {
        if ((i2 & 2) != 0) {
            f3 = 0.0f;
        }
        return new xe1(a26.e, Float.valueOf(f2), new ef1(f3), Long.MIN_VALUE, Long.MIN_VALUE, false);
    }

    public static boolean a0() {
        return (c.m(Build.MANUFACTURER, "Vivo", true) || c.m(Build.BRAND, "Vivo", true)) && "vivo 1805".equalsIgnoreCase(Build.MODEL);
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x015b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final long b(float r21, float r22, float r23, float r24, defpackage.va5 r25) {
        /*
            Method dump skipped, instructions count: 457
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cs5.b(float, float, float, float, va5):long");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object b0(java.util.Collection r4, mt5 r5) {
        /*
            boolean r0 = r5 instanceof defpackage.ew2
            if (r0 == 0) goto L13
            r0 = r5
            ew2 r0 = (defpackage.ew2) r0
            int r1 = r0.v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.v = r1
            goto L18
        L13:
            ew2 r0 = new ew2
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.u
            px5 r1 = px5.a
            int r2 = r0.v
            r3 = 1
            if (r2 == 0) goto L30
            if (r2 != r3) goto L29
            java.util.Iterator r4 = r0.t
            defpackage.ybh.y(r5)
            goto L39
        L29:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            qp2.n(r4)
            r4 = 0
            return r4
        L30:
            defpackage.ybh.y(r5)
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            java.util.Iterator r4 = r4.iterator()
        L39:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L50
            java.lang.Object r5 = r4.next()
            unb r5 = (unb) r5
            r0.t = r4
            r0.v = r3
            java.lang.Object r5 = r5.Z(r0)
            if (r5 != r1) goto L39
            return r1
        L50:
            kotlin.Unit r4 = kotlin.Unit.a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cs5.b0(java.util.Collection, mt5):java.lang.Object");
    }

    public static final long c(int i2) {
        long j2 = i2;
        igm igmVar = jgm.b;
        long j3 = j2 << 32;
        int i3 = u95.h;
        return j3;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x004f -> B:19:0x0052). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object c0(unb[] r6, nt5 r7) {
        /*
            boolean r0 = r7 instanceof defpackage.dw2
            if (r0 == 0) goto L13
            r0 = r7
            dw2 r0 = (defpackage.dw2) r0
            int r1 = r0.x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.x = r1
            goto L18
        L13:
            dw2 r0 = new dw2
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.w
            px5 r1 = px5.a
            int r2 = r0.x
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L30
            int r6 = r0.v
            int r2 = r0.u
            java.lang.Object[] r4 = r0.t
            unb[] r4 = (unb[]) r4
            defpackage.ybh.y(r7)
            r7 = r4
            goto L52
        L30:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            qp2.n(r6)
            r6 = 0
            return r6
        L37:
            defpackage.ybh.y(r7)
            int r7 = r6.length
            r2 = 0
            r5 = r7
            r7 = r6
            r6 = r5
        L3f:
            if (r2 >= r6) goto L54
            r4 = r7[r2]
            r0.t = r7
            r0.u = r2
            r0.v = r6
            r0.x = r3
            java.lang.Object r4 = r4.Z(r0)
            if (r4 != r1) goto L52
            return r1
        L52:
            int r2 = r2 + r3
            goto L3f
        L54:
            kotlin.Unit r6 = kotlin.Unit.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cs5.c0(unb[], nt5):java.lang.Object");
    }

    public static final long d(long j2) {
        long j3 = j2 << 32;
        igm igmVar = jgm.b;
        int i2 = u95.h;
        return j3;
    }

    public static o94 d0(CoroutineContext coroutineContext, Function2 function2) {
        rx5 rx5Var = rx5.a;
        return k1g.z(new z0c(coroutineContext, function2));
    }

    public static long e(int i2, int i3, int i4) {
        return c((-16777216) | ((i2 & 255) << 16) | ((i3 & 255) << 8) | (i4 & 255));
    }

    public static final long e0(long j2, long j3, float f2) {
        naf nafVar = xa5.x;
        long jA = u95.a(j2, nafVar);
        long jA2 = u95.a(j3, nafVar);
        float fC = u95.c(jA);
        float fG = u95.g(jA);
        float f3 = u95.f(jA);
        float fD = u95.d(jA);
        float fC2 = u95.c(jA2);
        float fG2 = u95.g(jA2);
        float f4 = u95.f(jA2);
        float fD2 = u95.d(jA2);
        if (f2 < 0.0f) {
            f2 = 0.0f;
        }
        if (f2 > 1.0f) {
            f2 = 1.0f;
        }
        return u95.a(k(yi4.G(fG, fG2, f2), yi4.G(f3, f4, f2), yi4.G(fD, fD2, f2), yi4.G(fC, fC2, f2), nafVar), u95.e(j3));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0429  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x0432  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x0455  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x046e  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x0479  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x048b  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x049b  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x04aa  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x04bc  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x04cd  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x0565  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x0593  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x0595  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x059d  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x059f  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x05af  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x05b2  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x05cd  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x05d7  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x05f8 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:266:0x0611  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x0652  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x067e  */
    /* JADX WARN: Removed duplicated region for block: B:280:0x0686  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x068f A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:285:0x06a1  */
    /* JADX WARN: Removed duplicated region for block: B:288:0x06f0  */
    /* JADX WARN: Removed duplicated region for block: B:291:0x0731  */
    /* JADX WARN: Removed duplicated region for block: B:292:0x0733  */
    /* JADX WARN: Removed duplicated region for block: B:295:0x0746  */
    /* JADX WARN: Removed duplicated region for block: B:296:0x0748  */
    /* JADX WARN: Removed duplicated region for block: B:301:0x075a  */
    /* JADX WARN: Removed duplicated region for block: B:312:0x07bd  */
    /* JADX WARN: Removed duplicated region for block: B:314:0x07c0  */
    /* JADX WARN: Removed duplicated region for block: B:315:0x07d6  */
    /* JADX WARN: Removed duplicated region for block: B:319:0x07e4  */
    /* JADX WARN: Removed duplicated region for block: B:322:0x07fe  */
    /* JADX WARN: Removed duplicated region for block: B:323:0x0800  */
    /* JADX WARN: Removed duplicated region for block: B:334:0x081a A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:336:0x081e  */
    /* JADX WARN: Removed duplicated region for block: B:339:0x083a  */
    /* JADX WARN: Removed duplicated region for block: B:340:0x083c  */
    /* JADX WARN: Removed duplicated region for block: B:345:0x085f  */
    /* JADX WARN: Removed duplicated region for block: B:350:0x087f  */
    /* JADX WARN: Removed duplicated region for block: B:353:0x08b1  */
    /* JADX WARN: Removed duplicated region for block: B:357:0x08c7  */
    /* JADX WARN: Removed duplicated region for block: B:367:0x095c  */
    /* JADX WARN: Removed duplicated region for block: B:369:0x0960  */
    /* JADX WARN: Removed duplicated region for block: B:371:0x0970  */
    /* JADX WARN: Type inference failed for: r1v2, types: [ih5, vt9] */
    /* JADX WARN: Type inference failed for: r3v45, types: [c8e] */
    /* JADX WARN: Type inference failed for: r3v50, types: [c8e] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void f(final defpackage.mil r58, kotlin.jvm.functions.Function1 r59, defpackage.c8e r60, final defpackage.ikl r61, final uac r62, final kotlin.jvm.functions.Function1 r63, defpackage.lde r64, defpackage.nvj r65, final boolean r66, final int r67, final int r68, defpackage.k0b r69, defpackage.ovb r70, final boolean r71, final boolean r72, final defpackage.ue5 r73, defpackage.ih5 r74, int r75, int r76) {
        /*
            Method dump skipped, instructions count: 2545
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cs5.f(mil, kotlin.jvm.functions.Function1, c8e, ikl, uac, kotlin.jvm.functions.Function1, lde, nvj, boolean, int, int, k0b, ovb, boolean, boolean, ue5, ih5, int, int):void");
    }

    public static final float f0(long j2) {
        va5 va5VarE = u95.e(j2);
        if (!a26.E(va5VarE.b, 12884901888L)) {
            z7b.a("The specified color must be encoded in an RGB color space. The supplied color space is ".concat(a26.p0(va5VarE.b)));
        }
        a5i a5iVar = ((e5i) va5VarE).p;
        double d2 = a5iVar.d(u95.g(j2));
        float fD = (float) ((a5iVar.d(u95.d(j2)) * 0.0722d) + (a5iVar.d(u95.f(j2)) * 0.7152d) + (d2 * 0.2126d));
        if (fD < 0.0f) {
            fD = 0.0f;
        }
        if (fD > 1.0f) {
            return 1.0f;
        }
        return fD;
    }

    public static final void g(c8e c8eVar, dil dilVar, ue5 ue5Var, ih5 ih5Var, int i2) {
        vt9 vt9Var = (vt9) ih5Var;
        vt9Var.Y(2036174316);
        int i3 = (vt9Var.f(c8eVar) ? 4 : 2) | i2 | (vt9Var.h(dilVar) ? 32 : 16);
        if (vt9Var.N(i3 & 1, (i3 & 147) != 146)) {
            tfd tfdVarC = nr3.c(rbe.b, true);
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
            y4h.o(vt9Var, tfdVarC, ujp.f);
            y4h.o(vt9Var, oagVarL, ujp.e);
            y4h.o(vt9Var, Integer.valueOf(iHashCode), ujp.g);
            y4h.m(vt9Var);
            y4h.o(vt9Var, c8eVarP, ujp.d);
            ic4.a(dilVar, ue5Var, vt9Var, (i3 >> 3) & 126);
            vt9Var.p(true);
        } else {
            vt9Var.Q();
        }
        znh znhVarR = vt9Var.r();
        if (znhVarR != null) {
            znhVarR.d = new g9(c8eVar, dilVar, ue5Var, i2, (byte) 12);
        }
    }

    public static final int g0(n6c n6cVar, boolean z) {
        int i2;
        int i3;
        if (z) {
            i2 = n6cVar.o;
            i3 = n6cVar.q;
        } else {
            i2 = n6cVar.n;
            i3 = n6cVar.p;
        }
        return i2 + i3;
    }

    public static final void h(Function0 function0, Function0 function02, ih5 ih5Var, int i2) {
        Function0 function03;
        vt9 vt9Var = (vt9) ih5Var;
        vt9Var.Y(833765914);
        int i3 = (vt9Var.h(function0) ? 4 : 2) | i2 | (vt9Var.h(function02) ? 32 : 16);
        if (vt9Var.N(i3 & 1, (i3 & 19) != 18)) {
            function03 = function0;
            yi4.g(function03, (c8e) null, false, false, 0L, (u8i) null, gyg.P(-32098268, new seg(function02, function0), vt9Var), vt9Var, (i3 & 14) | 1572864, 62);
        } else {
            function03 = function0;
            vt9Var.Q();
        }
        znh znhVarR = vt9Var.r();
        if (znhVarR != null) {
            znhVarR.d = new seg(function03, function02, i2);
        }
    }

    public static void h0() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 < 30 || i2 >= 34) {
            return;
        }
        try {
            Class.forName("android.webkit.WebViewUpdateService").getDeclaredMethod("getCurrentWebViewPackageName", null).invoke(null, null);
        } catch (Exception unused) {
        }
    }

    public static final void i(dil dilVar, boolean z, ih5 ih5Var, int i2) {
        ojl ojlVarD;
        vt9 vt9Var = (vt9) ih5Var;
        vt9Var.Y(626339208);
        int i3 = (vt9Var.h(dilVar) ? 4 : 2) | i2 | (vt9Var.g(z) ? 32 : 16);
        if (!vt9Var.N(i3 & 1, (i3 & 19) != 18)) {
            vt9Var.Q();
        } else if (z) {
            vt9Var.W(1530097388);
            gbc gbcVar = dilVar.d;
            njl njlVar = null;
            if (gbcVar != null && (ojlVarD = gbcVar.d()) != null) {
                njl njlVar2 = ojlVarD.a;
                gbc gbcVar2 = dilVar.d;
                if (!(gbcVar2 != null ? gbcVar2.p : true)) {
                    njlVar = njlVar2;
                }
            }
            if (njlVar == null) {
                vt9Var.W(1530097387);
                vt9Var.p(false);
            } else {
                vt9Var.W(1530097388);
                if (xjl.c(dilVar.l().b)) {
                    vt9Var.W(2110860558);
                    vt9Var.p(false);
                } else {
                    vt9Var.W(2109807302);
                    int i4 = dilVar.b.i((int) (dilVar.l().b >> 32));
                    int i5 = dilVar.b.i((int) (dilVar.l().b & 4294967295L));
                    hyh hyhVarA = njlVar.a(i4);
                    hyh hyhVarA2 = njlVar.a(Math.max(i5 - 1, 0));
                    gbc gbcVar3 = dilVar.d;
                    if (gbcVar3 == null || !((Boolean) gbcVar3.m.getValue()).booleanValue()) {
                        vt9Var.W(2110490542);
                        vt9Var.p(false);
                    } else {
                        vt9Var.W(2110225306);
                        dbh.a(true, hyhVarA, dilVar, vt9Var, ((i3 << 6) & 896) | 6);
                        vt9Var.p(false);
                    }
                    gbc gbcVar4 = dilVar.d;
                    if (gbcVar4 == null || !((Boolean) gbcVar4.n.getValue()).booleanValue()) {
                        vt9Var.W(2110838734);
                        vt9Var.p(false);
                    } else {
                        vt9Var.W(2110574459);
                        dbh.a(false, hyhVarA2, dilVar, vt9Var, ((i3 << 6) & 896) | 6);
                        vt9Var.p(false);
                    }
                    vt9Var.p(false);
                }
                gbc gbcVar5 = dilVar.d;
                if (gbcVar5 != null) {
                    t0g t0gVar = gbcVar5.l;
                    if (!Intrinsics.a(dilVar.t.a.b, dilVar.l().a.b)) {
                        t0gVar.setValue(Boolean.FALSE);
                    }
                    if (gbcVar5.b()) {
                        if (((Boolean) t0gVar.getValue()).booleanValue()) {
                            dilVar.s();
                        } else {
                            dilVar.m();
                        }
                    }
                }
                vt9Var.p(false);
            }
            vt9Var.p(false);
        } else {
            vt9Var.W(1989076778);
            vt9Var.p(false);
            dilVar.m();
        }
        znh znhVarR = vt9Var.r();
        if (znhVarR != null) {
            znhVarR.d = new sn3((byte) 1, i2, dilVar, z);
        }
    }

    public static void i0(int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4) {
        M(iArr, iArr2, iArr4);
        o0(iArr4, iArr3);
    }

    public static final void j(dil dilVar, ih5 ih5Var, int i2) {
        sf1 sf1VarK;
        vt9 vt9Var = (vt9) ih5Var;
        vt9Var.Y(-1436003720);
        int i3 = (vt9Var.h(dilVar) ? 4 : 2) | i2;
        if (vt9Var.N(i3 & 1, (i3 & 3) != 2)) {
            gbc gbcVar = dilVar.d;
            if (gbcVar == null || !((Boolean) gbcVar.o.getValue()).booleanValue() || (sf1VarK = dilVar.k()) == null || sf1VarK.b.length() <= 0) {
                vt9Var.W(-2111042550);
                vt9Var.p(false);
            } else {
                vt9Var.W(-2112351432);
                boolean zF = vt9Var.f(dilVar);
                Object objK = vt9Var.K();
                zpa zpaVar = hh5.a;
                if (zF || objK == zpaVar) {
                    objK = new yhl(dilVar);
                    vt9Var.g0(objK);
                }
                mgl mglVar = (mgl) objK;
                n27 n27Var = (n27) vt9Var.j(mi5.h);
                i9f i9fVar = dilVar.b;
                long j2 = dilVar.l().b;
                int i4 = xjl.c;
                int i5 = i9fVar.i((int) (j2 >> 32));
                gbc gbcVar2 = dilVar.d;
                njl njlVar = (gbcVar2 != null ? gbcVar2.d() : null).a;
                voh vohVarC = njlVar.c(djh.c(i5, 0, njlVar.a.a.b.length()));
                long jFloatToRawIntBits = (Float.floatToRawIntBits((n27Var.o0(2.0f) / 2.0f) + vohVarC.a) << 32) | (Float.floatToRawIntBits(vohVarC.d) & 4294967295L);
                boolean zE = vt9Var.e(jFloatToRawIntBits);
                Object objK2 = vt9Var.K();
                if (zE || objK2 == zpaVar) {
                    objK2 = new sw5(jFloatToRawIntBits);
                    vt9Var.g0(objK2);
                }
                k9f k9fVar = (k9f) objK2;
                boolean zH = vt9Var.h(mglVar) | vt9Var.h(dilVar);
                Object objK3 = vt9Var.K();
                if (zH || objK3 == zpaVar) {
                    objK3 = new b45(mglVar, dilVar, (byte) 1);
                    vt9Var.g0(objK3);
                }
                c8e c8eVarA = ruk.a(z7e.b, mglVar, (PointerInputEventHandler) objK3);
                boolean zE2 = vt9Var.e(jFloatToRawIntBits);
                Object objK4 = vt9Var.K();
                if (zE2 || objK4 == zpaVar) {
                    objK4 = new x41(jFloatToRawIntBits, (byte) 2);
                    vt9Var.g0(objK4);
                }
                z41.a(k9fVar, h0j.a(c8eVarA, false, (Function1) objK4), 0L, vt9Var, 0);
                vt9Var.p(false);
            }
        } else {
            vt9Var.Q();
        }
        znh znhVarR = vt9Var.r();
        if (znhVarR != null) {
            znhVarR.d = new whf(dilVar, i2, (byte) 17);
        }
    }

    public static final void j0(gbc gbcVar, mil milVar, i9f i9fVar) {
        djl djlVar;
        b2c b2cVarC;
        ttj ttjVarT = bwg.t();
        Function1 function1E = ttjVarT != null ? ttjVarT.e() : null;
        ttj ttjVarX = bwg.x(ttjVarT);
        try {
            ojl ojlVarD = gbcVar.d();
            if (ojlVarD != null && (djlVar = gbcVar.e) != null && (b2cVarC = gbcVar.c()) != null) {
                b8h.k(milVar, gbcVar.a, ojlVarD.a, b2cVarC, djlVar, gbcVar.b(), i9fVar);
            }
        } finally {
            bwg.A(ttjVarT, ttjVarX, function1E);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00e6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final long k(float r17, float r18, float r19, float r20, defpackage.va5 r21) {
        /*
            Method dump skipped, instructions count: 334
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cs5.k(float, float, float, float, va5):long");
    }

    public static final void k0(Context context, String str) {
        try {
            StringsKt.N(str);
            String string = StringsKt.l0(str).toString();
            if (!StringsKt.E(string, "://", false)) {
                string = "https://" + string;
            }
            context.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(string)).putExtra("com.android.browser.application_id", context.getPackageName()));
        } catch (Throwable th) {
            dqg.a.a("Error when opening URL<" + str + ">", th);
        }
    }

    public static void l(int[] iArr, int[] iArr2, int[] iArr3) {
        int iG = z5i.g(16, iArr, iArr2, iArr3) + iArr[16] + iArr2[16];
        if (iG > 511 || (iG == 511 && z5i.A(iArr3, j, 16))) {
            iG = (z5i.R(iArr3) + iG) & 511;
        }
        iArr3[16] = iG;
    }

    /* JADX WARN: Code restructure failed: missing block: B:73:0x00fd, code lost:
    
        r25 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0103, code lost:
    
        if (r5 == r26.length()) goto L191;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0107, code lost:
    
        if (r2 == '+') goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x010b, code lost:
    
        if (r2 == '-') goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x010d, code lost:
    
        r2 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x010f, code lost:
    
        r2 = r18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0113, code lost:
    
        if (r5 == (r23 + r2)) goto L192;
     */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0186 A[LOOP:7: B:104:0x0184->B:105:0x0186, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x028a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0200 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:208:0x00fb A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x014d A[LOOP:5: B:94:0x014b->B:95:0x014d, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0163  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static long l0(java.lang.String r26) {
        /*
            Method dump skipped, instructions count: 738
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cs5.l0(java.lang.String):long");
    }

    public static final long m(long j2, long j3) {
        if (j2 != 4611686018427387903L && j2 != -4611686018427387903L) {
            return (j3 == 4611686018427387903L || j3 == -4611686018427387903L) ? j3 : djh.d(j2 + j3, -4611686018427387903L, 4611686018427387903L);
        }
        if ((-4611686018427387903L >= j3 || j3 >= 4611686018427387903L) && (j3 ^ j2) < 0) {
            return 9223372036854759646L;
        }
        return j2;
    }

    public static final NumberFormatException m0(String str, ParseException parseException) {
        String str2;
        if (parseException != null) {
            str2 = ". Cause=" + parseException;
        } else {
            str2 = null;
        }
        if (str2 == null) {
            str2 = "";
        }
        return new NumberFormatException(p3p.w("Couldn't parse number '", str, "'", str2));
    }

    public static final Object n(Collection collection, nt5 nt5Var) {
        if (collection.isEmpty()) {
            return l08.a;
        }
        unb[] unbVarArr = (h07[]) collection.toArray(new h07[0]);
        aw2 aw2Var = new aw2(unbVarArr);
        nh4 nh4Var = new nh4(1, hib.b(nt5Var));
        nh4Var.s();
        int length = unbVarArr.length;
        yv2[] yv2VarArr = new yv2[length];
        for (int i2 = 0; i2 < length; i2++) {
            unb unbVar = unbVarArr[i2];
            unbVar.start();
            yv2 yv2Var = new yv2(aw2Var, nh4Var);
            yv2Var.f = o0g.b0(unbVar, true, yv2Var);
            yv2VarArr[i2] = yv2Var;
        }
        zv2 zv2Var = new zv2(yv2VarArr);
        for (int i3 = 0; i3 < length; i3++) {
            yv2VarArr[i3].r(zv2Var);
        }
        if (nh4Var.w()) {
            zv2Var.a();
        } else {
            nh4Var.v(zv2Var);
        }
        Object objQ = nh4Var.q();
        px5 px5Var = px5.a;
        return objQ;
    }

    public static String n0(X509Certificate x509Certificate) {
        if (x509Certificate != null) {
            return "sha256/".concat(r0(x509Certificate).d());
        }
        qp2.o("Certificate pinning requires X509 certificates");
        return null;
    }

    public static final String o(byte[] bArr, ArrayList arrayList, int i2) {
        int i3;
        boolean z;
        byte b2;
        int i4;
        int length = bArr.length;
        int i5 = 0;
        while (i5 < length) {
            int i6 = (i5 + length) / 2;
            while (i6 > -1 && bArr[i6] != 10) {
                i6--;
            }
            int i7 = i6 + 1;
            int i8 = 1;
            while (true) {
                i3 = i7 + i8;
                if (bArr[i3] == 10) {
                    break;
                }
                i8++;
            }
            int i9 = i3 - i7;
            int i10 = i2;
            boolean z2 = false;
            int i11 = 0;
            int i12 = 0;
            while (true) {
                if (z2) {
                    b2 = 46;
                    z = false;
                } else {
                    z = z2;
                    b2 = ((byte[]) arrayList.get(i10))[i11];
                }
                byte b3 = bArr[i7 + i12];
                ebm ebmVar = fbm.b;
                cgm cgmVar = dgm.b;
                i4 = (b2 & 255) - (b3 & 255);
                if (i4 != 0) {
                    break;
                }
                i12++;
                i11++;
                if (i12 == i9) {
                    break;
                }
                if (((byte[]) arrayList.get(i10)).length != i11) {
                    z2 = z;
                } else {
                    if (i10 == arrayList.size() - 1) {
                        break;
                    }
                    i10++;
                    i11 = -1;
                    z2 = true;
                }
            }
            if (i4 >= 0) {
                if (i4 <= 0) {
                    int i13 = i9 - i12;
                    int length2 = ((byte[]) arrayList.get(i10)).length - i11;
                    int size = arrayList.size();
                    for (int i14 = i10 + 1; i14 < size; i14++) {
                        length2 += ((byte[]) arrayList.get(i14)).length;
                    }
                    if (length2 >= i13) {
                        if (length2 <= i13) {
                            return new String(bArr, i7, i9, Charsets.UTF_8);
                        }
                    }
                }
                i5 = i3 + 1;
            }
            length = i6;
        }
        return null;
    }

    public static void o0(int[] iArr, int[] iArr2) {
        int i2 = iArr[32];
        int i3 = i2;
        int i4 = 16;
        while (true) {
            int i5 = i4 - 1;
            if (i5 < 0) {
                break;
            }
            int i6 = iArr[i4 + 15];
            iArr2[i5] = (i6 >>> 9) | (i3 << (-9));
            i3 = i6;
            i4 = i5;
        }
        int iK = z5i.k(iArr, iArr2, 16) + ((i3 << (-9)) >>> 23) + (i2 >>> 9);
        if (iK > 511 || (iK == 511 && z5i.A(iArr2, j, 16))) {
            iK = (z5i.R(iArr2) + iK) & 511;
        }
        iArr2[16] = iK;
    }

    public static int p(long j2, long j3) {
        if (j2 < j3) {
            return -1;
        }
        return j2 == j3 ? 0 : 1;
    }

    public static void p0(int[] iArr) {
        int i2 = iArr[16];
        int iM = z5i.m(16, i2 >>> 9, iArr) + (i2 & 511);
        if (iM > 511 || (iM == 511 && z5i.A(iArr, j, 16))) {
            iM = (z5i.R(iArr) + iM) & 511;
        }
        iArr[16] = iM;
    }

    public static final long q(long j2, long j3) {
        float f2;
        float f3;
        long jA = u95.a(j2, u95.e(j3));
        float fC = u95.c(j3);
        float fC2 = u95.c(jA);
        float f4 = 1.0f - fC2;
        float f5 = (fC * f4) + fC2;
        float fG = u95.g(jA);
        float fG2 = u95.g(j3);
        float f6 = 0.0f;
        if (f5 == 0.0f) {
            f2 = 0.0f;
        } else {
            f2 = (((fG2 * fC) * f4) + (fG * fC2)) / f5;
        }
        float f7 = u95.f(jA);
        float f8 = u95.f(j3);
        if (f5 == 0.0f) {
            f3 = 0.0f;
        } else {
            f3 = (((f8 * fC) * f4) + (f7 * fC2)) / f5;
        }
        float fD = u95.d(jA);
        float fD2 = u95.d(j3);
        if (f5 != 0.0f) {
            f6 = (((fD2 * fC) * f4) + (fD * fC2)) / f5;
        }
        return k(f2, f3, f6, f5, u95.e(j3));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0081  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void q0(cie r6, int r7) {
        /*
            Method dump skipped, instructions count: 272
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cs5.q0(cie, int):void");
    }

    public static String r(String str) {
        SigningInfo signingInfo;
        Signature[] signingCertificateHistory;
        PackageInfo packageInfoK = K(str, 134217728);
        if (packageInfoK == null || (signingInfo = packageInfoK.signingInfo) == null || (signingCertificateHistory = signingInfo.getSigningCertificateHistory()) == null || signingCertificateHistory.length == 0) {
            return null;
        }
        try {
            byte[] bArrDigest = MessageDigest.getInstance("SHA-256").digest(signingCertificateHistory[signingCertificateHistory.length - 1].toByteArray());
            StringBuilder sb = new StringBuilder((bArrDigest.length * 3) - 1);
            for (int i2 = 0; i2 < bArrDigest.length; i2++) {
                char[] cArr = i;
                sb.append(cArr[(bArrDigest[i2] & 240) >>> 4]);
                sb.append(cArr[bArrDigest[i2] & 15]);
                if (i2 < bArrDigest.length - 1) {
                    sb.append(':');
                }
            }
            return sb.toString();
        } catch (NoSuchAlgorithmException unused) {
            return null;
        }
    }

    public static g54 r0(X509Certificate x509Certificate) throws NoSuchAlgorithmException {
        byte[] encoded = x509Certificate.getPublicKey().getEncoded();
        int length = encoded.length;
        qyn.m(encoded.length, 0L, length);
        y72.a(length, encoded.length);
        byte[] bArrCopyOfRange = Arrays.copyOfRange(encoded, 0, length);
        MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
        messageDigest.update(bArrCopyOfRange, 0, bArrCopyOfRange.length);
        return new g54(messageDigest.digest());
    }

    public static float s(float f2, float f3, float f4) {
        return Math.max(Math.min(f2, f4), f3);
    }

    public static final void s0(ajl ajlVar, gbc gbcVar, mil milVar, k0b k0bVar, i9f i9fVar) {
        c37 c37Var = gbcVar.d;
        lw5 lw5Var = gbcVar.v;
        lw5 lw5Var2 = gbcVar.w;
        pqh pqhVar = new pqh();
        tmi tmiVar = new tmi(c37Var, lw5Var, pqhVar, (byte) 13);
        chg chgVar = ajlVar.a;
        chgVar.a(milVar, k0bVar, tmiVar, lw5Var2);
        djl djlVar = new djl(ajlVar, chgVar);
        ajlVar.b.set(djlVar);
        pqhVar.a = djlVar;
        gbcVar.e = djlVar;
        j0(gbcVar, milVar, i9fVar);
    }

    public static int t(int i2, int i3, int i4) {
        return Math.max(Math.min(i2, i4), i3);
    }

    public static void t0(int[] iArr, int[] iArr2, int[] iArr3) {
        int iX0 = (z5i.x0(16, iArr, iArr2, iArr3) + iArr[16]) - iArr2[16];
        if (iX0 < 0) {
            int i2 = 0;
            int i3 = 0;
            while (true) {
                if (i3 >= 16) {
                    i2 = -1;
                    break;
                }
                int i4 = iArr3[i3] - 1;
                iArr3[i3] = i4;
                if (i4 != -1) {
                    break;
                } else {
                    i3++;
                }
            }
            iX0 = (iX0 + i2) & 511;
        }
        iArr3[16] = iX0;
    }

    public static xe1 u(xe1 xe1Var, float f2, float f3, int i2) {
        if ((i2 & 1) != 0) {
            f2 = ((Number) xe1Var.b.getValue()).floatValue();
        }
        if ((i2 & 2) != 0) {
            f3 = ((ef1) xe1Var.c).a;
        }
        return new xe1(xe1Var.a, Float.valueOf(f2), new ef1(f3), xe1Var.d, xe1Var.e, xe1Var.f);
    }

    public static final int u0(long j2) {
        float[] fArr = xa5.a;
        long jA = u95.a(j2, xa5.e) >>> 32;
        igm igmVar = jgm.b;
        return (int) jA;
    }

    public static vh9 v(Context context) {
        ProviderInfo providerInfo;
        th9 th9Var;
        ApplicationInfo applicationInfo;
        PackageManager packageManager = context.getPackageManager();
        jpo.m(packageManager, "Package manager required to locate emoji font provider");
        Iterator<ResolveInfo> it = packageManager.queryIntentContentProviders(new Intent("androidx.content.action.LOAD_EMOJI_FONT"), 0).iterator();
        while (true) {
            if (!it.hasNext()) {
                providerInfo = null;
                break;
            }
            providerInfo = it.next().providerInfo;
            if (providerInfo != null && (applicationInfo = providerInfo.applicationInfo) != null && (applicationInfo.flags & 1) == 1) {
                break;
            }
        }
        if (providerInfo == null) {
            th9Var = null;
        } else {
            try {
                String str = providerInfo.authority;
                String str2 = providerInfo.packageName;
                Signature[] signatureArr = packageManager.getPackageInfo(str2, 64).signatures;
                ArrayList arrayList = new ArrayList();
                for (Signature signature : signatureArr) {
                    arrayList.add(signature.toByteArray());
                }
                th9Var = new th9(str, str2, "emojicompat-emoji-font", Collections.singletonList(arrayList), null, null);
            } catch (PackageManager.NameNotFoundException e2) {
                Log.wtf("emoji2.text.DefaultEmojiConfig", e2);
            }
        }
        if (th9Var != null) {
            return new vh9(context, th9Var);
        }
        return null;
    }

    public static BigDecimal v0(String str) {
        Locale locale = new xvc().a;
        DecimalFormat decimalFormat = (DecimalFormat) NumberFormat.getNumberInstance(locale).clone();
        decimalFormat.setParseBigDecimal(true);
        try {
            ParsePosition parsePosition = new ParsePosition(0);
            Number number = decimalFormat.parse(str, parsePosition);
            BigDecimal bigDecimal = number instanceof BigDecimal ? (BigDecimal) number : null;
            if (parsePosition.getIndex() != str.length()) {
                throw m0(str, null);
            }
            if (bigDecimal != null) {
                return bigDecimal;
            }
            throw m0(str, null);
        } catch (ParseException e2) {
            throw m0(str, e2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object w(fr6 r5, mt5 r6) {
        /*
            boolean r0 = r6 instanceof defpackage.nl8
            if (r0 == 0) goto L13
            r0 = r6
            nl8 r0 = (defpackage.nl8) r0
            int r1 = r0.u
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.u = r1
            goto L18
        L13:
            nl8 r0 = new nl8
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.t
            px5 r1 = px5.a
            int r2 = r0.u
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L32
            if (r2 != r3) goto L2c
            defpackage.ybh.y(r6)
            t0i r6 = (t0i) r6
            java.lang.Object r5 = r6.a
            goto L45
        L2c:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            qp2.n(r5)
            return r4
        L32:
            defpackage.ybh.y(r6)
            pv r6 = new pv
            r2 = 11
            r6.<init>(r2, r4, r5)
            r0.u = r3
            java.lang.Object r5 = defpackage.cgh.o(r6, r0)
            if (r5 != r1) goto L45
            return r1
        L45:
            p0i r6 = t0i.b
            boolean r6 = r5 instanceof q0i
            if (r6 == 0) goto L4c
            return r4
        L4c:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cs5.w(fr6, mt5):java.lang.Object");
    }

    public static final long w0(double d2, un7 un7Var) {
        double dA = wn7.a(d2, un7Var, un7.b);
        if (Double.isNaN(dA)) {
            qp2.o("Duration value cannot be NaN.");
            return 0L;
        }
        long jC = zed.c(dA);
        return (-4611686018426999999L > jC || jC >= 4611686018427000000L) ? z(zed.c(wn7.a(d2, un7Var, un7.d))) : A(jC);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00be  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void x(defpackage.mk7 r23, defpackage.q3a r24) {
        /*
            Method dump skipped, instructions count: 589
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cs5.x(mk7, q3a):void");
    }

    public static final long x0(int i2, un7 un7Var) {
        if (un7Var.compareTo(un7.e) > 0) {
            return y0(i2, un7Var);
        }
        long j2 = i2;
        un7 un7Var2 = un7.b;
        return A(TimeUnit.NANOSECONDS.convert(j2, un7Var.a));
    }

    public static final long y(long j2) {
        long j3 = (j2 << 1) + 1;
        pn7.b.getClass();
        int i2 = rn7.a;
        return j3;
    }

    public static final long y0(long j2, un7 un7Var) {
        un7 un7Var2 = un7.b;
        TimeUnit timeUnit = un7Var.a;
        TimeUnit timeUnit2 = TimeUnit.NANOSECONDS;
        long jConvert = timeUnit.convert(4611686018426999999L, timeUnit2);
        TimeUnit timeUnit3 = un7Var.a;
        if ((-jConvert) <= j2 && j2 <= jConvert) {
            return A(timeUnit2.convert(j2, timeUnit3));
        }
        if (un7Var.compareTo(un7.d) < 0) {
            return y(djh.d(TimeUnit.MILLISECONDS.convert(j2, timeUnit3), -4611686018427387903L, 4611686018427387903L));
        }
        long jSignum = Long.signum(j2);
        if (j2 < -9223372036854775807L) {
            j2 = -9223372036854775807L;
        }
        return y(xn7.b(Math.abs(j2), un7Var) * jSignum);
    }

    public static final long z(long j2) {
        return (-4611686018426L > j2 || j2 >= 4611686018427L) ? y(djh.d(j2, -4611686018427387903L, 4611686018427387903L)) : A(j2 * 1000000);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.io.Serializable z0(fr6 r5, nt5 r6) {
        /*
            boolean r0 = r6 instanceof defpackage.pl8
            if (r0 == 0) goto L13
            r0 = r6
            pl8 r0 = (defpackage.pl8) r0
            int r1 = r0.w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.w = r1
            goto L18
        L13:
            pl8 r0 = new pl8
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.v
            px5 r1 = px5.a
            int r2 = r0.w
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L32
            if (r2 != r4) goto L2c
            int r5 = r0.u
            java.lang.String r0 = r0.t
            defpackage.ybh.y(r6)
            goto L5c
        L2c:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            qp2.n(r5)
            return r3
        L32:
            defpackage.ybh.y(r6)
            zqa r6 = r5.e()
            boolean r6 = alo.X(r6)
            if (r6 != 0) goto L64
            zqa r6 = r5.e()
            int r6 = r6.a
            zqa r2 = r5.e()
            java.lang.String r2 = r2.b
            r0.t = r2
            r0.u = r6
            r0.w = r4
            java.lang.Object r5 = w(r5, r0)
            if (r5 != r1) goto L58
            return r1
        L58:
            r0 = r6
            r6 = r5
            r5 = r0
            r0 = r2
        L5c:
            ji1 r6 = (ji1) r6
            ooa r1 = new ooa
            r1.<init>(r5, r0, r6)
            return r1
        L64:
            java.lang.String r5 = "Failed requirement."
            qp2.o(r5)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cs5.z0(fr6, nt5):java.io.Serializable");
    }
}
