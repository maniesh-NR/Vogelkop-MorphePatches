package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;

/* loaded from: classes.dex */
public final class y8k extends Fragment implements eak {
    public final mcj a;
    public final wsf b;
    public final ikc c;
    public final pde d = new pde(kl0.j);
    public boolean e;

    public y8k(mcj mcjVar, wsf wsfVar, ikc ikcVar) {
        this.a = mcjVar;
        this.b = wsfVar;
        this.c = ikcVar;
    }

    @Override // defpackage.eak
    public final ikc T() {
        return this.d;
    }

    public final void onAttach(Context context) {
        super.onAttach(context);
        requireActivity().T();
        requireActivity().V(false);
    }

    /* JADX WARN: Type inference failed for: r4v3, types: [android.view.View, android.view.ViewGroup, ch5, d4, java.lang.Object] */
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.c.j(getViewLifecycleOwner(), new w4i(new n6k((Object) this, (byte) 6), (byte) 13));
        t0g t0gVarK = hyg.k(Boolean.FALSE);
        ?? ch5Var = new ch5(requireContext());
        q9n.f(ch5Var.getRootView(), new kkf(this, (byte) 25));
        ch5Var.setClipChildren(false);
        ch5Var.setClipToPadding(false);
        kff.a((View) ch5Var, new ssi(ch5Var, t0gVarK, (byte) 7));
        ch5Var.m();
        requireActivity().Y();
        ch5Var.o(new ue5(1474060297, new g9(this, t0gVarK, ch5Var, (byte) 27), true));
        return ch5Var;
    }
}
