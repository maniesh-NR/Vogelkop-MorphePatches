package defpackage;

import androidx.core.app.NotificationCompat;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class gl {
    public int a;
    public List b;

    public gl(int i, ArrayList arrayList) {
        this.a = i;
        this.b = Collections.unmodifiableList(arrayList);
    }

    public gl(int i, List list) {
        this.a = i;
        this.b = list;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:38:0x005d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.t7m a(int r8, defpackage.r7m r9) {
        /*
            Method dump skipped, instructions count: 390
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gl.a(int, r7m):t7m");
    }

    public final List b(r7m r7mVar) {
        String str;
        int i;
        List listSingletonList;
        List list = this.b;
        if (c(32)) {
            return list;
        }
        g1g g1gVar = new g1g(r7mVar.d);
        while (g1gVar.a() > 0) {
            int iA = g1gVar.A();
            int iA2 = g1gVar.b + g1gVar.A();
            if (iA == 134) {
                ArrayList arrayList = new ArrayList();
                int iA3 = g1gVar.A() & 31;
                for (int i2 = 0; i2 < iA3; i2++) {
                    String strY = g1gVar.y(3, StandardCharsets.UTF_8);
                    int iA4 = g1gVar.A();
                    boolean z = (iA4 & NotificationCompat.FLAG_HIGH_PRIORITY) != 0;
                    if (z) {
                        i = iA4 & 63;
                        str = "application/cea-708";
                    } else {
                        str = "application/cea-608";
                        i = 1;
                    }
                    byte bA = (byte) g1gVar.A();
                    g1gVar.O(1);
                    if (z) {
                        boolean z2 = (bA & 64) != 0;
                        byte[] bArr = j75.a;
                        listSingletonList = Collections.singletonList(z2 ? new byte[]{1} : new byte[]{0});
                    } else {
                        listSingletonList = null;
                    }
                    nj9 nj9Var = new nj9();
                    nj9Var.m = dzd.p(str);
                    nj9Var.d = strY;
                    nj9Var.J = i;
                    nj9Var.p = listSingletonList;
                    arrayList.add(new oj9(nj9Var));
                }
                list = arrayList;
            }
            g1gVar.N(iA2);
        }
        return list;
    }

    public final boolean c(int i) {
        return (this.a & i) != 0;
    }
}
