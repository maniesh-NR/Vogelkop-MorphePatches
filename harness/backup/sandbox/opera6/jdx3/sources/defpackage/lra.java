package defpackage;

import org.json.JSONException;

/* loaded from: classes.dex */
public final class lra extends qff {
    public final z4o a;
    public volatile orb b;
    public volatile Throwable c;

    public lra(z4o z4oVar) {
        this.a = z4oVar;
    }

    @Override // defpackage.qff
    public final void b(pzh pzhVar, byte[] bArr) {
        try {
            this.b = new orb(new String(bArr));
        } catch (OutOfMemoryError e) {
            this.c = e;
        } catch (JSONException e2) {
            this.c = e2;
        }
    }

    @Override // defpackage.qff
    public final void c(String str, boolean z) {
        this.a.Y(str, z);
    }

    @Override // defpackage.qff
    public final boolean d(pzh pzhVar, byte[] bArr) {
        return this.a.Z(pzhVar, bArr);
    }

    @Override // defpackage.qff
    public final void e(pzh pzhVar, byte[] bArr) {
        if (this.c != null) {
            this.a.Y(this.c.getMessage(), false);
            return;
        }
        if (this.b == null) {
            this.a.Y("handleData never called", true);
            return;
        }
        try {
            this.a.c0(pzhVar, this.b);
        } catch (JSONException e) {
            this.a.Y(e.getMessage(), false);
        }
    }

    @Override // defpackage.qff
    public final boolean f(pzh pzhVar, byte[] bArr) {
        return this.a.b0(pzhVar, bArr);
    }
}
