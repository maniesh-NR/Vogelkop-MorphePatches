package defpackage;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.Collections;
import kotlin.collections.a;

/* loaded from: classes.dex */
public final class hte extends no7 {
    public static final ite k = new ite(Collections.singletonList(new l0c("zz", "en")), true, false, false);
    public static final io7 l = io7.p;
    public static final rqd m = new rqd((byte) 19);

    public static ite t(izd izdVar) throws IOException {
        int i = izdVar.readInt();
        int unsignedShort = izdVar.readUnsignedShort();
        ehc ehcVar = new ehc(unsignedShort);
        for (int i2 = 0; i2 < unsignedShort; i2++) {
            String strH = izdVar.h();
            if (strH == null) {
                strH = "";
            }
            l0c l0cVarA = l0c.a(strH);
            if (l0cVarA == null) {
                s49.m("");
                return null;
            }
            ehcVar.add(l0cVarA);
        }
        return new ite(a.a(ehcVar), false, (i & 2) != 0, (i & 4) != 0);
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
