package defpackage;

import java.util.Objects;
import org.chromium.base.CommandLine;

/* loaded from: classes.dex */
public final class djf implements c7d {
    public final /* synthetic */ byte a = 1;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public djf(g9k g9kVar, CommandLine commandLine, xi5 xi5Var) {
        this.b = xi5Var;
        this.c = g9kVar;
    }

    public djf(ix5 ix5Var, ll4 ll4Var, vr9 vr9Var) {
        this.b = ll4Var;
        this.c = vr9Var;
        Objects.requireNonNull(ix5Var);
    }

    @Override // defpackage.c7d
    public final void c(int i) {
        byte b = this.a;
        Object obj = this.c;
        switch (b) {
            case 0:
                ((vr9) obj).run();
                break;
            default:
                g9k g9kVar = (g9k) obj;
                g9kVar.k = true;
                g9kVar.I(i);
                break;
        }
    }

    @Override // defpackage.c7d
    public final void onSuccess() {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                ((ll4) obj).run();
                break;
            default:
                fsp.u((g9k) this.c, (xi5) obj);
                break;
        }
    }
}
