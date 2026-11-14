package defpackage;

import J.N;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class ld7 implements pke {
    public final /* synthetic */ byte a;
    public final qke b;
    public final Object c;

    public ld7(qke qkeVar) {
        this.a = (byte) 0;
        this.c = new i7f();
        this.b = qkeVar;
        qkeVar.W(this);
    }

    public ld7(qke qkeVar, j4c j4cVar) {
        this.a = (byte) 1;
        this.b = qkeVar;
        this.c = j4cVar;
        qkeVar.W(this);
    }

    @Override // defpackage.pke
    public final void w(b2l b2lVar, oke okeVar, long j, boolean z) {
        String strI;
        Object next;
        byte b = this.a;
        Object obj = this.c;
        switch (b) {
            case 0:
                if (!okeVar.d) {
                    String strI0 = ((d7l) b2lVar).i0();
                    int iMzfubQik = N.MzfubQik(strI0);
                    String[] strArr = wqm.a;
                    hd7 hd7Var = new hd7(aik.s(aik.f(strI0), wqm.e), iMzfubQik, System.currentTimeMillis());
                    i7f i7fVar = (i7f) obj;
                    g7f g7fVarC = u35.c(i7fVar, i7fVar);
                    while (g7fVarC.hasNext()) {
                        kd7 kd7Var = (kd7) g7fVarC.next();
                        kd7Var.getClass();
                        if (hd7Var.b == 1) {
                            kd7Var.f(new fh4(kd7Var, hd7Var, (byte) 28));
                        }
                    }
                    break;
                }
                break;
            default:
                if (!okeVar.d && z && !okeVar.c) {
                    d7l d7lVar = (d7l) b2lVar;
                    List listP = e82.p(new String[]{d7lVar.j.G(), d7lVar.j.getUrl()});
                    ArrayList arrayList = new ArrayList();
                    for (Object obj2 : listP) {
                        if (((String) obj2).length() > 0) {
                            arrayList.add(obj2);
                        }
                    }
                    nzl nzlVar = (nzl) ((j4c) obj).get();
                    Map map = (Map) nzlVar.d.a.getValue();
                    if (!map.isEmpty()) {
                        LinkedHashSet linkedHashSet = new LinkedHashSet();
                        int size = arrayList.size();
                        int i = 0;
                        while (i < size) {
                            Object obj3 = arrayList.get(i);
                            i++;
                            String str = (String) obj3;
                            String str2 = null;
                            if (!wqm.s(str) && !wqm.u(str) && (strI = j7h.i(str)) != null) {
                                Iterator it = map.entrySet().iterator();
                                while (true) {
                                    if (it.hasNext()) {
                                        next = it.next();
                                        String str3 = (String) ((Map.Entry) next).getValue();
                                        if (wqm.s(str3) || wqm.u(str3) || !Intrinsics.a(j7h.i(str3), strI)) {
                                        }
                                    } else {
                                        next = null;
                                    }
                                }
                                Map.Entry entry = (Map.Entry) next;
                                if (entry != null) {
                                    str2 = (String) entry.getKey();
                                }
                            }
                            if (str2 != null) {
                                linkedHashSet.add(str2);
                            }
                        }
                        Iterator it2 = linkedHashSet.iterator();
                        while (it2.hasNext()) {
                            ((y3i) nzlVar.a.get()).n(new gzl((String) it2.next()));
                        }
                        break;
                    }
                }
                break;
        }
    }
}
