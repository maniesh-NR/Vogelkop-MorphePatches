package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.text.CharsKt;

/* loaded from: classes.dex */
public final class wji implements vji {
    public final Function1 a;
    public final see b;
    public see c;

    public wji(Map map, Function1 function1) {
        see seeVar;
        this.a = function1;
        if (map == null || map.isEmpty()) {
            seeVar = null;
        } else {
            seeVar = new see(map.size());
            for (Map.Entry entry : map.entrySet()) {
                seeVar.m(entry.getKey(), entry.getValue());
            }
        }
        this.b = seeVar;
    }

    @Override // defpackage.vji
    public final p8f a(String str, Function0 function0) {
        int length = str.length();
        for (int i = 0; i < length; i++) {
            if (!CharsKt.c(str.charAt(i))) {
                see seeVar = this.c;
                if (seeVar == null) {
                    long[] jArr = imi.a;
                    seeVar = new see();
                    this.c = seeVar;
                }
                Object objG = seeVar.g(str);
                if (objG == null) {
                    objG = new ArrayList();
                    seeVar.m(str, objG);
                }
                ((List) objG).add(function0);
                return new p8f((byte) 13, seeVar, function0, str);
            }
        }
        qp2.o("Registered key is empty or blank");
        return null;
    }

    @Override // defpackage.vji
    public final boolean c(Object obj) {
        return ((Boolean) this.a.invoke(obj)).booleanValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x008e  */
    @Override // defpackage.vji
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.Map d() {
        /*
            Method dump skipped, instructions count: 344
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wji.d():java.util.Map");
    }

    @Override // defpackage.vji
    public final Object e(String str) {
        see seeVar = this.b;
        List list = seeVar != null ? (List) seeVar.k(str) : null;
        List list2 = list;
        if (list2 == null || list2.isEmpty()) {
            return null;
        }
        if (list.size() > 1 && seeVar != null) {
            List listSubList = list.subList(1, list.size());
            int iF = seeVar.f(str);
            if (iF < 0) {
                iF = ~iF;
            }
            Object[] objArr = seeVar.c;
            Object obj = objArr[iF];
            seeVar.b[iF] = str;
            objArr[iF] = listSubList;
        }
        return list.get(0);
    }
}
