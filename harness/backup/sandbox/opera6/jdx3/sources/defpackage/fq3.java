package defpackage;

import com.opera.android.BrowserActivity;
import com.opera.android.bar.OmniBoxRoot;
import com.opera.android.settings.SettingsManager;
import java.util.LinkedHashSet;

/* loaded from: classes.dex */
public final class fq3 extends v73 {
    public final /* synthetic */ byte K;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fq3(OmniBoxRoot omniBoxRoot, ydn ydnVar, BrowserActivity browserActivity, lg lgVar, SettingsManager settingsManager, wth wthVar, in3 in3Var, k5o k5oVar, ikc ikcVar, u0a u0aVar, byte b) {
        super(omniBoxRoot, ydnVar, browserActivity, lgVar, settingsManager, wthVar, in3Var, k5oVar, ikcVar, u0aVar);
        this.K = b;
    }

    @Override // defpackage.v73
    public final nrl g(tbf tbfVar) {
        byte b = this.K;
        nrl nrlVar = v73.m;
        switch (b) {
            case 0:
                return nrlVar;
            default:
                if (vep.d(tbfVar.c, 3) < 0 || tbfVar.b(64L)) {
                    return nrlVar;
                }
                nrl nrlVarK = k(tbfVar);
                taf tafVar = (taf) nrlVarK.b;
                return (tafVar == taf.d || tafVar == taf.e) ? nrlVar : nrlVarK;
        }
    }

    @Override // defpackage.v73
    public final nrl h(tbf tbfVar, ro9 ro9Var) {
        byte b = this.K;
        nrl nrlVar = v73.m;
        switch (b) {
            case 0:
                return nrlVar;
            default:
                return (tbfVar.b(32L) && tbfVar.b(16L)) ? v73.q : tbfVar.b(64L) ? wxe.J(this.b) ? v73.l : nrlVar : (ro9Var.b < 2 || vep.d(tbfVar.c, 2) >= 0) ? vep.d(tbfVar.c, 3) < 0 ? k(tbfVar) : v73.o : nrlVar;
        }
    }

    @Override // defpackage.v73
    public final taf i(tbf tbfVar, ro9 ro9Var) {
        taf tafVar;
        taf tafVarJ = j(tbfVar);
        if (tbfVar.b.g != null && tafVarJ != (tafVar = taf.a)) {
            return tafVar;
        }
        if (tafVarJ == taf.o || tafVarJ == taf.p || tafVarJ == taf.q || tafVarJ == taf.r || tafVarJ == taf.t) {
            return v73.l(tbfVar);
        }
        LinkedHashSet linkedHashSet = (LinkedHashSet) ro9Var.d;
        taf tafVar2 = taf.M;
        return (linkedHashSet.contains(tafVar2) || tbfVar.f.isEmpty()) ? taf.O : tafVar2;
    }

    @Override // defpackage.v73
    public final nrl m(tbf tbfVar, ro9 ro9Var) {
        byte b = this.K;
        nrl nrlVar = v73.m;
        switch (b) {
            case 0:
                return tbfVar.b(1024L) ? v73.o : (tbfVar.b(2L) || tbfVar.b(16384L) || !tbfVar.b(32L) || !tbfVar.b(16L)) ? tbfVar.b(64L) ? wxe.J(this.b) ? v73.l : nrlVar : (ro9Var.b < 2 || vep.d(tbfVar.c, 2) >= 0) ? k(tbfVar) : nrlVar : v73.q;
            default:
                return nrlVar;
        }
    }
}
