package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import com.bumptech.glide.a;
import java.security.MessageDigest;

/* loaded from: classes.dex */
public final class mx9 implements f2m {
    public final f2m b;

    public mx9(f2m f2mVar) {
        this.b = f2mVar;
    }

    @Override // defpackage.f2m
    public final kyh a(Context context, kyh kyhVar, int i, int i2) {
        kx9 kx9Var = (kx9) kyhVar.get();
        ah3 ah3Var = new ah3(a.b(context).a, ((rx9) kx9Var.a.b).l);
        f2m f2mVar = this.b;
        kyh kyhVarA = f2mVar.a(context, ah3Var, i, i2);
        if (ah3Var != kyhVarA) {
            ah3Var.d();
        }
        ((rx9) kx9Var.a.b).c(f2mVar, (Bitmap) kyhVarA.get());
        return kyhVar;
    }

    @Override // defpackage.hub
    public final void b(MessageDigest messageDigest) {
        this.b.b(messageDigest);
    }

    @Override // defpackage.hub
    public final boolean equals(Object obj) {
        if (obj instanceof mx9) {
            return this.b.equals(((mx9) obj).b);
        }
        return false;
    }

    @Override // defpackage.hub
    public final int hashCode() {
        return this.b.hashCode();
    }
}
