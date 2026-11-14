package defpackage;

/* loaded from: classes.dex */
public final class ef1 extends if1 {
    public float a;

    public ef1(float f) {
        this.a = f;
    }

    @Override // defpackage.if1
    public final float a(int i) {
        if (i == 0) {
            return this.a;
        }
        return 0.0f;
    }

    @Override // defpackage.if1
    public final void d() {
        this.a = 0.0f;
    }

    @Override // defpackage.if1
    public final void e(float f, int i) {
        if (i == 0) {
            this.a = f;
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof ef1) && ((ef1) obj).a == this.a;
    }

    public final int hashCode() {
        return Float.hashCode(this.a);
    }

    public final String toString() {
        return "AnimationVector1D: value = " + this.a;
    }
}
