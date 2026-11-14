package defpackage;

import android.graphics.Typeface;
import android.util.Pair;
import com.leanplum.Leanplum;
import com.leanplum.messagetemplates.OperaConfigBundleSheet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final /* synthetic */ class ip1 implements qp5 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ip1(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    public final void accept(Object obj) {
        y90 y90Var;
        Object next;
        y90 y90Var2;
        y90 y90Var3;
        y90 y90Var4;
        Pair pair;
        Pair pair2;
        byte b;
        byte b2 = this.a;
        Object obj2 = this.b;
        switch (b2) {
            case 0:
                jp1.d((jp1) obj2, (Typeface) obj);
                break;
            case 1:
                bq1.a((bq1) obj2, (Typeface) obj);
                break;
            case 2:
                yq1.o((yq1) obj2, (Typeface) obj);
                break;
            case 3:
                ((f92) obj2).f((c53) obj);
                break;
            case 4:
                qx7 qx7Var = (qx7) obj2;
                qx7Var.r.h(px7.class, ((nz7) obj).a);
                qx7Var.g0();
                break;
            case 5:
                fk5 fk5Var = (fk5) obj2;
                ek5 ek5Var = (ek5) obj;
                if (ek5Var != null) {
                    x5f x5fVar = fk5Var.g;
                    eej eejVar = fk5Var.c;
                    x5f x5fVar2 = fk5Var.h;
                    boolean z = ek5Var instanceof ck5;
                    y90 y90Var5 = y90.b;
                    y90 y90Var6 = y90.c;
                    if (z) {
                        ck5 ck5Var = (ck5) ek5Var;
                        List list = ck5Var.c;
                        z77 z77Var = fk5Var.b;
                        xle xleVar = xle.c;
                        xle xleVar2 = xle.d;
                        xle xleVar3 = xle.b;
                        xle xleVar4 = xle.e;
                        gk5 gk5Var = ck5Var.b;
                        String str = ck5Var.a;
                        List<p58> list2 = list;
                        Iterator it = list2.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                next = it.next();
                                if (((p58) next).a) {
                                }
                            } else {
                                next = null;
                            }
                        }
                        p58 p58Var = (p58) next;
                        i1g i1gVar = i1g.b;
                        if (p58Var == null || (p58Var instanceof imm) || (p58Var instanceof kye) || p58Var.equals(xleVar4)) {
                            y90Var2 = y90Var5;
                            y90Var3 = y90Var6;
                        } else {
                            boolean zEquals = p58Var.equals(xleVar3);
                            ijm ijmVar = ijm.b;
                            if (zEquals || p58Var.equals(xleVar2)) {
                                y90Var2 = y90Var5;
                                y90Var3 = y90Var6;
                                zga zgaVar = new zga(fk5Var.d, str, gk5Var);
                                z77Var.getClass();
                                z77Var.b(zgaVar, ijmVar);
                            } else {
                                if (p58Var.equals(i1gVar) || p58Var.equals(xleVar)) {
                                    y90Var2 = y90Var5;
                                } else {
                                    y90Var2 = y90Var5;
                                    if (!(p58Var instanceof jjb) && !(p58Var instanceof dzh) && !(p58Var instanceof z5j) && !(p58Var instanceof hjb)) {
                                        if (!(p58Var instanceof d5b)) {
                                            h9o.p();
                                            break;
                                        } else {
                                            int i = ((d5b) p58Var).b;
                                            gom gomVarA = mom.a(fk5Var.a);
                                            int iOrdinal = gomVarA.a.ordinal();
                                            y90Var3 = y90Var6;
                                            if (iOrdinal != 0) {
                                                if (iOrdinal != 1) {
                                                    b = 2;
                                                    if (iOrdinal != 2) {
                                                        if (iOrdinal != 3) {
                                                            h9o.p();
                                                            break;
                                                        }
                                                    }
                                                }
                                                Integer num = gomVarA.c;
                                                if (num == null || num.intValue() < i) {
                                                    esg esgVar = new esg((byte) 20, x5fVar, str, false);
                                                    nej nejVar = eejVar.a;
                                                    og5 og5Var = new og5((Object) esgVar, (byte) 2);
                                                    nejVar.getClass();
                                                    nejVar.b(og5Var, ijmVar);
                                                } else {
                                                    g77 g77Var = new g77(new nf(fk5Var, gomVarA, (byte) 26), x5fVar, str);
                                                    nej nejVar2 = eejVar.a;
                                                    og5 og5Var2 = new og5((Object) g77Var, (byte) 2);
                                                    nejVar2.getClass();
                                                    nejVar2.b(og5Var2, ijmVar);
                                                }
                                            } else {
                                                b = 2;
                                            }
                                            esg esgVar2 = new esg((byte) 20, x5fVar, str, false);
                                            nej nejVar3 = eejVar.a;
                                            og5 og5Var3 = new og5(esgVar2, b);
                                            nejVar3.getClass();
                                            nejVar3.b(og5Var3, ijmVar);
                                        }
                                    }
                                }
                                y90Var3 = y90Var6;
                                b76 b76Var = new b76((byte) 0);
                                z77Var.getClass();
                                z77Var.b(b76Var, ijmVar);
                            }
                        }
                        xf8.F0((pde) ((qln) fk5Var.i.get()).k.b, v08.a);
                        int iOrdinal2 = gk5Var.ordinal();
                        if (iOrdinal2 == 0) {
                            y90Var4 = y90Var2;
                        } else if (iOrdinal2 != 1) {
                            h9o.p();
                            break;
                        } else {
                            y90Var4 = y90Var3;
                        }
                        ArrayList arrayList = new ArrayList();
                        for (p58 p58Var2 : list2) {
                            if (p58Var2 instanceof d5b) {
                                pair = new Pair(w90.b, String.valueOf(((d5b) p58Var2).b));
                            } else if (p58Var2 instanceof hjb) {
                                pair = new Pair(w90.c, ((hjb) p58Var2).b);
                            } else if (p58Var2 instanceof jjb) {
                                pair = new Pair(w90.d, ((jjb) p58Var2).b);
                            } else {
                                if (Intrinsics.a(p58Var2, xleVar3)) {
                                    pair2 = new Pair(w90.e, null);
                                } else if (Intrinsics.a(p58Var2, xleVar)) {
                                    pair2 = new Pair(w90.f, null);
                                } else if (Intrinsics.a(p58Var2, i1gVar)) {
                                    pair2 = new Pair(w90.g, null);
                                } else if (p58Var2 instanceof dzh) {
                                    pair = new Pair(w90.h, ((dzh) p58Var2).b);
                                } else if (p58Var2 instanceof z5j) {
                                    pair = new Pair(w90.i, ((z5j) p58Var2).b);
                                } else if (Intrinsics.a(p58Var2, xleVar2)) {
                                    pair2 = new Pair(w90.j, null);
                                } else if (p58Var2 instanceof imm) {
                                    pair = new Pair(w90.k, ((imm) p58Var2).b);
                                } else if (Intrinsics.a(p58Var2, xleVar4)) {
                                    pair = null;
                                } else if (!Intrinsics.a(p58Var2, kye.b)) {
                                    h9o.p();
                                    break;
                                } else {
                                    pair = new Pair(w90.l, null);
                                }
                                pair = pair2;
                            }
                            if (pair != null) {
                                arrayList.add(pair);
                            }
                        }
                        x5fVar2.F(str, y90Var4, arrayList, false);
                        break;
                    } else if (ek5Var instanceof dk5) {
                        dk5 dk5Var = (dk5) ek5Var;
                        uj5 uj5Var = dk5Var.a;
                        fk5Var.f.b(true, null);
                        mdh mdhVar = (mdh) fk5Var.j.b.get();
                        mdhVar.getClass();
                        mdh.b(mdhVar, true, iqi.EXPIRED, null, 4);
                        ffb ffbVar = uj5Var.s;
                        int size = ffbVar.size();
                        r9c r9cVar = fk5Var.e;
                        if (size > 1) {
                            Map mapSingletonMap = Collections.singletonMap(OperaConfigBundleSheet.PARAM_CAROUSEL_WALLPAPERS, ffbVar);
                            r9cVar.getClass();
                            Leanplum.trackLocal("User applied config bundle", mapSingletonMap);
                        } else {
                            r9cVar.getClass();
                            Leanplum.trackLocal("User applied config bundle");
                        }
                        String str2 = uj5Var.p;
                        int iOrdinal3 = dk5Var.b.ordinal();
                        if (iOrdinal3 == 0) {
                            y90Var = y90Var5;
                        } else if (iOrdinal3 != 1) {
                            h9o.p();
                            break;
                        } else {
                            y90Var = y90Var6;
                        }
                        x5fVar2.F(str2, y90Var, l08.a, true);
                        break;
                    } else {
                        h9o.p();
                        break;
                    }
                }
                break;
            case 6:
                Boolean bool = (Boolean) obj;
                rmg rmgVar = ((d1i) obj2).d;
                if (rmgVar != null) {
                    rmgVar.invoke(bool);
                    break;
                }
                break;
            case 7:
                yo2 yo2Var = (yo2) obj;
                for (Map.Entry entry : ((Map) obj2).entrySet()) {
                    int i2 = yo2Var.b - ((co2) entry.getKey()).f;
                    if (((co2) entry.getKey()).g) {
                        i2 = -i2;
                    }
                    int iJ = d2m.j(i2);
                    ntk ntkVar = (ntk) entry.getValue();
                    ntkVar.getClass();
                    xug.q(new py4(ntkVar, iJ, -1, (byte) 2));
                }
                break;
            case 8:
                a32 a32Var = (a32) obj2;
                if (a32Var != null) {
                    a32Var.k();
                    break;
                }
                break;
            case h1a.ERROR_PRIVATE_FIELD_NUMBER /* 9 */:
                ((l94) obj2).b((xo2) obj);
                break;
            case h1a.INTENTS_REGULAR_FIELD_NUMBER /* 10 */:
                cyd cydVar = (cyd) obj2;
                Objects.toString(((xo2) obj).b);
                cydVar.g = null;
                ((l94) cydVar.l).b((f28) cydVar.f);
                cydVar.a();
                break;
            default:
                ((z1h) obj2).b((q3o) obj);
                break;
        }
    }
}
