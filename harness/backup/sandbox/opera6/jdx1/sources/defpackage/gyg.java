package defpackage;

import android.graphics.Paint;
import android.hardware.camera2.CaptureRequest;
import android.text.InputFilter;
import android.text.Layout;
import android.text.method.TransformationMethod;
import android.util.Base64;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import androidx.core.app.NotificationCompat;
import java.io.IOException;
import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.json.JSONException;

/* loaded from: classes.dex */
public abstract class gyg {
    public static boolean a = true;
    public static final ue5 b = new ue5(2102777524, new lf5((byte) 0), false);
    public static final ue5 c = new ue5(-941245465, new lf5((byte) 1), false);
    public static final ue5 d = new ue5(-279582037, new lf5((byte) 2), false);
    public static final ue5 e = new ue5(-225754024, new lf5((byte) 3), false);
    public static final c9 f = new c9(18);
    public static final Object g = new Object();
    public static final z20 h = new z20();
    public static final vxg i = new vxg(b9o.class, z10.class, new sjn((byte) 26));
    public static final eko j = new eko(0);
    public static byte k = 3;

    public static final boolean E(vg9 vg9Var) {
        m3c m3cVar;
        wye wyeVar;
        m3c m3cVar2;
        wye wyeVar2 = vg9Var.h;
        return (wyeVar2 == null || (m3cVar = wyeVar2.u) == null || !m3cVar.I() || (wyeVar = vg9Var.h) == null || (m3cVar2 = wyeVar.u) == null || !m3cVar2.H()) ? false : true;
    }

    public static boolean G(int i2, String str) {
        return k <= i2 || Log.isLoggable(str, i2);
    }

    public static void H(int[] iArr, int[] iArr2, int[] iArr3) {
        ipe.Q(iArr, iArr2, iArr3);
        long j2 = iArr2[6] & 4294967295L;
        long j3 = iArr2[7] & 4294967295L;
        long j4 = iArr2[8] & 4294967295L;
        long j5 = iArr2[9] & 4294967295L;
        long j6 = iArr2[10] & 4294967295L;
        long j7 = iArr2[11] & 4294967295L;
        long j8 = iArr[6] & 4294967295L;
        long j9 = j8 * j2;
        iArr3[12] = (int) j9;
        long j10 = (j8 * j3) + (j9 >>> 32);
        iArr3[13] = (int) j10;
        long j11 = (j8 * j4) + (j10 >>> 32);
        iArr3[14] = (int) j11;
        long j12 = (j8 * j5) + (j11 >>> 32);
        iArr3[15] = (int) j12;
        long j13 = (j8 * j6) + (j12 >>> 32);
        iArr3[16] = (int) j13;
        long j14 = (j8 * j7) + (j13 >>> 32);
        iArr3[17] = (int) j14;
        iArr3[18] = (int) (j14 >>> 32);
        int i2 = 12;
        int i3 = 1;
        while (i3 < 6) {
            int i4 = i2 + 1;
            int i5 = i3;
            long j15 = iArr[6 + i3] & 4294967295L;
            long j16 = j4;
            long j17 = (j15 * j2) + (iArr3[i4] & 4294967295L);
            iArr3[i4] = (int) j17;
            long j18 = (j15 * j3) + (iArr3[r3] & 4294967295L) + (j17 >>> 32);
            iArr3[i2 + 2] = (int) j18;
            long j19 = (j15 * j16) + (iArr3[r5] & 4294967295L) + (j18 >>> 32);
            iArr3[i2 + 3] = (int) j19;
            long j20 = (j15 * j5) + (iArr3[r3] & 4294967295L) + (j19 >>> 32);
            iArr3[i2 + 4] = (int) j20;
            long j21 = (j15 * j6) + (iArr3[r5] & 4294967295L) + (j20 >>> 32);
            iArr3[i2 + 5] = (int) j21;
            long j22 = (j15 * j7) + (iArr3[r3] & 4294967295L) + (j21 >>> 32);
            iArr3[i2 + 6] = (int) j22;
            iArr3[i2 + 7] = (int) (j22 >>> 32);
            i3 = i5 + 1;
            i2 = i4;
            j4 = j16;
        }
        int i6 = ipe.i(iArr3, iArr3);
        int iH = ipe.h(18, 12, ipe.h(0, 6, 0, iArr3, iArr3) + i6, iArr3, iArr3) + i6;
        int[] iArr4 = new int[6];
        int[] iArr5 = new int[6];
        boolean z = ipe.q(iArr, iArr, iArr4) != ipe.q(iArr2, iArr2, iArr5);
        int[] iArr6 = new int[12];
        ipe.Q(iArr4, iArr5, iArr6);
        z5i.l(24, iH + (z ? z5i.j(12, 6, iArr6, iArr3) : z5i.z0(12, 6, iArr6, iArr3)), 18, iArr3);
    }

    public static final void I(byi byiVar, long j2, Function1 function1) {
        gdf gdfVar = new gdf(j2);
        fdf fdfVar = fdf.a;
        y9m.t(3, fdfVar);
        zxi zxiVar = new zxi(byiVar, gdfVar, fdfVar, xe5.h, xf8.q, (kuk) function1, (j04) null);
        int i2 = byi.g;
        byiVar.j(zxiVar, false);
    }

    public static u9d J(orb orbVar) throws JSONException {
        orb orbVarC = orbVar.c("channels");
        u9d u9dVar = new u9d();
        Iterator<String> itKeys = orbVarC.a.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            cs4 cs4VarW = p37.W(next);
            if (cs4VarW != null) {
                orb orbVarC2 = orbVarC.c(next);
                try {
                    u9dVar.put(cs4VarW, new zy8(orbVarC2.e("version"), Base64.decode(orbVarC2.e("data"), 0)));
                } catch (IllegalArgumentException e2) {
                    throw new JSONException("Badly encoded data", e2);
                }
            }
        }
        return u9dVar.g();
    }

    public static kv0 K(izd izdVar) throws lv0, IOException {
        n08 n08Var;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        int i2 = izdVar.readInt();
        Set setO = O(izdVar);
        int unsignedShort = izdVar.readUnsignedShort();
        if (unsignedShort == 0) {
            n08Var = n08.a;
        } else {
            n08 linkedHashMap = new LinkedHashMap();
            for (int i3 = 0; i3 < unsignedShort; i3++) {
                String strH = izdVar.h();
                String string = strH != null ? StringsKt.l0(strH).toString() : null;
                if (string == null || string.length() == 0) {
                    throw new lv0("Received empty settings key");
                }
                if (linkedHashMap.containsKey(string)) {
                    throw new lv0("Received duplicate settings key: ".concat(string));
                }
                linkedHashMap.put(string, Integer.valueOf(izdVar.readShort()));
            }
            n08Var = linkedHashMap;
        }
        Set setO2 = izdVar.available() > 0 ? O(izdVar) : mv0.k.j;
        n08 n08Var2 = n08Var;
        kv0 kv0Var = mv0.k;
        bw0 bw0Var = kv0Var.b;
        bw0 bw0Var2 = kv0Var.b;
        bw0 bw0Var3 = new bw0(((Number) n08Var2.getOrDefault("limit_explain", Integer.valueOf(bw0Var.a))).intValue(), ((Number) n08Var2.getOrDefault("limit_summary", Integer.valueOf(bw0Var2.b))).intValue(), ((Number) n08Var2.getOrDefault("limit_question_chat_title", Integer.valueOf(bw0Var2.c))).intValue(), ((Number) n08Var2.getOrDefault("warning_requests_available", Integer.valueOf(bw0Var2.d))).intValue());
        boolean z6 = true;
        boolean z7 = (i2 & 1) != 0;
        if ((i2 & 2) != 0) {
            z = true;
        } else {
            z = true;
            z6 = false;
        }
        if ((i2 & 4) != 0) {
            z2 = z;
        } else {
            z2 = z;
            z = false;
        }
        if ((i2 & 32) != 0) {
            z3 = z2;
        } else {
            z3 = z2;
            z2 = false;
        }
        if ((i2 & 64) != 0) {
            z4 = z3;
        } else {
            z4 = z3;
            z3 = false;
        }
        if ((i2 & NotificationCompat.FLAG_HIGH_PRIORITY) != 0) {
            z5 = z4;
        } else {
            z5 = z4;
            z4 = false;
        }
        if ((i2 & NotificationCompat.FLAG_LOCAL_ONLY) == 0) {
            z5 = false;
        }
        return new kv0(setO, bw0Var3, z7, z6, z, z2, z3, z4, z5, setO2);
    }

    public static final void L(yz4 yz4Var, String str, Boolean bool) {
        yz4Var.e(str, qqb.a(bool));
    }

    public static final void M(yz4 yz4Var, String str, Number number) {
        yz4Var.e(str, qqb.b(number));
    }

    public static final void N(yz4 yz4Var, String str, String str2) {
        yz4Var.e(str, qqb.c(str2));
    }

    public static Set O(izd izdVar) throws lv0, IOException {
        int unsignedShort = izdVar.readUnsignedShort();
        if (unsignedShort == 0) {
            return v08.a;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (int i2 = 0; i2 < unsignedShort; i2++) {
            String strH = izdVar.h();
            String string = strH != null ? StringsKt.l0(strH).toString() : null;
            if (string == null || string.length() == 0) {
                throw new lv0("Empty language");
            }
            if (linkedHashSet.contains(string)) {
                throw new lv0("Received duplicate language: ".concat(string));
            }
            if (!string.equals(string.toLowerCase(Locale.ROOT))) {
                throw new lv0("Language not lower-case: ".concat(string));
            }
            linkedHashSet.add(string);
        }
        return linkedHashSet;
    }

    public static final ue5 P(int i2, br9 br9Var, ih5 ih5Var) {
        vt9 vt9Var = (vt9) ih5Var;
        Object objK = vt9Var.K();
        if (objK == hh5.a) {
            objK = new ue5(i2, br9Var, true);
            vt9Var.g0(objK);
        }
        ue5 ue5Var = (ue5) objK;
        if (!Intrinsics.a(ue5Var.c, br9Var)) {
            boolean z = ue5Var.c == null;
            ue5Var.c = br9Var;
            if (!z && ue5Var.b) {
                znh znhVar = ue5Var.d;
                if (znhVar != null) {
                    fi5 fi5Var = znhVar.a;
                    if (fi5Var != null) {
                        fi5Var.s(znhVar, null);
                    }
                    ue5Var.d = null;
                }
                ArrayList arrayList = ue5Var.e;
                if (arrayList != null) {
                    int size = arrayList.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        znh znhVar2 = (znh) arrayList.get(i3);
                        fi5 fi5Var2 = znhVar2.a;
                        if (fi5Var2 != null) {
                            fi5Var2.s(znhVar2, null);
                        }
                    }
                    arrayList.clear();
                }
            }
        }
        return ue5Var;
    }

    public static final void Q(lqj lqjVar, int i2, Object obj) {
        int iG = lqjVar.g(i2);
        Object[] objArr = lqjVar.c;
        Object obj2 = objArr[iG];
        objArr[iG] = hh5.a;
        if (obj == obj2) {
            return;
        }
        mh5.a("Slot table is out of sync (expected " + obj + ", got " + obj2 + ")");
    }

    public static final void R(ArrayList arrayList, int i2, int i3) {
        int iS = s(i2, arrayList);
        if (iS < 0) {
            iS = -(iS + 1);
        }
        while (iS < arrayList.size() && ((ljb) arrayList.get(iS)).b < i3) {
        }
    }

    public static void U(int[] iArr, int[] iArr2) {
        ipe.a0(iArr, iArr2);
        long j2 = 4294967295L;
        long j3 = iArr[6] & 4294967295L;
        int i2 = 5;
        int i3 = 12;
        int i4 = 0;
        while (true) {
            int i5 = i2 - 1;
            long j4 = iArr[i2 + 6] & j2;
            long j5 = j4 * j4;
            long j6 = j2;
            iArr2[i3 + 11] = (i4 << 31) | ((int) (j5 >>> 33));
            int i6 = i3 - 2;
            iArr2[i3 + 10] = (int) (j5 >>> 1);
            i4 = (int) j5;
            if (i5 <= 0) {
                long j7 = j3 * j3;
                iArr2[12] = (int) j7;
                long j8 = iArr[7] & j6;
                long j9 = (j8 * j3) + (((i4 << 31) & j6) | (j7 >>> 33));
                int i7 = (int) j9;
                iArr2[13] = (i7 << 1) | (((int) (j7 >>> 32)) & 1);
                long j10 = (iArr2[14] & j6) + (j9 >>> 32);
                long j11 = iArr[8] & j6;
                long j12 = (j11 * j3) + j10;
                int i8 = (int) j12;
                iArr2[14] = (i8 << 1) | (i7 >>> 31);
                long jD = osp.d(j11, j8, j12 >>> 32, iArr2[15] & j6);
                long j13 = (iArr2[16] & j6) + (jD >>> 32);
                long j14 = iArr[9] & j6;
                long j15 = (iArr2[17] & j6) + (j13 >>> 32);
                long j16 = j13 & j6;
                long j17 = (iArr2[18] & j6) + (j15 >>> 32);
                long j18 = j15 & j6;
                long j19 = (j14 * j3) + (jD & j6);
                int i9 = (int) j19;
                iArr2[15] = (i9 << 1) | (i8 >>> 31);
                long jD2 = osp.d(j14, j8, j19 >>> 32, j16);
                long jD3 = osp.d(j14, j11, jD2 >>> 32, j18);
                long j20 = j17 + (jD3 >>> 32);
                long j21 = jD3 & j6;
                long j22 = iArr[10] & j6;
                long j23 = (iArr2[19] & j6) + (j20 >>> 32);
                long j24 = j20 & j6;
                long j25 = (iArr2[20] & j6) + (j23 >>> 32);
                long j26 = j23 & j6;
                long j27 = (j22 * j3) + (jD2 & j6);
                int i10 = (int) j27;
                iArr2[16] = (i10 << 1) | (i9 >>> 31);
                long jD4 = osp.d(j22, j8, j27 >>> 32, j21);
                long jD5 = osp.d(j22, j11, jD4 >>> 32, j24);
                long jD6 = osp.d(j22, j14, jD5 >>> 32, j26);
                long j28 = jD5 & j6;
                long j29 = j25 + (jD6 >>> 32);
                long j30 = iArr[11] & j6;
                long j31 = (iArr2[21] & j6) + (j29 >>> 32);
                long j32 = (j3 * j30) + (jD4 & j6);
                int i11 = (int) j32;
                iArr2[17] = (i11 << 1) | (i10 >>> 31);
                long jD7 = osp.d(j30, j8, j32 >>> 32, j28);
                long jD8 = osp.d(j30, j11, jD7 >>> 32, jD6 & j6);
                long jD9 = osp.d(j30, j14, jD8 >>> 32, j29 & j6);
                long jD10 = osp.d(j30, j22, jD9 >>> 32, j31 & j6);
                long j33 = (iArr2[22] & j6) + (j31 >>> 32) + (jD10 >>> 32);
                int i12 = (int) jD7;
                iArr2[18] = (i12 << 1) | (i11 >>> 31);
                int i13 = (int) jD8;
                iArr2[19] = (i13 << 1) | (i12 >>> 31);
                int i14 = (int) jD9;
                iArr2[20] = (i14 << 1) | (i13 >>> 31);
                int i15 = (int) jD10;
                iArr2[21] = (i15 << 1) | (i14 >>> 31);
                int i16 = (int) j33;
                iArr2[22] = (i16 << 1) | (i15 >>> 31);
                iArr2[23] = ((iArr2[23] + ((int) (j33 >>> 32))) << 1) | (i16 >>> 31);
                int i17 = ipe.i(iArr2, iArr2);
                int iH = ipe.h(18, 12, ipe.h(0, 6, 0, iArr2, iArr2) + i17, iArr2, iArr2) + i17;
                int[] iArr3 = new int[6];
                ipe.q(iArr, iArr, iArr3);
                int[] iArr4 = new int[12];
                ipe.a0(iArr3, iArr4);
                z5i.l(24, z5i.z0(12, 6, iArr4, iArr2) + iH, 18, iArr2);
                return;
            }
            i3 = i6;
            i2 = i5;
            j2 = j6;
        }
    }

    public static byte[] V(int i2, BigInteger bigInteger) throws GeneralSecurityException {
        if (bigInteger.signum() == -1) {
            qp2.o("integer must be nonnegative");
            return null;
        }
        byte[] byteArray = bigInteger.toByteArray();
        if (byteArray.length == i2) {
            return byteArray;
        }
        int i3 = i2 + 1;
        if (byteArray.length > i3) {
            t3p.w("integer too large");
            return null;
        }
        if (byteArray.length != i3) {
            byte[] bArr = new byte[i2];
            System.arraycopy(byteArray, 0, bArr, i2 - byteArray.length, byteArray.length);
            return bArr;
        }
        if (byteArray[0] == 0) {
            return Arrays.copyOfRange(byteArray, 1, byteArray.length);
        }
        t3p.w("integer too large");
        return null;
    }

    public static final void W(fmg fmgVar, long j2, Function1 function1, boolean z) {
        MotionEvent motionEventA = fmgVar.a();
        if (motionEventA == null) {
            qp2.o("The PointerEvent receiver cannot have a null MotionEvent.");
            return;
        }
        int action = motionEventA.getAction();
        if (z) {
            motionEventA.setAction(3);
        }
        int i2 = (int) (j2 >> 32);
        int i3 = (int) (j2 & 4294967295L);
        motionEventA.offsetLocation(-Float.intBitsToFloat(i2), -Float.intBitsToFloat(i3));
        function1.invoke(motionEventA);
        motionEventA.offsetLocation(Float.intBitsToFloat(i2), Float.intBitsToFloat(i3));
        motionEventA.setAction(action);
    }

    public static final LinkedHashMap X(tj5 tj5Var) {
        Object objI;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (an2 an2Var : tj5Var.d()) {
            CaptureRequest.Key key = an2Var.c;
            if (key == null) {
                key = null;
            }
            if (key != null && (objI = tj5Var.i(an2Var)) != null) {
                linkedHashMap.put(key, objI);
            }
        }
        return linkedHashMap;
    }

    public static final void Y() {
        throw new UnsupportedOperationException();
    }

    public static final int Z(m6c m6cVar) {
        List list = m6cVar.l;
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            i2 += ((n6c) list.get(i3)).m;
        }
        return (i2 / list.size()) + m6cVar.r;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: oye */
    public static final void a(ang angVar, Function0 function0, Function1 function1, Function0 function02, c8e c8eVar, ih5 ih5Var, int i2) throws oye {
        int i3;
        c8e c8eVar2;
        Function0 function03 = function0;
        vt9 vt9Var = (vt9) ih5Var;
        vt9Var.Y(838338506);
        if ((i2 & 6) == 0) {
            i3 = (vt9Var.f(angVar) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= vt9Var.h(function03) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= vt9Var.h(function1) ? 256 : NotificationCompat.FLAG_HIGH_PRIORITY;
        }
        if ((i2 & 3072) == 0) {
            i3 |= vt9Var.h(function02) ? 2048 : 1024;
        }
        int i4 = i3 | 24576;
        if (vt9Var.N(i4 & 1, (i4 & 9363) != 9362)) {
            boolean z = angVar instanceof wmg;
            z7e z7eVar = z7e.b;
            if (z) {
                vt9Var.W(-292087650);
                wmg wmgVar = (wmg) angVar;
                fsl fslVar = wmgVar.b;
                String str = wmgVar.a;
                n01 n01Var = wmgVar.c;
                boolean z2 = ((i4 & 896) == 256) | ((i4 & 14) == 4);
                Object objK = vt9Var.K();
                if (z2 || objK == hh5.a) {
                    objK = new s4f(function1, angVar, (byte) 9);
                    vt9Var.g0(objK);
                }
                b(fslVar, str, n01Var, function0, (Function0) objK, z7eVar, vt9Var, ((i4 << 6) & 7168) | 196608);
                c8eVar2 = z7eVar;
                vt9Var = vt9Var;
                vt9Var.p(false);
            } else {
                c8eVar2 = z7eVar;
                if (angVar instanceof ymg) {
                    vt9Var.W(-291699096);
                    e(c8eVar2, vt9Var, 6);
                    vt9Var.p(false);
                } else if (angVar instanceof zmg) {
                    vt9Var.W(-291582009);
                    function03 = function0;
                    h(function03, function02, ((zmg) angVar).a, c8eVar2, vt9Var, ((i4 >> 3) & 14) | ((i4 >> 6) & 112) | 3072);
                    vt9Var.p(false);
                } else {
                    function03 = function0;
                    if (!(angVar instanceof xmg)) {
                        throw fki.m(vt9Var, -1810539119, false);
                    }
                    vt9Var.W(-291292345);
                    c(((xmg) angVar).a, function03, c8eVar2, vt9Var, (i4 & 112) | 384);
                    vt9Var.p(false);
                }
            }
            function03 = function0;
        } else {
            vt9Var.Q();
            c8eVar2 = c8eVar;
        }
        znh znhVarR = vt9Var.r();
        if (znhVarR != null) {
            znhVarR.d = new wy5(angVar, function03, function1, function02, c8eVar2, i2);
        }
    }

    public static final void b(fsl fslVar, String str, n01 n01Var, Function0 function0, Function0 function02, c8e c8eVar, ih5 ih5Var, int i2) {
        int i3;
        c8e c8eVar2;
        vt9 vt9Var;
        vt9 vt9Var2 = (vt9) ih5Var;
        vt9Var2.Y(-768585879);
        if ((i2 & 6) == 0) {
            i3 = ((i2 & 8) == 0 ? vt9Var2.f(fslVar) : vt9Var2.h(fslVar) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= vt9Var2.f(str) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= (i2 & NotificationCompat.FLAG_GROUP_SUMMARY) == 0 ? vt9Var2.f(n01Var) : vt9Var2.h(n01Var) ? NotificationCompat.FLAG_LOCAL_ONLY : NotificationCompat.FLAG_HIGH_PRIORITY;
        }
        if ((i2 & 3072) == 0) {
            i3 |= vt9Var2.h(function0) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= vt9Var2.h(function02) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            c8eVar2 = c8eVar;
            i3 |= vt9Var2.f(c8eVar2) ? 131072 : 65536;
        } else {
            c8eVar2 = c8eVar;
        }
        if (vt9Var2.N(i3 & 1, (74899 & i3) != 74898)) {
            c8e c8eVarX = a26.X(wxe.Q(c8eVar2), 24.0f);
            db5 db5VarA = cb5.a(b72.c, rbe.o, vt9Var2, 48);
            int iHashCode = Long.hashCode(vt9Var2.T);
            oag oagVarL = vt9Var2.l();
            c8e c8eVarP = qyn.P(vt9Var2, c8eVarX);
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
            String strQ = uyg.q((shk) dhk.k.getValue(), vt9Var2);
            hp7 hp7Var = abm.a;
            int i4 = i3;
            ijl.b(strQ, null, 0L, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, ((wam) vt9Var2.j(hp7Var)).f, vt9Var2, 0, 0, 131070);
            z7e z7eVar = z7e.b;
            ocp.c(vt9Var2, mpj.c(z7eVar, 16.0f));
            o9i o9iVarA = m9i.a(new x62(4.0f, true, new t40((byte) 19)), rbe.k, vt9Var2, 6);
            int iHashCode2 = Long.hashCode(vt9Var2.T);
            oag oagVarL2 = vt9Var2.l();
            c8e c8eVarP2 = qyn.P(vt9Var2, z7eVar);
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
            ijl.b(fslVar.a, null, ((sa5) vt9Var2.j(ua5.a)).a, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, ((wam) vt9Var2.j(hp7Var)).c, vt9Var2, 0, 0, 131066);
            ijl.b(fslVar.b.toUpperCase(Locale.ROOT), null, ((kk8) vt9Var2.j(lk8.a)).j, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, ((wam) vt9Var2.j(hp7Var)).c, vt9Var2, 0, 0, 131066);
            vt9Var2.p(true);
            ocp.c(vt9Var2, mpj.c(z7eVar, 16.0f));
            ijl.b(uyg.q((shk) dhk.C.getValue(), vt9Var2), null, 0L, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, ((wam) vt9Var2.j(hp7Var)).k, vt9Var2, 0, 0, 131070);
            ocp.c(vt9Var2, mpj.c(z7eVar, 4.0f));
            ijl.b(str, null, 0L, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, ((wam) vt9Var2.j(hp7Var)).j, vt9Var2, (i4 >> 3) & 14, 0, 131070);
            ocp.c(vt9Var2, mpj.c(z7eVar, 24.0f));
            i39 i39Var = mpj.a;
            yi4.i(function0, i39Var, false, (paj) null, (z14) null, (go3) null, (zvf) null, sfe.a, vt9Var2, ((i4 >> 9) & 14) | 805306416, 508);
            yi4.a(function02, i39Var, false, (paj) null, (z14) null, (e24) null, (go3) null, (zvf) null, P(-1661504061, new j04(n01Var, (byte) 13), vt9Var2), vt9Var2, ((i4 >> 12) & 14) | 805306416, 508);
            vt9Var = vt9Var2;
            vt9Var.p(true);
        } else {
            vt9Var = vt9Var2;
            vt9Var.Q();
        }
        znh znhVarR = vt9Var.r();
        if (znhVarR != null) {
            znhVarR.d = new se5(fslVar, str, n01Var, function0, function02, c8eVar, i2, (byte) 4);
        }
    }

    public static final void c(String str, Function0 function0, c8e c8eVar, ih5 ih5Var, int i2) {
        int i3;
        Function0 function02;
        c8e c8eVar2;
        vt9 vt9Var = (vt9) ih5Var;
        vt9Var.Y(-623667487);
        if ((i2 & 6) == 0) {
            i3 = (vt9Var.f(str) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            function02 = function0;
            i3 |= vt9Var.h(function02) ? 32 : 16;
        } else {
            function02 = function0;
        }
        if ((i2 & 384) == 0) {
            c8eVar2 = c8eVar;
            i3 |= vt9Var.f(c8eVar2) ? NotificationCompat.FLAG_LOCAL_ONLY : NotificationCompat.FLAG_HIGH_PRIORITY;
        } else {
            c8eVar2 = c8eVar;
        }
        if (vt9Var.N(i3 & 1, (i3 & 147) != 146)) {
            c8e c8eVarX = a26.X(wxe.Q(c8eVar2), 24.0f);
            db5 db5VarA = cb5.a(new x62(24.0f, true, new t40((byte) 19)), rbe.n, vt9Var, 6);
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
            ijl.b(str, null, 0L, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, ((wam) vt9Var.j(abm.a)).k, vt9Var, i3 & 14, 0, 131070);
            vt9Var = vt9Var;
            yi4.a(function02, mpj.a, false, (paj) null, (z14) null, (e24) null, (go3) null, (zvf) null, sfe.d, vt9Var, ((i3 >> 3) & 14) | 805306416, 508);
            vt9Var.p(true);
        } else {
            vt9Var.Q();
        }
        znh znhVarR = vt9Var.r();
        if (znhVarR != null) {
            znhVarR.d = new ga1((Object) str, (Object) function0, (Object) c8eVar2, i2, (byte) 13);
        }
    }

    public static final void d(c8e c8eVar, ih5 ih5Var, int i2) {
        byte b2;
        vt9 vt9Var = (vt9) ih5Var;
        vt9Var.Y(-1680071884);
        if (vt9Var.N(i2 & 1, (i2 & 3) != 2)) {
            o9i o9iVarA = m9i.a(new x62(8.0f, true, new t40((byte) 19)), rbe.l, vt9Var, 54);
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
            y4h.o(vt9Var, o9iVarA, ujp.f);
            y4h.o(vt9Var, oagVarL, ujp.e);
            y4h.o(vt9Var, Integer.valueOf(iHashCode), ujp.g);
            y4h.m(vt9Var);
            y4h.o(vt9Var, c8eVarP, ujp.d);
            hyf hyfVarA = iza.a((dl7) tk7.o.getValue(), vt9Var);
            c8e c8eVarH = mpj.h(z7e.b, 16.0f);
            hp7 hp7Var = ua5.a;
            wta.b(hyfVarA, null, c8eVarH, ((sa5) vt9Var.j(hp7Var)).d, vt9Var, 440, 0);
            b2 = 1;
            ijl.b(uyg.q((shk) ahk.q.getValue(), vt9Var), new g4c(1.0f, true), ((sa5) vt9Var.j(hp7Var)).d, 0L, null, 0L, null, null, 0L, 0, false, 1, 0, ((wam) vt9Var.j(abm.a)).l, vt9Var, 0, 24576, 114680);
            vt9Var = vt9Var;
            vt9Var.p(true);
        } else {
            b2 = 1;
            vt9Var.Q();
        }
        znh znhVarR = vt9Var.r();
        if (znhVarR != null) {
            znhVarR.d = new lr3(c8eVar, i2, b2);
        }
    }

    public static final void e(c8e c8eVar, ih5 ih5Var, int i2) {
        int i3;
        vt9 vt9Var = (vt9) ih5Var;
        vt9Var.Y(840817464);
        if ((i2 & 6) == 0) {
            i3 = (vt9Var.f(c8eVar) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if (vt9Var.N(i3 & 1, (i3 & 3) != 2)) {
            c8e c8eVarE = mpj.e(c8eVar.d(mpj.a), 200.0f, 2);
            tfd tfdVarC = nr3.c(rbe.f, false);
            int iHashCode = Long.hashCode(vt9Var.T);
            oag oagVarL = vt9Var.l();
            c8e c8eVarP = qyn.P(vt9Var, c8eVarE);
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
            v4h.a(null, 0L, 0.0f, 0L, 0, 0.0f, vt9Var, 0, 63);
            vt9Var.p(true);
        } else {
            vt9Var.Q();
        }
        znh znhVarR = vt9Var.r();
        if (znhVarR != null) {
            znhVarR.d = new ul4(c8eVar, i2, (byte) 5);
        }
    }

    public static final void f(erd erdVar, Function0 function0, Function0 function02, Function1 function1, Function0 function03, Function0 function04, c8e c8eVar, ih5 ih5Var, int i2) {
        c8e c8eVar2;
        vt9 vt9Var = (vt9) ih5Var;
        vt9Var.Y(1238349826);
        int i3 = i2 | (vt9Var.f(erdVar) ? 4 : 2) | (vt9Var.h(function0) ? 32 : 16) | (vt9Var.h(function02) ? NotificationCompat.FLAG_LOCAL_ONLY : NotificationCompat.FLAG_HIGH_PRIORITY) | (vt9Var.h(function1) ? 2048 : 1024) | (vt9Var.h(function03) ? 16384 : 8192) | (vt9Var.h(function04) ? 131072 : 65536) | 1572864;
        if (vt9Var.N(i3 & 1, (599187 & i3) != 599186)) {
            z7e z7eVar = z7e.b;
            sfe.r(mzg.q(vt9Var, 2132021261), function0, function02, z7eVar, P(2112958044, new l5c(erdVar, function1, function03, function04, (byte) 7), vt9Var), vt9Var, (i3 & 112) | 24576 | (i3 & 896) | 3072, 0);
            c8eVar2 = z7eVar;
        } else {
            vt9Var.Q();
            c8eVar2 = c8eVar;
        }
        znh znhVarR = vt9Var.r();
        if (znhVarR != null) {
            znhVarR.d = new skf(erdVar, function0, function02, function1, function03, function04, c8eVar2, i2);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: oye */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:139:0x065a  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0664  */
    /* JADX WARN: Removed duplicated region for block: B:148:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x005d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void g(final f2e r45, kotlin.jvm.functions.Function1 r46, final defpackage.c8e r47, boolean r48, defpackage.ih5 r49, final int r50, final int r51) throws oye {
        /*
            Method dump skipped, instructions count: 1653
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gyg.g(f2e, kotlin.jvm.functions.Function1, c8e, boolean, ih5, int, int):void");
    }

    public static final void h(Function0 function0, Function0 function02, String str, c8e c8eVar, ih5 ih5Var, int i2) {
        int i3;
        Function0 function03;
        c8e c8eVar2;
        vt9 vt9Var = (vt9) ih5Var;
        vt9Var.Y(1982014100);
        if ((i2 & 6) == 0) {
            i3 = (vt9Var.h(function0) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            function03 = function02;
            i3 |= vt9Var.h(function03) ? 32 : 16;
        } else {
            function03 = function02;
        }
        if ((i2 & 384) == 0) {
            i3 |= vt9Var.f(str) ? NotificationCompat.FLAG_LOCAL_ONLY : NotificationCompat.FLAG_HIGH_PRIORITY;
        }
        if ((i2 & 3072) == 0) {
            c8eVar2 = c8eVar;
            i3 |= vt9Var.f(c8eVar2) ? 2048 : 1024;
        } else {
            c8eVar2 = c8eVar;
        }
        if (vt9Var.N(i3 & 1, (i3 & 1171) != 1170)) {
            c61 c61VarF = a26.F(vt9Var);
            c8e c8eVarX = a26.X(wxe.Q(c8eVar2), 24.0f);
            db5 db5VarA = cb5.a(new x62(16.0f, true, new t40((byte) 19)), rbe.n, vt9Var, 6);
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
            String strQ = uyg.q((shk) ahk.H0.getValue(), vt9Var);
            hp7 hp7Var = abm.a;
            ijl.b(strQ, null, 0L, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, ((wam) vt9Var.j(hp7Var)).f, vt9Var, 0, 0, 131070);
            ijl.b(uyg.q((shk) ahk.I0.getValue(), vt9Var), null, 0L, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, ((wam) vt9Var.j(hp7Var)).k, vt9Var, 0, 0, 131070);
            i39 i39Var = mpj.a;
            int i4 = i3 & 14;
            yi4.i(function0, i39Var, false, (paj) null, (z14) null, (go3) null, (zvf) null, sfe.b, vt9Var, i4 | 805306416, 508);
            boolean zH = ((i3 & 112) == 32) | vt9Var.h(c61VarF) | ((i3 & 896) == 256) | (i4 == 4);
            Object objK = vt9Var.K();
            if (zH || objK == hh5.a) {
                vl4 vl4Var = new vl4(function03, c61VarF, str, function0, (byte) 1);
                vt9Var.g0(vl4Var);
                objK = vl4Var;
            }
            yi4.a((Function0) objK, i39Var, false, (paj) null, (z14) null, (e24) null, (go3) null, (zvf) null, sfe.c, vt9Var, 805306416, 508);
            vt9Var = vt9Var;
            vt9Var.p(true);
        } else {
            vt9Var.Q();
        }
        znh znhVarR = vt9Var.r();
        if (znhVarR != null) {
            znhVarR.d = new wl4(function0, function02, str, c8eVar, i2, (byte) 1);
        }
    }

    public static c8e k() {
        return new zbd(1200, ipe.d, ipe.e);
    }

    public static final int l(int i2, int i3) {
        return i2 << (((i3 % 10) * 3) + 1);
    }

    public static final zm6 m(kz2 kz2Var, int i2) {
        zm6 zm6Var = new zm6(kz2Var, false, i2);
        zm6Var.d.g(zm6.e[0], true);
        zm6Var.d();
        return zm6Var;
    }

    public static final void n(hqj hqjVar, ArrayList arrayList, int i2) {
        boolean zL = hqjVar.l(i2);
        int[] iArr = hqjVar.b;
        if (zL) {
            arrayList.add(hqjVar.n(i2));
            return;
        }
        int i3 = iArr[(i2 * 5) + 3] + i2;
        for (int i4 = i2 + 1; i4 < i3; i4 += iArr[(i4 * 5) + 3]) {
            n(hqjVar, arrayList, i4);
        }
    }

    public static final boolean o(voh vohVar, float f2, float f3) {
        float f4 = vohVar.a;
        if (f2 > vohVar.c || f4 > f2) {
            return false;
        }
        return f3 <= vohVar.d && vohVar.b <= f3;
    }

    /* JADX WARN: Removed duplicated region for block: B:71:0x01af  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static u42 p(orb r21) throws org.json.JSONException {
        /*
            Method dump skipped, instructions count: 472
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gyg.p(orb):u42");
    }

    public static final an2 q(CaptureRequest.Key key) {
        return new an2("camera2.captureRequest.option." + key.getName(), Object.class, key);
    }

    public static final vg9 r(vg9 vg9Var) {
        vg9 vg9VarF = ui6.f0(vg9Var).l.f();
        if (vg9VarF == null || !vg9VarF.n) {
            return null;
        }
        return vg9VarF;
    }

    public static final int s(int i2, ArrayList arrayList) {
        int size = arrayList.size() - 1;
        int i3 = 0;
        while (i3 <= size) {
            int i4 = (i3 + size) >>> 1;
            int iB = Intrinsics.b(((ljb) arrayList.get(i4)).b, i2);
            if (iB < 0) {
                i3 = i4 + 1;
            } else {
                if (iB <= 0) {
                    return i4;
                }
                size = i4 - 1;
            }
        }
        return -(i3 + 1);
    }

    public static final voh t(vg9 vg9Var) {
        wye wyeVar;
        if (vg9Var.n && (wyeVar = vg9Var.h) != null) {
            b2c b2cVarV = rm5.v(wyeVar);
            if (!b2cVarV.f()) {
                b2cVarV = null;
            }
            if (b2cVarV != null) {
                return vg9Var.W0(b2cVarV);
            }
        }
        return voh.e;
    }

    public static BigInteger u(byte[] bArr) {
        return new BigInteger(1, bArr);
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0068, code lost:
    
        return r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0024, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final defpackage.vg9 v(defpackage.vg9 r8) {
        /*
            b8e r0 = r8.a
            boolean r0 = r0.n
            r1 = 0
            if (r0 == 0) goto La6
            if (r0 != 0) goto Le
            java.lang.String r0 = "visitChildren called on an unattached node"
            defpackage.a8b.b(r0)
        Le:
            dfe r0 = new dfe
            r2 = 16
            b8e[] r3 = new defpackage.b8e[r2]
            r0.<init>(r3)
            b8e r8 = r8.a
            b8e r3 = r8.f
            if (r3 != 0) goto L21
            defpackage.ui6.h(r0, r8)
            goto L24
        L21:
            r0.c(r3)
        L24:
            int r8 = r0.c
            if (r8 == 0) goto La6
            int r8 = r8 + (-1)
            java.lang.Object r8 = r0.l(r8)
            b8e r8 = (defpackage.b8e) r8
            int r3 = r8.d
            r3 = r3 & 1024(0x400, float:1.435E-42)
            if (r3 != 0) goto L3a
            defpackage.ui6.h(r0, r8)
            goto L24
        L3a:
            if (r8 == 0) goto L24
            int r3 = r8.c
            r3 = r3 & 1024(0x400, float:1.435E-42)
            if (r3 == 0) goto La3
            r3 = r1
        L43:
            if (r8 == 0) goto L24
            boolean r4 = r8 instanceof defpackage.vg9
            r5 = 1
            if (r4 == 0) goto L69
            vg9 r8 = (defpackage.vg9) r8
            b8e r4 = r8.a
            boolean r4 = r4.n
            if (r4 == 0) goto L9e
            qg9 r4 = r8.Y0()
            int r4 = r4.ordinal()
            if (r4 == 0) goto L68
            if (r4 == r5) goto L68
            r5 = 2
            if (r4 == r5) goto L68
            r8 = 3
            if (r4 == r8) goto L9e
            h9o.p()
            return r1
        L68:
            return r8
        L69:
            int r4 = r8.c
            r4 = r4 & 1024(0x400, float:1.435E-42)
            if (r4 == 0) goto L9e
            boolean r4 = r8 instanceof defpackage.i17
            if (r4 == 0) goto L9e
            r4 = r8
            i17 r4 = (defpackage.i17) r4
            b8e r4 = r4.p
            r6 = 0
        L79:
            if (r4 == 0) goto L9c
            int r7 = r4.c
            r7 = r7 & 1024(0x400, float:1.435E-42)
            if (r7 == 0) goto L99
            int r6 = r6 + 1
            if (r6 != r5) goto L87
            r8 = r4
            goto L99
        L87:
            if (r3 != 0) goto L90
            dfe r3 = new dfe
            b8e[] r7 = new defpackage.b8e[r2]
            r3.<init>(r7)
        L90:
            if (r8 == 0) goto L96
            r3.c(r8)
            r8 = r1
        L96:
            r3.c(r4)
        L99:
            b8e r4 = r4.f
            goto L79
        L9c:
            if (r6 == r5) goto L43
        L9e:
            b8e r8 = defpackage.ui6.U(r3)
            goto L43
        La3:
            b8e r8 = r8.f
            goto L3a
        La6:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gyg.v(vg9):vg9");
    }

    public static final wfd w(n5c n5cVar, int i2, long j2, hxf hxfVar, long j3, sd3 sd3Var, d2c d2cVar, int i3, jde jdeVar) {
        List list;
        fsf fsfVar = fsf.a;
        Object objD = hxfVar.d(i2);
        List list2 = (List) jdeVar.e(i2);
        if (list2 != null) {
            list = list2;
        } else {
            List listA = n5cVar.a(i2);
            int size = listA.size();
            ArrayList arrayList = new ArrayList(size);
            for (int i4 = 0; i4 < size; i4++) {
                arrayList.add(((pfd) listA.get(i4)).N(j2));
            }
            jdeVar.i(i2, arrayList);
            list = arrayList;
        }
        return new wfd(i2, i3, list, j3, objD, sd3Var, d2cVar);
    }

    public static final float y(Layout layout, int i2, Paint paint) {
        float fAbs;
        float width;
        float lineLeft = layout.getLineLeft(i2);
        ThreadLocal threadLocal = pjl.a;
        if (layout.getEllipsisCount(i2) <= 0 || layout.getParagraphDirection(i2) != 1 || lineLeft >= 0.0f) {
            return 0.0f;
        }
        float fMeasureText = paint.measureText("…") + (layout.getPrimaryHorizontal(layout.getEllipsisStart(i2) + layout.getLineStart(i2)) - lineLeft);
        Layout.Alignment paragraphAlignment = layout.getParagraphAlignment(i2);
        if ((paragraphAlignment == null ? -1 : t5b.a[paragraphAlignment.ordinal()]) == 1) {
            fAbs = Math.abs(lineLeft);
            width = (layout.getWidth() - fMeasureText) / 2.0f;
        } else {
            fAbs = Math.abs(lineLeft);
            width = layout.getWidth() - fMeasureText;
        }
        return width + fAbs;
    }

    public static final float z(Layout layout, int i2, Paint paint) {
        float width;
        float width2;
        ThreadLocal threadLocal = pjl.a;
        if (layout.getEllipsisCount(i2) <= 0) {
            return 0.0f;
        }
        if (layout.getParagraphDirection(i2) != -1 || layout.getWidth() >= layout.getLineRight(i2)) {
            return 0.0f;
        }
        float fMeasureText = paint.measureText("…") + (layout.getLineRight(i2) - layout.getPrimaryHorizontal(layout.getEllipsisStart(i2) + layout.getLineStart(i2)));
        Layout.Alignment paragraphAlignment = layout.getParagraphAlignment(i2);
        if ((paragraphAlignment != null ? t5b.a[paragraphAlignment.ordinal()] : -1) == 1) {
            width = layout.getWidth() - layout.getLineRight(i2);
            width2 = (layout.getWidth() - fMeasureText) / 2.0f;
        } else {
            width = layout.getWidth() - layout.getLineRight(i2);
            width2 = layout.getWidth() - fMeasureText;
        }
        return width - width2;
    }

    public abstract InputFilter[] A(InputFilter[] inputFilterArr);

    public abstract int B(View view, ViewGroup.MarginLayoutParams marginLayoutParams);

    public abstract int C();

    public abstract ViewPropertyAnimator D(int i2, View view);

    public abstract boolean F();

    public abstract void S(boolean z);

    public abstract void T(boolean z);

    public abstract TransformationMethod a0(TransformationMethod transformationMethod);

    public abstract boolean i(Object obj, Object obj2);

    public abstract boolean j(Object obj, Object obj2);

    public Object x(Object obj, Object obj2) {
        return null;
    }
}
