package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;

/* loaded from: classes.dex */
public final class jjo extends RelativeLayout implements fro {
    public ejo a;
    public int b;

    @Override // defpackage.fro
    public final View a(Context context) {
        this.b = 2;
        View viewInflate = LayoutInflater.from(context).inflate(2131558453, (ViewGroup) null);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams.addRule(10);
        addView(viewInflate, layoutParams);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams2.addRule(3, 2131361953);
        addView(LayoutInflater.from(context).inflate(2131558456, (ViewGroup) null), layoutParams2);
        this.a = new gro(this);
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
        if (this.b == 1 && (ejoVar instanceof coo)) {
            if (cieVar.V > 0) {
                throw null;
            }
            coo cooVar = (coo) this.a;
            if (cieVar.W >= 0.0f) {
                cooVar.getClass();
                throw null;
            }
            cooVar.getClass();
        }
        this.a.c(cieVar);
    }
}
