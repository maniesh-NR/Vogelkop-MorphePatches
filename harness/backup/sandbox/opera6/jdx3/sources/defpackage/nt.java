package defpackage;

import J.N;
import com.opera.android.favorites.e;
import com.opera.android.suggestion.SuggestionManagerBridge;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class nt implements ysi {
    public final umi a;
    public final qb7 b;
    public final rq8 c;
    public final SuggestionManagerBridge d;
    public final tr8 e;
    public final tsd f;
    public esi g;
    public int h;
    public final qie i;
    public final ArrayList j;

    public nt(umi umiVar, nr8 nr8Var, qb7 qb7Var, rq8 rq8Var, SuggestionManagerBridge suggestionManagerBridge, tr8 tr8Var) {
        this.a = umiVar;
        this.b = qb7Var;
        this.c = rq8Var;
        this.d = suggestionManagerBridge;
        this.e = tr8Var;
        tsd tsdVar = new tsd(l08.a);
        this.f = tsdVar;
        this.i = new qie((byte) 19);
        this.j = sfe.Y(((e) nr8Var).g, new hq8[]{((e) nr8Var).f});
        tsdVar.s(tr8Var.e, new pb(new z3((Object) this, (byte) 9), (byte) 6));
    }

    @Override // defpackage.ysi
    public final void g(esi esiVar) {
        if (Intrinsics.a(esiVar, this.g)) {
            return;
        }
        this.g = esiVar;
        l();
    }

    @Override // defpackage.ysi
    public final boolean i() {
        return false;
    }

    @Override // defpackage.ysi
    public final void l() {
        SuggestionManagerBridge suggestionManagerBridge = this.d;
        N.MFZ1dBII(suggestionManagerBridge.a);
        esi esiVar = this.g;
        if (esiVar == null) {
            this.f.r(l08.a);
            return;
        }
        pqh pqhVar = new pqh();
        pqh pqhVar2 = new pqh();
        kt ktVar = new kt(pqhVar, pqhVar2, this, (byte) 0);
        N.MopJ6PdP(suggestionManagerBridge.a, esiVar.a, false, false, new bi(ktVar, (byte) 8), (Object) null);
        kt ktVar2 = new kt(pqhVar2, pqhVar, this, (byte) 1);
        xj xjVar = new xj(this, esiVar, (byte) 3);
        umi umiVar = this.a;
        nml nmlVarE = umiVar.e(xjVar);
        nmlVarE.b(umiVar.f(new bi(ktVar2, (byte) 7)));
        this.i.n(new oml(nmlVarE), null);
    }

    @Override // defpackage.ysi
    public final ekc m() {
        return this.f;
    }
}
