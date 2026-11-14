package defpackage;

/* loaded from: classes.dex */
public class lv0 extends Exception {
    public lv0(int i, Exception exc) {
        super(sko.i(i, "NonceLoader exception, errorCode : "), exc);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lv0(String str, byte b) {
        super(sko.j("Bad Content-Type format: ", str));
        switch (b) {
            case 12:
                super("Missing resource with path: ".concat(str));
                break;
            default:
                break;
        }
    }
}
