package defpackage;

import android.os.Build;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final /* synthetic */ class gu2 implements Function1 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ hu2 b;

    public /* synthetic */ gu2(hu2 hu2Var, byte b) {
        this.a = b;
        this.b = hu2Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        hu2 hu2Var = this.b;
        switch (b) {
            case 0:
                hu2Var.f();
                return Unit.a;
            case 1:
                hu2Var.f();
                return Unit.a;
            case 2:
                l08 l08Var = (List) obj;
                if (l08Var == null) {
                    l08Var = l08.a;
                }
                return CollectionsKt.c0(hu2Var.i, (Iterable) l08Var);
            default:
                List list = (List) obj;
                h42 h42Var = hu2Var.j;
                hu2Var.c.getClass();
                if (Build.VERSION.SDK_INT >= 30) {
                    list.size();
                }
                h42Var.r(new fu2(list, new cu2()));
                hu2Var.h = null;
                return Unit.a;
        }
    }
}
