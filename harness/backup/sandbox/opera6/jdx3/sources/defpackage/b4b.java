package defpackage;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

/* loaded from: classes.dex */
public final class b4b extends no7 {
    public static final pza k = new pza((byte) 9);

    public static a4b t(izd izdVar) throws IOException {
        int unsignedShort = izdVar.readUnsignedShort();
        ArrayList arrayList = new ArrayList();
        while (true) {
            int i = unsignedShort - 1;
            if (unsignedShort <= 0) {
                return new a4b(arrayList);
            }
            arrayList.add(new z3b(izdVar.readUTF(), izdVar.readUTF()));
            unsignedShort = i;
        }
    }

    @Override // defpackage.no7
    public final Object h() {
        return new a4b(Collections.EMPTY_LIST);
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
