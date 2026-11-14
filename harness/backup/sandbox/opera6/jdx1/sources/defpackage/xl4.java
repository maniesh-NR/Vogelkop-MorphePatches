package defpackage;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final /* synthetic */ class xl4 implements Function2 {
    public final /* synthetic */ byte a = 0;
    public final /* synthetic */ String b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;

    public /* synthetic */ xl4(String str, l01 l01Var, String str2, String str3, String str4, Function0 function0, c8e c8eVar, int i) {
        this.b = str;
        this.g = l01Var;
        this.d = str2;
        this.e = str3;
        this.f = str4;
        this.h = function0;
        this.i = c8eVar;
        this.c = i;
    }

    public /* synthetic */ xl4(Function1 function1, Function1 function12, String str, List list, agm agmVar, fsf fsfVar, fef fefVar, int i) {
        this.d = function1;
        this.e = function12;
        this.b = str;
        this.f = list;
        this.g = agmVar;
        this.h = fsfVar;
        this.i = fefVar;
        this.c = i;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        int i = this.c;
        Object obj3 = this.i;
        Object obj4 = this.h;
        Object obj5 = this.g;
        Object obj6 = this.f;
        Object obj7 = this.e;
        Object obj8 = this.d;
        switch (b) {
            case 0:
                ((Integer) obj2).getClass();
                int iM = aoh.m(i | 1);
                z4o.i(this.b, (l01) obj5, (String) obj8, (String) obj7, (String) obj6, (Function0) obj4, (c8e) obj3, (ih5) obj, iM);
                break;
            default:
                ((Integer) obj2).getClass();
                int iM2 = aoh.m(i | 1);
                fr3.c((Function1) obj8, (Function1) obj7, this.b, (List) obj6, (agm) obj5, (fsf) obj4, (fef) obj3, (ih5) obj, iM2);
                break;
        }
        return Unit.a;
    }
}
