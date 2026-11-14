package defpackage;

import android.content.Context;
import com.opera.api.Callback;
import java.util.ArrayList;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class gq3 extends zz1 {
    public final zv3 n;
    public final ize o;
    public final Runnable p;

    public gq3(Context context, ndc ndcVar, zv3 zv3Var, ize izeVar, Runnable runnable, esk eskVar, mlj mljVar, Callback callback, Function2 function2, esk eskVar2, g7m g7mVar, k42 k42Var, v5n v5nVar, gjm gjmVar) {
        super(context, ndcVar, eskVar, mljVar, callback, function2, eskVar2, g7mVar, k42Var, v5nVar, gjmVar);
        this.n = zv3Var;
        this.o = izeVar;
        this.p = runnable;
    }

    @Override // defpackage.zz1
    public final void b() {
        this.p.run();
    }

    @Override // defpackage.zz1
    public final void d(String str, boolean z) {
        vz1.a.getClass();
        vz1 vz1VarN = psp.n(str);
        if (vz1VarN != null) {
            f(vz1VarN);
        } else {
            uv0.b((uv0) this.n.get(), str, ((Boolean) this.o.g()).booleanValue() ? 2 : 3, null, false, false, new oc2(this, (byte) 16), 4);
        }
    }

    @Override // defpackage.zz1
    public final void e(String str, ArrayList arrayList) {
        ((uv0) this.n.get()).c(arrayList, ((Boolean) this.o.g()).booleanValue() ? 2 : 3, str, false, null);
    }

    @Override // defpackage.zz1
    public final void g(String str) {
        b();
        ((uv0) this.n.get()).a(((Boolean) this.o.g()).booleanValue() ? 2 : 3, 1, str, true);
    }
}
