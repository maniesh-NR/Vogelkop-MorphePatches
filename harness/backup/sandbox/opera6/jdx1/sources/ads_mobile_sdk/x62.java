package ads_mobile_sdk;

import android.view.ViewGroup;
import defpackage.ybh;
import defpackage.z23;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class x62 extends kuk implements Function1 {
    public final /* synthetic */ f72 a;
    public final /* synthetic */ gj1 b;
    public final /* synthetic */ ViewGroup c;
    public final /* synthetic */ fs0 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x62(f72 f72Var, gj1 gj1Var, ViewGroup viewGroup, fs0 fs0Var, mt5 mt5Var) {
        super(1, mt5Var);
        this.a = f72Var;
        this.b = gj1Var;
        this.c = viewGroup;
        this.d = fs0Var;
    }

    public final mt5 create(mt5 mt5Var) {
        return new x62(this.a, this.b, this.c, this.d, mt5Var);
    }

    public final Object invoke(Object obj) {
        return create((mt5) obj).invokeSuspend(Unit.a);
    }

    public final Object invokeSuspend(Object obj) {
        px5 px5Var = px5.a;
        ybh.y(obj);
        s52 s52Var = this.a.c;
        s52Var.getClass();
        return (Unit) s52Var.f.d("AddFriendlyObstructionToJavaScriptSessionService", new z23((Object) this.b, (Object) this.c, (Object) this.d, (byte) 4));
    }
}
