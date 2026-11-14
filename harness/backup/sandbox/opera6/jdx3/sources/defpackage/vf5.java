package defpackage;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.i;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b'\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lvf5;", "Landroidx/fragment/app/i;", "<init>", "()V", "catalog"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class vf5 extends i {
    public vf5() {
        setShowsDialog(false);
    }

    public abstract void g0(Function0 function0, ih5 ih5Var, int i);

    /* JADX WARN: Type inference failed for: r3v1, types: [android.view.View, ch5, d4] */
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ?? ch5Var = new ch5(new tpj(requireContext()));
        ch5Var.m();
        ch5Var.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        ch5Var.o(new ue5(-1799110702, new uf5(this, (byte) 0), true));
        return ch5Var;
    }
}
