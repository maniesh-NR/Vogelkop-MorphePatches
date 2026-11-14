package defpackage;

import android.app.ActivityOptions;
import android.app.PictureInPictureParams;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.util.Rational;

/* loaded from: classes.dex */
public final class cvn {
    public final Bundle a(Rect rect) {
        if (Build.VERSION.SDK_INT < 33) {
            return null;
        }
        return ActivityOptions.makeLaunchIntoPip(new PictureInPictureParams.Builder().setSourceRectHint(rect).setAspectRatio(new Rational(rect.width(), rect.height())).build()).toBundle();
    }
}
