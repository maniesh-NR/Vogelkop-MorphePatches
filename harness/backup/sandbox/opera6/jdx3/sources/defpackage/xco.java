package defpackage;

import java.math.BigDecimal;

/* loaded from: classes.dex */
public final class xco {
    public static final xco b;
    public final BigDecimal a;

    static {
        new xco(108.0d);
        new xco(102.0d);
        new xco(96.0d);
        b = new xco(90.8333d);
    }

    public xco(double d) {
        this.a = BigDecimal.valueOf(d);
    }
}
