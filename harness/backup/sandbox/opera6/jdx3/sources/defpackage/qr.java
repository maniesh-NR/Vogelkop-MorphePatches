package defpackage;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.d;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public abstract class qr implements as6 {
    public final Function0 a;
    public d b;

    public qr(Function0 function0) {
        this.a = function0;
    }

    public abstract d a(RecyclerView recyclerView);

    public final Object b(Object obj) {
        tcc lifecycle = ((Fragment) obj).getViewLifecycleOwner().getLifecycle();
        d dVar = this.b;
        if (dVar != null) {
            return dVar;
        }
        lifecycle.a(this);
        d dVarA = a((RecyclerView) this.a.invoke());
        this.b = dVarA;
        return dVarA;
    }

    @Override // defpackage.as6
    public final void onDestroy(ndc ndcVar) {
        ndcVar.getLifecycle().b(this);
        this.b = null;
    }
}
