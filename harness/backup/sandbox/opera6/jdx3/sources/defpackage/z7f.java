package defpackage;

import java.io.ByteArrayInputStream;

/* loaded from: classes.dex */
public final class z7f extends no7 {
    public static final rqd k = new rqd((byte) 25);

    @Override // defpackage.no7
    public final /* bridge */ /* synthetic */ Object h() {
        return x7f.a;
    }

    @Override // defpackage.no7
    public final Object k(izd izdVar) {
        try {
            return ipe.V(izdVar);
        } catch (Throwable th) {
            return new w7f(th);
        }
    }

    @Override // defpackage.no7
    public final Object q(byte[] bArr) {
        try {
            return ipe.V(new izd(new ByteArrayInputStream(bArr)));
        } catch (Throwable th) {
            return new w7f(th);
        }
    }
}
