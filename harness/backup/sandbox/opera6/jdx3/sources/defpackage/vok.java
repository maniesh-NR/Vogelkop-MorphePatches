package defpackage;

import android.util.Pair;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class vok {
    public final int a;
    public final List b;
    public final String c;
    public final List d;
    public final rgh e;

    public vok(int i, List list, List list2, String str, List list3) {
        this.a = i;
        this.b = Collections.unmodifiableList(list);
        String[] strArr = new String[list2.size()];
        String[] strArr2 = new String[list2.size()];
        for (int i2 = 0; i2 < list2.size(); i2++) {
            String str2 = (String) list2.get(i2);
            int iIndexOf = str2.indexOf(47);
            if (iIndexOf < 0) {
                strArr[i2] = str2;
                strArr2[i2] = "*";
            } else {
                strArr[i2] = str2.substring(0, iIndexOf);
                String strSubstring = str2.substring(iIndexOf + 1);
                strArr2[i2] = strSubstring;
                if (strSubstring.endsWith("/")) {
                    strArr2[i2] = p3p.h(1, 0, strArr2[i2]);
                }
            }
        }
        Pair pair = new Pair(strArr, strArr2);
        String[] strArr3 = (String[]) pair.first;
        yv4 yv4Var = new yv4((byte) 5);
        yv4Var.c = strArr3;
        String[] strArr4 = (String[]) pair.second;
        txi txiVar = new txi(yv4Var, (byte) 25);
        rgh rghVar = new rgh();
        rghVar.a = txiVar;
        rghVar.b = strArr4;
        this.e = rghVar;
        this.c = str;
        this.d = Collections.unmodifiableList(list3);
    }
}
