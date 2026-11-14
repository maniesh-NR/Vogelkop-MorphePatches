package defpackage;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.util.Patterns;
import androidx.core.app.NotificationCompat;
import com.google.common.util.concurrent.ListenableFuture;
import com.opera.android.BrowserActivity;
import com.opera.android.FullscreenWebActivity;
import com.opera.android.OperaApplication;
import com.opera.android.import_data.ImportChromePasswordsActivity;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.regex.Pattern;
import java.util.zip.DeflaterOutputStream;
import java.util.zip.InflaterInputStream;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.c;
import org.chromium.content.browser.MediaSessionImpl;
import org.json.JSONObject;

/* loaded from: classes.dex */
public abstract class k1g {
    public static final int[] a = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 62, -1, -1, -1, 63, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, -1, -1, -1, -2, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, -1, -1, -1, -1, -1, -1, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
    public static final ue5 b = new ue5(-441288031, new gf5((byte) 14), false);
    public static final o91 c;
    public static final o91 d;
    public static final o91 e;
    public static final Object f;
    public static final int[] g;
    public static final iip h;

    static {
        new ue5(-454412089, new ef5((byte) 29), false);
        c = new o91(1000);
        new o91(1007);
        d = new o91(1008);
        e = new o91(1002);
        f = new Object();
        g = new int[]{-1, -1, -1, -1, -1, -1, -1, -2, -1, -1, -1, -1, -1, -1};
        h = new iip((byte) 9);
    }

    public static final dl7 A(l01 l01Var) {
        int iOrdinal = l01Var.ordinal();
        if (iOrdinal == 0) {
            return (dl7) tk7.u.getValue();
        }
        if (iOrdinal == 1) {
            return (dl7) tk7.e.getValue();
        }
        if (iOrdinal == 2) {
            return (dl7) tk7.J.getValue();
        }
        if (iOrdinal == 3) {
            return (dl7) tk7.H.getValue();
        }
        if (iOrdinal == 4) {
            return (dl7) tk7.I.getValue();
        }
        h9o.p();
        return null;
    }

    public static final int B(jxf jxfVar) {
        return (int) (jxfVar.e == fsf.a ? jxfVar.g() & 4294967295L : jxfVar.g() >> 32);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: oye */
    public static final String E(l01 l01Var, ih5 ih5Var) throws oye {
        int iOrdinal = l01Var.ordinal();
        if (iOrdinal == 0) {
            vt9 vt9Var = (vt9) ih5Var;
            vt9Var.W(-579433631);
            String strQ = uyg.q((shk) ahk.N0.getValue(), vt9Var);
            vt9Var.p(false);
            return strQ;
        }
        if (iOrdinal == 1) {
            vt9 vt9Var2 = (vt9) ih5Var;
            vt9Var2.W(-780442203);
            vt9Var2.p(false);
            return "CELO";
        }
        if (iOrdinal == 2) {
            vt9 vt9Var3 = (vt9) ih5Var;
            vt9Var3.W(-779858034);
            vt9Var3.p(false);
            return "USDT";
        }
        if (iOrdinal == 3) {
            vt9 vt9Var4 = (vt9) ih5Var;
            vt9Var4.W(-779823331);
            vt9Var4.p(false);
            return "USDC";
        }
        if (iOrdinal != 4) {
            throw fki.m((vt9) ih5Var, -579434853, false);
        }
        vt9 vt9Var5 = (vt9) ih5Var;
        vt9Var5.W(-779788601);
        vt9Var5.p(false);
        return "USDM";
    }

    public static Object F(Future future) {
        Object obj;
        boolean z = false;
        while (true) {
            try {
                obj = future.get();
                break;
            } catch (InterruptedException unused) {
                z = true;
            } catch (Throwable th) {
                if (z) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        return obj;
    }

    public static q0b G(Object obj) {
        return obj == null ? q0b.c : new q0b(obj, (byte) 0);
    }

    public static void H(int[] iArr, int[] iArr2) {
        int[] iArr3 = new int[16];
        int[] iArr4 = new int[14];
        m(0, 0, iArr, iArr3);
        b0(1, iArr3);
        b0(-1, iArr3);
        q(0, 0, iArr3, iArr4);
        q(8, 7, iArr3, iArr4);
        scd.U(g, iArr4, iArr4);
        o(0, 0, iArr4, iArr2);
        o(7, 8, iArr4, iArr2);
    }

    public static final boolean I(MediaSessionImpl mediaSessionImpl) {
        Integer num;
        return (mediaSessionImpl == null || (num = (Integer) mzg.h(mediaSessionImpl, "mIsSuspended")) == null || num.intValue() != 1) ? false : true;
    }

    public static int J(int[] iArr) {
        int i = 0;
        for (int i2 = 0; i2 < 16; i2++) {
            i |= iArr[i2];
        }
        return ((i - 1) & (~i)) >> 31;
    }

    public static void K(int[] iArr, int[] iArr2) {
        int i = iArr[0];
        int i2 = iArr[1];
        int i3 = iArr[2];
        int i4 = iArr[3];
        int i5 = iArr[4];
        int i6 = iArr[5];
        int i7 = iArr[6];
        int i8 = iArr[7];
        int i9 = iArr[8];
        int i10 = iArr[9];
        int i11 = iArr[10];
        int i12 = iArr[11];
        int i13 = iArr[12];
        int i14 = iArr[13];
        int i15 = iArr[14];
        int i16 = iArr[15];
        long j = i2 * 39081;
        int i17 = ((int) j) & 268435455;
        long j2 = j >>> 28;
        long j3 = i6 * 39081;
        int i18 = ((int) j3) & 268435455;
        long j4 = j3 >>> 28;
        long j5 = i10 * 39081;
        int i19 = ((int) j5) & 268435455;
        long j6 = j5 >>> 28;
        long j7 = i14 * 39081;
        int i20 = ((int) j7) & 268435455;
        long j8 = j7 >>> 28;
        long j9 = (i3 * 39081) + j2;
        iArr2[2] = ((int) j9) & 268435455;
        long j10 = j9 >>> 28;
        long j11 = (i7 * 39081) + j4;
        iArr2[6] = ((int) j11) & 268435455;
        long j12 = j11 >>> 28;
        long j13 = (i11 * 39081) + j6;
        iArr2[10] = ((int) j13) & 268435455;
        long j14 = (i15 * 39081) + j8;
        iArr2[14] = ((int) j14) & 268435455;
        long j15 = (i4 * 39081) + j10;
        iArr2[3] = ((int) j15) & 268435455;
        long j16 = j15 >>> 28;
        long j17 = (i8 * 39081) + j12;
        iArr2[7] = ((int) j17) & 268435455;
        long j18 = (i12 * 39081) + (j13 >>> 28);
        iArr2[11] = ((int) j18) & 268435455;
        long j19 = (i16 * 39081) + (j14 >>> 28);
        iArr2[15] = ((int) j19) & 268435455;
        long j20 = j19 >>> 28;
        long j21 = (i5 * 39081) + j16;
        iArr2[4] = ((int) j21) & 268435455;
        long j22 = (i9 * 39081) + (j17 >>> 28) + j20;
        iArr2[8] = ((int) j22) & 268435455;
        long j23 = (i13 * 39081) + (j18 >>> 28);
        iArr2[12] = ((int) j23) & 268435455;
        long j24 = (i * 39081) + j20;
        iArr2[0] = ((int) j24) & 268435455;
        iArr2[1] = i17 + ((int) (j24 >>> 28));
        iArr2[5] = i18 + ((int) (j21 >>> 28));
        iArr2[9] = i19 + ((int) (j22 >>> 28));
        iArr2[13] = i20 + ((int) (j23 >>> 28));
    }

    public static void L(int[] iArr, int[] iArr2, int[] iArr3) {
        int i = iArr[0];
        int i2 = iArr[1];
        int i3 = iArr[2];
        int i4 = iArr[3];
        int i5 = iArr[4];
        int i6 = iArr[5];
        int i7 = iArr[6];
        int i8 = iArr[7];
        int i9 = iArr[8];
        int i10 = iArr[9];
        int i11 = iArr[10];
        int i12 = iArr[11];
        int i13 = iArr[12];
        int i14 = iArr[13];
        int i15 = iArr[14];
        int i16 = iArr[15];
        int i17 = iArr2[0];
        int i18 = iArr2[1];
        int i19 = iArr2[2];
        int i20 = iArr2[3];
        int i21 = iArr2[4];
        int i22 = iArr2[5];
        int i23 = iArr2[6];
        int i24 = iArr2[7];
        int i25 = iArr2[8];
        int i26 = iArr2[9];
        int i27 = iArr2[10];
        int i28 = iArr2[11];
        int i29 = iArr2[12];
        int i30 = iArr2[13];
        int i31 = iArr2[14];
        int i32 = iArr2[15];
        int i33 = i + i9;
        int i34 = i2 + i10;
        int i35 = i3 + i11;
        int i36 = i4 + i12;
        int i37 = i5 + i13;
        int i38 = i6 + i14;
        int i39 = i7 + i15;
        int i40 = i8 + i16;
        int i41 = i17 + i25;
        int i42 = i18 + i26;
        int i43 = i19 + i27;
        int i44 = i20 + i28;
        int i45 = i21 + i29;
        int i46 = i22 + i30;
        int i47 = i23 + i31;
        int i48 = i24 + i32;
        long j = i;
        long j2 = i17;
        long j3 = j * j2;
        long j4 = i8;
        long j5 = i18;
        long j6 = j4 * j5;
        long j7 = i7;
        long j8 = i19;
        long j9 = (j7 * j8) + j6;
        long j10 = i6;
        long j11 = i20;
        long j12 = i5;
        long j13 = i21;
        long j14 = i4;
        long j15 = i22;
        long j16 = (j14 * j15) + (j12 * j13) + (j10 * j11) + j9;
        long j17 = i3;
        long j18 = i23;
        long j19 = i2;
        long j20 = i24;
        long j21 = j19 * j20;
        long j22 = i9;
        long j23 = i25;
        long j24 = j22 * j23;
        long j25 = i16;
        long j26 = i26;
        long j27 = j25 * j26;
        long j28 = i15;
        long j29 = i27;
        long j30 = (j28 * j29) + j27;
        long j31 = i14;
        long j32 = i28;
        long j33 = (j31 * j32) + j30;
        long j34 = i13;
        long j35 = i29;
        long j36 = (j34 * j35) + j33;
        long j37 = i12;
        long j38 = i30;
        long j39 = (j37 * j38) + j36;
        long j40 = i11;
        long j41 = i31;
        long j42 = (j40 * j41) + j39;
        long j43 = i10;
        long j44 = i32;
        long j45 = (j43 * j44) + j42;
        long j46 = i33;
        long j47 = i41;
        long j48 = j46 * j47;
        long j49 = i40;
        long j50 = i42;
        long j51 = j49 * j50;
        long j52 = i39;
        long j53 = i43;
        long j54 = (j52 * j53) + j51;
        long j55 = i38;
        long j56 = i44;
        long j57 = (j55 * j56) + j54;
        long j58 = i37;
        long j59 = i45;
        long j60 = (j58 * j59) + j57;
        long j61 = i36;
        long j62 = i46;
        long j63 = (j61 * j62) + j60;
        long j64 = i35;
        long j65 = i47;
        long j66 = (j64 * j65) + j63;
        long j67 = i34;
        long j68 = i48;
        long j69 = (j67 * j68) + j66;
        long j70 = ((j3 + j24) + j69) - (j21 + ((j17 * j18) + j16));
        int i49 = ((int) j70) & 268435455;
        long j71 = ((j45 + j48) - j3) + j69;
        int i50 = ((int) j71) & 268435455;
        long j72 = j71 >>> 28;
        long j73 = (j * j5) + (j19 * j2);
        long j74 = (j40 * j44) + (j37 * j41) + (j34 * j38) + (j31 * j35) + (j28 * j32) + (j25 * j29);
        long j75 = (j46 * j50) + (j67 * j47);
        long j76 = (j64 * j68) + (j61 * j65) + (j58 * j62) + (j55 * j59) + (j52 * j56) + (j49 * j53);
        long j77 = (((j73 + ((j22 * j26) + (j43 * j23))) + j76) - ((j17 * j20) + ((j14 * j18) + ((j12 * j15) + ((j10 * j13) + ((j7 * j11) + (j4 * j8))))))) + (j70 >>> 28);
        int i51 = ((int) j77) & 268435455;
        long j78 = j77 >>> 28;
        long j79 = ((j74 + j75) - j73) + j76 + j72;
        int i52 = ((int) j79) & 268435455;
        long j80 = j79 >>> 28;
        long j81 = (j * j8) + (j19 * j5) + (j17 * j2);
        long j82 = (j37 * j44) + (j34 * j41) + (j31 * j38) + (j28 * j35) + (j25 * j32);
        long j83 = (j46 * j53) + (j67 * j50) + (j64 * j47);
        long j84 = (j61 * j68) + (j58 * j65) + (j55 * j62) + (j52 * j59) + (j49 * j56);
        long j85 = (((j81 + ((j22 * j29) + ((j43 * j26) + (j40 * j23)))) + j84) - ((j14 * j20) + ((j12 * j18) + ((j10 * j15) + ((j7 * j13) + (j4 * j11)))))) + j78;
        int i53 = ((int) j85) & 268435455;
        long j86 = j85 >>> 28;
        long j87 = ((j82 + j83) - j81) + j84 + j80;
        int i54 = ((int) j87) & 268435455;
        long j88 = j87 >>> 28;
        long j89 = (j * j11) + (j19 * j8) + (j17 * j5) + (j14 * j2);
        long j90 = (j34 * j44) + (j31 * j41) + (j28 * j38) + (j25 * j35);
        long j91 = (j46 * j56) + (j67 * j53) + (j64 * j50) + (j61 * j47);
        long j92 = (j58 * j68) + (j55 * j65) + (j52 * j62) + (j49 * j59);
        long j93 = (((j89 + ((j22 * j32) + ((j43 * j29) + ((j40 * j26) + (j37 * j23))))) + j92) - ((j12 * j20) + ((j10 * j18) + ((j7 * j15) + (j4 * j13))))) + j86;
        int i55 = ((int) j93) & 268435455;
        long j94 = j93 >>> 28;
        long j95 = ((j90 + j91) - j89) + j92 + j88;
        int i56 = ((int) j95) & 268435455;
        long j96 = j95 >>> 28;
        long j97 = (j * j13) + (j19 * j11) + (j17 * j8) + (j14 * j5) + (j12 * j2);
        long j98 = (j31 * j44) + (j28 * j41) + (j25 * j38);
        long j99 = (j46 * j59) + (j67 * j56) + (j64 * j53) + (j61 * j50) + (j58 * j47);
        long j100 = (j55 * j68) + (j52 * j65) + (j49 * j62);
        long j101 = (((j97 + ((j22 * j35) + ((j43 * j32) + ((j40 * j29) + ((j37 * j26) + (j34 * j23)))))) + j100) - ((j10 * j20) + ((j7 * j18) + (j4 * j15)))) + j94;
        int i57 = ((int) j101) & 268435455;
        long j102 = j101 >>> 28;
        long j103 = ((j98 + j99) - j97) + j100 + j96;
        int i58 = ((int) j103) & 268435455;
        long j104 = j103 >>> 28;
        long j105 = (j * j15) + (j19 * j13) + (j17 * j11) + (j14 * j8) + (j12 * j5) + (j10 * j2);
        long j106 = (j28 * j44) + (j25 * j41);
        long j107 = (j46 * j62) + (j67 * j59) + (j64 * j56) + (j61 * j53) + (j58 * j50) + (j55 * j47);
        long j108 = (j52 * j68) + (j49 * j65);
        long j109 = (((j105 + ((j22 * j38) + ((j43 * j35) + ((j40 * j32) + ((j37 * j29) + ((j34 * j26) + (j31 * j23))))))) + j108) - ((j7 * j20) + (j4 * j18))) + j102;
        int i59 = ((int) j109) & 268435455;
        long j110 = j109 >>> 28;
        long j111 = ((j106 + j107) - j105) + j108 + j104;
        int i60 = ((int) j111) & 268435455;
        long j112 = j111 >>> 28;
        long j113 = (j * j18) + (j19 * j15) + (j17 * j13) + (j14 * j11) + (j12 * j8) + (j10 * j5) + (j7 * j2);
        long j114 = j25 * j44;
        long j115 = (j46 * j65) + (j67 * j62) + (j64 * j59) + (j61 * j56) + (j58 * j53) + (j55 * j50) + (j52 * j47);
        long j116 = j49 * j68;
        long j117 = (((j113 + ((j22 * j41) + ((j43 * j38) + ((j40 * j35) + ((j37 * j32) + ((j34 * j29) + ((j31 * j26) + (j28 * j23)))))))) + j116) - (j4 * j20)) + j110;
        int i61 = ((int) j117) & 268435455;
        long j118 = j117 >>> 28;
        long j119 = ((j114 + j115) - j113) + j116 + j112;
        int i62 = ((int) j119) & 268435455;
        long j120 = j14 * j13;
        long j121 = (j * j20) + (j19 * j18) + (j17 * j15) + j120 + (j12 * j11) + (j10 * j8) + (j7 * j5) + (j2 * j4);
        long j122 = (j22 * j44) + (j43 * j41) + (j40 * j38) + (j37 * j35) + (j34 * j32) + (j31 * j29) + (j28 * j26) + (j25 * j23) + j121 + j118;
        int i63 = ((int) j122) & 268435455;
        long j123 = (((j46 * j68) + ((j67 * j65) + ((j64 * j62) + ((j61 * j59) + ((j58 * j56) + ((j55 * j53) + ((j52 * j50) + (j49 * j47)))))))) - j121) + (j119 >>> 28);
        int i64 = ((int) j123) & 268435455;
        long j124 = j123 >>> 28;
        long j125 = (j122 >>> 28) + j124 + i50;
        long j126 = j124 + i49;
        iArr3[0] = ((int) j126) & 268435455;
        iArr3[1] = i51 + ((int) (j126 >>> 28));
        iArr3[2] = i53;
        iArr3[3] = i55;
        iArr3[4] = i57;
        iArr3[5] = i59;
        iArr3[6] = i61;
        iArr3[7] = i63;
        iArr3[8] = ((int) j125) & 268435455;
        iArr3[9] = i52 + ((int) (j125 >>> 28));
        iArr3[10] = i54;
        iArr3[11] = i56;
        iArr3[12] = i58;
        iArr3[13] = i60;
        iArr3[14] = i62;
        iArr3[15] = i64;
    }

    public static final boolean M(puj pujVar, Function1 function1) {
        int i;
        j6 j6Var;
        Object objInvoke;
        ttj ttjVarH;
        boolean zJ;
        do {
            synchronized (f) {
                sak sakVar = (sak) ytj.f(pujVar.a);
                i = sakVar.d;
                j6Var = sakVar.c;
            }
            zbg zbgVarM = j6Var.m();
            objInvoke = function1.invoke(zbgVarM);
            j6 j6VarH = zbgVarM.h();
            if (Intrinsics.a(j6VarH, j6Var)) {
                break;
            }
            sak sakVar2 = pujVar.a;
            synchronized (ytj.c) {
                ttjVarH = ytj.h();
                zJ = j((sak) ytj.w(sakVar2, pujVar, ttjVarH), i, j6VarH, true);
            }
            ytj.l(ttjVarH, pujVar);
        } while (!zJ);
        return ((Boolean) objInvoke).booleanValue();
    }

    public static final String N(String str) {
        return c.q(str, "0x", false) ? str.substring(2) : str;
    }

    public static ListenableFuture O(ListenableFuture listenableFuture) {
        listenableFuture.getClass();
        return listenableFuture.isDone() ? listenableFuture : z(new ur9(listenableFuture, (byte) 0));
    }

    public static void P(int[] iArr) {
        b0(1, iArr);
        b0(-1, iArr);
    }

    public static Object Q(Object obj, Object obj2) {
        if (obj2 instanceof orb) {
            orb orbVar = (orb) obj2;
            vpb vpbVarH = orbVar.h("__patches__");
            if (vpbVarH != null) {
                if (obj instanceof vpb) {
                    return R((vpb) obj, vpbVarH);
                }
                if (obj == null) {
                    return R(new vpb(), vpbVarH);
                }
                qp2.o("array operations but no array");
                return null;
            }
            if (obj instanceof orb) {
                return S((orb) obj, orbVar);
            }
            if (obj == null) {
                return S(new orb(), orbVar);
            }
        }
        return obj2;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0069 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static vpb R(vpb r10, vpb r11) throws org.json.JSONException {
        /*
            Method dump skipped, instructions count: 424
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.k1g.R(vpb, vpb):vpb");
    }

    public static orb S(orb orbVar, orb orbVar2) {
        orb orbVar3 = new orb();
        Iterator<String> itKeys = orbVar.a.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            orbVar3.p(orbVar.a(next), next);
        }
        Iterator<String> itKeys2 = orbVar2.a.keys();
        while (itKeys2.hasNext()) {
            String next2 = itKeys2.next();
            JSONObject jSONObject = orbVar3.a;
            Object objOpt = jSONObject.opt(next2);
            Object objU = null;
            if (objOpt != JSONObject.NULL && objOpt != null) {
                objU = orb.u(objOpt);
            }
            Object objQ = Q(objU, orbVar2.a(next2));
            if (objQ == null) {
                orb.u(jSONObject.remove(next2));
            } else {
                orbVar3.p(objQ, next2);
            }
        }
        return orbVar3;
    }

    public static final b56 T(vg9 vg9Var, int i) {
        b56 b56Var;
        int iOrdinal = vg9Var.Y0().ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                vg9 vg9VarV = gyg.v(vg9Var);
                if (vg9VarV == null) {
                    qp2.o("ActiveParent with no focused child");
                    return null;
                }
                b56 b56VarT = T(vg9VarV, i);
                b56 b56Var2 = b56.a;
                b56 b56Var3 = b56VarT != b56Var2 ? b56VarT : null;
                if (b56Var3 != null) {
                    return b56Var3;
                }
                if (vg9Var.q) {
                    return b56Var2;
                }
                vg9Var.q = true;
                try {
                    ig9 ig9VarV0 = vg9Var.V0();
                    ch4 ch4Var = new ch4(i);
                    gg9 gg9Var = ui6.f0(vg9Var).l;
                    vg9 vg9VarF = gg9Var.f();
                    ig9VarV0.k.invoke(ch4Var);
                    vg9 vg9VarF2 = gg9Var.f();
                    if (!ch4Var.b) {
                        if (vg9VarF == vg9VarF2 || vg9VarF2 == null) {
                            return b56Var2;
                        }
                        if (kg9.d != kg9.c) {
                            b56Var = b56.c;
                        }
                        return b56Var;
                    }
                    kg9 kg9Var = kg9.b;
                    b56Var = b56.b;
                    return b56Var;
                } finally {
                    vg9Var.q = false;
                }
            }
            if (iOrdinal == 2) {
                return b56.b;
            }
            if (iOrdinal != 3) {
                h9o.p();
                return null;
            }
        }
        return b56.a;
    }

    public static final b56 U(vg9 vg9Var, int i) {
        b56 b56Var;
        if (!vg9Var.r) {
            vg9Var.r = true;
            try {
                ig9 ig9VarV0 = vg9Var.V0();
                ch4 ch4Var = new ch4(i);
                gg9 gg9Var = ui6.f0(vg9Var).l;
                vg9 vg9VarF = gg9Var.f();
                ig9VarV0.j.invoke(ch4Var);
                vg9 vg9VarF2 = gg9Var.f();
                if (ch4Var.b) {
                    kg9 kg9Var = kg9.b;
                } else if (vg9VarF != vg9VarF2 && vg9VarF2 != null) {
                    if (kg9.d != kg9.c) {
                        b56Var = b56.c;
                    }
                    return b56Var;
                }
                b56Var = b56.b;
                return b56Var;
            } finally {
                vg9Var.r = false;
            }
        }
        return b56.a;
    }

    public static final b56 V(vg9 vg9Var, int i) throws pxb {
        b8e b8eVarU;
        tah tahVar;
        int iOrdinal = vg9Var.Y0().ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                vg9 vg9VarV = gyg.v(vg9Var);
                if (vg9VarV != null) {
                    return T(vg9VarV, i);
                }
                qp2.o("ActiveParent with no focused child");
                return null;
            }
            if (iOrdinal != 2) {
                if (iOrdinal != 3) {
                    h9o.p();
                    return null;
                }
                if (!vg9Var.a.n) {
                    a8b.b("visitAncestors called on an unattached node");
                }
                b8e b8eVar = vg9Var.a.e;
                m3c m3cVarE0 = ui6.e0(vg9Var);
                loop0: while (true) {
                    if (m3cVarE0 == null) {
                        b8eVarU = null;
                        break;
                    }
                    if ((((b8e) m3cVarE0.F.g).d & 1024) != 0) {
                        while (b8eVar != null) {
                            if ((b8eVar.c & 1024) != 0) {
                                b8eVarU = b8eVar;
                                dfe dfeVar = null;
                                while (b8eVarU != null) {
                                    if (b8eVarU instanceof vg9) {
                                        break loop0;
                                    }
                                    if ((b8eVarU.c & 1024) != 0 && (b8eVarU instanceof i17)) {
                                        int i2 = 0;
                                        for (b8e b8eVar2 = ((i17) b8eVarU).p; b8eVar2 != null; b8eVar2 = b8eVar2.f) {
                                            if ((b8eVar2.c & 1024) != 0) {
                                                i2++;
                                                if (i2 == 1) {
                                                    b8eVarU = b8eVar2;
                                                } else {
                                                    if (dfeVar == null) {
                                                        dfeVar = new dfe(new b8e[16]);
                                                    }
                                                    if (b8eVarU != null) {
                                                        dfeVar.c(b8eVarU);
                                                        b8eVarU = null;
                                                    }
                                                    dfeVar.c(b8eVar2);
                                                }
                                            }
                                        }
                                        if (i2 != 1) {
                                        }
                                    }
                                    b8eVarU = ui6.U(dfeVar);
                                }
                            }
                            b8eVar = b8eVar.e;
                        }
                    }
                    m3cVarE0 = m3cVarE0.u();
                    b8eVar = (m3cVarE0 == null || (tahVar = m3cVarE0.F) == null) ? null : (lbl) tahVar.f;
                }
                vg9 vg9Var2 = (vg9) b8eVarU;
                if (vg9Var2 == null) {
                    return b56.a;
                }
                int iOrdinal2 = vg9Var2.Y0().ordinal();
                if (iOrdinal2 == 0) {
                    return U(vg9Var2, i);
                }
                if (iOrdinal2 == 1) {
                    return V(vg9Var2, i);
                }
                if (iOrdinal2 == 2) {
                    return b56.b;
                }
                if (iOrdinal2 != 3) {
                    h9o.p();
                    return null;
                }
                b56 b56VarV = V(vg9Var2, i);
                b56 b56Var = b56VarV != b56.a ? b56VarV : null;
                return b56Var == null ? U(vg9Var2, i) : b56Var;
            }
        }
        return b56.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:114:0x01a5 A[PHI: r16
      0x01a5: PHI (r16v2 dfe) = (r16v1 dfe), (r16v1 dfe), (r16v1 dfe), (r16v4 dfe) binds: [B:91:0x0159, B:93:0x015f, B:95:0x0163, B:112:0x019f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Type inference failed for: r15v10 */
    /* JADX WARN: Type inference failed for: r15v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r15v12 */
    /* JADX WARN: Type inference failed for: r15v13 */
    /* JADX WARN: Type inference failed for: r15v14 */
    /* JADX WARN: Type inference failed for: r15v15 */
    /* JADX WARN: Type inference failed for: r15v16 */
    /* JADX WARN: Type inference failed for: r15v22 */
    /* JADX WARN: Type inference failed for: r15v23 */
    /* JADX WARN: Type inference failed for: r15v24 */
    /* JADX WARN: Type inference failed for: r15v9, types: [b8e] */
    /* JADX WARN: Type inference failed for: r1v45, types: [java.lang.Object, java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r5v10, types: [dfe] */
    /* JADX WARN: Type inference failed for: r5v15, types: [java.lang.Object, java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r5v18 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v14, types: [b8e] */
    /* JADX WARN: Type inference failed for: r6v15, types: [b8e] */
    /* JADX WARN: Type inference failed for: r6v7, types: [b8e] */
    /* JADX WARN: Type inference failed for: r6v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean W(defpackage.vg9 r22) throws pxb {
        /*
            Method dump skipped, instructions count: 617
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.k1g.W(vg9):boolean");
    }

    public static final boolean X(vg9 vg9Var, boolean z) {
        int iOrdinal = vg9Var.Y0().ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                vg9 vg9VarV = gyg.v(vg9Var);
                if (!(vg9VarV != null ? X(vg9VarV, z) : true)) {
                    return false;
                }
                vg9Var.U0(qg9.b, qg9.c);
                return true;
            }
            if (iOrdinal == 2) {
                return z;
            }
            if (iOrdinal != 3) {
                h9o.p();
                return false;
            }
        }
        return true;
    }

    public static void Y(ListenableFuture listenableFuture, l94 l94Var) {
        Z(true, listenableFuture, l94Var, n97.a());
    }

    public static void Z(boolean z, ListenableFuture listenableFuture, l94 l94Var, n97 n97Var) {
        listenableFuture.getClass();
        l94Var.getClass();
        n97Var.getClass();
        listenableFuture.addListener(new wr9(listenableFuture, new ga6(l94Var, (byte) 14), (byte) 0), n97Var);
        if (z) {
            l94Var.a(new vl9(listenableFuture, (byte) 3), n97.a());
        }
    }

    public static final void a(boolean z, Function1 function1, c8e c8eVar, boolean z2, hv4 hv4Var, ih5 ih5Var, int i) {
        c8e c8eVar2;
        boolean z3;
        hv4 hv4Var2;
        int i2;
        c8e c8eVar3;
        hv4 hv4Var3;
        boolean z4;
        Function0 function0;
        vt9 vt9Var = (vt9) ih5Var;
        vt9Var.Y(-1406741137);
        int i3 = i | (vt9Var.g(z) ? 4 : 2) | (vt9Var.h(function1) ? 32 : 16) | 208256;
        boolean z5 = true;
        if (vt9Var.N(i3 & 1, (74899 & i3) != 74898)) {
            vt9Var.S();
            if ((i & 1) == 0 || vt9Var.x()) {
                hv4 hv4VarT = o0g.t(vt9Var);
                i2 = i3 & (-57345);
                c8eVar3 = z7e.b;
                hv4Var3 = hv4VarT;
                z4 = true;
            } else {
                vt9Var.Q();
                i2 = i3 & (-57345);
                c8eVar3 = c8eVar;
                hv4Var3 = hv4Var;
                z4 = true;
                z5 = z2;
            }
            vt9Var.q();
            float fFloor = (float) Math.floor(((n27) vt9Var.j(mi5.h)).o0(2.0f));
            bsl bslVar = z ? bsl.a : bsl.b;
            if (function1 != null) {
                vt9Var.W(2066152950);
                boolean z6 = (i2 & 112) == 32 ? z4 : false;
                if ((i2 & 14) != 4) {
                    z4 = false;
                }
                boolean z7 = z6 | z4;
                Object objK = vt9Var.K();
                if (z7 || objK == hh5.a) {
                    objK = new kv4(function1, z, (byte) 0);
                    vt9Var.g0(objK);
                }
                function0 = (Function0) objK;
                vt9Var.p(false);
            } else {
                vt9Var.W(2066218639);
                vt9Var.p(false);
                function0 = null;
            }
            c8e c8eVar4 = c8eVar3;
            f(bslVar, function0, new qik(2, 0, fFloor, 0.0f, 26), new qik(0, 0, fFloor, 0.0f, 30), c8eVar4, z5, hv4Var3, vt9Var, 12804096);
            c8eVar2 = c8eVar4;
            z3 = z5;
            hv4Var2 = hv4Var3;
        } else {
            vt9Var.Q();
            c8eVar2 = c8eVar;
            z3 = z2;
            hv4Var2 = hv4Var;
        }
        znh znhVarR = vt9Var.r();
        if (znhVarR != null) {
            znhVarR.d = new lv4(z, function1, c8eVar2, z3, hv4Var2, i, (byte) 0);
        }
    }

    public static u9d a0(File file, qii qiiVar) throws IOException {
        try {
            u9d u9dVar = new u9d();
            DataInputStream dataInputStream = new DataInputStream(new InflaterInputStream(new FileInputStream(file)));
            try {
                int i = dataInputStream.readInt();
                while (true) {
                    int i2 = i - 1;
                    if (i <= 0) {
                        dataInputStream.close();
                        return u9dVar.g();
                    }
                    String utf = dataInputStream.readUTF();
                    byte[] bArr = new byte[dataInputStream.readInt()];
                    dataInputStream.readFully(bArr);
                    u9dVar.put(utf, new String(bArr, Charsets.UTF_8));
                    i = i2;
                }
            } finally {
            }
        } catch (FileNotFoundException unused) {
            return null;
        } catch (IOException e2) {
            if (qiiVar == null) {
                return null;
            }
            ks3.D(e2);
            return null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x00bf, code lost:
    
        if (r14 == 2) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00df, code lost:
    
        if (r15 != 2) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00e1, code lost:
    
        h9o.p();
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00e4, code lost:
    
        return;
     */
    /* JADX WARN: Removed duplicated region for block: B:102:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0228  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x023d  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0253  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x026d  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0291  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x02e3  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01ac  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(boolean r24, defpackage.bsl r25, defpackage.c8e r26, defpackage.hv4 r27, final defpackage.qik r28, final defpackage.qik r29, defpackage.ih5 r30, int r31) {
        /*
            Method dump skipped, instructions count: 787
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.k1g.b(boolean, bsl, c8e, hv4, qik, qik, ih5, int):void");
    }

    public static void b0(int i, int[] iArr) {
        int i2;
        int i3 = iArr[15];
        int i4 = i3 & 268435455;
        long j = (i3 >>> 28) + i;
        int i5 = 0;
        long j2 = j;
        while (true) {
            if (i5 >= 8) {
                break;
            }
            long j3 = j2 + (iArr[i5] & 4294967295L);
            iArr[i5] = ((int) j3) & 268435455;
            j2 = j3 >> 28;
            i5++;
        }
        long j4 = j2 + j;
        for (i2 = 8; i2 < 15; i2++) {
            long j5 = j4 + (iArr[i2] & 4294967295L);
            iArr[i2] = ((int) j5) & 268435455;
            j4 = j5 >> 28;
        }
        iArr[15] = i4 + ((int) j4);
    }

    public static final void c(final c8e c8eVar, final cfe cfeVar, final afe afeVar, final voi voiVar, final paj pajVar, final long j, final float f2, final ue5 ue5Var, ih5 ih5Var, final int i) {
        float f3;
        vt9 vt9Var = (vt9) ih5Var;
        vt9Var.Y(848986741);
        int i2 = i | (vt9Var.f(c8eVar) ? 4 : 2) | (vt9Var.f(cfeVar) ? 32 : 16) | (vt9Var.f(voiVar) ? 2048 : 1024) | (vt9Var.f(pajVar) ? 16384 : 8192) | (vt9Var.e(j) ? 131072 : 65536) | (vt9Var.c(0.0f) ? 1048576 : 524288) | (vt9Var.c(f2) ? 8388608 : 4194304) | (vt9Var.f(null) ? 67108864 : 33554432) | (vt9Var.h(ue5Var) ? 536870912 : 268435456);
        if (vt9Var.N(i2 & 1, (i2 & 306783379) != 306783378)) {
            b3m b3mVarS = r9h.s(cfeVar, "DropDownMenu", vt9Var, 48);
            a2k a2kVarY = nb6.Y(jae.b, vt9Var);
            a2k a2kVarY2 = nb6.Y(jae.d, vt9Var);
            j8m j8mVar = a26.e;
            Object objC = b3mVarS.c();
            t0g t0gVar = b3mVarS.d;
            boolean zBooleanValue = ((Boolean) objC).booleanValue();
            vt9Var.W(143964305);
            float f4 = zBooleanValue ? 1.0f : 0.8f;
            vt9Var.p(false);
            Float fValueOf = Float.valueOf(f4);
            boolean zBooleanValue2 = ((Boolean) t0gVar.getValue()).booleanValue();
            vt9Var.W(143964305);
            float f5 = zBooleanValue2 ? 1.0f : 0.8f;
            vt9Var.p(false);
            Float fValueOf2 = Float.valueOf(f5);
            b3mVarS.f();
            vt9Var.W(-745957716);
            vt9Var.p(false);
            w2m w2mVarN = r9h.n(b3mVarS, fValueOf, fValueOf2, a2kVarY, j8mVar, vt9Var, 0);
            boolean zBooleanValue3 = ((Boolean) b3mVarS.c()).booleanValue();
            vt9Var.W(892761509);
            float f6 = zBooleanValue3 ? 1.0f : 0.0f;
            vt9Var.p(false);
            Float fValueOf3 = Float.valueOf(f6);
            boolean zBooleanValue4 = ((Boolean) t0gVar.getValue()).booleanValue();
            vt9Var.W(892761509);
            float f7 = zBooleanValue4 ? 1.0f : 0.0f;
            vt9Var.p(false);
            Float fValueOf4 = Float.valueOf(f7);
            b3mVarS.f();
            vt9Var.W(2839488);
            vt9Var.p(false);
            w2m w2mVarN2 = r9h.n(b3mVarS, fValueOf3, fValueOf4, a2kVarY2, j8mVar, vt9Var, 0);
            boolean zBooleanValue5 = ((Boolean) vt9Var.j(cab.a)).booleanValue();
            boolean zG = vt9Var.g(zBooleanValue5) | vt9Var.f(w2mVarN) | ((i2 & 112) == 32) | vt9Var.f(w2mVarN2);
            Object objK = vt9Var.K();
            if (zG || objK == hh5.a) {
                f3 = 0.0f;
                objK = new wtd(zBooleanValue5, cfeVar, afeVar, w2mVarN, w2mVarN2);
                vt9Var.g0(objK);
            } else {
                f3 = 0.0f;
            }
            int i3 = i2 >> 9;
            int i4 = i2 >> 6;
            utk.a(z5i.N(z7e.b, (Function1) objK), pajVar, j, 0L, f3, f2, gyg.P(-1463404422, new ytd(c8eVar, voiVar, ue5Var), vt9Var), vt9Var, (i3 & 112) | 12582912 | (i3 & 896) | (i4 & 57344) | (i4 & 458752) | (i4 & 3670016), 8);
            vt9Var = vt9Var;
        } else {
            vt9Var.Q();
        }
        znh znhVarR = vt9Var.r();
        if (znhVarR != null) {
            znhVarR.d = new Function2(cfeVar, afeVar, voiVar, pajVar, j, f2, ue5Var, i) { // from class: xtd
                public final /* synthetic */ cfe b;
                public final /* synthetic */ afe c;
                public final /* synthetic */ voi d;
                public final /* synthetic */ paj e;
                public final /* synthetic */ long f;
                public final /* synthetic */ float g;
                public final /* synthetic */ ue5 h;

                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iM = aoh.m(385);
                    k1g.c(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, (ih5) obj, iM);
                    return Unit.a;
                }
            };
        }
    }

    public static final inl c0(b8e b8eVar, Function1 function1) throws pxb {
        m3c m3cVarE0 = ui6.e0(b8eVar);
        int i = m3cVarE0.b;
        yoh yohVar = p3c.a(m3cVarE0).t;
        jnl jnlVar = yohVar.d;
        jnlVar.getClass();
        jde jdeVar = jnlVar.a;
        inl inlVar = new inl(jnlVar, i, b8eVar, function1);
        Object objE = jdeVar.e(i);
        if (objE == null) {
            jdeVar.i(i, inlVar);
            objE = inlVar;
        }
        inl inlVar2 = (inl) objE;
        if (inlVar2 != inlVar) {
            while (true) {
                inl inlVar3 = inlVar2.d;
                if (inlVar3 == null) {
                    break;
                }
                inlVar2 = inlVar3;
            }
            inlVar2.d = inlVar;
        }
        m3c m3cVarE02 = ui6.e0(b8eVar.a);
        if (m3cVarE02.g != -4) {
            ro9 ro9Var = yohVar.c;
            int iD = yohVar.d(m3cVarE02);
            long[] jArr = (long[]) ro9Var.c;
            int i2 = iD + 2;
            jArr[i2] = (jArr[i2] & 8070450532247928831L) | (-8070450532247928832L);
        }
        yohVar.f = true;
        yohVar.j();
        return inlVar;
    }

    public static final void d(ue5 ue5Var, Function0 function0, c8e c8eVar, boolean z, otd otdVar, zvf zvfVar, ih5 ih5Var, int i) {
        int i2;
        vt9 vt9Var = (vt9) ih5Var;
        vt9Var.Y(-1325192924);
        if ((i & 6) == 0) {
            i2 = (vt9Var.h(ue5Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= vt9Var.h(function0) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= vt9Var.f(c8eVar) ? NotificationCompat.FLAG_LOCAL_ONLY : NotificationCompat.FLAG_HIGH_PRIORITY;
        }
        if ((i & 3072) == 0) {
            i2 |= vt9Var.h(null) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= vt9Var.h(null) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= vt9Var.g(z) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= vt9Var.f(otdVar) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i2 |= vt9Var.f(zvfVar) ? 8388608 : 4194304;
        }
        if ((100663296 & i) == 0) {
            i2 |= vt9Var.f(null) ? 67108864 : 33554432;
        }
        if (vt9Var.N(i2 & 1, (38347923 & i2) != 38347922)) {
            c8e c8eVarW = a26.W(mpj.k(jpo.p(c8eVar, (lde) null, n5i.a(6, 0.0f, true), z, (q5i) null, function0, 24).d(mpj.a), 112.0f, 48.0f, 280.0f, 8), zvfVar);
            o9i o9iVarA = m9i.a(b72.a, rbe.l, vt9Var, 48);
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
            y4h.o(vt9Var, o9iVarA, ujp.f);
            y4h.o(vt9Var, oagVarL, ujp.e);
            ah5 ah5Var = ujp.g;
            if (vt9Var.S || !Intrinsics.a(vt9Var.K(), Integer.valueOf(iHashCode))) {
                vep.x(iHashCode, vt9Var, iHashCode, ah5Var);
            }
            y4h.o(vt9Var, c8eVarP, ujp.d);
            ijl.a(((wam) vt9Var.j(abm.a)).m, gyg.P(865999929, new ztd(otdVar, z, ue5Var), vt9Var), vt9Var, 48);
            vt9Var.p(true);
        } else {
            vt9Var.Q();
        }
        znh znhVarR = vt9Var.r();
        if (znhVarR != null) {
            znhVarR.d = new tb3(ue5Var, function0, c8eVar, z, otdVar, zvfVar, i);
        }
    }

    public static void d0(int[] iArr, int[] iArr2) {
        int i = iArr[0];
        int i2 = iArr[1];
        int i3 = iArr[2];
        int i4 = iArr[3];
        int i5 = iArr[4];
        int i6 = iArr[5];
        int i7 = iArr[6];
        int i8 = iArr[7];
        int i9 = iArr[8];
        int i10 = iArr[9];
        int i11 = iArr[10];
        int i12 = iArr[11];
        int i13 = iArr[12];
        int i14 = iArr[13];
        int i15 = iArr[14];
        int i16 = iArr[15];
        int i17 = i << 1;
        int i18 = i2 << 1;
        int i19 = i5 << 1;
        int i20 = i6 << 1;
        int i21 = i7 << 1;
        int i22 = i9 << 1;
        int i23 = i11 << 1;
        int i24 = i12 << 1;
        int i25 = i13 << 1;
        int i26 = i + i9;
        int i27 = i2 + i10;
        int i28 = i3 + i11;
        int i29 = i4 + i12;
        int i30 = i5 + i13;
        int i31 = i6 + i14;
        int i32 = i7 + i15;
        int i33 = i26 << 1;
        int i34 = i27 << 1;
        int i35 = i28 << 1;
        int i36 = i29 << 1;
        long j = i;
        long j2 = j * j;
        long j3 = i8;
        long j4 = i18;
        long j5 = j3 * j4;
        long j6 = i7;
        long j7 = i3 << 1;
        long j8 = (j6 * j7) + j5;
        long j9 = i6;
        long j10 = i4 << 1;
        long j11 = (j9 * j10) + j8;
        long j12 = i5;
        long j13 = i9;
        long j14 = j13 * j13;
        long j15 = i16;
        long j16 = i10 << 1;
        long j17 = i15;
        long j18 = i23;
        long j19 = (j17 * j18) + (j15 * j16);
        long j20 = i14;
        long j21 = i24;
        long j22 = i13;
        long j23 = j22 * j22;
        long j24 = i26;
        long j25 = j24 * j24;
        long j26 = i8 + i16;
        long j27 = i34 & 4294967295L;
        long j28 = j26 * j27;
        long j29 = i32;
        long j30 = i35 & 4294967295L;
        long j31 = (j29 * j30) + j28;
        long j32 = i31;
        long j33 = i36 & 4294967295L;
        long j34 = (j32 * j33) + j31;
        long j35 = i30;
        long j36 = (j35 * j35) + j34;
        long j37 = ((j2 + j14) + j36) - ((j12 * j12) + j11);
        int i37 = ((int) j37) & 268435455;
        long j38 = j37 >>> 28;
        long j39 = (((j23 + ((j20 * j21) + j19)) + j25) - j2) + j36;
        int i38 = ((int) j39) & 268435455;
        long j40 = j39 >>> 28;
        long j41 = i2;
        long j42 = i17;
        long j43 = j41 * j42;
        long j44 = i19;
        long j45 = j9 * j44;
        long j46 = i10;
        long j47 = i22;
        long j48 = j46 * j47;
        long j49 = i25;
        long j50 = j20 * j49;
        long j51 = i27;
        long j52 = i33 & 4294967295L;
        long j53 = j51 * j52;
        long j54 = (j29 * j33) + (j26 * j30);
        long j55 = (i30 << 1) & 4294967295L;
        long j56 = (j32 * j55) + j54;
        long j57 = (((j43 + j48) + j56) - (j45 + ((j6 * j10) + (j3 * j7)))) + j38;
        int i39 = ((int) j57) & 268435455;
        long j58 = j57 >>> 28;
        long j59 = (((j50 + ((j17 * j21) + (j15 * j18))) + j53) - j43) + j56 + j40;
        int i40 = ((int) j59) & 268435455;
        long j60 = j59 >>> 28;
        long j61 = i3;
        long j62 = (j41 * j41) + (j61 * j42);
        long j63 = (j6 * j44) + (j3 * j10);
        long j64 = i11;
        long j65 = (j46 * j46) + (j64 * j47);
        long j66 = (j17 * j49) + (j15 * j21);
        long j67 = i28;
        long j68 = (j51 * j51) + (j67 * j52);
        long j69 = (j32 * j32) + (j29 * j55) + (j26 * j33);
        long j70 = (((j62 + j65) + j69) - ((j9 * j9) + j63)) + j58;
        int i41 = ((int) j70) & 268435455;
        long j71 = j70 >>> 28;
        long j72 = ((((j20 * j20) + j66) + j68) - j62) + j69 + j60;
        int i42 = ((int) j72) & 268435455;
        long j73 = j72 >>> 28;
        long j74 = i4;
        long j75 = (j61 * j4) + (j74 * j42);
        long j76 = j3 * j44;
        long j77 = i20;
        long j78 = (j6 * j77) + j76;
        long j79 = i12;
        long j80 = (j64 * j16) + (j79 * j47);
        long j81 = j15 * j49;
        long j82 = i14 << 1;
        long j83 = (j17 * j82) + j81;
        long j84 = i29;
        long j85 = (j67 * j27) + (j84 * j52);
        long j86 = j55 * j26;
        long j87 = (i31 << 1) & 4294967295L;
        long j88 = (j29 * j87) + j86;
        long j89 = (((j75 + j80) + j88) - j78) + j71;
        int i43 = ((int) j89) & 268435455;
        long j90 = j89 >>> 28;
        long j91 = ((j83 + j85) - j75) + j88 + j73;
        int i44 = ((int) j91) & 268435455;
        long j92 = j91 >>> 28;
        long j93 = (j61 * j61) + (j74 * j4) + (j12 * j42);
        long j94 = (j17 * j17) + (j82 * j15);
        long j95 = (j67 * j67) + (j84 * j27) + (j35 * j52);
        long j96 = (j29 * j29) + (j26 * j87);
        long j97 = (((j93 + ((j64 * j64) + ((j79 * j16) + (j22 * j47)))) + j96) - ((j6 * j6) + (j3 * j77))) + j90;
        int i45 = ((int) j97) & 268435455;
        long j98 = j97 >>> 28;
        long j99 = ((j94 + j95) - j93) + j96 + j92;
        int i46 = ((int) j99) & 268435455;
        long j100 = j99 >>> 28;
        long j101 = (j74 * j7) + (j12 * j4) + (j9 * j42);
        long j102 = (j79 * j18) + (j22 * j16) + (j20 * j47);
        long j103 = (j84 * j30) + (j35 * j27) + (j32 * j52);
        long j104 = ((i32 << 1) & 4294967295L) * j26;
        long j105 = (((j101 + j102) + j104) - (i21 * j3)) + j98;
        int i47 = ((int) j105) & 268435455;
        long j106 = j105 >>> 28;
        long j107 = ((((i15 << 1) * j15) + j103) - j101) + j104 + j100;
        int i48 = ((int) j107) & 268435455;
        long j108 = j107 >>> 28;
        long j109 = (j74 * j74) + (j12 * j7) + (j9 * j4) + (j6 * j42);
        long j110 = (j84 * j84) + (j35 * j30) + (j32 * j27) + (j29 * j52);
        long j111 = j26 * j26;
        long j112 = (((j109 + ((j79 * j79) + ((j22 * j18) + ((j20 * j16) + (j17 * j47))))) + j111) - (j3 * j3)) + j106;
        int i49 = ((int) j112) & 268435455;
        long j113 = j112 >>> 28;
        long j114 = (((j15 * j15) + j110) - j109) + j111 + j108;
        int i50 = ((int) j114) & 268435455;
        long j115 = (j10 * j12) + (j9 * j7) + (j6 * j4) + (j3 * j42);
        long j116 = j20 * j18;
        long j117 = (j22 * j21) + j116 + (j17 * j16) + (j15 * j47);
        long j118 = j117 + j115 + j113;
        int i51 = ((int) j118) & 268435455;
        long j119 = (((j35 * j33) + ((j32 * j30) + ((j29 * j27) + (j26 * j52)))) - j115) + (j114 >>> 28);
        int i52 = ((int) j119) & 268435455;
        long j120 = j119 >>> 28;
        long j121 = (j118 >>> 28) + j120 + i38;
        long j122 = j120 + i37;
        iArr2[0] = ((int) j122) & 268435455;
        iArr2[1] = i39 + ((int) (j122 >>> 28));
        iArr2[2] = i41;
        iArr2[3] = i43;
        iArr2[4] = i45;
        iArr2[5] = i47;
        iArr2[6] = i49;
        iArr2[7] = i51;
        iArr2[8] = ((int) j121) & 268435455;
        iArr2[9] = i40 + ((int) (j121 >>> 28));
        iArr2[10] = i42;
        iArr2[11] = i44;
        iArr2[12] = i46;
        iArr2[13] = i48;
        iArr2[14] = i50;
        iArr2[15] = i52;
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:291:0x04c3  */
    /* JADX WARN: Removed duplicated region for block: B:294:0x04d6  */
    /* JADX WARN: Removed duplicated region for block: B:296:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0122  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void e(defpackage.c8e r37, defpackage.u6c r38, final defpackage.zvf r39, final boolean r40, final defpackage.h89 r41, final boolean r42, final defpackage.v51 r43, defpackage.rd3 r44, defpackage.z62 r45, defpackage.sd3 r46, defpackage.w62 r47, final kotlin.jvm.functions.Function1 r48, defpackage.ih5 r49, final int r50, final int r51, final int r52) {
        /*
            Method dump skipped, instructions count: 1272
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.k1g.e(c8e, u6c, zvf, boolean, h89, boolean, v51, rd3, z62, sd3, w62, kotlin.jvm.functions.Function1, ih5, int, int, int):void");
    }

    public static void e0(int[] iArr, int[] iArr2, int i) {
        d0(iArr, iArr2);
        while (true) {
            i--;
            if (i <= 0) {
                return;
            } else {
                d0(iArr2, iArr2);
            }
        }
    }

    public static final void f(bsl bslVar, Function0 function0, qik qikVar, qik qikVar2, c8e c8eVar, boolean z, hv4 hv4Var, ih5 ih5Var, int i) {
        int i2;
        c8e c8eVarJ0;
        c8e c8eVar2;
        vt9 vt9Var = (vt9) ih5Var;
        vt9Var.Y(-406243761);
        if ((i & 6) == 0) {
            i2 = (vt9Var.d(bslVar.ordinal()) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= vt9Var.h(function0) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= vt9Var.h(qikVar) ? NotificationCompat.FLAG_LOCAL_ONLY : NotificationCompat.FLAG_HIGH_PRIORITY;
        }
        if ((i & 3072) == 0) {
            i2 |= vt9Var.h(qikVar2) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= vt9Var.f(c8eVar) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= vt9Var.g(z) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= vt9Var.f(hv4Var) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i2 |= vt9Var.f(null) ? 8388608 : 4194304;
        }
        if (vt9Var.N(i2 & 1, (4793491 & i2) != 4793490)) {
            vt9Var.S();
            if ((i & 1) != 0 && !vt9Var.x()) {
                vt9Var.Q();
            }
            vt9Var.q();
            if (function0 != null) {
                c8eVarJ0 = fr3.j0(n5i.a(4, mv4.d / 2.0f, false), new q5i(1), bslVar, function0, z);
                mga mgaVar = xdb.a;
                c8eVar2 = r0e.b;
            } else {
                c8eVarJ0 = z7e.b;
                c8eVar2 = c8eVarJ0;
            }
            c8e c8eVarX = a26.X(c8eVar.d(c8eVar2).d(c8eVarJ0), 2.0f);
            int i3 = ((i2 >> 15) & 14) | ((i2 << 3) & 112) | ((i2 >> 9) & 7168);
            int i4 = i2 << 6;
            b(z, bslVar, c8eVarX, hv4Var, qikVar, qikVar2, vt9Var, i3 | (57344 & i4) | (i4 & 458752));
        } else {
            vt9Var.Q();
        }
        znh znhVarR = vt9Var.r();
        if (znhVarR != null) {
            znhVarR.d = new iv4(bslVar, function0, qikVar, qikVar2, c8eVar, z, hv4Var, i);
        }
    }

    public static void f0(BrowserActivity browserActivity, ni niVar, w2b w2bVar) {
        Intent intentE0 = FullscreenWebActivity.e0(browserActivity, ImportChromePasswordsActivity.class, "https://passwords.google.com/options", new rxh(2132020330), true, lqm.d);
        intentE0.putExtra("extra_import_entry_point", w2bVar.a);
        oi.d(browserActivity).D(intentE0, niVar);
    }

    public static void g(int[] iArr, int[] iArr2, int[] iArr3) {
        for (int i = 0; i < 16; i++) {
            iArr3[i] = iArr[i] + iArr2[i];
        }
    }

    public static void g0(int[] iArr, int[] iArr2, int[] iArr3) {
        int i = iArr[0];
        int i2 = iArr[1];
        int i3 = iArr[2];
        int i4 = iArr[3];
        int i5 = iArr[4];
        int i6 = iArr[5];
        int i7 = iArr[6];
        int i8 = iArr[7];
        int i9 = iArr[8];
        int i10 = iArr[9];
        int i11 = iArr[10];
        int i12 = iArr[11];
        int i13 = iArr[12];
        int i14 = iArr[13];
        int i15 = iArr[14];
        int i16 = iArr[15];
        int i17 = iArr2[0];
        int i18 = iArr2[1];
        int i19 = iArr2[2];
        int i20 = iArr2[3];
        int i21 = iArr2[4];
        int i22 = iArr2[5];
        int i23 = iArr2[6];
        int i24 = iArr2[7];
        int i25 = iArr2[8];
        int i26 = iArr2[9];
        int i27 = iArr2[10];
        int i28 = iArr2[11];
        int i29 = iArr2[12];
        int i30 = iArr2[13];
        int i31 = (i2 + 536870910) - i18;
        int i32 = (i6 + 536870910) - i22;
        int i33 = (i10 + 536870910) - i26;
        int i34 = (i14 + 536870910) - i30;
        int i35 = ((i3 + 536870910) - i19) + (i31 >>> 28);
        int i36 = ((i7 + 536870910) - i23) + (i32 >>> 28);
        int i37 = ((i11 + 536870910) - i27) + (i33 >>> 28);
        int i38 = ((i15 + 536870910) - iArr2[14]) + (i34 >>> 28);
        int i39 = ((i4 + 536870910) - i20) + (i35 >>> 28);
        int i40 = ((i8 + 536870910) - i24) + (i36 >>> 28);
        int i41 = ((i12 + 536870910) - i28) + (i37 >>> 28);
        int i42 = ((i16 + 536870910) - iArr2[15]) + (i38 >>> 28);
        int i43 = i42 >>> 28;
        int i44 = ((i + 536870910) - i17) + i43;
        int i45 = ((i5 + 536870910) - i21) + (i39 >>> 28);
        int i46 = ((i9 + 536870908) - i25) + i43 + (i40 >>> 28);
        int i47 = ((i13 + 536870910) - i29) + (i41 >>> 28);
        iArr3[0] = i44 & 268435455;
        iArr3[1] = (i31 & 268435455) + (i44 >>> 28);
        iArr3[2] = i35 & 268435455;
        iArr3[3] = i39 & 268435455;
        iArr3[4] = i45 & 268435455;
        iArr3[5] = (i32 & 268435455) + (i45 >>> 28);
        iArr3[6] = i36 & 268435455;
        iArr3[7] = i40 & 268435455;
        iArr3[8] = i46 & 268435455;
        iArr3[9] = (i33 & 268435455) + (i46 >>> 28);
        iArr3[10] = i37 & 268435455;
        iArr3[11] = i41 & 268435455;
        iArr3[12] = i47 & 268435455;
        iArr3[13] = (i34 & 268435455) + (i47 >>> 28);
        iArr3[14] = i38 & 268435455;
        iArr3[15] = i42 & 268435455;
    }

    public static String h0(long j) {
        return z1m.j(j, "PointerId(value=", ")");
    }

    public static fr4 i0(ListenableFuture listenableFuture, ed2 ed2Var, Executor executor) {
        fr4 fr4Var = new fr4(ed2Var, listenableFuture);
        listenableFuture.addListener(fr4Var, executor);
        return fr4Var;
    }

    public static final boolean j(sak sakVar, int i, j6 j6Var, boolean z) {
        boolean z2;
        synchronized (f) {
            int i2 = sakVar.d;
            if (i2 == i) {
                sakVar.c = j6Var;
                z2 = true;
                if (z) {
                    sakVar.e++;
                }
                sakVar.d = i2 + 1;
            } else {
                z2 = false;
            }
        }
        return z2;
    }

    public static final void j0(int i, int i2) {
        if (i < 0 || i >= i2) {
            h9o.u(fki.o(i, i2, "index (", ") is out of bound of [0, ", ")"));
        }
    }

    public static void k(int[] iArr) {
        int i = iArr[0];
        int i2 = iArr[1];
        int i3 = iArr[2];
        int i4 = iArr[3];
        int i5 = iArr[4];
        int i6 = iArr[5];
        int i7 = iArr[6];
        int i8 = iArr[7];
        int i9 = iArr[8];
        int i10 = iArr[9];
        int i11 = iArr[10];
        int i12 = iArr[11];
        int i13 = iArr[12];
        int i14 = iArr[13];
        int i15 = i2 + (i >>> 28);
        int i16 = i6 + (i5 >>> 28);
        int i17 = i10 + (i9 >>> 28);
        int i18 = i14 + (i13 >>> 28);
        int i19 = i3 + (i15 >>> 28);
        int i20 = i7 + (i16 >>> 28);
        int i21 = i11 + (i17 >>> 28);
        int i22 = iArr[14] + (i18 >>> 28);
        int i23 = i4 + (i19 >>> 28);
        int i24 = i8 + (i20 >>> 28);
        int i25 = i12 + (i21 >>> 28);
        int i26 = iArr[15] + (i22 >>> 28);
        int i27 = i26 >>> 28;
        int i28 = (i & 268435455) + i27;
        int i29 = (i5 & 268435455) + (i23 >>> 28);
        int i30 = (i9 & 268435455) + i27 + (i24 >>> 28);
        int i31 = (i13 & 268435455) + (i25 >>> 28);
        iArr[0] = i28 & 268435455;
        iArr[1] = (i15 & 268435455) + (i28 >>> 28);
        iArr[2] = i19 & 268435455;
        iArr[3] = i23 & 268435455;
        iArr[4] = i29 & 268435455;
        iArr[5] = (i16 & 268435455) + (i29 >>> 28);
        iArr[6] = i20 & 268435455;
        iArr[7] = i24 & 268435455;
        iArr[8] = i30 & 268435455;
        iArr[9] = (i17 & 268435455) + (i30 >>> 28);
        iArr[10] = i21 & 268435455;
        iArr[11] = i25 & 268435455;
        iArr[12] = i31 & 268435455;
        iArr[13] = (i18 & 268435455) + (i31 >>> 28);
        iArr[14] = i22 & 268435455;
        iArr[15] = i26 & 268435455;
    }

    public static void k0(File file, Map map) {
        File file2 = new File(file.getParentFile(), sko.j(".#", file.getName()));
        try {
            DataOutputStream dataOutputStream = new DataOutputStream(new DeflaterOutputStream(new FileOutputStream(file2)));
            try {
                dataOutputStream.writeInt(map.size());
                map.forEach(new by1(new whf(dataOutputStream, (byte) 8), (byte) 1));
                dataOutputStream.flush();
                dataOutputStream.close();
                file2.renameTo(file);
            } finally {
            }
        } finally {
            file2.delete();
        }
    }

    public static void l(int i, int i2, int[] iArr, int[] iArr2) {
        for (int i3 = 0; i3 < 16; i3++) {
            int i4 = iArr2[i3];
            iArr2[i3] = i4 ^ ((iArr[i2 + i3] ^ i4) & i);
        }
    }

    public static void m(int i, int i2, int[] iArr, int[] iArr2) {
        for (int i3 = 0; i3 < 16; i3++) {
            iArr2[i2 + i3] = iArr[i + i3];
        }
    }

    public static void n(long[] jArr, long[] jArr2, int i) {
        jArr2[i] = jArr[0];
        jArr2[i + 1] = jArr[1];
        jArr2[i + 2] = jArr[2];
        jArr2[i + 3] = jArr[3];
        jArr2[i + 4] = jArr[4];
    }

    public static void o(int i, int i2, int[] iArr, int[] iArr2) {
        int i3 = iArr[i];
        int i4 = iArr[i + 1];
        int i5 = iArr[i + 2];
        int i6 = iArr[i + 3];
        int i7 = iArr[i + 4];
        int i8 = iArr[i + 5];
        int i9 = iArr[i + 6];
        iArr2[i2] = i3 & 268435455;
        iArr2[i2 + 1] = ((i3 >>> 28) | (i4 << 4)) & 268435455;
        iArr2[i2 + 2] = ((i4 >>> 24) | (i5 << 8)) & 268435455;
        iArr2[i2 + 3] = ((i5 >>> 20) | (i6 << 12)) & 268435455;
        iArr2[i2 + 4] = ((i6 >>> 16) | (i7 << 16)) & 268435455;
        iArr2[i2 + 5] = ((i7 >>> 12) | (i8 << 20)) & 268435455;
        iArr2[i2 + 6] = ((i8 >>> 8) | (i9 << 24)) & 268435455;
        iArr2[i2 + 7] = i9 >>> 4;
    }

    public static void p(int i, int i2, byte[] bArr, int[] iArr) {
        int i3 = (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | (bArr[i + 3] << 24);
        int i4 = (bArr[i + 4] & 255) | ((bArr[i + 5] & 255) << 8) | ((bArr[i + 6] & 255) << 16);
        iArr[i2] = 268435455 & i3;
        iArr[i2 + 1] = (i3 >>> 28) | (i4 << 4);
    }

    public static void q(int i, int i2, int[] iArr, int[] iArr2) {
        int i3 = iArr[i];
        int i4 = iArr[i + 1];
        int i5 = iArr[i + 2];
        int i6 = iArr[i + 3];
        int i7 = iArr[i + 4];
        int i8 = iArr[i + 5];
        int i9 = iArr[i + 6];
        int i10 = iArr[i + 7];
        iArr2[i2] = i3 | (i4 << 28);
        iArr2[i2 + 1] = (i4 >>> 4) | (i5 << 24);
        iArr2[i2 + 2] = (i5 >>> 8) | (i6 << 20);
        iArr2[i2 + 3] = (i6 >>> 12) | (i7 << 16);
        iArr2[i2 + 4] = (i7 >>> 16) | (i8 << 12);
        iArr2[i2 + 5] = (i8 >>> 20) | (i9 << 8);
        iArr2[i2 + 6] = (i9 >>> 24) | (i10 << 4);
    }

    public static void r(int i, int i2, byte[] bArr, int[] iArr) {
        int i3 = iArr[i];
        int i4 = iArr[i + 1];
        int i5 = i3 | (i4 << 28);
        bArr[i2] = (byte) i5;
        bArr[i2 + 1] = (byte) (i5 >>> 8);
        bArr[i2 + 2] = (byte) (i5 >>> 16);
        bArr[i2 + 3] = (byte) (i5 >>> 24);
        bArr[i2 + 4] = (byte) (i4 >>> 4);
        bArr[i2 + 5] = (byte) (i4 >>> 12);
        bArr[i2 + 6] = (byte) (i4 >>> 20);
    }

    public static final boolean s(long j, long j2) {
        return j == j2;
    }

    public static int t(Context context) {
        String[] strArr = OperaApplication.K;
        switch (context.getApplicationContext().J().g().ordinal()) {
            case 0:
                return 2131559515;
            case 1:
                return 2131559522;
            case 2:
                return 2131559517;
            case 3:
                return 2131559516;
            case 4:
                return 2131559521;
            case 5:
                return 2131559519;
            case 6:
                return 2131559518;
            case 7:
                return 2131559523;
            case 8:
                return 2131559609;
            default:
                h9o.p();
                return 0;
        }
    }

    public static Object v(ListenableFuture listenableFuture) {
        jpo.n("Future was expected to be done, " + listenableFuture, listenableFuture.isDone());
        return F(listenableFuture);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.util.LinkedList, java.util.List] */
    /* JADX WARN: Type inference failed for: r2v18, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.util.List] */
    public static List w() throws IOException {
        Process processExec = Runtime.getRuntime().exec("logcat -d");
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(processExec.getInputStream()));
        ?? linkedList = new LinkedList();
        Integer numValueOf = null;
        while (numValueOf == null) {
            while (true) {
                try {
                    String line = bufferedReader.readLine();
                    if (line != null) {
                        linkedList.add(line);
                        if (linkedList.size() > 1024) {
                            linkedList.removeFirst();
                        }
                    } else {
                        try {
                            break;
                        } catch (IllegalThreadStateException unused) {
                            Thread.sleep(500L);
                        }
                    }
                } catch (Throwable th) {
                    bufferedReader.close();
                    throw th;
                }
            }
            numValueOf = Integer.valueOf(processExec.exitValue());
        }
        bufferedReader.close();
        if (numValueOf.intValue() != 0) {
            t3p.p(numValueOf, "Logcat failed: ");
            return null;
        }
        int size = linkedList.size() - 1;
        while (true) {
            if (size < 0) {
                break;
            }
            if (((String) linkedList.get(size)).contains("-----BEGIN BREAKPAD MICRODUMP-----")) {
                linkedList = linkedList.subList(0, size);
                linkedList.add("-----SNIPPED OUT BREAKPAD MICRODUMP FOR THIS CRASH-----");
                break;
            }
            size--;
        }
        int size2 = linkedList.size();
        List<String> listSubList = linkedList;
        if (size2 > 256) {
            listSubList = linkedList.subList(linkedList.size() - NotificationCompat.FLAG_LOCAL_ONLY, linkedList.size());
        }
        ArrayList arrayList = new ArrayList(listSubList.size());
        for (String str : listSubList) {
            Pattern pattern = veg.a;
            String strReplaceAll = Patterns.EMAIL_ADDRESS.matcher(str).replaceAll("XXX@EMAIL.ELIDED");
            if (strReplaceAll.contains("://")) {
                strReplaceAll = veg.a(strReplaceAll);
            }
            arrayList.add(veg.d.matcher(veg.c.matcher(Patterns.IP_ADDRESS.matcher(strReplaceAll).replaceAll("1.2.3.4")).replaceAll("01:23:45:67:89:AB")).replaceAll("[ELIDED:CONSOLE(0)] ELIDED CONSOLE MESSAGE"));
        }
        return Collections.unmodifiableList(arrayList);
    }

    public static Set x() {
        try {
            Object objInvoke = Class.forName("android.text.EmojiConsistency").getMethod("getEmojiConsistencySet", null).invoke(null, null);
            if (objInvoke == null) {
                return Collections.EMPTY_SET;
            }
            Set set = (Set) objInvoke;
            Iterator it = set.iterator();
            while (it.hasNext()) {
                if (!(it.next() instanceof int[])) {
                    return Collections.EMPTY_SET;
                }
            }
            return set;
        } catch (Throwable unused) {
            return Collections.EMPTY_SET;
        }
    }

    public static ArrayList y(msh mshVar, ox8 ox8Var, ox8 ox8Var2, ox8 ox8Var3) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new g4b(mshVar, 2131233001, new rxh(2132019374), mshVar instanceof ure ? 2132019058 : 2132019056, ox8Var, (byte) 1));
        List list = mshVar.w;
        if (list != null) {
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                tx8 tx8Var = (tx8) it.next();
                if ("domain".equals(tx8Var.a) && !TextUtils.isEmpty(tx8Var.b)) {
                    arrayList.add(new bk3(mshVar, tx8Var, ox8Var2));
                    break;
                }
            }
        }
        arrayList.add(new g4b(mshVar, 2131232509, new rxh(2132020011), mshVar instanceof ure ? 2132020908 : 2132020906, ox8Var3, (byte) 0));
        return arrayList;
    }

    public static o94 z(m94 m94Var) {
        l94 l94Var = new l94();
        l94Var.c = new byh();
        o94 o94Var = new o94(l94Var);
        l94Var.b = o94Var;
        l94Var.a = m94Var.getClass();
        try {
            Object objAttachCompleter = m94Var.attachCompleter(l94Var);
            if (objAttachCompleter != null) {
                l94Var.a = objAttachCompleter;
            }
            return o94Var;
        } catch (Exception e2) {
            o94Var.a(e2);
            return o94Var;
        }
    }

    public abstract int C();

    public abstract int D();

    public abstract boolean h(int i, int i2);

    public abstract boolean i(int i, int i2);

    public Object u(int i, int i2) {
        return null;
    }
}
