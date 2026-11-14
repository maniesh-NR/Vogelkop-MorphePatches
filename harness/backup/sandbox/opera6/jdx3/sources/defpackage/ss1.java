package defpackage;

import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.d;
import androidx.recyclerview.widget.i;
import com.opera.android.custom_views.StylingImageView;
import com.opera.android.custom_views.StylingTextView;
import java.text.NumberFormat;
import java.util.List;

/* loaded from: classes.dex */
public final class ss1 extends d {
    public List a;
    public int b;
    public boolean c;
    public final ole d;

    public ss1(l08 l08Var, int i, boolean z, ole oleVar) {
        this.a = l08Var;
        this.b = i;
        this.c = z;
        this.d = oleVar;
    }

    public final int getItemCount() {
        return this.a.size();
    }

    public final void onBindViewHolder(i iVar, int i) {
        rs1 rs1Var = (rs1) iVar;
        qs1 qs1Var = (qs1) this.a.get(i);
        rs1Var.c = qs1Var;
        ss1 ss1Var = rs1Var.d;
        boolean z = ss1Var.b == qs1Var.a;
        boolean z2 = (!qs1Var.c || ss1Var.c || z) ? false : true;
        boolean z3 = qs1Var.d;
        ot1 ot1Var = rs1Var.b;
        int i2 = qs1Var.b;
        pt1 pt1Var = ot1Var.a;
        ((StylingImageView) pt1Var.e).setImageResource(i2);
        long j = qs1Var.e;
        ((LinearLayout) pt1Var.g).setVisibility(z3 ? 0 : 8);
        ((StylingTextView) pt1Var.c).setText(NumberFormat.getInstance().format(j));
        ((StylingImageView) pt1Var.f).setVisibility(z2 ? 0 : 8);
        ot1Var.setChecked(z);
    }

    public final i onCreateViewHolder(ViewGroup viewGroup, int i) {
        ot1 ot1Var = new ot1(viewGroup.getContext());
        ot1Var.setClipChildren(false);
        return new rs1(this, ot1Var);
    }
}
