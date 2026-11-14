package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;

/* loaded from: classes.dex */
public final class kjo extends RelativeLayout implements fro {
    public ejo a;

    @Override // defpackage.fro
    public final View a(Context context) {
        View viewInflate = LayoutInflater.from(context).inflate(2131558453, (ViewGroup) null);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams.addRule(10);
        addView(viewInflate, layoutParams);
        View viewInflate2 = LayoutInflater.from(context).inflate(2131558459, (ViewGroup) null);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams2.addRule(3, 2131361953);
        addView(viewInflate2, layoutParams2);
        this.a = new hro(this);
        return this;
    }

    @Override // defpackage.fro
    public final void a() {
        ejo ejoVar = this.a;
        if (ejoVar == null) {
            return;
        }
        ejoVar.g();
    }

    @Override // defpackage.fro
    public final void e(cie cieVar) {
        ejo ejoVar = this.a;
        if (ejoVar == null) {
            return;
        }
        if ((ejoVar instanceof doo) && cieVar.W >= 0.0f) {
            throw null;
        }
        ejoVar.c(cieVar);
    }
}
