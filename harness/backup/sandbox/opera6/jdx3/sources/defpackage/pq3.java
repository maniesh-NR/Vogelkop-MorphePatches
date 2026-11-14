package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Space;
import com.google.android.material.button.MaterialButton;
import com.opera.android.custom_views.OperaButtonBarLayout;

/* loaded from: classes.dex */
public final class pq3 implements a5n {
    public final /* synthetic */ byte a;
    public final OperaButtonBarLayout b;
    public final MaterialButton c;
    public final MaterialButton d;

    public /* synthetic */ pq3(OperaButtonBarLayout operaButtonBarLayout, MaterialButton materialButton, MaterialButton materialButton2, byte b) {
        this.a = b;
        this.b = operaButtonBarLayout;
        this.c = materialButton;
        this.d = materialButton2;
    }

    public static pq3 a(View view) {
        int i = 2131363659;
        MaterialButton materialButtonJ = w1h.j(2131363659, view);
        if (materialButtonJ != null) {
            i = 2131363917;
            MaterialButton materialButtonJ2 = w1h.j(2131363917, view);
            if (materialButtonJ2 != null) {
                i = 2131364511;
                if (((Space) w1h.j(2131364511, view)) != null) {
                    return new pq3((OperaButtonBarLayout) view, materialButtonJ, materialButtonJ2, (byte) 0);
                }
            }
        }
        t3p.q("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
        return null;
    }

    public static pq3 b(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(2131559457, viewGroup, false);
        viewGroup.addView(viewInflate);
        int i = 2131363659;
        MaterialButton materialButtonJ = w1h.j(2131363659, viewInflate);
        if (materialButtonJ != null) {
            i = 2131363917;
            MaterialButton materialButtonJ2 = w1h.j(2131363917, viewInflate);
            if (materialButtonJ2 != null) {
                i = 2131364511;
                if (((Space) w1h.j(2131364511, viewInflate)) != null) {
                    return new pq3((OperaButtonBarLayout) viewInflate, materialButtonJ, materialButtonJ2, (byte) 1);
                }
            }
        }
        t3p.q("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
        return null;
    }

    @Override // defpackage.a5n
    public final View getRoot() {
        byte b = this.a;
        return this.b;
    }
}
