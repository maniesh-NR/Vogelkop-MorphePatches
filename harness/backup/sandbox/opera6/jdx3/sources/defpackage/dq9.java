package defpackage;

import com.opera.android.settings.SettingsManager;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class dq9 {
    public final tsd a;
    public final jze b;

    public dq9(SettingsManager settingsManager, kze kzeVar, pde pdeVar) {
        tsd tsdVarE = uyg.e(settingsManager, "app_layout", new d58((byte) 23));
        tsd tsdVarE2 = uyg.e(settingsManager, "addressbar_position", new d58((byte) 24));
        tsd tsdVarV = xf8.V(pdeVar, new d58((byte) 25));
        cq9 cq9Var = new cq9((byte) 0);
        tsd tsdVarB = xf8.B(new wnm(cq9Var.j(tsdVarE.g(), tsdVarE2.g(), tsdVarV.g(), kzeVar.g()), Arrays.asList(tsdVarE, tsdVarE2, tsdVarV, kzeVar), new fza((byte) 17), new n12(cq9Var, tsdVarE, tsdVarE2, tsdVarV, kzeVar, (byte) 3)));
        this.a = tsdVarB;
        jze jzeVar = new jze(tsdVarB.g());
        jzeVar.l.s(tsdVarB, new cl4(new ry7(jzeVar, this, (byte) 12), (byte) 23));
        this.b = jzeVar;
    }
}
