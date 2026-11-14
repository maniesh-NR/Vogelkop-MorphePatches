package defpackage;

import android.content.Context;
import java.io.ByteArrayInputStream;

/* loaded from: classes.dex */
public final class ufn extends no7 {
    public static final bxl k = new bxl((byte) 23);

    public static ufn t(Context context) {
        return (ufn) no7.n(context, io7.o, k);
    }

    @Override // defpackage.no7
    public final Object h() {
        return new tfn();
    }

    @Override // defpackage.no7
    public final Object k(izd izdVar) {
        return new tfn(izdVar);
    }

    @Override // defpackage.no7
    public final Object q(byte[] bArr) {
        return new tfn(new izd(new ByteArrayInputStream(bArr)));
    }
}
