package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.bumptech.glide.a;
import java.security.MessageDigest;

/* loaded from: classes.dex */
public final class hl7 implements f2m {
    public final f2m b;
    public final boolean c;

    public hl7(f2m f2mVar, boolean z) {
        this.b = f2mVar;
        this.c = z;
    }

    @Override // defpackage.f2m
    public final kyh a(Context context, kyh kyhVar, int i, int i2) {
        zg3 zg3Var = a.b(context).a;
        Drawable drawable = (Drawable) kyhVar.get();
        ah3 ah3VarA = gl7.a(zg3Var, drawable, i, i2);
        if (ah3VarA == null) {
            if (!this.c) {
                return kyhVar;
            }
            j9h.v(drawable, " to a Bitmap", "Unable to convert ");
            return null;
        }
        kyh kyhVarA = this.b.a(context, ah3VarA, i, i2);
        if (!kyhVarA.equals(ah3VarA)) {
            return new ah3(context.getResources(), kyhVarA);
        }
        kyhVarA.d();
        return kyhVar;
    }

    @Override // defpackage.hub
    public final void b(MessageDigest messageDigest) {
        this.b.b(messageDigest);
    }

    @Override // defpackage.hub
    public final boolean equals(Object obj) {
        if (obj instanceof hl7) {
            return this.b.equals(((hl7) obj).b);
        }
        return false;
    }

    @Override // defpackage.hub
    public final int hashCode() {
        return this.b.hashCode();
    }
}
