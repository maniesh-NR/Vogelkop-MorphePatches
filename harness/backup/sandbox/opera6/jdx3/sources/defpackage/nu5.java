package defpackage;

import android.os.Handler;
import com.opera.android.custom_views.OperaIntroView;

/* loaded from: classes.dex */
public final class nu5 implements Runnable {
    public static final float[] e = {0.4f, 0.15f, 0.1f, 0.05f, 0.05f, 0.01f};
    public final OperaIntroView a;
    public final Handler b;
    public int c;
    public float d;

    public nu5(OperaIntroView operaIntroView, Handler handler) {
        this.a = operaIntroView;
        this.b = handler;
    }

    @Override // java.lang.Runnable
    public final void run() {
        OperaIntroView operaIntroView = this.a;
        float fB = operaIntroView.B();
        float f = this.d;
        if (fB >= f) {
            return;
        }
        int i = this.c;
        float[] fArr = e;
        float f2 = i < 6 ? fArr[i] : fArr[5];
        this.c = i + 1;
        operaIntroView.E(Math.min(f, fB + f2), 2000);
        this.b.postDelayed(this, 2000L);
    }
}
