package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.util.SparseArray;
import java.io.ByteArrayInputStream;
import java.io.IOException;

/* loaded from: classes.dex */
public final class e3j extends no7 {
    public static final a3j k = new a3j(0);

    public static e3j t(Context context) {
        return (e3j) no7.n(context, io7.w, k);
    }

    public static d3j u(izd izdVar) throws IOException {
        int unsignedShort = izdVar.readUnsignedShort();
        SparseArray sparseArray = new SparseArray(unsignedShort);
        while (true) {
            int i = unsignedShort - 1;
            if (unsignedShort > 0) {
                int unsignedShort2 = izdVar.readUnsignedShort();
                if (sparseArray.get(unsignedShort2) != null) {
                    s49.m("Duplicate id");
                    return null;
                }
                String strH = izdVar.h();
                if (TextUtils.isEmpty(strH)) {
                    s49.m("Bad pin");
                    return null;
                }
                sparseArray.put(unsignedShort2, strH);
                unsignedShort = i;
            } else {
                int unsignedShort3 = izdVar.readUnsignedShort();
                SparseArray sparseArray2 = new SparseArray(unsignedShort3);
                while (true) {
                    int i2 = unsignedShort3 - 1;
                    if (unsignedShort3 <= 0) {
                        return new d3j(sparseArray, sparseArray2);
                    }
                    byte[] bArr = new byte[izdVar.readUnsignedShort()];
                    izdVar.readFully(bArr);
                    izd izdVar2 = new izd(new ByteArrayInputStream(bArr));
                    int unsignedShort4 = izdVar2.readUnsignedShort();
                    String strH2 = izdVar2.h();
                    String[] strArr = aik.a;
                    if (strH2 == null) {
                        strH2 = "";
                    }
                    String strH3 = izdVar2.h();
                    String str = strH3 != null ? strH3 : "";
                    int unsignedShort5 = izdVar2.readUnsignedShort();
                    int[] iArr = new int[unsignedShort5];
                    for (int i3 = 0; i3 < unsignedShort5; i3++) {
                        iArr[i3] = izdVar2.readUnsignedShort();
                    }
                    b3j b3jVar = new b3j(unsignedShort4, strH2, str, iArr);
                    if (sparseArray2.get(unsignedShort4) != null) {
                        s49.m("Duplicate id");
                        return null;
                    }
                    sparseArray2.put(unsignedShort4, b3jVar);
                    unsignedShort3 = i2;
                }
            }
        }
    }

    @Override // defpackage.no7
    public final Object h() {
        return new d3j(new SparseArray(0), new SparseArray(0));
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
