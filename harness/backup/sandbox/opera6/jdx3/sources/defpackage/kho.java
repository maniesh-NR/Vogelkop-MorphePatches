package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;

/* loaded from: classes.dex */
public final class kho extends ImageView {
    public final /* synthetic */ kko a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kho(Context context, kko kkoVar) {
        super(context);
        this.a = kkoVar;
    }

    @Override // android.view.View
    public final void setOnClickListener(View.OnClickListener onClickListener) {
        super.setOnClickListener(onClickListener);
        this.a.b = onClickListener;
    }
}
