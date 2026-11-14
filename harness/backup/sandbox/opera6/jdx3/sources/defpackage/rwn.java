package defpackage;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.HashSet;

/* loaded from: classes.dex */
public final class rwn extends no7 {
    public static final ioj k = new ioj((byte) 10);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r3v0, types: [int] */
    public static qwn t(izd izdVar) throws IOException {
        byte b = izdVar.readByte();
        HashSet hashSet = new HashSet(b);
        while (true) {
            ?? r2 = b - 1;
            if (b <= 0) {
                break;
            }
            hashSet.add(izdVar.h());
            b = r2;
        }
        byte b2 = izdVar.readByte();
        HashSet hashSet2 = new HashSet(b2);
        while (true) {
            ?? r3 = b2 - 1;
            if (b2 <= 0) {
                return new qwn(hashSet2, hashSet);
            }
            hashSet2.add(izdVar.h());
            b2 = r3;
        }
    }

    @Override // defpackage.no7
    public final Object h() {
        return new qwn(null, null);
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
