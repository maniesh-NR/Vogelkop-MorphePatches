package defpackage;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.opera.android.custom_views.StylingImageView;

/* loaded from: classes.dex */
public final class i0h extends j83 {
    public static final cs f = new cs((byte) 5);
    public final gjm a;
    public final p0h b;
    public final x5f c;
    public final xol d = new xol(this);
    public q5g e;

    public i0h(gjm gjmVar, p0h p0hVar, x5f x5fVar) {
        this.a = gjmVar;
        this.b = p0hVar;
        this.c = x5fVar;
    }

    @Override // defpackage.j83
    public final View f0(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        ConstraintLayout constraintLayoutInflate = layoutInflater.inflate(2131559245, viewGroup, false);
        int i = 2131362548;
        View viewJ = w1h.j(2131362548, constraintLayoutInflate);
        if (viewJ != null) {
            i = 2131363328;
            RecyclerView recyclerViewJ = w1h.j(2131363328, constraintLayoutInflate);
            if (recyclerViewJ != null) {
                i = 2131363509;
                if (((TextView) w1h.j(2131363509, constraintLayoutInflate)) != null) {
                    i = 2131363880;
                    if (((StylingImageView) w1h.j(2131363880, constraintLayoutInflate)) != null) {
                        i = 2131363525;
                        if (((TextView) w1h.j(2131363525, constraintLayoutInflate)) != null) {
                            ConstraintLayout constraintLayout = constraintLayoutInflate;
                            this.e = new q5g(constraintLayout, viewJ, recyclerViewJ, (byte) 2);
                            return constraintLayout;
                        }
                    }
                }
            }
        }
        t3p.q("Missing required view with ID: ".concat(constraintLayoutInflate.getResources().getResourceName(i)));
        return null;
    }

    public final void onDestroyView() {
        super.onDestroyView();
        this.e = null;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.b.h.j(getViewLifecycleOwner(), new qzg(this, (byte) 3));
        RecyclerView recyclerView = (RecyclerView) this.e.d;
        recyclerView.getContext();
        recyclerView.C0(new LinearLayoutManager());
        ((RecyclerView) this.e.d).y0(this.d);
        RecyclerView recyclerView2 = (RecyclerView) this.e.d;
        kkf kkfVar = new kkf(this, (byte) 5);
        dll dllVarS = q9n.s(recyclerView2);
        if (dllVarS == null) {
            return;
        }
        u8n.b(dllVarS, recyclerView2, kkfVar);
    }
}
