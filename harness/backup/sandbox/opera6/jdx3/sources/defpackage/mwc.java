package defpackage;

import com.google.android.material.progressindicator.CircularProgressIndicator;
import com.opera.android.widget.RecyclerViewEmptyViewSwitcher;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final /* synthetic */ class mwc implements Function1 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ zse b;

    public /* synthetic */ mwc(zse zseVar, byte b) {
        this.a = b;
        this.b = zseVar;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        zse zseVar = this.b;
        switch (b) {
            case 0:
                if (!((List) obj).isEmpty()) {
                    y83 y83Var = zseVar.t;
                    ((CircularProgressIndicator) (y83Var != null ? y83Var : null).h).setVisibility(8);
                    break;
                } else {
                    break;
                }
            case 1:
                y83 y83Var2 = zseVar.t;
                ((RecyclerViewEmptyViewSwitcher) (y83Var2 != null ? y83Var2 : null).e).b();
                break;
            default:
                tse tseVar = (tse) obj;
                zseVar.H0(tseVar.a, tseVar.b);
                break;
        }
        return Unit.a;
    }
}
