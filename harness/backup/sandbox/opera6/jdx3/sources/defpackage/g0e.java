package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final /* synthetic */ class g0e implements Function1 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ bp3 b;

    public /* synthetic */ g0e(bp3 bp3Var, byte b) {
        this.a = b;
        this.b = bp3Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        bp3 bp3Var = this.b;
        switch (b) {
            case 0:
                bp3Var.j();
                break;
            default:
                ((RecyclerView) bp3Var.f).postOnAnimation((Runnable) obj);
                break;
        }
        return Unit.a;
    }
}
