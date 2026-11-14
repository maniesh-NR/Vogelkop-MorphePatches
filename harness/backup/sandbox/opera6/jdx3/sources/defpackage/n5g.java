package defpackage;

import android.content.Context;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.d;
import androidx.recyclerview.widget.i;
import com.google.android.material.button.MaterialButton;
import com.opera.android.custom_views.AnimationEmptyListView;
import com.opera.android.custom_views.StylingTextView;
import com.opera.android.widget.SelectableRelativeLayout;

/* loaded from: classes.dex */
public final class n5g extends d implements jvk {
    public final qfb a;
    public final w4g b;
    public final flb c;
    public final mvk d = nvk.v(2132018535);
    public final pad e = new pad((byte) 28, false);
    public d5g f = new d5g(l08.a, u3g.d, false, false, false, false, false);

    public n5g(Context context, qfb qfbVar, w4g w4gVar) {
        this.a = qfbVar;
        this.b = w4gVar;
        this.c = new flb(new nvk(context, this));
    }

    public final int getItemCount() {
        return this.f.k;
    }

    public final int getItemViewType(int i) {
        d5g d5gVar = this.f;
        if (i == d5gVar.j) {
            return 3;
        }
        if (i == d5gVar.i) {
            return 1;
        }
        return i == d5gVar.h ? 2 : 0;
    }

    @Override // defpackage.jvk
    public final void h(i iVar, hvk[] hvkVarArr) {
        mvk mvkVar = this.d;
        hvkVarArr[0] = mvkVar;
        hvkVarArr[1] = mvkVar;
    }

    @Override // defpackage.jvk
    public final void k(i iVar, hvk hvkVar) {
        w3g w3gVarA = this.f.a(iVar.getBindingAdapterPosition());
        vvf vvfVar = new vvf(this, iVar, (byte) 3);
        t5g t5gVar = (t5g) this.a.b;
        t6g t6gVarI0 = t5gVar.I0();
        ndc viewLifecycleOwner = t5gVar.getViewLifecycleOwner();
        ot2 ot2Var = t6gVarI0.b;
        ot2Var.b.c(new a27(w3gVarA.c), viewLifecycleOwner, new c0h(vvfVar, t6gVarI0, w3gVarA));
    }

    @Override // defpackage.jvk
    public final boolean n(i iVar) {
        return iVar instanceof k5g;
    }

    public final void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
        this.c.e(recyclerView);
    }

    public final void onBindViewHolder(i iVar, int i) {
        m5g m5gVar = (m5g) iVar;
        if (m5gVar != null) {
            byte b = 0;
            if (m5gVar instanceof k5g) {
                k5g k5gVar = (k5g) m5gVar;
                w3g w3gVarA = this.f.a(i);
                k5gVar.f = Integer.valueOf(w3gVarA.a);
                k5gVar.g = w3gVarA.b.a;
                String str = w3gVarA.c;
                k5gVar.h = str;
                new i4g(k5gVar.d, w3gVarA, k5gVar.e, k5gVar);
                vs vsVar = k5gVar.b;
                yq1 yq1Var = (StylingTextView) vsVar.e;
                yq1 yq1Var2 = (StylingTextView) vsVar.c;
                yq1Var.setText(str);
                String str2 = w3gVarA.f;
                yq1Var2.setText(str2);
                yq1Var2.setVisibility(str2.length() > 0 ? 0 : 8);
                ((SelectableRelativeLayout) vsVar.b).setOnClickListener(new j5g(k5gVar, w3gVarA, b));
                return;
            }
            if (m5gVar instanceof g5g) {
                d5g d5gVar = this.f;
                u3g u3gVar = d5gVar.b;
                boolean z = d5gVar.d;
                boolean z2 = d5gVar.e;
                boolean z3 = d5gVar.f;
                boolean z4 = d5gVar.g;
                f5g f5gVar = ((g5g) m5gVar).b;
                p5g p5gVar = f5gVar.d;
                AnimationEmptyListView animationEmptyListView = f5gVar.c;
                if (f5gVar.e != u3gVar) {
                    f5gVar.e = u3gVar;
                    animationEmptyListView.c(u3gVar.b);
                    animationEmptyListView.b(u3gVar.a);
                    int i2 = u3gVar.c;
                    if (i2 < -1) {
                        i2 = -1;
                    }
                    animationEmptyListView.c = i2;
                    animationEmptyListView.a();
                }
                ((i) f5gVar.a).itemView.setVisibility(z ? 0 : 8);
                ((i) f5gVar.b).itemView.setVisibility(z2 ? 0 : 8);
                p5gVar.setVisibility(z3 ? 0 : 8);
                ((MaterialButton) ((q5g) p5gVar.b).d).setVisibility(z4 ? 0 : 8);
            }
        }
    }

    public final i onCreateViewHolder(ViewGroup viewGroup, int i) {
        w4g w4gVar = this.b;
        qfb qfbVar = this.a;
        if (i == 0) {
            return new k5g(viewGroup, qfbVar, w4gVar);
        }
        if (i == 1) {
            return new i5g(viewGroup, qfbVar, (byte) 0);
        }
        if (i != 2) {
            return i != 3 ? new k5g(viewGroup, qfbVar, w4gVar) : new i5g(viewGroup, qfbVar, (byte) 1);
        }
        i5g i5gVar = new i5g(viewGroup, qfbVar, (byte) 0);
        i5g i5gVar2 = new i5g(viewGroup, qfbVar, (byte) 1);
        d5g d5gVar = this.f;
        return new g5g(viewGroup, i5gVar, i5gVar2, d5gVar.b, d5gVar.d, d5gVar.e, d5gVar.f, d5gVar.g, this.a);
    }

    public final void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        super.onDetachedFromRecyclerView(recyclerView);
        this.c.e(null);
    }
}
