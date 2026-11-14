package defpackage;

import android.view.View;
import com.opera.android.custom_views.StylingTextView;

/* loaded from: classes.dex */
public final class mn5 implements a5n {
    public final /* synthetic */ byte a;
    public final StylingTextView b;

    public /* synthetic */ mn5(StylingTextView stylingTextView, byte b) {
        this.a = b;
        this.b = stylingTextView;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static mn5 a(View view) {
        if (view != 0) {
            return new mn5((StylingTextView) view, (byte) 1);
        }
        t3p.q("rootView");
        return null;
    }

    @Override // defpackage.a5n
    public final View getRoot() {
        byte b = this.a;
        return this.b;
    }
}
