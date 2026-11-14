package defpackage;

/* loaded from: classes.dex */
public final class tul {
    public static final c67 d = rm5.H(new qjl((byte) 4), new sul(0));
    public float a;
    public final p0g b;
    public final p0g c;

    public tul(float f, float f2, float f3) {
        this.a = f;
        this.b = new p0g(f3);
        this.c = new p0g(f2);
    }

    public final float a() {
        if (this.a == 0.0f) {
            return 0.0f;
        }
        return this.c.h() / this.a;
    }

    public final void b(float f) {
        this.c.i(djh.b(f, this.a, 0.0f));
    }
}
