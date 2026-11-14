package defpackage;

import java.io.ByteArrayInputStream;
import java.io.IOException;

/* loaded from: classes.dex */
public final class hwf extends no7 {
    public static final ix5 k = new ix5((byte) 23);

    public static gwf t(izd izdVar) throws IOException {
        int unsignedShort = izdVar.readUnsignedShort();
        int[] iArr = new int[unsignedShort];
        String[] strArr = new String[unsignedShort];
        for (int i = 0; i < unsignedShort; i++) {
            byte[] bArr = new byte[3];
            izdVar.readFully(bArr);
            iArr[i] = ((bArr[0] & 255) << 16) + ((bArr[1] & 255) << 8) + (bArr[2] & 255);
            String strH = izdVar.h();
            String[] strArr2 = aik.a;
            if (strH == null) {
                strH = "";
            }
            strArr[i] = strH;
        }
        return new gwf(iArr, new nd7(strArr));
    }

    @Override // defpackage.no7
    public final Object h() {
        return new gwf();
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
