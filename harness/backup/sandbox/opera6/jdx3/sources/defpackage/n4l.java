package defpackage;

import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.opera.android.custom_views.StylingImageButton;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class n4l {
    public final ConstraintLayout a;
    public final TextView b;
    public final TextView c;
    public final TextView d;
    public final StylingImageButton e;
    public final StylingImageButton f;
    public final StylingImageButton g;
    public final List h;

    public n4l(ConstraintLayout constraintLayout, TextView textView, TextView textView2, TextView textView3, StylingImageButton stylingImageButton, StylingImageButton stylingImageButton2, StylingImageButton stylingImageButton3, List list) {
        this.a = constraintLayout;
        this.b = textView;
        this.c = textView2;
        this.d = textView3;
        this.e = stylingImageButton;
        this.f = stylingImageButton2;
        this.g = stylingImageButton3;
        this.h = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n4l)) {
            return false;
        }
        n4l n4lVar = (n4l) obj;
        return Intrinsics.a(this.a, n4lVar.a) && this.b.equals(n4lVar.b) && Intrinsics.a(this.c, n4lVar.c) && this.d.equals(n4lVar.d) && Intrinsics.a(this.e, n4lVar.e) && Intrinsics.a(this.f, n4lVar.f) && Intrinsics.a(this.g, n4lVar.g) && Intrinsics.a(this.h, n4lVar.h);
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        TextView textView = this.c;
        int iHashCode2 = (this.d.hashCode() + ((iHashCode + (textView == null ? 0 : textView.hashCode())) * 31)) * 31;
        StylingImageButton stylingImageButton = this.e;
        int iHashCode3 = (iHashCode2 + (stylingImageButton == null ? 0 : stylingImageButton.hashCode())) * 31;
        StylingImageButton stylingImageButton2 = this.f;
        int iHashCode4 = (iHashCode3 + (stylingImageButton2 == null ? 0 : stylingImageButton2.hashCode())) * 31;
        StylingImageButton stylingImageButton3 = this.g;
        return this.h.hashCode() + ((iHashCode4 + (stylingImageButton3 != null ? stylingImageButton3.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "";
    }
}
