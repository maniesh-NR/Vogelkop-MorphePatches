package defpackage;

import android.content.Context;
import android.content.SharedPreferences;

/* loaded from: classes.dex */
public final class ete {
    public final x5f a;
    public final b59 b;

    public ete(Context context, umi umiVar, x5f x5fVar) {
        this.a = x5fVar;
        this.b = w1h.l(context, umiVar, "news.session.tracker", new bg1[0]);
    }

    public final void a() {
        am2.x(((SharedPreferences) this.b.get()).edit(), "last_session");
        x5f x5fVar = this.a;
        if (x5fVar.h) {
            zpa zpaVar = x5fVar.d;
            x56 x56VarF = zpa.F();
            x56VarF.E(zpaVar).z(zpaVar).e(3);
            x5fVar.U0(x56VarF);
        }
    }
}
