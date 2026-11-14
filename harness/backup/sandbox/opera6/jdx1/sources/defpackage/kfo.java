package defpackage;

import android.appwidget.AppWidgetManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.nfc.FormatException;
import android.nfc.NdefMessage;
import android.nfc.NdefRecord;
import android.os.BadParcelableException;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.widget.RemoteViews;
import androidx.core.app.NotificationCompat;
import com.opera.android.BrowserActivity;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.d;
import kotlin.coroutines.h;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public abstract class kfo {
    public static final Object a = new Object();
    public static final u5h b;
    public static final u5h c;
    public static final u5h d;
    public static final w5h e;
    public static final u5h f;
    public static final u5h[] g;
    public static final String[] h;
    public static final rga i;
    public static final eko j;

    static {
        u5h u5hVar = new u5h();
        b = u5hVar;
        u5h u5hVar2 = new u5h();
        c = u5hVar2;
        u5h u5hVar3 = new u5h();
        d = u5hVar3;
        u5h w5hVar = new w5h();
        e = w5hVar;
        u5h u5hVar4 = new u5h();
        f = u5hVar4;
        g = new u5h[]{u5hVar, u5hVar2, u5hVar3, w5hVar, u5hVar4};
        h = new String[]{"", "http://www.", "https://www.", "http://", "https://", "tel:", "mailto:", "ftp://anonymous:anonymous@", "ftp://ftp.", "ftps://", "sftp://", "smb://", "nfs://", "ftp://", "dav://", "news:", "telnet://", "imap:", "rtsp://", "urn:", "pop:", "sip:", "sips:", "tftp:", "btspp://", "btl2cap://", "btgoep://", "tcpobex://", "irdaobex://", "file://", "urn:epc:id:", "urn:epc:tag:", "urn:epc:pat:", "urn:epc:raw:", "urn:epc:", "urn:nfc:"};
        i = new rga((byte) 2);
        j = new eko((byte) 4);
    }

    public static void A(File file) {
        file.getClass();
        File parentFile = file.getCanonicalFile().getParentFile();
        if (parentFile != null) {
            parentFile.mkdirs();
            if (parentFile.isDirectory()) {
                return;
            }
            n57.d(file, "Unable to create parent directories of ");
        }
    }

    public static NdefRecord B(byte[] bArr, String str, boolean z) {
        byte b2;
        Charset charset = StandardCharsets.UTF_8;
        String string = Uri.parse(new String(bArr, charset)).normalizeScheme().toString();
        if (string.length() == 0) {
            qp2.o("uri is empty");
            return null;
        }
        byte[] bytes = str == null ? null : str.getBytes(charset);
        if (z) {
            return new NdefRecord((short) 3, string.getBytes(charset), bytes, null);
        }
        int i2 = 1;
        while (true) {
            if (i2 >= 36) {
                b2 = 0;
                break;
            }
            String[] strArr = h;
            if (string.startsWith(strArr[i2])) {
                b2 = (byte) i2;
                string = string.substring(strArr[i2].length());
                break;
            }
            i2++;
        }
        byte[] bytes2 = string.getBytes(StandardCharsets.UTF_8);
        byte[] bArr2 = new byte[bytes2.length + 1];
        bArr2[0] = b2;
        System.arraycopy(bytes2, 0, bArr2, 1, bytes2.length);
        return new NdefRecord((short) 1, NdefRecord.RTD_URI, bytes, bArr2);
    }

    public static tke D(boolean z, Uri uri) {
        if (uri == null) {
            return null;
        }
        tke tkeVar = new tke(0);
        tkeVar.b = 0;
        if (z) {
            tkeVar.c = "absolute-url";
        } else {
            tkeVar.c = "url";
        }
        tkeVar.h = uri.toString().getBytes(StandardCharsets.UTF_8);
        return tkeVar;
    }

    public static boolean E(byte[] bArr, byte[] bArr2) {
        if (bArr.length < 0 || bArr2.length < 0) {
            t3p.t();
            return false;
        }
        if (bArr.length < 3 || bArr2.length < 3) {
            t3p.t();
            return false;
        }
        for (int i2 = 0; i2 < 3; i2++) {
            if (bArr[i2] != bArr2[i2]) {
                return false;
            }
        }
        return true;
    }

    public static void F(gsb gsbVar, eqb eqbVar, zqb zqbVar) {
        int i2;
        String message;
        if (gsbVar == null) {
            return;
        }
        orb orbVarP = vep.p("jsonrpc", "2.0");
        orbVarP.p(gsbVar.a, "id");
        orb orbVar = new orb();
        eqbVar.getClass();
        boolean z = eqbVar instanceof cqb;
        if (z) {
            i2 = ((cqb) eqbVar).a;
        } else {
            if (!(eqbVar instanceof dqb)) {
                h9o.p();
                return;
            }
            i2 = 999;
        }
        orbVar.n(i2, "code");
        if (z) {
            message = ((cqb) eqbVar).b;
        } else if (!(eqbVar instanceof dqb)) {
            h9o.p();
            return;
        } else {
            message = ((dqb) eqbVar).a.getMessage();
            if (message == null) {
                message = "";
            }
        }
        orbVar.p(message, "message");
        orbVarP.p(orbVar, "error");
        zqbVar.z(orbVarP);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x003c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.util.List G(defpackage.x5i r9, int r10, int r11) {
        /*
            java.util.LinkedHashMap r9 = r9.a
            if (r10 != r11) goto L7
            l08 r9 = l08.a
            return r9
        L7:
            r0 = 0
            r1 = 1
            if (r11 <= r10) goto Ld
            r2 = r1
            goto Le
        Ld:
            r2 = r0
        Le:
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
        L13:
            r4 = 0
            if (r2 == 0) goto L2e
            if (r10 >= r11) goto L84
            java.lang.Integer r5 = java.lang.Integer.valueOf(r10)
            java.lang.Object r5 = r9.get(r5)
            java.util.TreeMap r5 = (java.util.TreeMap) r5
            if (r5 == 0) goto L3c
            java.util.NavigableSet r6 = r5.descendingKeySet()
            kotlin.Pair r7 = new kotlin.Pair
            r7.<init>(r5, r6)
            goto L47
        L2e:
            if (r10 <= r11) goto L84
            java.lang.Integer r5 = java.lang.Integer.valueOf(r10)
            java.lang.Object r5 = r9.get(r5)
            java.util.TreeMap r5 = (java.util.TreeMap) r5
            if (r5 != 0) goto L3e
        L3c:
            r7 = r4
            goto L47
        L3e:
            java.util.Set r6 = r5.keySet()
            kotlin.Pair r7 = new kotlin.Pair
            r7.<init>(r5, r6)
        L47:
            if (r7 == 0) goto L83
            java.lang.Object r5 = r7.a
            java.util.Map r5 = (java.util.Map) r5
            java.lang.Object r6 = r7.b
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            java.util.Iterator r6 = r6.iterator()
        L55:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L80
            java.lang.Object r7 = r6.next()
            java.lang.Number r7 = (java.lang.Number) r7
            int r7 = r7.intValue()
            if (r2 == 0) goto L6e
            int r8 = r10 + 1
            if (r8 > r7) goto L55
            if (r7 > r11) goto L55
            goto L72
        L6e:
            if (r11 > r7) goto L55
            if (r7 >= r10) goto L55
        L72:
            java.lang.Integer r10 = java.lang.Integer.valueOf(r7)
            java.lang.Object r10 = r5.get(r10)
            r3.add(r10)
            r5 = r1
            r10 = r7
            goto L81
        L80:
            r5 = r0
        L81:
            if (r5 != 0) goto L13
        L83:
            return r4
        L84:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kfo.G(x5i, int, int):java.util.List");
    }

    public static final CoroutineContext H(y5i y5iVar, boolean z, mt5 mt5Var) {
        CoroutineContext coroutineContextPlus;
        k0m k0mVar = (k0m) mt5Var.getContext().get(k0m.b);
        d dVar = k0mVar != null ? k0mVar.a : null;
        if (!y5iVar.n()) {
            a64 a64Var = y5iVar.a;
            CoroutineContext coroutineContext = (a64Var != null ? a64Var : null).b;
            if (dVar == null) {
                dVar = h.a;
            }
            coroutineContextPlus = coroutineContext.plus(dVar);
        } else if (dVar != null) {
            a64 a64Var2 = y5iVar.a;
            coroutineContextPlus = (a64Var2 != null ? a64Var2 : null).b.plus(dVar);
        } else if (z) {
            coroutineContextPlus = y5iVar.b;
            if (coroutineContextPlus == null) {
                return null;
            }
        } else {
            a64 a64Var3 = y5iVar.a;
            coroutineContextPlus = (a64Var3 != null ? a64Var3 : null).b;
        }
        return coroutineContextPlus;
    }

    public static Integer I(Context context, Class cls) {
        if (sfe.k0(context.getApplicationContext())) {
            return null;
        }
        return Integer.valueOf(AppWidgetManager.getInstance(context).getAppWidgetIds(new ComponentName(context, (Class<?>) cls)).length);
    }

    public static Intent J(fp1 fp1Var) {
        Intent parentActivityIntent = fp1Var.getParentActivityIntent();
        if (parentActivityIntent != null) {
            return parentActivityIntent;
        }
        try {
            String strL = L(fp1Var, fp1Var.getComponentName());
            if (strL != null) {
                ComponentName componentName = new ComponentName(fp1Var, strL);
                try {
                    return L(fp1Var, componentName) == null ? Intent.makeMainActivity(componentName) : new Intent().setComponent(componentName);
                } catch (PackageManager.NameNotFoundException unused) {
                }
            }
            return null;
        } catch (PackageManager.NameNotFoundException e2) {
            t3p.n(e2);
            return null;
        }
    }

    public static Intent K(Context context, ComponentName componentName) {
        String strL = L(context, componentName);
        if (strL == null) {
            return null;
        }
        ComponentName componentName2 = new ComponentName(componentName.getPackageName(), strL);
        return L(context, componentName2) == null ? Intent.makeMainActivity(componentName2) : new Intent().setComponent(componentName2);
    }

    public static String L(Context context, ComponentName componentName) {
        String string;
        ActivityInfo activityInfo = context.getPackageManager().getActivityInfo(componentName, 269222528);
        String str = activityInfo.parentActivityName;
        if (str != null) {
            return str;
        }
        Bundle bundle = activityInfo.metaData;
        if (bundle == null || (string = bundle.getString("android.support.PARENT_ACTIVITY")) == null) {
            return null;
        }
        if (string.charAt(0) != '.') {
            return string;
        }
        return context.getPackageName() + string;
    }

    public static int M(int i2, int i3, boolean z) {
        return z ? ((i3 - i2) + 360) % 360 : (i3 + i2) % 360;
    }

    public static String N(int i2, int i3) {
        return p3p.i(i3, i2 != 64 ? i2 != 128 ? i2 != 192 ? "[UNIVERSAL " : "[PRIVATE " : "[CONTEXT " : "[APPLICATION ", "]");
    }

    public static gsb O(orb orbVar) {
        if (orbVar.a.has("id")) {
            return new gsb(orbVar.a("id"));
        }
        return null;
    }

    public static Intent R(Context context, String str) {
        Intent intent = new Intent(str);
        intent.setFlags(268435456);
        intent.setClass(context, BrowserActivity.class);
        return intent;
    }

    public static final boolean S(f0j f0jVar) {
        p0j p0jVar = n0j.s;
        see seeVar = f0jVar.a;
        Object objG = seeVar.g(p0jVar);
        if (objG == null) {
            objG = null;
        }
        if (Intrinsics.a(objG, ulp.c)) {
            return false;
        }
        return seeVar.b(e0j.g) || seeVar.b(e0j.h);
    }

    public static final boolean T(ng6 ng6Var, int i2, int i3) {
        if (i2 <= i3 || !ng6Var.k) {
            return ng6Var.j && !ng6Var.l.contains(Integer.valueOf(i2));
        }
        return false;
    }

    public static boolean U(String str) {
        if (StandardCharsets.US_ASCII.newEncoder().canEncode(str) && str.length() >= 2 && str.length() <= 256 && str.charAt(0) == ':') {
            return Character.isLowerCase(str.charAt(1)) || Character.isDigit(str.charAt(1));
        }
        return false;
    }

    public static void V(lnk lnkVar, int i2, op5 op5Var) {
        long eventTime = lnkVar.getEventTime(i2);
        List cues = lnkVar.getCues(eventTime);
        if (cues.isEmpty()) {
            return;
        }
        if (i2 == lnkVar.getEventTimeCount() - 1) {
            h9o.e();
            return;
        }
        long eventTime2 = lnkVar.getEventTime(i2 + 1) - lnkVar.getEventTime(i2);
        if (eventTime2 > 0) {
            op5Var.accept(new a46(cues, eventTime, eventTime2));
        }
    }

    public static vpb W(orb orbVar) {
        return orbVar.b("params");
    }

    public static String X(tj3 tj3Var) {
        if (tj3Var instanceof ak3) {
            return ((ak3) tj3Var).a.getPath();
        }
        if (tj3Var instanceof zj3) {
            return sko.j("assets:abp_files/", ((zj3) tj3Var).a);
        }
        h9o.p();
        return null;
    }

    public static final Object Y(y5i y5iVar, boolean z, boolean z2, Function1 function1) {
        y5iVar.a();
        y5iVar.b();
        h hVar = (CoroutineContext) y5iVar.i.get();
        if (hVar == null) {
            hVar = h.a;
        }
        return bwg.B(new p76((CoroutineContext) hVar, y5iVar, z2, z, function1, (mt5) null));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object Z(com.opera.android.live_score.data.db.LiveScoreDatabase_Impl r8, kotlin.jvm.functions.Function1 r9, nt5 r10) {
        /*
            boolean r0 = r10 instanceof defpackage.q76
            if (r0 == 0) goto L13
            r0 = r10
            q76 r0 = (defpackage.q76) r0
            int r1 = r0.w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.w = r1
            goto L18
        L13:
            q76 r0 = new q76
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.v
            px5 r1 = px5.a
            int r2 = r0.w
            r3 = 4
            r4 = 3
            r5 = 2
            r6 = 1
            r7 = 0
            if (r2 == 0) goto L42
            if (r2 == r6) goto L3e
            if (r2 == r5) goto L3e
            if (r2 == r4) goto L33
            if (r2 == r3) goto L3e
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            qp2.n(r8)
            return r7
        L33:
            kotlin.jvm.functions.Function1 r8 = r0.u
            r9 = r8
            kotlin.jvm.functions.Function1 r9 = (kotlin.jvm.functions.Function1) r9
            com.opera.android.live_score.data.db.LiveScoreDatabase_Impl r8 = r0.t
            defpackage.ybh.y(r10)
            goto L8a
        L3e:
            defpackage.ybh.y(r10)
            return r10
        L42:
            defpackage.ybh.y(r10)
            boolean r10 = r8.n()
            if (r10 == 0) goto L5a
            u11 r10 = new u11
            r2 = 5
            r10.<init>(r8, r9, r7, r2)
            r0.w = r6
            java.lang.Object r8 = defpackage.z5i.E0(r8, r10, r0)
            if (r8 == r1) goto L9d
            return r8
        L5a:
            boolean r10 = r8.n()
            if (r10 == 0) goto L7b
            boolean r10 = r8.r()
            if (r10 == 0) goto L7b
            boolean r10 = r8.o()
            if (r10 == 0) goto L7b
            s76 r10 = new s76
            r10.<init>(r8, r7, r9, r6)
            r0.w = r5
            r9 = 0
            java.lang.Object r8 = r8.w(r9, r10, r0)
            if (r8 == r1) goto L9d
            return r8
        L7b:
            r0.t = r8
            r10 = r9
            kotlin.jvm.functions.Function1 r10 = (kotlin.jvm.functions.Function1) r10
            r0.u = r10
            r0.w = r4
            kotlin.coroutines.CoroutineContext r10 = H(r8, r6, r0)
            if (r10 == r1) goto L9d
        L8a:
            kotlin.coroutines.CoroutineContext r10 = (kotlin.coroutines.CoroutineContext) r10
            r3 r2 = new r3
            r2.<init>(r7, r8, r9)
            r0.t = r7
            r0.u = r7
            r0.w = r3
            java.lang.Object r8 = defpackage.na2.Z(r10, r2, r0)
            if (r8 != r1) goto L9e
        L9d:
            return r1
        L9e:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kfo.Z(com.opera.android.live_score.data.db.LiveScoreDatabase_Impl, kotlin.jvm.functions.Function1, nt5):java.lang.Object");
    }

    public static final void a(xvf xvfVar, g1b g1bVar, Function1 function1, ih5 ih5Var, int i2) {
        vt9 vt9Var;
        vt9 vt9Var2 = (vt9) ih5Var;
        vt9Var2.Y(-2055858162);
        int i3 = i2 | (vt9Var2.f(xvfVar) ? 4 : 2) | (vt9Var2.f(g1bVar) ? 32 : 16) | (vt9Var2.h(function1) ? 256 : NotificationCompat.FLAG_HIGH_PRIORITY);
        if (vt9Var2.N(i3 & 1, (i3 & 147) != 146)) {
            c8e c8eVarY = a26.Y(oup.s0(a26.W(mpj.c, xvfVar), oup.q0(vt9Var2), true, true), 24.0f, 16.0f);
            db5 db5VarA = cb5.a(new x62(24.0f, true, new t40((byte) 19)), rbe.n, vt9Var2, 6);
            int iHashCode = Long.hashCode(vt9Var2.T);
            oag oagVarL = vt9Var2.l();
            c8e c8eVarP = qyn.P(vt9Var2, c8eVarY);
            bh5.To.getClass();
            vt9Var2.a0();
            if (vt9Var2.S) {
                vt9Var2.k(m3c.S);
            } else {
                vt9Var2.j0();
            }
            y4h.o(vt9Var2, db5VarA, ujp.f);
            y4h.o(vt9Var2, oagVarL, ujp.e);
            y4h.o(vt9Var2, Integer.valueOf(iHashCode), ujp.g);
            y4h.m(vt9Var2);
            y4h.o(vt9Var2, c8eVarP, ujp.d);
            ijl.b(uyg.q((shk) ahk.s.getValue(), vt9Var2), null, 0L, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, ((wam) vt9Var2.j(abm.a)).f, vt9Var2, 0, 0, 131070);
            vt9Var = vt9Var2;
            vt9Var.W(1411837248);
            Iterator it = g1bVar.iterator();
            while (it.hasNext()) {
                l01 l01Var = (l01) it.next();
                boolean zD = ((i3 & 896) == 256) | vt9Var.d(l01Var.ordinal());
                Object objK = vt9Var.K();
                if (zD || objK == hh5.a) {
                    objK = new gb3(function1, l01Var, (byte) 14);
                    vt9Var.g0(objK);
                }
                f(l01Var, (Function0) objK, vt9Var, 0);
            }
            vt9Var.p(false);
            vt9Var.p(true);
        } else {
            vt9Var = vt9Var2;
            vt9Var.Q();
        }
        znh znhVarR = vt9Var.r();
        if (znhVarR != null) {
            znhVarR.d = new g9(xvfVar, g1bVar, function1, i2, (byte) 8, false);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a0(mt5 r14, defpackage.y5i r15, boolean r16, boolean r17, kotlin.jvm.functions.Function1 r18) {
        /*
            boolean r0 = r14 instanceof defpackage.t76
            if (r0 == 0) goto L14
            r0 = r14
            t76 r0 = (defpackage.t76) r0
            int r1 = r0.y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.y = r1
        L12:
            r14 = r0
            goto L1a
        L14:
            t76 r0 = new t76
            r0.<init>(r14)
            goto L12
        L1a:
            java.lang.Object r0 = r14.x
            px5 r7 = px5.a
            int r1 = r14.y
            r2 = 0
            r3 = 3
            r4 = 2
            r8 = 1
            if (r1 == 0) goto L48
            if (r1 == r8) goto L44
            if (r1 == r4) goto L32
            if (r1 == r3) goto L44
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            qp2.n(r14)
            return r2
        L32:
            boolean r1 = r14.w
            boolean r4 = r14.v
            kotlin.jvm.functions.Function1 r5 = r14.u
            kotlin.jvm.functions.Function1 r5 = (kotlin.jvm.functions.Function1) r5
            y5i r6 = r14.t
            defpackage.ybh.y(r0)
            r12 = r1
            r11 = r4
            r13 = r5
            r10 = r6
            goto L94
        L44:
            defpackage.ybh.y(r0)
            return r0
        L48:
            defpackage.ybh.y(r0)
            boolean r0 = r15.n()
            if (r0 == 0) goto L76
            boolean r0 = r15.r()
            if (r0 == 0) goto L76
            boolean r0 = r15.o()
            if (r0 == 0) goto L76
            n76 r0 = new n76
            r4 = 0
            r6 = 1
            r3 = r15
            r2 = r16
            r1 = r17
            r5 = r18
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r1 = r2
            r2 = r0
            r14.y = r8
            java.lang.Object r14 = r15.w(r1, r2, r14)
            if (r14 == r7) goto La8
            return r14
        L76:
            r1 = r16
            r5 = r17
            r14.t = r15
            r6 = r18
            kotlin.jvm.functions.Function1 r6 = (kotlin.jvm.functions.Function1) r6
            r14.u = r6
            r14.v = r1
            r14.w = r5
            r14.y = r4
            kotlin.coroutines.CoroutineContext r4 = H(r15, r5, r14)
            if (r4 == r7) goto La8
            r10 = r15
            r13 = r18
            r11 = r1
            r0 = r4
            r12 = r5
        L94:
            kotlin.coroutines.CoroutineContext r0 = (kotlin.coroutines.CoroutineContext) r0
            o76 r8 = new o76
            r9 = 0
            r8.<init>(r9, r10, r11, r12, r13)
            r14.t = r2
            r14.u = r2
            r14.y = r3
            java.lang.Object r14 = defpackage.na2.Z(r0, r8, r14)
            if (r14 != r7) goto La9
        La8:
            return r7
        La9:
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kfo.a0(mt5, y5i, boolean, boolean, kotlin.jvm.functions.Function1):java.lang.Object");
    }

    public static final void b(n01 n01Var, n01 n01Var2, n01 n01Var3, n01 n01Var4, boolean z, Function0 function0, Function0 function02, qek qekVar, c8e c8eVar, ih5 ih5Var, int i2) {
        int i3;
        vt9 vt9Var = (vt9) ih5Var;
        vt9Var.Y(1367802373);
        if ((i2 & 6) == 0) {
            i3 = ((i2 & 8) == 0 ? vt9Var.f(n01Var) : vt9Var.h(n01Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= (i2 & 64) == 0 ? vt9Var.f(n01Var2) : vt9Var.h(n01Var2) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= (i2 & NotificationCompat.FLAG_GROUP_SUMMARY) == 0 ? vt9Var.f(n01Var3) : vt9Var.h(n01Var3) ? NotificationCompat.FLAG_LOCAL_ONLY : NotificationCompat.FLAG_HIGH_PRIORITY;
        }
        if ((i2 & 3072) == 0) {
            i3 |= (i2 & 4096) == 0 ? vt9Var.f(n01Var4) : vt9Var.h(n01Var4) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= vt9Var.g(z) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i3 |= vt9Var.h(function0) ? 131072 : 65536;
        }
        if ((1572864 & i2) == 0) {
            i3 |= vt9Var.h(function02) ? 1048576 : 524288;
        }
        if ((12582912 & i2) == 0) {
            i3 |= vt9Var.d(qekVar == null ? -1 : qekVar.ordinal()) ? 8388608 : 4194304;
        }
        if ((100663296 & i2) == 0) {
            i3 |= vt9Var.f(c8eVar) ? 67108864 : 33554432;
        }
        int i4 = i3;
        if (vt9Var.N(i4 & 1, (38347923 & i4) != 38347922)) {
            e(c8eVar, gyg.P(-747338024, new b7d(z, function0, function02, n01Var, n01Var2, n01Var3, n01Var4, qekVar), vt9Var), vt9Var, ((i4 >> 24) & 14) | 48);
        } else {
            vt9Var.Q();
        }
        znh znhVarR = vt9Var.r();
        if (znhVarR != null) {
            znhVarR.d = new ydk(n01Var, n01Var2, n01Var3, n01Var4, z, function0, function02, qekVar, c8eVar, i2);
        }
    }

    public static Parcelable b0(Parcel parcel, ClassLoader classLoader, Class cls) {
        if (Build.VERSION.SDK_INT >= 34) {
            return t8.N(parcel, classLoader, cls);
        }
        Parcelable parcelable = parcel.readParcelable(classLoader);
        if (parcelable == null || cls.isInstance(parcelable)) {
            return parcelable;
        }
        StringBuilder sb = new StringBuilder("Parcelable ");
        sb.append(parcelable.getClass());
        String name = cls.getName();
        sb.append(" is not a subclass of required class ");
        sb.append(name);
        sb.append(" provided in the parameter");
        throw new BadParcelableException(sb.toString());
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:47:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void c(defpackage.k7h r11, kotlin.jvm.functions.Function2 r12, defpackage.ih5 r13, int r14) {
        /*
            vt9 r13 = (defpackage.vt9) r13
            r0 = -149765515(0xfffffffff712c275, float:-2.9766383E33)
            r13.Y(r0)
            bg3 r0 = r13.x
            oag r1 = r13.l()
            r2 = 201(0xc9, float:2.82E-43)
            wff r3 = defpackage.mh5.b
            r13.T(r2, r3)
            java.lang.Object r2 = r13.K()
            zpa r3 = hh5.a
            boolean r3 = kotlin.jvm.internal.Intrinsics.a(r2, r3)
            r4 = 0
            if (r3 == 0) goto L24
            r2 = r4
            goto L26
        L24:
            h0n r2 = (h0n) r2
        L26:
            g7h r3 = r11.a
            h0n r5 = r3.d(r11, r2)
            boolean r2 = r5.equals(r2)
            if (r2 != 0) goto L35
            r13.g0(r5)
        L35:
            boolean r6 = r13.S
            r7 = 1
            r8 = 0
            if (r6 == 0) goto L4d
            boolean r2 = r11.g
            if (r2 != 0) goto L45
            boolean r2 = r1.containsKey(r3)
            if (r2 != 0) goto L49
        L45:
            oag r1 = r1.j(r3, r5)
        L49:
            r13.J = r7
        L4b:
            r2 = r8
            goto L82
        L4d:
            hqj r6 = r13.G
            int r9 = r6.g
            int[] r10 = r6.b
            java.lang.Object r6 = r6.b(r9, r10)
            oag r6 = (defpackage.oag) r6
            boolean r9 = r13.z()
            if (r9 == 0) goto L61
            if (r2 != 0) goto L6b
        L61:
            boolean r9 = r11.g
            if (r9 != 0) goto L77
            boolean r9 = r1.containsKey(r3)
            if (r9 == 0) goto L77
        L6b:
            if (r2 == 0) goto L71
            boolean r2 = r13.w
            if (r2 == 0) goto L75
        L71:
            boolean r2 = r13.w
            if (r2 != 0) goto L7b
        L75:
            r1 = r6
            goto L7b
        L77:
            oag r1 = r1.j(r3, r5)
        L7b:
            boolean r2 = r13.y
            if (r2 != 0) goto L81
            if (r6 == r1) goto L4b
        L81:
            r2 = r7
        L82:
            if (r2 == 0) goto L8b
            boolean r3 = r13.S
            if (r3 != 0) goto L8b
            r13.I(r1)
        L8b:
            boolean r3 = r13.w
            r0.d(r3)
            r13.w = r2
            r13.K = r1
            r2 = 202(0xca, float:2.83E-43)
            wff r3 = defpackage.mh5.c
            r13.R(r3, r2, r8, r1)
            int r1 = r14 >> 3
            r1 = r1 & 14
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r12.invoke(r13, r1)
            r13.p(r8)
            r13.p(r8)
            int r0 = r0.c()
            if (r0 != 0) goto Lb3
            r7 = r8
        Lb3:
            r13.w = r7
            r13.K = r4
            znh r13 = r13.r()
            if (r13 == 0) goto Lc5
            uf1 r0 = new uf1
            r1 = 4
            r0.<init>(r11, r12, r14, r1)
            r13.d = r0
        Lc5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kfo.c(k7h, kotlin.jvm.functions.Function2, ih5, int):void");
    }

    public static void c0(Context context, Class cls, int i2, int i3) {
        if (e0(context)) {
            String packageName = context.getPackageName();
            if (Build.VERSION.SDK_INT < 31) {
                i2 = i3;
            }
            RemoteViews remoteViews = new RemoteViews(packageName, i2);
            try {
                AppWidgetManager appWidgetManager = AppWidgetManager.getInstance(context);
                ComponentName componentName = new ComponentName(context, (Class<?>) cls);
                Bundle bundle = new Bundle();
                bundle.putParcelable("appWidgetPreview", remoteViews);
                appWidgetManager.requestPinAppWidget(componentName, bundle, null);
            } catch (IllegalStateException unused) {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:29:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void d(defpackage.k7h[] r10, kotlin.jvm.functions.Function2 r11, defpackage.ih5 r12, int r13) {
        /*
            vt9 r12 = (defpackage.vt9) r12
            r0 = 415205898(0x18bf8a0a, float:4.9511727E-24)
            r12.Y(r0)
            bg3 r0 = r12.x
            oag r1 = r12.l()
            r2 = 201(0xc9, float:2.82E-43)
            wff r3 = defpackage.mh5.b
            r12.T(r2, r3)
            boolean r2 = r12.S
            wff r3 = defpackage.mh5.d
            r4 = 204(0xcc, float:2.86E-43)
            r5 = 1
            r6 = 0
            if (r2 == 0) goto L4c
            oag r2 = defpackage.oag.g
            oag r2 = alo.f0(r10, r1, r2)
            r1.getClass()
            nag r7 = new nag
            r7.<init>(r1)
            r7.g = r1
            r7.putAll(r2)
            oag r1 = r7.e()
            r12.T(r4, r3)
            r12.C()
            r12.h0(r1)
            r12.C()
            r12.h0(r2)
            r12.p(r6)
            r12.J = r5
        L4a:
            r2 = r6
            goto Laf
        L4c:
            hqj r2 = r12.G
            int r7 = r2.g
            java.lang.Object r2 = r2.h(r7, r6)
            oag r2 = (defpackage.oag) r2
            hqj r7 = r12.G
            int r8 = r7.g
            java.lang.Object r7 = r7.h(r8, r5)
            oag r7 = (defpackage.oag) r7
            oag r8 = alo.f0(r10, r1, r7)
            boolean r9 = r12.z()
            if (r9 == 0) goto L81
            boolean r9 = r12.y
            if (r9 != 0) goto L81
            boolean r7 = kotlin.jvm.internal.Intrinsics.a(r7, r8)
            if (r7 == 0) goto L81
            int r1 = r12.l
            hqj r3 = r12.G
            int r3 = r3.s()
            int r3 = r3 + r1
            r12.l = r3
            r1 = r2
            goto L4a
        L81:
            r1.getClass()
            nag r7 = new nag
            r7.<init>(r1)
            r7.g = r1
            r7.putAll(r8)
            oag r1 = r7.e()
            r12.T(r4, r3)
            r12.C()
            r12.h0(r1)
            r12.C()
            r12.h0(r8)
            r12.p(r6)
            boolean r3 = r12.y
            if (r3 != 0) goto Lae
            boolean r2 = kotlin.jvm.internal.Intrinsics.a(r1, r2)
            if (r2 != 0) goto L4a
        Lae:
            r2 = r5
        Laf:
            if (r2 == 0) goto Lb8
            boolean r3 = r12.S
            if (r3 != 0) goto Lb8
            r12.I(r1)
        Lb8:
            boolean r3 = r12.w
            r0.d(r3)
            r12.w = r2
            r12.K = r1
            r2 = 202(0xca, float:2.83E-43)
            wff r3 = defpackage.mh5.c
            r12.R(r3, r2, r6, r1)
            int r1 = r13 >> 3
            r1 = r1 & 14
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r11.invoke(r12, r1)
            r12.p(r6)
            r12.p(r6)
            int r0 = r0.c()
            if (r0 != 0) goto Le0
            r5 = r6
        Le0:
            r12.w = r5
            r0 = 0
            r12.K = r0
            znh r12 = r12.r()
            if (r12 == 0) goto Lf3
            uf1 r0 = new uf1
            r1 = 3
            r0.<init>(r10, r11, r13, r1)
            r12.d = r0
        Lf3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kfo.d(k7h[], kotlin.jvm.functions.Function2, ih5, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void d0(final android.app.Activity r4, int r5) {
        /*
            android.app.AlertDialog$Builder r0 = new android.app.AlertDialog$Builder
            r0.<init>(r4)
            r1 = 1
            r2 = 2132017591(0x7f1401b7, float:1.9673465E38)
            if (r5 == 0) goto L3a
            if (r5 == r1) goto L27
            r3 = 2
            if (r5 == r3) goto L1a
            r3 = 3
            if (r5 == r3) goto L3a
            r3 = 4
            if (r5 == r3) goto L3a
            r3 = 5
            if (r5 == r3) goto L3a
            goto L4c
        L1a:
            r5 = 2132017593(0x7f1401b9, float:1.9673469E38)
            r0.setTitle(r5)
            r5 = 2132017592(0x7f1401b8, float:1.9673467E38)
            r0.setMessage(r5)
            goto L4c
        L27:
            java.lang.String r5 = r4.getString(r2)
            java.lang.Object[] r5 = new java.lang.Object[]{r5}
            r2 = 2132022692(0x7f1415a4, float:1.968381E38)
            java.lang.String r5 = r4.getString(r2, r5)
            r0.setMessage(r5)
            goto L4c
        L3a:
            java.lang.String r5 = r4.getString(r2)
            java.lang.Object[] r5 = new java.lang.Object[]{r5}
            r2 = 2132022693(0x7f1415a5, float:1.9683813E38)
            java.lang.String r5 = r4.getString(r2, r5)
            r0.setMessage(r5)
        L4c:
            r5 = 0
            r0.setCancelable(r5)
            java.lang.String r2 = "com.android.vending"
            java.lang.String r3 = defpackage.r9n.l(r4)
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L68
            k7b r2 = new k7b
            r2.<init>()
            r4 = 2132022695(0x7f1415a7, float:1.9683817E38)
            r0.setPositiveButton(r4, r2)
            goto L73
        L68:
            k7b r5 = new k7b
            r5.<init>()
            r4 = 2132022691(0x7f1415a3, float:1.9683809E38)
            r0.setPositiveButton(r4, r5)
        L73:
            ada r4 = new ada
            r4.<init>(r1)
            r5 = 2132019755(0x7f140a2b, float:1.9677854E38)
            r0.setNegativeButton(r5, r4)
            r0.show()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kfo.d0(android.app.Activity, int):void");
    }

    public static final void e(c8e c8eVar, ue5 ue5Var, ih5 ih5Var, int i2) {
        int i3;
        vt9 vt9Var = (vt9) ih5Var;
        vt9Var.Y(-2094619292);
        byte b2 = 4;
        if ((i2 & 6) == 0) {
            i3 = (vt9Var.f(c8eVar) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= vt9Var.h(ue5Var) ? 32 : 16;
        }
        if (vt9Var.N(i3 & 1, (i3 & 19) != 18)) {
            c8e c8eVarD = c8eVar.d(mpj.a);
            int i4 = ((i3 << 6) & 7168) | 432;
            db5 db5VarA = cb5.a(new x62(16.0f, true, new t40((byte) 19)), rbe.o, vt9Var, 54);
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
            y4h.o(vt9Var, db5VarA, ujp.f);
            y4h.o(vt9Var, oagVarL, ujp.e);
            y4h.o(vt9Var, Integer.valueOf(iHashCode), ujp.g);
            y4h.m(vt9Var);
            y4h.o(vt9Var, c8eVarP, ujp.d);
            ue5Var.invoke(eb5.a, vt9Var, Integer.valueOf(((i4 >> 6) & 112) | 6));
            vt9Var.p(true);
        } else {
            vt9Var.Q();
        }
        znh znhVarR = vt9Var.r();
        if (znhVarR != null) {
            znhVarR.d = new fb1(c8eVar, ue5Var, i2, b2);
        }
    }

    public static boolean e0(Context context) {
        if ("Xiaomi".equalsIgnoreCase(Build.MANUFACTURER)) {
            return false;
        }
        return AppWidgetManager.getInstance(context).isRequestPinAppWidgetSupported();
    }

    public static final void f(l01 l01Var, Function0 function0, ih5 ih5Var, int i2) {
        vt9 vt9Var = (vt9) ih5Var;
        vt9Var.Y(78032383);
        int i3 = i2 | (vt9Var.d(l01Var.ordinal()) ? 4 : 2) | (vt9Var.h(function0) ? 32 : 16);
        if (vt9Var.N(i3 & 1, (i3 & 19) != 18)) {
            sd3 sd3Var = rbe.l;
            hp7 hp7Var = ua5.a;
            long j2 = ((sa5) vt9Var.j(hp7Var)).A;
            u8i u8iVarA = v8i.a(4.0f);
            z7e z7eVar = z7e.b;
            c8e c8eVarQ = jpo.q(x1p.j(lcp.j(z7eVar, 1.0f, j2, u8iVarA), v8i.a(4.0f)).d(mpj.a), false, (String) null, function0, 15);
            o9i o9iVarA = m9i.a(b72.a, sd3Var, vt9Var, 48);
            int iHashCode = Long.hashCode(vt9Var.T);
            oag oagVarL = vt9Var.l();
            c8e c8eVarP = qyn.P(vt9Var, c8eVarQ);
            bh5.To.getClass();
            vt9Var.a0();
            boolean z = vt9Var.S;
            fza fzaVar = m3c.S;
            if (z) {
                vt9Var.k(fzaVar);
            } else {
                vt9Var.j0();
            }
            ah5 ah5Var = ujp.f;
            y4h.o(vt9Var, o9iVarA, ah5Var);
            ah5 ah5Var2 = ujp.e;
            y4h.o(vt9Var, oagVarL, ah5Var2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            ah5 ah5Var3 = ujp.g;
            y4h.o(vt9Var, numValueOf, ah5Var3);
            y4h.m(vt9Var);
            ah5 ah5Var4 = ujp.d;
            y4h.o(vt9Var, c8eVarP, ah5Var4);
            x62 x62Var = new x62(8.0f, true, new t40((byte) 19));
            c8e c8eVarD = a26.X(z7eVar, 16.0f).d(new g4c(1.0f, true));
            o9i o9iVarA2 = m9i.a(x62Var, sd3Var, vt9Var, 54);
            int iHashCode2 = Long.hashCode(vt9Var.T);
            oag oagVarL2 = vt9Var.l();
            c8e c8eVarP2 = qyn.P(vt9Var, c8eVarD);
            vt9Var.a0();
            if (vt9Var.S) {
                vt9Var.k(fzaVar);
            } else {
                vt9Var.j0();
            }
            y4h.o(vt9Var, o9iVarA2, ah5Var);
            y4h.o(vt9Var, oagVarL2, ah5Var2);
            u35.j(iHashCode2, vt9Var, ah5Var3, vt9Var);
            y4h.o(vt9Var, c8eVarP2, ah5Var4);
            xf8.j(iza.a(k1g.A(l01Var), vt9Var), null, mpj.h(z7eVar, 24.0f), null, null, 0.0f, null, vt9Var, 440, 120);
            ijl.b(k1g.E(l01Var, vt9Var), null, ((sa5) vt9Var.j(hp7Var)).s, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, ((wam) vt9Var.j(abm.a)).j, vt9Var, 0, 0, 131066);
            vt9Var = vt9Var;
            vt9Var.p(true);
            yza yzaVarE = x1p.n;
            if (yzaVarE == null) {
                xza xzaVar = new xza("AutoMirrored.Filled.ArrowForward", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, true, 96);
                l08 l08Var = u0n.a;
                nvj nvjVar = new nvj(u95.b);
                ArrayList arrayList = new ArrayList(32);
                arrayList.add(new h7g(12.0f, 4.0f));
                arrayList.add(new o7g(-1.41f, 1.41f));
                arrayList.add(new g7g(16.17f, 11.0f));
                arrayList.add(new f7g(4.0f));
                arrayList.add(new t7g(2.0f));
                arrayList.add(new n7g(12.17f));
                arrayList.add(new o7g(-5.58f, 5.59f));
                arrayList.add(new g7g(12.0f, 20.0f));
                arrayList.add(new o7g(8.0f, -8.0f));
                arrayList.add(d7g.c);
                xza.d(xzaVar, arrayList, nvjVar);
                yzaVarE = xzaVar.e();
                x1p.n = yzaVarE;
            }
            wta.a(yzaVarE, null, a26.X(z7eVar, 16.0f), ((sa5) vt9Var.j(hp7Var)).s, vt9Var, 432, 0);
            vt9Var.p(true);
        } else {
            vt9Var.Q();
        }
        znh znhVarR = vt9Var.r();
        if (znhVarR != null) {
            znhVarR.d = new fx0(l01Var, function0, i2, (byte) 13);
        }
    }

    public static int f0(int i2) {
        if (i2 == 0) {
            return 0;
        }
        if (i2 == 1) {
            return 90;
        }
        if (i2 == 2) {
            return 180;
        }
        if (i2 == 3) {
            return 270;
        }
        qp2.o(sko.i(i2, "Unsupported surface rotation: "));
        return 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00ba  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void g(java.lang.String r9, kotlin.jvm.functions.Function0 r10, defpackage.ih5 r11, int r12) {
        /*
            Method dump skipped, instructions count: 230
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kfo.g(java.lang.String, kotlin.jvm.functions.Function0, ih5, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0051  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void g0(defpackage.lnk r12, defpackage.unk r13, defpackage.op5 r14) {
        /*
            long r0 = r13.b
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            r5 = 0
            if (r4 != 0) goto Le
            r4 = r5
            goto L27
        Le:
            int r4 = r12.getNextEventTimeIndex(r0)
            r6 = -1
            if (r4 != r6) goto L19
            int r4 = r12.getEventTimeCount()
        L19:
            if (r4 <= 0) goto L27
            int r6 = r4 + (-1)
            long r6 = r12.getEventTime(r6)
            int r6 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r6 != 0) goto L27
            int r4 = r4 + (-1)
        L27:
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 == 0) goto L51
            int r2 = r12.getEventTimeCount()
            if (r4 >= r2) goto L51
            java.util.List r7 = r12.getCues(r0)
            long r2 = r12.getEventTime(r4)
            boolean r6 = r7.isEmpty()
            if (r6 != 0) goto L51
            long r8 = r13.b
            int r6 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r6 >= 0) goto L51
            a46 r6 = new a46
            long r10 = r2 - r8
            r6.<init>(r7, r8, r10)
            r14.accept(r6)
            r2 = 1
            goto L52
        L51:
            r2 = r5
        L52:
            r3 = r4
        L53:
            int r6 = r12.getEventTimeCount()
            if (r3 >= r6) goto L5f
            V(r12, r3, r14)
            int r3 = r3 + 1
            goto L53
        L5f:
            boolean r13 = r13.a
            if (r13 == 0) goto L87
            if (r2 == 0) goto L67
            int r4 = r4 + (-1)
        L67:
            if (r5 >= r4) goto L6f
            V(r12, r5, r14)
            int r5 = r5 + 1
            goto L67
        L6f:
            if (r2 == 0) goto L87
            a46 r6 = new a46
            java.util.List r7 = r12.getCues(r0)
            long r8 = r12.getEventTime(r4)
            long r12 = r12.getEventTime(r4)
            long r10 = r0 - r12
            r6.<init>(r7, r8, r10)
            r14.accept(r6)
        L87:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kfo.g0(lnk, unk, op5):void");
    }

    public static final void h(sdk sdkVar, Function0 function0, c8e c8eVar, ih5 ih5Var, int i2) {
        int i3;
        vt9 vt9Var = (vt9) ih5Var;
        vt9Var.Y(990064467);
        if ((i2 & 6) == 0) {
            i3 = ((i2 & 8) == 0 ? vt9Var.f(sdkVar) : vt9Var.h(sdkVar) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= vt9Var.h(function0) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= vt9Var.f(c8eVar) ? NotificationCompat.FLAG_LOCAL_ONLY : NotificationCompat.FLAG_HIGH_PRIORITY;
        }
        boolean z = false;
        byte b2 = 1;
        if (vt9Var.N(i3 & 1, (i3 & 147) != 146)) {
            if ((i3 & 14) == 4 || ((i3 & 8) != 0 && vt9Var.h(sdkVar))) {
                z = true;
            }
            Object objK = vt9Var.K();
            zpa zpaVar = hh5.a;
            mt5 mt5Var = null;
            if (z || objK == zpaVar) {
                objK = new mz9((byte) 29, mt5Var, sdkVar);
                vt9Var.g0(objK);
            }
            Function2 function2 = (Function2) objK;
            Object objK2 = vt9Var.K();
            if (objK2 == zpaVar) {
                objK2 = hyg.k((Object) null);
                vt9Var.g0(objK2);
            }
            afe afeVar = (afe) objK2;
            boolean zH = vt9Var.h(function2);
            Object objK3 = vt9Var.K();
            if (zH || objK3 == zpaVar) {
                objK3 = new muj(function2, afeVar, mt5Var, b2);
                vt9Var.g0(objK3);
            }
            rm5.e(vt9Var, sdkVar, (Function2) objK3);
            db5 db5VarA = cb5.a(new x62(24.0f, true, new t40((byte) 19)), rbe.n, vt9Var, 6);
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
            y4h.o(vt9Var, db5VarA, ujp.f);
            y4h.o(vt9Var, oagVarL, ujp.e);
            y4h.o(vt9Var, Integer.valueOf(iHashCode), ujp.g);
            y4h.m(vt9Var);
            y4h.o(vt9Var, c8eVarP, ujp.d);
            String str = (String) afeVar.getValue();
            if (str == null) {
                str = "";
            }
            ijl.b(str, null, 0L, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, ((wam) vt9Var.j(abm.a)).k, vt9Var, 0, 0, 131070);
            vt9Var = vt9Var;
            yi4.a(function0, mpj.a, false, (paj) null, (z14) null, (e24) null, (go3) null, (zvf) null, wyh.c, vt9Var, ((i3 >> 3) & 14) | 805306416, 508);
            vt9Var.p(true);
        } else {
            vt9Var.Q();
        }
        znh znhVarR = vt9Var.r();
        if (znhVarR != null) {
            znhVarR.d = new ga1((Object) sdkVar, (Object) function0, (Object) c8eVar, i2, (byte) 16);
        }
    }

    public static ske h0(NdefMessage ndefMessage) {
        tke tkeVar;
        tke tkeVar2;
        tke tkeVar3;
        NdefRecord[] records = ndefMessage.getRecords();
        ske skeVar = new ske(0);
        ArrayList arrayList = new ArrayList();
        for (NdefRecord ndefRecord : records) {
            short tnf = ndefRecord.getTnf();
            if (tnf != 0) {
                tkeVar = null;
                if (tnf != 1) {
                    if (tnf == 2) {
                        String str = new String(ndefRecord.getType(), StandardCharsets.UTF_8);
                        byte[] payload = ndefRecord.getPayload();
                        tkeVar3 = new tke(0);
                        tkeVar3.b = 0;
                        tkeVar3.c = "mime";
                        tkeVar3.d = str;
                        tkeVar3.h = payload;
                        tkeVar = tkeVar3;
                    } else if (tnf == 3) {
                        tkeVar = D(true, ndefRecord.toUri());
                    } else if (tnf == 4) {
                        String str2 = new String(ndefRecord.getType(), StandardCharsets.UTF_8);
                        byte[] payload2 = ndefRecord.getPayload();
                        tkeVar2 = new tke(0);
                        tkeVar2.b = 1;
                        tkeVar2.c = str2;
                        tkeVar2.h = payload2;
                        try {
                            tkeVar = h0(new NdefMessage(payload2));
                        } catch (FormatException | UnsupportedEncodingException unused) {
                        }
                        tkeVar2.i = tkeVar;
                        tkeVar = tkeVar2;
                    } else if (tnf == 5) {
                        byte[] payload3 = ndefRecord.getPayload();
                        tkeVar = new tke(0);
                        tkeVar.b = 0;
                        tkeVar.c = "unknown";
                        tkeVar.h = payload3;
                    }
                } else if (Arrays.equals(ndefRecord.getType(), NdefRecord.RTD_URI)) {
                    tkeVar = D(false, ndefRecord.toUri());
                } else if (Arrays.equals(ndefRecord.getType(), NdefRecord.RTD_TEXT)) {
                    byte[] payload4 = ndefRecord.getPayload();
                    if (payload4.length != 0) {
                        tke tkeVar4 = new tke(0);
                        tkeVar4.b = 0;
                        tkeVar4.c = "text";
                        byte b2 = payload4[0];
                        tkeVar4.f = (b2 & 128) == 0 ? "utf-8" : "utf-16";
                        int i2 = b2 & 63;
                        tkeVar4.g = new String(payload4, 1, i2, StandardCharsets.US_ASCII);
                        int i3 = i2 + 1;
                        if (i3 <= payload4.length) {
                            tkeVar4.h = Arrays.copyOfRange(payload4, i3, payload4.length);
                            tkeVar = tkeVar4;
                        }
                    }
                } else if (Arrays.equals(ndefRecord.getType(), NdefRecord.RTD_SMART_POSTER)) {
                    byte[] payload5 = ndefRecord.getPayload();
                    tkeVar3 = new tke(0);
                    tkeVar3.b = 0;
                    tkeVar3.c = "smart-poster";
                    tkeVar3.h = payload5;
                    try {
                        tkeVar = h0(new NdefMessage(payload5));
                    } catch (FormatException | UnsupportedEncodingException unused2) {
                    }
                    tkeVar3.i = tkeVar;
                    tkeVar = tkeVar3;
                } else {
                    String strConcat = ":".concat(new String(ndefRecord.getType(), StandardCharsets.UTF_8));
                    if (U(strConcat)) {
                        byte[] payload6 = ndefRecord.getPayload();
                        tkeVar2 = new tke(0);
                        tkeVar2.b = 2;
                        tkeVar2.c = strConcat;
                        tkeVar2.h = payload6;
                        try {
                            tkeVar = h0(new NdefMessage(payload6));
                        } catch (FormatException | UnsupportedEncodingException unused3) {
                        }
                        tkeVar2.i = tkeVar;
                        tkeVar = tkeVar2;
                    }
                }
            } else {
                tkeVar = new tke(0);
                tkeVar.b = 0;
                tkeVar.c = "empty";
                tkeVar.h = new byte[0];
            }
            if (tkeVar != null && ndefRecord.getTnf() != 0) {
                tkeVar.e = new String(ndefRecord.getId(), StandardCharsets.UTF_8);
            }
            if (tkeVar != null) {
                arrayList.add(tkeVar);
            }
        }
        tke[] tkeVarArr = new tke[arrayList.size()];
        skeVar.b = tkeVarArr;
        arrayList.toArray(tkeVarArr);
        return skeVar;
    }

    public static final void i(n01 n01Var, ih5 ih5Var, int i2) throws oye {
        vt9 vt9Var = (vt9) ih5Var;
        vt9Var.Y(609552130);
        int i3 = (vt9Var.f(n01Var) ? 4 : 2) | i2;
        if (vt9Var.N(i3 & 1, (i3 & 3) != 2)) {
            n(n01Var, uyg.q((shk) dhk.z.getValue(), vt9Var), wyh.d, vt9Var, 384 | (i3 & 14));
        } else {
            vt9Var.Q();
        }
        znh znhVarR = vt9Var.r();
        if (znhVarR != null) {
            znhVarR.d = new k13(n01Var, i2, (byte) 3);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: wib */
    public static NdefMessage i0(ske skeVar) throws wib {
        try {
            ArrayList arrayList = new ArrayList();
            int i2 = 0;
            while (true) {
                tke[] tkeVarArr = skeVar.b;
                if (i2 >= tkeVarArr.length) {
                    NdefRecord[] ndefRecordArr = new NdefRecord[arrayList.size()];
                    arrayList.toArray(ndefRecordArr);
                    return new NdefMessage(ndefRecordArr);
                }
                arrayList.add(j0(tkeVarArr[i2]));
                i2++;
            }
        } catch (UnsupportedEncodingException | wib | IllegalArgumentException unused) {
            throw new wib();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:38:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void j(java.lang.String r23, defpackage.c8e r24, defpackage.ih5 r25, int r26, int r27) {
        /*
            Method dump skipped, instructions count: 286
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kfo.j(java.lang.String, c8e, ih5, int, int):void");
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: wib */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x017c, code lost:
    
        throw new wib();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.nfc.NdefRecord j0(tke r14) throws wib {
        /*
            Method dump skipped, instructions count: 750
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kfo.j0(tke):android.nfc.NdefRecord");
    }

    public static final void k(boolean z, c8e c8eVar, ih5 ih5Var, int i2) {
        int i3;
        vt9 vt9Var = (vt9) ih5Var;
        vt9Var.Y(-1251707190);
        if ((i2 & 6) == 0) {
            i3 = (vt9Var.g(z) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= vt9Var.f(c8eVar) ? 32 : 16;
        }
        byte b2 = 0;
        byte b3 = 1;
        if (vt9Var.N(i3 & 1, (i3 & 19) != 18)) {
            e(c8eVar, gyg.P(1400805207, new zdk(b2, z), vt9Var), vt9Var, ((i3 >> 3) & 14) | 48);
        } else {
            vt9Var.Q();
        }
        znh znhVarR = vt9Var.r();
        if (znhVarR != null) {
            znhVarR.d = new tz2(b3, i2, c8eVar, z);
        }
    }

    public static void k0(Context context, Class cls) {
        Context applicationContext = context.getApplicationContext();
        int[] appWidgetIds = AppWidgetManager.getInstance(applicationContext).getAppWidgetIds(new ComponentName(applicationContext, (Class<?>) cls));
        if (appWidgetIds == null || appWidgetIds.length == 0) {
            return;
        }
        Intent intent = new Intent(applicationContext, (Class<?>) cls);
        intent.setAction("android.appwidget.action.APPWIDGET_UPDATE");
        intent.putExtra("appWidgetIds", appWidgetIds);
        applicationContext.sendBroadcast(intent);
    }

    public static final void l(n01 n01Var, ih5 ih5Var, int i2) throws oye {
        vt9 vt9Var = (vt9) ih5Var;
        vt9Var.Y(-621808380);
        int i3 = (vt9Var.f(n01Var) ? 4 : 2) | i2;
        byte b2 = 1;
        if (vt9Var.N(i3 & 1, (i3 & 3) != 2)) {
            n(n01Var, uyg.q((shk) dhk.p.getValue(), vt9Var), wyh.e, vt9Var, 384 | (i3 & 14));
        } else {
            vt9Var.Q();
        }
        znh znhVarR = vt9Var.r();
        if (znhVarR != null) {
            znhVarR.d = new k13(n01Var, i2, b2);
        }
    }

    public static void l0(File file, byte[] bArr) throws IOException {
        file.getClass();
        FileOutputStream fileOutputStream = new FileOutputStream(file, u1b.r(new t29[0]).contains(t29.a));
        try {
            fileOutputStream.write(bArr);
            fileOutputStream.close();
        } catch (Throwable th) {
            try {
                fileOutputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public static final void m(n01 n01Var, ih5 ih5Var, int i2) {
        String strR;
        vt9 vt9Var = (vt9) ih5Var;
        vt9Var.Y(1084634047);
        int i3 = i2 | (vt9Var.f(n01Var) ? 4 : 2);
        if (vt9Var.N(i3 & 1, (i3 & 3) != 2)) {
            i39 i39Var = mpj.a;
            o9i o9iVarA = m9i.a(new x62(8.0f, true, new t40((byte) 19)), rbe.l, vt9Var, 54);
            int iHashCode = Long.hashCode(vt9Var.T);
            oag oagVarL = vt9Var.l();
            c8e c8eVarP = qyn.P(vt9Var, i39Var);
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
            l01 l01Var = n01Var.a;
            if (l01Var == l01.e) {
                vt9Var.W(538337808);
                strR = uyg.q((shk) dhk.t.getValue(), vt9Var);
                vt9Var.p(false);
            } else {
                vt9Var.W(538424484);
                strR = uyg.r((shk) dhk.s.getValue(), new Object[]{k1g.E(l01Var, vt9Var)}, vt9Var);
                vt9Var.p(false);
            }
            g4c g4cVar = new g4c(1.0f, true);
            hp7 hp7Var = abm.a;
            ikl iklVar = ((wam) vt9Var.j(hp7Var)).k;
            hp7 hp7Var2 = ua5.a;
            ijl.b(strR, g4cVar, ((sa5) vt9Var.j(hp7Var2)).s, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, iklVar, vt9Var, 0, 0, 131064);
            xf8.j(iza.a(k1g.A(l01Var), vt9Var), null, mpj.h(z7e.b, 16.0f), null, null, 0.0f, null, vt9Var, 440, 120);
            ijl.b("+".concat(qyn.B(n01Var)), null, ((sa5) vt9Var.j(hp7Var2)).s, 0L, null, 0L, null, null, 0L, 0, false, 1, 0, ((wam) vt9Var.j(hp7Var)).k, vt9Var, 0, 24576, 114682);
            vt9Var = vt9Var;
            vt9Var.p(true);
        } else {
            vt9Var.Q();
        }
        znh znhVarR = vt9Var.r();
        if (znhVarR != null) {
            znhVarR.d = new k13(n01Var, i2, (byte) 2);
        }
    }

    public static final void n(n01 n01Var, String str, ue5 ue5Var, ih5 ih5Var, int i2) throws oye {
        vt9 vt9Var;
        vt9 vt9Var2 = (vt9) ih5Var;
        vt9Var2.Y(816798939);
        int i3 = i2 | (vt9Var2.f(n01Var) ? 4 : 2) | (vt9Var2.f(str) ? 32 : 16);
        if (vt9Var2.N(i3 & 1, (i3 & 147) != 146)) {
            i39 i39Var = mpj.a;
            o9i o9iVarA = m9i.a(new x62(8.0f, true, new t40((byte) 19)), rbe.l, vt9Var2, 54);
            int iHashCode = Long.hashCode(vt9Var2.T);
            oag oagVarL = vt9Var2.l();
            c8e c8eVarP = qyn.P(vt9Var2, i39Var);
            bh5.To.getClass();
            vt9Var2.a0();
            if (vt9Var2.S) {
                vt9Var2.k(m3c.S);
            } else {
                vt9Var2.j0();
            }
            y4h.o(vt9Var2, o9iVarA, ujp.f);
            y4h.o(vt9Var2, oagVarL, ujp.e);
            y4h.o(vt9Var2, Integer.valueOf(iHashCode), ujp.g);
            y4h.m(vt9Var2);
            y4h.o(vt9Var2, c8eVarP, ujp.d);
            g4c g4cVar = new g4c(1.0f, true);
            String strE = k1g.E(n01Var.a, vt9Var2);
            hp7 hp7Var = abm.a;
            ikl iklVar = ((wam) vt9Var2.j(hp7Var)).k;
            hp7 hp7Var2 = ua5.a;
            ijl.b(strE, g4cVar, ((sa5) vt9Var2.j(hp7Var2)).s, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, iklVar, vt9Var2, 0, 0, 131064);
            ue5Var.invoke(vt9Var2, 6);
            ijl.b(str, null, ((sa5) vt9Var2.j(hp7Var2)).s, 0L, null, 0L, null, null, 0L, 0, false, 1, 0, ((wam) vt9Var2.j(hp7Var)).k, vt9Var2, (i3 >> 3) & 14, 24576, 114682);
            vt9Var = vt9Var2;
            vt9Var.p(true);
        } else {
            vt9Var = vt9Var2;
            vt9Var.Q();
        }
        znh znhVarR = vt9Var.r();
        if (znhVarR != null) {
            znhVarR.d = new g9(n01Var, str, ue5Var, i2, (byte) 28);
        }
    }

    public static final void o(n01 n01Var, n01 n01Var2, n01 n01Var3, n01 n01Var4, ih5 ih5Var, int i2) throws oye {
        vt9 vt9Var = (vt9) ih5Var;
        vt9Var.Y(245892778);
        int i3 = (vt9Var.f(n01Var) ? 4 : 2) | i2 | (vt9Var.f(n01Var2) ? 32 : 16) | (vt9Var.f(n01Var3) ? NotificationCompat.FLAG_LOCAL_ONLY : NotificationCompat.FLAG_HIGH_PRIORITY) | (vt9Var.f(n01Var4) ? 2048 : 1024);
        if (vt9Var.N(i3 & 1, (i3 & 1171) != 1170)) {
            i39 i39Var = mpj.a;
            db5 db5VarA = cb5.a(new x62(8.0f, true, new t40((byte) 19)), rbe.n, vt9Var, 6);
            int iHashCode = Long.hashCode(vt9Var.T);
            oag oagVarL = vt9Var.l();
            c8e c8eVarP = qyn.P(vt9Var, i39Var);
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
            if (n01Var == null) {
                vt9Var.W(1167297688);
            } else {
                vt9Var.W(1167297689);
                m(n01Var, vt9Var, 0);
            }
            vt9Var.p(false);
            if (n01Var3 == null) {
                vt9Var.W(1167347474);
            } else {
                vt9Var.W(1167347475);
                i(n01Var3, vt9Var, 0);
            }
            vt9Var.p(false);
            if (n01Var4 == null) {
                vt9Var.W(1167404049);
            } else {
                vt9Var.W(1167404050);
                l(n01Var4, vt9Var, 0);
            }
            vt9Var.p(false);
            if (n01Var2 == null) {
                vt9Var.W(1167454424);
            } else {
                vt9Var.W(1167454425);
                m(n01Var2, vt9Var, 0);
            }
            vt9Var.p(false);
            vt9Var.p(true);
        } else {
            vt9Var.Q();
        }
        znh znhVarR = vt9Var.r();
        if (znhVarR != null) {
            znhVarR.d = new px0(n01Var, n01Var2, n01Var3, n01Var4, i2, (byte) 15);
        }
    }

    public static final void p(final sek sekVar, final Function0 function0, Function0 function02, ih5 ih5Var, final int i2, final int i3) {
        Function0 function03;
        int i4;
        vt9 vt9Var;
        final Function0 function04;
        Function0 function05;
        vt9 vt9Var2 = (vt9) ih5Var;
        vt9Var2.Y(-1099160089);
        int i5 = i2 | (vt9Var2.f(sekVar) ? 4 : 2);
        if ((i2 & 48) == 0) {
            i5 |= vt9Var2.h(function0) ? 32 : 16;
        }
        int i6 = i3 & 4;
        if (i6 != 0) {
            i4 = i5 | 384;
            function03 = function02;
        } else {
            function03 = function02;
            i4 = i5 | (vt9Var2.h(function03) ? NotificationCompat.FLAG_LOCAL_ONLY : NotificationCompat.FLAG_HIGH_PRIORITY);
        }
        if (vt9Var2.N(i4 & 1, (i4 & 147) != 146)) {
            if (i6 != 0) {
                Object objK = vt9Var2.K();
                if (objK == hh5.a) {
                    objK = new unj((byte) 11);
                    vt9Var2.g0(objK);
                }
                function05 = (Function0) objK;
            } else {
                function05 = function03;
            }
            vt9Var = vt9Var2;
            i7e.a(function0, null, i7e.f(null, vt9Var2, 0, 3), 0.0f, false, null, 0L, 0L, 0L, null, null, null, gyg.P(1677314633, new f23(sekVar, function0, function05, (byte) 14), vt9Var2), vt9Var, (i4 >> 3) & 14, 7162);
            function04 = function05;
        } else {
            vt9Var = vt9Var2;
            vt9Var.Q();
            function04 = function03;
        }
        znh znhVarR = vt9Var.r();
        if (znhVarR != null) {
            znhVarR.d = new Function2() { // from class: xdk
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    kfo.p(sekVar, function0, function04, (ih5) obj, aoh.m(i2 | 1), i3);
                    return Unit.a;
                }
            };
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: oye */
    /* JADX WARN: Removed duplicated region for block: B:37:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:61:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void q(sek r13, kotlin.jvm.functions.Function0 r14, kotlin.jvm.functions.Function0 r15, defpackage.c8e r16, defpackage.ih5 r17, int r18, int r19) throws oye {
        /*
            Method dump skipped, instructions count: 254
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kfo.q(sek, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, c8e, ih5, int, int):void");
    }

    public static final void r(ih5 ih5Var, int i2) {
        vt9 vt9Var = (vt9) ih5Var;
        vt9Var.Y(1763471612);
        if (vt9Var.N(i2 & 1, i2 != 0)) {
            wta.b(iza.a((dl7) tk7.D.getValue(), vt9Var), null, mpj.h(z7e.b, 48.0f), ((sa5) vt9Var.j(ua5.a)).a, vt9Var, 440, 0);
        } else {
            vt9Var.Q();
        }
        znh znhVarR = vt9Var.r();
        if (znhVarR != null) {
            znhVarR.d = new voj(i2);
        }
    }

    public static final void s(String str, ih5 ih5Var, int i2) {
        vt9 vt9Var;
        vt9 vt9Var2 = (vt9) ih5Var;
        vt9Var2.Y(-326382765);
        int i3 = i2 | (vt9Var2.f(str) ? 4 : 2);
        if (vt9Var2.N(i3 & 1, (i3 & 3) != 2)) {
            vt9Var = vt9Var2;
            ijl.b(str, mpj.a, 0L, 0L, null, 0L, null, new pel(3), 0L, 0, false, 0, 0, ((wam) vt9Var2.j(abm.a)).g, vt9Var, (i3 & 14) | 48, 0, 130044);
        } else {
            vt9Var = vt9Var2;
            vt9Var.Q();
        }
        znh znhVarR = vt9Var.r();
        if (znhVarR != null) {
            znhVarR.d = new lx0(str, i2, (byte) 15);
        }
    }

    public static final void t(ehc ehcVar, pj9 pj9Var) {
        if (pj9Var instanceof xa3) {
            ehcVar.add(((xa3) pj9Var).a);
            return;
        }
        int i2 = 0;
        if (pj9Var instanceof aj5) {
            ArrayList arrayList = ((aj5) pj9Var).a;
            int size = arrayList.size();
            while (i2 < size) {
                Object obj = arrayList.get(i2);
                i2++;
                t(ehcVar, (eze) obj);
            }
            return;
        }
        if (pj9Var instanceof yn5) {
            return;
        }
        if (pj9Var instanceof qjj) {
            t(ehcVar, ((qjj) pj9Var).a);
            return;
        }
        if (!(pj9Var instanceof i01)) {
            if (pj9Var instanceof qrf) {
                t(ehcVar, ((qrf) pj9Var).b);
                return;
            } else {
                h9o.p();
                return;
            }
        }
        i01 i01Var = (i01) pj9Var;
        t(ehcVar, i01Var.a);
        ArrayList arrayList2 = i01Var.b;
        int size2 = arrayList2.size();
        while (i2 < size2) {
            Object obj2 = arrayList2.get(i2);
            i2++;
            t(ehcVar, (pj9) obj2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object v(fr6 r6, nt5 r7) {
        /*
            boolean r0 = r7 instanceof defpackage.kqa
            if (r0 == 0) goto L13
            r0 = r7
            kqa r0 = (defpackage.kqa) r0
            int r1 = r0.u
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.u = r1
            goto L18
        L13:
            kqa r0 = new kqa
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.t
            px5 r1 = px5.a
            int r2 = r0.u
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L2e
            if (r2 != r3) goto L28
            defpackage.ybh.y(r7)
            goto L4f
        L28:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            qp2.n(r6)
            return r4
        L2e:
            defpackage.ybh.y(r7)
            tna r6 = r6.T()
            java.lang.Class<d44> r7 = d44.class
            s15 r2 = uqh.a(r7)
            cam r7 = uqh.d(r7)     // Catch: java.lang.Throwable -> L40
            goto L41
        L40:
            r7 = r4
        L41:
            x9m r5 = new x9m
            r5.<init>(r2, r7)
            r0.u = r3
            java.lang.Object r7 = r6.b(r5, r0)
            if (r7 != r1) goto L4f
            return r1
        L4f:
            if (r7 == 0) goto L54
            d44 r7 = (d44) r7
            return r7
        L54:
            java.lang.String r6 = "null cannot be cast to non-null type io.ktor.utils.io.ByteReadChannel"
            defpackage.t3p.q(r6)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kfo.v(fr6, nt5):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object w(fr6 r6, java.nio.charset.Charset r7, nt5 r8) {
        /*
            boolean r0 = r8 instanceof defpackage.lqa
            if (r0 == 0) goto L13
            r0 = r8
            lqa r0 = (defpackage.lqa) r0
            int r1 = r0.v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.v = r1
            goto L18
        L13:
            lqa r0 = new lqa
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.u
            px5 r1 = px5.a
            int r2 = r0.v
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L30
            if (r2 != r3) goto L2a
            java.nio.charset.CharsetDecoder r6 = r0.t
            defpackage.ybh.y(r8)
            goto L67
        L2a:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            qp2.n(r6)
            return r4
        L30:
            defpackage.ybh.y(r8)
            tr5 r8 = defpackage.qyn.s(r6)
            if (r8 == 0) goto L3e
            java.nio.charset.Charset r8 = wr5.a(r8)
            goto L3f
        L3e:
            r8 = r4
        L3f:
            if (r8 == 0) goto L42
            r7 = r8
        L42:
            java.nio.charset.CharsetDecoder r7 = r7.newDecoder()
            tna r6 = r6.T()
            java.lang.Class<dwj> r8 = dwj.class
            s15 r2 = uqh.a(r8)
            cam r8 = uqh.d(r8)     // Catch: java.lang.Throwable -> L55
            goto L56
        L55:
            r8 = r4
        L56:
            x9m r5 = new x9m
            r5.<init>(r2, r8)
            r0.t = r7
            r0.v = r3
            java.lang.Object r8 = r6.b(r5, r0)
            if (r8 != r1) goto L66
            return r1
        L66:
            r6 = r7
        L67:
            if (r8 == 0) goto L70
            dwj r8 = (dwj) r8
            java.lang.String r6 = defpackage.z5i.w(r6, r8)
            return r6
        L70:
            java.lang.String r6 = "null cannot be cast to non-null type kotlinx.io.Source"
            defpackage.t3p.q(r6)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kfo.w(fr6, java.nio.charset.Charset, nt5):java.lang.Object");
    }

    public static void x(yy2 yy2Var) {
        int i2 = yy2Var.b;
        if (i2 == 128) {
            return;
        }
        qp2.o("Expected CONTEXT tag but found ".concat(i2 != 64 ? i2 != 128 ? i2 != 192 ? "UNIVERSAL" : "PRIVATE" : "CONTEXT" : "APPLICATION"));
    }

    public static void y(Object obj, String str) {
        if (obj != null) {
            return;
        }
        t3p.q(str);
    }

    public static long[] z(long[]... jArr) {
        long length = 0;
        for (long[] jArr2 : jArr) {
            length += jArr2.length;
        }
        int i2 = (int) length;
        z4o.u(length, length == ((long) i2), "the total number of elements (%s) in the arrays must fit in an int");
        long[] jArr3 = new long[i2];
        int length2 = 0;
        for (long[] jArr4 : jArr) {
            System.arraycopy(jArr4, 0, jArr3, length2, jArr4.length);
            length2 += jArr4.length;
        }
        return jArr3;
    }

    public abstract String C();

    public final void P(osk oskVar, Iterable iterable) {
        if (iterable == null) {
            return;
        }
        wsk wskVarH = oskVar.h(C());
        try {
            for (Object obj : iterable) {
                if (obj != null) {
                    u(wskVarH, obj);
                    wskVarH.n();
                    wskVarH.m();
                }
            }
            fr3.t(wskVarH, null);
        } finally {
        }
    }

    public final void Q(osk oskVar, Object obj) {
        if (obj == null) {
            return;
        }
        wsk wskVarH = oskVar.h(C());
        try {
            u(wskVarH, obj);
            wskVarH.n();
            fr3.t(wskVarH, null);
        } finally {
        }
    }

    public abstract void u(wsk wskVar, Object obj);
}
