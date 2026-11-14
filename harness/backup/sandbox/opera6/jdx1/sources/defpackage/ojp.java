package defpackage;

import ads_mobile_sdk.sn3;
import ads_mobile_sdk.us3;
import ads_mobile_sdk.zk2;
import java.util.Locale;
import java.util.Optional;

/* loaded from: classes.dex */
public final class ojp extends Exception {
    /* JADX WARN: Illegal instructions before constructor call */
    public ojp(sn3 sn3Var, zk2 zk2Var, long j) {
        int iA = u0h.a(430548174, 1962777121, -1294155075, 737454769) ^ 129967840;
        Locale locale = Locale.US;
        Object[] objArr = new Object[iA];
        objArr[0] = Long.valueOf(sn3Var.a);
        objArr[1] = Long.valueOf(zk2Var.a);
        Long lValueOf = Long.valueOf(j);
        objArr[2] = lValueOf;
        super(String.format(locale, us3.a("bk3t6gFTc30="), objArr));
        Optional.of(zk2Var);
        Optional.of(lValueOf);
    }

    public ojp(sn3 sn3Var, Exception exc) {
        super(String.format(Locale.US, us3.a("bk0="), Long.valueOf(sn3Var.a)), exc);
        Optional.empty();
        Optional.empty();
    }
}
