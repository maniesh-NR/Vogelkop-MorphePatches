package defpackage;

import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final /* synthetic */ class w2 implements Function2 {
    public final /* synthetic */ byte a = 0;
    public final /* synthetic */ Function1 b;
    public final /* synthetic */ Function1 c;
    public final /* synthetic */ Function0 d;
    public final /* synthetic */ c8e e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object j;
    public final /* synthetic */ Object k;
    public final /* synthetic */ br9 l;

    public /* synthetic */ w2(b3 b3Var, Function0 function0, Function0 function02, Function0 function03, Function1 function1, Function1 function12, Function0 function04, Function0 function05, Function0 function06, Function0 function07, c8e c8eVar, int i) {
        this.f = b3Var;
        this.d = function0;
        this.g = function02;
        this.h = function03;
        this.b = function1;
        this.c = function12;
        this.i = function04;
        this.j = function05;
        this.k = function06;
        this.l = function07;
        this.e = c8eVar;
    }

    public /* synthetic */ w2(qcg qcgVar, Pair pair, Function1 function1, Function1 function12, eef eefVar, List list, agm agmVar, List list2, Function1 function13, Function0 function0, c8e c8eVar, int i) {
        this.f = qcgVar;
        this.g = pair;
        this.b = function1;
        this.c = function12;
        this.h = eefVar;
        this.i = list;
        this.j = agmVar;
        this.k = list2;
        this.l = function13;
        this.d = function0;
        this.e = c8eVar;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        Function1 function1 = this.l;
        Object obj3 = this.k;
        Object obj4 = this.j;
        Object obj5 = this.i;
        Object obj6 = this.h;
        Object obj7 = this.g;
        Object obj8 = this.f;
        switch (b) {
            case 0:
                ((Integer) obj2).getClass();
                int iM = aoh.m(1);
                jpo.a((b3) obj8, this.d, (Function0) obj7, (Function0) obj6, this.b, this.c, (Function0) obj5, (Function0) obj4, (Function0) obj3, (Function0) function1, this.e, (ih5) obj, iM);
                break;
            default:
                ((Integer) obj2).getClass();
                int iM2 = aoh.m(32769);
                p37.k((qcg) obj8, (Pair) obj7, this.b, this.c, (eef) obj6, (List) obj5, (agm) obj4, (List) obj3, function1, this.d, this.e, (ih5) obj, iM2);
                break;
        }
        return Unit.a;
    }
}
