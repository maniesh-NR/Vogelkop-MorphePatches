package defpackage;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class tt9 extends zh5 {
    public final long a;
    public final boolean b;
    public final boolean c;
    public HashSet d;
    public final tee e;
    public final t0g f;
    public final /* synthetic */ vt9 g;

    public tt9(vt9 vt9Var, long j, boolean z, boolean z2, eme emeVar) {
        this.g = vt9Var;
        this.a = j;
        this.b = z;
        this.c = z2;
        tee teeVar = jmi.a;
        this.e = new tee();
        this.f = new t0g(oag.g, ujp.n);
    }

    @Override // defpackage.zh5
    public final void a(fi5 fi5Var, Function2 function2) {
        this.g.b.a(fi5Var, function2);
    }

    @Override // defpackage.zh5
    public final tee b(fi5 fi5Var, thj thjVar, Function2 function2) {
        return this.g.b.b(fi5Var, thjVar, function2);
    }

    @Override // defpackage.zh5
    public final void c() {
        vt9 vt9Var = this.g;
        vt9Var.A--;
    }

    @Override // defpackage.zh5
    public final boolean d() {
        return this.g.b.d();
    }

    @Override // defpackage.zh5
    public final boolean e() {
        return this.b;
    }

    @Override // defpackage.zh5
    public final boolean f() {
        return this.c;
    }

    @Override // defpackage.zh5
    public final long g() {
        return this.a;
    }

    @Override // defpackage.zh5
    public final yh5 h() {
        return this.g.h;
    }

    @Override // defpackage.zh5
    public final oag i() {
        return (oag) this.f.getValue();
    }

    @Override // defpackage.zh5
    public final CoroutineContext j() {
        return this.g.b.j();
    }

    @Override // defpackage.zh5
    public final boolean k() {
        return this.g.b.k();
    }

    @Override // defpackage.zh5
    public final void l(fi5 fi5Var) {
        vt9 vt9Var = this.g;
        zh5 zh5Var = vt9Var.b;
        zh5Var.l(vt9Var.h);
        zh5Var.l(fi5Var);
    }

    @Override // defpackage.zh5
    public final tae m(uae uaeVar) {
        return this.g.b.m(uaeVar);
    }

    @Override // defpackage.zh5
    public final tee n(fi5 fi5Var, thj thjVar, tee teeVar) {
        return this.g.b.n(fi5Var, thjVar, teeVar);
    }

    @Override // defpackage.zh5
    public final void o(Set set) {
        HashSet hashSet = this.d;
        if (hashSet == null) {
            hashSet = new HashSet();
            this.d = hashSet;
        }
        hashSet.add(set);
    }

    @Override // defpackage.zh5
    public final void p(vt9 vt9Var) {
        this.e.a(vt9Var);
    }

    @Override // defpackage.zh5
    public final void q(znh znhVar) {
        this.g.b.q(znhVar);
    }

    @Override // defpackage.zh5
    public final void r(fi5 fi5Var) {
        this.g.b.r(fi5Var);
    }

    @Override // defpackage.zh5
    public final ph4 s(q4b q4bVar) {
        return this.g.b.s(q4bVar);
    }

    @Override // defpackage.zh5
    public final void t() {
        this.g.A++;
    }

    @Override // defpackage.zh5
    public final void u(vt9 vt9Var) {
        HashSet hashSet = this.d;
        if (hashSet != null) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                ((Set) it.next()).remove(vt9Var.v());
            }
        }
        if (vt9Var != null) {
            this.e.l(vt9Var);
        }
    }

    @Override // defpackage.zh5
    public final void v(fi5 fi5Var) {
        this.g.b.v(fi5Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0061  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void w() {
        /*
            r15 = this;
            tee r0 = r15.e
            boolean r1 = r0.h()
            if (r1 == 0) goto L69
            java.util.HashSet r15 = r15.d
            if (r15 == 0) goto L66
            java.lang.Object[] r1 = r0.b
            long[] r2 = r0.a
            int r3 = r2.length
            int r3 = r3 + (-2)
            if (r3 < 0) goto L66
            r4 = 0
            r5 = r4
        L17:
            r6 = r2[r5]
            long r8 = ~r6
            r10 = 7
            long r8 = r8 << r10
            long r8 = r8 & r6
            r10 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r8 = r8 & r10
            int r8 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r8 == 0) goto L61
            int r8 = r5 - r3
            int r8 = ~r8
            int r8 = r8 >>> 31
            r9 = 8
            int r8 = 8 - r8
            r10 = r4
        L31:
            if (r10 >= r8) goto L5f
            r11 = 255(0xff, double:1.26E-321)
            long r11 = r11 & r6
            r13 = 128(0x80, double:6.3E-322)
            int r11 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r11 >= 0) goto L5b
            int r11 = r5 << 3
            int r11 = r11 + r10
            r11 = r1[r11]
            vt9 r11 = (defpackage.vt9) r11
            java.util.Iterator r12 = r15.iterator()
        L47:
            boolean r13 = r12.hasNext()
            if (r13 == 0) goto L5b
            java.lang.Object r13 = r12.next()
            java.util.Set r13 = (java.util.Set) r13
            bi5 r14 = r11.v()
            r13.remove(r14)
            goto L47
        L5b:
            long r6 = r6 >> r9
            int r10 = r10 + 1
            goto L31
        L5f:
            if (r8 != r9) goto L66
        L61:
            if (r5 == r3) goto L66
            int r5 = r5 + 1
            goto L17
        L66:
            r0.b()
        L69:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tt9.w():void");
    }
}
