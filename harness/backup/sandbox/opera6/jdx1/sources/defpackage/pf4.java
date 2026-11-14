package defpackage;

/* loaded from: classes.dex */
public final class pf4 extends kf4 {
    public final wc4 a;

    public pf4(wc4 wc4Var) {
        this.a = wc4Var;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof pf4) && this.a.equals(((pf4) obj).a);
        }
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "CameraStateOpen(cameraDevice=" + this.a + ')';
    }
}
