package defpackage;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.opera.android.custom_views.StylingImageCheckableWithText;

/* loaded from: classes.dex */
public final /* synthetic */ class ojk implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ StylingImageCheckableWithText b;

    public /* synthetic */ ojk(StylingImageCheckableWithText stylingImageCheckableWithText, byte b) {
        this.a = b;
        this.b = stylingImageCheckableWithText;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        ConstraintLayout constraintLayout = this.b;
        switch (b) {
            case 0:
                int[] iArr = StylingImageCheckableWithText.x;
                constraintLayout.refreshDrawableState();
                break;
            default:
                int[] iArr2 = StylingImageCheckableWithText.x;
                constraintLayout.refreshDrawableState();
                break;
        }
    }
}
