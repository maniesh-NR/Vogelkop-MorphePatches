package defpackage;

import android.animation.ValueAnimator;
import android.os.Build;
import android.view.Choreographer;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class se1 {
    public static final ThreadLocal i = new ThreadLocal();
    public final c37 e;
    public qe1 h;
    public final hkj a = new hkj(0);
    public final ArrayList b = new ArrayList();
    public final zy9 c = new zy9(this);
    public final c4 d = new c4(this, 25);
    public boolean f = false;
    public float g = 1.0f;

    public se1(c37 c37Var) {
        this.e = c37Var;
    }

    /* JADX WARN: Type inference failed for: r4v3, types: [android.animation.ValueAnimator$DurationScaleChangeListener, pe1] */
    public final void a(x1k x1kVar) {
        ArrayList arrayList = this.b;
        if (arrayList.size() == 0) {
            ((Choreographer) this.e.a).postFrameCallback(new re1(this.d));
            if (Build.VERSION.SDK_INT >= 33) {
                this.g = ValueAnimator.getDurationScale();
                final qe1 qe1Var = this.h;
                if (qe1Var == null) {
                    qe1Var = new qe1(this);
                    this.h = qe1Var;
                }
                if (qe1Var.a == null) {
                    ?? r4 = new ValueAnimator.DurationScaleChangeListener() { // from class: pe1
                        @Override // android.animation.ValueAnimator.DurationScaleChangeListener
                        public final void onChanged(float f) {
                            qe1Var.b.g = f;
                        }
                    };
                    qe1Var.a = r4;
                    ValueAnimator.registerDurationScaleChangeListener(r4);
                }
            }
        }
        if (arrayList.contains(x1kVar)) {
            return;
        }
        arrayList.add(x1kVar);
    }
}
