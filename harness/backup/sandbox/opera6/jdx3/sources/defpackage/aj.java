package defpackage;

import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final /* synthetic */ class aj implements cr9 {
    public final /* synthetic */ ej a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ ArrayList c;
    public final /* synthetic */ Function2 d;

    public /* synthetic */ aj(ej ejVar, boolean z, ArrayList arrayList, Function2 function2) {
        this.a = ejVar;
        this.b = z;
        this.c = arrayList;
        this.d = function2;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        Boolean bool = (Boolean) obj2;
        boolean zBooleanValue = bool.booleanValue();
        Boolean bool2 = (Boolean) obj3;
        bool2.getClass();
        ej ejVar = this.a;
        ejVar.a.remove((cj) obj);
        if (!zBooleanValue && this.b) {
            ejVar.a(this.c, false, new ve5((byte) 7));
        }
        this.d.invoke(bool, bool2);
        return Unit.a;
    }
}
