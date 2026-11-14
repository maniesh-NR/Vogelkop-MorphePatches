package defpackage;

import android.content.Context;
import java.util.LinkedHashMap;
import kotlin.Unit;

/* loaded from: classes.dex */
public final /* synthetic */ class kmj implements imj {
    @Override // defpackage.imj
    public final xxa a(Context context) {
        igi igiVar = new igi(context, (byte) 25);
        gn8 gn8Var = (gn8) igiVar.g;
        xm5 xm5Var = lmj.b;
        Unit unit = Unit.a;
        LinkedHashMap linkedHashMap = gn8Var.a;
        if (unit != null) {
            linkedHashMap.put(xm5Var, unit);
        } else {
            linkedHashMap.remove(xm5Var);
        }
        return igiVar.k();
    }
}
