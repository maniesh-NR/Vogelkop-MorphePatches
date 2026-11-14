package defpackage;

import java.util.function.Consumer;

/* loaded from: classes.dex */
public final /* synthetic */ class ux3 implements Consumer {
    public final /* synthetic */ vx3 a;
    public final /* synthetic */ boolean b;

    public /* synthetic */ ux3(vx3 vx3Var, boolean z) {
        this.a = vx3Var;
        this.b = z;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        this.a.p.add(new yx3((String) obj, this.b));
    }
}
