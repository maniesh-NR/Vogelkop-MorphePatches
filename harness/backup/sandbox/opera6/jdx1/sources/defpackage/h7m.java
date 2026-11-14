package defpackage;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class h7m implements wp5, x63 {
    public final boolean a;
    public final ArrayList b = new ArrayList();
    public final int c;
    public final t89 d;
    public final t89 e;
    public final t89 f;

    public h7m(c73 c73Var, tbj tbjVar) {
        this.a = tbjVar.e;
        this.c = tbjVar.a;
        a73 a73VarD = tbjVar.b.D();
        this.d = (t89) a73VarD;
        a73 a73VarD2 = tbjVar.c.D();
        this.e = (t89) a73VarD2;
        a73 a73VarD3 = tbjVar.d.D();
        this.f = (t89) a73VarD3;
        c73Var.g(a73VarD);
        c73Var.g(a73VarD2);
        c73Var.g(a73VarD3);
        a73VarD.a(this);
        a73VarD2.a(this);
        a73VarD3.a(this);
    }

    @Override // defpackage.x63
    public final void a() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.b;
            if (i >= arrayList.size()) {
                return;
            }
            ((x63) arrayList.get(i)).a();
            i++;
        }
    }

    @Override // defpackage.wp5
    public final void b(List list, List list2) {
    }

    public final void c(x63 x63Var) {
        this.b.add(x63Var);
    }
}
