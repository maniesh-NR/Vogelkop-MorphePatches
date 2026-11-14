package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;

/* loaded from: classes.dex */
public final /* synthetic */ class awa implements s3j {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ awa(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // defpackage.s3j
    public final void a(u3j u3jVar) {
        byte b = this.a;
        int i = 0;
        Object obj = this.b;
        switch (b) {
            case 0:
                ewa ewaVar = (ewa) obj;
                if (ewaVar.e() != null) {
                    nbl nblVar = ewaVar.A;
                    nblVar.getClass();
                    xug.i();
                    nblVar.f = true;
                    xwh xwhVar = nblVar.d;
                    if (xwhVar != null) {
                        xug.i();
                        if (!xwhVar.c.b.isDone()) {
                            Throwable gwaVar = new gwa(3, "The request is aborted silently and retried.", (Throwable) null);
                            xug.i();
                            xwhVar.f = true;
                            fr4 fr4Var = xwhVar.h;
                            Objects.requireNonNull(fr4Var);
                            fr4Var.cancel(true);
                            xwhVar.d.d(gwaVar);
                            xwhVar.e.b(null);
                            nbl nblVar2 = xwhVar.a;
                            xug.i();
                            nblVar2.a.addFirst(null);
                            nblVar2.c();
                        }
                    }
                    ewaVar.I(true);
                    String strG = ewaVar.g();
                    fwa fwaVar = (fwa) ewaVar.h;
                    to2 to2Var = ewaVar.i;
                    to2Var.getClass();
                    q3j q3jVarJ = ewaVar.J(strG, fwaVar, to2Var);
                    ewaVar.y = q3jVarJ;
                    Object[] objArr = {q3jVarJ.b()};
                    ArrayList arrayList = new ArrayList(1);
                    Object obj2 = objArr[0];
                    Objects.requireNonNull(obj2);
                    arrayList.add(obj2);
                    ewaVar.G(Collections.unmodifiableList(arrayList));
                    ewaVar.r();
                    nbl nblVar3 = ewaVar.A;
                    nblVar3.getClass();
                    xug.i();
                    nblVar3.f = false;
                    nblVar3.c();
                    break;
                }
                break;
            case 1:
                swg swgVar = (swg) obj;
                if (swgVar.e() != null) {
                    swgVar.J((twg) swgVar.h, swgVar.i);
                    swgVar.r();
                    break;
                }
                break;
            case 2:
                ArrayList arrayList2 = ((t3j) obj).n;
                int size = arrayList2.size();
                while (i < size) {
                    Object obj3 = arrayList2.get(i);
                    i++;
                    ((s3j) obj3).a(u3jVar);
                }
                break;
            default:
                ((y2n) obj).R();
                break;
        }
    }
}
