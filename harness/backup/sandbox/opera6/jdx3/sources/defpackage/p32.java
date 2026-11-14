package defpackage;

import com.opera.api.Callback;
import java.io.File;

/* loaded from: classes.dex */
public final class p32 implements bag {
    public final /* synthetic */ q32 a;
    public final /* synthetic */ File b;
    public final /* synthetic */ Callback c;

    public p32(q32 q32Var, File file, Callback callback) {
        this.a = q32Var;
        this.b = file;
        this.c = callback;
    }

    @Override // defpackage.bag
    public final void s() {
        this.c.run(m32.a);
    }

    @Override // defpackage.bag
    public final void t() {
        this.a.b(this.b, new n32(this.c, (byte) 1));
    }
}
