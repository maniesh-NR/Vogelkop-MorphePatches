package defpackage;

import java.io.IOException;

/* loaded from: classes.dex */
public final class e5h implements vhi {
    public final int a;
    public final /* synthetic */ g5h b;

    public e5h(g5h g5hVar, int i) {
        this.b = g5hVar;
        this.a = i;
    }

    @Override // defpackage.vhi
    public final int c(i16 i16Var, qj6 qj6Var, int i) {
        g5h g5hVar = this.b;
        if (g5hVar.v()) {
            return -3;
        }
        int i2 = this.a;
        g5hVar.o(i2);
        int iC = g5hVar.v[i2].C(i16Var, qj6Var, i, g5hVar.P);
        if (iC == -3) {
            g5hVar.p(i2);
        }
        return iC;
    }

    @Override // defpackage.vhi
    public final boolean isReady() {
        g5h g5hVar = this.b;
        return !g5hVar.v() && g5hVar.v[this.a].x(g5hVar.P);
    }

    @Override // defpackage.vhi
    public final void maybeThrowError() throws IOException {
        int i = this.a;
        g5h g5hVar = this.b;
        g5hVar.v[i].z();
        qb7 qb7Var = g5hVar.m;
        int iK = g5hVar.d.k(g5hVar.F);
        IOException iOException = (IOException) qb7Var.c;
        if (iOException != null) {
            throw iOException;
        }
        qsc qscVar = (qsc) qb7Var.b;
        if (qscVar != null) {
            if (iK == Integer.MIN_VALUE) {
                iK = qscVar.a;
            }
            IOException iOException2 = qscVar.e;
            if (iOException2 != null && qscVar.f > iK) {
                throw iOException2;
            }
        }
    }

    @Override // defpackage.vhi
    public final int skipData(long j) {
        g5h g5hVar = this.b;
        if (g5hVar.v()) {
            return 0;
        }
        int i = this.a;
        g5hVar.o(i);
        uhi uhiVar = g5hVar.v[i];
        int iV = uhiVar.v(j, g5hVar.P);
        uhiVar.G(iV);
        if (iV == 0) {
            g5hVar.p(i);
        }
        return iV;
    }
}
