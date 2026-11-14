package defpackage;

import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.button.MaterialButton;
import com.opera.android.custom_views.StylingImageButton;
import com.opera.android.custom_views.StylingImageView;
import com.opera.android.custom_views.StylingTextView;
import com.opera.android.widget.ClickAwareCardView;
import com.opera.android.widget.RoundedImageView;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class z4n {
    public final FrameLayout a;
    public final ClickAwareCardView b;
    public final ConstraintLayout c;
    public final StylingTextView d;
    public final StylingTextView e;
    public final StylingImageView f;
    public final StylingImageButton g;
    public final RoundedImageView h;
    public final MaterialButton i;
    public final ConstraintLayout j;

    public z4n(FrameLayout frameLayout, ClickAwareCardView clickAwareCardView, ConstraintLayout constraintLayout, StylingTextView stylingTextView, StylingTextView stylingTextView2, StylingImageView stylingImageView, StylingImageButton stylingImageButton, RoundedImageView roundedImageView, MaterialButton materialButton, ConstraintLayout constraintLayout2) {
        this.a = frameLayout;
        this.b = clickAwareCardView;
        this.c = constraintLayout;
        this.d = stylingTextView;
        this.e = stylingTextView2;
        this.f = stylingImageView;
        this.g = stylingImageButton;
        this.h = roundedImageView;
        this.i = materialButton;
        this.j = constraintLayout2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z4n)) {
            return false;
        }
        z4n z4nVar = (z4n) obj;
        return Intrinsics.a(this.a, z4nVar.a) && this.b.equals(z4nVar.b) && this.c.equals(z4nVar.c) && this.d.equals(z4nVar.d) && this.e.equals(z4nVar.e) && this.f.equals(z4nVar.f) && this.g.equals(z4nVar.g) && Intrinsics.a(this.h, z4nVar.h) && Intrinsics.a(this.i, z4nVar.i) && Intrinsics.a(this.j, z4nVar.j);
    }

    public final int hashCode() {
        int iHashCode = (this.g.hashCode() + ((this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31;
        RoundedImageView roundedImageView = this.h;
        int iHashCode2 = (iHashCode + (roundedImageView == null ? 0 : roundedImageView.hashCode())) * 31;
        MaterialButton materialButton = this.i;
        int iHashCode3 = (iHashCode2 + (materialButton == null ? 0 : materialButton.hashCode())) * 31;
        ConstraintLayout constraintLayout = this.j;
        return iHashCode3 + (constraintLayout != null ? constraintLayout.hashCode() : 0);
    }

    public final String toString() {
        return "";
    }
}
