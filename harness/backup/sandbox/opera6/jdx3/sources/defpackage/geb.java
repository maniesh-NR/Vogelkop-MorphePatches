package defpackage;

import android.util.SparseArray;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.Collections;
import java.util.HashSet;
import java.util.Locale;

/* loaded from: classes.dex */
public final class geb extends no7 {
    public static final pza k = new pza((byte) 12);

    public static feb t(izd izdVar) throws IOException {
        izdVar.readInt();
        int unsignedShort = izdVar.readUnsignedShort();
        SparseArray sparseArray = new SparseArray(unsignedShort);
        while (true) {
            int i = unsignedShort - 1;
            if (unsignedShort <= 0) {
                return new feb(sparseArray, u(izdVar));
            }
            int unsignedShort2 = izdVar.readUnsignedShort();
            if (sparseArray.indexOfKey(unsignedShort2) >= 0) {
                s49.m("Duplicate category_id");
                return null;
            }
            sparseArray.put(unsignedShort2, u(izdVar));
            unsignedShort = i;
        }
    }

    public static HashSet u(izd izdVar) throws IOException {
        HashSet hashSet = new HashSet();
        int unsignedShort = izdVar.readUnsignedShort();
        while (true) {
            int i = unsignedShort - 1;
            if (unsignedShort <= 0) {
                return hashSet;
            }
            String strH = izdVar.h();
            if (strH == null) {
                s49.m("Keyword string expected");
                return null;
            }
            if (!hashSet.add(strH.toLowerCase(Locale.ROOT).trim())) {
                s49.m("Duplicate keyword");
                return null;
            }
            unsignedShort = i;
        }
    }

    @Override // defpackage.no7
    public final Object h() {
        return new feb(new SparseArray(0), Collections.EMPTY_SET);
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
