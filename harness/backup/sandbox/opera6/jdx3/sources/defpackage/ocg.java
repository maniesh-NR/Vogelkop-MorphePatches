package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import kotlin.Pair;

/* loaded from: classes.dex */
public final class ocg extends Fragment implements eak {
    public final Pair a;
    public final ikc b = new ikc(kl0.m);
    public final zyk c = z4c.b(new yse(this, 6));

    public ocg(Pair pair) {
        this.a = pair;
    }

    @Override // defpackage.eak
    public final ikc T() {
        return this.b;
    }

    public final zcg f0() {
        return (zcg) this.c.getValue();
    }

    public final void onAttach(Context context) {
        super.onAttach(context);
        f0().g.T();
        f0().g.V(true);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        d4 ch5Var = new ch5(layoutInflater.getContext());
        ch5Var.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        ch5Var.m();
        return ch5Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onViewCreated(View view, Bundle bundle) {
        ((ch5) view).o(new ue5(537056283, new mcg(this, (byte) 0), true));
    }
}
