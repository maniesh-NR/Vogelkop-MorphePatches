package defpackage;

import android.view.View;
import com.google.android.material.button.MaterialButton;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final /* synthetic */ class k6o extends nr9 implements Function1 {
    public static final k6o a = new k6o(1, z6o.class, "bind", "bind(Landroid/view/View;)Lcom/opera/android/databinding/WorldCupPromoCardHomeTeamContentBinding;", 0);

    public final Object invoke(Object obj) {
        View view = (View) obj;
        int i = 2131362258;
        if (w1h.j(2131362258, view) != null) {
            i = 2131363010;
            MaterialButton materialButtonJ = w1h.j(2131363010, view);
            if (materialButtonJ != null) {
                i = 2131363092;
                View viewJ = w1h.j(2131363092, view);
                if (viewJ != null) {
                    return new z6o(view, materialButtonJ, y6o.a(viewJ));
                }
            }
        }
        t3p.q("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
        return null;
    }
}
