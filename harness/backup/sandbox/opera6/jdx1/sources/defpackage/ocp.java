package defpackage;

import android.app.Application;
import android.content.Intent;
import android.os.Build;
import android.view.View;
import android.view.Window;
import androidx.core.app.NotificationCompat;
import java.nio.charset.StandardCharsets;
import java.util.Collection;
import java.util.EnumMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* loaded from: classes.dex */
public class ocp {
    public static yza c = null;
    public static final float d = 200.0f;
    public static ThreadPoolExecutor e;
    public final /* synthetic */ byte b;

    public /* synthetic */ ocp(byte b) {
        this.b = b;
    }

    public static int b(String str, byte[] bArr, int i, int i2) {
        byte[] bytes = str.getBytes(StandardCharsets.UTF_8);
        if (bytes.length - i > i2) {
            throw new ArrayIndexOutOfBoundsException("Not enough space in output buffer to encode UTF-8 string");
        }
        System.arraycopy(bytes, 0, bArr, i, bytes.length);
        return i + bytes.length;
    }

    public static final void c(ih5 ih5Var, c8e c8eVar) {
        m51 m51Var = m51.j;
        vt9 vt9Var = (vt9) ih5Var;
        int iHashCode = Long.hashCode(vt9Var.T);
        c8e c8eVarP = qyn.P(ih5Var, c8eVar);
        oag oagVarL = vt9Var.l();
        bh5.To.getClass();
        vt9 vt9Var2 = (vt9) ih5Var;
        vt9Var2.a0();
        if (vt9Var2.S) {
            vt9Var2.k(m3c.S);
        } else {
            vt9Var2.j0();
        }
        y4h.o(ih5Var, m51Var, ujp.f);
        y4h.o(ih5Var, oagVarL, ujp.e);
        y4h.m(ih5Var);
        y4h.o(ih5Var, c8eVarP, ujp.d);
        y4h.o(ih5Var, Integer.valueOf(iHashCode), ujp.g);
        vt9Var2.p(true);
    }

    public static final uro d(voo vooVar) {
        EnumMap enumMap = uro.e;
        sm smVar = vooVar.b.b;
        smVar.d();
        EnumMap enumMap2 = uro.e;
        uro uroVar = (uro) enumMap2.get(smVar);
        if (uroVar != null) {
            return uroVar;
        }
        uro uroVar2 = new uro();
        enumMap2.put((EnumMap) smVar, (sm) uroVar2);
        return uroVar2;
    }

    public static final void e(bxk bxkVar, lmg lmgVar) {
        qq8 qq8Var = (qq8) bxkVar.b;
        k1n k1nVar = (k1n) qq8Var.c;
        k1n k1nVar2 = (k1n) qq8Var.b;
        boolean zK = wxe.k(lmgVar);
        long j = lmgVar.b;
        if (zK) {
            b82.i(null, k1nVar2.d);
            k1nVar2.e = 0;
            b82.i(null, k1nVar.d);
            k1nVar.e = 0;
            qq8Var.a = 0L;
        }
        if (!wxe.m(lmgVar)) {
            List listB = lmgVar.b();
            int size = listB.size();
            for (int i = 0; i < size; i++) {
                uba ubaVar = (uba) listB.get(i);
                qq8Var.b(ubaVar.a, y8f.e(ubaVar.e, 0L));
            }
            qq8Var.b(j, y8f.e(lmgVar.n, 0L));
        }
        if (wxe.m(lmgVar) && j - qq8Var.a > 40) {
            b82.i(null, k1nVar2.d);
            k1nVar2.e = 0;
            b82.i(null, k1nVar.d);
            k1nVar.e = 0;
            qq8Var.a = 0L;
        }
        qq8Var.a = j;
    }

    public static final void f(dik dikVar, dik dikVar2) {
        for (Map.Entry entry : dikVar2.a()) {
            dikVar.e((String) entry.getKey(), (List) entry.getValue());
        }
    }

    public static final boolean g(String str, String str2) {
        if (Intrinsics.a(str, str2)) {
            return true;
        }
        if (str.length() != 0) {
            int i = 0;
            int i2 = 0;
            int i3 = 0;
            while (true) {
                if (i < str.length()) {
                    char cCharAt = str.charAt(i);
                    int i4 = i3 + 1;
                    if (i3 == 0 && cCharAt != '(') {
                        break;
                    }
                    if (cCharAt == '(') {
                        i2++;
                    } else if (cCharAt == ')' && i2 - 1 == 0 && i3 != str.length() - 1) {
                        break;
                    }
                    i++;
                    i3 = i4;
                } else if (i2 == 0) {
                    return Intrinsics.a(StringsKt.l0(str.substring(1, str.length() - 1)).toString(), str2);
                }
            }
        }
        return false;
    }

    public static final float h(float[] fArr, float[] fArr2) {
        int length = fArr.length;
        float f = 0.0f;
        for (int i = 0; i < length; i++) {
            f += fArr[i] * fArr2[i];
        }
        return f;
    }

    public static final String i(Collection collection) {
        return !collection.isEmpty() ? kik.b(CollectionsKt.P(collection, ",\n", "\n", "\n", 0, (Function1) null, 56)).concat("},") : " }";
    }

    public static final String j(Intent intent) {
        if (Intrinsics.a(intent.getType(), "text/plain")) {
            return intent.getStringExtra("android.intent.extra.TEXT");
        }
        return null;
    }

    public static boolean k() {
        return !Application.getProcessName().contains(":");
    }

    public static final String l(Collection collection) {
        return kik.b(CollectionsKt.P(collection, ",", (CharSequence) null, (String) null, 0, (Function1) null, 62)).concat(kik.b(" }"));
    }

    public static final String m(Collection collection) {
        return kik.b(CollectionsKt.P(collection, ",", (CharSequence) null, (String) null, 0, (Function1) null, 62)).concat(kik.b("},"));
    }

    public static final void n(float[] fArr, float[] fArr2, int i, float[] fArr3) {
        if (i == 0) {
            a8b.a("At least one point must be provided");
        }
        int i2 = 2 >= i ? i - 1 : 2;
        int i3 = i2 + 1;
        float[][] fArr4 = new float[i3][];
        for (int i4 = 0; i4 < i3; i4++) {
            fArr4[i4] = new float[i];
        }
        for (int i5 = 0; i5 < i; i5++) {
            fArr4[0][i5] = 1.0f;
            for (int i6 = 1; i6 < i3; i6++) {
                fArr4[i6][i5] = fArr4[i6 - 1][i5] * fArr[i5];
            }
        }
        float[][] fArr5 = new float[i3][];
        for (int i7 = 0; i7 < i3; i7++) {
            fArr5[i7] = new float[i];
        }
        float[][] fArr6 = new float[i3][];
        for (int i8 = 0; i8 < i3; i8++) {
            fArr6[i8] = new float[i3];
        }
        int i9 = 0;
        while (i9 < i3) {
            float[] fArr7 = fArr5[i9];
            System.arraycopy(fArr4[i9], 0, fArr7, 0, i);
            for (int i10 = 0; i10 < i9; i10++) {
                float[] fArr8 = fArr5[i10];
                float fH = h(fArr7, fArr8);
                for (int i11 = 0; i11 < i; i11++) {
                    fArr7[i11] = fArr7[i11] - (fArr8[i11] * fH);
                }
            }
            float fSqrt = (float) Math.sqrt(h(fArr7, fArr7));
            if (fSqrt < 1.0E-6f) {
                fSqrt = 1.0E-6f;
            }
            float f = 1.0f / fSqrt;
            for (int i12 = 0; i12 < i; i12++) {
                fArr7[i12] = fArr7[i12] * f;
            }
            float[] fArr9 = fArr6[i9];
            int i13 = 0;
            while (i13 < i3) {
                fArr9[i13] = i13 < i9 ? 0.0f : h(fArr7, fArr4[i13]);
                i13++;
            }
            i9++;
        }
        for (int i14 = i2; -1 < i14; i14--) {
            float fH2 = h(fArr5[i14], fArr2);
            float[] fArr10 = fArr6[i14];
            int i15 = i14 + 1;
            if (i15 <= i2) {
                int i16 = i2;
                while (true) {
                    fH2 -= fArr10[i16] * fArr3[i16];
                    if (i16 != i15) {
                        i16--;
                    }
                }
            }
            fArr3[i14] = fH2 / fArr10[i14];
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object o(tna r5, mt5 r6) throws java.lang.Throwable {
        /*
            boolean r0 = r6 instanceof defpackage.zji
            if (r0 == 0) goto L13
            r0 = r6
            zji r0 = (defpackage.zji) r0
            int r1 = r0.v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.v = r1
            goto L18
        L13:
            zji r0 = new zji
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.u
            px5 r1 = px5.a
            int r2 = r0.v
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L30
            if (r2 != r3) goto L2a
            tna r5 = r0.t
            defpackage.ybh.y(r6)
            goto L4c
        L2a:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            qp2.n(r5)
            return r4
        L30:
            defpackage.ybh.y(r6)
            boolean r6 = r5 instanceof aki
            if (r6 == 0) goto L38
            return r5
        L38:
            fr6 r6 = r5.c
            if (r6 != 0) goto L3d
            r6 = r4
        L3d:
            d44 r6 = r6.b()
            r0.t = r5
            r0.v = r3
            java.lang.Object r6 = defpackage.ui6.Z(r6, r0)
            if (r6 != r1) goto L4c
            return r1
        L4c:
            dwj r6 = (dwj) r6
            r0 = -1
            byte[] r6 = w0h.m(r6, r0)
            aki r0 = new aki
            pna r1 = r5.a
            rpa r2 = r5.b
            if (r2 != 0) goto L5c
            r2 = r4
        L5c:
            fr6 r5 = r5.c
            if (r5 == 0) goto L61
            r4 = r5
        L61:
            r0.<init>(r1, r2, r4, r6)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ocp.o(tna, mt5):java.lang.Object");
    }

    public static void p(Window window, boolean z) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 35) {
            c4o.b(window, z);
        } else {
            if (i >= 30) {
                r9n.O(window, z);
                return;
            }
            View decorView = window.getDecorView();
            int systemUiVisibility = decorView.getSystemUiVisibility();
            decorView.setSystemUiVisibility(z ? systemUiVisibility & (-1793) : systemUiVisibility | 1792);
        }
    }

    public static final Object q(jni jniVar, boolean z, Object obj, Function2 function2) {
        Object fd5Var;
        Object objK0;
        try {
            if (function2 == null) {
                fd5Var = hib.c(obj, function2, jniVar);
            } else {
                y9m.t(2, function2);
                fd5Var = function2.invoke(obj, jniVar);
            }
        } catch (ha7 e2) {
            Throwable th = e2.a;
            jniVar.j0(new fd5(th, false));
            throw th;
        } catch (Throwable th2) {
            fd5Var = new fd5(th2, false);
        }
        px5 px5Var = px5.a;
        if (fd5Var == px5Var || (objK0 = jniVar.k0(fd5Var)) == scd.h) {
            return px5Var;
        }
        jniVar.E0();
        if (!(objK0 instanceof fd5)) {
            return scd.p0(objK0);
        }
        if (!z) {
            kql kqlVar = ((fd5) objK0).a;
            if ((kqlVar instanceof kql) && kqlVar.a == jniVar) {
                if (fd5Var instanceof fd5) {
                    throw ((fd5) fd5Var).a;
                }
                return fd5Var;
            }
        }
        throw ((fd5) objK0).a;
    }

    public static ThreadPoolExecutor r() {
        if (e == null) {
            ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 10L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new hg((byte) 4));
            e = threadPoolExecutor;
            threadPoolExecutor.allowCoreThreadTimeOut(true);
        }
        return e;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0034, code lost:
    
        if (r2 < r5) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0036, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0037, code lost:
    
        qp2.o(defpackage.p3p.l(r2 + 4294967296L, "UTF-8 length does not fit in int: "));
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0047, code lost:
    
        return 0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int a(java.lang.String r6) {
        /*
            r5 = this;
            int r5 = r6.length()
            r0 = 0
            r1 = r0
        L6:
            if (r1 >= r5) goto L13
            char r2 = r6.charAt(r1)
            r3 = 128(0x80, float:1.8E-43)
            if (r2 >= r3) goto L13
            int r1 = r1 + 1
            goto L6
        L13:
            r2 = r5
        L14:
            if (r1 >= r5) goto L34
            char r3 = r6.charAt(r1)
            r4 = 2048(0x800, float:2.87E-42)
            if (r3 >= r4) goto L26
            int r3 = 127 - r3
            int r3 = r3 >>> 31
            int r2 = r2 + r3
            int r1 = r1 + 1
            goto L14
        L26:
            int r6 = ads_mobile_sdk.sm3.a(r6, r1)     // Catch: defpackage.dgp -> L2c
            int r2 = r2 + r6
            goto L34
        L2c:
            java.nio.charset.Charset r5 = java.nio.charset.StandardCharsets.UTF_8
            byte[] r5 = r6.getBytes(r5)
            int r5 = r5.length
            return r5
        L34:
            if (r2 < r5) goto L37
            return r2
        L37:
            long r5 = (long) r2
            r1 = 4294967296(0x100000000, double:2.121995791E-314)
            long r5 = r5 + r1
            java.lang.String r1 = "UTF-8 length does not fit in int: "
            java.lang.String r5 = defpackage.p3p.l(r5, r1)
            qp2.o(r5)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ocp.a(java.lang.String):int");
    }

    public final int a(String str, byte[] bArr, int i, int i2) {
        int i3;
        int i4;
        char cCharAt;
        switch (this.b) {
            case 0:
                int length = str.length();
                int i5 = i + i2;
                int i6 = 0;
                while (i6 < length && (i4 = i6 + i) < i5 && (cCharAt = str.charAt(i6)) < 128) {
                    bArr[i4] = (byte) cCharAt;
                    i6++;
                }
                if (i6 == length) {
                    return i + length;
                }
                int i7 = i + i6;
                while (i6 < length) {
                    char cCharAt2 = str.charAt(i6);
                    if (cCharAt2 < 128 && i7 < i5) {
                        bArr[i7] = (byte) cCharAt2;
                        i7++;
                    } else if (cCharAt2 < 2048 && i7 <= i5 - 2) {
                        int i8 = i7 + 1;
                        bArr[i7] = (byte) ((cCharAt2 >>> 6) | 960);
                        i7 += 2;
                        bArr[i8] = (byte) ((cCharAt2 & '?') | NotificationCompat.FLAG_HIGH_PRIORITY);
                    } else {
                        if ((cCharAt2 >= 55296 && 57343 >= cCharAt2) || i7 > i5 - 3) {
                            if (i7 > i5 - 4) {
                                if (55296 > cCharAt2 || cCharAt2 > 57343 || ((i3 = i6 + 1) != str.length() && Character.isSurrogatePair(cCharAt2, str.charAt(i3)))) {
                                    throw new ArrayIndexOutOfBoundsException("Not enough space in output buffer to encode UTF-8 string");
                                }
                                return b(str, bArr, i, i2);
                            }
                            i6++;
                            if (i6 != str.length()) {
                                char cCharAt3 = str.charAt(i6);
                                if (Character.isSurrogatePair(cCharAt2, cCharAt3)) {
                                    int codePoint = Character.toCodePoint(cCharAt2, cCharAt3);
                                    bArr[i7] = (byte) ((codePoint >>> 18) | 240);
                                    bArr[i7 + 1] = (byte) (((codePoint >>> 12) & 63) | NotificationCompat.FLAG_HIGH_PRIORITY);
                                    int i9 = i7 + 3;
                                    bArr[i7 + 2] = (byte) (((codePoint >>> 6) & 63) | NotificationCompat.FLAG_HIGH_PRIORITY);
                                    i7 += 4;
                                    bArr[i9] = (byte) ((codePoint & 63) | NotificationCompat.FLAG_HIGH_PRIORITY);
                                }
                            }
                            return b(str, bArr, i, i2);
                        }
                        bArr[i7] = (byte) ((cCharAt2 >>> '\f') | 480);
                        int i10 = i7 + 2;
                        bArr[i7 + 1] = (byte) (((cCharAt2 >>> 6) & 63) | NotificationCompat.FLAG_HIGH_PRIORITY);
                        i7 += 3;
                        bArr[i10] = (byte) ((cCharAt2 & '?') | NotificationCompat.FLAG_HIGH_PRIORITY);
                    }
                    i6++;
                }
                return i7;
            default:
                return b(str, bArr, i, i2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x004c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String a(byte[] r12, int r13, int r14) throws ads_mobile_sdk.bj1 {
        /*
            Method dump skipped, instructions count: 346
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ocp.a(byte[], int, int):java.lang.String");
    }
}
