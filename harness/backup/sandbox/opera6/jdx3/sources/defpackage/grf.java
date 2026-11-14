package defpackage;

import java.io.ByteArrayInputStream;

/* loaded from: classes.dex */
public final class grf extends no7 {
    public static final s16 k = new s16();

    @Override // defpackage.no7
    public final Object h() {
        return new frf();
    }

    @Override // defpackage.no7
    public final Object k(izd izdVar) {
        return new frf(izdVar);
    }

    @Override // defpackage.no7
    public final Object q(byte[] bArr) {
        return new frf(new izd(new ByteArrayInputStream(bArr)));
    }
}
