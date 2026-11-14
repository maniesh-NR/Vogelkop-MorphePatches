package defpackage;

import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.google.android.material.button.MaterialButton;
import com.opera.android.custom_views.LayoutDirectionLinearLayout;
import com.opera.android.custom_views.StylingTextView;
import com.opera.android.touch.CurveOverlayView;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class ed9 extends s63 implements jbl {
    @Override // defpackage.s63
    public final dgh s0(LayoutInflater layoutInflater, ViewGroup viewGroup, epj epjVar) {
        g77 g77Var;
        int iOrdinal = epjVar.ordinal();
        int i = 2131363509;
        if (iOrdinal != 0) {
            if (iOrdinal != 1 && iOrdinal != 2 && iOrdinal != 3 && iOrdinal != 4) {
                h9o.p();
                return null;
            }
            if (viewGroup == null) {
                t3p.q("parent");
                return null;
            }
            layoutInflater.inflate(2131558845, viewGroup);
            MaterialButton materialButtonJ = w1h.j(2131362399, viewGroup);
            if (materialButtonJ == null) {
                i = 2131362399;
            } else if (((CurveOverlayView) w1h.j(2131362467, viewGroup)) == null) {
                i = 2131362467;
            } else if (((LayoutDirectionLinearLayout) w1h.j(2131363145, viewGroup)) != null) {
                StylingTextView stylingTextView = (StylingTextView) w1h.j(2131363509, viewGroup);
                if (stylingTextView != null) {
                    g77Var = new g77(materialButtonJ, stylingTextView, ick.a);
                }
            } else {
                i = 2131363145;
            }
            t3p.q("Missing required view with ID: ".concat(viewGroup.getResources().getResourceName(i)));
            return null;
        }
        if (viewGroup == null) {
            t3p.q("parent");
            return null;
        }
        layoutInflater.inflate(2131558846, viewGroup);
        MaterialButton materialButtonJ2 = w1h.j(2131362399, viewGroup);
        if (materialButtonJ2 == null) {
            i = 2131362399;
        } else if (((CurveOverlayView) w1h.j(2131362467, viewGroup)) != null) {
            LinearLayout linearLayout = (LinearLayout) w1h.j(2131362704, viewGroup);
            if (linearLayout == null) {
                i = 2131362704;
            } else if (((LayoutDirectionLinearLayout) w1h.j(2131363145, viewGroup)) != null) {
                StylingTextView stylingTextView2 = (StylingTextView) w1h.j(2131363509, viewGroup);
                if (stylingTextView2 != null) {
                    i = 2131364554;
                    FrameLayout frameLayout = (FrameLayout) w1h.j(2131364554, viewGroup);
                    if (frameLayout != null) {
                        g77Var = new g77(materialButtonJ2, stylingTextView2, new kck(Arrays.asList(frameLayout, linearLayout)));
                    }
                }
            } else {
                i = 2131363145;
            }
        } else {
            i = 2131362467;
        }
        t3p.q("Missing required view with ID: ".concat(viewGroup.getResources().getResourceName(i)));
        return null;
        ((MaterialButton) g77Var.a).setOnClickListener(new yk4(this, (byte) 26));
        Resources resources = getResources();
        yq1 yq1Var = (StylingTextView) g77Var.b;
        phj.c0(yq1Var, resources.getString(2132019085, "opera.com/connect"), "opera.com/connect", "opera.com/connect", new dd9(yq1Var.getContext()));
        return (dgh) g77Var.c;
    }

    @Override // defpackage.jbl
    public final String y() {
        return "flow-scan-intro";
    }
}
