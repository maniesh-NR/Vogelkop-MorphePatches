package defpackage;

/* loaded from: classes.dex */
public interface txa extends skh {
    public static final an2 gp;
    public static final an2 hp;
    public static final an2 ip;

    static {
        Class cls = Integer.TYPE;
        gp = new an2("camerax.core.imageInput.inputFormat", cls, null);
        hp = new an2("camerax.core.imageInput.secondaryInputFormat", cls, null);
        ip = new an2("camerax.core.imageInput.inputDynamicRange", ip7.class, null);
    }

    default int m() {
        return ((Integer) i(gp)).intValue();
    }

    default ip7 v() {
        ip7 ip7Var = (ip7) b(ip, ip7.c);
        ip7Var.getClass();
        return ip7Var;
    }
}
