package defpackage;

import android.net.Uri;
import java.io.IOException;

/* loaded from: classes.dex */
public final class w1g implements rsc {
    public final long a = bsc.g.getAndIncrement();
    public final nd6 b;
    public final byte c;
    public final vbk d;
    public final v1g e;
    public volatile Object f;

    /* JADX WARN: Multi-variable type inference failed */
    public w1g(ed6 ed6Var, nd6 nd6Var, int i, v1g v1gVar) {
        this.d = new vbk(ed6Var);
        this.b = nd6Var;
        this.c = i;
        this.e = v1gVar;
    }

    @Override // defpackage.rsc
    public final void cancelLoad() {
    }

    @Override // defpackage.rsc
    public final void load() {
        this.d.b = 0L;
        ld6 ld6Var = new ld6(this.d, this.b);
        try {
            ld6Var.h();
            Uri uri = this.d.a.getUri();
            uri.getClass();
            this.f = this.e.e(uri, ld6Var);
            try {
                ld6Var.close();
            } catch (IOException unused) {
            }
        } finally {
            String str = tym.a;
            try {
                ld6Var.close();
            } catch (IOException unused2) {
            }
        }
    }
}
