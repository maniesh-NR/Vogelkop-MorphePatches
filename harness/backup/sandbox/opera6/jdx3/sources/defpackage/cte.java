package defpackage;

import android.content.Context;
import java.util.ArrayList;
import java.util.Map;

/* loaded from: classes.dex */
public final class cte extends oh4 {
    public boolean b;
    public final /* synthetic */ dte c;
    public final /* synthetic */ Context d;

    public cte(dte dteVar, Context context) {
        this.c = dteVar;
        this.d = context;
    }

    @Override // defpackage.oh4
    public final void d(Object obj) {
        l1c l1cVar = (l1c) obj;
        dte dteVar = this.c;
        bte bteVar = dteVar.e;
        if (l1cVar == null) {
            l08 l08Var = l08.a;
            bteVar.getClass();
            bteVar.a.r(l08Var);
            return;
        }
        dteVar.g = l1cVar.c;
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : l1cVar.a.entrySet()) {
            l0c l0cVar = (l0c) entry.getKey();
            q0c q0cVar = (q0c) entry.getValue();
            int i = q0cVar.a;
            Context context = this.d;
            arrayList.add(new ate(l0cVar, context.getString(i), context.getString(q0cVar.b)));
        }
        n95.r((c9) dteVar.f.a, arrayList);
        bteVar.getClass();
        bteVar.a.r(arrayList);
    }

    @Override // defpackage.oh4
    public final void e() {
        if (this.b) {
            return;
        }
        this.b = true;
        this.c.b.a(this);
    }
}
