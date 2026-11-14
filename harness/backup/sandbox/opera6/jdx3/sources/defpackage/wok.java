package defpackage;

import android.content.Context;
import android.util.SparseLongArray;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class wok extends no7 {
    public static final List k;
    public static final List l;
    public static final a3j m;

    static {
        List list = Collections.EMPTY_LIST;
        k = list;
        l = list;
        m = new a3j((byte) 29);
    }

    public static wok t(Context context) {
        return (wok) no7.n(context, io7.t, m);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v5, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.util.ArrayList] */
    public static vok u(izd izdVar) throws IOException {
        ?? arrayList;
        int i = izdVar.readInt();
        int unsignedShort = izdVar.readUnsignedShort();
        SparseLongArray sparseLongArray = new SparseLongArray(unsignedShort);
        while (true) {
            int i2 = unsignedShort - 1;
            if (unsignedShort <= 0) {
                break;
            }
            sparseLongArray.append(izdVar.readUnsignedShort(), izdVar.readInt());
            unsignedShort = i2;
        }
        String strH = izdVar.h();
        String[] strArr = aik.a;
        if (strH == null) {
            strH = "";
        }
        aik.b(strH, "2810f58abaa5105b14f66e784fdbfae67a9a89b7b93790439f271d78db8dfe87");
        int unsignedByte = izdVar.readUnsignedByte();
        if (unsignedByte > 0) {
            arrayList = new ArrayList(unsignedByte);
            while (true) {
                int i3 = unsignedByte - 1;
                if (unsignedByte <= 0) {
                    break;
                }
                String strH2 = izdVar.h();
                if (strH2 == null) {
                    strH2 = "";
                }
                arrayList.add(strH2);
                unsignedByte = i3;
            }
        } else {
            arrayList = k;
        }
        int unsignedShort2 = izdVar.readUnsignedShort();
        List list = arrayList;
        ArrayList arrayList2 = new ArrayList(unsignedShort2);
        while (true) {
            int i4 = unsignedShort2 - 1;
            if (unsignedShort2 <= 0) {
                break;
            }
            String strH3 = izdVar.h();
            if (strH3 == null) {
                strH3 = "";
            }
            arrayList2.add(strH3);
            unsignedShort2 = i4;
        }
        int iAvailable = izdVar.available();
        ?? arrayList3 = l;
        String strB = "z4H7x328ttC64Xont1zbi30a8tFPhejSUNDlMXmgZdXzgnfzbOAOuTadbXN7fz7";
        if (iAvailable > 0) {
            String strH4 = izdVar.h();
            if (strH4 == null) {
                strH4 = "";
            }
            strB = aik.b(strH4, "z4H7x328ttC64Xont1zbi30a8tFPhejSUNDlMXmgZdXzgnfzbOAOuTadbXN7fz7");
            int unsignedByte2 = izdVar.readUnsignedByte();
            if (unsignedByte2 > 0) {
                arrayList3 = new ArrayList(unsignedByte2);
                while (true) {
                    int i5 = unsignedByte2 - 1;
                    if (unsignedByte2 <= 0) {
                        break;
                    }
                    String strH5 = izdVar.h();
                    if (strH5 == null) {
                        strH5 = "";
                    }
                    arrayList3.add(strH5);
                    unsignedByte2 = i5;
                }
            }
        }
        return new vok(i, list, arrayList2, strB, arrayList3);
    }

    @Override // defpackage.no7
    public final Object h() {
        new SparseLongArray(0);
        return new vok(0, k, Collections.EMPTY_LIST, "z4H7x328ttC64Xont1zbi30a8tFPhejSUNDlMXmgZdXzgnfzbOAOuTadbXN7fz7", l);
    }

    @Override // defpackage.no7
    public final /* bridge */ /* synthetic */ Object k(izd izdVar) {
        return u(izdVar);
    }

    @Override // defpackage.no7
    public final Object q(byte[] bArr) {
        return u(new izd(new ByteArrayInputStream(bArr)));
    }
}
