package defpackage;

import android.hardware.camera2.CameraCharacteristics;
import android.util.Range;
import android.util.Rational;

/* loaded from: classes.dex */
public final class pa8 {
    public final ctm a;
    public final tb5 b;
    public final Range c;
    public final boolean d;
    public final Rational e;
    public cd5 f;
    public oa8 g;

    public pa8(pe4 pe4Var, ctm ctmVar, tb5 tb5Var) {
        Integer num;
        this.a = ctmVar;
        this.b = tb5Var;
        ge4 ge4Var = pe4Var.b;
        CameraCharacteristics.Key key = CameraCharacteristics.CONTROL_AE_COMPENSATION_RANGE;
        Object obj = ma8.a;
        Object objC = ((ma4) ge4Var).c(key);
        Range range = (Range) (objC != null ? objC : obj);
        this.c = range;
        Integer num2 = (Integer) range.getUpper();
        boolean z = (num2 == null || num2.intValue() != 0) && ((num = (Integer) range.getLower()) == null || num.intValue() != 0);
        this.d = z;
        this.e = !z ? Rational.ZERO : (Rational) ((ma4) pe4Var.b).c(CameraCharacteristics.CONTROL_AE_COMPENSATION_STEP);
    }
}
