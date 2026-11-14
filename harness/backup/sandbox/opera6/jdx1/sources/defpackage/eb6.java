package defpackage;

import java.io.IOException;
import java.util.ConcurrentModificationException;

/* loaded from: classes.dex */
public final class eb6 implements osc {
    public final /* synthetic */ byte a;
    public final Object b;

    public /* synthetic */ eb6(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    private final void a(rsc rscVar, long j, long j2, boolean z) {
    }

    @Override // defpackage.osc
    public final void d(rsc rscVar, long j, long j2, boolean z) {
        switch (this.a) {
            case 0:
                ((fb6) this.b).w((w1g) rscVar, j, j2);
                break;
        }
    }

    @Override // defpackage.osc
    public final void i(rsc rscVar, long j, long j2) {
        boolean z;
        switch (this.a) {
            case 0:
                w1g w1gVar = (w1g) rscVar;
                fb6 fb6Var = (fb6) this.b;
                long j3 = w1gVar.a;
                nd6 nd6Var = w1gVar.b;
                vbk vbkVar = w1gVar.d;
                bsc bscVar = new bsc(nd6Var, vbkVar.c, vbkVar.d, j, j2, vbkVar.b);
                fb6Var.m.getClass();
                fb6Var.q.y(bscVar, w1gVar.c, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
                fb6Var.K = ((Long) w1gVar.f).longValue() - j;
                fb6Var.y(true);
                return;
            default:
                zy9 zy9Var = (zy9) this.b;
                synchronized (z5i.t) {
                    z = z5i.u;
                }
                if (z) {
                    zy9Var.N();
                    return;
                } else {
                    ((fb6) zy9Var.a).x(new IOException(new ConcurrentModificationException()));
                    return;
                }
        }
    }

    @Override // defpackage.osc
    public final psc u(rsc rscVar, long j, long j2, IOException iOException, int i) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                w1g w1gVar = (w1g) rscVar;
                fb6 fb6Var = (fb6) obj;
                ro9 ro9Var = fb6Var.q;
                long j3 = w1gVar.a;
                nd6 nd6Var = w1gVar.b;
                vbk vbkVar = w1gVar.d;
                ro9Var.A(new bsc(nd6Var, vbkVar.c, vbkVar.d, j, j2, vbkVar.b), w1gVar.c, iOException, true);
                fb6Var.m.getClass();
                fb6Var.x(iOException);
                break;
            default:
                ((fb6) ((zy9) obj).a).x(iOException);
                break;
        }
        return qb7.f;
    }
}
