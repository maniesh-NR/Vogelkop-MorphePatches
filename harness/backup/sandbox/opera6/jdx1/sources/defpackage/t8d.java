package defpackage;

import android.content.res.Resources;
import java.util.List;
import java.util.WeakHashMap;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final /* synthetic */ class t8d implements Function2 {
    public final /* synthetic */ byte a = 1;
    public final /* synthetic */ Function0 b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object j;
    public final /* synthetic */ Object k;

    public /* synthetic */ t8d(qcg qcgVar, Pair pair, Function1 function1, Function1 function12, eef eefVar, List list, agm agmVar, List list2, Function1 function13, Function0 function0) {
        this.c = qcgVar;
        this.d = pair;
        this.e = function1;
        this.f = function12;
        this.g = eefVar;
        this.h = list;
        this.i = agmVar;
        this.j = list2;
        this.k = function13;
        this.b = function0;
    }

    public /* synthetic */ t8d(qcg qcgVar, Function1 function1, Function1 function12, eef eefVar, List list, agm agmVar, List list2, Function1 function13, c8e c8eVar, Function0 function0, int i) {
        this.c = qcgVar;
        this.d = function1;
        this.e = function12;
        this.f = eefVar;
        this.g = list;
        this.h = agmVar;
        this.i = list2;
        this.j = function13;
        this.k = c8eVar;
        this.b = function0;
    }

    public /* synthetic */ t8d(u8d u8dVar, lyi lyiVar, Integer num, Function0 function0, Function0 function02, Function0 function03, Function0 function04, Function0 function05, Function0 function06, c8e c8eVar, int i) {
        this.c = u8dVar;
        this.d = lyiVar;
        this.e = num;
        this.b = function0;
        this.f = function02;
        this.g = function03;
        this.h = function04;
        this.i = function05;
        this.j = function06;
        this.k = c8eVar;
    }

    public final Object invoke(Object obj, Object obj2) throws Resources.NotFoundException {
        byte b = this.a;
        Object obj3 = this.k;
        Object obj4 = this.j;
        Object obj5 = this.i;
        Object obj6 = this.h;
        Object obj7 = this.g;
        Object obj8 = this.f;
        Object obj9 = this.e;
        Object obj10 = this.d;
        Object obj11 = this.c;
        switch (b) {
            case 0:
                ((Integer) obj2).getClass();
                sfe.q((u8d) obj11, (lyi) obj10, (Integer) obj9, this.b, (Function0) obj8, (Function0) obj7, (Function0) obj6, (Function0) obj5, (Function0) obj4, (c8e) obj3, (ih5) obj, aoh.m(1));
                break;
            case 1:
                qcg qcgVar = (qcg) obj11;
                Pair pair = (Pair) obj10;
                Function1 function1 = (Function1) obj9;
                Function1 function12 = (Function1) obj8;
                eef eefVar = (eef) obj7;
                List list = (List) obj6;
                agm agmVar = (agm) obj5;
                List list2 = (List) obj4;
                Function1 function13 = (Function1) obj3;
                ih5 ih5Var = (ih5) obj;
                int iIntValue = ((Integer) obj2).intValue();
                vt9 vt9Var = (vt9) ih5Var;
                if (vt9Var.N(iIntValue & 1, (iIntValue & 3) != 2)) {
                    boolean z = qcgVar.b;
                    z7e z7eVar = z7e.b;
                    Function0 function0 = this.b;
                    if (z) {
                        vt9Var.W(-1965484815);
                        WeakHashMap weakHashMap = k3o.x;
                        p37.k(qcgVar, pair, function1, function12, eefVar, list, agmVar, list2, function13, function0, ipe.h0(z7eVar, fac.m(vt9Var).g), vt9Var, 32768);
                        vt9Var.p(false);
                    } else {
                        vt9Var.W(-1964815587);
                        WeakHashMap weakHashMap2 = k3o.x;
                        p37.j(qcgVar, function1, function12, eefVar, list, agmVar, list2, function13, ipe.h0(z7eVar, fac.m(vt9Var).g), function0, vt9Var, 4096);
                        vt9Var.p(false);
                    }
                } else {
                    vt9Var.Q();
                }
                break;
            default:
                ((Integer) obj2).getClass();
                p37.j((qcg) obj11, (Function1) obj10, (Function1) obj9, (eef) obj8, (List) obj7, (agm) obj6, (List) obj5, (Function1) obj4, (c8e) obj3, this.b, (ih5) obj, aoh.m(4097));
                break;
        }
        return Unit.a;
    }
}
