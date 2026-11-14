package defpackage;

import java.util.ArrayList;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;
import kotlin.collections.CollectionsKt;

/* loaded from: classes.dex */
public final class w81 implements xj4 {
    public final hnl a;
    public final fd4 b;
    public final xfk c;

    public w81(hnl hnlVar, fd4 fd4Var, xfk xfkVar) {
        this.a = hnlVar;
        this.b = fd4Var;
        this.c = xfkVar;
    }

    @Override // defpackage.xj4
    public final wj4 a(wc4 wc4Var, Map map, dk4 dk4Var) throws Exception {
        int i;
        ArrayList arrayList;
        qii qiiVar = qii.b;
        fd4 fd4Var = this.b;
        int i2 = fd4Var.h;
        if (i2 == 0) {
            i = 0;
        } else if (i2 == 1) {
            i = 1;
        } else {
            if (i2 == 2) {
                t3p.i(phj.y0(fd4Var.h), "Unsupported session mode: ");
                return null;
            }
            i = i2;
        }
        buf bufVarI = uup.i(fd4Var, this.c, map);
        ArrayList arrayList2 = bufVarI.a;
        if (arrayList2.isEmpty()) {
            Objects.toString(fd4Var);
            dk4Var.a();
            return qiiVar;
        }
        ArrayList arrayList3 = fd4Var.d;
        if (arrayList3 != null) {
            ArrayList arrayList4 = new ArrayList(k95.o(arrayList3, 10));
            int size = arrayList3.size();
            int i3 = 0;
            while (i3 < size) {
                Object obj = arrayList3.get(i3);
                i3++;
                ruf rufVar = (ruf) CollectionsKt.Z(((g9b) obj).a.a);
                arrayList4.add(new m8b(rufVar.a.getWidth(), rufVar.a.getHeight(), rufVar.b));
            }
            arrayList = arrayList4;
        } else {
            arrayList = null;
        }
        if (arrayList != null && !arrayList.isEmpty()) {
            int size2 = arrayList.size();
            int i4 = 0;
            while (i4 < size2) {
                Object obj2 = arrayList.get(i4);
                i4++;
                if (((m8b) obj2).c != ((m8b) arrayList.get(0)).c) {
                    qp2.n("All InputStream.Config objects must have the same format for multi resolution");
                    return null;
                }
            }
        }
        if (wc4Var.P(new x3j(i, arrayList, arrayList2, (Executor) this.a.j.getValue(), dk4Var, fd4Var.f, fd4Var.g))) {
            return new vj4(bufVarI.b, bufVarI.d);
        }
        wc4Var.toString();
        Objects.toString(dk4Var);
        dk4Var.a();
        return qiiVar;
    }
}
