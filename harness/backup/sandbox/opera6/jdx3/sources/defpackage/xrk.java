package defpackage;

import android.os.Bundle;
import android.view.View;
import java.util.Objects;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lxrk;", "Llj;", "<init>", "()V", "app"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes.dex */
public final class xrk extends lj {
    public static final /* synthetic */ xtb[] t = {new d6h(xrk.class, "binding", "getBinding()Lcom/opera/android/databinding/WalletSunsetEntryBinding;", 0)};
    public final ktl r;
    public final zyk s;

    /* JADX WARN: Illegal instructions before constructor call */
    public xrk() {
        u7k u7kVarF = u7k.f(fki.a);
        u7kVarF.s(2132019773);
        super((itl) u7kVarF.a);
        this.r = F0(new gpk((byte) 5));
        this.s = z4c.b(new yse(this, (byte) 18));
    }

    @Override // defpackage.k24
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        xtb xtbVar = t[0];
        a5n a5nVar = this.r.b;
        Objects.requireNonNull(a5nVar);
        ((hjn) a5nVar).b.setOnClickListener(new h4i(this, (byte) 20));
    }
}
