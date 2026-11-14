package ads_mobile_sdk;

import defpackage.ui6;
import java.util.UUID;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class g52 extends ozb implements Function0 {
    public final /* synthetic */ String a;
    public final /* synthetic */ s52 b;
    public final /* synthetic */ cy0 c;
    public final /* synthetic */ String d;
    public final /* synthetic */ t00 e;
    public final /* synthetic */ z31 f;
    public final /* synthetic */ z92 g;
    public final /* synthetic */ z92 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g52(String str, s52 s52Var, cy0 cy0Var, String str2, t00 t00Var, z31 z31Var, z92 z92Var, z92 z92Var2) {
        super(0);
        this.a = str;
        this.b = s52Var;
        this.c = cy0Var;
        this.d = str2;
        this.e = t00Var;
        this.f = z31Var;
        this.g = z92Var;
        this.h = z92Var2;
    }

    public final Object invoke() {
        o6 o6VarB = o6.b(ji.a(this.a, this.b.h), this.c, this.d, "");
        n6 n6VarA = n6.a(this.e, this.f, this.g, this.h, true);
        if (ui6.r.a) {
            return new q6(n6VarA, o6VarB, UUID.randomUUID().toString());
        }
        qp2.n("Method called before OM SDK activation");
        return null;
    }
}
