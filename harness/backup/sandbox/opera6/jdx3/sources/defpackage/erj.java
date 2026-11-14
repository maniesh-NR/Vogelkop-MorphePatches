package defpackage;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.opera.android.IntentDispatcherActivity;

/* loaded from: classes.dex */
public final class erj extends frj {
    @Override // defpackage.frj
    public final Intent d(Context context, Uri uri) {
        Intent intentD = super.d(context, uri);
        intentD.setClass(context, IntentDispatcherActivity.class);
        return intentD;
    }
}
