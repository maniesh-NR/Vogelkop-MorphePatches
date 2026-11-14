package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.i;
import com.google.android.material.chip.Chip;
import com.opera.android.suggestion.CompactSuggestionView;
import com.opera.android.suggestion.Suggestion;
import com.opera.android.suggestion.adapter.SuggestionListActionItem;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* loaded from: classes.dex */
public final class rc5 extends pa3 {
    public static final ixh d = new ixh(18.0f);
    public static final ixh e = new ixh(1.0f);
    public final /* synthetic */ byte b = 2;
    public final Object c;

    /* JADX WARN: Illegal instructions before constructor call */
    public rc5(hl4 hl4Var, hqk hqkVar, pde pdeVar, nv6 nv6Var) {
        RecyclerView recyclerView = hl4Var.b;
        super(recyclerView);
        dt1 dt1Var = new dt1();
        dt1Var.J(Suggestion.class, new xj(nv6Var, hqkVar, (byte) 26), new t14((byte) 19), new a3j((byte) 4));
        this.c = dt1Var;
        recyclerView.m(new ou1((byte) 2, new ixh(8.0f).k(recyclerView.getContext())));
        recyclerView.y0(dt1Var);
        a26.T(pdeVar, (kze) new z61(recyclerView).b, new wj(this, recyclerView, (byte) 1));
    }

    public rc5(kf kfVar) {
        super((SuggestionListActionItem) kfVar.b);
        this.c = kfVar;
    }

    public rc5(kf kfVar, thk thkVar, nv6 nv6Var, hqk hqkVar, boolean z, boolean z2, boolean z3) {
        super((CompactSuggestionView) kfVar.b);
        this.c = kfVar;
        CompactSuggestionView compactSuggestionView = (CompactSuggestionView) kfVar.c;
        compactSuggestionView.d = nv6Var;
        compactSuggestionView.c = hqkVar;
        compactSuggestionView.h = z2;
        compactSuggestionView.i = z;
        compactSuggestionView.m = z3 ? new jl4((Object) this, (byte) 14) : null;
    }

    public rc5(swc swcVar) {
        super(swcVar.b);
        this.c = swcVar;
    }

    public static LayerDrawable Z(Drawable drawable, Context context, int i) {
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{drawable, new p05(e.k(context), f03.t(2130969115, context, 2131101243), i)});
        layerDrawable.setLayerGravity(0, 17);
        layerDrawable.setLayerGravity(1, 17);
        return layerDrawable;
    }

    @Override // defpackage.pa3
    public final void U(gqk gqkVar, String str) {
        byte b = this.b;
        byte b2 = 1;
        Object obj = this.c;
        switch (b) {
            case 0:
                bqk bqkVar = (bqk) gqkVar;
                CompactSuggestionView compactSuggestionView = (CompactSuggestionView) ((kf) obj).c;
                compactSuggestionView.k = bqkVar.a == 18 ? (byte) 3 : (byte) 2;
                ArrayList arrayList = bqkVar.c;
                int size = arrayList.size();
                Collection collectionSubList = arrayList;
                if (size > 20) {
                    collectionSubList = arrayList.subList(0, 20);
                }
                d5o d5oVar = compactSuggestionView.b;
                d5oVar.a = collectionSubList;
                d5oVar.b = str;
                CompactSuggestionView compactSuggestionView2 = (CompactSuggestionView) d5oVar.c;
                ArrayList arrayList2 = compactSuggestionView2.e;
                d5o d5oVar2 = compactSuggestionView2.b;
                while (((List) d5oVar2.a).size() > arrayList2.size()) {
                    qc5 qc5Var = new qc5(compactSuggestionView2, compactSuggestionView2, compactSuggestionView2.m);
                    arrayList2.add(qc5Var);
                    compactSuggestionView2.addView(qc5Var.b);
                }
                int i = 0;
                while (i < ((List) d5oVar2.a).size()) {
                    qc5 qc5Var2 = (qc5) arrayList2.get(i);
                    Suggestion suggestion = (Suggestion) ((List) d5oVar2.a).get(i);
                    ((List) d5oVar2.a).size();
                    i++;
                    float fPow = (float) (1.0d / Math.pow(i, 0.5d));
                    qc5Var2.e = 0;
                    qc5Var2.d = suggestion;
                    Chip chip = qc5Var2.b;
                    chip.setText(suggestion.b);
                    chip.setVisibility(0);
                    chip.setPressed(false);
                    chip.setSelected(suggestion.a == 28);
                    chip.getBackground().jumpToCurrentState();
                    qc5Var2.c.b = fPow;
                    qc5Var2.a();
                    nv6 nv6Var = qc5Var2.f.d;
                    if (nv6Var != null) {
                        nv6Var.D(qc5Var2.d);
                    }
                }
                for (int size2 = ((List) d5oVar2.a).size(); size2 < arrayList2.size(); size2++) {
                    qc5 qc5Var3 = (qc5) arrayList2.get(size2);
                    qc5Var3.e = 0;
                    qc5Var3.d = null;
                    qc5Var3.b.setVisibility(8);
                    jxb jxbVar = qc5Var3.c;
                    jxbVar.b = 0.0f;
                    jxbVar.a = Integer.MAX_VALUE;
                }
                compactSuggestionView2.g = 0;
                compactSuggestionView2.a(compactSuggestionView2.getMeasuredWidth());
                compactSuggestionView2.requestLayout();
                break;
            case 1:
                eqk eqkVar = (eqk) gqkVar;
                kf kfVar = (kf) obj;
                SuggestionListActionItem suggestionListActionItem = (SuggestionListActionItem) kfVar.b;
                suggestionListActionItem.a = true;
                suggestionListActionItem.setOnClickListener(new gf(eqkVar, b2));
                TextView textView = (TextView) kfVar.c;
                textView.setText(eqkVar.d.a(textView.getResources()));
                break;
            case 3:
                ((swc) obj).c.setText(((zpk) gqkVar).c.a(((i) this).itemView.getResources()));
                break;
        }
    }

    @Override // defpackage.pa3
    public final boolean V() {
        switch (this.b) {
            case 0:
                CompactSuggestionView compactSuggestionView = (CompactSuggestionView) ((kf) this.c).c;
                return compactSuggestionView.e.size() < (compactSuggestionView.h ? 20 : 10);
            default:
                return super.V();
        }
    }

    @Override // defpackage.pa3
    public final void X() {
        switch (this.b) {
            case 0:
                CompactSuggestionView compactSuggestionView = (CompactSuggestionView) ((kf) this.c).c;
                ArrayList arrayList = compactSuggestionView.e;
                if (arrayList.size() < (compactSuggestionView.h ? 20 : 10)) {
                    qc5 qc5Var = new qc5(compactSuggestionView, compactSuggestionView, compactSuggestionView.m);
                    arrayList.add(qc5Var);
                    compactSuggestionView.addView(qc5Var.b);
                    break;
                }
                break;
        }
    }

    @Override // defpackage.pa3
    public final void Y() {
        switch (this.b) {
            case 1:
                kf kfVar = (kf) this.c;
                SuggestionListActionItem suggestionListActionItem = (SuggestionListActionItem) kfVar.b;
                suggestionListActionItem.a = false;
                suggestionListActionItem.setOnClickListener(null);
                ((TextView) kfVar.c).setText((CharSequence) null);
                break;
        }
    }
}
