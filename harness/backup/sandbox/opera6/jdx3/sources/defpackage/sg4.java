package defpackage;

/* loaded from: classes.dex */
public final class sg4 extends Exception {
    public final int a;

    public sg4(int i, RuntimeException runtimeException) {
        super("Expected camera missing from device.", runtimeException);
        this.a = i;
    }
}
