package defpackage;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class am extends ryl {
    public final c4 c;
    public final Runnable d;
    public final q65 e = new q65(new c4(this, (byte) 7), (byte) 4);

    public am(c4 c4Var, Runnable runnable) {
        this.c = c4Var;
        this.d = runnable;
    }

    @Override // defpackage.ryl
    public final void g0() {
        super.g0();
        this.e.S();
        this.d.run();
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View view = new View(requireContext());
        view.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        view.setBackgroundColor(-16711936);
        return view;
    }

    public final void onResume() {
        super/*androidx.fragment.app.Fragment*/.onResume();
        this.e.B0(vml.d, 100L, TimeUnit.MILLISECONDS);
        this.c.run();
    }
}
