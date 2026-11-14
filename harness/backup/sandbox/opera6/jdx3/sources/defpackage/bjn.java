package defpackage;

import java.io.ByteArrayInputStream;

/* loaded from: classes.dex */
public final class bjn extends no7 {
    public static final bxl k = new bxl((byte) 24);

    @Override // defpackage.no7
    public final Object h() {
        return new ajn();
    }

    @Override // defpackage.no7
    public final Object k(izd izdVar) {
        return new ajn(izdVar);
    }

    @Override // defpackage.no7
    public final Object q(byte[] bArr) {
        return new ajn(new izd(new ByteArrayInputStream(bArr)));
    }
}
