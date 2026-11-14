package defpackage;

import android.view.View;
import com.opera.android.custom_views.PullSpinner;

/* loaded from: classes.dex */
public final class tv8 extends lx8 {
    public final PullSpinner d;

    public tv8(View view) {
        super(view);
        PullSpinner pullSpinner = (PullSpinner) view.findViewById(2131364525);
        this.d = pullSpinner;
        pullSpinner.e.c = f03.C(pullSpinner.getContext());
        pullSpinner.invalidate();
        pullSpinner.d();
        pc5 pc5Var = new pc5(this, (byte) 18);
        dll dllVarS = q9n.s(pullSpinner);
        if (dllVarS == null) {
            return;
        }
        u8n.b(dllVarS, pullSpinner, pc5Var);
    }

    @Override // defpackage.ab2
    public final int U() {
        return -1;
    }

    @Override // defpackage.ab2
    public final void V(ja2 ja2Var, boolean z) {
        e0(((sv8) ja2Var).c);
    }

    @Override // defpackage.ab2
    public final void Y() {
        e0(2);
    }

    public final void e0(int i) {
        int i2 = i == 1 ? 2 : 0;
        PullSpinner pullSpinner = this.d;
        pullSpinner.b(i2);
        int iA = vep.A(i);
        if (iA == 0) {
            pullSpinner.setVisibility(0);
        } else if (iA == 1) {
            pullSpinner.setVisibility(4);
        } else {
            if (iA != 2) {
                return;
            }
            pullSpinner.setVisibility(8);
        }
    }
}
