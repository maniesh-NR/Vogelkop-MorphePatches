package defpackage;

/* loaded from: classes.dex */
public final class eei extends kfi {
    public static final eei b = new eei(-16777216);
    public static final eei c = new eei(0);
    public final int a;

    public eei(int i) {
        this.a = i;
    }

    public final String toString() {
        return String.format("#%08x", Integer.valueOf(this.a));
    }
}
