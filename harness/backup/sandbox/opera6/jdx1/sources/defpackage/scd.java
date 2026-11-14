package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.media.AudioManager;
import android.os.Build;
import android.os.Looper;
import android.util.AttributeSet;
import android.util.Pair;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.DatePicker;
import android.widget.LinearLayout;
import androidx.core.app.NotificationCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.usercentrics.sdk.ui.components.UCTextView;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.concurrent.locks.LockSupport;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.d;
import kotlin.coroutines.h;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt;
import kotlin.text.c;

/* loaded from: classes.dex */
public final class scd {
    public static AudioManager c;
    public static final gd7 g;
    public static final gd7 h;
    public static final gd7 i;
    public static final gd7 j;
    public static final gd7 k;
    public static yza t;
    public final /* synthetic */ byte a;
    public final fdn b;
    public static final y2 d = new y2((byte) 1);
    public static final ue5 e = new ue5(954879418, new q92((byte) 28), false);
    public static final ue5 f = new ue5(1918065384, new q92((byte) 29), false);
    public static final tz7 l = new tz7(false);
    public static final tz7 m = new tz7(true);
    public static final int[] n = {-21389, -2, -1, -1, -1};
    public static final int[] o = {457489321, 42778, 1, 0, 0, -42778, -3, -1, -1, -1};
    public static final int[] p = {-457489321, -42779, -2, -1, -1, 42777, 2};
    public static final int[] q = {2130969303};
    public static final int[] r = {2130969310};
    public static final eko s = new eko(16);

    static {
        byte b = 4;
        g = new gd7("COMPLETING_ALREADY", b);
        h = new gd7("COMPLETING_WAITING_CHILDREN", b);
        i = new gd7("COMPLETING_RETRY", b);
        j = new gd7("TOO_LATE_TO_CANCEL", b);
        k = new gd7("SEALED", b);
    }

    public scd(fdn fdnVar, byte b) {
        this.a = b;
        switch (b) {
            case 1:
                this.b = fdnVar;
                break;
            default:
                if (!fdnVar.b()) {
                    this.b = fdnVar;
                    break;
                } else {
                    this.b = null;
                    break;
                }
        }
    }

    public static int A(int i2, int i3, int i4, int[] iArr) {
        int i5;
        int i6 = 30;
        int i7 = 1;
        int i8 = 1;
        int i9 = 0;
        int i10 = 0;
        while (true) {
            int iNumberOfTrailingZeros = Integer.numberOfTrailingZeros(((-1) << i6) | i4);
            int i11 = i4 >> iNumberOfTrailingZeros;
            i7 <<= iNumberOfTrailingZeros;
            i9 <<= iNumberOfTrailingZeros;
            i2 -= iNumberOfTrailingZeros;
            i6 -= iNumberOfTrailingZeros;
            if (i6 <= 0) {
                iArr[0] = i7;
                iArr[1] = i9;
                iArr[2] = i10;
                iArr[3] = i8;
                return i2;
            }
            if (i2 <= 0) {
                i2 = 2 - i2;
                int i12 = -i3;
                int i13 = -i7;
                int i14 = -i9;
                i5 = (((i11 * i11) - 2) * i11 * i12) & ((-1) >>> (32 - (i2 > i6 ? i6 : i2))) & 63;
                i11 = i12;
                i3 = i11;
                int i15 = i10;
                i10 = i13;
                i7 = i15;
                int i16 = i8;
                i8 = i14;
                i9 = i16;
            } else {
                i5 = (((((i3 + 1) & 4) << 1) + i3) * (-i11)) & ((-1) >>> (32 - (i2 > i6 ? i6 : i2))) & 15;
            }
            i4 = i11 + (i3 * i5);
            i10 += i7 * i5;
            i8 += i5 * i9;
        }
    }

    public static void B(int[] iArr, int[] iArr2, int i2) {
        int i3 = 0;
        long j2 = 0;
        int i4 = 0;
        int i5 = 0;
        while (i2 > 0) {
            if (i3 < Math.min(30, i2)) {
                j2 |= (iArr[i4] & 4294967295L) << i3;
                i3 += 32;
                i4++;
            }
            iArr2[i5] = ((int) j2) & 1073741823;
            j2 >>>= 30;
            i3 -= 30;
            i2 -= 30;
            i5++;
        }
    }

    public static boolean C(int i2, int i3, int[] iArr) {
        int i4 = iArr[0] ^ i3;
        if (i4 == 0) {
            for (int i5 = 1; i5 < i2; i5++) {
                i4 |= iArr[i5];
            }
            if (i4 == 0) {
                return true;
            }
        }
        return false;
    }

    public static j94 D(f99 f99Var, tcc tccVar) {
        return f03.g(new s71(tccVar, qcc.d, f99Var, (mt5) null, (byte) 15));
    }

    public static synchronized AudioManager E(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            c = null;
        }
        AudioManager audioManager = c;
        if (audioManager != null) {
            return audioManager;
        }
        Looper looperMyLooper = Looper.myLooper();
        if (looperMyLooper == null || looperMyLooper == Looper.getMainLooper()) {
            AudioManager audioManager2 = (AudioManager) applicationContext.getSystemService("audio");
            c = audioManager2;
            audioManager2.getClass();
            return audioManager2;
        }
        rj5 rj5Var = new rj5(0);
        f03.p().execute(new xa(applicationContext, rj5Var, (byte) 24));
        rj5Var.a();
        AudioManager audioManager3 = c;
        audioManager3.getClass();
        return audioManager3;
    }

    public static final yza F() {
        yza yzaVar = t;
        if (yzaVar != null) {
            return yzaVar;
        }
        xza xzaVar = new xza("Filled.KeyboardArrowUp", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        l08 l08Var = u0n.a;
        nvj nvjVar = new nvj(u95.b);
        ArrayList arrayList = new ArrayList(32);
        arrayList.add(new h7g(7.41f, 15.41f));
        arrayList.add(new g7g(12.0f, 10.83f));
        arrayList.add(new o7g(4.59f, 4.58f));
        arrayList.add(new g7g(18.0f, 14.0f));
        arrayList.add(new o7g(-6.0f, -6.0f));
        arrayList.add(new o7g(-6.0f, 6.0f));
        arrayList.add(d7g.c);
        xza.d(xzaVar, arrayList, nvjVar);
        yza yzaVarE = xzaVar.e();
        t = yzaVarE;
        return yzaVarE;
    }

    public static String G(String str) {
        return sko.j("HasRequestedAndroidPermission::", str);
    }

    public static pta H(ih5 ih5Var) {
        pta ptaVar;
        vt9 vt9Var = (vt9) ih5Var;
        long j2 = ((u95) vt9Var.j(aq5.a)).a;
        sa5 sa5Var = (sa5) vt9Var.j(ua5.a);
        pta ptaVar2 = sa5Var.d0;
        if (ptaVar2 == null) {
            long j3 = u95.f;
            ptaVar = new pta(j3, j2, j3, u95.b(j2, h3k.a));
            sa5Var.d0 = ptaVar;
        } else {
            ptaVar = ptaVar2;
        }
        return jgm.a(ptaVar.b, j2) ? ptaVar : pta.b(ptaVar, 0L, j2, u95.b(j2, h3k.a), 5);
    }

    public static int I(int i2) {
        int i3 = (2 - (i2 * i2)) * i2;
        int i4 = (2 - (i2 * i3)) * i3;
        int i5 = (2 - (i2 * i4)) * i4;
        return (2 - (i2 * i5)) * i5;
    }

    public static boolean J() {
        return (c.m(Build.MANUFACTURER, "Huawei", true) || c.m(Build.BRAND, "Huawei", true)) && "HWANE".equalsIgnoreCase(Build.DEVICE);
    }

    public static boolean K() {
        if (!c.m(Build.MANUFACTURER, "Nokia", true) && !c.m(Build.BRAND, "Nokia", true)) {
            return false;
        }
        String str = Build.DEVICE;
        return "B2N".equalsIgnoreCase(str) || "B2N_sprout".equalsIgnoreCase(str);
    }

    public static boolean L() {
        return (c.m(Build.MANUFACTURER, "OnePlus", true) || c.m(Build.BRAND, "OnePlus", true)) && "OnePlus6".equalsIgnoreCase(Build.DEVICE);
    }

    public static boolean M() {
        return (c.m(Build.MANUFACTURER, "OnePlus", true) || c.m(Build.BRAND, "OnePlus", true)) && "OnePlus6T".equalsIgnoreCase(Build.DEVICE);
    }

    public static boolean N() {
        return (c.m(Build.MANUFACTURER, "Redmi", true) || c.m(Build.BRAND, "Redmi", true)) && "joyeuse".equalsIgnoreCase(Build.DEVICE);
    }

    public static boolean O() {
        return (c.m(Build.MANUFACTURER, "Samsung", true) || c.m(Build.BRAND, "Samsung", true)) && "a05s".equalsIgnoreCase(Build.DEVICE) && StringsKt.E(Build.MODEL.toUpperCase(Locale.ROOT), "SM-A057", false);
    }

    public static boolean P() {
        return (c.m(Build.MANUFACTURER, "Samsung", true) || c.m(Build.BRAND, "Samsung", true)) && "J7XELTE".equalsIgnoreCase(Build.DEVICE);
    }

    public static boolean Q() {
        return (c.m(Build.MANUFACTURER, "Samsung", true) || c.m(Build.BRAND, "Samsung", true)) && "ON7XELTE".equalsIgnoreCase(Build.DEVICE);
    }

    public static boolean R() {
        if (!c.m(Build.MANUFACTURER, "Samsung", true) && !c.m(Build.BRAND, "Samsung", true)) {
            return false;
        }
        String str = Build.DEVICE;
        return "q4q".equalsIgnoreCase(str) || "SCG16".equalsIgnoreCase(str) || "SC-55C".equalsIgnoreCase(str);
    }

    public static rcd S(String str, fdn fdnVar) {
        if (fdnVar == null) {
            return null;
        }
        Pair pairD = aik.d(fdnVar.c, str);
        if (((Integer) pairD.first).intValue() == -1 && ((Integer) pairD.second).intValue() == -1) {
            return null;
        }
        return new rcd(pairD);
    }

    public static int T(int[] iArr) {
        int i2 = LinearLayoutManager.INVALID_OFFSET;
        for (int i3 : iArr) {
            if (i3 > i2) {
                i2 = i3;
            }
        }
        return i2;
    }

    public static int U(int[] iArr, int[] iArr2, int[] iArr3) {
        int length = iArr.length;
        int i2 = 1;
        int iNumberOfLeadingZeros = (length << 5) - Integer.numberOfLeadingZeros(iArr[length - 1]);
        int i3 = 30;
        int i4 = (iNumberOfLeadingZeros + 29) / 30;
        int[] iArr4 = new int[i4];
        int[] iArr5 = new int[i4];
        int[] iArr6 = new int[i4];
        int[] iArr7 = new int[i4];
        int[] iArr8 = new int[i4];
        iArr5[0] = 1;
        B(iArr2, iArr7, iNumberOfLeadingZeros);
        B(iArr, iArr8, iNumberOfLeadingZeros);
        System.arraycopy(iArr8, 0, iArr6, 0, i4);
        int I = I(iArr8[0]);
        int i5 = 0;
        int i6 = (int) (((iNumberOfLeadingZeros * 150964) + 99243) >>> 16);
        int i7 = 0;
        int i8 = 0;
        while (i8 < i6) {
            int i9 = iArr6[i5];
            int i10 = iArr7[i5];
            int i11 = i7;
            int i12 = i9;
            int i13 = i5;
            int i14 = i4;
            int[] iArr9 = iArr4;
            int[] iArr10 = iArr5;
            int i15 = i13;
            int i16 = i15;
            int i17 = i16;
            int i18 = 1073741824;
            int i19 = i2;
            int i20 = 1073741824;
            while (i15 < i3) {
                int i21 = i3;
                int i22 = i11 >> 31;
                int i23 = i15;
                int i24 = -(i10 & 1);
                int i25 = i10 - ((i12 ^ i22) & i24);
                int i26 = i17 - ((i18 ^ i22) & i24);
                int i27 = i20 - ((i16 ^ i22) & i24);
                int i28 = i24 & (~i22);
                i11 = (i11 ^ i28) + 1;
                i12 += i25 & i28;
                i18 += i26 & i28;
                i16 += i28 & i27;
                i10 = i25 >> 1;
                i17 = i26 >> 1;
                i20 = i27 >> 1;
                i15 = i23 + 1;
                i3 = i21;
            }
            int[] iArr11 = {i18, i16, i17, i20};
            i4 = i14;
            iArr4 = iArr9;
            iArr5 = iArr10;
            r0(i4, iArr4, iArr5, iArr11, I, iArr8);
            s0(i4, iArr6, iArr7, iArr11);
            i8 += 30;
            i5 = i13;
            i7 = i11;
            i2 = i19;
        }
        int i29 = i5;
        int i30 = i2;
        int i31 = i4 - 1;
        int i32 = iArr6[i31] >> 31;
        int i33 = i29;
        int i34 = i33;
        while (i33 < i31) {
            int i35 = ((iArr6[i33] ^ i32) - i32) + i34;
            iArr6[i33] = 1073741823 & i35;
            i34 = i35 >> 30;
            i33++;
        }
        iArr6[i31] = ((iArr6[i31] ^ i32) - i32) + i34;
        int i36 = iArr4[i31] >> 31;
        int i37 = i29;
        int i38 = i37;
        while (i37 < i31) {
            int i39 = (((iArr4[i37] + (iArr8[i37] & i36)) ^ i32) - i32) + i38;
            iArr4[i37] = i39 & 1073741823;
            i38 = i39 >> 30;
            i37++;
        }
        int i40 = (((iArr4[i31] + (iArr8[i31] & i36)) ^ i32) - i32) + i38;
        iArr4[i31] = i40;
        int i41 = i40 >> 31;
        int i42 = i29;
        int i43 = i42;
        while (i42 < i31) {
            int i44 = iArr4[i42] + (iArr8[i42] & i41) + i43;
            iArr4[i42] = i44 & 1073741823;
            i43 = i44 >> 30;
            i42++;
        }
        iArr4[i31] = iArr4[i31] + (iArr8[i31] & i41) + i43;
        z(iArr4, iArr3, iNumberOfLeadingZeros);
        int i45 = iArr6[i29] ^ 1;
        for (int i46 = i30; i46 < i4; i46++) {
            i45 |= iArr6[i46];
        }
        int i47 = (i45 - 1) & (~i45);
        int i48 = iArr7[i29];
        for (int i49 = i30; i49 < i4; i49++) {
            i48 |= iArr7[i49];
        }
        return (i47 & ((i48 - 1) & (~i48))) >> 31;
    }

    public static void V(int[] iArr, int[] iArr2, int[] iArr3) {
        int iN;
        int length = iArr.length;
        int i2 = length << 5;
        int i3 = length - 1;
        int iNumberOfLeadingZeros = i2 - Integer.numberOfLeadingZeros(iArr[i3]);
        int i4 = (iNumberOfLeadingZeros + 29) / 30;
        while (true) {
            if (i3 < 0) {
                iN = 0;
                break;
            }
            int i5 = iArr2[i3];
            if (i5 != 0) {
                iN = j14.n(i5) + (i3 << 5);
                break;
            }
            i3--;
        }
        int i6 = iNumberOfLeadingZeros - iN;
        int[] iArr4 = new int[4];
        int[] iArr5 = new int[i4];
        int[] iArr6 = new int[i4];
        int[] iArr7 = new int[i4];
        int[] iArr8 = new int[i4];
        int[] iArr9 = new int[i4];
        iArr6[0] = 1;
        B(iArr2, iArr8, iNumberOfLeadingZeros);
        B(iArr, iArr9, iNumberOfLeadingZeros);
        System.arraycopy(iArr9, 0, iArr7, 0, i4);
        int iA = -i6;
        int I = I(iArr9[0]);
        int i7 = (int) (((iNumberOfLeadingZeros * 188898) + (iNumberOfLeadingZeros < 46 ? 308405 : 181188)) >>> 16);
        int iN0 = i4;
        while (!C(iN0, 0, iArr8)) {
            if (i6 >= i7) {
                return;
            }
            i6 += 30;
            iA = A(iA, iArr7[0], iArr8[0], iArr4);
            r0(i4, iArr5, iArr6, iArr4, I, iArr9);
            s0(iN0, iArr7, iArr8, iArr4);
            iN0 = n0(iArr7, iArr8, iN0);
        }
        int i8 = iArr7[iN0 - 1] >> 31;
        int iY = iArr5[i4 - 1] >> 31;
        if (iY < 0) {
            iY = k(iArr5, iArr9, i4);
        }
        if (i8 < 0) {
            iY = Y(i4, iArr5);
            Y(iN0, iArr7);
        }
        if (C(iN0, 1, iArr7)) {
            if (iY < 0) {
                k(iArr5, iArr9, i4);
            }
            z(iArr5, iArr3, iNumberOfLeadingZeros);
        }
    }

    public static void W(int[] iArr, int[] iArr2, int[] iArr3) {
        int[] iArr4 = new int[10];
        sfe.x0(iArr, iArr2, iArr4);
        d0(iArr4, iArr3);
    }

    public static void X(int[] iArr, int[] iArr2, int[] iArr3) {
        if ((sfe.y0(iArr, iArr2, iArr3) != 0 || (iArr3[9] == -1 && z5i.Q(iArr3, o, 10))) && z5i.k(p, iArr3, 7) != 0) {
            z5i.T(10, 7, iArr3);
        }
    }

    public static int Y(int i2, int[] iArr) {
        int i3 = i2 - 1;
        int i4 = 0;
        for (int i5 = 0; i5 < i3; i5++) {
            int i6 = i4 - iArr[i5];
            iArr[i5] = 1073741823 & i6;
            i4 = i6 >> 30;
        }
        int i7 = i4 - iArr[i3];
        iArr[i3] = i7;
        return i7 >> 30;
    }

    public static void Z(DatePicker datePicker, DatePicker.OnDateChangedListener onDateChangedListener, int i2, int i3, int i4, long j2, long j3) {
        Calendar calendar = Calendar.getInstance(TimeZone.getDefault());
        calendar.clear();
        calendar.set(i2, i3, i4);
        long timeInMillis = calendar.getTimeInMillis();
        qg6 qg6Var = new qg6(i2, i3, i4, timeInMillis);
        qg6 qg6VarA = qg6.a(j2);
        qg6 qg6VarA2 = qg6.a(j3);
        long j4 = qg6VarA2.a;
        long j5 = qg6VarA.a;
        if (j4 < j5) {
            qg6VarA2 = qg6VarA;
        }
        long j6 = qg6VarA2.a;
        if (timeInMillis < j5) {
            qg6Var = qg6VarA;
        } else if (timeInMillis > j6) {
            qg6Var = qg6VarA2;
        }
        if (j5 > datePicker.getMaxDate()) {
            datePicker.setMaxDate(j6);
            datePicker.setMinDate(j5);
        } else {
            datePicker.setMinDate(j5);
            datePicker.setMaxDate(j6);
        }
        datePicker.init(qg6Var.b, qg6Var.c, qg6Var.d, onDateChangedListener);
    }

    public static final pj5 a() {
        return new pj5();
    }

    public static TypedArray a0(Context context, AttributeSet attributeSet, int[] iArr, int i2, int i3, int... iArr2) {
        o(context, attributeSet, i2, i3);
        r(context, attributeSet, iArr, i2, i3, iArr2);
        return context.obtainStyledAttributes(attributeSet, iArr, i2, i3);
    }

    public static final q41 b(String str) {
        return new q41(Collections.singleton(str));
    }

    public static final c8e b0(c8e c8eVar, Function1 function1) {
        return c8eVar.d(new bdf(function1));
    }

    public static final void c(k9f k9fVar, rz0 rz0Var, ue5 ue5Var, ih5 ih5Var, int i2) {
        int i3;
        vt9 vt9Var = (vt9) ih5Var;
        vt9Var.Y(-1090171650);
        if ((i2 & 6) == 0) {
            i3 = ((i2 & 8) == 0 ? vt9Var.f(k9fVar) : vt9Var.h(k9fVar) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= vt9Var.f(rz0Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= vt9Var.h(ue5Var) ? NotificationCompat.FLAG_LOCAL_ONLY : NotificationCompat.FLAG_HIGH_PRIORITY;
        }
        boolean z = true;
        if (vt9Var.N(i3 & 1, (i3 & 147) != 146)) {
            boolean z2 = (i3 & 112) == 32;
            if ((i3 & 14) != 4 && ((i3 & 8) == 0 || !vt9Var.f(k9fVar))) {
                z = false;
            }
            boolean z3 = z2 | z;
            Object objK = vt9Var.K();
            if (z3 || objK == hh5.a) {
                objK = new a7a(rz0Var, k9fVar);
                vt9Var.g0(objK);
            }
            cwi cwiVar = cwi.a;
            w91.a((a7a) objK, null, new gog(false, false), ue5Var, vt9Var, ((i3 << 3) & 7168) | 384, 2);
        } else {
            vt9Var.Q();
        }
        znh znhVarR = vt9Var.r();
        if (znhVarR != null) {
            znhVarR.d = new ga1((Object) k9fVar, (Object) rz0Var, (Object) ue5Var, i2, (byte) 0);
        }
    }

    public static final long c0(long j2, long j3) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j2 >> 32)) + ((int) (j3 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j2 & 4294967295L)) + ((int) (j3 & 4294967295L));
        return (Float.floatToRawIntBits(fIntBitsToFloat) << 32) | (Float.floatToRawIntBits(fIntBitsToFloat2) & 4294967295L);
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:77:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void d(defpackage.c8e r20, float r21, long r22, defpackage.ih5 r24, int r25, int r26) {
        /*
            Method dump skipped, instructions count: 252
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.scd.d(c8e, float, long, ih5, int, int):void");
    }

    public static void d0(int[] iArr, int[] iArr2) {
        long j2 = iArr[5] & 4294967295L;
        long j3 = (21389 * j2) + (iArr[0] & 4294967295L);
        int i2 = (int) j3;
        iArr2[0] = i2;
        long j4 = iArr[6] & 4294967295L;
        long j5 = (21389 * j4) + j2 + (iArr[1] & 4294967295L) + (j3 >>> 32);
        int i3 = (int) j5;
        iArr2[1] = i3;
        long j6 = iArr[7] & 4294967295L;
        long j7 = (21389 * j6) + j4 + (iArr[2] & 4294967295L) + (j5 >>> 32);
        int i4 = (int) j7;
        iArr2[2] = i4;
        long j8 = iArr[8] & 4294967295L;
        long j9 = (21389 * j8) + j6 + (iArr[3] & 4294967295L) + (j7 >>> 32);
        int i5 = (int) j9;
        iArr2[3] = i5;
        long j10 = iArr[9] & 4294967295L;
        long j11 = (21389 * j10) + j8 + (iArr[4] & 4294967295L) + (j9 >>> 32);
        iArr2[4] = (int) j11;
        long j12 = (j11 >>> 32) + j10;
        long j13 = j12 & 4294967295L;
        long j14 = (21389 * j13) + (i2 & 4294967295L);
        iArr2[0] = (int) j14;
        long j15 = j12 >>> 32;
        long j16 = (21389 * j15) + j13 + (i3 & 4294967295L) + (j14 >>> 32);
        iArr2[1] = (int) j16;
        long j17 = j15 + (i4 & 4294967295L) + (j16 >>> 32);
        iArr2[2] = (int) j17;
        long j18 = (j17 >>> 32) + (i5 & 4294967295L);
        iArr2[3] = (int) j18;
        if (((j18 >>> 32) == 0 ? 0 : z5i.U(5, 4, iArr2)) != 0 || (iArr2[4] == -1 && sfe.f0(iArr2, n))) {
            z5i.h(5, 21389, iArr2);
        }
    }

    public static final void e(final Function0 function0, final sf1 sf1Var, final c8e c8eVar, final boolean z, final boolean z2, final smf smfVar, final rmf rmfVar, final z14 z14Var, final go3 go3Var, final ez3 ez3Var, final hyf hyfVar, final u95 u95Var, final c8e c8eVar2, final zvf zvfVar, ih5 ih5Var, final int i2, final int i3) {
        int i4;
        sf1 sf1Var2;
        boolean z3;
        int i5;
        c8e c8eVar3;
        vt9 vt9Var;
        float f2;
        c8e c8eVar4;
        boolean z4;
        e24 e24VarC;
        vt9 vt9Var2 = (vt9) ih5Var;
        vt9Var2.Y(-1777153673);
        if ((i2 & 6) == 0) {
            i4 = (vt9Var2.h(function0) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            sf1Var2 = sf1Var;
            i4 |= vt9Var2.f(sf1Var2) ? 32 : 16;
        } else {
            sf1Var2 = sf1Var;
        }
        int i6 = i2 & 384;
        int i7 = NotificationCompat.FLAG_LOCAL_ONLY;
        if (i6 == 0) {
            i4 |= vt9Var2.f(c8eVar) ? 256 : NotificationCompat.FLAG_HIGH_PRIORITY;
        }
        if ((i2 & 3072) == 0) {
            i4 |= vt9Var2.g(z) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            z3 = z2;
            i4 |= vt9Var2.g(z3) ? 16384 : 8192;
        } else {
            z3 = z2;
        }
        if ((i2 & 196608) == 0) {
            i4 |= vt9Var2.d(smfVar == null ? -1 : smfVar.ordinal()) ? 131072 : 65536;
        }
        if ((1572864 & i2) == 0) {
            i4 |= vt9Var2.d(rmfVar != null ? rmfVar.ordinal() : -1) ? 1048576 : 524288;
        }
        if ((12582912 & i2) == 0) {
            i4 |= vt9Var2.f(z14Var) ? 8388608 : 4194304;
        }
        if ((i2 & 100663296) == 0) {
            i4 |= vt9Var2.f(go3Var) ? 67108864 : 33554432;
        }
        if ((i2 & 805306368) == 0) {
            i4 |= vt9Var2.f(ez3Var) ? 536870912 : 268435456;
        }
        if ((i3 & 6) == 0) {
            i5 = i3 | ((i3 & 8) == 0 ? vt9Var2.f(hyfVar) : vt9Var2.h(hyfVar) ? 4 : 2);
        } else {
            i5 = i3;
        }
        if ((i3 & 48) == 0) {
            i5 |= vt9Var2.f(u95Var) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            c8eVar3 = c8eVar2;
            if (!vt9Var2.f(c8eVar3)) {
                i7 = NotificationCompat.FLAG_HIGH_PRIORITY;
            }
            i5 |= i7;
        } else {
            c8eVar3 = c8eVar2;
        }
        if ((i3 & 3072) == 0) {
            i5 |= vt9Var2.f(zvfVar) ? 2048 : 1024;
        }
        if (vt9Var2.N(i4 & 1, ((i4 & 306783379) == 306783378 && (i5 & 1171) == 1170) ? false : true)) {
            vt9Var2.S();
            if ((i2 & 1) != 0 && !vt9Var2.x()) {
                vt9Var2.Q();
            }
            vt9Var2.q();
            int iOrdinal = rmfVar.ordinal();
            if (iOrdinal == 0) {
                f2 = 40.0f;
            } else if (iOrdinal == 1) {
                f2 = 32.0f;
            } else {
                if (iOrdinal != 2) {
                    h9o.p();
                    return;
                }
                f2 = 48.0f;
            }
            c8e c8eVarE = mpj.e(c8eVar, f2, 2);
            if (tmf.a[smfVar.ordinal()] == 6) {
                vt9Var2.W(1020520939);
                zvf zvfVar2 = b24.a;
                c8eVar4 = c8eVarE;
                e24VarC = new e24(ex7.a, ex7.d, ex7.b, ex7.c);
                z4 = false;
                vt9Var2.p(false);
            } else {
                c8eVar4 = c8eVarE;
                z4 = false;
                vt9Var2.W(1020522755);
                e24VarC = b24.c();
                vt9Var2.p(false);
            }
            e24 e24Var = e24VarC;
            u8i u8iVar = pof.a.i;
            zvf zvfVar3 = ez3Var != null ? new zvf(0.0f, 0.0f, 0.0f, 0.0f) : zvfVar;
            boolean z5 = ((i4 & 7168) == 2048 ? true : z4) | ((i4 & 14) == 4 ? true : z4);
            Object objK = vt9Var2.K();
            if (z5 || objK == hh5.a) {
                objK = new dt5(z, function0, (byte) 1);
                vt9Var2.g0(objK);
            }
            Function0 function02 = (Function0) objK;
            int i8 = i4;
            int i9 = i8 >> 6;
            vt9Var = vt9Var2;
            yi4.a(function02, c8eVar4, z3, u8iVar, z14Var, e24Var, go3Var, zvfVar3, gyg.P(1344182151, new b7d(ez3Var, zvfVar, rmfVar, z, hyfVar, u95Var, c8eVar3, sf1Var2), vt9Var2), vt9Var, (i9 & 896) | 805306368 | ((i8 >> 9) & 57344) | (i9 & 3670016), NotificationCompat.FLAG_LOCAL_ONLY);
        } else {
            vt9Var = vt9Var2;
            vt9Var.Q();
        }
        znh znhVarR = vt9Var.r();
        if (znhVarR != null) {
            znhVarR.d = new Function2() { // from class: vmf
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iM = aoh.m(i2 | 1);
                    int iM2 = aoh.m(i3);
                    scd.e(function0, sf1Var, c8eVar, z, z2, smfVar, rmfVar, z14Var, go3Var, ez3Var, hyfVar, u95Var, c8eVar2, zvfVar, (ih5) obj, iM, iM2);
                    return Unit.a;
                }
            };
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x003b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void e0(int r11, int[] r12) {
        /*
            r0 = 5
            if (r11 == 0) goto L3b
            long r1 = (long) r11
            r3 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r1 = r1 & r3
            r5 = 21389(0x538d, double:1.05676E-319)
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
            r11 = 4
            r11 = r12[r11]
            r1 = -1
            if (r11 != r1) goto L4e
            int[] r11 = defpackage.scd.n
            boolean r11 = defpackage.sfe.f0(r12, r11)
            if (r11 == 0) goto L4e
        L49:
            r11 = 21389(0x538d, float:2.9972E-41)
            defpackage.z5i.h(r0, r11, r12)
        L4e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.scd.e0(int, int[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0279  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0298  */
    /* JADX WARN: Removed duplicated region for block: B:185:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0100  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void f(final kotlin.jvm.functions.Function0 r34, final java.lang.String r35, defpackage.c8e r36, boolean r37, boolean r38, smf r39, rmf r40, defpackage.z14 r41, defpackage.go3 r42, defpackage.ez3 r43, defpackage.hyf r44, defpackage.u95 r45, defpackage.c8e r46, defpackage.zvf r47, defpackage.ih5 r48, final int r49, final int r50, final int r51) {
        /*
            Method dump skipped, instructions count: 683
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.scd.f(kotlin.jvm.functions.Function0, java.lang.String, c8e, boolean, boolean, smf, rmf, z14, go3, ez3, hyf, u95, c8e, zvf, ih5, int, int, int):void");
    }

    public static final long f0(long j2) {
        return (Math.round(Float.intBitsToFloat((int) (j2 >> 32))) << 32) | (Math.round(Float.intBitsToFloat((int) (j2 & 4294967295L))) & 4294967295L);
    }

    public static final void g(final ez3 ez3Var, final zvf zvfVar, final float f2, final ue5 ue5Var, ih5 ih5Var, final int i2) {
        ez3 ez3Var2;
        final zvf zvfVar2;
        final float f3;
        final ue5 ue5Var2;
        final int i3;
        vt9 vt9Var = (vt9) ih5Var;
        vt9Var.Y(-1704496831);
        int i4 = (vt9Var.f(ez3Var) ? 4 : 2) | i2 | (vt9Var.f(zvfVar) ? 32 : 16) | (vt9Var.c(f2) ? NotificationCompat.FLAG_LOCAL_ONLY : NotificationCompat.FLAG_HIGH_PRIORITY);
        if (!vt9Var.N(i4 & 1, (i4 & 1171) != 1170)) {
            ez3Var2 = ez3Var;
            zvfVar2 = zvfVar;
            f3 = f2;
            ue5Var2 = ue5Var;
            i3 = i2;
            vt9Var.Q();
        } else {
            if (ez3Var == null) {
                vt9Var.W(733417177);
                ue5Var.invoke(vt9Var, 6);
                vt9Var.p(false);
                znh znhVarR = vt9Var.r();
                if (znhVarR != null) {
                    final byte b = 0;
                    znhVarR.d = new Function2(ez3Var, zvfVar, f2, ue5Var, i2, b) { // from class: wmf
                        public final /* synthetic */ byte a;
                        public final /* synthetic */ ez3 b;
                        public final /* synthetic */ zvf c;
                        public final /* synthetic */ float d;
                        public final /* synthetic */ ue5 e;

                        {
                            this.a = b;
                        }

                        public final Object invoke(Object obj, Object obj2) {
                            switch (this.a) {
                                case 0:
                                    ((Integer) obj2).getClass();
                                    int iM = aoh.m(3073);
                                    scd.g(this.b, this.c, this.d, this.e, (ih5) obj, iM);
                                    break;
                                default:
                                    ((Integer) obj2).getClass();
                                    int iM2 = aoh.m(3073);
                                    scd.g(this.b, this.c, this.d, this.e, (ih5) obj, iM2);
                                    break;
                            }
                            return Unit.a;
                        }
                    };
                    return;
                }
                return;
            }
            ez3Var2 = ez3Var;
            zvfVar2 = zvfVar;
            f3 = f2;
            ue5Var2 = ue5Var;
            i3 = i2;
            vt9Var.W(733455617);
            vt9Var.p(false);
            c8e c8eVarW = a26.W(sfe.B(mpj.a(z7e.b, b24.c, f3), ez3Var2, pof.a.i, 4), zvfVar2);
            tfd tfdVarC = nr3.c(rbe.f, false);
            int iHashCode = Long.hashCode(vt9Var.T);
            oag oagVarL = vt9Var.l();
            c8e c8eVarP = qyn.P(vt9Var, c8eVarW);
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
            ue5Var2.invoke(vt9Var, 6);
            vt9Var.p(true);
        }
        znh znhVarR2 = vt9Var.r();
        if (znhVarR2 != null) {
            final ez3 ez3Var3 = ez3Var2;
            final byte b2 = 1;
            znhVarR2.d = new Function2(ez3Var3, zvfVar2, f3, ue5Var2, i3, b2) { // from class: wmf
                public final /* synthetic */ byte a;
                public final /* synthetic */ ez3 b;
                public final /* synthetic */ zvf c;
                public final /* synthetic */ float d;
                public final /* synthetic */ ue5 e;

                {
                    this.a = b2;
                }

                public final Object invoke(Object obj, Object obj2) {
                    switch (this.a) {
                        case 0:
                            ((Integer) obj2).getClass();
                            int iM = aoh.m(3073);
                            scd.g(this.b, this.c, this.d, this.e, (ih5) obj, iM);
                            break;
                        default:
                            ((Integer) obj2).getClass();
                            int iM2 = aoh.m(3073);
                            scd.g(this.b, this.c, this.d, this.e, (ih5) obj, iM2);
                            break;
                    }
                    return Unit.a;
                }
            };
        }
    }

    public static final Object g0(CoroutineContext coroutineContext, Function2 function2) throws Throwable {
        tc8 tc8VarA;
        CoroutineContext coroutineContextA;
        long jV0;
        ot5 ot5Var = d.Hq;
        if (coroutineContext.get(ot5Var) == null) {
            tc8VarA = gml.a();
            coroutineContextA = cx5.a(h.a, coroutineContext.plus(tc8VarA), true);
            CoroutineContext coroutineContext2 = bb7.a;
            if (coroutineContextA != coroutineContext2 && coroutineContextA.get(ot5Var) == null) {
                coroutineContextA = coroutineContextA.plus(coroutineContext2);
            }
        } else {
            tc8VarA = (tc8) gml.a.get();
            coroutineContextA = cx5.a(h.a, coroutineContext, true);
            CoroutineContext coroutineContext3 = bb7.a;
            if (coroutineContextA != coroutineContext3 && coroutineContextA.get(ot5Var) == null) {
                coroutineContextA = coroutineContextA.plus(coroutineContext3);
            }
        }
        hk3 hk3Var = new hk3(coroutineContextA, Thread.currentThread(), tc8VarA);
        hk3Var.D0(rx5.a, hk3Var, function2);
        tc8 tc8Var = hk3Var.f;
        if (tc8Var != null) {
            tc8Var.n0(false);
        }
        while (true) {
            if (tc8Var != null) {
                try {
                    jV0 = tc8Var.v0();
                } finally {
                    if (tc8Var != null) {
                        tc8Var.T(false);
                    }
                }
            } else {
                jV0 = Long.MAX_VALUE;
            }
            if (hk3Var.h0()) {
                break;
            }
            LockSupport.parkNanos(hk3Var, jV0);
            if (Thread.interrupted()) {
                hk3Var.B(new InterruptedException());
            }
        }
        Object objP0 = p0(hk3Var.c0());
        fd5 fd5Var = objP0 instanceof fd5 ? (fd5) objP0 : null;
        if (fd5Var == null) {
            return objP0;
        }
        throw fd5Var.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x009f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void h(final defpackage.k9f r15, final boolean r16, defpackage.hyh r17, boolean r18, long r19, float r21, defpackage.c8e r22, defpackage.ih5 r23, int r24) {
        /*
            Method dump skipped, instructions count: 259
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.scd.h(k9f, boolean, hyh, boolean, long, float, c8e, ih5, int):void");
    }

    public static Object h0(Function2 function2) {
        return g0(h.a, function2);
    }

    public static final void i(int i2, ih5 ih5Var, c8e c8eVar, Function0 function0, boolean z) {
        int i3;
        vt9 vt9Var = (vt9) ih5Var;
        vt9Var.Y(2111672474);
        if ((i2 & 6) == 0) {
            i3 = (vt9Var.f(c8eVar) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        int i4 = i3 | (vt9Var.h(function0) ? 32 : 16) | (vt9Var.g(z) ? NotificationCompat.FLAG_LOCAL_ONLY : NotificationCompat.FLAG_HIGH_PRIORITY);
        if (vt9Var.N(i4 & 1, (i4 & 147) != 146)) {
            p0j p0jVar = hzi.a;
            ocp.c(vt9Var, qyn.q(mpj.i(c8eVar, 25.0f, 25.0f), new oa1((byte) 0, function0, z)));
        } else {
            vt9Var.Q();
        }
        znh znhVarR = vt9Var.r();
        if (znhVarR != null) {
            znhVarR.d = new na1(c8eVar, function0, z, i2);
        }
    }

    public static void i0(int[] iArr, int[] iArr2) {
        int[] iArr3 = new int[10];
        sfe.H0(iArr, iArr3);
        d0(iArr3, iArr2);
    }

    public static final void j(c8e c8eVar, float f2, long j2, ih5 ih5Var, int i2) {
        vt9 vt9Var = (vt9) ih5Var;
        vt9Var.Y(-1534852205);
        int i3 = i2 | 176;
        if (vt9Var.N(i3 & 1, (i3 & 147) != 146)) {
            vt9Var.S();
            if ((i2 & 1) == 0 || vt9Var.x()) {
                f2 = hc7.a;
                j2 = ua5.d(mc7.a, vt9Var);
            } else {
                vt9Var.Q();
            }
            vt9Var.q();
            c8e c8eVarL = mpj.l(c8eVar.d(mpj.b), f2);
            boolean zE = vt9Var.e(j2);
            Object objK = vt9Var.K();
            if (zE || objK == hh5.a) {
                objK = new jc7(f2, j2, (byte) 0);
                vt9Var.g0(objK);
            }
            oup.H(c8eVarL, (Function1) objK, vt9Var, 0);
        } else {
            vt9Var.Q();
        }
        float f3 = f2;
        long j3 = j2;
        znh znhVarR = vt9Var.r();
        if (znhVarR != null) {
            znhVarR.d = new kc7(c8eVar, f3, j3, i2);
        }
    }

    public static void j0(int[] iArr, int[] iArr2, int i2) {
        int[] iArr3 = new int[10];
        sfe.H0(iArr, iArr3);
        while (true) {
            d0(iArr3, iArr2);
            i2--;
            if (i2 <= 0) {
                return;
            } else {
                sfe.H0(iArr2, iArr3);
            }
        }
    }

    public static int k(int[] iArr, int[] iArr2, int i2) {
        int i3 = i2 - 1;
        int i4 = 0;
        for (int i5 = 0; i5 < i3; i5++) {
            int i6 = iArr[i5] + iArr2[i5] + i4;
            iArr[i5] = 1073741823 & i6;
            i4 = i6 >> 30;
        }
        int i7 = iArr[i3] + iArr2[i3] + i4;
        iArr[i3] = i7;
        return i7 >> 30;
    }

    public static void k0(int[] iArr, int[] iArr2, int[] iArr3) {
        if (sfe.I0(iArr, iArr2, iArr3) != 0) {
            z5i.y0(5, 21389, iArr3);
        }
    }

    public static float l(int i2, float f2, float f3) {
        return (Math.max(0, i2 - 1) * f3) + f2;
    }

    public static final Bitmap l0(Drawable drawable, int i2, int i3) {
        if (drawable instanceof BitmapDrawable) {
            BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
            if (bitmapDrawable.getBitmap() != null) {
                return (i2 == bitmapDrawable.getBitmap().getWidth() && i3 == bitmapDrawable.getBitmap().getHeight()) ? bitmapDrawable.getBitmap() : Bitmap.createScaledBitmap(bitmapDrawable.getBitmap(), i2, i3, true);
            }
            qp2.o("bitmap is null");
            return null;
        }
        Rect bounds = drawable.getBounds();
        int i4 = bounds.left;
        int i5 = bounds.top;
        int i6 = bounds.right;
        int i7 = bounds.bottom;
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i2, i3, Bitmap.Config.ARGB_8888);
        drawable.setBounds(0, 0, i2, i3);
        drawable.draw(new Canvas(bitmapCreateBitmap));
        drawable.setBounds(i4, i5, i6, i7);
        return bitmapCreateBitmap;
    }

    public static float m(int i2, float f2, float f3) {
        return i2 > 0 ? (f3 / 2.0f) + f2 : f2;
    }

    public static final String m0(float f2) {
        if (Float.isNaN(f2)) {
            return "NaN";
        }
        if (Float.isInfinite(f2)) {
            return f2 < 0.0f ? "-Infinity" : "Infinity";
        }
        float f3 = f2 * 10.0f;
        int i2 = (int) f3;
        if (f3 - i2 >= 0.5f) {
            i2++;
        }
        return String.valueOf(i2 / 10.0f);
    }

    public static nf2 n(String str, u9d u9dVar) {
        String strM;
        int i2;
        if (str == null || (strM = t0h.m(str)) == null) {
            return null;
        }
        Iterator it = u9dVar.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            String[] strArr = (String[]) entry.getKey();
            nf2 nf2Var = (nf2) entry.getValue();
            int length = strArr.length;
            for (0; i2 < length; i2 + 1) {
                String str2 = strArr[i2];
                i2 = str2 != null ? StringsKt.E(strM, str2, true) : false ? i2 + 1 : 0;
            }
            return nf2Var;
        }
        return null;
    }

    public static int n0(int[] iArr, int[] iArr2, int i2) {
        int i3 = i2 - 1;
        int i4 = iArr[i3];
        int i5 = iArr2[i3];
        int i6 = i2 - 2;
        if (((i6 >> 31) | ((i4 >> 31) ^ i4) | ((i5 >> 31) ^ i5)) != 0) {
            return i2;
        }
        iArr[i6] = iArr[i6] | (i4 << 30);
        iArr2[i6] = iArr2[i6] | (i5 << 30);
        return i2 - 1;
    }

    public static void o(Context context, AttributeSet attributeSet, int i2, int i3) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ihh.Y, i2, i3);
        boolean z = typedArrayObtainStyledAttributes.getBoolean(1, false);
        typedArrayObtainStyledAttributes.recycle();
        if (z) {
            TypedValue typedValue = new TypedValue();
            if (!context.getTheme().resolveAttribute(2130969975, typedValue, true) || (typedValue.type == 18 && typedValue.data == 0)) {
                s(context, r, "Theme.MaterialComponents");
            }
        }
        s(context, q, "Theme.AppCompat");
    }

    public static void o0(int[] iArr, int[] iArr2) {
        if (z5i.o0(5, 0, iArr, iArr2) != 0 || (iArr2[4] == -1 && sfe.f0(iArr2, n))) {
            z5i.h(5, 21389, iArr2);
        }
    }

    public static void p(Object obj, Object obj2) {
        if (obj == null) {
            t3p.q(rfp.o(obj2, "null key in entry: null="));
        } else {
            if (obj2 != null) {
                return;
            }
            bpp.l(obj, "=null", "null value in entry: ");
        }
    }

    public static final Object p0(Object obj) {
        i5b i5bVar = obj instanceof i5b ? (i5b) obj : null;
        return i5bVar != null ? i5bVar.a : obj;
    }

    public static void q(int i2, String str) {
        if (i2 >= 0) {
            return;
        }
        throw new IllegalArgumentException(str + " cannot be negative but was: " + i2);
    }

    public static float q0(float f2, float f3, float f4, int i2) {
        return i2 > 0 ? (f4 / 2.0f) + f3 : f2;
    }

    public static void r(Context context, AttributeSet attributeSet, int[] iArr, int i2, int i3, int... iArr2) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ihh.Y, i2, i3);
        boolean z = false;
        if (!typedArrayObtainStyledAttributes.getBoolean(2, false)) {
            typedArrayObtainStyledAttributes.recycle();
            return;
        }
        if (iArr2.length != 0) {
            TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr, i2, i3);
            for (int i4 : iArr2) {
                if (typedArrayObtainStyledAttributes2.getResourceId(i4, -1) == -1) {
                    typedArrayObtainStyledAttributes2.recycle();
                    break;
                }
            }
            typedArrayObtainStyledAttributes2.recycle();
            z = true;
        } else if (typedArrayObtainStyledAttributes.getResourceId(0, -1) != -1) {
            z = true;
        }
        typedArrayObtainStyledAttributes.recycle();
        if (z) {
            return;
        }
        qp2.o("This component requires that you specify a valid TextAppearance attribute. Update your app theme to inherit from Theme.MaterialComponents (or a descendant).");
    }

    public static void r0(int i2, int[] iArr, int[] iArr2, int[] iArr3, int i3, int[] iArr4) {
        int i4 = i2;
        int i5 = iArr3[0];
        int i6 = iArr3[1];
        int i7 = iArr3[2];
        int i8 = iArr3[3];
        int i9 = i4 - 1;
        int i10 = iArr[i9] >> 31;
        int i11 = iArr2[i9] >> 31;
        int i12 = (i5 & i10) + (i6 & i11);
        int i13 = (i10 & i7) + (i11 & i8);
        int i14 = iArr4[0];
        long j2 = i5;
        long j3 = iArr[0];
        long j4 = i6;
        long j5 = iArr2[0];
        long j6 = (j4 * j5) + (j2 * j3);
        long j7 = i7;
        long j8 = i8;
        long j9 = (j8 * j5) + (j3 * j7);
        int i15 = i12 - (((((int) j6) * i3) + i12) & 1073741823);
        long j10 = i14;
        long j11 = i15;
        long j12 = (j10 * j11) + j6;
        long j13 = i13 - (((((int) j9) * i3) + i13) & 1073741823);
        char c2 = 30;
        long j14 = ((j10 * j13) + j9) >> 30;
        long j15 = j12 >> 30;
        int i16 = 1;
        while (i16 < i4) {
            int i17 = iArr4[i16];
            char c3 = c2;
            long j16 = j13;
            long j17 = iArr[i16];
            long j18 = j2 * j17;
            long j19 = iArr2[i16];
            long j20 = i17;
            long j21 = j11;
            long jD = osp.d(j20, j21, (j4 * j19) + j18, j15);
            long jD2 = osp.d(j20, j16, (j19 * j8) + (j7 * j17), j14);
            int i18 = i16 - 1;
            iArr[i18] = ((int) jD) & 1073741823;
            j15 = jD >> c3;
            iArr2[i18] = ((int) jD2) & 1073741823;
            j14 = jD2 >> c3;
            i16++;
            i4 = i2;
            c2 = c3;
            j11 = j21;
            j13 = j16;
        }
        iArr[i9] = (int) j15;
        iArr2[i9] = (int) j14;
    }

    public static void s(Context context, int[] iArr, String str) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(iArr);
        for (int i2 = 0; i2 < iArr.length; i2++) {
            if (!typedArrayObtainStyledAttributes.hasValue(i2)) {
                typedArrayObtainStyledAttributes.recycle();
                qp2.o(sko.k("The style on this component requires your app theme to be ", str, " (or a descendant)."));
                return;
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public static void s0(int i2, int[] iArr, int[] iArr2, int[] iArr3) {
        int i3 = iArr3[0];
        int i4 = 1;
        int i5 = iArr3[1];
        int i6 = iArr3[2];
        int i7 = iArr3[3];
        long j2 = i3;
        long j3 = iArr[0];
        long j4 = i5;
        long j5 = iArr2[0];
        long j6 = (j4 * j5) + (j2 * j3);
        long j7 = i6;
        long j8 = i7;
        long j9 = ((j5 * j8) + (j3 * j7)) >> 30;
        int i8 = 1;
        long j10 = j6 >> 30;
        while (i8 < i2) {
            long j11 = iArr[i8];
            int i9 = i4;
            long j12 = j7;
            long j13 = iArr2[i8];
            long jD = osp.d(j4, j13, j2 * j11, j10);
            long j14 = j8;
            long jD2 = osp.d(j14, j13, j12 * j11, j9);
            int i10 = i8 - 1;
            iArr[i10] = ((int) jD) & 1073741823;
            j10 = jD >> 30;
            iArr2[i10] = ((int) jD2) & 1073741823;
            j9 = jD2 >> 30;
            i8++;
            i4 = i9;
            j8 = j14;
            j7 = j12;
        }
        int i11 = i2 - i4;
        iArr[i11] = (int) j10;
        iArr2[i11] = (int) j9;
    }

    public static void t(int[] iArr, int[] iArr2, int[] iArr3) {
        if (U(iArr, iArr2, iArr3) == 0) {
            throw new ArithmeticException("Inverse does not exist.");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final defpackage.j71 u(defpackage.g74 r26, float r27) {
        /*
            Method dump skipped, instructions count: 237
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.scd.u(g74, float):j71");
    }

    public static String v(String... strArr) {
        StringBuilder sb = new StringBuilder();
        if (strArr.length > 0) {
            sb.append(strArr[0]);
            for (int i2 = 1; i2 < strArr.length; i2++) {
                sb.append(", ");
                sb.append(strArr[i2]);
                sb.append(";q=0.");
                sb.append(String.valueOf(10 - i2));
            }
        }
        return sb.toString();
    }

    public static String w(Locale locale) {
        String country = locale.getCountry();
        Locale locale2 = Locale.ROOT;
        String lowerCase = country.toLowerCase(locale2);
        String lowerCase2 = locale.getLanguage().toLowerCase(locale2);
        String strS = sfe.S(lowerCase2);
        return (lowerCase.isEmpty() || lowerCase2.equals(lowerCase)) ? strS.equals(lowerCase2) ? lowerCase2 : v(strS, lowerCase2) : ("en".equals(lowerCase2) && "us".equals(lowerCase)) ? "en" : strS.equals(lowerCase2) ? v(sko.k(lowerCase2, "-", lowerCase), lowerCase2) : v(sko.k(strS, "-", lowerCase), sko.k(lowerCase2, "-", lowerCase), strS, lowerCase2);
    }

    public static iwb x(Context context, float f2, int i2, a72 a72Var, int i3) {
        gwb gwbVar;
        float f3;
        float f4;
        float f5;
        float f6;
        float f7;
        gwb gwbVar2;
        if (i3 != 1) {
            float fMin = Math.min(context.getResources().getDimension(2131166006) + f2, a72Var.f);
            float f8 = fMin / 2.0f;
            float f9 = 0.0f - f8;
            float f10 = a72Var.f;
            int i4 = a72Var.g;
            float fM = m(i4, 0.0f, f10);
            float fQ0 = q0(0.0f, l(i4, fM, a72Var.f), a72Var.f, i4);
            float fM2 = m(a72Var.d, fQ0, a72Var.e);
            float fM3 = m(a72Var.c, q0(fQ0, fM2, a72Var.e, a72Var.d), a72Var.b);
            float f11 = f8 + i2;
            float fB = gl4.b(fMin, a72Var.f, f2);
            float fB2 = gl4.b(a72Var.b, a72Var.f, f2);
            float fB3 = gl4.b(a72Var.e, a72Var.f, f2);
            gwb gwbVar3 = new gwb(a72Var.f, i2);
            gwbVar3.a(f9, fB, fMin, false, true);
            gwbVar3.c(fM, 0.0f, a72Var.f, a72Var.g, true);
            if (a72Var.d > 0) {
                gwbVar3.a(fM2, fB3, a72Var.e, false, false);
            }
            int i5 = a72Var.c;
            if (i5 > 0) {
                gwbVar3.c(fM3, fB2, a72Var.b, i5, false);
            }
            gwbVar3.a(f11, fB, fMin, false, true);
            return gwbVar3.d();
        }
        float fMin2 = Math.min(context.getResources().getDimension(2131166006) + f2, a72Var.f);
        float f12 = fMin2 / 2.0f;
        float f13 = 0.0f - f12;
        float fM4 = m(a72Var.c, 0.0f, a72Var.b);
        float fQ02 = q0(0.0f, l((int) Math.floor(a72Var.c / 2.0f), fM4, a72Var.b), a72Var.b, a72Var.c);
        float fM5 = m(a72Var.d, fQ02, a72Var.e);
        float fQ03 = q0(fQ02, l((int) Math.floor(a72Var.d / 2.0f), fM5, a72Var.e), a72Var.e, a72Var.d);
        float f14 = a72Var.f;
        int i6 = a72Var.g;
        float fM6 = m(i6, fQ03, f14);
        float fQ04 = q0(fQ03, l(i6, fM6, a72Var.f), a72Var.f, i6);
        float fM7 = m(a72Var.d, fQ04, a72Var.e);
        float fM8 = m(a72Var.c, q0(fQ04, l((int) Math.ceil(a72Var.d / 2.0f), fM7, a72Var.e), a72Var.e, a72Var.d), a72Var.b);
        float f15 = f12 + i2;
        float fB4 = gl4.b(fMin2, a72Var.f, f2);
        float fB5 = gl4.b(a72Var.b, a72Var.f, f2);
        float fB6 = gl4.b(a72Var.e, a72Var.f, f2);
        gwb gwbVar4 = new gwb(a72Var.f, i2);
        gwbVar4.a(f13, fB4, fMin2, false, true);
        if (a72Var.c > 0) {
            f4 = fM6;
            float f16 = a72Var.b;
            int iFloor = (int) Math.floor(r0 / 2.0f);
            gwbVar = gwbVar4;
            f5 = fM7;
            f3 = fM5;
            gwbVar.c(fM4, fB5, f16, iFloor, false);
            f6 = fB5;
        } else {
            gwbVar = gwbVar4;
            f3 = fM5;
            f4 = fM6;
            f5 = fM7;
            f6 = fB5;
        }
        if (a72Var.d > 0) {
            f7 = fB6;
            gwbVar.c(f3, f7, a72Var.e, (int) Math.floor(r8 / 2.0f), false);
        } else {
            f7 = fB6;
        }
        gwbVar.c(f4, 0.0f, a72Var.f, a72Var.g, true);
        if (a72Var.d > 0) {
            gwbVar.c(f5, f7, a72Var.e, (int) Math.ceil(r0 / 2.0f), false);
        }
        if (a72Var.c > 0) {
            gwb gwbVar5 = gwbVar;
            gwbVar5.c(fM8, f6, a72Var.b, (int) Math.ceil(r0 / 2.0f), false);
            gwbVar2 = gwbVar5;
        } else {
            gwbVar2 = gwbVar;
        }
        gwbVar2.a(f15, fB4, fMin2, false, true);
        return gwbVar2.d();
    }

    public static LinearLayout y(Context context, List list, int i2) {
        float measuredWidth;
        Paint paint = new Paint();
        int i3 = Resources.getSystem().getDisplayMetrics().widthPixels;
        int i4 = i2 << 1;
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(0);
        linearLayout2.setGravity(16);
        linearLayout2.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        Iterator it = list.iterator();
        float f2 = 0.0f;
        while (it.hasNext()) {
            UCTextView uCTextView = (View) it.next();
            if (uCTextView instanceof UCTextView) {
                UCTextView uCTextView2 = uCTextView;
                paint.setTextSize(uCTextView2.getTextSize());
                measuredWidth = paint.measureText(uCTextView2.getText().toString());
            } else {
                measuredWidth = uCTextView.getMeasuredWidth();
            }
            float f3 = measuredWidth + i4;
            if (f2 + f3 > i3) {
                linearLayout.addView(linearLayout2);
                linearLayout2 = new LinearLayout(context);
                linearLayout2.setOrientation(0);
                linearLayout2.setGravity(16);
                linearLayout2.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
                f2 = 0.0f;
            }
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
            layoutParams.setMarginStart(0);
            layoutParams.setMarginEnd(i2);
            linearLayout2.addView((View) uCTextView, (ViewGroup.LayoutParams) layoutParams);
            f2 += f3;
        }
        if (linearLayout2.getChildCount() > 0) {
            linearLayout.addView(linearLayout2);
        }
        return linearLayout;
    }

    public static void z(int[] iArr, int[] iArr2, int i2) {
        int i3 = 0;
        long j2 = 0;
        int i4 = 0;
        int i5 = 0;
        while (i2 > 0) {
            while (i3 < Math.min(32, i2)) {
                j2 |= iArr[i4] << i3;
                i3 += 30;
                i4++;
            }
            iArr2[i5] = (int) j2;
            j2 >>>= 32;
            i3 -= 32;
            i2 -= 32;
            i5++;
        }
    }
}
