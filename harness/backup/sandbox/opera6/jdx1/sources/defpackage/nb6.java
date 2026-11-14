package defpackage;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.os.Process;
import android.text.TextUtils;
import android.util.Range;
import android.view.View;
import androidx.camera.camera2.compat.quirk.ExtraCroppingQuirk;
import androidx.core.app.NotificationCompat;
import androidx.core.content.res.ResourcesCompat;
import com.opera.android.BrowserActivity;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.nio.ByteBuffer;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.RandomAccess;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.d;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.text.c;
import org.chromium.mojo.system.impl.CoreImpl;

/* loaded from: classes.dex */
public abstract class nb6 {
    public static final k51 b = new k51((byte) 9);
    public static final ue5 c = new ue5(1020466325, new cf5((byte) 23), false);
    public static final ue5 d = new ue5(537869268, new cf5((byte) 24), false);
    public static final ue5 e = new ue5(-1953811820, new cf5((byte) 25), false);
    public static final ue5 f = new ue5(1931194329, new cf5((byte) 26), false);
    public static final long[] g;
    public static final bxl h;
    public static final eko i;
    public static qie j;
    public final /* synthetic */ byte a = 20;

    static {
        new ue5(-266167553, new cf5((byte) 27), false);
        new ue5(-520972395, new cf5((byte) 28), false);
        g = new long[]{-5270498306774157648L, 5270498306774195053L, 19634136210L};
        h = new bxl((byte) 19);
        i = new eko((byte) 26);
    }

    public static boolean A(CoreImpl coreImpl, a26 a26Var, h3j h3jVar, mwd mwdVar) {
        evd evdVarB = h3jVar.b();
        bc6[] bc6VarArr = wbi.c;
        ro9 ro9VarI = o18.i(evdVarB);
        try {
            ro9VarI.G(wbi.c);
            wbi wbiVar = new wbi(24);
            wbiVar.b = vbi.b(ro9VarI);
            ro9VarI.h();
            aci aciVar = new aci(24);
            dx9 dx9Var = new dx9((byte) 1);
            aciVar.b = dx9Var;
            if (((slm) wbiVar.b).a == 0) {
                kgh kghVar = new kgh(16);
                ((slm) dx9Var).a = (byte) 0;
                dx9Var.c = kghVar;
                kgh kghVar2 = aciVar.b.c;
                a26Var.getClass();
                kghVar2.b = 0;
            } else {
                aciVar.b = null;
            }
            return mwdVar.S0(aciVar.b(coreImpl, new lvd(-1, 2, h3jVar.d.e)));
        } catch (Throwable th) {
            ro9VarI.h();
            throw th;
        }
    }

    public static boolean B(a26 a26Var, h3j h3jVar) {
        evd evdVarB = h3jVar.b();
        bc6[] bc6VarArr = zbi.c;
        ro9 ro9VarI = o18.i(evdVarB);
        try {
            ro9VarI.G(zbi.c);
            zbi zbiVar = new zbi(24);
            zbiVar.b = ybi.b(ro9VarI);
            ro9VarI.h();
            ybi ybiVar = zbiVar.b;
            if (((slm) ybiVar).a != 0) {
                return false;
            }
            int i2 = ybiVar.b.b;
            a26Var.getClass();
            return i2 <= 0;
        } catch (Throwable th) {
            ro9VarI.h();
            throw th;
        }
    }

    public static byte[] C(String str) {
        ByteBuffer byteBufferAllocate;
        ByteBuffer byteBufferAllocate2;
        if (str.startsWith("0x")) {
            str = str.substring(2);
        }
        int length = str.length();
        int i2 = 0;
        if (length == 0) {
            byteBufferAllocate2 = ByteBuffer.allocate(0);
        } else {
            if (length % 2 != 0) {
                byteBufferAllocate = ByteBuffer.allocate((length / 2) + 1);
                byteBufferAllocate.put((byte) Character.digit(str.charAt(0), 16));
                i2 = 1;
            } else {
                byteBufferAllocate = ByteBuffer.allocate(length / 2);
            }
            while (i2 < length) {
                int i3 = i2 + 1;
                int iDigit = Character.digit(str.charAt(i2), 16) << 4;
                i2 += 2;
                byteBufferAllocate.put((byte) (Character.digit(str.charAt(i3), 16) + iDigit));
            }
            byteBufferAllocate.flip();
            byteBufferAllocate2 = byteBufferAllocate;
        }
        byte[] bArr = new byte[byteBufferAllocate2.remaining()];
        byteBufferAllocate2.get(bArr);
        return bArr;
    }

    public static void D(long[] jArr, long[] jArr2, long[] jArr3) {
        long j2 = jArr[0];
        long j3 = jArr[1];
        long j4 = (j3 >>> 46) ^ (jArr[2] << 18);
        long j5 = ((j2 >>> 55) ^ (j3 << 9)) & 36028797018963967L;
        long j6 = j2 & 36028797018963967L;
        long j7 = jArr2[0];
        long j8 = jArr2[1];
        long j9 = (j8 >>> 46) ^ (jArr2[2] << 18);
        long j10 = ((j7 >>> 55) ^ (j8 << 9)) & 36028797018963967L;
        long j11 = j7 & 36028797018963967L;
        long[] jArr4 = new long[10];
        E(jArr3, j6, j11, jArr4, 0);
        E(jArr3, j4, j9, jArr4, 2);
        long j12 = (j6 ^ j5) ^ j4;
        long j13 = (j11 ^ j10) ^ j9;
        E(jArr3, j12, j13, jArr4, 4);
        long j14 = (j5 << 1) ^ (j4 << 2);
        long j15 = (j10 << 1) ^ (j9 << 2);
        E(jArr3, j6 ^ j14, j11 ^ j15, jArr4, 6);
        E(jArr3, j12 ^ j14, j13 ^ j15, jArr4, 8);
        long j16 = jArr4[6];
        long j17 = jArr4[8] ^ j16;
        long j18 = jArr4[7];
        long j19 = j18 ^ jArr4[9];
        long j20 = (j17 << 1) ^ j16;
        long j21 = (j17 ^ (j19 << 1)) ^ j18;
        long j22 = jArr4[0];
        long j23 = jArr4[1];
        long j24 = (j23 ^ j22) ^ jArr4[4];
        long j25 = j23 ^ jArr4[5];
        long j26 = jArr4[2];
        long j27 = ((j22 ^ j20) ^ (j26 << 4)) ^ (j26 << 1);
        long j28 = jArr4[3];
        long j29 = (((j24 ^ j21) ^ (j28 << 4)) ^ (j28 << 1)) ^ (j27 >>> 55);
        long j30 = (j25 ^ j19) ^ (j29 >>> 55);
        long j31 = ((j27 & 36028797018963967L) >>> 1) ^ ((j29 & 1) << 54);
        long j32 = j31 ^ (j31 << 1);
        long j33 = j32 ^ (j32 << 2);
        long j34 = j33 ^ (j33 << 4);
        long j35 = j34 ^ (j34 << 8);
        long j36 = j35 ^ (j35 << 16);
        long j37 = (j36 ^ (j36 << 32)) & 36028797018963967L;
        long j38 = (((j29 & 36028797018963967L) >>> 1) ^ ((j30 & 1) << 54)) ^ (j37 >>> 54);
        long j39 = j38 ^ (j38 << 1);
        long j40 = j39 ^ (j39 << 2);
        long j41 = j40 ^ (j40 << 4);
        long j42 = j41 ^ (j41 << 8);
        long j43 = j42 ^ (j42 << 16);
        long j44 = (j43 ^ (j43 << 32)) & 36028797018963967L;
        long j45 = (j30 >>> 1) ^ (j44 >>> 54);
        long j46 = j45 ^ (j45 << 1);
        long j47 = j46 ^ (j46 << 2);
        long j48 = j47 ^ (j47 << 4);
        long j49 = j48 ^ (j48 << 8);
        long j50 = j49 ^ (j49 << 16);
        long j51 = j50 ^ (j50 << 32);
        jArr3[0] = j22;
        long j52 = (j24 ^ j37) ^ j26;
        jArr3[1] = j52;
        long j53 = ((j25 ^ j44) ^ j37) ^ j28;
        jArr3[2] = j53;
        long j54 = j51 ^ j44;
        jArr3[3] = j54;
        long j55 = j51 ^ jArr4[2];
        jArr3[4] = j55;
        long j56 = jArr4[3];
        jArr3[5] = j56;
        jArr3[0] = j22 ^ (j52 << 55);
        jArr3[1] = (j52 >>> 9) ^ (j53 << 46);
        jArr3[2] = (j53 >>> 18) ^ (j54 << 37);
        jArr3[3] = (j54 >>> 27) ^ (j55 << 28);
        jArr3[4] = (j55 >>> 36) ^ (j56 << 19);
        jArr3[5] = j56 >>> 45;
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
        long j8 = jArr[((int) j2) & 3];
        long j9 = 0;
        int i3 = 47;
        do {
            int i4 = (int) (j2 >>> i3);
            long j10 = (jArr[i4 & 7] ^ (jArr[(i4 >>> 3) & 7] << 3)) ^ (jArr[(i4 >>> 6) & 7] << 6);
            j8 ^= j10 << i3;
            j9 ^= j10 >>> (-i3);
            i3 -= 9;
        } while (i3 > 0);
        jArr2[i2] = 36028797018963967L & j8;
        jArr2[i2 + 1] = (j8 >>> 55) ^ (j9 << 9);
    }

    public static final void F(e3c e3cVar) {
        ui6.e0(e3cVar).E();
    }

    public static boolean G() {
        if (!c.m(Build.MANUFACTURER, "Samsung", true) && !c.m(Build.BRAND, "Samsung", true)) {
            return false;
        }
        LinkedHashMap linkedHashMap = ExtraCroppingQuirk.a;
        String str = Build.MODEL;
        Locale locale = Locale.ROOT;
        if (!linkedHashMap.containsKey(str.toUpperCase(locale))) {
            return false;
        }
        Range range = (Range) linkedHashMap.get(str.toUpperCase(locale));
        if (range != null) {
            return range.contains((Range) Integer.valueOf(Build.VERSION.SDK_INT));
        }
        return true;
    }

    public static final c8e H(c8e c8eVar, t71 t71Var, gbc gbcVar, dil dilVar) {
        return c8eVar.d(new gac(t71Var, gbcVar, dilVar));
    }

    public static void I(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] jArr4 = new long[8];
        D(jArr, jArr2, jArr4);
        O(jArr4, jArr3);
    }

    public static ArrayList J(Iterable iterable) {
        iterable.getClass();
        if (iterable instanceof Collection) {
            return new ArrayList((Collection) iterable);
        }
        Iterator it = iterable.iterator();
        ArrayList arrayList = new ArrayList();
        ipe.f(arrayList, it);
        return arrayList;
    }

    public static ArrayList K(Object... objArr) {
        int length = objArr.length;
        scd.q(length, "arraySize");
        ArrayList arrayList = new ArrayList(sgb.W(length + 5 + (length / 10)));
        Collections.addAll(arrayList, objArr);
        return arrayList;
    }

    public static c8e L(c8e c8eVar, hyf hyfVar, td3 td3Var, kr5 kr5Var, float f2, kh3 kh3Var, int i2) {
        if ((i2 & 4) != 0) {
            td3Var = rbe.f;
        }
        td3 td3Var2 = td3Var;
        if ((i2 & 16) != 0) {
            f2 = 1.0f;
        }
        return c8eVar.d(new iyf(hyfVar, td3Var2, kr5Var, f2, kh3Var));
    }

    public static final void M(lqj lqjVar, kw1 kw1Var, int i2) {
        while (true) {
            int i3 = lqjVar.v;
            if (i2 > i3 && i2 < lqjVar.u) {
                return;
            }
            if (i3 == 0 && i2 == 0) {
                return;
            }
            lqjVar.L();
            if (lqjVar.x(lqjVar.v)) {
                kw1Var.u();
            }
            lqjVar.i();
        }
    }

    public static p4j N(izd izdVar, int i2, String str) throws lv0 {
        p4j p4jVar = new p4j(new u9d(i2));
        for (int i3 = 0; i3 < i2; i3++) {
            String strH = izdVar.h();
            if (strH == null) {
                throw new lv0(str);
            }
            p4jVar.add(strH);
        }
        return z4j.a(p4jVar);
    }

    public static void O(long[] jArr, long[] jArr2) {
        long j2 = jArr[0];
        long j3 = jArr[1];
        long j4 = jArr[2];
        long j5 = jArr[3];
        long j6 = jArr[4];
        long j7 = jArr[5];
        long j8 = j5 ^ ((((j7 >>> 35) ^ (j7 >>> 32)) ^ (j7 >>> 29)) ^ (j7 >>> 28));
        long j9 = (j4 ^ ((((j7 << 29) ^ (j7 << 32)) ^ (j7 << 35)) ^ (j7 << 36))) ^ ((((j6 >>> 35) ^ (j6 >>> 32)) ^ (j6 >>> 29)) ^ (j6 >>> 28));
        long j10 = j2 ^ ((((j8 << 29) ^ (j8 << 32)) ^ (j8 << 35)) ^ (j8 << 36));
        long j11 = (j3 ^ ((((j6 << 29) ^ (j6 << 32)) ^ (j6 << 35)) ^ (j6 << 36))) ^ ((((j8 >>> 35) ^ (j8 >>> 32)) ^ (j8 >>> 29)) ^ (j8 >>> 28));
        long j12 = j9 >>> 35;
        jArr2[0] = (((j10 ^ j12) ^ (j12 << 3)) ^ (j12 << 6)) ^ (j12 << 7);
        jArr2[1] = j11;
        jArr2[2] = j9 & 34359738367L;
    }

    public static Intent P(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, String str) {
        return Build.VERSION.SDK_INT >= 33 ? context.registerReceiver(broadcastReceiver, intentFilter, str, null, 2) : context.registerReceiver(broadcastReceiver, intentFilter, str, null, 0);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: pxb */
    public static final c6n Q(m3c m3cVar) throws pxb {
        c6n c6nVar = m3cVar.o;
        if (c6nVar != null) {
            return c6nVar;
        }
        throw vep.q("Required value was null.");
    }

    public static List R(List list) {
        return list instanceof h1b ? ((h1b) list).z() : list instanceof njc ? ((njc) list).a : list instanceof RandomAccess ? new ljc(list) : new njc(list);
    }

    public static boolean S(Activity activity, String str) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 < 33 && TextUtils.equals("android.permission.POST_NOTIFICATIONS", str)) {
            return false;
        }
        if (i2 < 32 && i2 == 31) {
            try {
                return ((Boolean) PackageManager.class.getMethod("shouldShowRequestPermissionRationale", String.class).invoke(activity.getApplication().getPackageManager(), str)).booleanValue();
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
                return activity.shouldShowRequestPermissionRationale(str);
            }
        }
        return activity.shouldShowRequestPermissionRationale(str);
    }

    public static void T(long[] jArr, long[] jArr2, int i2) {
        long[] jArr3 = new long[6];
        ui6.t(jArr, jArr3, 3);
        while (true) {
            O(jArr3, jArr2);
            i2--;
            if (i2 <= 0) {
                return;
            } else {
                ui6.t(jArr2, jArr3, 3);
            }
        }
    }

    public static final long U(long j2) {
        boolean zK = pn7.k(j2);
        if (zK) {
            return pn7.f(pn7.m(j2, cs5.y0(999999L, un7.b)));
        }
        if (!zK) {
            return 0L;
        }
        h9o.p();
        return 0L;
    }

    public static String V(long j2) {
        int i2 = (int) (j2 >> 32);
        int i3 = (int) (j2 & 4294967295L);
        return Float.intBitsToFloat(i2) == Float.intBitsToFloat(i3) ? sko.k("CornerRadius.circular(", scd.m0(Float.intBitsToFloat(i2)), ")") : sko.l("CornerRadius.elliptical(", scd.m0(Float.intBitsToFloat(i2)), ", ", scd.m0(Float.intBitsToFloat(i3)), ")");
    }

    public static AbstractList W(xq9 xq9Var, List list) {
        return list instanceof RandomAccess ? new pjc(xq9Var, list) : new qjc(xq9Var, list);
    }

    public static final void X(ih5 ih5Var, c8e c8eVar, int i2, n27 n27Var, ndc ndcVar, rki rkiVar, d2c d2cVar, oag oagVar) {
        bh5.To.getClass();
        y4h.o(ih5Var, oagVar, ujp.e);
        y4h.o(ih5Var, c8eVar, new ve5((byte) 24));
        y4h.o(ih5Var, n27Var, new ve5((byte) 25));
        y4h.o(ih5Var, ndcVar, new ve5((byte) 16));
        y4h.o(ih5Var, rkiVar, new ve5((byte) 17));
        y4h.o(ih5Var, d2cVar, new ve5((byte) 18));
        y4h.o(ih5Var, Integer.valueOf(i2), ujp.g);
    }

    public static final a2k Y(jae jaeVar, ih5 ih5Var) {
        return s((iae) ((vt9) ih5Var).j(fed.a), jaeVar);
    }

    public static final void a(Function1 function1, c8e c8eVar, Function1 function12, Function1 function13, k51 k51Var, ih5 ih5Var, int i2) {
        int i3;
        k51 k51Var2;
        vt9 vt9Var = (vt9) ih5Var;
        vt9Var.Y(-180024211);
        if ((i2 & 6) == 0) {
            i3 = (vt9Var.h(function1) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= vt9Var.f(c8eVar) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= vt9Var.h(function12) ? NotificationCompat.FLAG_LOCAL_ONLY : NotificationCompat.FLAG_HIGH_PRIORITY;
        }
        if ((i2 & 3072) == 0) {
            i3 |= vt9Var.h(function13) ? 2048 : 1024;
        }
        int i4 = i3 | 24576;
        if (vt9Var.N(i4 & 1, (i4 & 9363) != 9362)) {
            int iHashCode = Long.hashCode(vt9Var.T);
            c8e c8eVarP = qyn.P(vt9Var, c8eVar.d(pf9.b).d(ug9.b).d(wg9.b).d(sg9.b));
            n27 n27Var = (n27) vt9Var.j(mi5.h);
            d2c d2cVar = (d2c) vt9Var.j(mi5.n);
            oag oagVarL = vt9Var.l();
            ndc ndcVar = (ndc) vt9Var.j(tuc.a);
            rki rkiVar = (rki) vt9Var.j(ovc.a);
            k51 k51Var3 = b;
            if (function12 != null) {
                vt9Var.W(1313917368);
                Function0 function0N = n(function1, vt9Var, i4 & 14);
                vt9Var.a0();
                if (vt9Var.S) {
                    vt9Var.k(function0N);
                } else {
                    vt9Var.j0();
                }
                X(vt9Var, c8eVarP, iHashCode, n27Var, ndcVar, rkiVar, d2cVar, oagVarL);
                y4h.o(vt9Var, function12, new ve5((byte) 19));
                y4h.o(vt9Var, k51Var3, new ve5((byte) 20));
                y4h.o(vt9Var, function13, new ve5((byte) 21));
                vt9Var.p(true);
                vt9Var.p(false);
            } else {
                vt9Var.W(1314774735);
                Function0 function0N2 = n(function1, vt9Var, i4 & 14);
                vt9Var.R(null, 125, 1, null);
                vt9Var.r = true;
                if (vt9Var.S) {
                    vt9Var.k(function0N2);
                } else {
                    vt9Var.j0();
                }
                X(vt9Var, c8eVarP, iHashCode, n27Var, ndcVar, rkiVar, d2cVar, oagVarL);
                y4h.o(vt9Var, k51Var3, new ve5((byte) 22));
                y4h.o(vt9Var, function13, new ve5((byte) 23));
                vt9Var.p(true);
                vt9Var.p(false);
            }
            k51Var2 = k51Var3;
        } else {
            vt9Var.Q();
            k51Var2 = k51Var;
        }
        znh znhVarR = vt9Var.r();
        if (znhVarR != null) {
            znhVarR.d = new lc1(function1, c8eVar, function12, function13, k51Var2, i2);
        }
    }

    public static final void b(boolean z, Function0 function0, ih5 ih5Var, int i2, int i3) {
        boolean z2;
        int i4;
        boolean z3;
        vt9 vt9Var = (vt9) ih5Var;
        vt9Var.Y(-361453782);
        int i5 = i3 & 1;
        if (i5 != 0) {
            i4 = i2 | 6;
            z2 = z;
        } else if ((i2 & 6) == 0) {
            z2 = z;
            i4 = (vt9Var.g(z2) ? 4 : 2) | i2;
        } else {
            z2 = z;
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= vt9Var.h(function0) ? 32 : 16;
        }
        if (vt9Var.N(i4 & 1, (i4 & 19) != 18)) {
            z3 = i5 != 0 ? true : z2;
            yje yjeVar = (yje) vt9Var.j(vuc.a);
            if (yjeVar == null) {
                vt9Var.W(950836184);
                View view = (View) vt9Var.j(j41.f);
                while (true) {
                    if (view == null) {
                        yjeVar = null;
                        break;
                    }
                    Object tag = view.getTag(2131365018);
                    yje yjeVar2 = tag instanceof yje ? (yje) tag : null;
                    if (yjeVar2 != null) {
                        yjeVar = yjeVar2;
                        break;
                    } else {
                        Object objH = y7h.h(view);
                        view = objH instanceof View ? (View) objH : null;
                    }
                }
                vt9Var.p(false);
            } else {
                vt9Var.W(950834231);
                vt9Var.p(false);
            }
            if (yjeVar == null) {
                vt9Var.W(535274673);
                yjeVar = (lcf) vt9Var.j(mvc.a);
                if (yjeVar == null) {
                    vt9Var.W(1208426157);
                    View view2 = (View) vt9Var.j(j41.f);
                    while (true) {
                        if (view2 == null) {
                            yjeVar = null;
                            break;
                        }
                        Object tag2 = view2.getTag(2131365019);
                        yje yjeVar3 = tag2 instanceof lcf ? (lcf) tag2 : null;
                        if (yjeVar3 != null) {
                            yjeVar = yjeVar3;
                            break;
                        } else {
                            Object objH2 = y7h.h(view2);
                            view2 = objH2 instanceof View ? (View) objH2 : null;
                        }
                    }
                    vt9Var.p(false);
                } else {
                    vt9Var.W(1208423708);
                    vt9Var.p(false);
                }
                if (yjeVar == null) {
                    vt9Var.W(1208428160);
                    yje baseContext = (Context) vt9Var.j(j41.b);
                    while (true) {
                        if (!(baseContext instanceof ContextWrapper)) {
                            baseContext = null;
                            break;
                        } else if (baseContext instanceof lcf) {
                            break;
                        } else {
                            baseContext = ((ContextWrapper) baseContext).getBaseContext();
                        }
                    }
                    yjeVar = (lcf) baseContext;
                    vt9Var.p(false);
                } else {
                    vt9Var.W(1208423789);
                    vt9Var.p(false);
                }
                vt9Var.p(false);
            } else {
                vt9Var.W(535271790);
                vt9Var.p(false);
            }
            if (yjeVar == null) {
                qp2.n("No NavigationEventDispatcherOwner was provided via LocalNavigationEventDispatcherOwner and no OnBackPressedDispatcherOwner was provided via LocalOnBackPressedDispatcherOwner. Please provide one of the two.");
                return;
            }
            boolean zF = vt9Var.f(yjeVar);
            Object objK = vt9Var.K();
            zpa zpaVar = hh5.a;
            if (zF || objK == zpaVar) {
                yje yjeVar4 = yjeVar instanceof yje ? yjeVar : null;
                xje navigationEventDispatcher = yjeVar4 != null ? yjeVar4.getNavigationEventDispatcher() : null;
                lcf lcfVar = yjeVar instanceof lcf ? (lcf) yjeVar : null;
                objK = new mz2(navigationEventDispatcher, lcfVar != null ? lcfVar.getOnBackPressedDispatcher() : null);
                vt9Var.g0(objK);
            }
            mz2 mz2Var = (mz2) objK;
            long j2 = vt9Var.T;
            boolean zF2 = vt9Var.f(mz2Var) | vt9Var.e(j2);
            Object objK2 = vt9Var.K();
            Object obj = objK2;
            if (zF2 || objK2 == zpaVar) {
                qf5 qf5Var = new qf5(new nz2(j2, yjeVar));
                qf5Var.c = new mf5((byte) 8);
                vt9Var.g0(qf5Var);
                obj = qf5Var;
            }
            qf5 qf5Var2 = (qf5) obj;
            vt9Var.W(-585307852);
            boolean zH = vt9Var.h(qf5Var2) | ((i4 & 112) == 32);
            Object objK3 = vt9Var.K();
            if (zH || objK3 == zpaVar) {
                objK3 = new x2(qf5Var2, function0, (byte) 28);
                vt9Var.g0(objK3);
            }
            rm5.L(vt9Var, (Function0) objK3);
            Boolean boolValueOf = Boolean.valueOf(z3);
            int i6 = i4 & 14;
            boolean zH2 = vt9Var.h(qf5Var2) | (i6 == 4);
            Object objK4 = vt9Var.K();
            if (zH2 || objK4 == zpaVar) {
                objK4 = new oz2((byte) 0, qf5Var2, z3);
                vt9Var.g0(objK4);
            }
            lcp.a(boolValueOf, qf5Var2, null, (Function1) objK4, vt9Var, i6);
            boolean zH3 = vt9Var.h(mz2Var) | vt9Var.h(qf5Var2);
            Object objK5 = vt9Var.K();
            if (zH3 || objK5 == zpaVar) {
                objK5 = new cv2(mz2Var, qf5Var2, (byte) 2);
                vt9Var.g0(objK5);
            }
            rm5.a(mz2Var, qf5Var2, (Function1) objK5, vt9Var);
            vt9Var.p(false);
        } else {
            vt9Var.Q();
            z3 = z2;
        }
        znh znhVarR = vt9Var.r();
        if (znhVarR != null) {
            znhVarR.d = new pz2(i2, i3, function0, z3);
        }
    }

    public static final void c(c8e c8eVar, hyf hyfVar, String str, String str2, ih5 ih5Var, int i2) {
        c8e c8eVar2;
        hyf hyfVar2;
        int i3;
        hyf hyfVarA;
        c8e c8eVar3;
        boolean z;
        c8e c8eVar4;
        hp7 hp7Var;
        vt9 vt9Var = (vt9) ih5Var;
        vt9Var.Y(-1042441861);
        int i4 = i2 | 22 | (vt9Var.f(str) ? NotificationCompat.FLAG_LOCAL_ONLY : NotificationCompat.FLAG_HIGH_PRIORITY) | (vt9Var.f(str2) ? 2048 : 1024);
        if (vt9Var.N(i4 & 1, (i4 & 1171) != 1170)) {
            vt9Var.S();
            if ((i2 & 1) == 0 || vt9Var.x()) {
                i3 = i4 & (-113);
                hyfVarA = iza.a((dl7) tk7.m.getValue(), vt9Var);
                c8eVar3 = z7e.b;
            } else {
                vt9Var.Q();
                c8eVar3 = c8eVar;
                i3 = i4 & (-113);
                hyfVarA = hyfVar;
            }
            vt9Var.q();
            c8e c8eVarX = a26.X(c8eVar3.d(mpj.a), 48.0f);
            db5 db5VarA = cb5.a(new x62(24.0f, true, new t40((byte) 19)), rbe.o, vt9Var, 54);
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
            hp7 hp7Var2 = ua5.a;
            xf8.j(hyfVarA, "Empty", null, null, null, 0.0f, new kh3(((sa5) vt9Var.j(hp7Var2)).e, 13), vt9Var, 56, 60);
            hyf hyfVar3 = hyfVarA;
            if (str != null) {
                vt9Var.W(1930492549);
                c8eVar4 = c8eVar3;
                hp7Var = hp7Var2;
                ijl.b(str, null, 0L, 0L, null, 0L, null, new pel(3), 0L, 0, false, 0, 0, ((wam) vt9Var.j(abm.a)).g, vt9Var, (i3 >> 6) & 14, 0, 130046);
                vt9Var = vt9Var;
                z = false;
                vt9Var.p(false);
            } else {
                z = false;
                c8eVar4 = c8eVar3;
                hp7Var = hp7Var2;
                vt9Var.W(-284130895);
                vt9Var.p(false);
            }
            if (str2 != null) {
                vt9Var.W(-284085542);
                vt9 vt9Var2 = vt9Var;
                ijl.b(str2, null, ((sa5) vt9Var.j(hp7Var)).s, 0L, null, 0L, null, new pel(3), 0L, 0, false, 0, 0, ((wam) vt9Var.j(abm.a)).k, vt9Var2, (i3 >> 9) & 14, 0, 130042);
                vt9Var = vt9Var2;
                vt9Var.p(false);
            } else {
                vt9Var.W(-283878927);
                vt9Var.p(z);
            }
            vt9Var.p(true);
            hyfVar2 = hyfVar3;
            c8eVar2 = c8eVar4;
        } else {
            vt9Var.Q();
            c8eVar2 = c8eVar;
            hyfVar2 = hyfVar;
        }
        znh znhVarR = vt9Var.r();
        if (znhVarR != null) {
            znhVarR.d = new px0(c8eVar2, hyfVar2, str, str2, i2, (byte) 5);
        }
    }

    public static void d(long[] jArr, long[] jArr2, long[] jArr3) {
        jArr3[0] = jArr[0] ^ jArr2[0];
        jArr3[1] = jArr[1] ^ jArr2[1];
        jArr3[2] = jArr[2] ^ jArr2[2];
        jArr3[3] = jArr[3] ^ jArr2[3];
        jArr3[4] = jArr[4] ^ jArr2[4];
        jArr3[5] = jArr[5] ^ jArr2[5];
    }

    /* JADX WARN: Code restructure failed: missing block: B:277:0x0491, code lost:
    
        r4 = r2[r15];
        r2 = r4.i;
        r6 = r4.f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:278:0x0498, code lost:
    
        if (r6 == null) goto L280;
     */
    /* JADX WARN: Code restructure failed: missing block: B:279:0x049a, code lost:
    
        r6 = r6.i;
     */
    /* JADX WARN: Code restructure failed: missing block: B:280:0x049d, code lost:
    
        r6 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:281:0x049f, code lost:
    
        if (r13 == r10) goto L283;
     */
    /* JADX WARN: Code restructure failed: missing block: B:282:0x04a1, code lost:
    
        r6 = r1[r15 + 1].i;
     */
    /* JADX WARN: Code restructure failed: missing block: B:283:0x04a8, code lost:
    
        if (r10 != r12) goto L288;
     */
    /* JADX WARN: Code restructure failed: missing block: B:284:0x04aa, code lost:
    
        r6 = r19[r15].f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:285:0x04ae, code lost:
    
        if (r6 == null) goto L287;
     */
    /* JADX WARN: Code restructure failed: missing block: B:286:0x04b0, code lost:
    
        r6 = r6.i;
     */
    /* JADX WARN: Code restructure failed: missing block: B:287:0x04b3, code lost:
    
        r6 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:288:0x04b5, code lost:
    
        r4 = r4.e();
        r8 = r15 + 1;
        r9 = r2[r8].e();
     */
    /* JADX WARN: Code restructure failed: missing block: B:289:0x04c1, code lost:
    
        if (r3 == null) goto L291;
     */
    /* JADX WARN: Code restructure failed: missing block: B:290:0x04c3, code lost:
    
        r7 = r3.P[r15];
        r17 = r1;
        r1 = r7.i;
     */
    /* JADX WARN: Code restructure failed: missing block: B:291:0x04cc, code lost:
    
        r17 = r1;
        r7 = r11.P[r8].f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:292:0x04d4, code lost:
    
        if (r7 == null) goto L294;
     */
    /* JADX WARN: Code restructure failed: missing block: B:293:0x04d6, code lost:
    
        r1 = r7.i;
     */
    /* JADX WARN: Code restructure failed: missing block: B:294:0x04d9, code lost:
    
        r1 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:295:0x04db, code lost:
    
        r5 = r2[r8].i;
     */
    /* JADX WARN: Code restructure failed: missing block: B:296:0x04df, code lost:
    
        if (r7 == null) goto L298;
     */
    /* JADX WARN: Code restructure failed: missing block: B:297:0x04e1, code lost:
    
        r9 = r9 + r7.e();
     */
    /* JADX WARN: Code restructure failed: missing block: B:298:0x04e6, code lost:
    
        r7 = r17[r8].e() + r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:299:0x04ed, code lost:
    
        if (r2 == null) goto L314;
     */
    /* JADX WARN: Code restructure failed: missing block: B:300:0x04ef, code lost:
    
        if (r6 == null) goto L314;
     */
    /* JADX WARN: Code restructure failed: missing block: B:301:0x04f1, code lost:
    
        if (r1 == null) goto L314;
     */
    /* JADX WARN: Code restructure failed: missing block: B:302:0x04f3, code lost:
    
        if (r5 == null) goto L314;
     */
    /* JADX WARN: Code restructure failed: missing block: B:303:0x04f5, code lost:
    
        if (r10 != r12) goto L305;
     */
    /* JADX WARN: Code restructure failed: missing block: B:304:0x04f7, code lost:
    
        r7 = r12.P[r15].e();
     */
    /* JADX WARN: Code restructure failed: missing block: B:305:0x04ff, code lost:
    
        r4 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:306:0x0500, code lost:
    
        if (r10 != r0) goto L308;
     */
    /* JADX WARN: Code restructure failed: missing block: B:307:0x0502, code lost:
    
        r9 = r0.P[r8].e();
     */
    /* JADX WARN: Code restructure failed: missing block: B:308:0x050a, code lost:
    
        r8 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:309:0x050b, code lost:
    
        if (r22 == false) goto L312;
     */
    /* JADX WARN: Code restructure failed: missing block: B:310:0x050d, code lost:
    
        r9 = 8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:312:0x0511, code lost:
    
        r9 = 5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:313:0x0513, code lost:
    
        r17 = r3;
        r18 = r13;
        r13 = 8;
        r41.b(r2, r6, r4, 0.5f, r1, r5, r8, r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:314:0x0523, code lost:
    
        r17 = r3;
        r18 = r13;
        r13 = 8;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0266  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x02ad  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x0345  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x0361  */
    /* JADX WARN: Removed duplicated region for block: B:387:0x064e  */
    /* JADX WARN: Removed duplicated region for block: B:390:0x0659  */
    /* JADX WARN: Removed duplicated region for block: B:391:0x065c  */
    /* JADX WARN: Removed duplicated region for block: B:394:0x0662  */
    /* JADX WARN: Removed duplicated region for block: B:395:0x0665  */
    /* JADX WARN: Removed duplicated region for block: B:397:0x0669  */
    /* JADX WARN: Removed duplicated region for block: B:402:0x0679  */
    /* JADX WARN: Removed duplicated region for block: B:404:0x067d A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:414:0x0699 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00f3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void e(defpackage.vo5 r40, defpackage.jfc r41, java.util.ArrayList r42, int r43) {
        /*
            Method dump skipped, instructions count: 1702
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nb6.e(vo5, jfc, java.util.ArrayList, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void f(nt5 r4) throws pxb {
        /*
            boolean r0 = r4 instanceof defpackage.a17
            if (r0 == 0) goto L13
            r0 = r4
            a17 r0 = (defpackage.a17) r0
            int r1 = r0.u
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.u = r1
            goto L18
        L13:
            a17 r0 = new a17
            r0.<init>(r4)
        L18:
            java.lang.Object r4 = r0.t
            px5 r1 = px5.a
            int r2 = r0.u
            r3 = 1
            if (r2 == 0) goto L2d
            if (r2 == r3) goto L29
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            qp2.n(r4)
            return
        L29:
            defpackage.ybh.y(r4)
            goto L45
        L2d:
            defpackage.ybh.y(r4)
            r0.u = r3
            nh4 r4 = new nh4
            mt5 r0 = hib.b(r0)
            r4.<init>(r3, r0)
            r4.s()
            java.lang.Object r4 = r4.q()
            if (r4 != r1) goto L45
            return
        L45:
            defpackage.t3p.v()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nb6.f(nt5):void");
    }

    public static final void g(d44 d44Var) {
        d44Var.d(new IOException("Channel was cancelled"));
    }

    public static int h(Context context, String str) {
        if (str != null) {
            return (Build.VERSION.SDK_INT >= 33 || !TextUtils.equals("android.permission.POST_NOTIFICATIONS", str)) ? context.checkPermission(str, Process.myPid(), Process.myUid()) : new l2f(context).b.areNotificationsEnabled() ? 0 : -1;
        }
        t3p.q("permission must be non-null");
        return 0;
    }

    public static float i(float f2, float f3, float f4) {
        return f2 < f3 ? f3 : f2 > f4 ? f4 : f2;
    }

    public static int j(int i2, int i3, int i4) {
        return i2 < i3 ? i3 : i2 > i4 ? i4 : i2;
    }

    public static final long k(ih5 ih5Var, int i2) {
        vt9 vt9Var = (vt9) ih5Var;
        Context context = (Context) vt9Var.j(j41.b);
        Resources resources = (Resources) vt9Var.j(j41.c);
        Resources.Theme theme = context.getTheme();
        ThreadLocal threadLocal = ResourcesCompat.a;
        return cs5.c(resources.getColor(i2, theme));
    }

    public static final cw l(f99 f99Var, f99 f99Var2, f99 f99Var3, dr9 dr9Var) {
        return new cw(new f99[]{f99Var, f99Var2, f99Var3}, dr9Var, (byte) 7);
    }

    public static final if1 m(if1 if1Var) {
        if1 if1VarC = if1Var.c();
        int iB = if1VarC.b();
        for (int i2 = 0; i2 < iB; i2++) {
            if1VarC.e(if1Var.a(i2), i2);
        }
        return if1VarC;
    }

    public static final Function0 n(Function1 function1, ih5 ih5Var, int i2) {
        vt9 vt9Var = (vt9) ih5Var;
        int iHashCode = Long.hashCode(vt9Var.T);
        Context context = (Context) vt9Var.j(j41.b);
        tt9 tt9VarB = mkh.B(vt9Var);
        vji vjiVar = (vji) vt9Var.j(xji.a);
        View view = (View) vt9Var.j(j41.f);
        boolean zH = vt9Var.h(context) | ((((i2 & 14) ^ 6) > 4 && vt9Var.f(function1)) || (i2 & 6) == 4) | vt9Var.h(tt9VarB) | vt9Var.h(vjiVar) | vt9Var.d(iHashCode) | vt9Var.h(view);
        Object objK = vt9Var.K();
        if (zH || objK == hh5.a) {
            mc1 mc1Var = new mc1(context, function1, tt9VarB, vjiVar, iHashCode, view);
            vt9Var.g0(mc1Var);
            objK = mc1Var;
        }
        return (Function0) objK;
    }

    public static LayerDrawable o(BrowserActivity browserActivity, int i2, qw0 qw0Var, zw0 zw0Var) {
        return exg.l(browserActivity, i2, weg.g.l(browserActivity), qw0Var, zw0Var, f03.t(2130969327, browserActivity, 2131101243), weg.h.k(browserActivity), Integer.valueOf(weg.i.k(browserActivity)));
    }

    public static final Object p(long j2, mt5 mt5Var) {
        if (j2 <= 0) {
            return Unit.a;
        }
        nh4 nh4Var = new nh4(1, hib.b(mt5Var));
        nh4Var.s();
        if (j2 < Long.MAX_VALUE) {
            x(nh4Var.e).l(j2, nh4Var);
        }
        Object objQ = nh4Var.q();
        return objQ == px5.a ? objQ : Unit.a;
    }

    public static final Object q(long j2, mt5 mt5Var) {
        Object objP = p(U(j2), mt5Var);
        return objP == px5.a ? objP : Unit.a;
    }

    public static final boolean r(long j2, long j3) {
        return j2 == j3;
    }

    public static final a2k s(iae iaeVar, jae jaeVar) {
        int iOrdinal = jaeVar.ordinal();
        if (iOrdinal == 0) {
            iaeVar.getClass();
            return iae.b;
        }
        if (iOrdinal == 1) {
            iaeVar.getClass();
            return iae.c;
        }
        if (iOrdinal == 2) {
            iaeVar.getClass();
            return iae.d;
        }
        if (iOrdinal == 3) {
            iaeVar.getClass();
            return iae.e;
        }
        if (iOrdinal == 4) {
            iaeVar.getClass();
            return iae.f;
        }
        if (iOrdinal == 5) {
            iaeVar.getClass();
            return iae.g;
        }
        h9o.p();
        return null;
    }

    public static ColorStateList v(int i2, Context context) {
        return ResourcesCompat.a(context.getResources(), i2, context.getTheme());
    }

    public static final z07 x(CoroutineContext coroutineContext) {
        z07 z07Var = coroutineContext.get(d.Hq);
        z07 z07Var2 = z07Var instanceof z07 ? z07Var : null;
        return z07Var2 == null ? kp6.a : z07Var2;
    }

    public abstract int t(View view, int i2, int i3);

    public final String toString() {
        switch (this.a) {
            case 20:
                return "Alignment:".concat(w());
            default:
                return super.toString();
        }
    }

    public r4a u() {
        return new r4a();
    }

    public abstract String w();

    public abstract int y(int i2, View view);

    public int z(int i2, int i3) {
        return i2;
    }
}
