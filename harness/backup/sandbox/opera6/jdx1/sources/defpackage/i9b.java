package defpackage;

import java.io.InputStream;

/* loaded from: classes.dex */
public final class i9b implements pc6 {
    public final jl6 a;

    public i9b(jl6 jl6Var) {
        this.a = jl6Var;
    }

    @Override // defpackage.pc6
    public final Class a() {
        return InputStream.class;
    }

    @Override // defpackage.pc6
    public final qc6 b(Object obj) {
        return new d06((InputStream) obj, this.a);
    }
}
