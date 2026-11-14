package defpackage;

import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class s17 extends okj implements mnk {
    public final vnk n;

    public s17(vnk vnkVar) {
        super(new rnk[2], new eq4[2]);
        int i = this.g;
        qj6[] qj6VarArr = this.e;
        z4o.H(i == qj6VarArr.length);
        for (qj6 qj6Var : qj6VarArr) {
            qj6Var.k(1024);
        }
        this.n = vnkVar;
    }

    @Override // defpackage.okj
    public final qj6 b() {
        return new rnk(1);
    }

    @Override // defpackage.okj
    public final rj6 c() {
        return new eq4(this);
    }

    @Override // defpackage.okj
    public final oj6 d(Throwable th) {
        return new nnk("Unexpected decode error", th);
    }

    @Override // defpackage.okj
    public final oj6 e(qj6 qj6Var, rj6 rj6Var, boolean z) {
        rnk rnkVar = (rnk) qj6Var;
        eq4 eq4Var = (eq4) rj6Var;
        try {
            ByteBuffer byteBuffer = rnkVar.e;
            byteBuffer.getClass();
            byte[] bArrArray = byteBuffer.array();
            int iLimit = byteBuffer.limit();
            vnk vnkVar = this.n;
            if (z) {
                vnkVar.reset();
            }
            lnk lnkVarU = vnkVar.u(0, iLimit, bArrArray);
            long j = rnkVar.g;
            long j2 = rnkVar.j;
            eq4Var.c = j;
            eq4Var.e = lnkVarU;
            if (j2 != Long.MAX_VALUE) {
                j = j2;
            }
            eq4Var.f = j;
            eq4Var.d = false;
            return null;
        } catch (nnk e) {
            return e;
        }
    }

    @Override // defpackage.mnk
    public final void setPositionUs(long j) {
    }
}
