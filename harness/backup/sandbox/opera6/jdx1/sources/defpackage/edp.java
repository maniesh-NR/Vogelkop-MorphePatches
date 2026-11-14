package defpackage;

import android.app.Activity;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import com.google.common.util.concurrent.ListenableFuture;

/* loaded from: classes.dex */
public interface edp {
    ListenableFuture a();

    ListenableFuture a(Context context);

    ListenableFuture a(Context context, String str, View view, Activity activity);

    void a(MotionEvent motionEvent);

    ListenableFuture b(Context context, String str, View view, Activity activity);

    String b();
}
