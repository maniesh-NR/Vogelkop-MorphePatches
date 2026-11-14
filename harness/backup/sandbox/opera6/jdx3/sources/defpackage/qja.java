package defpackage;

import com.appsflyer.internal.o;
import org.json.JSONException;

/* loaded from: classes.dex */
public final class qja implements vja {
    public final sja a;

    public qja(sja sjaVar) {
        this.a = sjaVar;
    }

    @Override // defpackage.vja
    public final orb a() throws JSONException {
        orb orbVar = new orb();
        orb orbVarP = vep.p("reason", "");
        rja rjaVar = this.a.a;
        if (rjaVar == rja.UNDEFINED) {
            o.a("Undefined");
            return null;
        }
        orbVarP.p(rjaVar.a, "codes");
        orbVar.p(orbVarP, "error");
        return orbVar;
    }
}
