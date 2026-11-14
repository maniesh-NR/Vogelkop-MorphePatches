package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import com.usercentrics.sdk.UsercentricsOptions;
import com.usercentrics.sdk.UsercentricsReadyStatus;
import com.usercentrics.sdk.UsercentricsServiceConsent;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class r65 {
    public static final long v;
    public static final long w;
    public static final long x;
    public static final long y;
    public static final /* synthetic */ int z = 0;
    public final Context a;
    public final vx b;
    public final jv1 c;
    public final wv1 d;
    public final wv1 e;
    public final d7h f;
    public final umi g;
    public final ru9 h;
    public final f1p i;
    public final tw2 j;
    public final q65 k;
    public boolean l;
    public Boolean m;
    public String n;
    public UsercentricsReadyStatus o;
    public UsercentricsOptions p;
    public fwm q;
    public rn9 r;
    public boolean s;
    public yim t;
    public final zyk u;

    static {
        on7 on7Var = pn7.b;
        v = cs5.x0(15, un7.e);
        un7 un7Var = un7.h;
        w = pn7.f(cs5.x0(365, un7Var));
        x = pn7.f(cs5.x0(7, un7Var));
        y = pn7.f(cs5.x0(24, un7.g));
    }

    public r65(Context context, vx vxVar, jv1 jv1Var, jv1 jv1Var2, wv1 wv1Var, wv1 wv1Var2, d7h d7hVar, umi umiVar) {
        this.a = context;
        this.b = vxVar;
        this.c = jv1Var2;
        this.d = wv1Var;
        this.e = wv1Var2;
        this.f = d7hVar;
        this.g = umiVar;
        ru9 ru9VarC = ru9.c(context);
        this.h = ru9VarC;
        this.i = new f1p(ru9VarC, vxVar);
        this.j = new tw2((Object) jv1Var, (byte) 21);
        this.k = new q65(this, (byte) 0);
        this.t = yim.a;
        this.u = z4c.b(new r94(this, (byte) 8));
    }

    public final void a(List list) {
        lqh lqhVar = new lqh();
        boolean z2 = this.s;
        lqhVar.a = z2;
        lqh lqhVar2 = new lqh();
        lqhVar2.a = z2;
        lqh lqhVar3 = new lqh();
        lqhVar3.a = z2;
        lqh lqhVar4 = new lqh();
        lqhVar4.a = z2;
        lqh lqhVar5 = new lqh();
        lqhVar5.a = z2;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                UsercentricsServiceConsent usercentricsServiceConsent = (UsercentricsServiceConsent) it.next();
                if (Intrinsics.a(usercentricsServiceConsent.a, "QBlkDsGD1cpDOp")) {
                    lqhVar.a = usercentricsServiceConsent.b;
                }
            }
        }
        qa qaVar = new qa((pjn) this.c.get(), lqhVar, lqhVar2, lqhVar3, lqhVar4, lqhVar5, this);
        if (d()) {
            r9h.p().e(qaVar);
        } else {
            qaVar.invoke(null);
        }
    }

    public final void b(boolean z2) {
        if (this.l) {
            return;
        }
        vx vxVar = this.b;
        if (z2 && ((d75) vxVar.get()).g) {
            nv6 nv6VarB = this.h.b();
            ((SharedPreferences.Editor) nv6VarB.a).putLong("cmp_consent_may_show_after_timestamp", System.currentTimeMillis() + y);
            nv6VarB.w();
        }
        this.l = true;
        this.m = Boolean.valueOf(((d75) vxVar.get()).d);
        g(this.i.r(l(false)));
        this.f.e();
        h();
    }

    public final boolean c() {
        return (this.o == null && this.q == null) ? false : true;
    }

    public final boolean d() {
        return this.o != null && this.q == null;
    }

    public final boolean e() {
        return m() && this.t == yim.a && l(false);
    }

    public final void f() {
        if (d()) {
            if (this.s) {
                uwm uwmVarP = r9h.p();
                zvm zvmVar = awm.Companion;
                a(uwmVarP.a());
            } else if (this.t == yim.d) {
                a(r9h.p().c(awm.b, (LinkedHashMap) null));
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0049 A[PHI: r4
      0x0049: PHI (r4v5 java.lang.String) = 
      (r4v4 java.lang.String)
      (r4v4 java.lang.String)
      (r4v6 java.lang.String)
      (r4v4 java.lang.String)
      (r4v7 java.lang.String)
      (r4v4 java.lang.String)
      (r4v8 java.lang.String)
      (r4v4 java.lang.String)
      (r4v9 java.lang.String)
      (r4v4 java.lang.String)
      (r4v10 java.lang.String)
      (r4v4 java.lang.String)
      (r4v4 java.lang.String)
      (r4v15 java.lang.String)
     binds: [B:11:0x003b, B:33:0x0085, B:35:0x0088, B:30:0x007a, B:31:0x007c, B:27:0x0071, B:28:0x0073, B:24:0x0066, B:25:0x0068, B:21:0x005b, B:22:0x005d, B:18:0x0051, B:14:0x0045, B:15:0x0047] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void g(defpackage.xrf r19) {
        /*
            Method dump skipped, instructions count: 352
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.r65.g(xrf):void");
    }

    public final void h() {
        b6h b6hVar = this.e.b;
        if (c()) {
            skm skmVar = (skm) b6hVar.get();
            boolean zM = m();
            x5f x5fVar = (x5f) skmVar;
            zpa zpaVar = x5fVar.d;
            x56 x56VarF = zpa.F();
            new ck0(zpaVar, x56VarF).c().b.r(30, 1, zM);
            x5fVar.U0(x56VarF);
            return;
        }
        if (m()) {
            return;
        }
        x5f x5fVar2 = (x5f) ((skm) b6hVar.get());
        zpa zpaVar2 = x5fVar2.d;
        x56 x56VarF2 = zpa.F();
        new ck0(zpaVar2, x56VarF2).c().b.r(30, 1, false);
        x5fVar2.U0(x56VarF2);
    }

    public final void i(UsercentricsReadyStatus usercentricsReadyStatus, UsercentricsOptions usercentricsOptions, fwm fwmVar) {
        rn9 rn9Var;
        this.k.S();
        if (c()) {
            return;
        }
        ru9 ru9Var = this.h;
        if (usercentricsReadyStatus != null) {
            boolean z2 = !k() && usercentricsReadyStatus.a;
            nv6 nv6VarB = ru9Var.b();
            ((SharedPreferences.Editor) nv6VarB.a).putBoolean("startup.request_cmp_consent", z2);
            nv6VarB.w();
        }
        int i = fwmVar == null ? 0 : ru9Var.a.getInt("cmp_sdk_init_failure_count", 0) + 1;
        nv6 nv6VarB2 = ru9Var.b();
        ((SharedPreferences.Editor) nv6VarB2.a).putInt("cmp_sdk_init_failure_count", i);
        nv6VarB2.w();
        this.o = usercentricsReadyStatus;
        this.p = usercentricsOptions;
        this.q = fwmVar;
        f();
        if (c() && (rn9Var = this.r) != null) {
            rn9Var.r(true);
        }
        this.f.e();
        h();
    }

    public final void j(int i, String str) {
        x5f x5fVar = (x5f) ((orm) this.d.b.get());
        x5fVar.R(i, null);
        if (((d75) this.b.get()).h) {
            String str2 = this.n;
            if (str2 == null) {
                str2 = "";
            }
            if (x5fVar.h) {
                x5fVar.T0(new e5f(str2, str, (byte) 4));
            }
        }
    }

    public final boolean k() {
        long j = this.h.a.getLong("cmp_consent_may_show_after_timestamp", -1L);
        return ((j > (-1L) ? 1 : (j == (-1L) ? 0 : -1)) == 0 ? 0L : j - System.currentTimeMillis()) > 0;
    }

    public final boolean l(boolean z2) {
        if (!z2) {
            if (this.s || ((Boolean) this.u.getValue()).booleanValue() || k()) {
                return false;
            }
            ru9 ru9Var = this.h;
            if (!i41.j0(ru9Var) && !ru9Var.a.getBoolean("startup.request_cmp_consent", true)) {
                return false;
            }
        }
        return true;
    }

    public final boolean m() {
        Boolean bool = this.m;
        if (bool != null ? bool.booleanValue() : ((d75) this.b.get()).d) {
            return !c() || d();
        }
        return false;
    }
}
