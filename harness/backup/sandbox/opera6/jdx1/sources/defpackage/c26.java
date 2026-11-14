package defpackage;

import ads_mobile_sdk.pd;
import android.app.ActivityManager;
import android.app.Application;
import android.app.PendingIntent;
import android.app.UiModeManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Trace;
import android.text.TextUtils;
import android.view.WindowManager;
import androidx.core.app.NotificationCompat;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.Executors;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.h;
import kotlin.jvm.functions.Function2;
import org.chromium.base.ApkInfo;
import org.chromium.ui.modelutil.PropertyModel;

/* loaded from: classes.dex */
public abstract class c26 {
    public static Context b;
    public static Bundle c;
    public static final gd7 m;
    public static final gd7 n;
    public static ComponentName o;
    public static final Object p;
    public static final l5b q;
    public static final int[] r;
    public static final int[] s;
    public static final int[] t;
    public static final gpk u;
    public static final eko v;
    public static final Object a = new Object();
    public static final int[] d = {96000, 88200, 64000, 48000, 44100, 32000, 24000, 22050, 16000, 12000, 11025, 8000, 7350};
    public static final int[] e = {0, 1, 2, 3, 4, 5, 6, 8, -1, -1, -1, 7, 8, -1, 8, -1};
    public static final ue5 f = new ue5(2053105611, new bf5((byte) 9), false);
    public static final ue5 g = new ue5(-763244994, new bf5((byte) 11), false);
    public static final ue5 h = new ue5(-1404980292, new bf5((byte) 12), false);
    public static final ue5 i = new ue5(1305101157, new bf5((byte) 13), false);
    public static final ue5 j = new ue5(-1222196893, new bf5((byte) 14), false);
    public static final ue5 k = new ue5(-533057935, new bf5((byte) 15), false);
    public static final ue5 l = new ue5(592185107, new bf5((byte) 10), false);

    static {
        new ue5(-1866984567, new q92((byte) 20), false);
        new ue5(1366859773, new q92((byte) 21), false);
        new ue5(1941780719, new q92((byte) 22), false);
        new ue5(-265430334, new q92((byte) 23), false);
        new ue5(-1257059451, new q92((byte) 24), false);
        new ue5(1457040206, new q92((byte) 25), false);
        byte b2 = 4;
        m = new gd7("UNDEFINED", b2);
        n = new gd7("REUSABLE_CLAIMED", b2);
        p = new Object();
        q = new l5b((byte) 13);
        r = new int[]{-1, -1, -1, -3};
        s = new int[]{1, 0, 0, 4, -2, -1, 3, -4};
        t = new int[]{-1, -1, -1, -5, 1, 0, -4, 3};
        u = new gpk((byte) 23);
        v = new eko((byte) 14);
    }

    public static boolean A(Uri uri) {
        return uri.isOpaque() && "data".equalsIgnoreCase(uri.getScheme());
    }

    public static void B(int[] iArr, int[] iArr2, int[] iArr3) {
        int[] iArr4 = new int[8];
        qbe.J(iArr, iArr2, iArr4);
        H(iArr4, iArr3);
    }

    public static boolean C(float f2, float f3) {
        return Math.abs(f2 - f3) < 0.001f;
    }

    public static o1 D(bq4 bq4Var, boolean z) throws s1g {
        int i2 = bq4Var.i(5);
        if (i2 == 31) {
            i2 = bq4Var.i(6) + 32;
        }
        int iT = t(bq4Var);
        int i3 = bq4Var.i(4);
        String strI = sko.i(i2, "mp4a.40.");
        if (i2 == 5 || i2 == 29) {
            iT = t(bq4Var);
            int i4 = bq4Var.i(5);
            if (i4 == 31) {
                i4 = bq4Var.i(6) + 32;
            }
            i2 = i4;
            if (i2 == 22) {
                i3 = bq4Var.i(4);
            }
        }
        if (z) {
            if (i2 != 1 && i2 != 2 && i2 != 3 && i2 != 4 && i2 != 6 && i2 != 7 && i2 != 17) {
                switch (i2) {
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                        break;
                    default:
                        throw s1g.h("Unsupported audio object type: " + i2);
                }
            }
            if (bq4Var.h()) {
                w7d.K("Unexpected frameLengthFlag = 1");
            }
            if (bq4Var.h()) {
                bq4Var.t(14);
            }
            boolean zH = bq4Var.h();
            if (i3 == 0) {
                t3p.o();
                return null;
            }
            if (i2 == 6 || i2 == 20) {
                bq4Var.t(3);
            }
            if (zH) {
                if (i2 == 22) {
                    bq4Var.t(16);
                }
                if (i2 == 17 || i2 == 19 || i2 == 20 || i2 == 23) {
                    bq4Var.t(3);
                }
                bq4Var.t(1);
            }
            switch (i2) {
                case 17:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                    int i5 = bq4Var.i(2);
                    if (i5 == 2 || i5 == 3) {
                        throw s1g.h("Unsupported epConfig: " + i5);
                    }
            }
        }
        int i6 = e[i3];
        if (i6 != -1) {
            return new o1(iT, i6, strI);
        }
        throw s1g.d(null, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object F(nt5 r4) {
        /*
            boolean r0 = r4 instanceof s3e
            if (r0 == 0) goto L13
            r0 = r4
            s3e r0 = (s3e) r0
            int r1 = r0.u
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.u = r1
            goto L18
        L13:
            s3e r0 = new s3e
            r0.<init>(r4)
        L18:
            java.lang.Object r4 = r0.t
            px5 r1 = px5.a
            int r2 = r0.u
            r3 = 1
            if (r2 == 0) goto L2e
            if (r2 != r3) goto L27
            defpackage.ybh.y(r4)
            goto L3e
        L27:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            qp2.n(r4)
            r4 = 0
            return r4
        L2e:
            defpackage.ybh.y(r4)
            r0.u = r3
            hp7 r4 = hzh.a
            java.lang.String r4 = "composeResources/com.opera.celopay.model.crypto.generated.resources/files/mnemonic_vocabulary.txt"
            java.lang.Object r4 = fl6.b(r4)
            if (r4 != r1) goto L3e
            return r1
        L3e:
            byte[] r4 = (byte[]) r4
            java.lang.String r4 = kotlin.text.c.i(r4)
            java.lang.String r0 = "\n"
            java.lang.String[] r0 = new java.lang.String[]{r0}
            r1 = 0
            r2 = 6
            java.util.List r4 = kotlin.text.StringsKt.Y(r4, r0, r1, r2)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.c26.F(nt5):java.lang.Object");
    }

    public static Object G(Parcel parcel, Parcelable.Creator creator) {
        if (parcel.readInt() != 0) {
            return creator.createFromParcel(parcel);
        }
        return null;
    }

    public static void H(int[] iArr, int[] iArr2) {
        long j2 = iArr[7] & 4294967295L;
        long j3 = (iArr[6] & 4294967295L) + (j2 << 1);
        long j4 = (iArr[2] & 4294967295L) + j3;
        long j5 = (iArr[5] & 4294967295L) + (j3 << 1);
        long j6 = (iArr[4] & 4294967295L) + (j5 << 1);
        long j7 = (iArr[0] & 4294967295L) + j6;
        iArr2[0] = (int) j7;
        long j8 = (iArr[1] & 4294967295L) + j5 + (j7 >>> 32);
        iArr2[1] = (int) j8;
        long j9 = j4 + (j8 >>> 32);
        iArr2[2] = (int) j9;
        long j10 = (iArr[3] & 4294967295L) + j2 + (j6 << 1) + (j9 >>> 32);
        iArr2[3] = (int) j10;
        I((int) (j10 >>> 32), iArr2);
    }

    public static void I(int i2, int[] iArr) {
        while (i2 != 0) {
            long j2 = i2 & 4294967295L;
            long j3 = (iArr[0] & 4294967295L) + j2;
            iArr[0] = (int) j3;
            long j4 = j3 >> 32;
            if (j4 != 0) {
                long j5 = j4 + (iArr[1] & 4294967295L);
                iArr[1] = (int) j5;
                long j6 = (j5 >> 32) + (iArr[2] & 4294967295L);
                iArr[2] = (int) j6;
                j4 = j6 >> 32;
            }
            long j7 = (iArr[3] & 4294967295L) + (j2 << 1) + j4;
            iArr[3] = (int) j7;
            i2 = (int) (j7 >> 32);
        }
        if ((iArr[3] >>> 1) < 2147483646 || !qbe.B(iArr, r)) {
            return;
        }
        h(iArr);
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0089 A[Catch: all -> 0x00a0, DONT_GENERATE, TryCatch #0 {all -> 0x00a0, blocks: (B:16:0x0049, B:18:0x0057, B:20:0x005d, B:31:0x008c, B:21:0x006a, B:23:0x0078, B:28:0x0083, B:30:0x0089, B:36:0x0096, B:39:0x009f, B:38:0x009c, B:26:0x007e), top: B:49:0x0049, inners: #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void J(mt5 r9, java.lang.Object r10) throws defpackage.ha7 {
        /*
            boolean r0 = r9 instanceof ia7
            if (r0 == 0) goto Lad
            ia7 r9 = (ia7) r9
            dx5 r0 = r9.d
            nt5 r1 = r9.e
            java.lang.Throwable r2 = t0i.d(r10)
            if (r2 != 0) goto L12
            r3 = r10
            goto L18
        L12:
            fd5 r3 = new fd5
            r4 = 0
            r3.<init>(r2, r4)
        L18:
            kotlin.coroutines.CoroutineContext r2 = r1.getContext()
            boolean r2 = M(r0, r2)
            r4 = 1
            if (r2 == 0) goto L2f
            r9.f = r3
            r9.c = r4
            kotlin.coroutines.CoroutineContext r10 = r1.getContext()
            L(r0, r10, r9)
            return
        L2f:
            tc8 r0 = gml.a()
            long r5 = r0.b
            r7 = 4294967296(0x100000000, double:2.121995791E-314)
            int r2 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r2 < 0) goto L46
            r9.f = r3
            r9.c = r4
            r0.b0(r9)
            goto La7
        L46:
            r0.n0(r4)
            kotlin.coroutines.CoroutineContext r2 = r1.getContext()     // Catch: java.lang.Throwable -> La0
            ulp r3 = defpackage.ulp.h     // Catch: java.lang.Throwable -> La0
            kotlin.coroutines.CoroutineContext$Element r2 = r2.get(r3)     // Catch: java.lang.Throwable -> La0
            unb r2 = (unb) r2     // Catch: java.lang.Throwable -> La0
            if (r2 == 0) goto L6a
            boolean r3 = r2.isActive()     // Catch: java.lang.Throwable -> La0
            if (r3 != 0) goto L6a
            java.util.concurrent.CancellationException r10 = r2.p()     // Catch: java.lang.Throwable -> La0
            q0i r1 = new q0i     // Catch: java.lang.Throwable -> La0
            r1.<init>(r10)     // Catch: java.lang.Throwable -> La0
            r9.resumeWith(r1)     // Catch: java.lang.Throwable -> La0
            goto L8c
        L6a:
            java.lang.Object r2 = r9.g     // Catch: java.lang.Throwable -> La0
            kotlin.coroutines.CoroutineContext r3 = r1.getContext()     // Catch: java.lang.Throwable -> La0
            java.lang.Object r2 = eml.b(r3, r2)     // Catch: java.lang.Throwable -> La0
            gd7 r5 = eml.a     // Catch: java.lang.Throwable -> La0
            if (r2 == r5) goto L7d
            ikm r5 = cx5.c(r1, r3, r2)     // Catch: java.lang.Throwable -> La0
            goto L7e
        L7d:
            r5 = 0
        L7e:
            r1.resumeWith(r10)     // Catch: java.lang.Throwable -> L93
            if (r5 == 0) goto L89
            boolean r10 = r5.F0()     // Catch: java.lang.Throwable -> La0
            if (r10 == 0) goto L8c
        L89:
            eml.a(r3, r2)     // Catch: java.lang.Throwable -> La0
        L8c:
            boolean r10 = r0.w0()     // Catch: java.lang.Throwable -> La0
            if (r10 != 0) goto L8c
            goto La4
        L93:
            r10 = move-exception
            if (r5 == 0) goto L9c
            boolean r1 = r5.F0()     // Catch: java.lang.Throwable -> La0
            if (r1 == 0) goto L9f
        L9c:
            eml.a(r3, r2)     // Catch: java.lang.Throwable -> La0
        L9f:
            throw r10     // Catch: java.lang.Throwable -> La0
        La0:
            r10 = move-exception
            r9.h(r10)     // Catch: java.lang.Throwable -> La8
        La4:
            r0.T(r4)
        La7:
            return
        La8:
            r9 = move-exception
            r0.T(r4)
            throw r9
        Lad:
            r9.resumeWith(r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.c26.J(mt5, java.lang.Object):void");
    }

    public static Object K(Function2 function2) {
        return scd.g0(h.a, function2);
    }

    public static final void L(dx5 dx5Var, CoroutineContext coroutineContext, Runnable runnable) throws ha7 {
        try {
            dx5Var.D(coroutineContext, runnable);
        } catch (Throwable th) {
            throw new ha7(th, dx5Var, coroutineContext);
        }
    }

    public static final boolean M(dx5 dx5Var, CoroutineContext coroutineContext) throws ha7 {
        try {
            return dx5Var.I(coroutineContext);
        } catch (Throwable th) {
            throw new ha7(th, dx5Var, coroutineContext);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0038, code lost:
    
        return -1;
     */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0076 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0077 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int N(int r7, java.lang.CharSequence r8) {
        /*
            int r0 = r8.length()
            r1 = -1
            if (r7 < r0) goto L8
            return r1
        L8:
            char r0 = r8.charAt(r7)
            r2 = 92
            r3 = 60
            if (r0 != r3) goto L39
            goto L32
        L13:
            int r0 = r8.length()
            if (r7 >= r0) goto L38
            char r0 = r8.charAt(r7)
            r4 = 10
            if (r0 == r4) goto L38
            if (r0 == r3) goto L38
            r4 = 62
            if (r0 == r4) goto L35
            if (r0 != r2) goto L32
            int r0 = r7 + 1
            boolean r4 = defpackage.lcp.u(r0, r8)
            if (r4 == 0) goto L32
            r7 = r0
        L32:
            int r7 = r7 + 1
            goto L13
        L35:
            int r7 = r7 + 1
            return r7
        L38:
            return r1
        L39:
            r0 = 0
            r3 = r7
        L3b:
            int r4 = r8.length()
            if (r3 >= r4) goto L78
            char r4 = r8.charAt(r3)
            if (r4 == 0) goto L74
            r5 = 32
            if (r4 == r5) goto L74
            if (r4 == r2) goto L68
            r6 = 40
            if (r4 == r6) goto L63
            r5 = 41
            if (r4 == r5) goto L5e
            boolean r4 = java.lang.Character.isISOControl(r4)
            if (r4 == 0) goto L71
            if (r3 == r7) goto L77
            goto L76
        L5e:
            if (r0 == 0) goto L76
            int r0 = r0 + (-1)
            goto L71
        L63:
            int r0 = r0 + 1
            if (r0 <= r5) goto L71
            goto L77
        L68:
            int r4 = r3 + 1
            boolean r5 = defpackage.lcp.u(r4, r8)
            if (r5 == 0) goto L71
            r3 = r4
        L71:
            int r3 = r3 + 1
            goto L3b
        L74:
            if (r3 == r7) goto L77
        L76:
            return r3
        L77:
            return r1
        L78:
            int r7 = r8.length()
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.c26.N(int, java.lang.CharSequence):int");
    }

    public static int O(int i2, CharSequence charSequence) {
        while (i2 < charSequence.length()) {
            switch (charSequence.charAt(i2)) {
                case '[':
                    return -1;
                case pd.N0 /* 92 */:
                    int i3 = i2 + 1;
                    if (!lcp.u(i3, charSequence)) {
                        break;
                    } else {
                        i2 = i3;
                        break;
                    }
                case pd.O0 /* 93 */:
                    return i2;
            }
            i2++;
        }
        return charSequence.length();
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0018  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int P(java.lang.CharSequence r3, int r4, char r5) {
        /*
        L0:
            int r0 = r3.length()
            if (r4 >= r0) goto L28
            char r0 = r3.charAt(r4)
            r1 = 92
            if (r0 != r1) goto L18
            int r1 = r4 + 1
            boolean r2 = defpackage.lcp.u(r1, r3)
            if (r2 == 0) goto L18
            r4 = r1
            goto L25
        L18:
            if (r0 != r5) goto L1b
            return r4
        L1b:
            r1 = 41
            if (r5 != r1) goto L25
            r1 = 40
            if (r0 != r1) goto L25
            r3 = -1
            return r3
        L25:
            int r4 = r4 + 1
            goto L0
        L28:
            int r3 = r3.length()
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.c26.P(java.lang.CharSequence, int, char):int");
    }

    public static void Q(int[] iArr, int[] iArr2) {
        int[] iArr3 = new int[8];
        qbe.Q(iArr, iArr3);
        H(iArr3, iArr2);
    }

    public static void R(int[] iArr, int[] iArr2, int i2) {
        int[] iArr3 = new int[8];
        qbe.Q(iArr, iArr3);
        while (true) {
            H(iArr3, iArr2);
            i2--;
            if (i2 <= 0) {
                return;
            } else {
                qbe.Q(iArr2, iArr3);
            }
        }
    }

    public static void S(int[] iArr, int[] iArr2, int[] iArr3) {
        if (qbe.R(iArr, iArr2, iArr3) != 0) {
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
            iArr3[3] = (int) (((iArr3[3] & 4294967295L) - 2) + j3);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: o2j */
    public static final void T(String str, itb itbVar) throws o2j {
        String string;
        StringBuilder sb = new StringBuilder("in the polymorphic scope of '");
        s15 s15Var = (s15) itbVar;
        sb.append(s15Var.c());
        sb.append('\'');
        String string2 = sb.toString();
        if (str == null) {
            string = am2.m('.', "Class discriminator was missing and no default serializers were registered ", string2);
        } else {
            StringBuilder sbN = z1m.n("Serializer for subclass '", str, "' is not found ", string2, ".\nCheck if class with serial name '");
            z1m.t(sbN, str, "' exists and serializer is registered in a corresponding SerializersModule.\nTo be registered automatically, class '", str, "' has to be '@Serializable', and the base class '");
            sbN.append(s15Var.c());
            sbN.append("' has to be sealed and '@Serializable'.");
            string = sbN.toString();
        }
        throw new o2j(string);
    }

    public static final p0e U(q0e q0eVar) {
        Object next;
        String strE = q0eVar.e();
        String strB = q0eVar.b();
        bel belVarF = q0eVar.f();
        ael aelVar = new ael(new wdl(belVarF.d().c()), new wdl(belVarF.c().c()));
        ftj ftjVar = lon.b;
        String strD = q0eVar.d();
        ftjVar.getClass();
        Iterator it = lon.e.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((lon) next).a.equals(strD)) {
                break;
            }
        }
        lon lonVar = (lon) next;
        if (lonVar == null) {
            lonVar = lon.c;
        }
        return new p0e(strE, strB, aelVar, lonVar);
    }

    public static void V(Parcel parcel, Parcelable parcelable) {
        if (parcelable == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcelable.writeToParcel(parcel, 0);
        }
    }

    public static final void a(c8e c8eVar, paj pajVar, gk4 gk4Var, hk4 hk4Var, ue5 ue5Var, ih5 ih5Var, int i2, int i3) {
        c8e c8eVar2;
        int i4;
        paj pajVar2;
        gk4 gk4Var2;
        vt9 vt9Var;
        c8e c8eVar3;
        paj pajVar3;
        gk4 gk4Var3;
        hk4 hk4Var2;
        paj pajVarB;
        gk4 gk4VarZ;
        int i5;
        c8e c8eVar4;
        paj pajVar4;
        hk4 hk4Var3;
        int i6;
        vt9 vt9Var2 = (vt9) ih5Var;
        vt9Var2.Y(1359693790);
        int i7 = i3 & 1;
        if (i7 != 0) {
            i4 = i2 | 6;
            c8eVar2 = c8eVar;
        } else if ((i2 & 6) == 0) {
            c8eVar2 = c8eVar;
            i4 = (vt9Var2.f(c8eVar2) ? 4 : 2) | i2;
        } else {
            c8eVar2 = c8eVar;
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            if ((i3 & 2) == 0) {
                pajVar2 = pajVar;
                int i8 = vt9Var2.f(pajVar2) ? 32 : 16;
                i4 |= i8;
            } else {
                pajVar2 = pajVar;
            }
            i4 |= i8;
        } else {
            pajVar2 = pajVar;
        }
        if ((i2 & 384) == 0) {
            if ((i3 & 4) == 0) {
                gk4Var2 = gk4Var;
                if (vt9Var2.f(gk4Var2)) {
                    i6 = NotificationCompat.FLAG_LOCAL_ONLY;
                }
                i4 |= i6;
            } else {
                gk4Var2 = gk4Var;
            }
            i6 = NotificationCompat.FLAG_HIGH_PRIORITY;
            i4 |= i6;
        } else {
            gk4Var2 = gk4Var;
        }
        if ((i2 & 3072) == 0) {
            i4 |= 1024;
        }
        int i9 = i4 | 24576;
        if ((196608 & i2) == 0) {
            i9 |= vt9Var2.h(ue5Var) ? 131072 : 65536;
        }
        byte b2 = 0;
        if (vt9Var2.N(i9 & 1, (74899 & i9) != 74898)) {
            vt9Var2.S();
            if ((i2 & 1) == 0 || vt9Var2.x()) {
                c8e c8eVar5 = i7 != 0 ? z7e.b : c8eVar2;
                if ((i3 & 2) != 0) {
                    pajVarB = ccj.b(p39.b, vt9Var2);
                    i9 &= -113;
                } else {
                    pajVarB = pajVar2;
                }
                if ((i3 & 4) != 0) {
                    gk4VarZ = i41.z((sa5) vt9Var2.j(ua5.a));
                    i9 &= -897;
                } else {
                    gk4VarZ = gk4Var2;
                }
                i5 = i9 & (-7169);
                c8eVar4 = c8eVar5;
                pajVar4 = pajVarB;
                hk4Var3 = new hk4(p39.f, p39.e);
            } else {
                vt9Var2.Q();
                if ((i3 & 2) != 0) {
                    i9 &= -113;
                }
                if ((i3 & 4) != 0) {
                    i9 &= -897;
                }
                i5 = i9 & (-7169);
                hk4Var3 = hk4Var;
                pajVar4 = pajVar2;
                gk4VarZ = gk4Var2;
                c8eVar4 = c8eVar2;
            }
            vt9Var2.q();
            long j2 = gk4VarZ.a;
            long j3 = gk4VarZ.b;
            hk4Var3.getClass();
            vt9Var2.W(-1763481333);
            vt9Var2.W(167751211);
            Object objK = vt9Var2.K();
            if (objK == hh5.a) {
                objK = hyg.k(new gh7(0.0f));
                vt9Var2.g0(objK);
            }
            vt9Var2.p(false);
            vt9Var2.p(false);
            vt9Var = vt9Var2;
            utk.a(c8eVar4, pajVar4, j2, j3, 0.0f, ((gh7) ((afe) objK).getValue()).a, gyg.P(-97109725, new jk4(ue5Var, b2), vt9Var2), vt9Var, (i5 & 14) | 12582912 | (i5 & 112) | ((i5 << 6) & 3670016), 16);
            gk4Var3 = gk4VarZ;
            pajVar3 = pajVar4;
            hk4Var2 = hk4Var3;
            c8eVar3 = c8eVar4;
        } else {
            vt9Var = vt9Var2;
            vt9Var.Q();
            c8eVar3 = c8eVar2;
            pajVar3 = pajVar2;
            gk4Var3 = gk4Var2;
            hk4Var2 = hk4Var;
        }
        znh znhVarR = vt9Var.r();
        if (znhVarR != null) {
            znhVarR.d = new ik4(c8eVar3, pajVar3, gk4Var3, hk4Var2, ue5Var, i2, i3);
        }
    }

    public static float b(float f2) {
        return f2 <= 0.04045f ? f2 / 12.92f : (float) Math.pow((f2 + 0.055f) / 1.055f, 2.4000000953674316d);
    }

    public static final long c(int i2) {
        long j2 = i2 << 32;
        int i3 = jub.O;
        return j2;
    }

    public static float d(float f2) {
        return f2 <= 0.0031308f ? f2 * 12.92f : (float) ((Math.pow(f2, 0.4166666567325592d) * 1.0549999475479126d) - 0.054999999701976776d);
    }

    /* JADX WARN: Removed duplicated region for block: B:170:0x02e7  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x02ea  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0333  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0348  */
    /* JADX WARN: Removed duplicated region for block: B:180:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0101  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void e(java.lang.String r24, defpackage.c8e r25, java.lang.String r26, kotlin.jvm.functions.Function0 r27, boolean r28, tc2 r29, tc2 r30, int r31, int r32, defpackage.rhc r33, defpackage.ih5 r34, int r35, int r36) {
        /*
            Method dump skipped, instructions count: 852
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.c26.e(java.lang.String, c8e, java.lang.String, kotlin.jvm.functions.Function0, boolean, tc2, tc2, int, int, rhc, ih5, int, int):void");
    }

    public static void f(Context context) {
        Context applicationContext = context.getApplicationContext();
        zch.d(applicationContext, "Application Context cannot be null");
        l5b l5bVar = q;
        if (l5bVar.b) {
            return;
        }
        l5bVar.b = true;
        w5p w5pVarB = w5p.b();
        w5pVarB.c = new ouo(new Handler(), applicationContext, new cpj((byte) 11), w5pVarB);
        boolean z = applicationContext instanceof Application;
        if (z) {
            ((Application) applicationContext).registerActivityLifecycleCallbacks(ono.f);
        }
        ynh.b = (UiModeManager) applicationContext.getSystemService("uimode");
        WindowManager windowManager = yqo.a;
        yqo.c = applicationContext.getResources().getDisplayMetrics().density;
        yqo.a = (WindowManager) applicationContext.getSystemService("window");
        applicationContext.registerReceiver(new anf((byte) 4), new IntentFilter("android.media.action.HDMI_AUDIO_PLUG"));
        q1p.b.a = applicationContext.getApplicationContext();
        vio vioVar = vio.f;
        puo puoVar = vioVar.d;
        if (!vioVar.c) {
            puoVar.getClass();
            if (z) {
                ((Application) applicationContext).registerActivityLifecycleCallbacks(puoVar);
            }
            puoVar.e = vioVar;
            puoVar.b = true;
            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
            ActivityManager.getMyMemoryState(runningAppProcessInfo);
            puoVar.c = runningAppProcessInfo.importance == 100;
            vioVar.e = puoVar.c;
            vioVar.c = true;
        }
        s8p.d.a = new WeakReference(applicationContext);
        IntentFilter intentFilter = new IntentFilter("android.intent.action.SCREEN_OFF");
        intentFilter.addAction("android.intent.action.SCREEN_ON");
        applicationContext.registerReceiver(new anf((byte) 7), intentFilter);
        Executors.newSingleThreadExecutor().execute(new c9d(applicationContext, (byte) 2));
    }

    public static void g(int[] iArr, int[] iArr2, int[] iArr3) {
        long j2 = (iArr[0] & 4294967295L) + (iArr2[0] & 4294967295L);
        iArr3[0] = (int) j2;
        long j3 = (iArr[1] & 4294967295L) + (iArr2[1] & 4294967295L) + (j2 >>> 32);
        iArr3[1] = (int) j3;
        long j4 = (iArr[2] & 4294967295L) + (iArr2[2] & 4294967295L) + (j3 >>> 32);
        iArr3[2] = (int) j4;
        long j5 = (iArr[3] & 4294967295L) + (iArr2[3] & 4294967295L) + (j4 >>> 32);
        int i2 = (int) j5;
        iArr3[3] = i2;
        if (((int) (j5 >>> 32)) != 0 || ((i2 >>> 1) >= 2147483646 && qbe.B(iArr3, r))) {
            h(iArr3);
        }
    }

    public static void h(int[] iArr) {
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
        iArr[3] = (int) ((iArr[3] & 4294967295L) + 2 + j3);
    }

    public static final af2 i(boolean z) {
        af2 af2Var = new af2();
        af2Var.a = z ? 1 : 0;
        return af2Var;
    }

    public static final bf2 j(int i2) {
        bf2 bf2Var = new bf2();
        bf2Var.a = i2;
        return bf2Var;
    }

    public static final ef2 k(Object obj) {
        ef2 ef2Var = new ef2();
        ef2Var.a = obj;
        return ef2Var;
    }

    public static int l(int i2, byte[] bArr) {
        return (bArr[i2] & 255) | ((bArr[i2 + 1] & 255) << 8) | ((bArr[i2 + 2] & 255) << 16) | (bArr[i2 + 3] << 24);
    }

    public static final void m(xbe xbeVar, sh4 sh4Var, dz3 dz3Var, float f2, jaj jajVar, bgl bglVar, nk7 nk7Var) {
        ArrayList arrayList = xbeVar.h;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            tzf tzfVar = (tzf) arrayList.get(i2);
            tzfVar.a.f(sh4Var, dz3Var, f2, jajVar, bglVar, nk7Var);
            sh4Var.e(0.0f, tzfVar.a.f);
        }
    }

    public static String n(int i2) throws z1a {
        try {
            qbb qbbVar = rbb.Companion;
            qhk qhkVar = new qhk(i2);
            qbbVar.getClass();
            return qbb.b(qhkVar, 6);
        } catch (Exception e2) {
            throw new z1a(p3p.j(i2, "Failed to encode integer ", " into 6 bits: ", e2.getMessage()), e2);
        }
    }

    public static int o(float f2, int i2, int i3) {
        if (i2 == i3) {
            return i2;
        }
        float f3 = ((i2 >> 24) & 255) / 255.0f;
        float f4 = ((i3 >> 24) & 255) / 255.0f;
        float fB = b(((i2 >> 16) & 255) / 255.0f);
        float fB2 = b(((i2 >> 8) & 255) / 255.0f);
        float fB3 = b((i2 & 255) / 255.0f);
        float fB4 = b(((i3 >> 16) & 255) / 255.0f);
        float fB5 = b(((i3 >> 8) & 255) / 255.0f);
        float fB6 = b((i3 & 255) / 255.0f);
        return (Math.round(v0g.g(f4, f3, f2, f3) * 255.0f) << 24) | (Math.round(d(v0g.g(fB4, fB, f2, fB)) * 255.0f) << 16) | (Math.round(d(v0g.g(fB5, fB2, f2, fB2)) * 255.0f) << 8) | Math.round(d(v0g.g(fB6, fB3, f2, fB3)) * 255.0f);
    }

    public static PendingIntent p() {
        ComponentName componentName;
        Intent intent = new Intent();
        Context context = t8.a;
        String packageName = context.getPackageName();
        synchronized (p) {
            componentName = o;
            if (componentName == null) {
                componentName = new ComponentName(packageName, "FakeClass");
                o = componentName;
            }
        }
        intent.setComponent(componentName);
        return PendingIntent.getActivity(context, 0, intent, 67108864);
    }

    public static String q() {
        int iC = sle.c();
        return iC != 2 ? iC != 3 ? iC != 4 ? iC != 5 ? iC != 8 ? "unknown" : "5g" : "4g" : "3g" : "2g" : "wifi";
    }

    public static Bundle r(Context context) {
        Bundle bundle;
        ServiceInfo serviceInfo;
        Bundle bundle2;
        Context applicationContext = context.getApplicationContext();
        synchronized (a) {
            if (applicationContext != b) {
                lni.h("CronetManifest#getMetaData fetching info");
                try {
                    try {
                        serviceInfo = applicationContext.getPackageManager().getServiceInfo(new ComponentName(applicationContext, "android.net.http.MetaDataHolder"), 787072);
                    } finally {
                    }
                } catch (PackageManager.NameNotFoundException | NullPointerException unused) {
                    serviceInfo = null;
                }
                if (serviceInfo == null || (bundle2 = serviceInfo.metaData) == null) {
                    bundle2 = new Bundle();
                }
                c = bundle2;
                b = applicationContext;
                Trace.endSection();
            }
            bundle = c;
        }
        return bundle;
    }

    public static int s(boolean z) {
        if (z) {
            return Build.VERSION.SDK_INT >= 31 ? 33554432 : 0;
        }
        return 67108864;
    }

    public static int t(bq4 bq4Var) throws s1g {
        int i2 = bq4Var.i(4);
        if (i2 == 15) {
            if (bq4Var.b() >= 24) {
                return bq4Var.i(24);
            }
            throw s1g.d("AAC header insufficient data", null);
        }
        if (i2 < 13) {
            return d[i2];
        }
        throw s1g.d("AAC header wrong Sampling Frequency Index", null);
    }

    public static String u(String str, String[] strArr) {
        if (strArr == null) {
            return null;
        }
        String strK = sko.k("--", str, "=");
        for (String str2 : strArr) {
            if (str2 != null && str2.startsWith(strK)) {
                return str2.substring(strK.length());
            }
        }
        return null;
    }

    public static IllegalArgumentException v(String str, Exception exc) {
        return (IllegalArgumentException) new IllegalArgumentException(str).initCause(exc);
    }

    public static IllegalStateException w(String str, IOException iOException) {
        return (IllegalStateException) new IllegalStateException(str).initCause(iOException);
    }

    public static boolean x(Intent intent) {
        boolean zIsEmpty = TextUtils.isEmpty(intent.getPackage());
        String str = ApkInfo.a().b.b;
        boolean z = !zIsEmpty && str.equals(intent.getPackage());
        ComponentName component = intent.getComponent();
        if (component == null || !str.equals(component.getPackageName())) {
            if (!z) {
                return false;
            }
        } else if (!zIsEmpty) {
            return z;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void y(lk7 lk7Var) {
        if (((b8e) lk7Var).a.n) {
            ui6.c0(lk7Var, 1).h1();
        }
    }

    public static IOException z(String str, Exception exc) {
        return (IOException) new IOException(str).initCause(exc);
    }

    public abstract void E(int i2, int i3, PropertyModel propertyModel, boolean z);
}
