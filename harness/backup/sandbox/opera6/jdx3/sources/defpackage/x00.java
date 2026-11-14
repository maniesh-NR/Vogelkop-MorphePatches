package defpackage;

import android.view.View;

/* loaded from: classes.dex */
class x00 extends agc {
    public static final /* synthetic */ int f = 0;
    public View.OnClickListener e;

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        View.OnClickListener onClickListener = this.e;
        if (onClickListener != null) {
            onClickListener.onClick(view);
        }
    }
}
