package defpackage;

import java.io.ByteArrayInputStream;
import java.io.IOException;

/* loaded from: classes.dex */
public final class k7k extends no7 {
    public static final j7k k;
    public static final io7 l;
    public static final int m;
    public static final a3j n;

    static {
        pn7.b.getClass();
        k = new j7k(2, 0, 0L);
        l = io7.H;
        m = 17;
        n = new a3j((byte) 11);
    }

    public static j7k t(izd izdVar) throws IOException {
        long jX0;
        int i = izdVar.readInt();
        int unsignedShort = izdVar.readUnsignedShort();
        if (izdVar.available() > 0) {
            on7 on7Var = pn7.b;
            jX0 = cs5.x0(izdVar.readUnsignedByte(), un7.h);
        } else {
            pn7.b.getClass();
            jX0 = 0;
        }
        return new j7k(i, unsignedShort, jX0);
    }

    @Override // defpackage.no7
    public final Object h() {
        return k;
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
