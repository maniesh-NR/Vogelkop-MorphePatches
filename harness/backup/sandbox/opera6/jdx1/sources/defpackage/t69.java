package defpackage;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class t69 extends dgk {
    public u69 n;
    public tr3 o;

    @Override // defpackage.dgk
    public final boolean c(g1g g1gVar, long j, qsh qshVar) {
        byte[] bArr = g1gVar.a;
        u69 u69Var = this.n;
        if (u69Var == null) {
            u69 u69Var2 = new u69(bArr, 17);
            this.n = u69Var2;
            nj9 nj9VarA = u69Var2.c(Arrays.copyOfRange(bArr, 9, g1gVar.c), null).a();
            nj9VarA.l = dzd.p("audio/ogg");
            qshVar.b = new oj9(nj9VarA);
            return true;
        }
        byte b = bArr[0];
        if ((b & Byte.MAX_VALUE) != 3) {
            if (b != -1) {
                return true;
            }
            tr3 tr3Var = this.o;
            if (tr3Var != null) {
                tr3Var.a = j;
                qshVar.c = tr3Var;
            }
            ((oj9) qshVar.b).getClass();
            return false;
        }
        bpd bpdVarG = fsp.G(g1gVar);
        u69 u69Var3 = new u69(u69Var.a, u69Var.b, u69Var.c, u69Var.d, u69Var.e, u69Var.g, u69Var.h, u69Var.j, bpdVarG, u69Var.l);
        this.n = u69Var3;
        tr3 tr3Var2 = new tr3();
        tr3Var2.c = u69Var3;
        tr3Var2.d = bpdVarG;
        tr3Var2.a = -1L;
        tr3Var2.b = -1L;
        this.o = tr3Var2;
        return true;
    }

    @Override // defpackage.dgk
    public final void d(boolean z) {
        super.d(z);
        if (z) {
            this.n = null;
            this.o = null;
        }
    }
}
