package defpackage;

import ads_mobile_sdk.pd;
import android.R;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.StateListDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.graphics.drawable.shapes.RoundRectShape;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.TextView;
import androidx.core.app.NotificationCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.vectordrawable.graphics.drawable.AnimatedVectorDrawableCompat;
import com.google.android.material.appbar.MaterialToolbar;
import com.opera.android.autofill.passwords.picker.AutofillPasswordPickerActivity;
import com.opera.android.browser.chromium.ChromiumContent;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt;

/* loaded from: classes.dex */
public abstract class j14 {
    public static final int[] a = {1, 2, 3, 6};
    public static final int[] b = {48000, 44100, 32000};
    public static final int[] c = {24000, 22050, 16000};
    public static final int[] d = {2, 1, 2, 3, 3, 4, 4, 5};
    public static final int[] e = {32, 40, 48, 56, 64, 80, 96, 112, NotificationCompat.FLAG_HIGH_PRIORITY, 160, 192, 224, NotificationCompat.FLAG_LOCAL_ONLY, 320, 384, 448, NotificationCompat.FLAG_GROUP_SUMMARY, 576, 640};
    public static final int[] f = {69, 87, pd.V0, 121, 139, 174, 208, 243, 278, 348, 417, 487, 557, 696, 835, 975, 1114, 1253, 1393};
    public static final ue5 g = new ue5(139068731, new bf5((byte) 16), false);
    public static final ue5 h = new ue5(1658897924, new cf5((byte) 4), false);
    public static final int[] i;
    public static final int[] j;
    public static final int[] k;
    public static final int[] l;
    public static final int[] m;
    public static final int[] n;
    public static final int[] o;
    public static final int[] p;
    public static final int[] q;
    public static final int[] r;
    public static final int[] s;
    public static final int[] t;
    public static final w8l u;
    public static final eko v;
    public static int w;
    public static Canvas x;

    static {
        new ue5(-1406126567, new cf5((byte) 5), false);
        new ue5(1151920370, new cf5((byte) 6), false);
        i = new int[]{1, 2, 2, 2, 2, 3, 3, 4, 4, 5, 6, 6, 6, 7, 8, 8};
        j = new int[]{-1, 8000, 16000, 32000, -1, -1, 11025, 22050, 44100, -1, -1, 12000, 24000, 48000, -1, -1};
        k = new int[]{64, 112, NotificationCompat.FLAG_HIGH_PRIORITY, 192, 224, NotificationCompat.FLAG_LOCAL_ONLY, 384, 448, NotificationCompat.FLAG_GROUP_SUMMARY, 640, 768, 896, 1024, 1152, 1280, 1536, 1920, 2048, 2304, 2560, 2688, 2816, 2823, 2944, 3072, 3840, 4096, 6144, 7680};
        l = new int[]{8000, 16000, 32000, 64000, 128000, 22050, 44100, 88200, 176400, 352800, 12000, 24000, 48000, 96000, 192000, 384000};
        m = new int[]{5, 8, 10, 12};
        n = new int[]{6, 9, 12, 15};
        o = new int[]{2, 4, 6, 8};
        p = new int[]{9, 11, 13, 16};
        q = new int[]{5, 8, 10, 12};
        r = new int[]{-6803, -2, -1, -1, -1, -1, -1};
        s = new int[]{46280809, 13606, 1, 0, 0, 0, 0, -13606, -3, -1, -1, -1, -1, -1};
        t = new int[]{-46280809, -13607, -2, -1, -1, -1, -1, 13605, 2};
        u = new w8l((byte) 3);
        v = new eko((byte) 19);
    }

    public static void A(InputStream inputStream, OutputStream outputStream) throws IOException {
        byte[] bArr = new byte[8192];
        while (true) {
            int i2 = inputStream.read(bArr);
            if (i2 == -1) {
                return;
            } else {
                outputStream.write(bArr, 0, i2);
            }
        }
    }

    public static tta B(Context context, boolean z) throws Resources.NotFoundException {
        rta rtaVar;
        Rect rectI = r9n.i(context);
        int iWidth = rectI.width();
        hpj hpjVarT = ddh.t(iWidth, context);
        gpj gpjVarS = ddh.s(rectI.height(), context);
        gpj gpjVar = gpj.a;
        if (gpjVarS.d()) {
            rtaVar = z ? rta.L : rta.M;
        } else {
            int iOrdinal = hpjVarT.ordinal();
            if (iOrdinal == 0) {
                rtaVar = iWidth < z7h.h(context, 320.0f) ? rta.XS : iWidth < z7h.h(context, 360.0f) ? z ? rta.S : rta.XS : iWidth < z7h.h(context, 411.0f) ? z ? rta.L : rta.S : z ? rta.XL : rta.M;
            } else if (iOrdinal == 1) {
                rtaVar = z ? rta.XL : rta.L;
            } else {
                if (iOrdinal != 2 && iOrdinal != 3) {
                    h9o.p();
                    return null;
                }
                rtaVar = z ? rta.XXL : rta.XL;
            }
        }
        Resources resources = context.getResources();
        int dimensionPixelSize = resources.getDimensionPixelSize(rtaVar.a);
        int dimensionPixelSize2 = resources.getDimensionPixelSize(rtaVar.b);
        int dimensionPixelSize3 = resources.getDimensionPixelSize(rtaVar.c);
        int dimensionPixelSize4 = resources.getDimensionPixelSize(rtaVar.d);
        int dimensionPixelSize5 = resources.getDimensionPixelSize(rtaVar.e);
        int dimensionPixelSize6 = resources.getDimensionPixelSize(rtaVar.f);
        int integer = resources.getInteger(rtaVar.g);
        hpj hpjVar = hpj.a;
        return new tta(dimensionPixelSize, dimensionPixelSize2, dimensionPixelSize3, dimensionPixelSize4, dimensionPixelSize5, dimensionPixelSize6, integer, hpjVarT.ordinal() <= 0 ? new sta(0, z7h.h(context, 16.0f)) : new sta(z7h.h(context, 8.0f), Integer.MAX_VALUE));
    }

    public static final void C(View view, boolean z) {
        if (z) {
            i(view);
        } else {
            view.setMinimumWidth(view.getResources().getDimensionPixelOffset(2131167767));
            view.setMinimumHeight(view.getResources().getDimensionPixelOffset(2131167766));
        }
        byte b2 = 1;
        view.setFocusable(true);
        view.post(new ca(view, b2));
        r5n.l(view, new da(b2));
    }

    public static ShapeDrawable D(int i2, int i3) {
        ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
        shapeDrawable.setPadding(new Rect());
        shapeDrawable.setIntrinsicWidth(i2);
        shapeDrawable.setIntrinsicHeight(i2);
        shapeDrawable.getPaint().setColor(i3);
        return shapeDrawable;
    }

    public static ShapeDrawable E(int i2, int i3, int i4) {
        float f2 = i3;
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(new float[]{f2, f2, f2, f2, f2, f2, f2, f2}, null, null));
        shapeDrawable.setPadding(new Rect());
        shapeDrawable.setIntrinsicWidth(i2);
        shapeDrawable.setIntrinsicHeight(i2);
        shapeDrawable.getPaint().setColor(i4);
        return shapeDrawable;
    }

    public static final Object F(l99 l99Var, f99 f99Var, mt5 mt5Var) throws Throwable {
        if (l99Var instanceof lnl) {
            throw ((lnl) l99Var).a;
        }
        Object objCollect = f99Var.collect(l99Var, mt5Var);
        return objCollect == px5.a ? objCollect : Unit.a;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:20:0x0029. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:21:0x002c A[FALL_THROUGH, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final ru2 G(ru2 r3) {
        /*
            int r0 = r3.e
            if (r0 == 0) goto L2d
            r1 = 1
            if (r0 == r1) goto L2d
            r1 = 7
            if (r0 == r1) goto L2d
            r1 = 27
            if (r0 == r1) goto L2d
            r1 = 38
            r2 = 0
            if (r0 == r1) goto L2c
            r1 = 55
            if (r0 == r1) goto L2c
            switch(r0) {
                case 10: goto L2c;
                case 11: goto L2c;
                case 12: goto L2c;
                default: goto L1a;
            }
        L1a:
            switch(r0) {
                case 14: goto L2c;
                case 15: goto L2c;
                case 16: goto L2c;
                case 17: goto L2c;
                case 18: goto L2c;
                case 19: goto L2c;
                case 20: goto L2d;
                case 21: goto L2d;
                case 22: goto L2c;
                case 23: goto L2d;
                default: goto L1d;
            }
        L1d:
            switch(r0) {
                case 30: goto L2d;
                case 31: goto L2d;
                case 32: goto L2d;
                case 33: goto L2d;
                case 34: goto L2c;
                case 35: goto L2d;
                case 36: goto L2d;
                default: goto L20;
            }
        L20:
            switch(r0) {
                case 41: goto L2c;
                case 42: goto L2c;
                case 43: goto L2d;
                case 44: goto L2c;
                case 45: goto L2c;
                case 46: goto L2c;
                case 47: goto L2d;
                default: goto L23;
            }
        L23:
            switch(r0) {
                case 49: goto L2c;
                case 50: goto L2c;
                case 51: goto L2c;
                default: goto L26;
            }
        L26:
            switch(r0) {
                case 61: goto L2d;
                case 62: goto L2d;
                case 63: goto L2d;
                case 64: goto L2c;
                case 65: goto L2d;
                case 66: goto L2c;
                case 67: goto L2c;
                case 68: goto L2c;
                default: goto L29;
            }
        L29:
            switch(r0) {
                case 70: goto L2c;
                case 71: goto L2c;
                case 72: goto L2c;
                case 73: goto L2c;
                case 74: goto L2c;
                default: goto L2c;
            }
        L2c:
            return r2
        L2d:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.j14.G(ru2):ru2");
    }

    public static csh H(xq9 xq9Var, List list) {
        z0b z0bVarP = h1b.p();
        for (int i2 = 0; i2 < list.size(); i2++) {
            Bundle bundle = (Bundle) list.get(i2);
            bundle.getClass();
            z0bVarP.c(xq9Var.apply(bundle));
        }
        return z0bVarP.g();
    }

    public static int J(int i2, int i3) {
        int i4 = i3 / 2;
        if (i2 < 0 || i2 >= 3 || i3 < 0 || i4 >= 19) {
            return -1;
        }
        int i5 = b[i2];
        if (i5 == 44100) {
            return ((i3 % 2) + f[i4]) << 1;
        }
        int i6 = e[i4];
        return i5 == 32000 ? i6 * 6 : i6 << 2;
    }

    public static ColorStateList K(Context context, ghf ghfVar, int i2) {
        int resourceId;
        ColorStateList colorStateListV;
        TypedArray typedArray = (TypedArray) ghfVar.c;
        return (!typedArray.hasValue(i2) || (resourceId = typedArray.getResourceId(i2, 0)) == 0 || (colorStateListV = nb6.v(resourceId, context)) == null) ? ghfVar.s(i2) : colorStateListV;
    }

    public static ColorStateList L(Context context, TypedArray typedArray, int i2) {
        int resourceId;
        ColorStateList colorStateListV;
        return (!typedArray.hasValue(i2) || (resourceId = typedArray.getResourceId(i2, 0)) == 0 || (colorStateListV = nb6.v(resourceId, context)) == null) ? typedArray.getColorStateList(i2) : colorStateListV;
    }

    public static int M(Context context, TypedArray typedArray, int i2, int i3) {
        TypedValue typedValue = new TypedValue();
        if (!typedArray.getValue(i2, typedValue) || typedValue.type != 2) {
            return typedArray.getDimensionPixelSize(i2, i3);
        }
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{typedValue.data});
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, i3);
        typedArrayObtainStyledAttributes.recycle();
        return dimensionPixelSize;
    }

    public static Drawable N(Context context, TypedArray typedArray, int i2) {
        int resourceId;
        Drawable drawableF;
        return (!typedArray.hasValue(i2) || (resourceId = typedArray.getResourceId(i2, 0)) == 0 || (drawableF = sgb.F(resourceId, context)) == null) ? typedArray.getDrawable(i2) : drawableF;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int O(byte[] r7) {
        /*
            r0 = 0
            r1 = r7[r0]
            r2 = -2
            r3 = 7
            r4 = 6
            r5 = 1
            r6 = 4
            if (r1 == r2) goto L50
            r2 = -1
            if (r1 == r2) goto L3f
            r2 = 31
            if (r1 == r2) goto L26
            r1 = 5
            r1 = r7[r1]
            r1 = r1 & 3
            int r1 = r1 << 12
            r2 = r7[r4]
            r2 = r2 & 255(0xff, float:3.57E-43)
            int r2 = r2 << r6
            r1 = r1 | r2
            r7 = r7[r3]
        L20:
            r7 = r7 & 240(0xf0, float:3.36E-43)
            int r7 = r7 >> r6
            r1 = r1 | r7
            int r1 = r1 + r5
            goto L5f
        L26:
            r0 = r7[r4]
            r0 = r0 & 3
            int r0 = r0 << 12
            r1 = r7[r3]
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r1 = r1 << r6
            r0 = r0 | r1
            r1 = 8
            r7 = r7[r1]
        L36:
            r7 = r7 & 60
            int r7 = r7 >> 2
            r0 = r0 | r7
            int r1 = r0 + 1
            r0 = r5
            goto L5f
        L3f:
            r0 = r7[r3]
            r0 = r0 & 3
            int r0 = r0 << 12
            r1 = r7[r4]
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r1 = r1 << r6
            r0 = r0 | r1
            r1 = 9
            r7 = r7[r1]
            goto L36
        L50:
            r1 = r7[r6]
            r1 = r1 & 3
            int r1 = r1 << 12
            r2 = r7[r3]
            r2 = r2 & 255(0xff, float:3.57E-43)
            int r2 = r2 << r6
            r1 = r1 | r2
            r7 = r7[r4]
            goto L20
        L5f:
            if (r0 == 0) goto L64
            int r1 = r1 << r6
            int r1 = r1 / 14
        L64:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.j14.O(byte[]):int");
    }

    public static int P(int i2) {
        if (i2 == 2147385345 || i2 == -25230976 || i2 == 536864768 || i2 == -14745368) {
            return 1;
        }
        if (i2 == 1683496997 || i2 == 622876772) {
            return 2;
        }
        if (i2 == 1078008818 || i2 == -233094848) {
            return 3;
        }
        return (i2 == 1908687592 || i2 == -398277519) ? 4 : 0;
    }

    public static final Object R(pfd pfdVar) {
        Object objP = pfdVar.p();
        v2c v2cVar = objP instanceof v2c ? (v2c) objP : null;
        if (v2cVar != null) {
            return v2cVar.o;
        }
        return null;
    }

    public static bq4 S(byte[] bArr) {
        byte[] bArr2;
        byte b2 = bArr[0];
        if (b2 == Byte.MAX_VALUE || b2 == 100 || b2 == 64 || b2 == 113) {
            return new bq4(bArr, bArr.length);
        }
        byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
        byte b3 = bArrCopyOf[0];
        if (b3 == -2 || b3 == -1 || b3 == 37 || b3 == -14 || b3 == -24) {
            for (int i2 = 0; i2 < bArrCopyOf.length - 1; i2 += 2) {
                byte b4 = bArrCopyOf[i2];
                int i3 = i2 + 1;
                bArrCopyOf[i2] = bArrCopyOf[i3];
                bArrCopyOf[i3] = b4;
            }
        }
        bq4 bq4Var = new bq4(bArrCopyOf, bArrCopyOf.length);
        if (bArrCopyOf[0] == 31) {
            bq4 bq4Var2 = new bq4(bArrCopyOf, bArrCopyOf.length);
            while (bq4Var2.b() >= 16) {
                bq4Var2.t(2);
                int i4 = bq4Var2.i(14) & 16383;
                int iMin = Math.min(8 - bq4Var.d, 14);
                int i5 = bq4Var.d;
                int i6 = (8 - i5) - iMin;
                int i7 = (65280 >> i5) | ((1 << i6) - 1);
                byte[] bArr3 = bq4Var.b;
                int i8 = bq4Var.c;
                byte b5 = (byte) (bArr3[i8] & i7);
                bArr3[i8] = b5;
                int i9 = 14 - iMin;
                bArr3[i8] = (byte) (b5 | ((i4 >>> i9) << i6));
                int i10 = i8 + 1;
                while (true) {
                    bArr2 = bq4Var.b;
                    if (i9 > 8) {
                        bArr2[i10] = (byte) (i4 >>> (i9 - 8));
                        i9 -= 8;
                        i10++;
                    }
                }
                int i11 = 8 - i9;
                byte b6 = (byte) (bArr2[i10] & ((1 << i11) - 1));
                bArr2[i10] = b6;
                bArr2[i10] = (byte) (b6 | ((i4 & ((1 << i9) - 1)) << i11));
                bq4Var.t(14);
                bq4Var.a();
            }
        }
        bq4Var.p(bArrCopyOf, bArrCopyOf.length);
        return bq4Var;
    }

    public static Object T(Bundle bundle, String str, Class cls) {
        if (Build.VERSION.SDK_INT >= 34) {
            return t8.u(bundle, str, cls);
        }
        Parcelable parcelable = bundle.getParcelable(str);
        if (cls.isInstance(parcelable)) {
            return parcelable;
        }
        return null;
    }

    public static Parcelable[] U(Bundle bundle, String str) {
        return Build.VERSION.SDK_INT >= 34 ? (Parcelable[]) t8.v(bundle, str) : bundle.getParcelableArray(str);
    }

    public static ArrayList V(MaterialToolbar materialToolbar, CharSequence charSequence) {
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < materialToolbar.getChildCount(); i2++) {
            View childAt = materialToolbar.getChildAt(i2);
            if (childAt instanceof TextView) {
                TextView textView = (TextView) childAt;
                if (TextUtils.equals(textView.getText(), charSequence)) {
                    arrayList.add(textView);
                }
            }
        }
        return arrayList;
    }

    public static int[] W(Collection collection) {
        int[] iArr = new int[collection.size()];
        Iterator it = collection.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            iArr[i2] = ((Integer) it.next()).intValue();
            i2++;
        }
        return iArr;
    }

    public static boolean X(Context context) {
        return context.getResources().getConfiguration().fontScale >= 1.3f;
    }

    public static final d3k Y(f99 f99Var, nx5 nx5Var) {
        return na2.B(nx5Var, null, null, new yf((byte) 22, null, f99Var), 3);
    }

    public static final c8e Z(c8e c8eVar, String str) {
        return c8eVar.d(new u2c(str));
    }

    public static final void a(fm4 fm4Var, c8e c8eVar, ih5 ih5Var, int i2) {
        vt9 vt9Var;
        c8e c8eVar2;
        String str;
        int i3;
        zpa zpaVar;
        fm4 fm4Var2 = fm4Var;
        vt9 vt9Var2 = (vt9) ih5Var;
        vt9Var2.Y(-2077027779);
        int i4 = (vt9Var2.f(fm4Var2) ? 4 : 2) | i2 | 48;
        if (vt9Var2.N(i4 & 1, (i4 & 19) != 18)) {
            afe afeVarH = dyg.h(((mm4) fm4Var2).j, vt9Var2);
            mm4 mm4Var = (mm4) fm4Var2;
            afe afeVarH2 = dyg.h(mm4Var.m, vt9Var2);
            afe afeVarH3 = dyg.h(mm4Var.z, vt9Var2);
            afe afeVarH4 = dyg.h(mm4Var.o, vt9Var2);
            afe afeVarH5 = dyg.h(mm4Var.w, vt9Var2);
            afe afeVarH6 = dyg.h(mm4Var.t, vt9Var2);
            afe afeVarH7 = dyg.h(mm4Var.r, vt9Var2);
            hdg hdgVar = mm4Var.k;
            hn4 hn4Var = (hn4) afeVarH.getValue();
            String str2 = (String) afeVarH2.getValue();
            String str3 = (String) afeVarH3.getValue();
            o01 o01Var = (o01) afeVarH4.getValue();
            n01 n01Var = (n01) afeVarH5.getValue();
            em4 em4Var = (em4) afeVarH6.getValue();
            String str4 = mm4Var.A;
            g1b g1bVar = (g1b) afeVarH7.getValue();
            int i5 = i4 & 14;
            boolean z = i5 == 4;
            Object objK = vt9Var2.K();
            zpa zpaVar2 = hh5.a;
            if (z || objK == zpaVar2) {
                str = str4;
                i3 = i5;
                zpaVar = zpaVar2;
                r2 r2Var = new r2(1, fm4Var2, fm4.class, "onAmountChange", "onAmountChange(Ljava/lang/String;)V", 0, (byte) 19);
                vt9Var2.g0(r2Var);
                objK = r2Var;
            } else {
                i3 = i5;
                str = str4;
                zpaVar = zpaVar2;
            }
            Function1 function1 = (mtb) objK;
            boolean z2 = i3 == 4;
            Object objK2 = vt9Var2.K();
            if (z2 || objK2 == zpaVar) {
                q2 q2Var = new q2(0, fm4Var, fm4.class, "onBack", "onBack()V", 0, (byte) 16);
                vt9Var2.g0(q2Var);
                objK2 = q2Var;
            }
            Function0 function0 = (mtb) objK2;
            boolean z3 = i3 == 4;
            Object objK3 = vt9Var2.K();
            if (z3 || objK3 == zpaVar) {
                q2 q2Var2 = new q2(0, fm4Var, fm4.class, "onNext", "onNext()V", 0, (byte) 17);
                vt9Var2.g0(q2Var2);
                objK3 = q2Var2;
            }
            Function0 function02 = (mtb) objK3;
            boolean z4 = i3 == 4;
            Object objK4 = vt9Var2.K();
            if (z4 || objK4 == zpaVar) {
                q2 q2Var3 = new q2(0, fm4Var, fm4.class, "onConfirmCashOut", "onConfirmCashOut()V", 0, (byte) 18);
                vt9Var2.g0(q2Var3);
                objK4 = q2Var3;
            }
            Function0 function03 = (mtb) objK4;
            boolean z5 = i3 == 4;
            Object objK5 = vt9Var2.K();
            if (z5 || objK5 == zpaVar) {
                q2 q2Var4 = new q2(0, fm4Var, fm4.class, "onBottomSheetDismissed", "onBottomSheetDismissed()V", 0, (byte) 19);
                vt9Var2.g0(q2Var4);
                objK5 = q2Var4;
            }
            Function0 function04 = (mtb) objK5;
            boolean z6 = i3 == 4;
            Object objK6 = vt9Var2.K();
            if (z6 || objK6 == zpaVar) {
                q2 q2Var5 = new q2(0, fm4Var, fm4.class, "onGetMiniPayClick", "onGetMiniPayClick()V", 0, (byte) 20);
                vt9Var2.g0(q2Var5);
                objK6 = q2Var5;
            }
            Function0 function05 = (mtb) objK6;
            boolean z7 = i3 == 4;
            Object objK7 = vt9Var2.K();
            if (z7 || objK7 == zpaVar) {
                fm4Var2 = fm4Var;
                objK7 = new r2(1, fm4Var2, fm4.class, "onCurrencyPicked", "onCurrencyPicked(Lcom/opera/momi/clientsdk/Amount$Currency;)V", 0, (byte) 20);
                vt9Var2.g0(objK7);
            } else {
                fm4Var2 = fm4Var;
            }
            z7e z7eVar = z7e.b;
            vt9Var = vt9Var2;
            b(hdgVar, hn4Var, str2, str3, o01Var, n01Var, em4Var, str, g1bVar, function1, function0, function02, function03, function04, function05, (mtb) objK7, z7eVar, vt9Var, 0, 1572864, 0);
            c8eVar2 = z7eVar;
        } else {
            vt9Var = vt9Var2;
            vt9Var.Q();
            c8eVar2 = c8eVar;
        }
        znh znhVarR = vt9Var.r();
        if (znhVarR != null) {
            znhVarR.d = new fx0(fm4Var2, c8eVar2, i2, (byte) 12);
        }
    }

    public static final void a0(int i2, Activity activity, iz9 iz9Var) {
        if (i2 == 1) {
            activity.startActivity(mdb.b(activity).setAction("com.opera.android.settings.AUTOFILL_ADDRESS_SETTING"));
            return;
        }
        if (i2 == 3) {
            activity.startActivity(mdb.b(activity).setAction("com.opera.android.settings.AUTOFILL_CARD_SETTING"));
            return;
        }
        if (i2 != 5) {
            return;
        }
        if (iz9Var == null) {
            activity.startActivity(mdb.b(activity).setAction("com.opera.android.settings.PASSWORD_SETTING"));
        } else {
            int i3 = AutofillPasswordPickerActivity.o;
            activity.startActivity(new Intent(activity, (Class<?>) AutofillPasswordPickerActivity.class).setAction("AutofillIntent.Action.FILL_IN_BROWSER").putExtra("AutofillIntent.EXTRA_FRAME_CHILD_ID", iz9Var.a).putExtra("AutofillIntent.EXTRA_FRAME_ROUTING_ID", iz9Var.b));
        }
    }

    public static final void b(final hdg hdgVar, final hn4 hn4Var, final String str, final String str2, final o01 o01Var, final n01 n01Var, final em4 em4Var, final String str3, final g1b g1bVar, final Function1 function1, final Function0 function0, final Function0 function02, final Function0 function03, final Function0 function04, final Function0 function05, final Function1 function12, c8e c8eVar, ih5 ih5Var, final int i2, final int i3, final int i4) {
        int i5;
        final String str4;
        String str5;
        int i6;
        String str6;
        int i7;
        vt9 vt9Var;
        final c8e c8eVar2;
        vt9 vt9Var2 = (vt9) ih5Var;
        vt9Var2.Y(804564023);
        if ((i2 & 6) == 0) {
            i5 = (vt9Var2.f(hdgVar) ? 4 : 2) | i2;
        } else {
            i5 = i2;
        }
        if ((i2 & 48) == 0) {
            i5 |= (i2 & 64) == 0 ? vt9Var2.f(hn4Var) : vt9Var2.h(hn4Var) ? 32 : 16;
        }
        int i8 = i2 & 384;
        int i9 = NotificationCompat.FLAG_LOCAL_ONLY;
        if (i8 == 0) {
            str4 = str;
            i5 |= vt9Var2.f(str4) ? 256 : NotificationCompat.FLAG_HIGH_PRIORITY;
        } else {
            str4 = str;
        }
        if ((i2 & 3072) == 0) {
            str5 = str2;
            i5 |= vt9Var2.f(str5) ? 2048 : 1024;
        } else {
            str5 = str2;
        }
        if ((i2 & 24576) == 0) {
            i5 |= (32768 & i2) == 0 ? vt9Var2.f(o01Var) : vt9Var2.h(o01Var) ? 16384 : 8192;
        }
        if ((i2 & 196608) == 0) {
            i5 |= (i2 & 262144) == 0 ? vt9Var2.f(n01Var) : vt9Var2.h(n01Var) ? 131072 : 65536;
        }
        if ((i2 & 1572864) == 0) {
            i5 |= vt9Var2.f(em4Var) ? 1048576 : 524288;
        }
        if ((i2 & 12582912) == 0) {
            i6 = 196608;
            str6 = str3;
            i5 |= vt9Var2.f(str6) ? 8388608 : 4194304;
        } else {
            i6 = 196608;
            str6 = str3;
        }
        if ((i2 & 100663296) == 0) {
            i5 |= vt9Var2.f(g1bVar) ? 67108864 : 33554432;
        }
        if ((i2 & 805306368) == 0) {
            i5 |= vt9Var2.h(function1) ? 536870912 : 268435456;
        }
        if ((i3 & 6) == 0) {
            i7 = i3 | (vt9Var2.h(function0) ? 4 : 2);
        } else {
            i7 = i3;
        }
        if ((i3 & 48) == 0) {
            i7 |= vt9Var2.h(function02) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            if (!vt9Var2.h(function03)) {
                i9 = NotificationCompat.FLAG_HIGH_PRIORITY;
            }
            i7 |= i9;
        }
        if ((i3 & 3072) == 0) {
            i7 |= vt9Var2.h(function04) ? 2048 : 1024;
        }
        if ((i3 & 24576) == 0) {
            i7 |= vt9Var2.h(function05) ? 16384 : 8192;
        }
        if ((i3 & i6) == 0) {
            i7 |= vt9Var2.h(function12) ? 131072 : 65536;
        }
        int i10 = i4 & 65536;
        if (i10 != 0) {
            i7 |= 1572864;
        } else if ((i3 & 1572864) == 0) {
            i7 |= vt9Var2.f(c8eVar) ? 1048576 : 524288;
        }
        int i11 = i7;
        byte b2 = 1;
        if (vt9Var2.N(i5 & 1, ((i5 & 306783379) == 306783378 && (i11 & 599187) == 599186) ? false : true)) {
            c8e c8eVar3 = i10 != 0 ? z7e.b : c8eVar;
            final String str7 = str6;
            vt9Var = vt9Var2;
            final String str8 = str5;
            w1h.a(c8eVar3, gyg.P(-92114189, new is1(function0, b2), vt9Var2), null, null, null, 0, 0L, 0L, null, gyg.P(1940789704, new cr9() { // from class: sm4
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    xvf xvfVar = (xvf) obj;
                    ih5 ih5Var2 = (ih5) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    if ((iIntValue & 6) == 0) {
                        iIntValue |= ((vt9) ih5Var2).f(xvfVar) ? 4 : 2;
                    }
                    vt9 vt9Var3 = (vt9) ih5Var2;
                    if (vt9Var3.N(iIntValue & 1, (iIntValue & 19) != 18)) {
                        Object objK = vt9Var3.K();
                        if (objK == hh5.a) {
                            objK = new mr3((byte) 14);
                            vt9Var3.g0(objK);
                        }
                        p37.b(hn4Var, null, null, null, null, (Function1) objK, gyg.P(407552587, new um4(xvfVar, g1bVar, function12, hdgVar, str7, function02, function05, str4, str8, o01Var, n01Var, function1), vt9Var3), vt9Var3, 1769472);
                    } else {
                        vt9Var3.Q();
                    }
                    return Unit.a;
                }
            }, vt9Var), vt9Var, ((i11 >> 18) & 14) | 805306416, 508);
            c8e c8eVar4 = c8eVar3;
            if (em4Var != null) {
                vt9Var.W(-1443111971);
                i7e.a(function04, null, i7e.f(null, vt9Var, 0, 3), 0.0f, false, null, 0L, 0L, 0L, null, null, null, gyg.P(-887983266, new aek(em4Var, str3, function04, function03, function05, (byte) 1), vt9Var), vt9Var, (i11 >> 9) & 14, 7162);
                vt9Var.p(false);
            } else {
                vt9Var.W(-1442606485);
                vt9Var.p(false);
            }
            c8eVar2 = c8eVar4;
        } else {
            vt9Var = vt9Var2;
            vt9Var.Q();
            c8eVar2 = c8eVar;
        }
        znh znhVarR = vt9Var.r();
        if (znhVarR != null) {
            znhVarR.d = new Function2() { // from class: tm4
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iM = aoh.m(i2 | 1);
                    int iM2 = aoh.m(i3);
                    j14.b(hdgVar, hn4Var, str, str2, o01Var, n01Var, em4Var, str3, g1bVar, function1, function0, function02, function03, function04, function05, function12, c8eVar2, (ih5) obj, iM, iM2, i4);
                    return Unit.a;
                }
            };
        }
    }

    public static final lxh b0(ChromiumContent chromiumContent, int i2) {
        Context context;
        xr5 xr5Var = chromiumContent.J;
        if (xr5Var != null && (context = xr5Var.getContext()) != null) {
            int iV = y9m.V(i2, context);
            Integer numValueOf = Integer.valueOf(iV);
            if (iV == 0) {
                numValueOf = null;
            }
            if (numValueOf != null) {
                return new lxh(numValueOf.intValue());
            }
        }
        return null;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: oye */
    /* JADX WARN: Removed duplicated region for block: B:102:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x026c  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0280  */
    /* JADX WARN: Removed duplicated region for block: B:174:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0115  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void c(defpackage.c8e r23, dif r24, final java.lang.String r25, final defpackage.ue5 r26, final defpackage.ue5 r27, final defpackage.ue5 r28, long r29, int r31, int r32, boolean r33, defpackage.ih5 r34, final int r35, final int r36) throws oye {
        /*
            Method dump skipped, instructions count: 652
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.j14.c(c8e, dif, java.lang.String, ue5, ue5, ue5, long, int, int, boolean, ih5, int, int):void");
    }

    public static void c0(int[] iArr, int[] iArr2, int[] iArr3) {
        int[] iArr4 = new int[14];
        wxe.O(iArr, iArr2, iArr4);
        g0(iArr4, iArr3);
    }

    public static final void d(c8e c8eVar, ue5 ue5Var, ue5 ue5Var2, ue5 ue5Var3, ue5 ue5Var4, ih5 ih5Var, int i2) {
        int i3;
        ue5 ue5Var5;
        ue5 ue5Var6;
        boolean zE;
        boolean z;
        boolean z2;
        td3 td3Var = rbe.b;
        vt9 vt9Var = (vt9) ih5Var;
        vt9Var.Y(1286227800);
        if ((i2 & 6) == 0) {
            i3 = (vt9Var.f(c8eVar) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= vt9Var.h(ue5Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= vt9Var.h(ue5Var2) ? NotificationCompat.FLAG_LOCAL_ONLY : NotificationCompat.FLAG_HIGH_PRIORITY;
        }
        if ((i2 & 3072) == 0) {
            i3 |= vt9Var.h(ue5Var3) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= vt9Var.h(ue5Var4) ? 16384 : 8192;
        }
        if (vt9Var.N(i3 & 1, (i3 & 9363) != 9362)) {
            if (ue5Var == null && ue5Var2 == null) {
                vt9Var.W(-1685487928);
                vt9Var.p(false);
                zE = false;
            } else {
                vt9Var.W(-885654611);
                zE = qbe.E(vt9Var);
                vt9Var.p(false);
            }
            rd3 rd3Var = rbe.n;
            db5 db5VarA = cb5.a(b72.c, rd3Var, vt9Var, 0);
            boolean z3 = zE;
            int iHashCode = Long.hashCode(vt9Var.T);
            oag oagVarL = vt9Var.l();
            c8e c8eVarP = qyn.P(vt9Var, c8eVar);
            bh5.To.getClass();
            vt9Var.a0();
            boolean z4 = vt9Var.S;
            fza fzaVar = m3c.S;
            if (z4) {
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
            if (z3) {
                vt9Var.W(1062802026);
                if (ue5Var == null) {
                    vt9Var.W(-1412875561);
                    vt9Var.p(false);
                    z2 = false;
                } else {
                    z2 = false;
                    vt9Var.W(1062802026);
                    o18.r((i3 >> 3) & 14, ue5Var, vt9Var, false);
                }
                vt9Var.p(z2);
            } else {
                vt9Var.W(-1412857952);
                vt9Var.p(false);
            }
            float f2 = gkf.c;
            float f3 = gkf.d;
            z7e z7eVar = z7e.b;
            c8e c8eVarB0 = a26.b0(z7eVar, 0.0f, f2, 0.0f, f3, 5);
            int i4 = i3;
            db5 db5VarA2 = cb5.a(new x62(gkf.h, true, new t40((byte) 19)), rd3Var, vt9Var, 0);
            int iHashCode2 = Long.hashCode(vt9Var.T);
            oag oagVarL2 = vt9Var.l();
            c8e c8eVarP2 = qyn.P(vt9Var, c8eVarB0);
            vt9Var.a0();
            if (vt9Var.S) {
                vt9Var.k(fzaVar);
            } else {
                vt9Var.j0();
            }
            y4h.o(vt9Var, db5VarA2, ah5Var);
            y4h.o(vt9Var, oagVarL2, ah5Var2);
            u35.j(iHashCode2, vt9Var, ah5Var3, vt9Var);
            y4h.o(vt9Var, c8eVarP2, ah5Var4);
            g4c g4cVar = new g4c(1.0f, false);
            db5 db5VarA3 = cb5.a(new x62(gkf.g, true, new t40((byte) 19)), rd3Var, vt9Var, 0);
            int iHashCode3 = Long.hashCode(vt9Var.T);
            oag oagVarL3 = vt9Var.l();
            c8e c8eVarP3 = qyn.P(vt9Var, g4cVar);
            vt9Var.a0();
            if (vt9Var.S) {
                vt9Var.k(fzaVar);
            } else {
                vt9Var.j0();
            }
            y4h.o(vt9Var, db5VarA3, ah5Var);
            y4h.o(vt9Var, oagVarL3, ah5Var2);
            u35.j(iHashCode3, vt9Var, ah5Var3, vt9Var);
            y4h.o(vt9Var, c8eVarP3, ah5Var4);
            if (z3) {
                vt9Var.W(860271950);
                if (ue5Var2 == null) {
                    vt9Var.W(898626675);
                    vt9Var.p(false);
                    z = false;
                } else {
                    vt9Var.W(898626676);
                    c8e c8eVarD = a26.Z(z7eVar, f2, 0.0f, 2).d(new kga(rbe.o));
                    tfd tfdVarC = nr3.c(td3Var, false);
                    int iHashCode4 = Long.hashCode(vt9Var.T);
                    oag oagVarL4 = vt9Var.l();
                    c8e c8eVarP4 = qyn.P(vt9Var, c8eVarD);
                    vt9Var.a0();
                    if (vt9Var.S) {
                        vt9Var.k(fzaVar);
                    } else {
                        vt9Var.j0();
                    }
                    y4h.o(vt9Var, tfdVarC, ah5Var);
                    y4h.o(vt9Var, oagVarL4, ah5Var2);
                    u35.j(iHashCode4, vt9Var, ah5Var3, vt9Var);
                    y4h.o(vt9Var, c8eVarP4, ah5Var4);
                    ue5Var2.invoke(vt9Var, Integer.valueOf((i4 >> 6) & 14));
                    vt9Var.p(true);
                    z = false;
                    vt9Var.p(false);
                }
                vt9Var.p(z);
            } else {
                z = false;
                vt9Var.W(898975116);
                vt9Var.p(false);
            }
            if (ue5Var3 == null) {
                vt9Var.W(899007665);
                vt9Var.p(z);
                ue5Var6 = ue5Var3;
            } else {
                vt9Var.W(899007666);
                ue5Var6 = ue5Var3;
                o18.r((i4 >> 9) & 14, ue5Var6, vt9Var, z);
            }
            boolean z5 = true;
            vt9Var.p(true);
            if (ue5Var4 == null) {
                vt9Var.W(-1066123973);
                vt9Var.p(z);
                ue5Var5 = ue5Var4;
            } else {
                vt9Var.W(-1066123972);
                c8e c8eVarD2 = a26.Z(z7eVar, f2, 0.0f, 2).d(mpj.a);
                tfd tfdVarC2 = nr3.c(td3Var, true);
                int iHashCode5 = Long.hashCode(vt9Var.T);
                oag oagVarL5 = vt9Var.l();
                c8e c8eVarP5 = qyn.P(vt9Var, c8eVarD2);
                vt9Var.a0();
                if (vt9Var.S) {
                    vt9Var.k(fzaVar);
                } else {
                    vt9Var.j0();
                }
                y4h.o(vt9Var, tfdVarC2, ah5Var);
                y4h.o(vt9Var, oagVarL5, ah5Var2);
                u35.j(iHashCode5, vt9Var, ah5Var3, vt9Var);
                y4h.o(vt9Var, c8eVarP5, ah5Var4);
                ue5Var5 = ue5Var4;
                ue5Var5.invoke(vt9Var, Integer.valueOf((i4 >> 12) & 14));
                z5 = true;
                vt9Var.p(true);
                vt9Var.p(false);
            }
            vt9Var.p(z5);
            vt9Var.p(z5);
        } else {
            ue5Var5 = ue5Var4;
            ue5Var6 = ue5Var3;
            vt9Var.Q();
        }
        znh znhVarR = vt9Var.r();
        if (znhVarR != null) {
            znhVarR.d = new lc1(c8eVar, ue5Var, ue5Var2, ue5Var6, ue5Var5, i2);
        }
    }

    public static int d0(bq4 bq4Var, int[] iArr) {
        int i2 = 0;
        for (int i3 = 0; i3 < 3 && bq4Var.h(); i3++) {
            i2++;
        }
        int i4 = 0;
        for (int i5 = 0; i5 < i2; i5++) {
            i4 += 1 << iArr[i5];
        }
        return bq4Var.i(iArr[i2]) + i4;
    }

    public static final void e(c8e c8eVar, String str, ue5 ue5Var, long j2, int i2, int i3, ih5 ih5Var, int i4) {
        vt9 vt9Var;
        ue5 ue5Var2;
        c8e c8eVar2;
        c8e c8eVar3;
        c8e c8eVar4;
        Function0 function0;
        Function2 function2;
        Function2 function22;
        Function2 function23;
        ah5 ah5Var;
        boolean z;
        boolean z2;
        vt9 vt9Var2 = (vt9) ih5Var;
        vt9Var2.Y(-1661884450);
        int i5 = i4 | 6 | (vt9Var2.f(str) ? 32 : 16) | (vt9Var2.h(ue5Var) ? NotificationCompat.FLAG_LOCAL_ONLY : NotificationCompat.FLAG_HIGH_PRIORITY) | (vt9Var2.e(j2) ? 2048 : 1024) | (vt9Var2.d(i2) ? 16384 : 8192) | (vt9Var2.d(i3) ? 131072 : 65536);
        if (vt9Var2.N(i5 & 1, (i5 & 74899) != 74898)) {
            vt9Var2.S();
            int i6 = i4 & 1;
            z7e z7eVar = z7e.b;
            if (i6 == 0 || vt9Var2.x()) {
                c8eVar3 = z7eVar;
            } else {
                vt9Var2.Q();
                c8eVar3 = c8eVar;
            }
            vt9Var2.q();
            db5 db5VarA = cb5.a(new x62(gkf.f, true, new t40((byte) 19)), rbe.n, vt9Var2, 0);
            int iHashCode = Long.hashCode(vt9Var2.T);
            oag oagVarL = vt9Var2.l();
            c8e c8eVarP = qyn.P(vt9Var2, c8eVar3);
            bh5.To.getClass();
            vt9Var2.a0();
            boolean z3 = vt9Var2.S;
            c8e c8eVar5 = c8eVar3;
            Function0 function02 = m3c.S;
            if (z3) {
                vt9Var2.k(function02);
            } else {
                vt9Var2.j0();
            }
            Function2 function24 = ujp.f;
            y4h.o(vt9Var2, db5VarA, function24);
            Function2 function25 = ujp.e;
            y4h.o(vt9Var2, oagVarL, function25);
            Integer numValueOf = Integer.valueOf(iHashCode);
            ah5 ah5Var2 = ujp.g;
            y4h.o(vt9Var2, numValueOf, ah5Var2);
            y4h.m(vt9Var2);
            Function2 function26 = ujp.d;
            y4h.o(vt9Var2, c8eVarP, function26);
            if (str == null) {
                vt9Var2.W(-1763268415);
                vt9Var2.p(false);
                vt9Var = vt9Var2;
                function0 = function02;
                function22 = function25;
                function23 = function26;
                ah5Var = ah5Var2;
                function2 = function24;
                c8eVar4 = c8eVar5;
                ue5Var2 = ue5Var;
                z = false;
            } else {
                vt9Var2.W(-1763268414);
                c8e c8eVarD = a26.Z(z7eVar, gkf.c, 0.0f, 2).d(mpj.a);
                unf unfVar = pof.a;
                int i7 = i5 >> 3;
                c8eVar4 = c8eVar5;
                function0 = function02;
                function2 = function24;
                function22 = function25;
                function23 = function26;
                ah5Var = ah5Var2;
                ijl.b(str, c8eVarD, j2, 0L, null, 0L, null, new pel(i2), 0L, 2, false, i3, 0, pof.b(vt9Var2).f, vt9Var2, i7 & 910, ((i5 >> 12) & 14) | 384 | (i7 & 57344), 109560);
                vt9Var = vt9Var2;
                z = false;
                vt9Var.p(false);
                ue5Var2 = ue5Var;
            }
            if (ue5Var2 == null) {
                vt9Var.W(-1762805740);
                vt9Var.p(z);
                z2 = true;
            } else {
                vt9Var.W(-1762805739);
                i39 i39Var = mpj.a;
                z2 = true;
                tfd tfdVarC = nr3.c(rbe.b, true);
                int iHashCode2 = Long.hashCode(vt9Var.T);
                oag oagVarL2 = vt9Var.l();
                c8e c8eVarP2 = qyn.P(vt9Var, i39Var);
                vt9Var.a0();
                if (vt9Var.S) {
                    vt9Var.k(function0);
                } else {
                    vt9Var.j0();
                }
                y4h.o(vt9Var, tfdVarC, function2);
                y4h.o(vt9Var, oagVarL2, function22);
                u35.j(iHashCode2, vt9Var, ah5Var, vt9Var);
                y4h.o(vt9Var, c8eVarP2, function23);
                ue5Var2.invoke(vt9Var, Integer.valueOf((i5 >> 6) & 14));
                vt9Var.p(true);
                vt9Var.p(z);
            }
            vt9Var.p(z2);
            c8eVar2 = c8eVar4;
        } else {
            vt9Var = vt9Var2;
            ue5Var2 = ue5Var;
            vt9Var.Q();
            c8eVar2 = c8eVar;
        }
        znh znhVarR = vt9Var.r();
        if (znhVarR != null) {
            znhVarR.d = new uta(c8eVar2, str, ue5Var2, j2, i2, i3, i4);
        }
    }

    public static final int e0(int i2) {
        int[] iArr = {-1, -16777216, -65536, -16711936, -256, -16776961};
        int i3 = iArr[0];
        double d2 = -1.0d;
        for (int i4 = 0; i4 < 6; i4++) {
            int i5 = iArr[i4];
            double dE = ab5.e(i5, i2);
            if (dE > d2) {
                i3 = i5;
                d2 = dE;
            }
        }
        return i3;
    }

    public static final void f(c8e c8eVar, ue5 ue5Var, ih5 ih5Var, int i2) {
        int i3;
        vt9 vt9Var = (vt9) ih5Var;
        vt9Var.Y(2064964257);
        if ((i2 & 6) == 0) {
            i3 = (vt9Var.f(c8eVar) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= vt9Var.h(ue5Var) ? 32 : 16;
        }
        byte b2 = 0;
        if (vt9Var.N(i3 & 1, (i3 & 19) != 18)) {
            g(c8eVar, ue5Var, vt9Var, (i3 & 14) | 48 | ((i3 << 3) & 896));
        } else {
            vt9Var.Q();
        }
        znh znhVarR = vt9Var.r();
        if (znhVarR != null) {
            znhVarR.d = new fb1(c8eVar, ue5Var, i2, b2);
        }
    }

    public static final eb1 f0(Function0 function0, ih5 ih5Var, int i2) {
        vt9 vt9Var = (vt9) ih5Var;
        View view = (View) vt9Var.j(j41.f);
        boolean zF = vt9Var.f(view);
        Object objK = vt9Var.K();
        zpa zpaVar = hh5.a;
        if (zF || objK == zpaVar) {
            objK = new eb1(view, null, function0);
            vt9Var.g0(objK);
        }
        eb1 eb1Var = (eb1) objK;
        boolean zH = vt9Var.h(eb1Var);
        Object objK2 = vt9Var.K();
        if (zH || objK2 == zpaVar) {
            objK2 = new za1(eb1Var, (byte) 3);
            vt9Var.g0(objK2);
        }
        rm5.b(eb1Var, (Function1) objK2, vt9Var);
        return eb1Var;
    }

    public static final void g(c8e c8eVar, ue5 ue5Var, ih5 ih5Var, int i2) {
        int i3;
        vt9 vt9Var = (vt9) ih5Var;
        vt9Var.Y(771959668);
        if ((i2 & 6) == 0) {
            i3 = (vt9Var.f(c8eVar) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= vt9Var.h(null) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= vt9Var.h(ue5Var) ? NotificationCompat.FLAG_LOCAL_ONLY : NotificationCompat.FLAG_HIGH_PRIORITY;
        }
        byte b2 = 1;
        if (vt9Var.N(i3 & 1, (i3 & 147) != 146)) {
            Object objK = vt9Var.K();
            zpa zpaVar = hh5.a;
            if (objK == zpaVar) {
                t0g t0gVar = new t0g(null, qs7.g);
                vt9Var.g0(t0gVar);
                objK = t0gVar;
            }
            afe afeVar = (afe) objK;
            Object objK2 = vt9Var.K();
            if (objK2 == zpaVar) {
                objK2 = new ox0(afeVar, (byte) 3);
                vt9Var.g0(objK2);
            }
            kfo.c(vfl.b.a(f0((Function0) objK2, vt9Var, 0)), gyg.P(-291176396, new g9(c8eVar, afeVar, ue5Var, (byte) 2), vt9Var), vt9Var, 56);
        } else {
            vt9Var.Q();
        }
        znh znhVarR = vt9Var.r();
        if (znhVarR != null) {
            znhVarR.d = new fb1(c8eVar, ue5Var, i2, b2);
        }
    }

    public static void g0(int[] iArr, int[] iArr2) {
        long j2 = iArr[7] & 4294967295L;
        long j3 = (6803 * j2) + (iArr[0] & 4294967295L);
        int i2 = (int) j3;
        iArr2[0] = i2;
        long j4 = iArr[8] & 4294967295L;
        long j5 = (6803 * j4) + j2 + (iArr[1] & 4294967295L) + (j3 >>> 32);
        int i3 = (int) j5;
        iArr2[1] = i3;
        long j6 = iArr[9] & 4294967295L;
        long j7 = (6803 * j6) + j4 + (iArr[2] & 4294967295L) + (j5 >>> 32);
        int i4 = (int) j7;
        iArr2[2] = i4;
        long j8 = iArr[10] & 4294967295L;
        long j9 = (6803 * j8) + j6 + (iArr[3] & 4294967295L) + (j7 >>> 32);
        int i5 = (int) j9;
        iArr2[3] = i5;
        long j10 = iArr[11] & 4294967295L;
        long j11 = (6803 * j10) + j8 + (iArr[4] & 4294967295L) + (j9 >>> 32);
        iArr2[4] = (int) j11;
        long j12 = iArr[12] & 4294967295L;
        long j13 = (6803 * j12) + j10 + (iArr[5] & 4294967295L) + (j11 >>> 32);
        iArr2[5] = (int) j13;
        long j14 = iArr[13] & 4294967295L;
        long j15 = (6803 * j14) + j12 + (iArr[6] & 4294967295L) + (j13 >>> 32);
        iArr2[6] = (int) j15;
        long j16 = (j15 >>> 32) + j14;
        long j17 = j16 & 4294967295L;
        long j18 = (6803 * j17) + (i2 & 4294967295L);
        iArr2[0] = (int) j18;
        long j19 = j16 >>> 32;
        long j20 = (6803 * j19) + j17 + (i3 & 4294967295L) + (j18 >>> 32);
        iArr2[1] = (int) j20;
        long j21 = j19 + (i4 & 4294967295L) + (j20 >>> 32);
        iArr2[2] = (int) j21;
        long j22 = (j21 >>> 32) + (i5 & 4294967295L);
        iArr2[3] = (int) j22;
        if (((j22 >>> 32) == 0 ? 0 : z5i.U(7, 4, iArr2)) != 0 || (iArr2[6] == -1 && wxe.E(iArr2, r))) {
            z5i.h(7, 6803, iArr2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:111:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00cd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void h(defpackage.c8e r31, dif r32, final java.lang.String r33, final java.lang.String r34, final defpackage.ue5 r35, final defpackage.ue5 r36, long r37, long r39, int r41, int r42, int r43, boolean r44, defpackage.ih5 r45, final int r46, final int r47) throws oye {
        /*
            Method dump skipped, instructions count: 507
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.j14.h(c8e, dif, java.lang.String, java.lang.String, ue5, ue5, long, long, int, int, int, boolean, ih5, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x003b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void h0(int r11, int[] r12) {
        /*
            r0 = 7
            if (r11 == 0) goto L3b
            long r1 = (long) r11
            r3 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r1 = r1 & r3
            r5 = 6803(0x1a93, double:3.361E-320)
            long r5 = r5 * r1
            r11 = 0
            r7 = r12[r11]
            long r7 = (long) r7
            long r7 = r7 & r3
            long r5 = r5 + r7
            int r7 = (int) r5
            r12[r11] = r7
            r7 = 32
            long r5 = r5 >>> r7
            r8 = 1
            r9 = r12[r8]
            long r9 = (long) r9
            long r9 = r9 & r3
            long r1 = r1 + r9
            long r1 = r1 + r5
            int r5 = (int) r1
            r12[r8] = r5
            long r1 = r1 >>> r7
            r5 = 2
            r6 = r12[r5]
            long r8 = (long) r6
            long r8 = r8 & r3
            long r1 = r1 + r8
            int r3 = (int) r1
            r12[r5] = r3
            long r1 = r1 >>> r7
            r3 = 0
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 == 0) goto L39
            r11 = 3
            int r11 = defpackage.z5i.U(r0, r11, r12)
        L39:
            if (r11 != 0) goto L49
        L3b:
            r11 = 6
            r11 = r12[r11]
            r1 = -1
            if (r11 != r1) goto L4e
            int[] r11 = defpackage.j14.r
            boolean r11 = defpackage.wxe.E(r12, r11)
            if (r11 == 0) goto L4e
        L49:
            r11 = 6803(0x1a93, float:9.533E-42)
            defpackage.z5i.h(r0, r11, r12)
        L4e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.j14.h0(int, int[]):void");
    }

    public static final void i(View view) {
        view.post(new ca(view, (byte) 0));
    }

    public static Drawable i0(int i2, Context context) {
        Drawable drawableF = sgb.F(i2, context);
        return drawableF != null ? drawableF : new ColorDrawable(-256);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0011, code lost:
    
        if (r3 <= r2) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final int j(int r2, int r3, int r4, boolean r5) {
        /*
            r0 = 0
            if (r3 < r4) goto L6
            if (r5 == 0) goto L15
            return r0
        L6:
            if (r5 != 0) goto Lb
            if (r3 > r2) goto Lf
            goto L13
        Lb:
            int r1 = r4 - r3
            if (r1 > r2) goto L1a
        Lf:
            if (r5 == 0) goto L17
            if (r3 > r2) goto L15
        L13:
            int r2 = r2 - r3
            return r2
        L15:
            int r4 = r4 - r3
            return r4
        L17:
            int r4 = r4 - r3
            if (r4 <= r2) goto L1b
        L1a:
            return r2
        L1b:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.j14.j(int, int, int, boolean):int");
    }

    public static void j0(int[] iArr, int[] iArr2) {
        int[] iArr3 = new int[14];
        wxe.Z(iArr, iArr3);
        g0(iArr3, iArr2);
    }

    public static void k(StringBuilder sb, String str, Map map) {
        if (map.isEmpty()) {
            sb.append(str.concat(": (None)\n"));
            return;
        }
        sb.append(str.concat("\n"));
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry entry : map.entrySet()) {
            Object key = entry.getKey();
            String name = key instanceof CameraCharacteristics.Key ? ((CameraCharacteristics.Key) key).getName() : key instanceof CaptureRequest.Key ? ((CaptureRequest.Key) key).getName() : key instanceof CaptureResult.Key ? ((CaptureResult.Key) key).getName() : String.valueOf(key);
            Object value = entry.getValue();
            arrayList.add(new Pair(name, value instanceof Object[] ? e82.x((Object[]) value, (String) null, "[", "]", new tb6((byte) 20), 25) : String.valueOf(value)));
        }
        for (Pair pair : CollectionsKt.c0(new yg9((byte) 26), arrayList)) {
            sb.append("  " + StringsKt.R((String) pair.a, 50, ' ') + ' ' + ((String) pair.b) + '\n');
        }
    }

    public static void k0(int[] iArr, int[] iArr2, int i2) {
        int[] iArr3 = new int[14];
        wxe.Z(iArr, iArr3);
        while (true) {
            g0(iArr3, iArr2);
            i2--;
            if (i2 <= 0) {
                return;
            } else {
                wxe.Z(iArr2, iArr3);
            }
        }
    }

    public static final void l(int i2, View view) {
        ViewParent parent = view.getParent();
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        Object background = viewGroup != null ? viewGroup.getBackground() : null;
        ColorDrawable colorDrawable = background instanceof ColorDrawable ? (ColorDrawable) background : null;
        int iE0 = e0(colorDrawable != null ? colorDrawable.getColor() : -1);
        int iR = (int) rm5.r(view.getContext(), i2);
        StateListDrawable stateListDrawable = new StateListDrawable();
        int[] iArr = {R.attr.state_focused};
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setCornerRadius(iR);
        gradientDrawable.setColor(0);
        gradientDrawable.setStroke((int) rm5.r(view.getContext(), 4.0f), iE0);
        stateListDrawable.addState(iArr, gradientDrawable);
        stateListDrawable.addState(new int[0], new ColorDrawable(0));
        view.setBackground(stateListDrawable);
    }

    public static boolean l0(byte[] bArr, byte[] bArr2) {
        if (bArr2 != null && bArr.length >= bArr2.length) {
            for (int i2 = 0; i2 < bArr2.length; i2++) {
                if (bArr[i2] == bArr2[i2]) {
                }
            }
            return true;
        }
        return false;
    }

    public static void m(View view) {
        ViewParent parent = view.getParent();
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        Object background = viewGroup != null ? viewGroup.getBackground() : null;
        ColorDrawable colorDrawable = background instanceof ColorDrawable ? (ColorDrawable) background : null;
        int iE0 = e0(colorDrawable != null ? colorDrawable.getColor() : -1);
        int iR = (int) rm5.r(view.getContext(), 4.0f);
        StateListDrawable stateListDrawable = new StateListDrawable();
        int[] iArr = {R.attr.state_focused};
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setCornerRadius(iR);
        gradientDrawable.setColor(0);
        gradientDrawable.setStroke((int) rm5.r(view.getContext(), 4.0f), iE0);
        stateListDrawable.addState(iArr, gradientDrawable);
        stateListDrawable.addState(new int[0], new ColorDrawable(0));
        view.setForeground(stateListDrawable);
    }

    public static void m0(int[] iArr, int[] iArr2, int[] iArr3) {
        if (wxe.b0(iArr, iArr2, iArr3) != 0) {
            z5i.y0(7, 6803, iArr3);
        }
    }

    public static int n(int i2) {
        return 32 - Integer.numberOfLeadingZeros(i2);
    }

    public static void n0(Drawable drawable, int i2) {
        if (!(drawable instanceof AnimatedVectorDrawableCompat)) {
            drawable.mutate();
        }
        drawable.setTint(i2);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0055  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int o(android.view.View r4) {
        /*
            java.lang.String r0 = "KeyboardVisibilityDelegate.calculateKeyboardHeight"
            r1 = 0
            org.chromium.base.TraceEvent r0 = org.chromium.base.TraceEvent.n(r0, r1)
            r1 = 0
            if (r4 == 0) goto L55
            android.view.WindowInsets r2 = r4.getRootWindowInsets()     // Catch: java.lang.Throwable -> L49
            if (r2 == 0) goto L55
            android.view.WindowInsets r2 = r4.getRootWindowInsets()     // Catch: java.lang.Throwable -> L49
            g3o r4 = defpackage.g3o.g(r4, r2)     // Catch: java.lang.Throwable -> L49
            d3o r4 = r4.a     // Catch: java.lang.Throwable -> L49
            r2 = 8
            r9b r2 = r4.i(r2)     // Catch: java.lang.Throwable -> L49
            int r2 = r2.d     // Catch: java.lang.Throwable -> L49
            if (r2 != 0) goto L27
            if (r0 != 0) goto L57
            return r1
        L27:
            r3 = 519(0x207, float:7.27E-43)
            r9b r4 = r4.i(r3)     // Catch: java.lang.Throwable -> L49
            int r4 = r4.d     // Catch: java.lang.Throwable -> L49
            gde r3 = p63.e     // Catch: java.lang.Throwable -> L49
            boolean r3 = r3.a()     // Catch: java.lang.Throwable -> L49
            if (r3 != 0) goto L3e
            int r2 = r2 - r4
            if (r0 == 0) goto L3d
            r0.close()
        L3d:
            return r2
        L3e:
            int r2 = r2 - r4
            int r4 = java.lang.Math.max(r1, r2)     // Catch: java.lang.Throwable -> L49
            if (r0 == 0) goto L48
            r0.close()
        L48:
            return r4
        L49:
            r4 = move-exception
            if (r0 == 0) goto L54
            r0.close()     // Catch: java.lang.Throwable -> L50
            goto L54
        L50:
            r0 = move-exception
            r4.addSuppressed(r0)
        L54:
            throw r4
        L55:
            if (r0 == 0) goto L5a
        L57:
            r0.close()
        L5a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.j14.o(android.view.View):int");
    }

    public static void o0(Drawable drawable, ColorStateList colorStateList) {
        drawable.mutate();
        drawable.setTintList(colorStateList);
    }

    public static LayerDrawable p(Drawable drawable, Drawable drawable2) {
        return new LayerDrawable(new Drawable[]{drawable, new w3a(drawable2, 17, false)});
    }

    public static void p0(itd itdVar, ColorStateList colorStateList) {
        for (int i2 = 0; i2 < itdVar.size(); i2++) {
            MenuItem item = itdVar.getItem(i2);
            Drawable icon = item.getIcon();
            if (icon != null) {
                icon.mutate();
                icon.setTintList(colorStateList);
                item.setIcon(icon);
            }
        }
    }

    public static final void q(int i2, int i3) {
        if (i2 < 0 || i2 >= i3) {
            h9o.u(sko.h(i2, i3, "index: ", ", size: "));
        }
    }

    public static ArrayList q0(Collection collection, xq9 xq9Var) {
        ArrayList arrayList = new ArrayList(collection.size());
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add((Bundle) xq9Var.apply(it.next()));
        }
        return arrayList;
    }

    public static final void r(int i2, int i3) {
        if (i2 < 0 || i2 > i3) {
            h9o.u(sko.h(i2, i3, "index: ", ", size: "));
        }
    }

    public static final void s(int i2, int i3, int i4) {
        if (i2 < 0 || i3 > i4) {
            h9o.g(i4, sko.o(i2, i3, "fromIndex: ", ", toIndex: ", ", size: "));
        } else {
            if (i2 <= i3) {
                return;
            }
            qp2.o(sko.h(i2, i3, "fromIndex: ", " > toIndex: "));
        }
    }

    public static final void t(boolean z, yqd yqdVar) {
        if (z) {
            s9g.h.e(true);
            if (yqdVar != null) {
                yqdVar.run();
                return;
            }
            return;
        }
        c0l c0lVarJ = c0l.e.j(t8.a);
        vdf vdfVar = new vdf(yqdVar, (byte) 24);
        qie qieVar = c0lVarJ.c;
        umi umiVar = c0lVarJ.a;
        nml nmlVarC = umiVar.c(new koj(c0lVarJ, (byte) 3));
        nmlVarC.b(umiVar.d(vdfVar));
        qieVar.n(new oml(nmlVarC), (Object) null);
    }

    public static void u(Closeable closeable) throws IOException {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e2) {
                throw e2;
            } catch (Exception unused) {
            }
        }
    }

    public static final Object v(f99 f99Var, Function2 function2, kuk kukVar) {
        int i2 = ma9.a;
        Object objCollect = ic4.l(ma9.b(f99Var, new la9((byte) 0, (mt5) null, function2)), 0).collect(zze.a, kukVar);
        px5 px5Var = px5.a;
        if (objCollect != px5Var) {
            objCollect = Unit.a;
        }
        return objCollect == px5Var ? objCollect : Unit.a;
    }

    public static int w(int i2, int i3) {
        int i4 = i2 + LinearLayoutManager.INVALID_OFFSET;
        int i5 = i3 + LinearLayoutManager.INVALID_OFFSET;
        if (i4 < i5) {
            return -1;
        }
        return i4 == i5 ? 0 : 1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static long[] y(Serializable serializable) {
        if (!(serializable instanceof int[])) {
            if (serializable instanceof long[]) {
                return (long[]) serializable;
            }
            return null;
        }
        int[] iArr = (int[]) serializable;
        long[] jArr = new long[iArr.length];
        for (int i2 = 0; i2 < iArr.length; i2++) {
            jArr[i2] = iArr[i2];
        }
        return jArr;
    }

    public static void z(bh8 bh8Var, OutputStream outputStream, int i2) throws IOException {
        byte[] bArr = new byte[8192];
        while (i2 > 0) {
            int iMin = Math.min(i2, 8192);
            int i3 = bh8Var.read(bArr, 0, iMin);
            if (i3 != iMin) {
                s49.m("Failed to copy the given amount of bytes from the inputstream to the output stream.");
                return;
            } else {
                i2 -= i3;
                outputStream.write(bArr, 0, i3);
            }
        }
    }

    public Object I() {
        throw new IllegalStateException("");
    }

    public abstract String Q();

    public boolean x(h7h h7hVar) {
        return false;
    }
}
