package defpackage;

import android.os.Bundle;

/* loaded from: classes.dex */
public abstract class blj extends eog {
    public ps5 i;

    public abstract void l0();

    public abstract void m0(int i);

    public final void onCreate(Bundle bundle) {
        super/*androidx.fragment.app.i*/.onCreate(bundle);
        ps5 ps5Var = new ps5(getContext());
        this.i = ps5Var;
        ps5Var.c = this;
        ps5Var.e = this;
        ps5Var.setHeaderTitle(2132022266);
        l0();
        this.h = new axe(this, (byte) 2);
        this.i.setGroupCheckable(1, true, true);
        this.d = this.i;
    }
}
