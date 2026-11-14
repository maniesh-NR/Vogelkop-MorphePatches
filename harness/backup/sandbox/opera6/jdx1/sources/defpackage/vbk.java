package defpackage;

import android.net.Uri;
import java.util.Collections;
import java.util.Map;

/* loaded from: classes.dex */
public final class vbk implements ed6 {
    public final ed6 a;
    public long b;
    public Uri c;
    public Map d;

    public vbk(ed6 ed6Var) {
        ed6Var.getClass();
        this.a = ed6Var;
        this.c = Uri.EMPTY;
        this.d = Collections.EMPTY_MAP;
    }

    @Override // defpackage.ed6
    public final long b(nd6 nd6Var) {
        ed6 ed6Var = this.a;
        this.c = nd6Var.a;
        this.d = Collections.EMPTY_MAP;
        try {
            return ed6Var.b(nd6Var);
        } finally {
            Uri uri = ed6Var.getUri();
            if (uri != null) {
                this.c = uri;
            }
            this.d = ed6Var.getResponseHeaders();
        }
    }

    @Override // defpackage.ed6
    public final void c(pl6 pl6Var) {
        pl6Var.getClass();
        this.a.c(pl6Var);
    }

    @Override // defpackage.ed6
    public final void close() {
        this.a.close();
    }

    @Override // defpackage.ed6
    public final Map getResponseHeaders() {
        return this.a.getResponseHeaders();
    }

    @Override // defpackage.ed6
    public final Uri getUri() {
        return this.a.getUri();
    }

    @Override // defpackage.oc6
    public final int read(byte[] bArr, int i, int i2) {
        int i3 = this.a.read(bArr, i, i2);
        if (i3 != -1) {
            this.b += i3;
        }
        return i3;
    }
}
