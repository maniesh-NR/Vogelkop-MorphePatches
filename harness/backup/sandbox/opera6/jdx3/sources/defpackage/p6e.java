package defpackage;

import android.content.SharedPreferences;
import android.content.res.Resources;
import com.appsflyer.internal.j;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final /* synthetic */ class p6e implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ wub b;
    public final /* synthetic */ ArrayList c;

    public /* synthetic */ p6e(wub wubVar, ArrayList arrayList, byte b) {
        this.a = b;
        this.b = wubVar;
        this.c = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() throws Resources.NotFoundException {
        byte b = this.a;
        ArrayList arrayList = this.c;
        wub wubVar = this.b;
        byte b2 = 1;
        switch (b) {
            case 0:
                q6e q6eVar = (q6e) wubVar.a;
                iri iriVar = q6eVar.b;
                try {
                    iri.p(new d9(wubVar, arrayList, (byte) 5), iriVar.h(true));
                    vml.e(new p6e(wubVar, iriVar.l(q6eVar.c, q6eVar.m, q6eVar.h), b2));
                    return;
                } finally {
                    iriVar.close();
                }
            default:
                q6e q6eVar2 = (q6e) wubVar.a;
                b59 b59Var = q6eVar2.j;
                long j = ((SharedPreferences) b59Var.get()).getLong("default_search_engine_long", -1L);
                l6e l6eVarC = j < 0 ? null : q6eVar2.c(j);
                ArrayList arrayList2 = q6eVar2.a;
                ArrayList arrayList3 = new ArrayList(arrayList2);
                arrayList3.removeAll(arrayList);
                q6eVar2.l.n(new oml(q6eVar2.k.c(new bw6(arrayList3, (byte) 2))), null);
                arrayList2.clear();
                arrayList2.addAll(arrayList);
                q6eVar2.j();
                if (((ibf) q6eVar2.i.i()).a(512)) {
                    q6eVar2.g(true);
                }
                l6e l6eVarF = l6eVarC != null ? q6eVar2.f(l6eVarC) : null;
                if (l6eVarF != null) {
                    ((SharedPreferences) b59Var.get()).edit().putLong("default_search_engine_long", l6eVarF.b).apply();
                } else {
                    j.a((SharedPreferences) b59Var.get(), "default_search_engine_long");
                }
                q6eVar2.i(q6eVar2.b());
                q6eVar2.l();
                return;
        }
    }
}
