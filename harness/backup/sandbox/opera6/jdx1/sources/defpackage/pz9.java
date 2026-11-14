package defpackage;

import android.content.Context;
import android.widget.EdgeEffect;

/* loaded from: classes.dex */
public final class pz9 extends EdgeEffect {
    public final float a;
    public float b;

    public pz9(Context context) {
        super(context);
        this.a = fsp.a(context).a * 1.0f;
    }

    @Override // android.widget.EdgeEffect
    public final void onAbsorb(int i) {
        this.b = 0.0f;
        super.onAbsorb(i);
    }

    @Override // android.widget.EdgeEffect
    public final void onPull(float f) {
        this.b = 0.0f;
        super.onPull(f);
    }

    @Override // android.widget.EdgeEffect
    public final void onPull(float f, float f2) {
        this.b = 0.0f;
        super.onPull(f, f2);
    }

    @Override // android.widget.EdgeEffect
    public final void onRelease() {
        this.b = 0.0f;
        super.onRelease();
    }
}
