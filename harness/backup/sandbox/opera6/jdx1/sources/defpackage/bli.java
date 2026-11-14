package defpackage;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;

/* loaded from: classes.dex */
public final /* synthetic */ class bli implements Function1 {
    public final /* synthetic */ byte a;

    public /* synthetic */ bli(byte b) {
        this.a = b;
    }

    public final Object invoke(Object obj) {
        sgj q0iVar;
        sgj sgjVar;
        sgj q0iVar2;
        sgj sgjVar2;
        switch (this.a) {
            case 0:
                List list = (List) obj;
                Object obj2 = list.get(0);
                int i = ((Intrinsics.a(obj2, Boolean.FALSE) || obj2 == null) ? null : (ujl) cli.e.b.invoke(obj2)).a;
                Object obj3 = list.get(1);
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                n6j n6jVar = (n6j) obj;
                jsi[] jsiVarArr = jsi.a;
                n6j.c(n6jVar, 1, 2132021106, 15, 0, (List) null, 56);
                n6j.c(n6jVar, 3, 2132021202, 4, 0, (List) null, 56);
                n6j.c(n6jVar, 16, 2132018840, 9, 0, (List) null, 56);
                n6j.c(n6jVar, 4, 2132021426, 12, 0, (List) null, 56);
                n6j.c(n6jVar, 5, 2132021199, 10, 0, (List) null, 56);
                n6j.c(n6jVar, 6, 2132021204, 5, 0, (List) null, 56);
                n6j.c(n6jVar, 7, 2132021428, 6, 0, (List) null, 56);
                n6j.c(n6jVar, 14, 2132021388, 7, 0, (List) null, 56);
                n6j.c(n6jVar, 11, 2132021424, 8, 0, (List) null, 56);
                n6j.c(n6jVar, 13, 2132020643, 11, 0, (List) null, 56);
                n6j.c(n6jVar, 8, 2132021427, 13, 0, (List) null, 56);
                n6j.c(n6jVar, 9, 2132021425, 14, 0, (List) null, 56);
                n6j.c(n6jVar, 10, 2132021005, 3, 0, (List) null, 56);
                n6j.c(n6jVar, 12, 2132021186, 1, 0, (List) null, 56);
                n6j.c(n6jVar, 15, 2132021083, 2, 0, (List) null, 56);
                break;
            case 7:
                break;
            case 8:
                y8f y8fVar = (y8f) obj;
                long j = y8fVar.a;
                if ((9223372034707292159L & j) == 9205357640488583168L) {
                    break;
                } else {
                    break;
                }
            case 9:
                ff1 ff1Var = (ff1) obj;
                break;
            case 10:
                break;
            case 11:
                break;
            case 12:
                break;
            case 13:
                break;
            case 14:
                ytb ytbVar = (ytb) obj;
                s15 s15VarG = ytbVar.g();
                if (!(s15VarG instanceof itb)) {
                    break;
                } else {
                    break;
                }
            case 15:
                n15 n15Var = (itb) obj;
                KSerializer kSerializerR = zwg.r(n15Var);
                if (kSerializerR != null) {
                    break;
                } else if (n15Var.a().isInterface()) {
                    break;
                }
                break;
            case 16:
                n15 n15Var2 = (itb) obj;
                ong ongVarR = zwg.r(n15Var2);
                if (ongVarR == null) {
                    ongVarR = n15Var2.a().isInterface() ? new ong(n15Var2) : null;
                }
                if (ongVarR != null) {
                    break;
                }
                break;
            case 17:
                break;
            case 18:
                break;
            case 19:
                break;
            case 20:
                aqb aqbVar = (aqb) obj;
                aqbVar.c = true;
                aqbVar.n = false;
                aqbVar.d = true;
                break;
            case 21:
                pzh pzhVar = (pzh) obj;
                vzh vzhVar = pzhVar.g;
                int i2 = pzhVar.d;
                String strString = vzhVar.string();
                if (pzhVar.q) {
                    p0i p0iVar = t0i.b;
                    sgjVar = new sgj(i2, strString);
                } else {
                    if (i2 == 401) {
                        p0i p0iVar2 = t0i.b;
                        q0iVar = new q0i(new fgj());
                    } else if (i2 == 422) {
                        p0i p0iVar3 = t0i.b;
                        esd esdVar = ehj.j;
                        q0iVar = new q0i(y4h.h(strString));
                    } else if (i2 == 429) {
                        p0i p0iVar4 = t0i.b;
                        q0iVar = new q0i(new yej(xej.b));
                    } else {
                        p0i p0iVar5 = t0i.b;
                        q0iVar = new q0i(new lv0(sko.i(i2, "Response code: ")));
                    }
                    sgjVar = q0iVar;
                }
                break;
            case 22:
                break;
            case 23:
                pzh pzhVar2 = (pzh) obj;
                vzh vzhVar2 = pzhVar2.g;
                int i3 = pzhVar2.d;
                String strString2 = vzhVar2.string();
                if (pzhVar2.q) {
                    p0i p0iVar6 = t0i.b;
                    sgjVar2 = new sgj(i3, strString2);
                } else {
                    if (i3 == 422) {
                        p0i p0iVar7 = t0i.b;
                        esd esdVar2 = ehj.j;
                        q0iVar2 = new q0i(y4h.h(strString2));
                    } else if (i3 == 429) {
                        p0i p0iVar8 = t0i.b;
                        q0iVar2 = new q0i(new yej(xej.b));
                    } else {
                        p0i p0iVar9 = t0i.b;
                        q0iVar2 = new q0i(new lv0(sko.i(i3, "Response code: ")));
                    }
                    sgjVar2 = q0iVar2;
                }
                break;
            case 24:
                break;
            case 25:
                break;
            case 26:
                break;
            case 27:
                break;
            case 28:
                ((Integer) obj).getClass();
                break;
            default:
                n6j n6jVar2 = (n6j) obj;
                tzj[] tzjVarArr = tzj.a;
                n6j.c(n6jVar2, 1, 2132021242, 2131364307, 0, (List) null, 56);
                n6j.c(n6jVar2, 2, 2132017383, 2131364340, 2131231967, (List) null, 48);
                n6j.c(n6jVar2, 3, 2132021620, 2131364347, 2131232250, (List) null, 48);
                break;
        }
        return Unit.a;
    }
}
