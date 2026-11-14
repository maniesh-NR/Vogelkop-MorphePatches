package defpackage;

import android.content.Context;
import com.opera.android.settings.SettingsManager;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final /* synthetic */ class xs1 implements Function1 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ at1 b;
    public final /* synthetic */ Context c;
    public final /* synthetic */ ndc d;
    public final /* synthetic */ qs1 e;

    public /* synthetic */ xs1(at1 at1Var, Context context, ndc ndcVar, qs1 qs1Var, byte b) {
        this.a = b;
        this.b = at1Var;
        this.c = context;
        this.d = ndcVar;
        this.e = qs1Var;
    }

    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                int iOrdinal = ((pkj) obj).ordinal();
                at1 at1Var = this.b;
                if (iOrdinal == 0) {
                    at1Var.i.b(new vx(at1Var, (byte) 2)).c(new ws1(at1Var, this.d, this.c, this.e, (byte) 0)).a(null, null);
                } else if (iOrdinal != 1 && iOrdinal != 2) {
                    h9o.p();
                    break;
                } else {
                    at1Var.k(at1Var.b.e(), false, at1Var.q);
                }
                break;
            default:
                at1 at1Var2 = this.b;
                SettingsManager settingsManager = at1Var2.b;
                int iOrdinal2 = ((s4i) obj).ordinal();
                ndc ndcVar = this.d;
                if (iOrdinal2 == 0) {
                    gjm gjmVar = at1Var2.e;
                    qs1 qs1Var = this.e;
                    gjmVar.c(new jt1(qs1Var.b), ndcVar, new ug(new xs1(at1Var2, this.c, ndcVar, qs1Var, (byte) 0), (byte) 2));
                } else if (iOrdinal2 == 1) {
                    at1Var2.t = vb0.d;
                    at1Var2.k(settingsManager.e(), false, at1Var2.q);
                } else if (iOrdinal2 != 2) {
                    h9o.p();
                    break;
                } else {
                    at1Var2.n.a(ndcVar, o3i.APP_ICON, zj6.b.g);
                    at1Var2.k(settingsManager.e(), false, at1Var2.q);
                }
                break;
        }
        return Unit.a;
    }
}
