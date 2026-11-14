package defpackage;

/* loaded from: classes.dex */
public enum yul {
    d(1.0f),
    e(0.0f);

    public final float a;
    public final boolean b;
    public final boolean c;

    yul(float f2) {
        this.a = f2;
        this.b = f2 == 0.0f;
        this.c = f2 == 0.0f;
    }

    public final boolean d(yul yulVar) {
        return this.c && !yulVar.c;
    }
}
