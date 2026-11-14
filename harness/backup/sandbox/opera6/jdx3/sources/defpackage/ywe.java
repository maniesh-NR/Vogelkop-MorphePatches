package defpackage;

import android.content.Context;
import androidx.fragment.app.Fragment;
import com.opera.android.utilities.DisplayUtil;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class ywe implements lkf {
    public final Context a;
    public final nw3 b;
    public final nw3 c;
    public final nw3 d;
    public final gx3 e;
    public final nw3 f;
    public final fx3 g;

    public ywe(Context context, nw3 nw3Var, nw3 nw3Var2, nw3 nw3Var3, gx3 gx3Var, nw3 nw3Var4, fx3 fx3Var) {
        this.a = context;
        this.b = nw3Var;
        this.c = nw3Var2;
        this.d = nw3Var3;
        this.e = gx3Var;
        this.f = nw3Var4;
        this.g = fx3Var;
    }

    public final Fragment b(Class cls) {
        boolean zA = Intrinsics.a(cls, xwe.class);
        fx3 fx3Var = this.g;
        if (zA) {
            return new xwe(DisplayUtil.a(this.a), (gjm) fx3Var.get());
        }
        if (Intrinsics.a(cls, kxe.class)) {
            return new kxe(this.b.b.J(), this.c.b.B(), this.d.b.p(), (z77) this.e.get(), (orm) this.f.get(), (gjm) fx3Var.get());
        }
        return null;
    }
}
