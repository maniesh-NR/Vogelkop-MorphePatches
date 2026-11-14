package defpackage;

import J.N;
import android.app.NotificationManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.net.Uri;
import android.net.VpnService;
import android.text.TextUtils;
import android.util.Pair;
import com.leanplum.internal.Constants;
import com.opera.android.BrowserActivity;
import com.opera.android.OperaApplication;
import com.opera.android.settings.SettingsManager;
import com.opera.android.vpn.VpnFailedToConnectService;
import com.opera.api.Callback;
import java.util.ArrayList;
import java.util.Collections;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import org.chromium.net.GURLUtils;
import org.chromium.net.NetworkChangeNotifier;

/* loaded from: classes.dex */
public final class ydn implements w6f {
    public final xdn A;
    public boolean B;
    public final j25 C;
    public final x53 D;
    public final EnumSet E;
    public ren F;
    public int G;
    public byte H;
    public efn I;
    public int J;
    public boolean K;
    public pt3 L;
    public Callback M;
    public fdn N;
    public final ktf O;
    public w7j P;
    public byte Q;
    public rle R;
    public int S;
    public boolean T;
    public wdn a;
    public final w7j b;
    public final gfn c;
    public vdn d = new vdn(false, false, null, null);
    public final sgi e;
    public final qq8 f;
    public final i9c g;
    public boolean h;
    public BrowserActivity i;
    public long j;
    public final rdn k;
    public final Context l;
    public final SettingsManager m;
    public final umi n;
    public final ufn o;
    public final tvg p;
    public final jtg q;
    public final wv1 r;
    public final cnk s;
    public final h7f t;
    public final h7f u;
    public final HashSet v;
    public final HashSet w;
    public final HashSet x;
    public final kv1 y;
    public final vy z;

    public ydn(Context context, SettingsManager settingsManager, umi umiVar, mgh mghVar, db dbVar, zv9 zv9Var, ufn ufnVar, tvg tvgVar, jtg jtgVar, wv1 wv1Var, jg8 jg8Var) {
        gfn acoVar;
        byte b = 0;
        rdn rdnVar = new rdn(this, (byte) 6);
        this.k = rdnVar;
        this.t = new h7f();
        this.u = new h7f();
        this.v = new HashSet();
        this.w = new HashSet();
        this.x = new HashSet();
        this.y = new kv1(this, (byte) 5);
        this.z = new vy(this, (byte) 9);
        this.A = new xdn(this);
        this.C = new j25(this, (byte) 8);
        this.D = new x53(this);
        this.E = EnumSet.noneOf(hfn.class);
        new ArrayList(5);
        this.G = 4;
        this.Q = (byte) 0;
        this.S = 0;
        ru9 ru9VarC = ru9.c(context);
        boolean z = ru9VarC.a.getBoolean("vpn.enabled", false);
        byte b2 = 1;
        if (z) {
            nv6 nv6VarB = ru9VarC.b();
            SharedPreferences.Editor editor = (SharedPreferences.Editor) nv6VarB.a;
            editor.putBoolean("vpn.enabled", false);
            editor.putBoolean("vpn.auto_enable_on_start", true);
            nv6VarB.w();
            vml.d(rdnVar, 3000L);
        }
        Context applicationContext = context.getApplicationContext();
        this.l = applicationContext;
        this.O = new ktf(umiVar);
        this.m = settingsManager;
        this.n = umiVar;
        this.o = ufnVar;
        this.p = tvgVar;
        this.q = jtgVar;
        this.r = wv1Var;
        this.f = new qq8(applicationContext, this);
        this.s = new cnk(context, umiVar, mghVar);
        w7j w7jVar = new w7j();
        w7jVar.d = new nrl((byte) 26);
        this.b = w7jVar;
        z4k z4kVar = new z4k((Object) this, (byte) 12);
        if (w7jVar.b != null || w7jVar.h(applicationContext)) {
            acoVar = (gfn) mzg.j(w7jVar.b, "createStateBuilder", new Class[]{Context.class, ffn.class, zv9.class, dx5.class}, new Object[]{applicationContext, z4kVar, zv9Var, jg8Var});
        } else {
            acoVar = new aco(w7jVar, applicationContext, z4kVar, zv9Var, jg8Var);
            w7jVar.a = acoVar;
        }
        this.c = acoVar;
        vdn vdnVar = new vdn(applicationContext, acoVar.e());
        rdn rdnVar2 = new rdn(this, b);
        rdn rdnVar3 = new rdn(this, b2);
        sgi sgiVar = new sgi();
        sgiVar.b = 0;
        sgiVar.f = new ssi(sgiVar, (byte) 23);
        sgiVar.g = new ngn(sgiVar);
        sgiVar.i = new se3(sgiVar);
        sgiVar.e = rdnVar2;
        sgiVar.h = rdnVar3;
        this.e = sgiVar;
        c(vdnVar);
        if (z && acoVar.isEnabled() && acoVar.l()) {
            a();
            f();
        }
        this.g = new i9c(ru9VarC, dbVar, this);
        this.B = ru9.c(applicationContext).a.getBoolean("vpn.bypass_for_search", true);
    }

    @Override // defpackage.w6f
    /* renamed from: A, reason: merged with bridge method [inline-methods] */
    public final void H(tdn tdnVar) {
        this.t.c(tdnVar);
    }

    public final void B() {
        vdn vdnVar = this.d;
        if (vdnVar.b != null) {
            e();
        } else if (vdnVar.a) {
            f();
        }
        boolean z = this.d.a;
        this.e.I(m(), z);
        v();
    }

    public final void C(boolean z) {
        qq8 qq8Var = this.f;
        boolean z2 = qq8Var.g() && this.d.a == z;
        qq8Var.n(0L);
        vdn vdnVar = this.d;
        if (z2) {
            c(vdnVar);
            return;
        }
        if (z != vdnVar.a) {
            this.G = 4;
            boolean zB = vdnVar.b();
            boolean z3 = p().a && z;
            gfn gfnVar = this.c;
            I(new vdn(z3, gfnVar.isEnabled() ? false : zB, null, null));
            if (gfnVar.isEnabled()) {
                if (this.d.a) {
                    f();
                } else {
                    this.n.a(new koj((byte) 8)).a(null);
                    gfnVar.i();
                }
            }
        }
    }

    public final void D(boolean z) {
        boolean zB = this.d.b();
        vdn vdnVar = this.d;
        efn efnVar = vdnVar.b;
        hfn hfnVar = vdnVar.c;
        boolean z2 = p().a && z;
        if (this.c.isEnabled()) {
            zB = false;
        }
        I(new vdn(z2, zB, efnVar, hfnVar));
    }

    public final void E(boolean z) {
        rle rleVar;
        this.T = z;
        boolean zA = z & p().a();
        gfn gfnVar = this.c;
        boolean z2 = zA && !gfnVar.isEnabled();
        gfnVar.setEnabled(zA).d();
        if (z2) {
            c(this.d);
        } else if (!zA && (rleVar = this.R) != null) {
            NetworkChangeNotifier.removeConnectionTypeObserver(rleVar.a);
            this.R = null;
        }
        if (this.d.a) {
            f();
        }
    }

    public final void G(List list) {
        HashSet hashSet = this.v;
        hashSet.clear();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            eri eriVar = (eri) it.next();
            if (!eriVar.d()) {
                String origin = GURLUtils.getOrigin(eriVar.a(2, p6l.a, ""));
                if (origin.contains("google") || origin.contains("yandex")) {
                    hashSet.add(origin);
                }
            }
        }
        hashSet.add("https://www.google.com/");
        hashSet.add("https://yandex.ru/");
        hashSet.add("https://yandex.com/");
        hashSet.add("https://yandex.com.tr/");
        N();
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0071, code lost:
    
        if (r0 != 1) goto L30;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void I(defpackage.vdn r11) {
        /*
            r10 = this;
            vdn r0 = r10.d
            boolean r0 = r11.equals(r0)
            boolean r1 = r11.a
            if (r0 == 0) goto Lb
            return
        Lb:
            gfn r0 = r10.c
            r2 = 0
            if (r1 == 0) goto L20
            boolean r3 = r0.isEnabled()
            if (r3 != 0) goto L20
            com.opera.android.settings.SettingsManager r3 = r10.m
            java.lang.String r4 = "compression"
            r3.V(r2, r4)
            r10.s()
        L20:
            boolean r3 = r11.a()
            android.content.Context r4 = r10.l
            if (r3 == 0) goto L40
            ru9 r3 = defpackage.ru9.c(r4)
            nv6 r3 = r3.b()
            long r5 = java.lang.System.currentTimeMillis()
            java.lang.Object r7 = r3.a
            android.content.SharedPreferences$Editor r7 = (android.content.SharedPreferences.Editor) r7
            java.lang.String r8 = "vpn.enabled.timestamp.normal"
            r7.putLong(r8, r5)
            r3.w()
        L40:
            if (r1 == 0) goto La4
            boolean r0 = r0.isEnabled()
            if (r0 == 0) goto La4
            ru9 r0 = defpackage.ru9.c(r4)
            android.content.SharedPreferences r3 = r0.a
            java.lang.String r5 = "vpn.vpnpro_first_enable_timestamp"
            r6 = 0
            long r8 = r3.getLong(r5, r6)
            int r3 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r3 != 0) goto L6c
            nv6 r0 = r0.b()
            long r6 = java.lang.System.currentTimeMillis()
            java.lang.Object r3 = r0.a
            android.content.SharedPreferences$Editor r3 = (android.content.SharedPreferences.Editor) r3
            r3.putLong(r5, r6)
            r0.w()
        L6c:
            byte r0 = r10.Q
            r3 = 1
            if (r0 == 0) goto L74
            if (r0 == r3) goto La4
            goto La0
        L74:
            w7j r0 = r10.b
            java.lang.Object r5 = r0.b
            if (r5 == 0) goto L97
            java.lang.Class<android.content.Context> r6 = android.content.Context.class
            java.lang.Class[] r6 = new java.lang.Class[]{r6}
            java.lang.Object r0 = r0.c
            android.content.Context r0 = (android.content.Context) r0
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            java.lang.String r7 = "init"
            java.lang.Object r0 = mzg.j(r5, r7, r6, r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            java.lang.Boolean r5 = java.lang.Boolean.TRUE
            boolean r0 = kotlin.jvm.internal.Intrinsics.a(r0, r5)
            goto L98
        L97:
            r0 = r2
        L98:
            if (r0 == 0) goto L9d
            r10.Q = r3
            goto La4
        L9d:
            r11 = 3
            r10.Q = r11
        La0:
            r10.C(r2)
            return
        La4:
            ru9 r0 = defpackage.ru9.c(r4)
            nv6 r0 = r0.b()
            java.lang.Object r2 = r0.a
            android.content.SharedPreferences$Editor r2 = (android.content.SharedPreferences.Editor) r2
            java.lang.String r3 = "vpn.enabled"
            r2.putBoolean(r3, r1)
            esk r1 = r11.d
            java.lang.Object r1 = r1.get()
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            java.lang.String r3 = "vpn.enable_only_in_incognito"
            r2.putBoolean(r3, r1)
            r0.w()
            r10.c(r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ydn.I(vdn):void");
    }

    public final void J(wdn wdnVar) {
        String[] strArr;
        wdn wdnVar2 = this.a;
        boolean z = (wdnVar2 == null || wdnVar2.b == wdnVar.b) ? false : true;
        this.a = wdnVar;
        if (this.h && (strArr = wdnVar.f) != null) {
            N.M0qbH6jH(strArr);
        }
        boolean zA = this.a.a();
        gfn gfnVar = this.c;
        if (!zA && gfnVar.isEnabled()) {
            gfnVar.setEnabled(false).d();
        }
        vdn vdnVar = new vdn(this.l, null);
        boolean z2 = p().a && vdnVar.a;
        vdn vdnVar2 = new vdn(z2, gfnVar.isEnabled() ? false : vdnVar.b(), vdnVar.b, null);
        if (z2) {
            gfnVar.g(new iyk(this, vdnVar2, (byte) 7));
        } else {
            I(vdnVar2);
        }
        if (z) {
            h7f h7fVar = this.t;
            g7f g7fVarH = am2.h(h7fVar, h7fVar);
            while (g7fVarH.hasNext()) {
                ((tdn) g7fVarH.next()).C();
            }
        }
        h7f h7fVar2 = this.u;
        g7f g7fVarH2 = am2.h(h7fVar2, h7fVar2);
        while (g7fVarH2.hasNext()) {
            ((gen) g7fVarH2.next()).a.p();
        }
    }

    public final void K(long j, long j2, String str, String str2) {
        xdn xdnVar = this.A;
        if (!TextUtils.equals(str, xdnVar.a) || !TextUtils.equals(str2, xdnVar.b) || j != xdnVar.c || j2 != xdnVar.e) {
            xdnVar.a = str;
            xdnVar.b = str2;
            xdnVar.c = j;
            long j3 = xdnVar.e;
            if (j3 <= 0 || j2 <= j3) {
                xdnVar.d = j;
            } else {
                xdnVar.d = 0L;
                j = 0;
            }
            xdnVar.e = j2;
            gfn gfnVar = xdnVar.f.c;
            String[] strArr = aik.a;
            gfnVar.a(j, str, str2).d();
        }
        if (this.d.a) {
            f();
        }
    }

    public final boolean M() {
        long j = ru9.c(this.l).a.getLong("vpn.enabled.timestamp.normal", 0L);
        return (!this.d.a() || this.c.isEnabled() || j == 0 || p().d == 0 || (System.currentTimeMillis() - j) / 60000 <= ((long) p().d)) ? false : true;
    }

    public final void N() {
        HashSet hashSet = this.x;
        hashSet.clear();
        if (this.B) {
            hashSet.addAll(this.v);
        }
        hashSet.addAll(this.w);
        if (this.h) {
            String[] strArr = (String[]) hashSet.toArray(new String[0]);
            N.Mdwnoz2p(true, strArr);
            N.Mdwnoz2p(false, strArr);
        }
    }

    public final void O() {
        if (this.h) {
            if (!this.d.a || !this.c.isEnabled()) {
                N.MUrl7l94();
                return;
            }
            if (this.S == 6) {
                N.MWux_skv();
            } else if (this.G != 2 || this.d.b == null) {
                N.MVR91nie();
            } else {
                N.M3qiiNOP();
            }
        }
    }

    public final void a() {
        if (this.R == null) {
            this.S = sle.c();
            this.R = sle.a(new fpk(this, (byte) 2));
        }
    }

    @Override // defpackage.w6f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final void F(tdn tdnVar) {
        this.t.b(tdnVar);
    }

    public final void c(vdn vdnVar) {
        this.d = vdnVar;
        e();
        boolean z = this.d.a;
        this.e.I(m(), z);
        v();
    }

    public final void e() {
        ren renVar;
        boolean z = this.h;
        gfn gfnVar = this.c;
        byte b = 0;
        if (z) {
            N.MHNaH9Gd(true, this.d.a && !gfnVar.isEnabled());
            N.MHNaH9Gd(false, this.d.a() && !gfnVar.isEnabled());
            O();
        }
        if (this.d.a && gfnVar.isEnabled()) {
            a();
        } else {
            rle rleVar = this.R;
            if (rleVar != null) {
                NetworkChangeNotifier.removeConnectionTypeObserver(rleVar.a);
                this.R = null;
            }
        }
        vdn vdnVar = this.d;
        efn efnVar = vdnVar.b;
        byte b2 = 4;
        Context context = this.l;
        w7j w7jVar = this.b;
        if (efnVar == null || !vdnVar.a) {
            this.I = null;
            ren renVar2 = this.F;
            byte b3 = 3;
            if (renVar2 != null) {
                renVar2.a(new rdn(this, b3));
                this.F.d(null);
            }
            if (!gfnVar.isEnabled() || !this.f.g()) {
                NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
                w7jVar.getClass();
                notificationManager.cancel(420);
                VpnFailedToConnectService.c.c0(context);
            }
            int i = this.G;
            if (i == 0 || i == 3) {
                return;
            }
            this.G = 4;
            return;
        }
        byte b4 = 2;
        if (efnVar.equals(this.I) && (renVar = this.F) != null && renVar.c() == 2) {
            if (this.G != 2) {
                y(this.F);
                return;
            }
            return;
        }
        if (this.F == null) {
            u7k u7kVar = new u7k(this);
            sdn sdnVar = new sdn(this, b4);
            Object obj = w7jVar.b;
            ren renVar3 = obj != null ? (ren) mzg.j(obj, "createManager", new Class[]{Context.class, qen.class, Callback.class}, new Object[]{context, u7kVar, sdnVar}) : null;
            this.F = renVar3;
            if (renVar3 == null) {
                ((nrl) w7jVar.d).d(new rdn(this, b2));
                return;
            }
        }
        w7j w7jVar2 = this.P;
        if (w7jVar2 != null && yi4.T((sz4) w7jVar2.b)) {
            this.P.n(new sdn(this, b));
            return;
        }
        this.J = 0;
        this.F.d(new sdn(this, b4));
        this.G = 1;
        this.F.f(this.d.b);
        this.I = this.d.b;
    }

    public final void f() {
        gfn gfnVar = this.c;
        byte b = 1;
        if (gfnVar.isEnabled()) {
            if (this.S == 6) {
                this.G = 3;
                return;
            } else if (this.G != 2) {
                this.G = 1;
            }
        }
        gfnVar.g(new sdn(this, b));
    }

    public final void g() {
        efn efnVar;
        if (this.c.isEnabled() && (efnVar = this.d.b) != null && this.G == 2) {
            ktf ktfVar = this.O;
            if (efnVar == ktfVar.d || efnVar == ktfVar.c) {
                return;
            }
            ktfVar.a(efnVar, new rdn(this, (byte) 5));
        }
    }

    public final fdn h(String str) {
        String str2;
        String lowerCase = str.toLowerCase(Locale.ROOT);
        Resources resources = this.l.getResources();
        int iHashCode = lowerCase.hashCode();
        if (iHashCode == 3116) {
            if (lowerCase.equals("am")) {
                return fdn.a(lowerCase, str, resources.getString(2132022168), 2131232583, pt0.c);
            }
            return null;
        }
        if (iHashCode == 3122) {
            if (lowerCase.equals("as")) {
                return fdn.a(lowerCase, str, resources.getString(2132022169), 2131232584, pt0.d);
            }
            return null;
        }
        if (iHashCode == 3248) {
            if (lowerCase.equals("eu")) {
                return fdn.a(lowerCase, str, resources.getString(2132022170), 2131232585, pt0.e);
            }
            return null;
        }
        if (iHashCode == 3459) {
            str2 = "lo";
        } else {
            if (iHashCode != 3711) {
                if (iHashCode == 1544803905 && lowerCase.equals("default")) {
                    return n();
                }
                return null;
            }
            str2 = "ts";
        }
        lowerCase.equals(str2);
        return null;
    }

    public final fdn i() {
        wdn wdnVar;
        gfn gfnVar = this.c;
        if (!gfnVar.isEnabled() || ((wdnVar = this.a) != null && wdnVar.c)) {
            fdn fdnVarH = h((String) N.MncQv8HY());
            return fdnVarH == null ? n() : fdnVarH;
        }
        if (this.N == null) {
            Pair pairH = gfnVar.h(this.s.a(gfnVar.k()));
            if (pairH == null) {
                this.N = o();
            } else {
                fdn fdnVarA = ((bnk) pairH.first).a();
                this.N = fdnVarA;
                if (pairH.second != null) {
                    Iterator it = Collections.unmodifiableList(fdnVarA.g).iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        fdn fdnVar = (fdn) it.next();
                        if (fdnVar.c.equals(pairH.second)) {
                            this.N = fdnVar;
                            break;
                        }
                    }
                }
            }
        }
        return this.N;
    }

    public final int j() {
        efn efnVar;
        return (!this.c.isEnabled() || (efnVar = this.d.b) == null) ? i().i : vtp.K(0, efnVar.a().toLowerCase(Locale.ROOT));
    }

    public final String k() {
        gfn gfnVar = this.c;
        if (gfnVar.isEnabled() && this.d.a) {
            cnk cnkVar = this.s;
            if (gfnVar.f(cnkVar.a(null)) != null) {
                return gfnVar.f(cnkVar.a(null));
            }
        }
        return i().c;
    }

    public final String l() {
        String str;
        boolean z = i().j;
        Context context = this.l;
        String string = z ? context.getString(2132022145) : context.getString(2132022171);
        if (!this.c.isEnabled() || !this.d.a) {
            return string;
        }
        g();
        ktf ktfVar = this.O;
        return (ktfVar.d != this.d.b || (str = ktfVar.e) == null) ? context.getString(2132022284) : str;
    }

    public final int m() {
        if (this.c.isEnabled()) {
            return this.G;
        }
        if (this.h) {
            int iMD91vZjl = N.MD91vZjl();
            int i = 1;
            if (iMD91vZjl != 1) {
                i = 2;
                if (iMD91vZjl != 2) {
                    i = 3;
                    if (iMD91vZjl != 3) {
                        if (iMD91vZjl != 4) {
                            return 0;
                        }
                    }
                }
            }
            return i;
        }
        return 4;
    }

    public final fdn n() {
        return fdn.a(null, "DEFAULT", this.l.getResources().getString(2132021551), 2131232586, pt0.b);
    }

    public final fdn o() {
        return new fdn(null, "DEFAULT", this.l.getResources().getString(2132021551), pt0.f, false, 2131232107, 0, null, true);
    }

    public final wdn p() {
        wdn wdnVar = this.a;
        if (wdnVar != null) {
            return wdnVar;
        }
        wdn wdnVar2 = new wdn(this);
        this.a = wdnVar2;
        return wdnVar2;
    }

    public final int q() {
        return this.e.d(this.d.a);
    }

    public final int r() {
        return this.e.d(this.d.a());
    }

    public final void s() {
        aco acoVar;
        w7j w7jVar = this.b;
        if (w7jVar.b == null && (acoVar = (aco) w7jVar.a) != null && acoVar.e == null && acoVar.i) {
            acoVar.n();
        }
    }

    public final boolean t(String str) {
        if (this.c.isEnabled()) {
            return false;
        }
        String scheme = Uri.parse(str).getScheme();
        if ("file".equals(scheme) || Constants.Params.DATA.equals(scheme) || "content".equals(scheme) || wqm.A(str) || wqm.w(str) || str.startsWith("market://") || z5i.a0(str)) {
            return false;
        }
        if (N.MpNM_Rhp(str)) {
            return N.Mv_y608q(true, str);
        }
        return true;
    }

    public final void u() {
        ru9 ru9VarC = ru9.c(this.l);
        if (ru9VarC.a.getBoolean("vpn.auto_enable_on_start", false)) {
            nv6 nv6VarB = ru9VarC.b();
            ((SharedPreferences.Editor) nv6VarB.a).putBoolean("vpn.auto_enable_on_start", false);
            nv6VarB.w();
            C(true);
        }
    }

    public final void v() {
        h7f h7fVar = this.t;
        g7f g7fVarH = am2.h(h7fVar, h7fVar);
        while (g7fVarH.hasNext()) {
            ((tdn) g7fVarH.next()).s();
        }
    }

    public final void x(pt3 pt3Var, qim qimVar, w7j w7jVar, BrowserActivity browserActivity) {
        aco acoVar;
        this.i = browserActivity;
        cnk cnkVar = this.s;
        Objects.requireNonNull(cnkVar);
        xmk xmkVar = new xmk(cnkVar, (byte) 1);
        avj avjVar = cak.d;
        avj.g(4, xmkVar);
        i9c i9cVar = this.g;
        i9cVar.f = qimVar;
        i9cVar.c();
        this.L = pt3Var;
        this.P = w7jVar;
        String[] strArr = OperaApplication.K;
        Context context = this.l;
        q6e q6eVarI = ((OperaApplication) context.getApplicationContext()).I();
        q6eVarI.F(this.y);
        G(Collections.unmodifiableList(q6eVarI.a));
        ufn ufnVar = this.o;
        vy vyVar = this.z;
        ufnVar.F(vyVar);
        this.p.F(vyVar);
        this.m.F(this.C);
        ru9.c(context).a(this.D);
        z();
        tcc lifecycle = browserActivity.getLifecycle();
        w7j w7jVar2 = this.b;
        if (w7jVar2.b == null && (acoVar = (aco) w7jVar2.a) != null) {
            acoVar.o(lifecycle);
        }
        s();
        if (this.c.isEnabled()) {
            if (this.I != null) {
                w7j w7jVar3 = this.P;
                if (w7jVar3 != null && yi4.T((sz4) w7jVar3.b)) {
                    this.P.n(new sdn(this, (byte) 0));
                }
            } else if (this.H == 1) {
                e();
            }
        }
        u();
    }

    public final void y(ren renVar) {
        int i;
        int i2;
        int iC = this.F.c();
        this.G = iC;
        if (iC == 6) {
            xdn xdnVar = this.A;
            long j = xdnVar.d;
            long j2 = xdnVar.c;
            if (j != j2) {
                xdnVar.d = j2;
                gfn gfnVar = xdnVar.f.c;
                String str = xdnVar.a;
                String[] strArr = aik.a;
                if (str == null) {
                    str = "";
                }
                String str2 = xdnVar.b;
                gfnVar.a(j2, str, str2 != null ? str2 : "").d();
            }
        }
        if (this.K) {
            this.K = false;
            if (this.G == 3) {
                this.J = 0;
            }
        }
        O();
        efn efnVar = this.d.b;
        byte b = 1;
        Context context = this.l;
        boolean z = efnVar != null && ((i2 = this.G) == 0 || i2 == 6) && VpnService.prepare(context) == null;
        bp bpVar = VpnFailedToConnectService.c;
        if (z) {
            bpVar.b0(context);
        } else {
            bpVar.c0(context);
        }
        efn efnVar2 = this.d.b;
        byte b2 = 8;
        umi umiVar = this.n;
        if (efnVar2 == null || !((i = this.G) == 0 || i == 3)) {
            int i3 = this.G;
            byte b3 = 5;
            if (i3 == 2) {
                umiVar.a(new koj(b2)).a(null);
                ktf ktfVar = this.O;
                if (ktfVar.f != null) {
                    ktfVar.a(this.d.b, new rdn(this, b3));
                }
            } else if (i3 == 5 && this.S != 6) {
                C(false);
                return;
            }
        } else if (this.S != 6) {
            umiVar.a(new koj(b2)).a(null);
            gfn gfnVar2 = this.c;
            if (gfnVar2.j()) {
                this.G = 3;
                gfnVar2.g(new sdn(this, b));
                return;
            }
        }
        int i4 = this.G;
        if (i4 == 0 || i4 == 6) {
            if (this.S == 6) {
                this.J = -73;
            } else {
                sen senVarE = renVar.e();
                if (senVarE != null) {
                    this.J = senVarE.a;
                    this.K = senVarE.b;
                } else {
                    this.J = 0;
                }
            }
        }
        this.e.I(this.G, this.d.a);
        v();
    }

    public final void z() {
        if (this.h && this.j == 0) {
            boolean z = this.d.a;
            this.e.I(m(), z);
            this.j = N.MIX3UmS0(new rdn(this, (byte) 2));
        }
    }
}
