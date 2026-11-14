package defpackage;

import com.opera.android.settings.SettingsManager;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final /* synthetic */ class cv1 implements Function1 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ dv1 b;

    public /* synthetic */ cv1(dv1 dv1Var, byte b) {
        this.a = b;
        this.b = dv1Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        dv1 dv1Var = this.b;
        switch (b) {
            case 0:
                b7j b7jVar = (b7j) obj;
                yu1 yu1Var = dv1Var.i;
                ev1 ev1Var = yu1Var.b;
                if (ev1Var.b != b7jVar) {
                    ev1Var.b = b7jVar;
                    yu1Var.c();
                }
                break;
            default:
                r7j r7jVar = (r7j) obj;
                SettingsManager settingsManager = dv1Var.b;
                e7j e7jVarB = dv1Var.i.b();
                settingsManager.getClass();
                if (e7jVarB == e7j.c) {
                    settingsManager.V(r7jVar.ordinal(), "toolbar_disposition_classic");
                } else {
                    settingsManager.V(r7jVar.ordinal(), "toolbar_disposition_tablet");
                }
                break;
        }
        return Unit.a;
    }
}
