package defpackage;

/* loaded from: classes.dex */
public final class djb extends fjb {
    public djb(String str) {
        super("missing:".concat(str), "Missing or empty ".concat(str), null);
    }

    public djb(String str, Exception exc) {
        super("invalid:".concat(str), "Invalid ".concat(str), exc);
    }
}
