package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.opera.android.ui.catalog.widget.OperaTextView;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final /* synthetic */ class d6o extends nr9 implements Function1 {
    public static final d6o a = new d6o(1, x6o.class, "bind", "bind(Landroid/view/View;)Lcom/opera/android/databinding/WorldCupPromoCardGreatBritainContentBinding;", 0);

    public final Object invoke(Object obj) {
        View view = (View) obj;
        int i = 2131362258;
        if (w1h.j(2131362258, view) != null) {
            i = 2131362717;
            LinearLayout linearLayout = (LinearLayout) w1h.j(2131362717, view);
            if (linearLayout != null) {
                i = 2131362718;
                ImageView imageView = (ImageView) w1h.j(2131362718, view);
                if (imageView != null) {
                    i = 2131362719;
                    OperaTextView operaTextViewJ = w1h.j(2131362719, view);
                    if (operaTextViewJ != null) {
                        i = 2131363092;
                        View viewJ = w1h.j(2131363092, view);
                        if (viewJ != null) {
                            y6o y6oVarA = y6o.a(viewJ);
                            i = 2131364130;
                            LinearLayout linearLayout2 = (LinearLayout) w1h.j(2131364130, view);
                            if (linearLayout2 != null) {
                                i = 2131364131;
                                ImageView imageView2 = (ImageView) w1h.j(2131364131, view);
                                if (imageView2 != null) {
                                    i = 2131364132;
                                    OperaTextView operaTextViewJ2 = w1h.j(2131364132, view);
                                    if (operaTextViewJ2 != null) {
                                        return new x6o(view, linearLayout, imageView, operaTextViewJ, y6oVarA, linearLayout2, imageView2, operaTextViewJ2);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        t3p.q("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
        return null;
    }
}
