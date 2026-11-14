package defpackage;

/* loaded from: classes.dex */
public interface u2m {
    Object a();

    Object b();

    default boolean c(Object obj, Object obj2) {
        return obj.equals(b()) && obj2.equals(a());
    }
}
