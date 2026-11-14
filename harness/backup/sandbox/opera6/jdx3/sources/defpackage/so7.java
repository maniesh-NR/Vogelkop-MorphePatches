package defpackage;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlin.text.StringsKt;

/* loaded from: classes.dex */
public final class so7 extends no7 {
    public static final ro7 k = new ro7(v08.a);
    public static final n57 l = new n57((byte) 11);

    /* JADX INFO: Thrown type has an unknown type hierarchy: lv0 */
    public static ro7 t(izd izdVar) throws lv0, IOException {
        boolean z;
        int unsignedShort = izdVar.readUnsignedShort();
        p4j p4jVar = new p4j(new u9d(unsignedShort));
        for (int i = 0; i < unsignedShort; i++) {
            byte[] bArr = new byte[(int) izdVar.k()];
            izdVar.read(bArr);
            izd izdVar2 = new izd(new ByteArrayInputStream(bArr));
            byte b = izdVar2.readByte();
            String strH = izdVar2.h();
            if (strH == null) {
                throw new lv0("Unable to read app entry package name");
            }
            p4j p4jVarN = nb6.N(izdVar2, izdVar2.readByte(), "Bad signature");
            p4j p4jVarN2 = nb6.N(izdVar2, izdVar2.readByte(), "Bad url");
            ArrayList arrayList = new ArrayList();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            r9d it = p4jVarN2.iterator();
            while (((t9d) it).hasNext()) {
                String str = (String) it.next();
                int iK = StringsKt.K(str, '/', 0, 6);
                if (iK != -1) {
                    linkedHashMap.put(str.substring(0, iK), str.substring(iK));
                } else {
                    arrayList.add(str);
                }
            }
            nd7 nd7Var = new nd7((String[]) arrayList.toArray(new String[0]));
            boolean z2 = true;
            if ((b & 1) != 0) {
                z = true;
            } else {
                z = true;
                z2 = false;
            }
            p4jVar.add(new qo7(strH, p4jVarN, nd7Var, linkedHashMap, z2, (b & 2) != 0 ? z : false, (b & 4) != 0 ? z : false));
        }
        return new ro7(z4j.a(p4jVar));
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
