package defpackage;

/* loaded from: classes.dex */
public final class lcd extends a8o {
    public final boolean l;
    public final fql m;
    public final dql n;
    public jcd o;
    public icd p;
    public boolean q;
    public boolean r;
    public boolean s;

    public lcd(l73 l73Var, boolean z) {
        super(l73Var);
        this.l = z && l73Var.j();
        this.m = new fql();
        this.n = new dql();
        gql gqlVarH = l73Var.h();
        if (gqlVarH == null) {
            this.o = new jcd(new kcd(l73Var.i()), fql.p, jcd.h);
        } else {
            this.o = new jcd(gqlVarH, null, null);
            this.s = true;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:39:? A[RETURN, SYNTHETIC] */
    @Override // defpackage.a8o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A(defpackage.gql r13) {
        /*
            Method dump skipped, instructions count: 210
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lcd.A(gql):void");
    }

    @Override // defpackage.a8o
    public final void B() {
        if (this.l) {
            return;
        }
        this.q = true;
        y(null, this.k);
    }

    @Override // defpackage.l73
    /* renamed from: C, reason: merged with bridge method [inline-methods] */
    public final icd c(jrd jrdVar, l45 l45Var, long j) {
        icd icdVar = new icd(jrdVar, l45Var, j);
        z4o.H(icdVar.d == null);
        l73 l73Var = this.k;
        icdVar.d = l73Var;
        if (!this.r) {
            this.p = icdVar;
            if (!this.q) {
                this.q = true;
                y(null, l73Var);
            }
            return icdVar;
        }
        Object obj = jrdVar.a;
        if (this.o.g != null && obj.equals(jcd.h)) {
            obj = this.o.g;
        }
        icdVar.c(jrdVar.a(obj));
        return icdVar;
    }

    public final boolean D(long j) {
        icd icdVar = this.p;
        int iB = this.o.b(icdVar.a.a);
        if (iB == -1) {
            return false;
        }
        jcd jcdVar = this.o;
        dql dqlVar = this.n;
        jcdVar.f(iB, dqlVar, false);
        long j2 = dqlVar.d;
        if (j2 != -9223372036854775807L && j >= j2) {
            j = Math.max(0L, j2 - 1);
        }
        icdVar.g = j;
        return true;
    }

    @Override // defpackage.l73
    public final boolean a(qjd qjdVar) {
        return this.k.a(qjdVar);
    }

    @Override // defpackage.l73
    public final void o(nkd nkdVar) {
        icd icdVar = (icd) nkdVar;
        if (icdVar.e != null) {
            l73 l73Var = icdVar.d;
            l73Var.getClass();
            l73Var.o(icdVar.e);
        }
        if (nkdVar == this.p) {
            this.p = null;
        }
    }

    @Override // defpackage.th5, defpackage.l73
    public final void q() {
        this.r = false;
        this.q = false;
        super.q();
    }

    @Override // defpackage.a8o, defpackage.l73
    public final void t(qjd qjdVar) {
        if (this.s) {
            jcd jcdVar = this.o;
            this.o = new jcd(new alg(this.o.e, qjdVar), jcdVar.f, jcdVar.g);
        } else {
            this.o = new jcd(new kcd(qjdVar), fql.p, jcd.h);
        }
        this.k.t(qjdVar);
    }

    @Override // defpackage.a8o
    public final jrd z(jrd jrdVar) {
        Object obj = jrdVar.a;
        Object obj2 = this.o.g;
        if (obj2 != null && obj2.equals(obj)) {
            obj = jcd.h;
        }
        return jrdVar.a(obj);
    }
}
