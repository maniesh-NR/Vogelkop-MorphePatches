package defpackage;

import android.graphics.Path;
import java.util.List;

/* loaded from: classes.dex */
public final class y6g extends uzm {
    public dz3 b;
    public float f;
    public dz3 g;
    public float k;
    public float m;
    public boolean p;
    public qik q;
    public final d91 r;
    public d91 s;
    public d91 t;
    public final l4c u;
    public float c = 1.0f;
    public List d = u0n.a;
    public float e = 1.0f;
    public byte h = 0;
    public byte i = 0;
    public float j = 4.0f;
    public float l = 1.0f;
    public boolean n = true;
    public boolean o = true;

    public y6g() {
        d91 d91VarA = f91.a();
        this.r = d91VarA;
        this.s = d91VarA;
        this.u = z4c.a(f7c.c, new kof((byte) 10));
    }

    @Override // defpackage.uzm
    public final void a(mk7 mk7Var) {
        mk7 mk7Var2;
        qik qikVar;
        if (this.n) {
            uup.M(this.d, this.r);
            e();
        } else if (this.p) {
            e();
        }
        this.n = false;
        this.p = false;
        dz3 dz3Var = this.b;
        if (dz3Var != null) {
            mk7Var2 = mk7Var;
            mk7.m0(mk7Var2, this.s, dz3Var, this.c, null, 56);
        } else {
            mk7Var2 = mk7Var;
        }
        dz3 dz3Var2 = this.g;
        if (dz3Var2 != null) {
            qik qikVar2 = this.q;
            if (this.o || qikVar2 == null) {
                qik qikVar3 = new qik(this.h, this.i, this.f, this.j, 16);
                this.q = qikVar3;
                this.o = false;
                qikVar = qikVar3;
            } else {
                qikVar = qikVar2;
            }
            mk7.m0(mk7Var2, this.s, dz3Var2, this.e, qikVar, 48);
        }
    }

    public final void e() {
        float f = this.k;
        d91 d91Var = this.r;
        if (f == 0.0f && this.l == 1.0f) {
            this.s = d91Var;
            return;
        }
        d91 d91Var2 = this.s;
        if (d91Var2 != d91Var) {
            int i = d91Var2.a.getFillType() == Path.FillType.EVEN_ODD ? 1 : 0;
            this.s.a.rewind();
            this.s.h(i);
        } else {
            this.s = f91.a();
        }
        l4c l4cVar = this.u;
        ((e91) l4cVar.getValue()).a.setPath(d91Var.a, false);
        float length = ((e91) l4cVar.getValue()).a.getLength();
        float f2 = this.k;
        float f3 = this.m;
        float f4 = ((f2 + f3) % 1.0f) * length;
        float f5 = ((this.l + f3) % 1.0f) * length;
        if (f4 <= f5) {
            ((e91) l4cVar.getValue()).a(f4, f5, this.s);
            return;
        }
        d91 d91VarA = this.t;
        if (d91VarA == null) {
            d91VarA = f91.a();
            this.t = d91VarA;
        }
        d91VarA.g();
        ((e91) l4cVar.getValue()).a(f4, length, d91VarA);
        d91.a(this.s, d91VarA);
        d91VarA.g();
        ((e91) l4cVar.getValue()).a(0.0f, f5, d91VarA);
        d91.a(this.s, d91VarA);
    }

    public final String toString() {
        return this.r.toString();
    }
}
