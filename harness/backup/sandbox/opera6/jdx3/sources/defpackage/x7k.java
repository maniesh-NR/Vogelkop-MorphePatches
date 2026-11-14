package defpackage;

import java.util.Arrays;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class x7k extends d1g {
    public final qte f;
    public final qte g;
    public final List h;

    /* JADX WARN: Illegal instructions before constructor call */
    public x7k(b8k b8kVar, qte qteVar, qte qteVar2) {
        h42 h42Var = b8kVar.n;
        d9j[] d9jVarArr = d9j.a;
        super(h42Var, 6000);
        this.f = qteVar;
        this.g = qteVar2;
        this.h = Arrays.asList(qteVar, qteVar2);
    }

    @Override // defpackage.d1g, defpackage.s6j
    public final ix4 a(hx4 hx4Var, Object obj) {
        z7k z7kVar = (z7k) obj;
        if (!z7kVar.l.a) {
            w7k[] w7kVarArr = w7k.a;
            hx4Var.b(3);
        }
        if (!z7kVar.g.a) {
            w7k[] w7kVarArr2 = w7k.a;
            hx4Var.b(4);
        }
        if (!z7kVar.h.a) {
            w7k[] w7kVarArr3 = w7k.a;
            hx4Var.b(5);
        }
        if (!z7kVar.i.a) {
            w7k[] w7kVarArr4 = w7k.a;
            hx4Var.b(11);
        }
        if (!z7kVar.e.a) {
            w7k[] w7kVarArr5 = w7k.a;
            hx4Var.b(13);
        }
        if (!z7kVar.f.a) {
            w7k[] w7kVarArr6 = w7k.a;
            hx4Var.b(14);
        }
        if (!z7kVar.j.a) {
            hx4Var.c.remove(Integer.valueOf(this.g.a));
        }
        if (!z7kVar.b.a) {
            w7k[] w7kVarArr7 = w7k.a;
            hx4Var.b(9);
        }
        if (!z7kVar.c.a) {
            w7k[] w7kVarArr8 = w7k.a;
            hx4Var.b(10);
        }
        return super.a(hx4Var, z7kVar);
    }

    @Override // defpackage.v6j
    public final List d() {
        return this.h;
    }

    @Override // defpackage.d1g
    public final r6j g(int i, Object obj) {
        return new r6j(i, new x6j(d8j.class, new voj((byte) 16)), 2132021418, 2132021419, 2131232112, true, (Function1) new n6k(this, (byte) 2), 64);
    }
}
