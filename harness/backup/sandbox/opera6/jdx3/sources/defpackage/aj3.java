package defpackage;

import android.net.Uri;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final /* synthetic */ class aj3 implements Function1 {
    public final /* synthetic */ byte a = 1;
    public final /* synthetic */ cj3 b;
    public final /* synthetic */ pqh c;

    public /* synthetic */ aj3(cj3 cj3Var, pqh pqhVar) {
        this.b = cj3Var;
        this.c = pqhVar;
    }

    public /* synthetic */ aj3(pqh pqhVar, cj3 cj3Var) {
        this.c = pqhVar;
        this.b = cj3Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        pqh pqhVar = this.c;
        cj3 cj3Var = this.b;
        switch (b) {
            case 0:
                Uri uri = (Uri) obj;
                pqhVar.a = uri;
                cj3Var.a(uri);
                break;
            default:
                m9d m9dVar = (m9d) obj;
                if (m9dVar != null) {
                    LinkedHashSet<vj3> linkedHashSet = m9dVar.a;
                    Uri uri2 = (Uri) pqhVar.a;
                    p4j p4jVar = new p4j();
                    p4j p4jVar2 = m9dVar.c;
                    LinkedHashSet<wj3> linkedHashSet2 = m9dVar.b;
                    ArrayList arrayList = new ArrayList(k95.o(linkedHashSet, 10));
                    for (vj3 vj3Var : linkedHashSet) {
                        arrayList.add(new bj3(vj3Var.a, vj3Var.b.a()));
                    }
                    p4jVar.addAll(arrayList);
                    ArrayList arrayList2 = new ArrayList(k95.o(linkedHashSet2, 10));
                    for (wj3 wj3Var : linkedHashSet2) {
                        arrayList2.add(new bj3(wj3Var.a, wj3Var.b));
                    }
                    p4jVar.addAll(arrayList2);
                    cj3Var.g = z4j.a(p4jVar);
                    jze jzeVar = cj3Var.d;
                    LinkedHashSet linkedHashSet3 = new LinkedHashSet();
                    Iterator it = p4jVar2.iterator();
                    while (it.hasNext()) {
                        linkedHashSet3.add(((uj3) it.next()).a);
                    }
                    jzeVar.r(b5j.e(linkedHashSet, linkedHashSet3));
                    cj3Var.e.r(Boolean.TRUE);
                    cj3Var.j = p4jVar2;
                    cj3Var.h = linkedHashSet2;
                    cj3Var.a(uri2);
                    new rml(Unit.a, cj3Var.a).a(new t02(m9dVar, (byte) 28)).m(cj3Var.f);
                }
                break;
        }
        return Unit.a;
    }
}
