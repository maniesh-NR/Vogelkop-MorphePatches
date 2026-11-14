package defpackage;

import android.text.TextUtils;
import android.util.SparseArray;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class ajn {
    public final int a;
    public final Map b;
    public final SparseArray c;

    public ajn() {
        this.a = 0;
        this.b = Collections.EMPTY_MAP;
        SparseArray sparseArray = new SparseArray();
        sparseArray.append(1, yv.c("0x5fda93982ffb2b9035dd65edbcf9c0bcdcd46012", b85.c));
        this.c = sparseArray;
    }

    public ajn(izd izdVar) throws IOException {
        yv yvVarC;
        this.a = izdVar.readInt();
        int unsignedShort = izdVar.readUnsignedShort();
        this.b = new HashMap(unsignedShort);
        while (true) {
            int i = unsignedShort - 1;
            if (unsignedShort > 0) {
                long unsignedShort2 = izdVar.readUnsignedShort();
                String strH = izdVar.h();
                if (strH == null) {
                    s49.m("Empty node url");
                    throw null;
                }
                this.b.put(Long.valueOf(unsignedShort2), strH);
                unsignedShort = i;
            } else {
                SparseArray sparseArray = new SparseArray();
                sparseArray.append(1, yv.c("0x5fda93982ffb2b9035dd65edbcf9c0bcdcd46012", b85.c));
                this.c = sparseArray;
                if (izdVar.available() <= 0) {
                    return;
                }
                int unsignedShort3 = izdVar.readUnsignedShort();
                while (true) {
                    int i2 = unsignedShort3 - 1;
                    if (unsignedShort3 <= 0) {
                        return;
                    }
                    int unsignedShort4 = izdVar.readUnsignedShort();
                    String strH2 = izdVar.h();
                    b85 b85Var = b85.c;
                    if (TextUtils.isEmpty(strH2)) {
                        yvVarC = null;
                    } else {
                        try {
                            yvVarC = yv.c(strH2, b85Var);
                        } catch (NumberFormatException unused) {
                        }
                    }
                    if (yvVarC == null) {
                        s49.m("Empty or invalid proxy address");
                        throw null;
                    }
                    this.c.put(unsignedShort4, yvVarC);
                    unsignedShort3 = i2;
                }
            }
        }
    }
}
