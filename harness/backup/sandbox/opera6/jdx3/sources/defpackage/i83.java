package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.a;
import androidx.fragment.app.w;
import com.opera.android.BrowserActivity;
import com.opera.android.StatusBarDrawingFrameLayout;
import com.opera.android.custom_views.StylingImageView;
import com.opera.android.ui.catalog.widget.OperaMaterialButton;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public abstract class i83 extends ltl implements sni, jbl, View.OnClickListener {
    public final int r;
    public final int s;
    public final int t;
    public final int u;
    public ei v;
    public jp1 w;
    public jp1 x;
    public tni y;

    public i83(int i, int i2, int i3, int i4) {
        super((itl) u7k.j(2131558544).a);
        this.r = i;
        this.s = i2;
        this.t = i3;
        this.u = i4;
    }

    public Pair G0(View view) {
        int i = 2131363948;
        OperaMaterialButton operaMaterialButton = (OperaMaterialButton) w1h.j(2131363948, view);
        if (operaMaterialButton != null) {
            i = 2131364179;
            OperaMaterialButton operaMaterialButton2 = (OperaMaterialButton) w1h.j(2131364179, view);
            if (operaMaterialButton2 != null) {
                return new Pair(operaMaterialButton, operaMaterialButton2);
            }
        }
        t3p.q("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
        return null;
    }

    public void H0(ei eiVar) {
        TextView textView = (TextView) eiVar.h;
        Resources resources = textView.getResources();
        q9n.E(textView, resources.getDimensionPixelSize(2131165267), resources.getDimensionPixelSize(2131165266));
        AppCompatImageView appCompatImageView = (StylingImageView) eiVar.f;
        q9n.C(appCompatImageView.getResources().getDimensionPixelSize(2131165265), appCompatImageView);
    }

    public abstract void I0();

    @Override // defpackage.sni
    public final void Y(boolean z) {
        w parentFragmentManager = getParentFragmentManager();
        parentFragmentManager.getClass();
        a aVar = new a(parentFragmentManager);
        aVar.j(this);
        aVar.b(new xm9(this, 7));
        aVar.h();
    }

    @Override // defpackage.k24
    public final void onAttach(Context context) {
        super.onAttach(context);
        BrowserActivity browserActivityRequireActivity = requireActivity();
        int i = BrowserActivity.E1;
        tni tniVar = browserActivityRequireActivity.l;
        this.y = tniVar;
        tniVar.a(this);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (view == this.w) {
            I0();
        }
    }

    @Override // defpackage.ltl, defpackage.k24
    public final void onDestroyView() {
        super.onDestroyView();
        this.v = null;
        this.w = null;
        this.x = null;
    }

    @Override // defpackage.k24
    public final void onDetach() {
        super.onDetach();
        this.y.c(this);
        this.y = null;
    }

    @Override // defpackage.k24
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        ((TextView) this.v.h).setText(this.r);
        ((TextView) this.v.i).setText(this.s);
        this.w.setText(this.u);
        this.w.setOnClickListener(this);
        this.x.setVisibility(8);
        View view2 = this.v.g;
        if (view2 != null) {
            view2.setVisibility(8);
        }
        H0(this.v);
    }

    @Override // defpackage.ltl
    public final int s0() {
        return 2132018253;
    }

    @Override // defpackage.ltl
    public final int t0(Context context) {
        return 2131232034;
    }

    @Override // defpackage.ltl
    public final void y0(LayoutInflater layoutInflater, StatusBarDrawingFrameLayout statusBarDrawingFrameLayout) {
        WeakHashMap weakHashMap = r5n.a;
        ViewGroup viewGroup = (ViewGroup) ((View) m5n.f(statusBarDrawingFrameLayout, 2131362409));
        ConstraintLayout constraintLayoutInflate = layoutInflater.inflate(2131558543, viewGroup, false);
        viewGroup.addView(constraintLayoutInflate);
        int i = 2131362056;
        ViewStub viewStub = (ViewStub) w1h.j(2131362056, constraintLayoutInflate);
        if (viewStub != null) {
            w1h.j(2131362293, constraintLayoutInflate);
            i = 2131362414;
            FrameLayout frameLayout = (FrameLayout) w1h.j(2131362414, constraintLayoutInflate);
            if (frameLayout != null) {
                i = 2131363185;
                StylingImageView stylingImageView = (StylingImageView) w1h.j(2131363185, constraintLayoutInflate);
                if (stylingImageView != null) {
                    i = 2131363509;
                    TextView textView = (TextView) w1h.j(2131363509, constraintLayoutInflate);
                    if (textView != null) {
                        View viewJ = w1h.j(2131363949, constraintLayoutInflate);
                        View viewJ2 = w1h.j(2131364180, constraintLayoutInflate);
                        i = 2131363525;
                        TextView textView2 = (TextView) w1h.j(2131363525, constraintLayoutInflate);
                        if (textView2 != null) {
                            this.v = new ei(constraintLayoutInflate, viewStub, frameLayout, stylingImageView, textView, viewJ, viewJ2, textView2);
                            viewStub.setLayoutResource(this.t);
                            Pair pairG0 = G0(((ViewStub) this.v.c).inflate());
                            this.w = (jp1) pairG0.first;
                            this.x = (jp1) pairG0.second;
                            View view = this.v.d;
                            return;
                        }
                    }
                }
            }
        }
        t3p.q("Missing required view with ID: ".concat(constraintLayoutInflate.getResources().getResourceName(i)));
    }
}
