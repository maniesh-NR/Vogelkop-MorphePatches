package defpackage;

import android.net.Uri;
import java.io.ByteArrayInputStream;
import java.io.IOException;

/* loaded from: classes.dex */
public final class zi3 extends no7 {
    public static final ui3 k;
    public static final qp2 l;

    static {
        v08 v08Var = v08.a;
        on7 on7Var = pn7.b;
        k = new ui3((Uri) null, v08Var, cs5.x0(0, un7.e), n08.a);
        l = new qp2((byte) 14);
    }

    public final Object h() {
        try {
            return z4o.l0(new izd(((no7) this).a.getResources().getAssets().open("op/abp.manifest", 3)));
        } catch (IOException | vi3 unused) {
            return k;
        }
    }

    public final Object k(izd izdVar) {
        return z4o.l0(izdVar);
    }

    public final Object q(byte[] bArr) {
        return z4o.l0(new izd(new ByteArrayInputStream(bArr)));
    }
}
