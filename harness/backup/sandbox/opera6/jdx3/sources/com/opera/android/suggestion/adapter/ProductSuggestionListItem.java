package com.opera.android.suggestion.adapter;

import android.R;
import android.content.Context;
import android.content.res.Configuration;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.opera.android.custom_views.CircleImageView;
import com.opera.android.suggestion.Suggestion;
import com.opera.android.ui.catalog.widget.OperaTextView;
import defpackage.c3h;
import defpackage.d8e;
import defpackage.ecd;
import defpackage.gjf;
import defpackage.gpj;
import defpackage.ixh;
import defpackage.kkf;
import defpackage.nr8;
import defpackage.p8f;
import defpackage.pbj;
import defpackage.pt1;
import defpackage.pvb;
import defpackage.q9n;
import java.util.LinkedHashSet;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/opera/android/suggestion/adapter/ProductSuggestionListItem;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Lpvb;", "app"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ProductSuggestionListItem extends ConstraintLayout implements pvb {
    public static final int[] u = {R.attr.state_focused};
    public Suggestion p;
    public final pt1 q;
    public final pbj r;
    public boolean s;
    public final LinkedHashSet t;

    /* JADX WARN: Multi-variable type inference failed */
    public ProductSuggestionListItem(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0, 0);
        LayoutInflater.from(context).inflate(2131559248, (ViewGroup) this);
        int i = 2131363933;
        View view = (ImageView) w1h.j(2131363933, this);
        if (view != null) {
            i = 2131363942;
            OperaTextView operaTextViewJ = w1h.j(2131363942, this);
            if (operaTextViewJ != null) {
                i = 2131364459;
                AppCompatImageView appCompatImageView = (CircleImageView) w1h.j(2131364459, this);
                if (appCompatImageView != null) {
                    i = 2131364578;
                    OperaTextView operaTextViewJ2 = w1h.j(2131364578, this);
                    if (operaTextViewJ2 != null) {
                        i = 2131363525;
                        OperaTextView operaTextViewJ3 = w1h.j(2131363525, this);
                        if (operaTextViewJ3 != null) {
                            this.q = new pt1((ViewGroup) this, view, (Object) operaTextViewJ, (View) appCompatImageView, (View) operaTextViewJ2, (View) operaTextViewJ3, (byte) 15);
                            this.t = new LinkedHashSet();
                            gjf gjfVarA = gjf.a(context);
                            view.setBackground(new ecd(gjfVarA, 2));
                            pbj pbjVar = new pbj(gjfVarA, 2, new ixh(1.0f).l(context), 0, -1);
                            this.r = pbjVar;
                            view.setForeground(pbjVar);
                            kkf kkfVar = new kkf(this, (byte) 6);
                            q9n.e(view, kkfVar);
                            kkfVar.a(view);
                            return;
                        }
                    }
                }
            }
        }
        t3p.q("Missing required view with ID: ".concat(getResources().getResourceName(i)));
        throw null;
    }

    @Override // defpackage.pvb
    public final String c() {
        Suggestion suggestion = this.p;
        String str = suggestion != null ? suggestion.b : null;
        return str == null ? "" : str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.pvb
    public final View getView() {
        return this;
    }

    @Override // defpackage.pvb
    /* renamed from: j */
    public final boolean getA() {
        return this.p != null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.pvb
    public final i1 m() {
        Suggestion suggestion = this.p;
        String strA = suggestion != null ? suggestion.a() : null;
        Suggestion suggestion2 = this.p;
        String str = suggestion2 != null ? suggestion2.h : null;
        if (strA == null || strA.length() == 0 || str == null || str.length() == 0) {
            return null;
        }
        return new i1(str, strA, nr8.e(getContext()));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onConfigurationChanged(Configuration configuration) {
        super/*android.view.View*/.onConfigurationChanged(configuration);
        Context context = getContext();
        gpj gpjVarS = ddh.s(r9n.i(context).height(), context);
        gpj gpjVar = gpj.a;
        if (gpjVarS.d()) {
            int iK = new ixh(64.0f).k(getContext());
            if (iK != ((ConstraintLayout) this).e) {
                ((ConstraintLayout) this).e = iK;
                requestLayout();
                return;
            }
            return;
        }
        int iK2 = new ixh(72.0f).k(getContext());
        if (iK2 == ((ConstraintLayout) this).e) {
            return;
        }
        ((ConstraintLayout) this).e = iK2;
        requestLayout();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int[] onCreateDrawableState(int i) {
        return isSelected() ? View.mergeDrawableStates(super/*android.view.View*/.onCreateDrawableState(i + 1), u) : super/*android.view.View*/.onCreateDrawableState(i);
    }

    public final void r(String str, int i, boolean z, Function0 function0) {
        dwh dwhVarI = yne.b.i(str);
        gvh gvhVar = dwhVarI.b;
        if (z) {
            gvhVar.k = true;
        }
        gvhVar.b(i, i);
        dwhVarI.b();
        dwhVarI.g((CircleImageView) this.q.c, new p8f((byte) 8, (Object) this, (Object) function0, str));
    }

    public final void s(c3h c3hVar, int i) {
        String str = c3hVar.e;
        if (str.equals(c3hVar.d) || this.t.contains(str)) {
            ((CircleImageView) this.q.c).setVisibility(8);
        } else {
            r(str, i, false, new d8e(this, (byte) 21));
        }
    }

    public final void t() {
        boolean z = this.s;
        pt1 pt1Var = this.q;
        if (!z) {
            ((ImageView) pt1Var.e).setImageTintList(null);
            ImageView imageView = (ImageView) pt1Var.e;
            imageView.setBackgroundTintList(f03.W(2130969115, imageView.getContext()));
        } else {
            ImageView imageView2 = (ImageView) pt1Var.e;
            ImageView imageView3 = (ImageView) pt1Var.e;
            imageView2.setImageResource(2131232534);
            imageView3.setImageTintList(f03.W(2130969288, imageView3.getContext()));
            imageView3.setBackgroundTintList(f03.W(2130969329, imageView3.getContext()));
        }
    }
}
