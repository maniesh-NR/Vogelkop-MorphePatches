package defpackage;

import com.opera.android.settings.SettingsManager;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class ms1 extends l7n {
    public final SettingsManager b;
    public c7j c;
    public c7j d;
    public final nak e;
    public final rlh f;

    public ms1(SettingsManager settingsManager) {
        this.b = settingsManager;
        settingsManager.getClass();
        c7j c7jVar = c7j.values()[settingsManager.n("app_font")];
        this.c = c7jVar;
        this.d = c7jVar;
        nak nakVarF = z4o.f(f());
        this.e = nakVarF;
        this.f = a26.j(nakVarF);
    }

    public final ks1 f() {
        h58 h58Var = ls1.a;
        ArrayList arrayList = new ArrayList(k95.o(h58Var, 10));
        w4 w4VarE = sko.e(h58Var, h58Var);
        while (true) {
            if (!w4VarE.hasNext()) {
                break;
            }
            c7j c7jVar = (c7j) w4VarE.next();
            int i = c7jVar.a;
            if (c7jVar == this.d) {
                z = true;
            }
            arrayList.add(new js1(c7jVar, i, z));
        }
        return new ks1(arrayList, this.d != this.c);
    }
}
