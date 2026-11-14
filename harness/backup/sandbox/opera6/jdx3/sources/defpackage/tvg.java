package defpackage;

import android.content.Context;
import java.io.ByteArrayInputStream;

/* loaded from: classes.dex */
public final class tvg extends no7 {
    public static final hv5 k = new hv5();

    public static tvg t(Context context) {
        return (tvg) no7.n(context, io7.y, k);
    }

    @Override // defpackage.no7
    public final Object h() {
        return new svg();
    }

    @Override // defpackage.no7
    public final Object k(izd izdVar) {
        return new svg(izdVar);
    }

    @Override // defpackage.no7
    public final Object q(byte[] bArr) {
        izd izdVar = new izd(new ByteArrayInputStream(bArr));
        try {
            return new svg(izdVar);
        } finally {
            xvg.l(izdVar);
        }
    }
}
