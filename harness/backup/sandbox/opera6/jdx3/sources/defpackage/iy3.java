package defpackage;

import java.util.Collections;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class iy3 extends d1g {
    public final g1c f;
    public final List g;

    /* JADX WARN: Illegal instructions before constructor call */
    public iy3(ny3 ny3Var, g1c g1cVar) {
        v9j v9jVar = (v9j) ny3Var.h;
        d9j[] d9jVarArr = d9j.a;
        super(v9jVar, 2000);
        this.f = g1cVar;
        this.g = Collections.singletonList(g1cVar);
    }

    @Override // defpackage.d1g, defpackage.s6j
    public final ix4 a(hx4 hx4Var, Object obj) {
        ky3 ky3Var = (ky3) obj;
        if (ky3Var.a.equals(nm6.m)) {
            hy3[] hy3VarArr = hy3.a;
            hx4Var.b(1);
        }
        if (ky3Var.f.equals(oab.h)) {
            hy3[] hy3VarArr2 = hy3.a;
            hx4Var.b(4);
        }
        iwk iwkVar = ky3Var.d;
        hwk hwkVar = hwk.a;
        if (iwkVar.equals(hwkVar)) {
            hy3[] hy3VarArr3 = hy3.a;
            hx4Var.b(5);
        }
        if (ky3Var.g.equals(hwkVar)) {
            hy3[] hy3VarArr4 = hy3.a;
            hx4Var.b(6);
        }
        return super.a(hx4Var, ky3Var);
    }

    @Override // defpackage.v6j
    public final List d() {
        return this.g;
    }

    @Override // defpackage.d1g
    public final r6j g(int i, Object obj) {
        return new r6j(i, new x6j(d8j.class, new q92((byte) 5)), 2132021143, ((ky3) obj).a instanceof nm6 ? 2132021142 : 2132021141, 2131231649, false, (Function1) new bo3(this, (byte) 10), 64);
    }
}
