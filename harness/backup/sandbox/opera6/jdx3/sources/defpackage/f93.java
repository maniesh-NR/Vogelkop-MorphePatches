package defpackage;

import android.net.Uri;

/* loaded from: classes.dex */
public final class f93 implements k7j, q8j, xla {
    public final isd a;
    public boolean b;
    public l0c c;
    public String d;
    public boolean e;
    public boolean f;
    public boolean g;
    public boolean h;
    public final /* synthetic */ g93 i;

    public f93(g93 g93Var, isd isdVar) {
        this.i = g93Var;
        this.a = isdVar;
        ta7 ta7Var = g93Var.k;
        ((nrl) ta7Var.l).d(new fv2(this, (byte) 8));
    }

    @Override // defpackage.q8j
    public final void a() {
        this.i.c();
    }

    @Override // defpackage.k7j
    public final void b() {
        this.h = true;
    }

    @Override // defpackage.q8j
    public final void c(Object obj) {
        yla ylaVarR;
        l1c l1cVar = (l1c) obj;
        if (this.h) {
            return;
        }
        this.b = false;
        if (l1cVar == null) {
            this.h = true;
            d(null);
            return;
        }
        this.c = l1cVar.c;
        if (l1cVar.d && (ylaVarR = this.i.k.r()) != null) {
            this.c = ylaVarR.e;
        }
        vml.c(new ig(this, (byte) 9));
    }

    public final void d(d93 d93Var) {
        if (this.h) {
            return;
        }
        if (d93Var != null) {
            oue oueVar = this.i.r;
            Uri uri = Uri.parse(d93Var.a.b.toString());
            nv6 nv6Var = oueVar.a;
            long j = oue.b;
            String host = uri.getHost();
            if (host != null) {
                ((pd7) nv6Var.a).f(new ni2(nv6Var, host, j, (byte) 3));
            }
        }
        isd isdVar = this.a;
        isdVar.getClass();
        isdVar.E(d93Var, d93Var != null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x004c, code lost:
    
        if (r0.c == 2) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e() {
        /*
            Method dump skipped, instructions count: 222
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.f93.e():void");
    }

    @Override // defpackage.xla
    public final void f(yla ylaVar) {
        if (this.h) {
            return;
        }
        this.f = true;
        g93 g93Var = this.i;
        if (ylaVar == null) {
            ylaVar = aib.H(g93Var.j, this.c);
        }
        g93Var.k.A(ylaVar);
        e();
    }
}
