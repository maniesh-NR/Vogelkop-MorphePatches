package defpackage;

import java.util.ArrayList;
import java.util.concurrent.CancellationException;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class dil {
    public boolean A;
    public final okm a;
    public gbc d;
    public Function0 f;
    public f31 g;
    public nx5 h;
    public wgg i;
    public fgg j;
    public kg9 k;
    public final t0g l;
    public final t0g m;
    public long n;
    public xjl o;
    public long p;
    public final t0g q;
    public final t0g r;
    public int s;
    public mil t;
    public eyi u;
    public xjl v;
    public final t0g w;
    public final jvg x;
    public final bil y;
    public final eyi z;
    public i9f b = cs5.k;
    public Function1 c = new bvk((byte) 23);
    public final t0g e = hyg.k(new mil(7, 0, (String) null));

    public dil(okm okmVar) {
        this.a = okmVar;
        Boolean bool = Boolean.TRUE;
        this.l = hyg.k(bool);
        this.m = hyg.k(bool);
        this.n = 0L;
        this.p = 0L;
        this.q = hyg.k((Object) null);
        this.r = hyg.k((Object) null);
        this.s = -1;
        this.t = new mil(7, 0L, (String) null);
        this.w = hyg.k(Boolean.FALSE);
        jvg jvgVar = new jvg((byte) 10);
        jvgVar.c = mtl.a;
        this.x = jvgVar;
        this.y = new bil(this);
        this.z = new eyi(this);
    }

    public static mil b(sf1 sf1Var, long j) {
        return new mil(sf1Var, j, (xjl) null);
    }

    public final d3k a(boolean z) {
        nx5 nx5Var = this.h;
        mt5 mt5Var = null;
        if (nx5Var != null) {
            return na2.B(nx5Var, null, rx5.d, new tx6(this, z, mt5Var, (byte) 2), 1);
        }
        return null;
    }

    public final void c() {
        nx5 nx5Var = this.h;
        if (nx5Var != null) {
            na2.B(nx5Var, null, rx5.d, new zhl((byte) 0, (mt5) null, (Object) this), 1);
        }
    }

    public final void d(y8f y8fVar) {
        if (!xjl.c(l().b)) {
            gbc gbcVar = this.d;
            ojl ojlVarD = gbcVar != null ? gbcVar.d() : null;
            int iE = (y8fVar == null || ojlVarD == null) ? xjl.e(l().b) : this.b.g(ojlVarD.b(y8fVar.a, true));
            mil milVarA = mil.a(l(), null, upj.c(iE, iE), 5);
            this.c.invoke(milVarA);
            this.v = new xjl(milVarA.b);
        }
        r((y8fVar == null || l().a.b.length() <= 0) ? b7a.a : b7a.c);
        u(false);
    }

    public final void e(boolean z) {
        kg9 kg9Var;
        gbc gbcVar = this.d;
        if (gbcVar != null && !gbcVar.b() && (kg9Var = this.k) != null) {
            kg9.a(kg9Var);
        }
        this.t = l();
        u(z);
        r(b7a.b);
    }

    public final Pair f() {
        String str;
        xjl xjlVar;
        sf1 sf1VarK = k();
        if (sf1VarK == null || (str = sf1VarK.b) == null || (xjlVar = this.v) == null) {
            return null;
        }
        long j = xjlVar.a;
        return new Pair(str, new xjl(upj.c(this.b.i((int) (j >> 32)), this.b.i((int) (j & 4294967295L)))));
    }

    public final y8f g() {
        return (y8f) this.r.getValue();
    }

    public final boolean h() {
        return ((Boolean) this.l.getValue()).booleanValue();
    }

    public final boolean i() {
        return ((Boolean) this.m.getValue()).booleanValue();
    }

    public final long j(boolean z) {
        ojl ojlVarD;
        gbc gbcVar = this.d;
        if (gbcVar == null || (ojlVarD = gbcVar.d()) == null) {
            return 9205357640488583168L;
        }
        njl njlVar = ojlVarD.a;
        xbe xbeVar = njlVar.b;
        sf1 sf1VarK = k();
        if (sf1VarK == null) {
            return 9205357640488583168L;
        }
        if (!Intrinsics.a(sf1VarK.b, njlVar.a.a.b)) {
            return 9205357640488583168L;
        }
        long j = l().b;
        int i = xjl.c;
        int i2 = this.b.i((int) (z ? j >> 32 : j & 4294967295L));
        boolean zG = xjl.g(l().b);
        long j2 = njlVar.c;
        if (xbeVar.d(i2) >= xbeVar.f) {
            return 9205357640488583168L;
        }
        boolean z2 = njlVar.a((!z ? !zG : zG) ? Math.max(i2 + (-1), 0) : i2) == njlVar.h(i2);
        xbeVar.l(i2);
        int length = ((sf1) xbeVar.a.a).b.length();
        ArrayList arrayList = xbeVar.h;
        tzf tzfVar = (tzf) arrayList.get(i2 == length ? arrayList.size() - 1 : sgb.y(i2, arrayList));
        y81 y81Var = tzfVar.a;
        int iB = tzfVar.b(i2);
        ljl ljlVar = y81Var.d;
        return (Float.floatToRawIntBits(djh.b(z2 ? ljlVar.j(iB, false) : ljlVar.k(iB, false), 0.0f, (int) (j2 >> 32))) << 32) | (Float.floatToRawIntBits(djh.b(xbeVar.b(r8), 0.0f, (int) (j2 & 4294967295L))) & 4294967295L);
    }

    public final sf1 k() {
        gbc gbcVar = this.d;
        if (gbcVar != null) {
            return (sf1) gbcVar.a.b;
        }
        return null;
    }

    public final mil l() {
        return (mil) this.e.getValue();
    }

    public final void m() {
        d3k d3kVar;
        agl aglVar = (agl) this.x.b;
        if (aglVar == null || (d3kVar = aglVar.u) == null) {
            return;
        }
        d3kVar.k((CancellationException) null);
        aglVar.u = null;
    }

    public final void n(xjl xjlVar) {
        sf1 sf1VarK;
        String str;
        nx5 nx5Var;
        if (xjlVar != null) {
            long j = xjlVar.a;
            wgg wggVar = this.i;
            if (wggVar == null || (sf1VarK = k()) == null || (str = sf1VarK.b) == null) {
                return;
            }
            i9f i9fVar = this.b;
            long jC = upj.c(i9fVar.i((int) (j >> 32)), i9fVar.i((int) (j & 4294967295L)));
            if (str.length() <= 0 || xjl.c(jC) || (nx5Var = this.h) == null) {
                return;
            }
            na2.B(nx5Var, null, null, new kq5(wggVar, str, jC, xjlVar, this, i9fVar, null), 3);
        }
    }

    public final void o() {
        nx5 nx5Var = this.h;
        if (nx5Var != null) {
            na2.B(nx5Var, null, rx5.d, new whl(this, null, (byte) 1), 1);
        }
    }

    public final void p(y8f y8fVar) {
        this.r.setValue(y8fVar);
    }

    public final void q(x6a x6aVar) {
        this.q.setValue(x6aVar);
    }

    public final void r(b7a b7aVar) {
        gbc gbcVar = this.d;
        if (gbcVar != null) {
            if (gbcVar.a() == b7aVar) {
                gbcVar = null;
            }
            if (gbcVar != null) {
                gbcVar.k.setValue(b7aVar);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0027, code lost:
    
        if (((java.lang.Boolean) r4.q.getValue()).booleanValue() != false) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void s() {
        /*
            r6 = this;
            ttj r0 = defpackage.bwg.t()
            r1 = 0
            if (r0 == 0) goto Lc
            kotlin.jvm.functions.Function1 r2 = r0.e()
            goto Ld
        Lc:
            r2 = r1
        Ld:
            ttj r3 = defpackage.bwg.x(r0)
            boolean r4 = r6.i()     // Catch: java.lang.Throwable -> L70
            if (r4 == 0) goto L6c
            gbc r4 = r6.d     // Catch: java.lang.Throwable -> L70
            if (r4 == 0) goto L29
            t0g r4 = r4.q     // Catch: java.lang.Throwable -> L70
            java.lang.Object r4 = r4.getValue()     // Catch: java.lang.Throwable -> L70
            java.lang.Boolean r4 = (java.lang.Boolean) r4     // Catch: java.lang.Throwable -> L70
            boolean r4 = r4.booleanValue()     // Catch: java.lang.Throwable -> L70
            if (r4 == 0) goto L6c
        L29:
            defpackage.bwg.A(r0, r3, r2)
            jvg r6 = r6.x
            java.lang.Object r0 = r6.c
            mtl r0 = (defpackage.mtl) r0
            mtl r2 = defpackage.mtl.a
            if (r0 != r2) goto L3b
            java.lang.String r0 = "ToolbarRequester is not initialized."
            defpackage.d8b.c(r0)
        L3b:
            java.lang.Object r6 = r6.b
            agl r6 = (defpackage.agl) r6
            if (r6 == 0) goto L6b
            boolean r0 = r6.n
            if (r0 == 0) goto L6b
            d3k r0 = r6.u
            r2 = 1
            if (r0 == 0) goto L50
            boolean r0 = r0.isActive()
            if (r0 == r2) goto L6b
        L50:
            hp7 r0 = defpackage.vfl.b
            java.lang.Object r0 = defpackage.z4o.N(r6, r0)
            ufl r0 = (defpackage.ufl) r0
            if (r0 == 0) goto L6b
            nx5 r3 = r6.H0()
            rx5 r4 = rx5.d
            sbl r5 = new sbl
            r5.<init>(r6, r0, r1, r2)
            d3k r0 = defpackage.na2.B(r3, r1, r4, r5, r2)
            r6.u = r0
        L6b:
            return
        L6c:
            defpackage.bwg.A(r0, r3, r2)
            return
        L70:
            r6 = move-exception
            defpackage.bwg.A(r0, r3, r2)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dil.s():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object t(nt5 r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof defpackage.cil
            if (r0 == 0) goto L13
            r0 = r6
            cil r0 = (defpackage.cil) r0
            int r1 = r0.w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.w = r1
            goto L18
        L13:
            cil r0 = new cil
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.u
            px5 r1 = px5.a
            int r2 = r0.w
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L30
            if (r2 != r4) goto L2a
            dil r5 = r0.t
            defpackage.ybh.y(r6)
            goto L5a
        L2a:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            qp2.n(r5)
            return r3
        L30:
            defpackage.ybh.y(r6)
            f31 r6 = r5.g
            if (r6 == 0) goto L7b
            r0.t = r5
            r0.w = r4
            boolean r0 = r6 instanceof defpackage.f31
            if (r0 == 0) goto L65
            g31 r6 = r6.a
            android.content.ClipboardManager r6 = r6.a()
            android.content.ClipDescription r6 = r6.getPrimaryClipDescription()
            if (r6 != 0) goto L4d
            r6 = 0
            goto L53
        L4d:
            java.lang.String r0 = "text/*"
            boolean r6 = r6.hasMimeType(r0)
        L53:
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)
            if (r6 != r1) goto L5a
            return r1
        L5a:
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            r6.getClass()
            t0g r5 = r5.w
            r5.setValue(r6)
            goto L7b
        L65:
            java.lang.Class r5 = r6.getClass()
            s15 r5 = uqh.a(r5)
            java.lang.String r5 = r5.b()
            java.lang.String r6 = "Extracting native reference is only supported from androidx.compose.ui.platform.AndroidClipboard instances but received "
            java.lang.String r5 = sko.j(r6, r5)
            bxl.d(r5)
            return r3
        L7b:
            kotlin.Unit r5 = kotlin.Unit.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dil.t(nt5):java.lang.Object");
    }

    public final void u(boolean z) {
        gbc gbcVar = this.d;
        if (gbcVar != null) {
            gbcVar.l.setValue(Boolean.valueOf(z));
        }
        if (z) {
            s();
        } else {
            m();
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r8v2 eyi, still in use, count: 2, list:
          (r8v2 eyi) from 0x008c: MOVE (r27v1 eyi) = (r8v2 eyi)
          (r8v2 eyi) from 0x0071: MOVE (r27v3 eyi) = (r8v2 eyi)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:91)
        	at jadx.core.utils.InsnRemover.addAndUnbind(InsnRemover.java:57)
        	at jadx.core.dex.visitors.ModVisitor.removeStep(ModVisitor.java:463)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:97)
        */
    public final long v(defpackage.mil r26, long r27, boolean r29, boolean r30, hai r31, boolean r32, defpackage.k7a r33) {
        /*
            Method dump skipped, instructions count: 732
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dil.v(mil, long, boolean, boolean, hai, boolean, k7a):long");
    }
}
