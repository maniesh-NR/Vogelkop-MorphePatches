package defpackage;

import android.graphics.Bitmap;

/* loaded from: classes.dex */
public final class jpj implements sng {
    public final v3d a;
    public int b;
    public Bitmap.Config c;

    public jpj(v3d v3dVar) {
        this.a = v3dVar;
    }

    @Override // defpackage.sng
    public final void a() {
        this.a.w0(this);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof jpj) {
            jpj jpjVar = (jpj) obj;
            if (this.b == jpjVar.b && rm5.h(this.c, jpjVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.b * 31;
        Bitmap.Config config = this.c;
        return i + (config != null ? config.hashCode() : 0);
    }

    public final String toString() {
        return kpj.c(this.b, this.c);
    }
}
