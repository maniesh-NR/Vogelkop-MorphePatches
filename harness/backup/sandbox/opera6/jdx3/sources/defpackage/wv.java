package defpackage;

import java.math.BigInteger;
import org.jetbrains.annotations.NotNull;

@h2j(with = vv.class)
/* loaded from: classes.dex */
public final class wv extends le3 {

    @NotNull
    public static final uv Companion = new uv();
    public static final wv d;
    public final BigInteger c;

    static {
        BigInteger bigInteger = pe3.a;
        d = new wv(pe3.a);
    }

    public wv(BigInteger bigInteger) {
        super(40, bigInteger);
        this.c = bigInteger;
        if (bigInteger.signum() < 0) {
            qp2.n("Check failed.");
            throw null;
        }
        if (this.b.length() == 40) {
            return;
        }
        qp2.n("Check failed.");
        throw null;
    }
}
