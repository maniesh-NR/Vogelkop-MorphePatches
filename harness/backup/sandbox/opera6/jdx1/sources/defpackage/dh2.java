package defpackage;

/* loaded from: classes.dex */
public final class dh2 extends Exception {
    public dh2(bh2 bh2Var) {
        this("Unhandled input format:", bh2Var);
    }

    public dh2(String str, bh2 bh2Var) {
        super(str + " " + bh2Var);
    }
}
