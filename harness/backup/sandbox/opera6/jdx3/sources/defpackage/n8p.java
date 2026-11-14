package defpackage;

import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

@h2j
/* loaded from: classes.dex */
public final class n8p extends p8p {

    @NotNull
    public static final m8p Companion = new m8p();
    public final u9d g;
    public final zyk h;

    public /* synthetic */ n8p() {
        this.g = null;
        this.h = z4c.b(new qqo(this, (byte) 14));
    }

    public n8p(String str, u9d u9dVar) {
        super("wvvm_" + StringsKt.T(str, "wvvm_"));
        this.g = u9dVar;
        this.h = z4c.b(new qqo(this, (byte) 14));
    }

    @Override // defpackage.p8p
    public final Object b() {
        return ((t0i) this.h.getValue()).a;
    }
}
