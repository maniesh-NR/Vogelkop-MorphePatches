package defpackage;

/* loaded from: classes.dex */
public interface r7n {
    default l7n a(Class cls, dde ddeVar) {
        return c(cls);
    }

    default l7n b(s15 s15Var, dde ddeVar) {
        return a(s15Var.a(), ddeVar);
    }

    default l7n c(Class cls) {
        throw new UnsupportedOperationException("`Factory.create(String, CreationExtras)` is not implemented. You may need to override the method and provide a custom implementation. Note that using `Factory.create(String)` is not supported and considered an error.");
    }
}
