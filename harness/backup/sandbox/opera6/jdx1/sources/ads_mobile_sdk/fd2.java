package ads_mobile_sdk;

import defpackage.cpo;
import defpackage.flp;
import defpackage.hzo;
import defpackage.pqh;
import defpackage.r1p;
import defpackage.yso;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class fd2 extends ozb implements Function1 {
    public final /* synthetic */ ArrayList a;
    public final /* synthetic */ pqh b;
    public final /* synthetic */ pqh c;
    public final /* synthetic */ av2 d;
    public final /* synthetic */ String e;
    public final /* synthetic */ ae2 f;
    public final /* synthetic */ long g;
    public final /* synthetic */ boolean h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fd2(ArrayList arrayList, pqh pqhVar, pqh pqhVar2, av2 av2Var, String str, ae2 ae2Var, long j, boolean z) {
        super(1);
        this.a = arrayList;
        this.b = pqhVar;
        this.c = pqhVar2;
        this.d = av2Var;
        this.e = str;
        this.f = ae2Var;
        this.g = j;
        this.h = z;
    }

    public final Object invoke(Object obj) {
        ArrayList arrayList;
        h1 h1Var = (h1) obj;
        ArrayList arrayList2 = this.a;
        arrayList2.clear();
        pqh pqhVar = this.b;
        pqhVar.a = null;
        pqh pqhVar2 = this.c;
        pqhVar2.a = null;
        String strName = this.d.name();
        ds0 ds0Var = (ds0) h1Var.u().get(strName);
        de2 de2Var = de2.MISS_REASON_EMPTY;
        if (ds0Var == null) {
            pqhVar2.a = de2Var;
            return h1Var;
        }
        Map mapO = ds0Var.o();
        String str = this.e;
        h6 h6Var = (h6) mapO.get(str);
        if (h6Var == null) {
            pqhVar2.a = de2Var;
            return h1Var;
        }
        ae2 ae2Var = this.f;
        Map mapSingletonMap = Collections.singletonMap(str, h6Var);
        long j = this.g;
        h6 h6Var2 = (h6) ae2Var.a(mapSingletonMap, j, arrayList2).get(str);
        flp<c6> flpVarR = h6Var2 != null ? h6Var2.r() : null;
        if (flpVarR == null) {
            flpVarR = l08.a;
        }
        hzo hzoVar = (hzo) h1Var.n();
        if (flpVarR.isEmpty()) {
            pqhVar2.a = de2.MISS_REASON_EXPIRED;
            yso ysoVar = (yso) ds0Var.n();
            ysoVar.e();
            ysoVar.b(str);
            ds0 ds0Var2 = (ds0) ysoVar.a();
            if (ds0Var2.o().isEmpty()) {
                hzoVar.e();
                hzoVar.b(strName);
            } else {
                hzoVar.e();
                hzoVar.c(strName, ds0Var2);
            }
        } else {
            ArrayList arrayList3 = new ArrayList();
            for (Object obj2 : flpVarR) {
                ds0 ds0Var3 = ds0Var;
                if (((c6) obj2).r$1() == 2) {
                    arrayList3.add(obj2);
                }
                ds0Var = ds0Var3;
            }
            ds0 ds0Var4 = ds0Var;
            List listC0 = CollectionsKt.c0(new w8l((byte) 15), arrayList3);
            if (listC0.isEmpty()) {
                pqhVar2.a = de2Var;
                hzoVar.e();
                yso ysoVar2 = (yso) ds0Var4.n();
                ysoVar2.e();
                r1p r1pVar = (r1p) h6Var.n();
                r1pVar.f();
                r1pVar.e();
                r1pVar.f();
                r1pVar.c(flpVarR);
                r1pVar.b(j);
                ysoVar2.c(str, (h6) r1pVar.a());
                hzoVar.c(strName, (ds0) ysoVar2.a());
            } else {
                c6 c6Var = (c6) CollectionsKt.K(listC0);
                pqhVar.a = c6Var;
                if (this.h) {
                    arrayList = new ArrayList();
                    for (Object obj3 : flpVarR) {
                        if (((c6) obj3) != c6Var) {
                            arrayList.add(obj3);
                        }
                    }
                } else {
                    arrayList = new ArrayList(k95.o(flpVarR, 10));
                    for (c6 c6Var2 : flpVarR) {
                        if (c6Var2 == c6Var) {
                            cpo cpoVar = (cpo) c6Var2.n();
                            cpoVar.b(3);
                            c6Var2 = (c6) cpoVar.a();
                        }
                        arrayList.add(c6Var2);
                    }
                }
                yso ysoVar3 = (yso) ds0Var4.n();
                if (arrayList.isEmpty()) {
                    ysoVar3.e();
                    ysoVar3.b(str);
                } else {
                    ysoVar3.e();
                    r1p r1pVar2 = (r1p) h6Var.n();
                    r1pVar2.f();
                    r1pVar2.e();
                    r1pVar2.f();
                    r1pVar2.c(arrayList);
                    r1pVar2.b(j);
                    ysoVar3.c(str, (h6) r1pVar2.a());
                }
                ds0 ds0Var5 = (ds0) ysoVar3.a();
                if (ds0Var5.o().isEmpty()) {
                    hzoVar.e();
                    hzoVar.b(strName);
                } else {
                    hzoVar.e();
                    hzoVar.c(strName, ds0Var5);
                }
            }
        }
        return (h1) hzoVar.a();
    }
}
