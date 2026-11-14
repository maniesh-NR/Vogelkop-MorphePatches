package ads_mobile_sdk;

import defpackage.ui6;
import java.util.UUID;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class d52 extends ozb implements Function0 {
    public final /* synthetic */ s52 a;
    public final /* synthetic */ cy0 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ t00 d;
    public final /* synthetic */ z31 e;
    public final /* synthetic */ z92 f;
    public final /* synthetic */ z92 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d52(s52 s52Var, cy0 cy0Var, String str, t00 t00Var, z31 z31Var, z92 z92Var, z92 z92Var2) {
        super(0);
        this.a = s52Var;
        this.b = cy0Var;
        this.c = str;
        this.d = t00Var;
        this.e = z31Var;
        this.f = z92Var;
        this.g = z92Var2;
    }

    public final Object invoke() {
        o6 o6VarA = o6.a(this.a.j, this.b, this.c, "");
        n6 n6VarA = n6.a(this.d, this.e, this.f, this.g, true);
        if (ui6.r.a) {
            return new q6(n6VarA, o6VarA, UUID.randomUUID().toString());
        }
        qp2.n("Method called before OM SDK activation");
        return null;
    }
}
