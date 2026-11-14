package defpackage;

import java.util.Objects;

/* loaded from: classes.dex */
public final class o2g implements f7f {
    public final /* synthetic */ byte a;
    public final Object b;
    public Object c;
    public final Object d;

    public o2g(ndc ndcVar, i3j i3jVar, eq6 eq6Var, ni6 ni6Var, kze kzeVar) {
        this.a = (byte) 1;
        this.b = i3jVar;
        this.c = eq6Var;
        this.d = ni6Var;
        kzeVar.j(ndcVar, this);
    }

    public o2g(ndc ndcVar, rii riiVar, ode odeVar) {
        this.a = (byte) 4;
        this.b = riiVar;
        this.c = xbn.d;
        this.d = odeVar;
        odeVar.j(ndcVar, this);
    }

    public o2g(ndc ndcVar, umk umkVar, w7j w7jVar, jtg jtgVar, kze kzeVar) {
        this.a = (byte) 2;
        this.b = umkVar;
        this.c = w7jVar;
        this.d = jtgVar;
        kzeVar.j(ndcVar, this);
    }

    public o2g(wnm wnmVar, ekc ekcVar, f7f f7fVar) {
        this.a = (byte) 3;
        this.d = wnmVar;
        this.b = ekcVar;
        this.c = f7fVar;
    }

    public o2g(xbf xbfVar, wx wxVar, String str) {
        this.a = (byte) 0;
        this.b = wxVar;
        this.c = str;
        Objects.requireNonNull(xbfVar);
        this.d = xbfVar;
    }

    public final void a(s75 s75Var, Runnable runnable) {
        if (s75Var.equals((s75) this.c)) {
            return;
        }
        this.c = s75Var;
        xbf xbfVar = (xbf) ((rii) this.b).b;
        if (this == ((o2g) xbfVar.c)) {
            xbfVar.E(s75Var, runnable);
        } else if (runnable != null) {
            runnable.run();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x00e2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d0(java.lang.Object r10) {
        /*
            Method dump skipped, instructions count: 462
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.o2g.d0(java.lang.Object):void");
    }
}
