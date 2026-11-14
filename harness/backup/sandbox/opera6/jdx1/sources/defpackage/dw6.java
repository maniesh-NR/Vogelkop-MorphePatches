package defpackage;

import android.view.ViewGroup;
import androidx.fragment.app.g;
import androidx.fragment.app.w;
import java.util.Objects;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class dw6 extends ozb implements Function0 {
    public final /* synthetic */ g i;
    public final /* synthetic */ ViewGroup j;
    public final /* synthetic */ Object k;
    public final /* synthetic */ pqh l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dw6(g gVar, ViewGroup viewGroup, Object obj, pqh pqhVar) {
        super(0);
        this.i = gVar;
        this.j = viewGroup;
        this.k = obj;
        this.l = pqhVar;
    }

    public final Object invoke() {
        g gVar = this.i;
        gn9 gn9Var = gVar.f;
        ViewGroup viewGroup = this.j;
        Object obj = this.k;
        Object objI = gn9Var.i(viewGroup, obj);
        gVar.q = objI;
        if (objI == null) {
            gVar.r = true;
        } else {
            this.l.a = new cw6(gVar, obj, viewGroup);
            if (w.N(2)) {
                Objects.toString(gVar.d);
                Objects.toString(gVar.e);
            }
        }
        return Unit.a;
    }
}
