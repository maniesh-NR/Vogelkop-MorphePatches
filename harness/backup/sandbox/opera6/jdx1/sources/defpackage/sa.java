package defpackage;

import android.widget.FrameLayout;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final /* synthetic */ class sa implements Function2 {
    public final /* synthetic */ byte a = 1;
    public final /* synthetic */ Function1 b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ br9 i;
    public final /* synthetic */ Object j;
    public final /* synthetic */ Object k;

    public /* synthetic */ sa(Integer num, Function0 function0, Integer num2, Function0 function02, String str, Function1 function1, Function0 function03, Function0 function04, boolean z, Function0 function05) {
        this.d = num;
        this.e = function0;
        this.f = num2;
        this.g = function02;
        this.h = str;
        this.b = function1;
        this.i = function03;
        this.j = function04;
        this.c = z;
        this.k = function05;
    }

    public /* synthetic */ sa(myn mynVar, FrameLayout.LayoutParams layoutParams, boolean z, ayn aynVar, kxn kxnVar, Function1 function1, Function1 function12, na naVar, ma maVar, Function1 function13, int i) {
        this.d = mynVar;
        this.e = layoutParams;
        this.c = z;
        this.f = aynVar;
        this.g = kxnVar;
        this.b = function1;
        this.h = function12;
        this.j = naVar;
        this.k = maVar;
        this.i = function13;
    }

    public /* synthetic */ sa(boolean z, Pair pair, List list, eef eefVar, Function1 function1, Function1 function12, agm agmVar, List list2, Function1 function13, Function0 function0, int i) {
        this.c = z;
        this.d = pair;
        this.e = list;
        this.f = eefVar;
        this.b = function1;
        this.h = function12;
        this.g = agmVar;
        this.j = list2;
        this.i = function13;
        this.k = function0;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        Object obj3 = this.k;
        Function1 function1 = this.i;
        Object obj4 = this.j;
        Object obj5 = this.g;
        Object obj6 = this.h;
        Object obj7 = this.f;
        Object obj8 = this.e;
        Object obj9 = this.d;
        switch (b) {
            case 0:
                ((Integer) obj2).getClass();
                t8.b((myn) obj9, (FrameLayout.LayoutParams) obj8, this.c, (ayn) obj7, (kxn) obj5, this.b, (Function1) obj6, (na) obj4, (ma) obj3, function1, (ih5) obj, aoh.m(385));
                break;
            case 1:
                Integer num = (Integer) obj9;
                Function0 function0 = (Function0) obj8;
                Integer num2 = (Integer) obj7;
                Function0 function02 = (Function0) obj5;
                String str = (String) obj6;
                Function0 function03 = (Function0) function1;
                Function0 function04 = (Function0) obj4;
                Function0 function05 = (Function0) obj3;
                ih5 ih5Var = (ih5) obj;
                int iIntValue = ((Integer) obj2).intValue();
                vt9 vt9Var = (vt9) ih5Var;
                if (vt9Var.N(iIntValue & 1, (iIntValue & 3) != 2)) {
                    so1.a(gyg.P(51249972, new sy5(num, function0, num2, function02, str, this.b), vt9Var), null, gyg.P(-746175562, new is1(function03, (byte) 9), vt9Var), gyg.P(-1832482401, new a9k((byte) 3, function04, function05, this.c), vt9Var), 0.0f, null, null, vt9Var, 3462);
                } else {
                    vt9Var.Q();
                }
                break;
            default:
                ((Integer) obj2).getClass();
                p37.i(this.c, (Pair) obj9, (List) obj8, (eef) obj7, this.b, (Function1) obj6, (agm) obj5, (List) obj4, function1, (Function0) obj3, (ih5) obj, aoh.m(4097));
                break;
        }
        return Unit.a;
    }
}
