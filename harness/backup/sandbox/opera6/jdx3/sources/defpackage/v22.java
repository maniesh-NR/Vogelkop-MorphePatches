package defpackage;

import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class v22 implements ndc {
    public final b2l a;
    public boolean c;
    public final qdc e;
    public final qdc f;
    public final zyk g;
    public r22 h;
    public final /* synthetic */ x22 i;
    public boolean b = true;
    public final pde d = new pde(l08.a);

    public v22(x22 x22Var, b2l b2lVar) {
        this.i = x22Var;
        this.a = b2lVar;
        qdc qdcVar = new qdc(this, true);
        this.e = qdcVar;
        this.f = qdcVar;
        this.g = z4c.b(new x2((Object) x22Var, (Object) this, (byte) 19));
        oup.l0(qdcVar, (Function1) null, new s22(this, (byte) 1), new s22(this, (byte) 2), new s22(this, (byte) 3), 1);
        b();
    }

    public final void a() {
        r22 r22Var;
        if (this.h == null) {
            m02 m02Var = (m02) this.g.getValue();
            u22 u22Var = new u22(this, v22.class, "active", "getActive()Z", 0, (byte) 0);
            q2 q2Var = new q2(0, this, v22.class, "updateInitiallySubmittedFiles", "updateInitiallySubmittedFiles()V", 0, (byte) 5);
            x22 x22Var = this.i;
            this.h = x22Var.a(this.a, m02Var, this, u22Var, q2Var);
            if (this.f.i.d(qcc.e) && (r22Var = this.h) != null) {
                x22Var.n = r22Var;
                x22Var.h(r22Var);
            }
            i7f i7fVar = x22Var.o;
            g7f g7fVarC = u35.c(i7fVar, i7fVar);
            while (g7fVarC.hasNext()) {
                ((bx0) g7fVarC.next()).a.b();
            }
        }
    }

    public final void b() {
        boolean z = this.b;
        qdc qdcVar = this.e;
        if (z && this.c) {
            qcc qccVar = this.i.c.i;
            qcc qccVar2 = qcc.e;
            if (qccVar.d(qccVar2)) {
                qdcVar.g(qccVar2);
                return;
            }
        }
        qdcVar.g(qcc.d);
    }

    public final tcc getLifecycle() {
        return this.f;
    }
}
