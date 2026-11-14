package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.opera.android.custom_views.FadingRecyclerView;

/* loaded from: classes.dex */
public abstract class bqh extends lj {
    public kf r;

    @Override // defpackage.ltl, defpackage.k24
    public final void onDestroyView() {
        super.onDestroyView();
        this.r = null;
    }

    @Override // defpackage.ltl
    public final void v0(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        RecyclerView recyclerViewInflate = layoutInflater.inflate(2131559196, viewGroup, false);
        viewGroup.addView(recyclerViewInflate);
        if (recyclerViewInflate == null) {
            t3p.q("rootView");
            return;
        }
        RecyclerView recyclerView = (FadingRecyclerView) recyclerViewInflate;
        this.r = new kf((byte) 22, (View) recyclerView, (Object) recyclerView);
        if (getShowsDialog()) {
            FadingRecyclerView fadingRecyclerView = (FadingRecyclerView) this.r.c;
            if (fadingRecyclerView.N0 != null) {
                fadingRecyclerView.N0 = null;
                fadingRecyclerView.requestLayout();
            }
        }
    }
}
