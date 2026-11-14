package defpackage;

import com.opera.android.BrowserActivity;
import com.opera.android.bar.OmniBoxRoot;
import com.opera.android.settings.SettingsManager;
import java.util.LinkedHashSet;

/* loaded from: classes.dex */
public final class odg extends v73 {
    public final crk K;

    public odg(OmniBoxRoot omniBoxRoot, ydn ydnVar, BrowserActivity browserActivity, lg lgVar, SettingsManager settingsManager, wth wthVar, crk crkVar, in3 in3Var, k5o k5oVar, ikc ikcVar, u0a u0aVar) {
        super(omniBoxRoot, ydnVar, browserActivity, lgVar, settingsManager, wthVar, in3Var, k5oVar, ikcVar, u0aVar);
        this.K = crkVar;
    }

    @Override // defpackage.v73
    public final nrl h(tbf tbfVar, ro9 ro9Var) {
        Object obj = this.K.b;
        return (!(tbfVar.b(32L) && tbfVar.b(16L)) && tbfVar.b(64L)) ? (tbfVar.b(64L) && c() && tbfVar.b(256L)) ? v73.l : v73.m : v73.n;
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
    public final taf j(tbf tbfVar) {
        if (d(tbfVar)) {
            return b(tbfVar);
        }
        if (!tbfVar.b.h && this.e.i("compression")) {
            return taf.t;
        }
        ypm ypmVar = tbfVar.b;
        return ypmVar.g != null ? taf.a : ypmVar.i ? taf.s : !tbfVar.f.isEmpty() ? taf.M : taf.O;
    }

    @Override // defpackage.v73
    public final taf n(tbf tbfVar) {
        taf tafVarJ = j(tbfVar);
        taf tafVar = taf.O;
        return tafVarJ != tafVar ? tafVar : v73.l(tbfVar);
    }
}
