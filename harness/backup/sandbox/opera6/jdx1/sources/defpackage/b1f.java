package defpackage;

import android.app.Notification;

/* loaded from: classes.dex */
public abstract class b1f {
    public static int a(Notification.Action action) {
        return action.getEmphasisHint();
    }

    public static int b(Notification.Action action) {
        return action.getStyleHint();
    }
}
