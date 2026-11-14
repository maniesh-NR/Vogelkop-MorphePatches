package defpackage;

import com.leanplum.internal.RequestBuilder;
import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final /* synthetic */ class pr3 implements Function1 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Serializable e;
    public final /* synthetic */ Serializable f;
    public final /* synthetic */ Object g;

    public /* synthetic */ pr3(Object obj, Object obj2, Object obj3, Serializable serializable, Serializable serializable2, Object obj4, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = serializable;
        this.f = serializable2;
        this.g = obj4;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        int i = 0;
        boolean z = false;
        Object obj2 = this.g;
        nqh nqhVar = this.f;
        nqh nqhVar2 = this.e;
        Object obj3 = this.d;
        Object obj4 = this.c;
        Object obj5 = this.b;
        switch (b) {
            case 0:
                ifg[] ifgVarArr = (ifg[]) obj5;
                List list = (List) obj4;
                vfd vfdVar = (vfd) obj3;
                nqh nqhVar3 = nqhVar2;
                nqh nqhVar4 = nqhVar;
                qr3 qr3Var = (qr3) obj2;
                p1d p1dVar = (p1d) obj;
                int length = ifgVarArr.length;
                int i2 = 0;
                while (i < length) {
                    nr3.d(p1dVar, ifgVarArr[i], (pfd) list.get(i2), vfdVar.getLayoutDirection(), nqhVar3.a, nqhVar4.a, qr3Var.a);
                    i++;
                    i2++;
                }
                return Unit.a;
            case 1:
                tah tahVar = (tah) obj5;
                zz9 zz9Var = (zz9) obj4;
                String str = (String) obj3;
                File file = (File) nqhVar2;
                o29 o29Var = (o29) nqhVar;
                String str2 = (String) obj2;
                oy1 oy1Var = (oy1) obj;
                int iOrdinal = oy1Var.ordinal();
                if (iOrdinal == 0) {
                    tahVar.I(zz9Var, new a0a(str, file, o29Var, str2));
                } else {
                    if (iOrdinal != 1 && iOrdinal != 2 && iOrdinal != 3) {
                        h9o.p();
                        return null;
                    }
                    zyk zykVar = ((f0a) tahVar.g).a;
                    int iOrdinal2 = oy1Var.ordinal();
                    if (iOrdinal2 != 0) {
                        if (iOrdinal2 == 1) {
                            joh.h((ysj) zykVar.getValue(), new rxh(2132018882));
                        } else {
                            if (iOrdinal2 != 2 && iOrdinal2 != 3) {
                                h9o.p();
                                return null;
                            }
                            joh.h((ysj) zykVar.getValue(), new rxh(2132019200));
                        }
                    }
                }
                return Unit.a;
            case 2:
                sj0 sj0Var = (sj0) obj5;
                xn0 xn0Var = (xn0) obj4;
                String str3 = (String) obj3;
                String str4 = (String) nqhVar2;
                String str5 = (String) nqhVar;
                String str6 = (String) obj2;
                td0 td0VarD = ((ck0) obj).d();
                td0VarD.a.getClass();
                qn0 qn0Var = new qn0(2443, -1, 6);
                qd0 qd0Var = td0VarD.b;
                List list2 = (List) qd0Var.n(57);
                ((list2 == null || list2.isEmpty()) ? new hf0(qd0Var, 57, vep.t(qd0Var, 57, 1)) : new hf0(qd0Var, 57, list2)).add(qn0Var);
                qn0Var.q(0, 1, sj0Var);
                qn0Var.q(1, 1, xn0Var);
                if (str3 != null) {
                    qn0Var.q(2, 1, str3);
                }
                if (str4 != null) {
                    qn0Var.q(3, 1, str4);
                }
                if (str5 != null) {
                    qn0Var.x(4, str5);
                }
                if (str6 != null) {
                    qn0Var.x(5, str6);
                }
                return Unit.a;
            case 3:
                String str7 = (String) obj5;
                ifd ifdVar = (ifd) obj4;
                vnj vnjVar = (vnj) obj3;
                LinkedHashSet linkedHashSet = (LinkedHashSet) nqhVar2;
                LinkedHashSet linkedHashSet2 = (LinkedHashSet) nqhVar;
                ArrayList arrayList = (ArrayList) obj2;
                pnj pnjVar = (pnj) ((onj) obj);
                String str8 = pnjVar.a;
                lnj lnjVar = pnjVar.b;
                if (str8.equals(str7)) {
                    boolean z2 = ifdVar instanceof nnj;
                    fnj fnjVar = vnjVar.g;
                    if (z2) {
                        if ((fnjVar != null ? fnjVar : null).c.add(lnjVar)) {
                            linkedHashSet.add(lnjVar);
                        }
                    } else {
                        if ((fnjVar != null ? fnjVar : null).c.remove(lnjVar)) {
                            linkedHashSet2.add(lnjVar);
                        }
                    }
                    vnjVar.h(lnjVar, str7, ifdVar);
                    Function1 function1 = pnjVar.c;
                    if (function1 != null) {
                        arrayList.add(function1);
                    }
                    z = true;
                }
                return Boolean.valueOf(z);
            default:
                String str9 = (String) obj4;
                String str10 = (String) obj3;
                String str11 = (String) nqhVar2;
                String str12 = (String) nqhVar;
                String str13 = (String) obj2;
                spa spaVar = (spa) obj;
                apa apaVar = apa.b;
                spaVar.b = z4o.i0(RequestBuilder.GET);
                z1m.s(((sfo) obj5).a, "odds/batch", spaVar.a);
                if (str9 != null) {
                    ynh.g(spaVar, "product", str9);
                }
                if (str10 != null) {
                    ynh.g(spaVar, "geoip-country-code", str10);
                }
                if (str11 != null) {
                    ynh.g(spaVar, "event_ids", str11);
                }
                if (str12 != null) {
                    ynh.g(spaVar, "user_id", str12);
                }
                if (str13 != null) {
                    ynh.g(spaVar, "ad_position", str13);
                }
                return Unit.a;
        }
    }
}
