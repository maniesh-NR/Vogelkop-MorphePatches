package defpackage;

import J.N;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import com.opera.android.custom_views.FadingRecyclerView;
import java.util.Objects;
import kotlin.text.StringsKt;

/* loaded from: classes.dex */
public final class qrk extends lj {
    public static final /* synthetic */ xtb[] u = {new d6h(qrk.class, "binding", "getBinding()Lcom/opera/android/databinding/WalletSunsetBackupBinding;", 0)};
    public final ktl r;
    public final ua7 s;
    public final zyk t;

    /* JADX WARN: Illegal instructions before constructor call */
    public qrk(gjm gjmVar) {
        u7k u7kVarF = u7k.f(fki.a);
        u7kVarF.s(2132022296);
        super((itl) u7kVarF.a);
        this.r = F0(new gpk((byte) 4));
        this.s = new ua7((Fragment) this, gjmVar);
        this.t = z4c.b(new yse(this, (byte) 17));
    }

    public final gjn G0() {
        xtb xtbVar = u[0];
        a5n a5nVar = this.r.b;
        Objects.requireNonNull(a5nVar);
        return (gjn) a5nVar;
    }

    @Override // defpackage.k24
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        requireContext();
        GridLayoutManager gridLayoutManager = new GridLayoutManager(2, 1);
        G0().c.C0(gridLayoutManager);
        G0().c.m(new i4a(new t79(G0().c, gridLayoutManager, fan.a(16.0f, getResources()), fan.a(8.0f, getResources()), 0, 0, 2, (byte) 0)));
        FadingRecyclerView fadingRecyclerView = G0().c;
        rrk rrkVar = (rrk) this.t.getValue();
        String str = ((ork) this.s.p()).a;
        rrkVar.getClass();
        fadingRecyclerView.y0(new ev5(this, StringsKt.Y(str, new String[]{" "}, 0, 6)));
        G0().b.setOnClickListener(new h4i((Object) this, (byte) 17));
    }

    @Override // defpackage.ltl
    public final boolean w0() {
        return !N.MphJ2uhp();
    }
}
