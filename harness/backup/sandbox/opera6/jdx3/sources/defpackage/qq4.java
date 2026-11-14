package defpackage;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import java.util.ArrayDeque;

/* loaded from: classes.dex */
public final class qq4 extends j83 {
    public final ode a;
    public final wzg b;
    public final boolean c;
    public oq4 d;

    public qq4(umi umiVar, byte[][] bArr, wzg wzgVar, boolean z) {
        ode odeVar = new ode();
        umiVar.c(new fh4(odeVar, bArr, (byte) 3)).a(null);
        this.a = odeVar;
        this.b = wzgVar;
        this.c = z;
    }

    @Override // defpackage.j83
    public final View f0(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        oq4 oq4VarA = oq4.a(layoutInflater, viewGroup, false);
        this.d = oq4VarA;
        return oq4VarA.a;
    }

    public final Animation onCreateAnimation(int i, boolean z, int i2) {
        wzg wzgVar = this.b;
        if (z) {
            ArrayDeque arrayDeque = (ArrayDeque) wzgVar.b;
            arrayDeque.addLast(Boolean.TRUE);
            boolean zIsEmpty = arrayDeque.isEmpty();
            kze kzeVar = (kze) wzgVar.c;
            if (zIsEmpty) {
                kzeVar.r(Boolean.FALSE);
            } else {
                kzeVar.r((Boolean) arrayDeque.getLast());
            }
        } else {
            ArrayDeque arrayDeque2 = (ArrayDeque) wzgVar.b;
            arrayDeque2.pop();
            boolean zIsEmpty2 = arrayDeque2.isEmpty();
            kze kzeVar2 = (kze) wzgVar.c;
            if (zIsEmpty2) {
                kzeVar2.r(Boolean.FALSE);
            } else {
                kzeVar2.r((Boolean) arrayDeque2.getLast());
            }
        }
        return super.onCreateAnimation(i, z, i2);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        ndc viewLifecycleOwner = getViewLifecycleOwner();
        oq4 oq4Var = this.d;
        ode odeVar = this.a;
        odeVar.j(viewLifecycleOwner, new k9(new nrl(oq4Var, odeVar, this.c), (byte) 24));
    }
}
