package defpackage;

import android.app.Notification;
import android.app.PendingIntent;
import android.graphics.PorterDuff;
import android.graphics.drawable.Icon;
import androidx.core.graphics.drawable.IconCompat;

/* loaded from: classes.dex */
public abstract class h1f {
    public static k1f a(Notification.BubbleMetadata bubbleMetadata) {
        if (bubbleMetadata == null || bubbleMetadata.getIntent() == null) {
            return null;
        }
        PendingIntent intent = bubbleMetadata.getIntent();
        Icon icon = bubbleMetadata.getIcon();
        PorterDuff.Mode mode = IconCompat.k;
        fr3.A(icon);
        if (intent == null) {
            t3p.q("Bubble requires non-null pending intent");
            return null;
        }
        bubbleMetadata.getAutoExpandBubble();
        bubbleMetadata.getDeleteIntent();
        bubbleMetadata.isNotificationSuppressed();
        if (bubbleMetadata.getDesiredHeight() != 0) {
            bubbleMetadata.getDesiredHeight();
        }
        if (bubbleMetadata.getDesiredHeightResId() != 0) {
            bubbleMetadata.getDesiredHeightResId();
        }
        return new k1f();
    }
}
