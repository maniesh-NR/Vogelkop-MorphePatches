package defpackage;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public abstract class oz7 {
    public static final CountDownLatch a = new CountDownLatch(1);
    public static zyk b;

    public static final boolean a(Context context, vh9 vh9Var) {
        CountDownLatch countDownLatch = a;
        if (countDownLatch.getCount() == 0) {
            return true;
        }
        gb3 gb3Var = new gb3(context, vh9Var, (byte) 27);
        if (Intrinsics.a(Looper.myLooper(), Looper.getMainLooper())) {
            gb3Var.invoke();
            return true;
        }
        new Handler(Looper.getMainLooper()).post(new bn7((Object) gb3Var, (byte) 10));
        try {
            return countDownLatch.await(5L, TimeUnit.SECONDS);
        } catch (InterruptedException unused) {
            return false;
        }
    }
}
