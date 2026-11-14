package defpackage;

import J.N;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicReference;
import org.chromium.base.PathUtils;

/* loaded from: classes.dex */
public final class y2g extends jo7 {
    public static final AtomicReference c = new AtomicReference();

    @Override // defpackage.jo7
    public final void d(byte[] bArr) throws Throwable {
        jo7.h(PathUtils.a(0) + "/ps", bArr, 0, bArr.length, false);
        int length = bArr.length;
        nd7 nd7Var = null;
        AtomicReference atomicReference = c;
        if (length <= 0) {
            atomicReference.set(null);
            return;
        }
        long jMgjiR0Hm = N.MgjiR0Hm(PathUtils.a(0) + "/ps", 4L);
        if (jMgjiR0Hm != 0) {
            nd7Var = new nd7();
            nd7Var.b = jMgjiR0Hm;
        }
        atomicReference.set(nd7Var);
        if (nd7Var == null) {
            Locale locale = Locale.ROOT;
            ks3.B("Bad partner_sites", "size: " + bArr.length);
        }
    }
}
