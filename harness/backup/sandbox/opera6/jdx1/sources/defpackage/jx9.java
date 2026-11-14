package defpackage;

/* loaded from: classes.dex */
public final class jx9 extends z4 {
    public final int b;
    public final bo3 c;

    public jx9(int i, bo3 bo3Var) {
        this.b = i;
        this.c = bo3Var;
    }

    public final int d() {
        return this.b;
    }

    public final Object get(int i) {
        return this.c.invoke(Integer.valueOf(i));
    }
}
