package defpackage;

import android.hardware.camera2.CaptureResult;

/* loaded from: classes.dex */
public final class oa8 implements ivh {
    public final /* synthetic */ cd5 a;

    public oa8(cd5 cd5Var) {
        this.a = cd5Var;
    }

    @Override // defpackage.ivh
    public final void D(owh owhVar, long j, w61 w61Var) {
        x61 x61Var = w61Var.b;
        Integer num = (Integer) x61Var.c(CaptureResult.CONTROL_AE_STATE);
        Integer num2 = (Integer) x61Var.c(CaptureResult.CONTROL_AE_EXPOSURE_COMPENSATION);
        cd5 cd5Var = this.a;
        if (num == null || num2 == null) {
            if (num2 == null || num2.intValue() != 0) {
                return;
            }
            cd5Var.j0(0);
            return;
        }
        int iIntValue = num.intValue();
        if ((iIntValue == 2 || iIntValue == 3 || iIntValue == 4) && num2.intValue() == 0) {
            cd5Var.j0(0);
        }
    }
}
