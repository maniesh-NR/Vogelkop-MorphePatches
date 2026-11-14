package defpackage;

import android.content.Context;
import android.view.View;
import com.opera.api.Callback;

/* loaded from: classes.dex */
class twj extends agc {
    public final /* synthetic */ Callback e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public twj(Context context, Callback callback) {
        super(context);
        this.e = callback;
    }

    public final void onClick(View view) {
        this.e.run(view);
    }
}
