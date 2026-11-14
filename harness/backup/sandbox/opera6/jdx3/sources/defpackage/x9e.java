package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final /* synthetic */ class x9e implements Function1 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ h42 b;

    public /* synthetic */ x9e(h42 h42Var, Object obj, byte b) {
        this.a = b;
        this.b = h42Var;
    }

    public final Object invoke(Object obj) {
        eb8 eb8Var;
        eb8 eb8Var2;
        byte b = this.a;
        h42 h42Var = this.b;
        switch (b) {
            case 0:
                y7f y7fVar = (y7f) obj;
                if (y7fVar != null) {
                    xf8.E0(h42Var, y9e.b(y7fVar));
                    break;
                } else {
                    break;
                }
            default:
                oen oenVar = (oen) obj;
                pen penVar = (pen) h42Var.g();
                if (oenVar.c) {
                    if (penVar == null || (eb8Var2 = penVar.e) == null) {
                        eb8Var2 = new eb8(null);
                    }
                    eb8Var = eb8Var2;
                } else {
                    eb8Var = null;
                }
                Integer num = oenVar.a;
                CharSequence charSequence = oenVar.b;
                boolean z = num != null;
                h42Var.r(new pen(num, charSequence, z, z, eb8Var));
                break;
        }
        return Unit.a;
    }
}
