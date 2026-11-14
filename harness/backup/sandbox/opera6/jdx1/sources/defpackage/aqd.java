package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.media.session.MediaSession;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.RemoteException;
import android.os.ResultReceiver;
import android.util.SparseBooleanArray;
import java.util.List;

/* loaded from: classes.dex */
public final class aqd extends r22 {
    public static final int w;
    public final vzk e;
    public final npd f;
    public final zy9 g;
    public final ypd h;
    public final ue2 i;
    public final bpd j;
    public final up1 k;
    public final ComponentName l;
    public wpd m;
    public final boolean n = true;
    public volatile int o;
    public ypd p;
    public byte q;
    public final Bundle r;
    public csh s;
    public csh t;
    public o3j u;
    public cig v;

    static {
        w = Build.VERSION.SDK_INT >= 31 ? 33554432 : 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0117  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public aqd(defpackage.npd r10, android.net.Uri r11, android.os.Handler r12, android.os.Bundle r13, csh r14, csh r15, defpackage.o3j r16, defpackage.cig r17, android.os.Bundle r18) {
        /*
            Method dump skipped, instructions count: 307
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aqd.<init>(npd, android.net.Uri, android.os.Handler, android.os.Bundle, csh, csh, o3j, cig, android.os.Bundle):void");
    }

    public static qjd Q(String str, Uri uri, String str2, Bundle bundle) {
        ejd ejdVar = new ejd();
        if (str == null) {
            str = "";
        }
        ejdVar.a = str;
        ua7 ua7Var = new ua7((byte) 23, false);
        ua7Var.b = uri;
        ua7Var.c = str2;
        ua7Var.d = bundle;
        ejdVar.m = new njd(ua7Var);
        return ejdVar.a();
    }

    public static ComponentName U(Context context, String str) {
        PackageManager packageManager = context.getPackageManager();
        Intent intent = new Intent(str);
        intent.setPackage(context.getPackageName());
        List<ResolveInfo> listQueryIntentServices = packageManager.queryIntentServices(intent, 0);
        if (listQueryIntentServices == null || listQueryIntentServices.isEmpty()) {
            return null;
        }
        ServiceInfo serviceInfo = listQueryIntentServices.get(0).serviceInfo;
        return new ComponentName(serviceInfo.packageName, serviceInfo.name);
    }

    public final void A(mid midVar) {
        if (midVar == null) {
            return;
        }
        S(20, new z0c(this, midVar, (byte) 15), this.j.x(), true);
    }

    public final void B() {
        S(11, new opd(this, (byte) 5), this.j.x(), true);
    }

    public final void C(long j) {
        S(5, new tpd(this, j, (byte) 0), this.j.x(), true);
    }

    public final void D(float f) {
        if (f <= 0.0f) {
            return;
        }
        S(13, new uhd(this, f, (byte) 3), this.j.x(), true);
    }

    public final void E(yjh yjhVar) {
        F(yjhVar);
    }

    public final void F(yjh yjhVar) {
        xjh xjhVarC = nac.c(yjhVar);
        if (xjhVarC != null) {
            T(null, 40010, new opd(this, xjhVarC), this.j.x());
            return;
        }
        w7d.K("Ignoring invalid RatingCompat " + yjhVar);
    }

    public final void G(int i) {
        S(15, new ppd(this, i, (byte) 0), this.j.x(), true);
    }

    public final void H(int i) {
        S(14, new ppd(this, i, (byte) 1), this.j.x(), true);
    }

    public final void I() {
        boolean zC = this.f.t.C(9);
        bpd bpdVar = this.j;
        if (zC) {
            S(9, new opd(this, (byte) 10), bpdVar.x(), true);
        } else {
            S(8, new opd(this, (byte) 11), bpdVar.x(), true);
        }
    }

    public final void J() {
        boolean zC = this.f.t.C(7);
        bpd bpdVar = this.j;
        if (zC) {
            S(7, new opd(this, (byte) 3), bpdVar.x(), true);
        } else {
            S(6, new opd(this, (byte) 4), bpdVar.x(), true);
        }
    }

    public final void K(long j) {
        if (j < 0) {
            return;
        }
        S(10, new tpd(this, j, (byte) 1), this.j.x(), true);
    }

    public final void L() {
        S(3, new opd(this, (byte) 8), this.j.x(), true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0057  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.vhg R(defpackage.xkg r38) {
        /*
            Method dump skipped, instructions count: 666
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aqd.R(xkg):vhg");
    }

    public final void S(final int i, final zpd zpdVar, final bqd bqdVar, final boolean z) {
        npd npdVar = this.f;
        if (npdVar.i()) {
            return;
        }
        tym.S(npdVar.l, new Runnable() { // from class: rpd
            @Override // java.lang.Runnable
            public final void run() {
                zpd zpdVar2 = zpdVar;
                aqd aqdVar = this.a;
                npd npdVar2 = aqdVar.f;
                if (npdVar2.i()) {
                    return;
                }
                boolean zIsActive = ((xod) aqdVar.j.b).a.isActive();
                int i2 = i;
                bqd bqdVar2 = bqdVar;
                if (!zIsActive) {
                    StringBuilder sbO = p3p.o(i2, "Ignore incoming player command before initialization. command=", ", pid=");
                    sbO.append(bqdVar2.a.b);
                    w7d.K(sbO.toString());
                    return;
                }
                nod nodVarW = aqdVar.W(bqdVar2);
                if (!aqdVar.e.T(nodVarW, i2)) {
                    if (i2 != 1 || npdVar2.t.getPlayWhenReady()) {
                        return;
                    }
                    w7d.K("Calling play() omitted due to COMMAND_PLAY_PAUSE not being available. If this play command has started the service for instance for playback resumption, this may prevent the service from being started into the foreground.");
                    return;
                }
                kod kodVar = npdVar2.e;
                npdVar2.r(nodVarW);
                kodVar.getClass();
                try {
                    zpdVar2.b(nodVarW);
                } catch (RemoteException e) {
                    w7d.L("Exception in " + nodVarW, e);
                }
                if (z) {
                    new SparseBooleanArray().append(i2, true);
                    npdVar2.o(nodVarW);
                }
            }
        });
    }

    public final void T(final n3j n3jVar, final int i, final zpd zpdVar, final bqd bqdVar) {
        tym.S(this.f.l, new Runnable() { // from class: spd
            @Override // java.lang.Runnable
            public final void run() {
                zpd zpdVar2 = zpdVar;
                aqd aqdVar = this.a;
                if (aqdVar.f.i()) {
                    return;
                }
                boolean zIsActive = ((xod) aqdVar.j.b).a.isActive();
                n3j n3jVar2 = n3jVar;
                char c = i;
                bqd bqdVar2 = bqdVar;
                if (!zIsActive) {
                    StringBuilder sb = new StringBuilder("Ignore incoming session command before initialization. command=");
                    sb.append(n3jVar2 == null ? Integer.valueOf(c) : n3jVar2.b);
                    sb.append(", pid=");
                    sb.append(bqdVar2.a.b);
                    w7d.K(sb.toString());
                    return;
                }
                nod nodVarW = aqdVar.W(bqdVar2);
                vzk vzkVar = aqdVar.e;
                if (n3jVar2 != null) {
                    if (!vzkVar.V(nodVarW, n3jVar2)) {
                        return;
                    }
                } else if (!vzkVar.U(nodVarW, c)) {
                    return;
                }
                try {
                    zpdVar2.b(nodVarW);
                } catch (RemoteException e) {
                    w7d.L("Exception in " + nodVarW, e);
                }
            }
        });
    }

    public final void V(qjd qjdVar, boolean z, boolean z2) {
        S(31, new oid(this, qjdVar, z, z2), this.j.x(), false);
    }

    public final nod W(bqd bqdVar) {
        nod nodVarI = this.e.I(bqdVar);
        if (nodVarI == null) {
            nod nodVar = new nod(bqdVar, 0, 0, this.g.M(bqdVar), new xpd(bqdVar), Bundle.EMPTY);
            lod lodVarL = this.f.l(nodVar);
            this.e.e(bqdVar, nodVar, lodVarL.a, lodVarL.b);
            npd npdVar = this.f;
            if (!npdVar.x || !npd.j(nodVar)) {
                npdVar.e.getClass();
            }
            nodVarI = nodVar;
        }
        ue2 ue2Var = this.i;
        long j = this.o;
        ue2Var.removeMessages(1001, nodVarI);
        ue2Var.sendMessageDelayed(ue2Var.obtainMessage(1001, nodVarI), j);
        return nodVarI;
    }

    public final void X() {
        boolean z;
        csh cshVarH = vb5.h(vb5.e(this.t, this.u, this.v), true, true);
        this.s = cshVarH;
        boolean z2 = false;
        int i = 0;
        while (true) {
            if (i >= cshVarH.d) {
                z = false;
                break;
            } else {
                if (((vb5) cshVarH.get(i)).h.d(0) == 2) {
                    z = true;
                    break;
                }
                i++;
            }
        }
        Bundle bundle = this.r;
        bundle.putBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_PREVIOUS", !z);
        csh cshVar = this.s;
        int i2 = 0;
        while (true) {
            if (i2 >= cshVar.d) {
                break;
            }
            if (((vb5) cshVar.get(i2)).h.d(0) == 3) {
                z2 = true;
                break;
            }
            i2++;
        }
        bundle.putBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_NEXT", !z2);
    }

    public final void Y(xkg xkgVar) {
        tym.S(this.f.l, new qpd(this, xkgVar, (byte) 0));
    }

    public final void j(mid midVar) {
        if (midVar != null) {
            S(20, new so4(this, midVar, -1, (byte) 8), this.j.x(), false);
        }
    }

    public final void k(mid midVar, int i) {
        if (midVar != null) {
            if (i == -1 || i >= 0) {
                S(20, new so4(this, midVar, i, (byte) 8), this.j.x(), false);
            }
        }
    }

    public final void m(String str, Bundle bundle, ResultReceiver resultReceiver) {
        if (str.equals("androidx.media3.session.SESSION_COMMAND_MEDIA3_PLAY_REQUEST")) {
            return;
        }
        if (!str.equals("androidx.media3.session.SESSION_COMMAND_REQUEST_SESSION3_TOKEN") || resultReceiver == null) {
            n3j n3jVar = new n3j(str, Bundle.EMPTY);
            T(n3jVar, 0, new a32(this, n3jVar, bundle, resultReceiver), this.j.x());
            return;
        }
        m4j m4jVar = this.f.j;
        m4jVar.getClass();
        Bundle bundle2 = new Bundle();
        n4j n4jVar = m4jVar.a;
        bundle2.putInt(m4j.b, 0);
        String str2 = m4j.c;
        Bundle bundle3 = new Bundle();
        bundle3.putInt(n4j.h, n4jVar.a);
        bundle3.putInt(n4j.i, 0);
        bundle3.putInt(n4j.j, n4jVar.b);
        bundle3.putString(n4j.k, n4jVar.d);
        bundle3.putString(n4j.l, "");
        bundle3.putBinder(n4j.n, n4jVar.e);
        bundle3.putParcelable(n4j.m, null);
        bundle3.putBundle(n4j.o, n4jVar.f);
        bundle3.putInt(n4j.p, n4jVar.c);
        MediaSession.Token token = n4jVar.g;
        if (token != null) {
            bundle3.putParcelable(n4j.q, token);
        }
        bundle2.putBundle(str2, bundle3);
        resultReceiver.send(0, bundle2);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0066  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void n(java.lang.String r6, android.os.Bundle r7) {
        /*
            r5 = this;
            java.lang.String r0 = "androidx.media3.session.SESSION_COMMAND_MEDIA3_PLAY_REQUEST"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L9
            return
        L9:
            if (r7 != 0) goto Ld
            android.os.Bundle r7 = android.os.Bundle.EMPTY
        Ld:
            n3j r0 = new n3j
            r0.<init>(r6, r7)
            boolean r1 = defpackage.vb5.k(r6)
            bpd r2 = r5.j
            r3 = 0
            if (r1 == 0) goto Lb0
            vb5 r7 = defpackage.vb5.b(r0)     // Catch: java.lang.RuntimeException -> L9b
            int r0 = r7.b
            java.lang.Object r1 = r7.j
            boolean r4 = r7.a()
            if (r4 != 0) goto L33
            java.lang.String r5 = "Can't execute predefined custom command: "
            java.lang.String r5 = r5.concat(r6)
            defpackage.w7d.K(r5)
            return
        L33:
            n3j r6 = r7.a
            r4 = 1
            if (r6 == 0) goto L56
            int r6 = r6.a
            r7 = 40010(0x9c4a, float:5.6066E-41)
            if (r6 != r7) goto L40
            r3 = r4
        L40:
            defpackage.z4o.H(r3)
            r1.getClass()
            xjh r1 = (defpackage.xjh) r1
            opd r6 = new opd
            r6.<init>(r5, r1)
            bqd r0 = r2.x()
            r1 = 0
            r5.T(r1, r7, r6, r0)
            return
        L56:
            npd r6 = r5.f
            xkg r6 = r6.t
            if (r0 != r4) goto L66
            if (r1 != 0) goto L68
            boolean r6 = r6.getPlayWhenReady()
            if (r6 != 0) goto L66
            r6 = r4
            goto L6f
        L66:
            r6 = r3
            goto L6f
        L68:
            r6 = r1
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
        L6f:
            if (r6 == 0) goto L7f
            opd r6 = new opd
            r7 = 6
            r6.<init>(r5, r7)
            bqd r7 = r2.x()
            r5.S(r4, r6, r7, r3)
            return
        L7f:
            r6 = 31
            if (r0 != r6) goto L8c
            r1.getClass()
            qjd r1 = (defpackage.qjd) r1
            r5.V(r1, r3, r3)
            return
        L8c:
            z0c r6 = new z0c
            r1 = 16
            r6.<init>(r5, r7, r1)
            bqd r7 = r2.x()
            r5.S(r0, r6, r7, r4)
            return
        L9b:
            r5 = move-exception
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = "Failed to convert predefined custom command: "
            r6.<init>(r7)
            java.lang.String r7 = r0.b
            r6.append(r7)
            java.lang.String r6 = r6.toString()
            defpackage.w7d.L(r6, r5)
            return
        Lb0:
            opd r6 = new opd
            r6.<init>(r5, r0, r7)
            bqd r7 = r2.x()
            r5.T(r0, r3, r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aqd.n(java.lang.String, android.os.Bundle):void");
    }

    public final void o() {
        S(12, new opd(this, (byte) 0), this.j.x(), true);
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00ea  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean q(android.content.Intent r12) {
        /*
            Method dump skipped, instructions count: 270
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aqd.q(android.content.Intent):boolean");
    }

    public final void r() {
        S(1, new opd(this, (byte) 12), this.j.x(), true);
    }

    public final void s() {
        S(1, new opd(this, (byte) 6), this.j.x(), false);
    }

    public final void t(String str, Bundle bundle) {
        V(Q(str, null, null, bundle), true, true);
    }

    public final void u(String str, Bundle bundle) {
        V(Q(null, null, str, bundle), true, true);
    }

    public final void v(Uri uri, Bundle bundle) {
        V(Q(null, uri, null, bundle), true, true);
    }

    public final void w() {
        S(2, new opd(this, (byte) 7), this.j.x(), true);
    }

    public final void x(String str, Bundle bundle) {
        V(Q(str, null, null, bundle), true, false);
    }

    public final void y(String str, Bundle bundle) {
        V(Q(null, null, str, bundle), true, false);
    }

    public final void z(Uri uri, Bundle bundle) {
        V(Q(null, uri, null, bundle), true, false);
    }
}
