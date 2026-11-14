package defpackage;

import android.view.View;
import android.widget.AdapterView;
import java.util.Objects;
import org.chromium.content.browser.picker.DateTimeSuggestion;

/* loaded from: classes.dex */
public final class p8b implements AdapterView.OnItemClickListener {
    public final /* synthetic */ th6 a;
    public final /* synthetic */ int b;
    public final /* synthetic */ double c;
    public final /* synthetic */ double d;
    public final /* synthetic */ double e;
    public final /* synthetic */ double f;
    public final /* synthetic */ tn g;

    public p8b(tn tnVar, th6 th6Var, int i, double d, double d2, double d3, double d4) {
        this.a = th6Var;
        this.b = i;
        this.c = d;
        this.d = d2;
        this.e = d3;
        this.f = d4;
        Objects.requireNonNull(tnVar);
        this.g = tnVar;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        th6 th6Var = this.a;
        int count = th6Var.getCount() - 1;
        tn tnVar = this.g;
        if (i == count) {
            tnVar.v();
            this.g.J(this.b, this.c, this.d, this.e, this.f);
            return;
        }
        ((ga6) tnVar.d).q(((DateTimeSuggestion) th6Var.getItem(i)).a);
        tnVar.v();
        tnVar.a = true;
    }
}
