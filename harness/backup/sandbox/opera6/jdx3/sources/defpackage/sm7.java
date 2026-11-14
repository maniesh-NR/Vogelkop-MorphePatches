package defpackage;

/* loaded from: classes.dex */
public final class sm7 implements Comparable {
    public final pc a;
    public final tf b;
    public final float c;

    static {
        int i = tf.i;
    }

    public sm7(pc pcVar, tf tfVar, float f) {
        this.a = pcVar;
        this.b = tfVar;
        this.c = f;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return Float.compare(this.c, ((sm7) obj).c);
    }
}
