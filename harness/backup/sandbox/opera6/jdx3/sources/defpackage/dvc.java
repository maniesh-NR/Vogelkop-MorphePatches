package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.opera.android.StatusBarDrawingFrameLayout;
import com.opera.android.custom_views.ActionBarSearchView;
import com.opera.android.custom_views.AnimationEmptyListView;
import com.opera.android.custom_views.FadingRecyclerView;
import com.opera.android.widget.RecyclerViewEmptyViewSwitcher;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class dvc extends lj {
    public final pyl r;
    public final yqa s;
    public gvc t;
    public ActionBarSearchView u;
    public TextView v;

    /* JADX WARN: Illegal instructions before constructor call */
    public dvc(fqe fqeVar, x77 x77Var, yqa yqaVar) {
        u7k u7kVarJ = u7k.j(2131559305);
        u7kVarJ.s(2132018218);
        itl itlVar = (itl) u7kVarJ.a;
        itlVar.b = 0;
        super(itlVar);
        this.r = new pyl(fqeVar, x77Var);
        this.s = yqaVar;
    }

    @Override // defpackage.ltl, defpackage.k24
    public final void onDestroyView() {
        super.onDestroyView();
        TextView textView = this.v;
        if (textView != null) {
            textView.setOnFocusChangeListener(null);
            this.v = null;
        }
        ActionBarSearchView actionBarSearchView = this.u;
        if (actionBarSearchView != null) {
            actionBarSearchView.setOnQueryTextListener((hti) null);
            this.u = null;
        }
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [android.view.View, androidx.recyclerview.widget.RecyclerView, com.opera.android.custom_views.FadingRecyclerView, com.opera.android.custom_views.RecyclerViewForScreenshot] */
    @Override // defpackage.ltl
    public final void y0(LayoutInflater layoutInflater, StatusBarDrawingFrameLayout statusBarDrawingFrameLayout) {
        WeakHashMap weakHashMap = r5n.a;
        ViewGroup viewGroup = (ViewGroup) ((View) m5n.f(statusBarDrawingFrameLayout, 2131362409));
        bvc bvcVar = new bvc(this);
        pyl pylVar = this.r;
        pylVar.getClass();
        this.t = new gvc(bvcVar, new ArrayList((ArrayList) ((x77) pylVar.c).c));
        View viewInflate = layoutInflater.inflate(2131559303, viewGroup, false);
        viewGroup.addView(viewInflate);
        int i = 2131363355;
        ?? r1 = (FadingRecyclerView) w1h.j(2131363355, viewInflate);
        if (r1 != 0) {
            i = 2131363895;
            if (((AnimationEmptyListView) w1h.j(2131363895, viewInflate)) != null) {
                i = 2131364033;
                RecyclerViewEmptyViewSwitcher recyclerViewEmptyViewSwitcher = (RecyclerViewEmptyViewSwitcher) w1h.j(2131364033, viewInflate);
                if (recyclerViewEmptyViewSwitcher != null) {
                    recyclerViewEmptyViewSwitcher.a(new bvc(this));
                    r1.getContext();
                    r1.C0(new LinearLayoutManager());
                    r1.B0(null);
                    r1.y0(this.t);
                    this.t.registerAdapterDataObserver(new cvc(recyclerViewEmptyViewSwitcher));
                    ActionBarSearchView actionBarSearchViewFindViewById = statusBarDrawingFrameLayout.findViewById(2131364148);
                    this.u = actionBarSearchViewFindViewById;
                    actionBarSearchViewFindViewById.setQueryHint(getString(2132018217));
                    this.u.setOnQueryTextListener(new wub(this));
                    LinearLayout linearLayout = (LinearLayout) this.u.findViewById(2131364153);
                    LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) linearLayout.getLayoutParams();
                    layoutParams.rightMargin = 0;
                    layoutParams.leftMargin = 0;
                    linearLayout.setLayoutParams(layoutParams);
                    TextView textView = (TextView) this.u.findViewById(2131364166);
                    this.v = textView;
                    if (textView != null) {
                        q9n.f(this.u, new lzb(this, (byte) 6));
                        this.v.setOnFocusChangeListener(new y39(this, (byte) 1));
                        return;
                    }
                    return;
                }
            }
        }
        t3p.q("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }
}
