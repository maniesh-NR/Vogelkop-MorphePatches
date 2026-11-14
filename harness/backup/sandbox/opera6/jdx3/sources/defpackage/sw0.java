package defpackage;

import android.content.ComponentCallbacks;
import android.view.View;
import com.opera.android.BrowserActivity;

/* loaded from: classes.dex */
public final class sw0 extends pde {
    public final /* synthetic */ byte l = 1;
    public final Object m;
    public final ComponentCallbacks n;

    public sw0(View view) {
        super(view.getContext().getResources().getConfiguration());
        this.m = view;
        this.n = new it5(this, (byte) 3);
        view.addOnAttachStateChangeListener(new z61(this, (byte) 26));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public sw0(igi igiVar, BrowserActivity browserActivity, f08 f08Var) {
        super(f08Var);
        this.m = igiVar;
        this.n = browserActivity;
    }

    public final void l() {
        switch (this.l) {
            case 0:
                igi igiVar = (igi) this.m;
                aib.B((dll) igiVar.c, (BrowserActivity) this.n, (rw0) igiVar.f, new vme((byte) 19));
                igiVar.A0();
                break;
        }
    }

    public final void m() {
        switch (this.l) {
            case 0:
                igi igiVar = (igi) this.m;
                ((dll) igiVar.c).H((rw0) igiVar.f);
                igiVar.A0();
                break;
        }
    }
}
