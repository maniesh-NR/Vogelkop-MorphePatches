package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class ppi extends kuk implements Function2 {
    public final /* synthetic */ long A;
    public spi t;
    public oqh u;
    public long v;
    public boolean w;
    public /* synthetic */ Object x;
    public final /* synthetic */ spi y;
    public final /* synthetic */ oqh z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ppi(spi spiVar, oqh oqhVar, long j, mt5 mt5Var) {
        super(2, mt5Var);
        this.y = spiVar;
        this.z = oqhVar;
        this.A = j;
    }

    public final mt5 create(Object obj, mt5 mt5Var) {
        ppi ppiVar = new ppi(this.y, this.z, this.A, mt5Var);
        ppiVar.x = obj;
        return ppiVar;
    }

    public final Object invoke(Object obj, Object obj2) {
        return create((qpi) obj, (mt5) obj2).invokeSuspend(Unit.a);
    }

    public final Object invokeSuspend(Object obj) {
        spi spiVar;
        oqh oqhVar;
        spi spiVar2;
        long j;
        px5 px5Var = px5.a;
        boolean z = this.w;
        if (!z) {
            ybh.y(obj);
            qpi qpiVar = (qpi) this.x;
            spiVar = this.y;
            opi opiVar = new opi(spiVar, qpiVar);
            h89 h89Var = spiVar.c;
            oqhVar = this.z;
            long j2 = oqhVar.a;
            fsf fsfVar = spiVar.d;
            fsf fsfVar2 = fsf.b;
            long j3 = this.A;
            float fE = spiVar.e(fsfVar == fsfVar2 ? i1n.b(j3) : i1n.c(j3));
            this.x = spiVar;
            this.t = spiVar;
            this.u = oqhVar;
            this.v = j2;
            this.w = true;
            obj = h89Var.a(opiVar, fE, this);
            if (obj == px5Var) {
                return px5Var;
            }
            spiVar2 = spiVar;
            j = j2;
        } else {
            if (!z) {
                qp2.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            j = this.v;
            oqhVar = this.u;
            spiVar = this.t;
            spiVar2 = (spi) this.x;
            ybh.y(obj);
        }
        float fE2 = spiVar2.e(((Number) obj).floatValue());
        oqhVar.a = spiVar.d == fsf.b ? i1n.a(j, fE2, 0.0f, 2) : i1n.a(j, 0.0f, fE2, 1);
        return Unit.a;
    }
}
