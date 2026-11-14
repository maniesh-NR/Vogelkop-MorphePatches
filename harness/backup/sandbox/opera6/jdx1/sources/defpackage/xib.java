package defpackage;

/* loaded from: classes.dex */
public class xib extends RuntimeException {
    private static final long serialVersionUID = 1;

    public xib(Exception exc) {
        super(exc.getMessage(), exc);
    }

    public xib(String str) {
        super(str);
    }

    public xib(String str, Exception exc) {
        super(str, exc);
    }
}
