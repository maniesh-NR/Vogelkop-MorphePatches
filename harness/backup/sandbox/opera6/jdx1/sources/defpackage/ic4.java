package defpackage;

import android.app.Person;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcelable;
import android.text.TextPaint;
import android.util.Size;
import android.util.SizeF;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewParent;
import android.widget.ImageView;
import androidx.core.app.NotificationCompat;
import androidx.core.graphics.drawable.IconCompat;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import java.io.Serializable;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.h;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* loaded from: classes.dex */
public abstract class ic4 implements m94 {
    public static final c9 e;
    public static final eko k;
    public static final int[] a = {2002, 2000, 1920, 1601, 1600, 1001, 1000, 960, 800, 800, 480, 400, 400, 2048};
    public static final ue5 b = new ue5(636288403, new df5((byte) 0), false);
    public static final ue5 c = new ue5(-1357803046, new df5((byte) 1), false);
    public static final String[] d = {"standard", "accelerate", "decelerate", "linear"};
    public static final String[] f = {"downloads", "shake_and_win"};
    public static final int[] g = {1, 0, 0, -1, -1, -1, -1};
    public static final int[] h = {1, 0, 0, -2, -1, -1, 0, 2, 0, 0, -2, -1, -1, -1};
    public static final int[] i = {-1, -1, -1, 1, 0, 0, -1, -3, -1, -1, 1};
    public static final Object j = new Object();

    static {
        byte b2 = 20;
        e = new c9(b2);
        k = new eko(b2);
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x008e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.r7 A(defpackage.bq4 r9) {
        /*
            r0 = 16
            int r1 = r9.i(r0)
            int r0 = r9.i(r0)
            r2 = 65535(0xffff, float:9.1834E-41)
            r3 = 4
            if (r0 != r2) goto L18
            r0 = 24
            int r0 = r9.i(r0)
            r2 = 7
            goto L19
        L18:
            r2 = r3
        L19:
            int r0 = r0 + r2
            r2 = 44097(0xac41, float:6.1793E-41)
            if (r1 != r2) goto L21
            int r0 = r0 + 2
        L21:
            r1 = 2
            int r2 = r9.i(r1)
            r4 = 3
            if (r2 != r4) goto L32
        L29:
            r9.i(r1)
            boolean r2 = r9.h()
            if (r2 != 0) goto L29
        L32:
            r2 = 10
            int r2 = r9.i(r2)
            boolean r5 = r9.h()
            if (r5 == 0) goto L47
            int r5 = r9.i(r4)
            if (r5 <= 0) goto L47
            r9.t(r1)
        L47:
            boolean r5 = r9.h()
            r6 = 44100(0xac44, float:6.1797E-41)
            r7 = 48000(0xbb80, float:6.7262E-41)
            if (r5 == 0) goto L55
            r5 = r7
            goto L56
        L55:
            r5 = r6
        L56:
            int r9 = r9.i(r3)
            int[] r8 = defpackage.ic4.a
            if (r5 != r6) goto L65
            r6 = 13
            if (r9 != r6) goto L65
            r9 = r8[r9]
            goto L92
        L65:
            if (r5 != r7) goto L91
            r6 = 14
            if (r9 >= r6) goto L91
            r6 = r8[r9]
            int r2 = r2 % 5
            r7 = 8
            r8 = 1
            if (r2 == r8) goto L88
            r8 = 11
            if (r2 == r1) goto L83
            if (r2 == r4) goto L88
            if (r2 != r3) goto L8c
            if (r9 == r4) goto L8e
            if (r9 == r7) goto L8e
            if (r9 != r8) goto L8c
            goto L8e
        L83:
            if (r9 == r7) goto L8e
            if (r9 != r8) goto L8c
            goto L8e
        L88:
            if (r9 == r4) goto L8e
            if (r9 == r7) goto L8e
        L8c:
            r9 = r6
            goto L92
        L8e:
            int r9 = r6 + 1
            goto L92
        L91:
            r9 = 0
        L92:
            r7 r1 = new r7
            r1.<init>(r5, r0, r9)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ic4.A(bq4):r7");
    }

    public static final w8e B(l01 l01Var, String str) {
        w8e q0iVar;
        BigDecimal bigDecimalV0;
        h46 h46VarY;
        try {
            p0i p0iVar = t0i.b;
            try {
                bigDecimalV0 = cs5.v0(str);
            } catch (Exception unused) {
                bigDecimalV0 = null;
            }
        } catch (Throwable th) {
            p0i p0iVar2 = t0i.b;
            q0iVar = new q0i(th);
        }
        if (bigDecimalV0 == null || (h46VarY = yi4.Y(l01Var)) == null) {
            return null;
        }
        x8e.Companion.getClass();
        RoundingMode roundingMode = y8e.a;
        q0iVar = new w8e(bigDecimalV0.scaleByPowerOfTen(h46VarY.d()).setScale(0, y8e.a).toBigIntegerExact(), h46VarY);
        p0i p0iVar3 = t0i.b;
        return q0iVar instanceof q0i ? null : q0iVar;
    }

    public static fr C(String str) throws NumberFormatException {
        if (str.length() == 0) {
            return new fr(0, 0, (byte) 2);
        }
        int iK = StringsKt.K(str, '/', 0, 6);
        if (iK == -1) {
            return null;
        }
        String strSubstring = str.substring(0, iK);
        try {
            int i2 = Integer.parseInt(str.substring(iK + 1));
            int i3 = Integer.parseInt(strSubstring);
            if (i3 < 1 || i3 > 12 || i2 < 0) {
                return null;
            }
            return new fr(i2, i3, (byte) 2);
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    public static void D(bq4 bq4Var, q7 q7Var) throws s1g {
        int i2 = bq4Var.i(5);
        bq4Var.t(2);
        if (bq4Var.h()) {
            bq4Var.t(5);
        }
        if (i2 >= 7 && i2 <= 10) {
            bq4Var.s();
        }
        if (bq4Var.h()) {
            int i3 = bq4Var.i(3);
            if (q7Var.b == -1 && i2 >= 0 && i2 <= 15 && (i3 == 0 || i3 == 1)) {
                q7Var.b = i2;
            }
            if (bq4Var.h()) {
                L(bq4Var);
            }
        }
    }

    public static void E(bq4 bq4Var, q7 q7Var) throws s1g {
        bq4Var.t(2);
        boolean zH = bq4Var.h();
        int i2 = bq4Var.i(8);
        for (int i3 = 0; i3 < i2; i3++) {
            bq4Var.t(2);
            if (bq4Var.h()) {
                bq4Var.t(5);
            }
            if (zH) {
                bq4Var.t(24);
            } else {
                if (bq4Var.h()) {
                    if (!bq4Var.h()) {
                        bq4Var.t(4);
                    }
                    q7Var.c = bq4Var.i(6) + 1;
                }
                bq4Var.t(4);
            }
        }
        if (bq4Var.h()) {
            bq4Var.t(3);
            if (bq4Var.h()) {
                L(bq4Var);
            }
        }
    }

    public static void F(int[] iArr, int[] iArr2) {
        long j2 = iArr[10] & 4294967295L;
        long j3 = iArr[11] & 4294967295L;
        long j4 = iArr[12] & 4294967295L;
        long j5 = iArr[13] & 4294967295L;
        long j6 = ((iArr[7] & 4294967295L) + j3) - 1;
        long j7 = (iArr[8] & 4294967295L) + j4;
        long j8 = (iArr[9] & 4294967295L) + j5;
        long j9 = (iArr[0] & 4294967295L) - j6;
        long j10 = j9 & 4294967295L;
        long j11 = ((iArr[1] & 4294967295L) - j7) + (j9 >> 32);
        int i2 = (int) j11;
        iArr2[1] = i2;
        long j12 = ((iArr[2] & 4294967295L) - j8) + (j11 >> 32);
        int i3 = (int) j12;
        iArr2[2] = i3;
        long j13 = (((iArr[3] & 4294967295L) + j6) - j2) + (j12 >> 32);
        long j14 = j13 & 4294967295L;
        long j15 = (((iArr[4] & 4294967295L) + j7) - j3) + (j13 >> 32);
        iArr2[4] = (int) j15;
        long j16 = (((iArr[5] & 4294967295L) + j8) - j4) + (j15 >> 32);
        iArr2[5] = (int) j16;
        long j17 = (((iArr[6] & 4294967295L) + j2) - j5) + (j16 >> 32);
        iArr2[6] = (int) j17;
        long j18 = (j17 >> 32) + 1;
        long j19 = j14 + j18;
        long j20 = j10 - j18;
        iArr2[0] = (int) j20;
        long j21 = j20 >> 32;
        if (j21 != 0) {
            long j22 = j21 + (i2 & 4294967295L);
            iArr2[1] = (int) j22;
            long j23 = (j22 >> 32) + (i3 & 4294967295L);
            iArr2[2] = (int) j23;
            j19 += j23 >> 32;
        }
        iArr2[3] = (int) j19;
        if (((j19 >> 32) == 0 || z5i.T(7, 4, iArr2) == 0) && !(iArr2[6] == -1 && wxe.E(iArr2, g))) {
            return;
        }
        i(iArr2);
    }

    public static void G(int i2, int[] iArr) {
        long j2;
        if (i2 != 0) {
            long j3 = i2 & 4294967295L;
            long j4 = (iArr[0] & 4294967295L) - j3;
            iArr[0] = (int) j4;
            long j5 = j4 >> 32;
            if (j5 != 0) {
                long j6 = j5 + (iArr[1] & 4294967295L);
                iArr[1] = (int) j6;
                long j7 = (j6 >> 32) + (iArr[2] & 4294967295L);
                iArr[2] = (int) j7;
                j5 = j7 >> 32;
            }
            long j8 = (iArr[3] & 4294967295L) + j3 + j5;
            iArr[3] = (int) j8;
            j2 = j8 >> 32;
        } else {
            j2 = 0;
        }
        if ((j2 == 0 || z5i.T(7, 4, iArr) == 0) && !(iArr[6] == -1 && wxe.E(iArr, g))) {
            return;
        }
        i(iArr);
    }

    public static void H(TextInputLayout textInputLayout, CheckableImageButton checkableImageButton, ColorStateList colorStateList) {
        Drawable drawable = checkableImageButton.getDrawable();
        if (checkableImageButton.getDrawable() == null || colorStateList == null || !colorStateList.isStateful()) {
            return;
        }
        int[] drawableState = textInputLayout.getDrawableState();
        int[] drawableState2 = checkableImageButton.getDrawableState();
        int length = drawableState.length;
        int[] iArrCopyOf = Arrays.copyOf(drawableState, drawableState.length + drawableState2.length);
        System.arraycopy(drawableState2, 0, iArrCopyOf, length, drawableState2.length);
        int colorForState = colorStateList.getColorForState(iArrCopyOf, colorStateList.getDefaultColor());
        Drawable drawableMutate = drawable.mutate();
        drawableMutate.setTintList(ColorStateList.valueOf(colorForState));
        checkableImageButton.setImageDrawable(drawableMutate);
    }

    public static final void I(TextPaint textPaint, float f2) {
        if (Float.isNaN(f2)) {
            return;
        }
        if (f2 < 0.0f) {
            f2 = 0.0f;
        }
        if (f2 > 1.0f) {
            f2 = 1.0f;
        }
        textPaint.setAlpha(Math.round(f2 * 255.0f));
    }

    public static void J(CheckableImageButton checkableImageButton) {
        boolean zHasOnClickListeners = checkableImageButton.hasOnClickListeners();
        checkableImageButton.setFocusable(zHasOnClickListeners);
        checkableImageButton.setClickable(zHasOnClickListeners);
        checkableImageButton.f = zHasOnClickListeners;
        checkableImageButton.setLongClickable(false);
        checkableImageButton.setImportantForAccessibility(zHasOnClickListeners ? 1 : 2);
    }

    public static void K(View view, zdd zddVar) {
        gx7 gx7Var = zddVar.b.b;
        if (gx7Var == null || !gx7Var.a) {
            return;
        }
        float elevation = 0.0f;
        for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
            elevation += ((View) parent).getElevation();
        }
        xdd xddVar = zddVar.b;
        if (xddVar.m != elevation) {
            xddVar.m = elevation;
            zddVar.E();
        }
    }

    public static void L(bq4 bq4Var) throws s1g {
        int i2 = bq4Var.i(6);
        if (i2 < 2 || i2 > 42) {
            throw s1g.h(String.format("Invalid language tag bytes number: %d. Must be between 2 and 42.", Integer.valueOf(i2)));
        }
        bq4Var.t(i2 << 3);
    }

    public static void M(int[] iArr, int[] iArr2) {
        int[] iArr3 = new int[14];
        wxe.Z(iArr, iArr3);
        F(iArr3, iArr2);
    }

    public static void N(int[] iArr, int[] iArr2, int[] iArr3) {
        if (wxe.b0(iArr, iArr2, iArr3) != 0) {
            long j2 = (iArr3[0] & 4294967295L) + 1;
            iArr3[0] = (int) j2;
            long j3 = j2 >> 32;
            if (j3 != 0) {
                long j4 = j3 + (iArr3[1] & 4294967295L);
                iArr3[1] = (int) j4;
                long j5 = (j4 >> 32) + (iArr3[2] & 4294967295L);
                iArr3[2] = (int) j5;
                j3 = j5 >> 32;
            }
            long j6 = ((iArr3[3] & 4294967295L) - 1) + j3;
            iArr3[3] = (int) j6;
            if ((j6 >> 32) != 0) {
                z5i.v(7, 4, iArr3);
            }
        }
    }

    public static Person O(ecg ecgVar) {
        Person.Builder name = new Person.Builder().setName(ecgVar.a);
        IconCompat iconCompat = ecgVar.b;
        return name.setIcon(iconCompat != null ? fr3.f0(iconCompat, null) : null).setUri(ecgVar.c).setKey(ecgVar.d).setBot(ecgVar.e).setImportant(ecgVar.f).build();
    }

    public static void P(int[] iArr, int[] iArr2) {
        if (z5i.o0(7, 0, iArr, iArr2) != 0 || (iArr2[6] == -1 && wxe.E(iArr2, g))) {
            i(iArr2);
        }
    }

    public static void Q(CheckableImageButton checkableImageButton, CharSequence charSequence) {
        if (!checkableImageButton.isFocusable()) {
            charSequence = null;
        }
        checkableImageButton.setTooltipText(charSequence);
    }

    public static final o92 R(Drawable drawable, int i2) {
        return new o92(i2, new Drawable[]{drawable});
    }

    public static final void a(dil dilVar, ue5 ue5Var, ih5 ih5Var, int i2) {
        vt9 vt9Var = (vt9) ih5Var;
        vt9Var.Y(2080741862);
        int i3 = (vt9Var.h(dilVar) ? 4 : 2) | i2;
        byte b2 = 1;
        if (vt9Var.N(i3 & 1, (i3 & 19) != 18)) {
            sgb.a(dilVar, ue5Var, vt9Var, i3 & 126);
        } else {
            vt9Var.Q();
        }
        znh znhVarR = vt9Var.r();
        if (znhVarR != null) {
            znhVarR.d = new ac5(dilVar, ue5Var, i2, b2);
        }
    }

    public static final void b(lld lldVar, aof aofVar, c8e c8eVar, ih5 ih5Var, int i2) {
        vt9 vt9Var = (vt9) ih5Var;
        vt9Var.Y(-1330459117);
        int i3 = (vt9Var.f(lldVar) ? 4 : 2) | i2 | (vt9Var.h(aofVar) ? 32 : 16) | (vt9Var.f(c8eVar) ? NotificationCompat.FLAG_LOCAL_ONLY : NotificationCompat.FLAG_HIGH_PRIORITY);
        if (vt9Var.N(i3 & 1, (i3 & 147) != 146)) {
            int i4 = i3 & 14;
            boolean zH = vt9Var.h(aofVar) | (i4 == 4);
            Object objK = vt9Var.K();
            zpa zpaVar = hh5.a;
            if (zH || objK == zpaVar) {
                objK = new qmb((Object) aofVar, (Object) lldVar, (mt5) null, (byte) 22);
                vt9Var.g0(objK);
            }
            rm5.e(vt9Var, aofVar, (Function2) objK);
            gsj gsjVar = aofVar.a;
            boolean zH2 = (i4 == 4) | vt9Var.h(aofVar);
            Object objK2 = vt9Var.K();
            if (zH2 || objK2 == zpaVar) {
                objK2 = new s4f(lldVar, aofVar, (byte) 5);
                vt9Var.g0(objK2);
            }
            yi4.h(gsjVar, (Function0) objK2, c8eVar, vt9Var, i3 & 896);
        } else {
            vt9Var.Q();
        }
        znh znhVarR = vt9Var.r();
        if (znhVarR != null) {
            znhVarR.d = new g9(lldVar, aofVar, c8eVar, i2, (byte) 24);
        }
    }

    public static final void c(boolean z, Function1 function1, final c8e c8eVar, ue5 ue5Var, ih5 ih5Var, final int i2) {
        int i3;
        ue5 ue5Var2;
        Object obj;
        int i4;
        int i5;
        q0g q0gVar;
        u1o u1oVar;
        boolean z2;
        final boolean z3 = z;
        final Function1 function12 = function1;
        vt9 vt9Var = (vt9) ih5Var;
        vt9Var.Y(1597265892);
        if ((i2 & 6) == 0) {
            i3 = (vt9Var.g(z3) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= vt9Var.h(function12) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= vt9Var.f(c8eVar) ? NotificationCompat.FLAG_LOCAL_ONLY : NotificationCompat.FLAG_HIGH_PRIORITY;
        }
        if ((i2 & 3072) == 0) {
            i3 |= vt9Var.h(ue5Var) ? 2048 : 1024;
        }
        if (vt9Var.N(i3 & 1, (i3 & 1171) != 1170)) {
            Object obj2 = (Configuration) vt9Var.j(j41.a);
            View view = (View) vt9Var.j(j41.f);
            boolean zF = vt9Var.f(obj2) | vt9Var.f(view);
            Object objK = vt9Var.K();
            Object obj3 = hh5.a;
            if (zF || objK == obj3) {
                objK = new u1o(view);
                vt9Var.g0(objK);
            }
            u1o u1oVar2 = (u1o) objK;
            n27 n27Var = (n27) vt9Var.j(mi5.h);
            int iM = n27Var.M(48.0f);
            Object objK2 = vt9Var.K();
            if (objK2 == obj3) {
                objK2 = hyg.k((Object) null);
                vt9Var.g0(objK2);
            }
            final afe afeVar = (afe) objK2;
            Object objK3 = vt9Var.K();
            if (objK3 == obj3) {
                objK3 = new q0g(0);
                vt9Var.g0(objK3);
            }
            final q0g q0gVar2 = (q0g) objK3;
            Object objK4 = vt9Var.K();
            if (objK4 == obj3) {
                objK4 = new q0g(0);
                vt9Var.g0(objK4);
            }
            q0g q0gVar3 = (q0g) objK4;
            Object objK5 = vt9Var.K();
            if (objK5 == obj3) {
                objK5 = new kg9();
                vt9Var.g0(objK5);
            }
            kg9 kg9Var = (kg9) objK5;
            r17 r17Var = (r17) vt9Var.j(mi5.q);
            String strG = a4h.g(vt9Var, 2132019626);
            String strG2 = a4h.g(vt9Var, 2132019625);
            String strG3 = a4h.g(vt9Var, 2132019627);
            int i6 = i3;
            Object objK6 = vt9Var.K();
            if (objK6 == obj3) {
                objK6 = hyg.k(new tj8());
                vt9Var.g0(objK6);
            }
            afe afeVar2 = (afe) objK6;
            Object objK7 = vt9Var.K();
            if (objK7 == obj3) {
                objK7 = hyg.k(Boolean.FALSE);
                vt9Var.g0(objK7);
            }
            afe afeVar3 = (afe) objK7;
            int i7 = i6 & 14;
            boolean z4 = i7 == 4;
            int i8 = i6 & 112;
            boolean zF2 = z4 | (i8 == 32) | vt9Var.f(u1oVar2) | vt9Var.f(n27Var);
            Object objK8 = vt9Var.K();
            if (zF2 || objK8 == obj3) {
                obj = obj3;
                i4 = i8;
                i5 = iM;
                q0gVar = q0gVar3;
                u1oVar = u1oVar2;
                Object yj8Var = new yj8(kg9Var, z3, afeVar3, strG, strG2, strG3, r17Var, afeVar2, function12, q0gVar2, q0gVar);
                kg9Var = kg9Var;
                z3 = z3;
                function12 = function12;
                vt9Var.g0(yj8Var);
                objK8 = yj8Var;
            } else {
                obj = obj3;
                i4 = i8;
                i5 = iM;
                q0gVar = q0gVar3;
                u1oVar = u1oVar2;
            }
            Object obj4 = (yj8) objK8;
            boolean zH = vt9Var.h(u1oVar) | vt9Var.d(i5);
            Object objK9 = vt9Var.K();
            if (zH || objK9 == obj) {
                final q0g q0gVar4 = q0gVar;
                final int i9 = i5;
                final u1o u1oVar3 = u1oVar;
                objK9 = new Function1() { // from class: wj8
                    /* JADX WARN: Removed duplicated region for block: B:13:0x0068  */
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final java.lang.Object invoke(java.lang.Object r7) {
                        /*
                            r6 = this;
                            b2c r7 = (defpackage.b2c) r7
                            afe r0 = r3
                            r0.setValue(r7)
                            long r1 = r7.h()
                            r7 = 32
                            long r1 = r1 >> r7
                            int r7 = (int) r1
                            q0g r1 = r4
                            r1.i(r7)
                            u1o r7 = r1
                            android.view.View r7 = r7.a
                            android.graphics.Rect r1 = new android.graphics.Rect
                            r1.<init>()
                            r7.getWindowVisibleDisplayFrame(r1)
                            int r7 = r1.top
                            int r1 = r1.bottom
                            java.lang.Object r0 = r0.getValue()
                            b2c r0 = (defpackage.b2c) r0
                            if (r0 == 0) goto L45
                            boolean r2 = r0.f()
                            if (r2 == 0) goto L45
                            r2 = 0
                            long r2 = r0.B(r2)
                            long r4 = r0.h()
                            long r4 = defpackage.fr3.g0(r4)
                            voh r0 = defpackage.bwg.a(r2, r4)
                            goto L47
                        L45:
                            voh r0 = defpackage.voh.e
                        L47:
                            int r2 = r2
                            int r3 = r7 + r2
                            int r2 = r1 - r2
                            float r4 = r0.b
                            float r1 = (float) r1
                            int r1 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
                            if (r1 > 0) goto L68
                            float r0 = r0.d
                            float r7 = (float) r7
                            int r7 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
                            if (r7 < 0) goto L68
                            float r7 = (float) r3
                            float r4 = r4 - r7
                            float r7 = (float) r2
                            float r7 = r7 - r0
                            float r7 = java.lang.Math.max(r4, r7)
                            int r7 = zed.b(r7)
                            goto L6a
                        L68:
                            int r7 = r2 - r3
                        L6a:
                            r0 = 0
                            int r7 = java.lang.Math.max(r7, r0)
                            q0g r6 = r5
                            r6.i(r7)
                            kotlin.Unit r6 = kotlin.Unit.a
                            return r6
                        */
                        throw new UnsupportedOperationException("Method not decompiled: defpackage.wj8.invoke(java.lang.Object):java.lang.Object");
                    }
                };
                vt9Var.g0(objK9);
            }
            c8e c8eVarH = na2.H(c8eVar, (Function1) objK9);
            tfd tfdVarC = nr3.c(rbe.b, false);
            int iHashCode = Long.hashCode(vt9Var.T);
            oag oagVarL = vt9Var.l();
            c8e c8eVarP = qyn.P(vt9Var, c8eVarH);
            bh5.To.getClass();
            vt9Var.a0();
            if (vt9Var.S) {
                vt9Var.k(m3c.S);
            } else {
                vt9Var.j0();
            }
            y4h.o(vt9Var, tfdVarC, ujp.f);
            y4h.o(vt9Var, oagVarL, ujp.e);
            ah5 ah5Var = ujp.g;
            if (vt9Var.S || !Intrinsics.a(vt9Var.K(), Integer.valueOf(iHashCode))) {
                vep.x(iHashCode, vt9Var, iHashCode, ah5Var);
            }
            y4h.o(vt9Var, c8eVarP, ujp.d);
            ue5 ue5Var3 = ue5Var;
            ue5Var3.invoke(obj4, vt9Var, Integer.valueOf((i6 >> 6) & 112));
            vt9Var.p(true);
            if (z3) {
                vt9Var.W(209894723);
                boolean zH2 = vt9Var.h(u1oVar) | vt9Var.d(i5);
                Object objK10 = vt9Var.K();
                if (zH2 || objK10 == obj) {
                    objK10 = new o77(u1oVar, i5, afeVar, q0gVar, (byte) 1);
                    vt9Var.g0(objK10);
                }
                z2 = false;
                yi4.e((Function0) objK10, vt9Var, 0);
                vt9Var.p(false);
            } else {
                z2 = false;
                vt9Var.W(210228190);
                vt9Var.p(false);
            }
            boolean z5 = i7 == 4 ? true : z2;
            Object objK11 = vt9Var.K();
            if (z5 || objK11 == obj) {
                objK11 = new sz3((byte) 2, kg9Var, z3);
                vt9Var.g0(objK11);
            }
            rm5.L(vt9Var, (Function0) objK11);
            boolean z6 = i4 == 32 ? true : z2;
            Object objK12 = vt9Var.K();
            if (z6 || objK12 == obj) {
                objK12 = new y47(function12, (byte) 23);
                vt9Var.g0(objK12);
            }
            ui6.b(z3, (Function0) objK12, vt9Var, i7);
            ue5Var2 = ue5Var3;
        } else {
            ue5Var2 = ue5Var;
            vt9Var.Q();
        }
        znh znhVarR = vt9Var.r();
        if (znhVarR != null) {
            final ue5 ue5Var4 = ue5Var2;
            znhVarR.d = new Function2() { // from class: xj8
                public final Object invoke(Object obj5, Object obj6) {
                    ((Integer) obj6).getClass();
                    ic4.c(z3, function12, c8eVar, ue5Var4, (ih5) obj5, aoh.m(i2 | 1));
                    return Unit.a;
                }
            };
        }
    }

    public static final void d(ue5 ue5Var, c8e c8eVar, ue5 ue5Var2, ue5 ue5Var3, ue5 ue5Var4, rhc rhcVar, ih5 ih5Var, int i2) {
        int i3;
        vt9 vt9Var;
        ue5 ue5Var5;
        ue5 ue5Var6;
        ue5 ue5Var7;
        vt9 vt9Var2 = (vt9) ih5Var;
        vt9Var2.Y(487133126);
        byte b2 = 2;
        if ((i2 & 6) == 0) {
            i3 = (vt9Var2.h(ue5Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= vt9Var2.f(c8eVar) ? 32 : 16;
        }
        int i4 = i3 | 384;
        if ((i2 & 3072) == 0) {
            i4 |= vt9Var2.h(ue5Var2) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i4 |= vt9Var2.h(ue5Var3) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i4 |= vt9Var2.h(ue5Var4) ? 131072 : 65536;
        }
        if ((1572864 & i2) == 0) {
            i4 |= vt9Var2.f(rhcVar) ? 1048576 : 524288;
        }
        int i5 = i4 | 113246208;
        byte b3 = 0;
        byte b4 = 1;
        if (vt9Var2.N(i5 & 1, (38347923 & i5) != 38347922)) {
            vt9Var2.S();
            if ((i2 & 1) == 0 || vt9Var2.x()) {
                int i6 = shc.a;
            } else {
                vt9Var2.Q();
            }
            vt9Var2.q();
            ue5 ue5VarP = gyg.P(629852750, new ub3(rhcVar, ue5Var, b2), vt9Var2);
            if (ue5Var2 == null) {
                vt9Var2.W(-510713870);
                vt9Var2.p(false);
                ue5Var5 = null;
            } else {
                vt9Var2.W(-510713869);
                ue5 ue5VarP2 = gyg.P(-1291211644, new vhc(rhcVar, ue5Var2, b4), vt9Var2);
                vt9Var2.p(false);
                ue5Var5 = ue5VarP2;
            }
            vt9Var2.W(-510395686);
            vt9Var2.p(false);
            if (ue5Var3 == null) {
                vt9Var2.W(-510083888);
                vt9Var2.p(false);
                ue5Var6 = null;
            } else {
                vt9Var2.W(-510083887);
                ue5 ue5VarP3 = gyg.P(449548451, new vhc(rhcVar, ue5Var3, b3), vt9Var2);
                vt9Var2.p(false);
                ue5Var6 = ue5VarP3;
            }
            if (ue5Var4 == null) {
                vt9Var2.W(-509666659);
                vt9Var2.p(false);
                ue5Var7 = null;
            } else {
                vt9Var2.W(-509666658);
                ue5 ue5VarP4 = gyg.P(1946411067, new vhc(rhcVar, ue5Var4, b2), vt9Var2);
                vt9Var2.p(false);
                ue5Var7 = ue5VarP4;
            }
            Object objK = vt9Var2.K();
            if (objK == hh5.a) {
                objK = new g8c((byte) 10);
                vt9Var2.g0(objK);
            }
            c8e c8eVarD = h0j.a(z7e.b, true, (Function1) objK).d(c8eVar);
            int i7 = shc.a;
            paj pajVarB = ccj.b(ric.b, vt9Var2);
            long j2 = rhcVar.a;
            long j3 = rhcVar.b;
            ue5 ue5VarP5 = gyg.P(1192488737, new uhc(ue5Var6, ue5Var7, ue5VarP, null, ue5Var5), vt9Var2);
            int i8 = i5 >> 9;
            vt9Var = vt9Var2;
            utk.a(c8eVarD, pajVarB, j2, j3, 0.0f, 0.0f, ue5VarP5, vt9Var, (57344 & i8) | 12582912 | (i8 & 458752), 64);
        } else {
            vt9Var = vt9Var2;
            vt9Var.Q();
        }
        znh znhVarR = vt9Var.r();
        if (znhVarR != null) {
            znhVarR.d = new se5(ue5Var, c8eVar, ue5Var2, ue5Var3, ue5Var4, rhcVar, i2, (byte) 3);
        }
    }

    public static final void e(ue5 ue5Var, ue5 ue5Var2, ue5 ue5Var3, ue5 ue5Var4, ue5 ue5Var5, ih5 ih5Var, int i2) {
        vt9 vt9Var = (vt9) ih5Var;
        vt9Var.Y(-61277522);
        int i3 = i2 | (vt9Var.h(ue5Var) ? 4 : 2) | (vt9Var.h(ue5Var2) ? 32 : 16) | (vt9Var.h(ue5Var4) ? 2048 : 1024) | (vt9Var.h(ue5Var5) ? 16384 : 8192);
        if (vt9Var.N(i3 & 1, (i3 & 9363) != 9362)) {
            Object objK = vt9Var.K();
            zpa zpaVar = hh5.a;
            if (objK == zpaVar) {
                objK = new aic();
                vt9Var.g0(objK);
            }
            aic aicVar = (aic) objK;
            ue5 ue5Var6 = new ue5(1271844412, new a7b(Arrays.asList(ue5Var3, ue5Var4 == null ? ff5.a : ue5Var4, ue5Var5 == null ? ff5.b : ue5Var5, ue5Var == null ? ff5.c : ue5Var, ue5Var2 == null ? ff5.d : ue5Var2), (byte) 2), true);
            Object objK2 = vt9Var.K();
            if (objK2 == zpaVar) {
                objK2 = new nbe(aicVar);
                vt9Var.g0(objK2);
            }
            tfd tfdVar = (tfd) objK2;
            int iHashCode = Long.hashCode(vt9Var.T);
            oag oagVarL = vt9Var.l();
            c8e c8eVarP = qyn.P(vt9Var, z7e.b);
            bh5.To.getClass();
            vt9Var.a0();
            if (vt9Var.S) {
                vt9Var.k(m3c.S);
            } else {
                vt9Var.j0();
            }
            y4h.o(vt9Var, tfdVar, ujp.f);
            y4h.o(vt9Var, oagVarL, ujp.e);
            ah5 ah5Var = ujp.g;
            if (vt9Var.S || !Intrinsics.a(vt9Var.K(), Integer.valueOf(iHashCode))) {
                vep.x(iHashCode, vt9Var, iHashCode, ah5Var);
            }
            y4h.o(vt9Var, c8eVarP, ujp.d);
            o18.r(0, ue5Var6, vt9Var, true);
        } else {
            vt9Var.Q();
        }
        znh znhVarR = vt9Var.r();
        if (znhVarR != null) {
            znhVarR.d = new c39(ue5Var, ue5Var2, ue5Var3, ue5Var4, ue5Var5, i2, (byte) 1);
        }
    }

    public static final void f(xg5 xg5Var, c8e c8eVar, ue5 ue5Var, ih5 ih5Var, int i2) {
        vt9 vt9Var = (vt9) ih5Var;
        vt9Var.Y(-119129799);
        int i3 = (vt9Var.h(xg5Var) ? 4 : 2) | i2 | 48;
        if (vt9Var.N(i3 & 1, (i3 & 147) != 146)) {
            boolean z = (i3 & 14) == 4 || vt9Var.h(xg5Var);
            Object objK = vt9Var.K();
            if (z || objK == hh5.a) {
                objK = new o5f(xg5Var, (byte) 13);
                vt9Var.g0(objK);
            }
            rm5.b(xg5Var, (Function1) objK, vt9Var);
            k7h k7hVarA = pvc.a.a(xg5Var);
            z7e z7eVar = z7e.b;
            kfo.c(k7hVarA, gyg.P(1194552825, new bof(z7eVar, ue5Var, xg5Var), vt9Var), vt9Var, 56);
            c8eVar = z7eVar;
        } else {
            vt9Var.Q();
        }
        znh znhVarR = vt9Var.r();
        if (znhVarR != null) {
            znhVarR.d = new bof(xg5Var, c8eVar, ue5Var, i2);
        }
    }

    public static final void g(long j2, xam xamVar, Function2 function2, ih5 ih5Var, int i2) {
        vt9 vt9Var = (vt9) ih5Var;
        vt9Var.Y(-285397024);
        int i3 = i2 | (vt9Var.e(j2) ? 4 : 2) | (vt9Var.h(function2) ? NotificationCompat.FLAG_LOCAL_ONLY : NotificationCompat.FLAG_HIGH_PRIORITY);
        if (vt9Var.N(i3 & 1, (i3 & 147) != 146)) {
            j7h.a(j2, abm.a(xamVar, vt9Var), function2, vt9Var, i3 & 910);
        } else {
            vt9Var.Q();
        }
        znh znhVarR = vt9Var.r();
        if (znhVarR != null) {
            znhVarR.d = new v41(j2, xamVar, function2, i2, (byte) 1);
        }
    }

    public static void h(int[] iArr, int[] iArr2, int[] iArr3) {
        if (wxe.e(iArr, iArr2, iArr3) != 0 || (iArr3[6] == -1 && wxe.E(iArr3, g))) {
            i(iArr3);
        }
    }

    public static void i(int[] iArr) {
        long j2 = (iArr[0] & 4294967295L) - 1;
        iArr[0] = (int) j2;
        long j3 = j2 >> 32;
        if (j3 != 0) {
            long j4 = j3 + (iArr[1] & 4294967295L);
            iArr[1] = (int) j4;
            long j5 = (j4 >> 32) + (iArr[2] & 4294967295L);
            iArr[2] = (int) j5;
            j3 = j5 >> 32;
        }
        long j6 = (iArr[3] & 4294967295L) + 1 + j3;
        iArr[3] = (int) j6;
        if ((j6 >> 32) != 0) {
            z5i.T(7, 4, iArr);
        }
    }

    public static final void j(StringBuilder sb, Class cls) {
        while (cls.isArray()) {
            sb.append("[");
            cls = cls.getComponentType();
        }
        if (cls.equals(Void.TYPE)) {
            sb.append("V");
            return;
        }
        if (cls.equals(Integer.TYPE)) {
            sb.append("I");
            return;
        }
        if (cls.equals(Long.TYPE)) {
            sb.append("J");
            return;
        }
        if (cls.equals(Short.TYPE)) {
            sb.append("S");
            return;
        }
        if (cls.equals(Byte.TYPE)) {
            sb.append("B");
            return;
        }
        if (cls.equals(Boolean.TYPE)) {
            sb.append("Z");
            return;
        }
        if (cls.equals(Character.TYPE)) {
            sb.append("C");
            return;
        }
        if (cls.equals(Float.TYPE)) {
            sb.append("F");
        } else {
            if (cls.equals(Double.TYPE)) {
                sb.append("D");
                return;
            }
            sb.append("L");
            sb.append((CharSequence) cls.getName().replace('.', '/'));
            sb.append(";");
        }
    }

    public static void k(TextInputLayout textInputLayout, CheckableImageButton checkableImageButton, ColorStateList colorStateList, PorterDuff.Mode mode) {
        Drawable drawable = checkableImageButton.getDrawable();
        if (drawable != null) {
            drawable = drawable.mutate();
            if (colorStateList == null || !colorStateList.isStateful()) {
                drawable.setTintList(colorStateList);
            } else {
                int[] drawableState = textInputLayout.getDrawableState();
                int[] drawableState2 = checkableImageButton.getDrawableState();
                int length = drawableState.length;
                int[] iArrCopyOf = Arrays.copyOf(drawableState, drawableState.length + drawableState2.length);
                System.arraycopy(drawableState2, 0, iArrCopyOf, length, drawableState2.length);
                drawable.setTintList(ColorStateList.valueOf(colorStateList.getColorForState(iArrCopyOf, colorStateList.getDefaultColor())));
            }
            if (mode != null) {
                drawable.setTintMode(mode);
            }
        }
        if (checkableImageButton.getDrawable() != drawable) {
            checkableImageButton.setImageDrawable(drawable);
        }
    }

    public static f99 l(f99 f99Var, int i2) {
        h04 h04Var = h04.a;
        if (i2 < 0 && i2 != -2 && i2 != -1) {
            bxl.d(sko.i(i2, "Buffer size should be non-negative, BUFFERED, or CONFLATED, but was "));
            return null;
        }
        if (i2 == -1) {
            h04Var = h04.b;
            i2 = 0;
        }
        int i3 = i2;
        h04 h04Var2 = h04Var;
        return f99Var instanceof pr9 ? pr9.a((pr9) f99Var, null, i3, h04Var2, 1) : new xr4(f99Var, (dx5) null, i3, h04Var2, 2);
    }

    public static final Bundle m(Pair... pairArr) {
        Bundle bundle = new Bundle(pairArr.length);
        for (Pair pair : pairArr) {
            String str = (String) pair.a;
            Object obj = pair.b;
            if (obj == null) {
                bundle.putString(str, null);
            } else if (obj instanceof Boolean) {
                bundle.putBoolean(str, ((Boolean) obj).booleanValue());
            } else if (obj instanceof Byte) {
                bundle.putByte(str, ((Number) obj).byteValue());
            } else if (obj instanceof Character) {
                bundle.putChar(str, ((Character) obj).charValue());
            } else if (obj instanceof Double) {
                bundle.putDouble(str, ((Number) obj).doubleValue());
            } else if (obj instanceof Float) {
                bundle.putFloat(str, ((Number) obj).floatValue());
            } else if (obj instanceof Integer) {
                bundle.putInt(str, ((Number) obj).intValue());
            } else if (obj instanceof Long) {
                bundle.putLong(str, ((Number) obj).longValue());
            } else if (obj instanceof Short) {
                bundle.putShort(str, ((Number) obj).shortValue());
            } else if (obj instanceof Bundle) {
                bundle.putBundle(str, (Bundle) obj);
            } else if (obj instanceof CharSequence) {
                bundle.putCharSequence(str, (CharSequence) obj);
            } else if (obj instanceof Parcelable) {
                bundle.putParcelable(str, (Parcelable) obj);
            } else if (obj instanceof boolean[]) {
                bundle.putBooleanArray(str, (boolean[]) obj);
            } else if (obj instanceof byte[]) {
                bundle.putByteArray(str, (byte[]) obj);
            } else if (obj instanceof char[]) {
                bundle.putCharArray(str, (char[]) obj);
            } else if (obj instanceof double[]) {
                bundle.putDoubleArray(str, (double[]) obj);
            } else if (obj instanceof float[]) {
                bundle.putFloatArray(str, (float[]) obj);
            } else if (obj instanceof int[]) {
                bundle.putIntArray(str, (int[]) obj);
            } else if (obj instanceof long[]) {
                bundle.putLongArray(str, (long[]) obj);
            } else if (obj instanceof short[]) {
                bundle.putShortArray(str, (short[]) obj);
            } else if (obj instanceof Object[]) {
                Class<?> componentType = obj.getClass().getComponentType();
                if (Parcelable.class.isAssignableFrom(componentType)) {
                    bundle.putParcelableArray(str, (Parcelable[]) obj);
                } else if (String.class.isAssignableFrom(componentType)) {
                    bundle.putStringArray(str, (String[]) obj);
                } else if (CharSequence.class.isAssignableFrom(componentType)) {
                    bundle.putCharSequenceArray(str, (CharSequence[]) obj);
                } else {
                    if (!Serializable.class.isAssignableFrom(componentType)) {
                        qp2.o(sko.l("Illegal value array type ", componentType.getCanonicalName(), " for key \"", str, "\""));
                        return null;
                    }
                    bundle.putSerializable(str, (Serializable) obj);
                }
            } else if (obj instanceof Serializable) {
                bundle.putSerializable(str, (Serializable) obj);
            } else if (obj instanceof IBinder) {
                bundle.putBinder(str, (IBinder) obj);
            } else if (obj instanceof Size) {
                bundle.putSize(str, (Size) obj);
            } else {
                if (!(obj instanceof SizeF)) {
                    qp2.o(sko.l("Illegal value type ", obj.getClass().getCanonicalName(), " for key \"", str, "\""));
                    return null;
                }
                bundle.putSizeF(str, (SizeF) obj);
            }
        }
        return bundle;
    }

    public static final int n(shb shbVar, int i2, int i3, int i4, int i5, int i6, int i7, int i8, long j2) {
        int iMax = Math.max(Math.max(yo5.i(j2), shbVar.M(i7 == 1 ? ric.l : i7 == 2 ? ric.s : ric.p)), Math.max(i2, Math.max(i4 + i5 + i6, i3)) + i8);
        int iG = yo5.g(j2);
        return iMax > iG ? iG : iMax;
    }

    public static ImageView.ScaleType o(int i2) {
        return i2 != 0 ? i2 != 1 ? i2 != 2 ? i2 != 3 ? i2 != 5 ? i2 != 6 ? ImageView.ScaleType.CENTER : ImageView.ScaleType.CENTER_INSIDE : ImageView.ScaleType.CENTER_CROP : ImageView.ScaleType.FIT_END : ImageView.ScaleType.FIT_CENTER : ImageView.ScaleType.FIT_START : ImageView.ScaleType.FIT_XY;
    }

    public static ui6 p(int i2) {
        if (i2 != 0 && i2 == 1) {
            return new e76();
        }
        return new w8i();
    }

    public static final f99 r(f99 f99Var, dx5 dx5Var) {
        if (dx5Var.get(ulp.h) == null) {
            return dx5Var.equals(h.a) ? f99Var : f99Var instanceof pr9 ? pr9.a((pr9) f99Var, dx5Var, 0, null, 6) : new xr4(f99Var, dx5Var, 0, (h04) null, 12);
        }
        odf.i(dx5Var, "Flow context cannot contain job in it. Had ");
        return null;
    }

    public static ith[] s(Bundle[] bundleArr) {
        if (bundleArr == null) {
            return null;
        }
        ith[] ithVarArr = new ith[bundleArr.length];
        for (int i2 = 0; i2 < bundleArr.length; i2++) {
            Bundle bundle = bundleArr[i2];
            ArrayList<String> stringArrayList = bundle.getStringArrayList("allowedDataTypes");
            HashSet hashSet = new HashSet();
            if (stringArrayList != null) {
                int size = stringArrayList.size();
                int i3 = 0;
                while (i3 < size) {
                    String str = stringArrayList.get(i3);
                    i3++;
                    hashSet.add(str);
                }
            }
            ithVarArr[i2] = new ith(bundle.getString("resultKey"), bundle.getCharSequence("label"), bundle.getCharSequenceArray("choices"), bundle.getBoolean("allowFreeFormInput"), 0, bundle.getBundle("extras"), hashSet);
        }
        return ithVarArr;
    }

    public static void t(int i2, g1g g1gVar) {
        g1gVar.K(7);
        byte[] bArr = g1gVar.a;
        bArr[0] = -84;
        bArr[1] = 64;
        bArr[2] = -1;
        bArr[3] = -1;
        bArr[4] = (byte) ((i2 >> 16) & 255);
        bArr[5] = (byte) ((i2 >> 8) & 255);
        bArr[6] = (byte) (i2 & 255);
    }

    public static final boolean u(KeyEvent keyEvent) {
        long jS = uup.s(keyEvent);
        int i2 = jub.O;
        return jub.a(jS, jub.h) || jub.a(jS, jub.r) || jub.a(jS, jub.E);
    }

    public static final boolean v(Uri uri) {
        return Intrinsics.a(uri.getScheme(), "https") && Intrinsics.a(uri.getHost(), "lens.google.com") && Intrinsics.a(uri.getPath(), "/v3/upload");
    }

    public static final LinkedHashSet w(Iterable iterable, Function1 function1) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            Object objInvoke = function1.invoke(it.next());
            if (objInvoke != null) {
                linkedHashSet.add(objInvoke);
            }
        }
        return linkedHashSet;
    }

    public static i8e x(Function1 function1) {
        i8e i8eVar = new i8e();
        function1.invoke(i8eVar);
        return i8eVar;
    }

    public static void y(int[] iArr, int[] iArr2, int[] iArr3) {
        int[] iArr4 = new int[14];
        wxe.O(iArr, iArr2, iArr4);
        F(iArr4, iArr3);
    }

    public static void z(int[] iArr, int[] iArr2) {
        int iB = z5i.B(7, iArr);
        int[] iArr3 = g;
        if (iB != 0) {
            wxe.b0(iArr3, iArr3, iArr2);
        } else {
            wxe.b0(iArr3, iArr, iArr2);
        }
    }

    public abstract void q(Intent intent);
}
