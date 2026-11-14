package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.drawable.LayerDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.chip.Chip;
import com.opera.android.suggestion.CompactSuggestionChip;
import com.opera.android.suggestion.CompactSuggestionView;
import com.opera.android.suggestion.Suggestion;

/* loaded from: classes.dex */
public final class qc5 implements View.OnClickListener {
    public final jl4 a;
    public final CompactSuggestionChip b;
    public final jxb c = new jxb(this);
    public Suggestion d;
    public int e;
    public final /* synthetic */ CompactSuggestionView f;

    /* JADX WARN: Type inference failed for: r2v5, types: [android.view.View, com.opera.android.suggestion.CompactSuggestionChip] */
    public qc5(CompactSuggestionView compactSuggestionView, CompactSuggestionView compactSuggestionView2, jl4 jl4Var) {
        this.f = compactSuggestionView;
        this.a = jl4Var;
        byte b = 0;
        Object objInflate = LayoutInflater.from(compactSuggestionView2.getContext()).inflate(2131558606, (ViewGroup) null, false);
        if (objInflate == null) {
            t3p.q("rootView");
            throw null;
        }
        ?? r2 = (CompactSuggestionChip) objInflate;
        this.b = r2;
        r2.A = new lb4(this, (byte) 20);
        r2.setOnClickListener(this);
        r2.setVisibility(8);
        pc5 pc5Var = new pc5(this, b);
        dll dllVarS = q9n.s(r2);
        if (dllVarS == null) {
            return;
        }
        u8n.b(dllVarS, r2, pc5Var);
    }

    public final void a() {
        etc etcVar;
        jl4 jl4Var;
        Suggestion suggestion = this.d;
        if (suggestion == null || (jl4Var = this.a) == null) {
            etcVar = null;
        } else {
            rc5 rc5Var = (rc5) jl4Var.b;
            etcVar = new etc();
            CompactSuggestionView compactSuggestionView = (CompactSuggestionView) ((kf) rc5Var.c).b;
            Context context = compactSuggestionView.getContext();
            int iK = rc5.d.k(compactSuggestionView.getContext());
            etcVar.setLayerSize(0, iK, iK);
            LayerDrawable layerDrawableZ = rc5.Z(j14.D(iK, f03.G(context).getDefaultColor()), context, iK);
            if (!etcVar.b) {
                etcVar.setDrawable(0, layerDrawableZ);
                etcVar.invalidateSelf();
            }
            dwh dwhVarI = yne.b.i(suggestion.h);
            dwhVarI.b.c(new eh7(iK));
            dwhVarI.f(new phi(new lt2(etcVar, rc5Var, context, iK)));
        }
        boolean z = etcVar != null;
        CompactSuggestionChip compactSuggestionChip = this.b;
        tx4 tx4Var = ((Chip) compactSuggestionChip).e;
        if (tx4Var != null) {
            tx4Var.Q(z);
        }
        tx4 tx4Var2 = ((Chip) compactSuggestionChip).e;
        if (tx4Var2 != null) {
            tx4Var2.P(etcVar);
        }
    }

    public final void b(int i) {
        if (this.e == i) {
            return;
        }
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i, Integer.MIN_VALUE);
        int i2 = CompactSuggestionView.n;
        Chip chip = this.b;
        chip.measure(iMakeMeasureSpec, 0);
        int measuredWidth = chip.getMeasuredWidth();
        CompactSuggestionView compactSuggestionView = this.f;
        int i3 = measuredWidth + compactSuggestionView.j.x;
        Resources resources = compactSuggestionView.getResources();
        Rect rect = fan.a;
        this.c.a = (((int) (i3 / resources.getDisplayMetrics().density)) + 3) / 4;
        this.e = i;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Suggestion suggestion;
        CompactSuggestionView compactSuggestionView = this.f;
        hqk hqkVar = compactSuggestionView.c;
        if (hqkVar == null || (suggestion = this.d) == null) {
            return;
        }
        hqkVar.q(suggestion, compactSuggestionView.i && suggestion.b().equals((String) compactSuggestionView.b.b));
        nv6 nv6Var = compactSuggestionView.d;
        if (nv6Var != null) {
            nv6Var.C(this.d);
        }
    }
}
