package defpackage;

import android.hardware.camera2.CaptureRequest;
import androidx.camera.camera2.compat.quirk.ImageCapturePixelHDRPlusQuirk;

/* loaded from: classes.dex */
public final class pg4 extends ng4 {
    public static final pg4 b = new pg4();

    @Override // defpackage.ng4
    public final void a(fwa fwaVar, pyl pylVar) {
        super.a(fwaVar, pylVar);
        fee feeVarK = fee.k();
        if (((ImageCapturePixelHDRPlusQuirk) d77.a(ImageCapturePixelHDRPlusQuirk.class)) != null) {
            an2 an2Var = fwa.b;
            if (fwaVar.g(an2Var)) {
                int iIntValue = ((Integer) fwaVar.i(an2Var)).intValue();
                if (iIntValue == 0) {
                    CaptureRequest.Key key = CaptureRequest.CONTROL_ENABLE_ZSL;
                    feeVarK.s(gyg.q(key), Boolean.TRUE);
                } else if (iIntValue == 1) {
                    CaptureRequest.Key key2 = CaptureRequest.CONTROL_ENABLE_ZSL;
                    feeVarK.s(gyg.q(key2), Boolean.FALSE);
                }
            }
        }
        pylVar.f(new eb4(wrf.f(feeVarK)));
    }
}
