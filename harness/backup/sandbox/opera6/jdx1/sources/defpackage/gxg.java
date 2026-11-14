package defpackage;

import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes.dex */
public final class gxg extends ThreadLocal {
    public final /* synthetic */ r72 a;

    public gxg(r72 r72Var) {
        this.a = r72Var;
    }

    @Override // java.lang.ThreadLocal
    public final Object initialValue() throws InvalidKeyException {
        r72 r72Var = this.a;
        try {
            h38 h38Var = h38.c;
            Mac mac = (Mac) h38Var.a.s((String) r72Var.c);
            mac.init((SecretKeySpec) r72Var.d);
            return mac;
        } catch (GeneralSecurityException e) {
            h9o.o(e);
            return null;
        }
    }
}
