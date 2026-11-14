package defpackage;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class bvn extends no7 {
    public static final sjn k = new sjn(16);

    public static avn t(izd izdVar) throws IOException {
        szb szbVarD;
        int i = izdVar.readInt();
        int unsignedByte = izdVar.readUnsignedByte();
        HashMap map = new HashMap(unsignedByte);
        while (true) {
            int i2 = unsignedByte - 1;
            if (unsignedByte <= 0) {
                return new avn(i, map);
            }
            String strH = izdVar.h();
            String[] strArr = aik.a;
            if (strH == null) {
                strH = "";
            }
            int iIndexOf = strH.indexOf(58);
            if (iIndexOf != -1 && strH.length() >= iIndexOf + 2 && (szbVarD = szb.d(0, strH.substring(0, iIndexOf))) != null) {
                map.put(szbVarD, strH.substring(iIndexOf + 1));
            }
            unsignedByte = i2;
        }
    }

    @Override // defpackage.no7
    public final Object h() {
        return new avn(0, new HashMap());
    }

    @Override // defpackage.no7
    public final /* bridge */ /* synthetic */ Object k(izd izdVar) {
        return t(izdVar);
    }

    @Override // defpackage.no7
    public final Object q(byte[] bArr) {
        return t(new izd(new ByteArrayInputStream(bArr)));
    }
}
