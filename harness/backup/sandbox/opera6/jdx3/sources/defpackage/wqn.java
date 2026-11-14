package defpackage;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.recyclerview.widget.i;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class wqn extends i {
    public final q5g b;
    public final z4k c;
    public final esk d;
    public ioh e;
    public boolean f;

    public wqn(q5g q5gVar, z4k z4kVar, esk eskVar) {
        super((FrameLayout) q5gVar.b);
        this.b = q5gVar;
        this.c = z4kVar;
        this.d = eskVar;
        ImageView imageView = (ImageView) q5gVar.d;
        oon oonVar = new oon(this, (byte) 1);
        dll dllVarS = q9n.s(imageView);
        if (dllVarS == null) {
            return;
        }
        u8n.b(dllVarS, imageView, oonVar);
    }

    public final void U(Uri uri) {
        q5g q5gVar = this.b;
        ((ImageView) q5gVar.d).setScaleType(ImageView.ScaleType.CENTER_CROP);
        ImageView imageView = (ImageView) q5gVar.d;
        imageView.setBackgroundTintList(null);
        imageView.setImageTintList(null);
        yne.b.g(uri).g(imageView, new u7k(this));
    }

    public final void V(int i, int i2, int i3) {
        ImageView imageView = (ImageView) this.b.d;
        imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        imageView.setBackgroundTintList(f03.W(i, imageView.getContext()));
        imageView.setImageTintList(f03.W(i2, imageView.getContext()));
        int iH = z7h.h(imageView.getContext(), 32.0f);
        Drawable drawable = imageView.getContext().getDrawable(i3);
        imageView.setImageDrawable(drawable != null ? ic4.R(drawable, iH) : null);
    }

    public final void X(ioh iohVar) {
        if (!(iohVar instanceof tqn)) {
            if (!Intrinsics.a(iohVar, uqn.a)) {
                h9o.p();
                return;
            } else {
                if (this.f) {
                    V(2130969231, 2130969230, 2131232083);
                    return;
                }
                return;
            }
        }
        switch (((tqn) iohVar).a.ordinal()) {
            case 0:
            case 1:
                V(2130969211, 2130969210, 2131231997);
                break;
            case 2:
            case 3:
            case 4:
                V(2130969234, 2130969233, 2131232289);
                break;
            case 5:
            case h1a.INTENTS_REGULAR_FIELD_NUMBER /* 10 */:
            case 11:
            default:
                V(2130969231, 2130969230, 2131232083);
                break;
            case 6:
            case 7:
            case 12:
                V(2130969214, 2130969213, 2131232066);
                break;
            case 8:
                V(2130969228, 2130969227, 2131232178);
                break;
            case h1a.ERROR_PRIVATE_FIELD_NUMBER /* 9 */:
                break;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wqn)) {
            return false;
        }
        wqn wqnVar = (wqn) obj;
        return Intrinsics.a(this.b, wqnVar.b) && Intrinsics.a(this.c, wqnVar.c) && Intrinsics.a(this.d, wqnVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + (this.b.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "";
    }
}
