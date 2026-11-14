package defpackage;

import java.io.ByteArrayInputStream;
import java.io.IOException;

/* loaded from: classes.dex */
public final class l1a extends no7 {
    public static final s49 k = new s49((byte) 16);

    public static k1a t(izd izdVar) throws IOException {
        int i = izdVar.readInt();
        int i2 = i & 7;
        if (i2 == 0 || i2 == 1 || i2 == 2 || i2 == 4) {
            return new k1a(i, izdVar.readUnsignedShort(), izdVar.readUnsignedShort(), izdVar.readUnsignedShort(), izdVar.h());
        }
        throw new IOException();
    }

    @Override // defpackage.no7
    public final Object h() {
        return new k1a(1, 0, 0, 0, "");
    }

    @Override // defpackage.no7
    public final Object k(izd izdVar) {
        return t(izdVar);
    }

    @Override // defpackage.no7
    public final Object q(byte[] bArr) {
        return t(new izd(new ByteArrayInputStream(bArr)));
    }
}
