package defpackage;

import android.content.Context;
import android.util.SparseArray;
import java.io.ByteArrayInputStream;
import java.io.IOException;

/* loaded from: classes.dex */
public final class cxc extends no7 {
    public static final uac k = new uac((byte) 11);

    public static cxc t(Context context) {
        return (cxc) no7.n(context, io7.x, k);
    }

    public static bxc u(izd izdVar) throws IOException {
        izdVar.readInt();
        String strH = izdVar.h();
        int unsignedShort = izdVar.readUnsignedShort();
        SparseArray sparseArray = new SparseArray(unsignedShort);
        while (true) {
            int i = unsignedShort - 1;
            if (unsignedShort <= 0) {
                return new bxc(strH, sparseArray);
            }
            int unsignedShort2 = izdVar.readUnsignedShort();
            if (sparseArray.get(unsignedShort2) != null) {
                s49.m("Duplicate id");
                return null;
            }
            sparseArray.put(unsignedShort2, izdVar.h());
            unsignedShort = i;
        }
    }

    @Override // defpackage.no7
    public final Object h() {
        return new bxc("", new SparseArray(0));
    }

    @Override // defpackage.no7
    public final Object k(izd izdVar) {
        return u(izdVar);
    }

    @Override // defpackage.no7
    public final Object q(byte[] bArr) {
        return u(new izd(new ByteArrayInputStream(bArr)));
    }
}
