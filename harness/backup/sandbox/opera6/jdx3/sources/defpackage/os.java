package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.i;
import com.opera.android.ui.catalog.widget.OperaTextView;

/* loaded from: classes.dex */
public final class os extends ygc implements d4a {
    public static final cs d = new cs((byte) 1);
    public final zs b;
    public final boolean c;

    public os(zs zsVar, boolean z) {
        super(d);
        this.b = zsVar;
        this.c = z;
    }

    @Override // defpackage.d4a
    public final e4a getItem(int i) {
        return (ts) ((ygc) this).a.f.get(i);
    }

    public final void onBindViewHolder(i iVar, int i) {
        ws wsVar = (ws) iVar;
        ts tsVar = (ts) ((ygc) this).a.f.get(i);
        wsVar.d = tsVar;
        vs vsVar = wsVar.b;
        vsVar.b.setClipToOutline(true);
        OperaTextView operaTextView = (OperaTextView) vsVar.e;
        kq8 kq8Var = tsVar.a;
        kq8 kq8Var2 = tsVar.a;
        operaTextView.setText(kq8Var.a);
        boolean z = this.c;
        operaTextView.setTextAppearance(z ? 2132083308 : 2132083309);
        operaTextView.setTextColor(f03.W(2130971073, ((i) wsVar).itemView.getContext()));
        ConstraintLayout constraintLayout = vsVar.b;
        int iA = z ? fan.a(120.0f, constraintLayout.getResources()) : fan.a(100.0f, constraintLayout.getResources());
        ViewGroup.LayoutParams jo5Var = new jo5(iA, 0);
        ((jo5) jo5Var).P = iA;
        ((View) vsVar.c).setLayoutParams(jo5Var);
        ((ImageView) vsVar.d).setImageResource(kq8Var2.c);
        ConstraintLayout constraintLayout2 = vsVar.b;
        constraintLayout2.setBackgroundTintList(f03.W(kq8Var2.b, constraintLayout2.getContext()));
    }

    public final i onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new ws(viewGroup, this.b);
    }
}
