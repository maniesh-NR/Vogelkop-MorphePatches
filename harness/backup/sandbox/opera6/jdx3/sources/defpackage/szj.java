package defpackage;

import android.os.Bundle;
import android.view.View;
import com.opera.android.settings.speed_dial.SpeedDialShapePreview;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lszj;", "Li93;", "<init>", "()V", "app"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes.dex */
public final class szj extends i93 {
    public static final /* synthetic */ xtb[] w = {new d6h(szj.class, "binding", "getBinding()Lcom/opera/android/databinding/FragmentSpeedDialSettingsBinding;", 0)};
    public final ktl t;
    public final zyk u;
    public final zyk v;

    public szj() {
        super(2132021619, 0, 14);
        this.t = F0(new a3j((byte) 9));
        this.u = z4c.b(new yse(this, (byte) 15));
        this.v = z4c.b(new dnj(this, (byte) 3));
    }

    @Override // defpackage.i93
    public final h93 G0() {
        return I0();
    }

    public final rm9 H0() {
        xtb xtbVar = w[0];
        a5n a5nVar = this.t.b;
        Objects.requireNonNull(a5nVar);
        return (rm9) a5nVar;
    }

    public final wzj I0() {
        return (wzj) this.u.getValue();
    }

    @Override // defpackage.i93, defpackage.k24
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        lld lldVar = new lld((Object) this, (byte) 29);
        Iterator it = ((List) this.v.getValue()).iterator();
        while (it.hasNext()) {
            ((SpeedDialShapePreview) it.next()).q = lldVar;
        }
        byte b = 23;
        H0().b.u = new yhe(I0(), b);
        H0().c.u = new qie(I0(), b);
        H0().d.u = new i4d((Object) I0(), (byte) 28);
        xf8.i0((ekc) ((zyk) I0().e.c).getValue(), getViewLifecycleOwner(), H0().a, (List) null, new w4i(this, (byte) 9));
    }
}
