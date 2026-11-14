package defpackage;

import J.N;
import android.os.Bundle;
import android.view.View;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* loaded from: classes.dex */
public abstract class fk3 extends m93 {
    public final byte A;
    public final ek3 B;

    /* JADX WARN: Multi-variable type inference failed */
    public fk3(int i, int i2) {
        super(i, 0);
        this.B = new ek3(this);
        this.A = i2;
    }

    @Override // defpackage.m93
    public final void G0(String str) {
        hj.b(this.A, 0, str, false);
        N.MqE$051l();
    }

    @Override // defpackage.m93
    public final Collection H0() {
        return hj.a(this.A);
    }

    @Override // defpackage.m93
    public final void I0() {
        byte b = this.A;
        Iterator it = hj.a(b).iterator();
        while (it.hasNext()) {
            hj.b(0, b, (String) it.next(), false);
        }
        N.MqE$051l();
    }

    @Override // defpackage.m93
    public final void J0(ArrayList arrayList) {
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            hj.b(0, this.A, (String) obj, false);
        }
        i7f i7fVar = hj.a;
        N.MqE$051l();
    }

    @Override // defpackage.m93, defpackage.ltl, defpackage.k24
    public final void onDestroyView() {
        hj.a.c(this.B);
        super.onDestroyView();
    }

    @Override // defpackage.m93, defpackage.k24
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        hj.a.b(this.B);
    }
}
