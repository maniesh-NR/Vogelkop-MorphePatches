package defpackage;

import android.graphics.Rect;
import android.hardware.camera2.CameraCharacteristics;
import androidx.vectordrawable.graphics.drawable.PathInterpolatorCompat;
import java.util.Collections;
import java.util.List;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class fye implements cdo {
    public static final List b = Collections.singletonList(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE);
    public final pe4 a;

    public fye(pe4 pe4Var) {
        this.a = pe4Var;
    }

    @Override // defpackage.cdo
    public final float a() {
        return 1.0f;
    }

    @Override // defpackage.cdo
    public final h07 c(zrm zrmVar) {
        return sfe.d(Unit.a);
    }

    @Override // defpackage.cdo
    public final float i() {
        return 1.0f;
    }

    @Override // defpackage.cdo
    public final Rect l() {
        ma4 ma4Var = (ma4) this.a.b;
        Rect rect = (Rect) ma4Var.c(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE);
        if (rect != null) {
            return rect;
        }
        if (gyg.G(5, "CXCP")) {
            sd4.b(ma4Var.a);
        }
        return new Rect(0, 0, 4000, PathInterpolatorCompat.MAX_NUM_POINTS);
    }

    @Override // defpackage.cdo
    public final h07 m(float f, zrm zrmVar) {
        return sfe.d(Unit.a);
    }
}
