package defpackage;

import J.N;
import android.content.Context;
import com.opera.android.OperaApplication;
import com.opera.android.browser.NativeStatsTracker;
import java.util.ArrayList;
import org.chromium.content.browser.BrowserStartupControllerImpl;
import org.chromium.content.browser.TracingControllerAndroidImpl;

/* loaded from: classes.dex */
public final class qy3 {
    public final /* synthetic */ byte a;
    public final Object b;

    public /* synthetic */ qy3(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    private final void b() {
    }

    public final void a() {
        switch (this.a) {
            case 0:
                break;
            default:
                e7d.b(2, null);
                break;
        }
    }

    public final void c() {
        switch (this.a) {
            case 0:
                Context context = t8.a;
                BrowserStartupControllerImpl browserStartupControllerImpl = ((ry3) this.b).b;
                browserStartupControllerImpl.j = new TracingControllerAndroidImpl(context);
                TracingControllerAndroidImpl tracingControllerAndroidImpl = browserStartupControllerImpl.j;
                context.registerReceiver(tracingControllerAndroidImpl.b, tracingControllerAndroidImpl.c, null, null, 2);
                return;
            default:
                N.MqKMb1xK(new NativeStatsTracker(((OperaApplication) this.b).L().c));
                synchronized (e7d.a) {
                    e7d.b = 3;
                    ArrayList arrayList = e7d.c;
                    int size = arrayList.size();
                    int i = 0;
                    while (i < size) {
                        Object obj = arrayList.get(i);
                        i++;
                        ((c7d) obj).onSuccess();
                    }
                    e7d.c.clear();
                }
                return;
        }
    }
}
