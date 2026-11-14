package defpackage;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import java.io.IOException;

/* loaded from: classes.dex */
public final class nya implements acl {
    public final mya a;
    public boolean b;
    public boolean c;

    public nya(mya myaVar) {
        this.a = myaVar;
    }

    public final void a(Exception exc, Drawable drawable) {
        this.c = true;
        oya.a.remove(this);
        boolean z = exc instanceof ooe;
        mya myaVar = this.a;
        if (z) {
            if (((ooe) exc).a >= 500) {
                myaVar.u(2);
                return;
            } else {
                myaVar.u(1);
                return;
            }
        }
        if (exc instanceof IOException) {
            myaVar.u(2);
        } else {
            myaVar.u(1);
        }
    }

    public final void b(Drawable drawable) {
    }

    public final void c(Bitmap bitmap, int i) {
        this.c = true;
        oya.a.remove(this);
        this.a.m(bitmap, !this.b);
    }

    public final boolean equals(Object obj) {
        return obj == this;
    }

    public final int hashCode() {
        return System.identityHashCode(this);
    }
}
