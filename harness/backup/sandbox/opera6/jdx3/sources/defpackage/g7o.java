package defpackage;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final /* synthetic */ class g7o extends nr9 implements Function1 {
    public static final g7o a = new g7o(1, a7o.class, "bind", "bind(Landroid/view/View;)Lcom/opera/android/databinding/WorldCupPromoCardRecommendedTeamsContentBinding;", 0);

    public final Object invoke(Object obj) {
        View view = (View) obj;
        int i = 2131362258;
        if (w1h.j(2131362258, view) != null) {
            i = 2131363092;
            View viewJ = w1h.j(2131363092, view);
            if (viewJ != null) {
                y6o y6oVarA = y6o.a(viewJ);
                RecyclerView recyclerViewJ = w1h.j(2131364032, view);
                if (recyclerViewJ != null) {
                    return new a7o(view, y6oVarA, recyclerViewJ);
                }
                i = 2131364032;
            }
        }
        t3p.q("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
        return null;
    }
}
