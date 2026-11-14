package defpackage;

import android.util.Size;

/* loaded from: classes.dex */
public final class ova {
    public static final tva a;

    static {
        Object size = new Size(640, 480);
        Object zxhVar = new zxh(sa2.c, new ayh(qpj.c), null);
        nva nvaVar = new nva((byte) 0);
        an2 an2Var = hya.qp;
        fee feeVar = nvaVar.b;
        feeVar.s(an2Var, size);
        feeVar.s(qsm.Lp, 1);
        feeVar.s(hya.kp, 0);
        feeVar.s(hya.up, zxhVar);
        ip7 ip7Var = ip7.d;
        if (!ip7Var.equals(ip7Var)) {
            yt7.k("ImageAnalysis currently only supports SDR");
        } else {
            feeVar.s(txa.ip, ip7Var);
            a = new tva(wrf.f(feeVar));
        }
    }
}
