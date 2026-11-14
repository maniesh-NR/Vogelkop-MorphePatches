package defpackage;

import android.hardware.camera2.CaptureResult;
import android.os.Build;

/* loaded from: classes.dex */
public final class s3d implements ivh {
    public final /* synthetic */ t3d a;

    public s3d(t3d t3dVar) {
        this.a = t3dVar;
    }

    @Override // defpackage.ivh
    public final void s(owh owhVar, long j, w61 w61Var) {
        Integer num;
        if (Build.VERSION.SDK_INT >= 35) {
            t3d t3dVar = this.a;
            if (t3dVar.c == null || !t3dVar.e || (num = (Integer) w61Var.b.c(CaptureResult.CONTROL_LOW_LIGHT_BOOST_STATE)) == null) {
                return;
            }
            t3dVar.c(t3dVar.f, num.intValue() != 1 ? 0 : 1);
        }
    }
}
