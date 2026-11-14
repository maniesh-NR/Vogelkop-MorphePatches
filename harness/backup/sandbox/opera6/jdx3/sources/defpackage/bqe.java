package defpackage;

import java.io.ByteArrayInputStream;
import java.io.IOException;

/* loaded from: classes.dex */
public final class bqe extends no7 {
    public static final cqe k = new cqe(null, true);
    public static final rqd l = new rqd((byte) 17);

    public static cqe t(izd izdVar) throws IOException {
        izdVar.readInt();
        String strH = izdVar.h();
        if (strH == null) {
            strH = "";
        }
        l0c l0cVarA = l0c.a(strH);
        if (l0cVarA != null || strH.length() <= 0) {
            return new cqe(l0cVarA, false);
        }
        s49.m("");
        return null;
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
