package defpackage;

import android.app.Activity;
import java.util.List;

/* loaded from: classes.dex */
public abstract class rn extends k43 {
    public final Activity k;
    public final Object l;

    public rn(ao aoVar, Activity activity, zy zyVar, dl dlVar, List list) {
        super(aoVar, zyVar, dlVar);
        this.k = activity;
        this.l = list;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rn(oo8 oo8Var, Activity activity, zy zyVar, dl dlVar) {
        super(oo8Var, zyVar, dlVar);
        this.l = oo8Var;
        this.k = activity;
        if (oo8.q != null) {
            return;
        }
        oo8.q = new nrl((byte) 26);
        hn9.g(activity);
        pfp.c(new jbd(activity.getApplicationContext(), new ypi("pub13861483759168/ep13861483759744/app14131723392384", "Opera", null, null), new thf(), (byte) 9));
    }

    @Override // defpackage.k43
    public void a() {
        nrl nrlVar = oo8.q;
        if (nrlVar != null) {
            if (!nrlVar.a) {
                nrlVar.d(new vdf(this, (byte) 1));
            } else if (oo8.r) {
                b(false, bqi.n("ads provider not available", ((oo8) this.l).g), false, null, null);
            } else {
                g();
            }
        }
    }

    public abstract void g();

    public final void h(cm cmVar, v50 v50Var) {
        int i = cmVar.b;
        b(i == 5, cmVar.c, i == 4 || i == 5, v50Var, null);
    }
}
