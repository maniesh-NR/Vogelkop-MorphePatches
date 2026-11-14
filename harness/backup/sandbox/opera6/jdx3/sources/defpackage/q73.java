package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;

/* loaded from: classes.dex */
public abstract class q73 extends dej {
    @Override // defpackage.dej
    public final View a(Context context) {
        View viewInflate = LayoutInflater.from(context).inflate(2131559324, (ViewGroup) null, false);
        int i = 2131362527;
        if (w1h.j(2131362527, viewInflate) != null) {
            i = 2131363092;
            FrameLayout frameLayout = (FrameLayout) w1h.j(2131363092, viewInflate);
            if (frameLayout != null) {
                i = 2131363100;
                View viewJ = w1h.j(2131363100, viewInflate);
                if (viewJ != null) {
                    i = 2131363782;
                    LinearLayout linearLayout = (LinearLayout) w1h.j(2131363782, viewInflate);
                    if (linearLayout != null) {
                        FrameLayout frameLayout2 = (FrameLayout) viewInflate;
                        boolean z = d(frameLayout) != null;
                        frameLayout.setVisibility(z ? 0 : 8);
                        viewJ.setVisibility((!z || (this instanceof pxk)) ? 8 : 0);
                        qb7 qb7Var = new qb7();
                        qb7Var.c = this;
                        qb7Var.a = linearLayout;
                        qb7Var.b = LayoutInflater.from(linearLayout.getContext());
                        e(qb7Var);
                        return frameLayout2;
                    }
                }
            }
        }
        t3p.q("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
        return null;
    }

    public View d(FrameLayout frameLayout) {
        return null;
    }

    public abstract void e(qb7 qb7Var);
}
