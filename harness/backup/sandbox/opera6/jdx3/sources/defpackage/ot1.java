package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Checkable;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import com.opera.android.custom_views.StylingImageView;
import com.opera.android.custom_views.StylingTextView;

/* loaded from: classes.dex */
public final class ot1 extends FrameLayout implements Checkable {
    public final pt1 a;
    public boolean b;

    public ot1(Context context) {
        super(context, null, 0, 0);
        LayoutInflater.from(context).inflate(2131558489, this);
        int i = 2131362043;
        AppCompatImageView appCompatImageView = (StylingImageView) w1h.j(2131362043, this);
        if (appCompatImageView != null) {
            i = 2131362121;
            StylingImageView stylingImageView = (StylingImageView) w1h.j(2131362121, this);
            if (stylingImageView != null) {
                i = 2131362454;
                yq1 yq1Var = (StylingTextView) w1h.j(2131362454, this);
                if (yq1Var != null) {
                    i = 2131364086;
                    LinearLayout linearLayout = (LinearLayout) w1h.j(2131364086, this);
                    if (linearLayout != null) {
                        i = 2131364210;
                        FrameLayout frameLayout = (FrameLayout) w1h.j(2131364210, this);
                        if (frameLayout != null) {
                            this.a = new pt1((ViewGroup) this, (View) appCompatImageView, (Object) stylingImageView, (View) yq1Var, (View) linearLayout, (View) frameLayout, (byte) 0);
                            setClickable(true);
                            setFocusable(true);
                            setForeground(sfe.M(getResources().getDimensionPixelSize(2131165501), context));
                            return;
                        }
                    }
                }
            }
        }
        t3p.q("Missing required view with ID: ".concat(getResources().getResourceName(i)));
        throw null;
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.b;
    }

    @Override // android.widget.Checkable
    public final void setChecked(boolean z) {
        if (this.b != z) {
            this.b = z;
            ((FrameLayout) this.a.b).setVisibility(z ? 0 : 8);
        }
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        this.b = !this.b;
    }
}
