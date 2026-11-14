package defpackage;

import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class quh implements idc {
    public final /* synthetic */ occ a;
    public final /* synthetic */ pqh b;
    public final /* synthetic */ nx5 c;
    public final /* synthetic */ occ d;
    public final /* synthetic */ nh4 e;
    public final /* synthetic */ pfe f;
    public final /* synthetic */ Function2 g;

    public quh(occ occVar, pqh pqhVar, nx5 nx5Var, occ occVar2, nh4 nh4Var, pfe pfeVar, Function2 function2) {
        this.a = occVar;
        this.b = pqhVar;
        this.c = nx5Var;
        this.d = occVar2;
        this.e = nh4Var;
        this.f = pfeVar;
        this.g = function2;
    }

    @Override // defpackage.idc
    public final void E(ndc ndcVar, occ occVar) {
        occ occVar2 = this.a;
        pqh pqhVar = this.b;
        if (occVar == occVar2) {
            pqhVar.a = na2.B(this.c, null, null, new jj4(this.f, this.g, (mt5) null, (byte) 15), 3);
            return;
        }
        if (occVar == this.d) {
            unb unbVar = (unb) pqhVar.a;
            if (unbVar != null) {
                unbVar.k((CancellationException) null);
            }
            pqhVar.a = null;
        }
        if (occVar == occ.ON_DESTROY) {
            p0i p0iVar = t0i.b;
            this.e.resumeWith(Unit.a);
        }
    }
}
