package com.opera.android.popupblocker;

import android.app.Activity;
import android.view.View;
import androidx.annotation.NonNull;
import com.opera.android.browser.chromium.ChromiumContent;
import com.opera.android.undo.UndoBar;
import defpackage.ami;
import defpackage.cz4;
import defpackage.gtj;
import java.util.Arrays;
import java.util.Objects;

/* loaded from: classes.dex */
public final class PopupBlockingHelper {
    @NonNull
    public static UndoBar createUndoBar(@NonNull View view, @NonNull ChromiumContent chromiumContent) {
        Activity activity = (Activity) view.getContext();
        Objects.requireNonNull(chromiumContent);
        UndoBar undoBar = new UndoBar(activity, new cz4(chromiumContent), new j06((byte) 24), new r16(), false);
        undoBar.f = true;
        String string = activity.getString(2132020529);
        ami amiVar = undoBar.b;
        amiVar.f = string;
        gtj gtjVar = (gtj) amiVar.c;
        if (gtjVar != null) {
            amiVar.A(gtjVar);
        }
        if (undoBar.h != 2132020527) {
            undoBar.h = 2132020527;
            undoBar.f();
        }
        return undoBar;
    }

    public static void onPopupBlocked(@NonNull View view, @NonNull UndoBar undoBar, @NonNull String str) {
        if (view.getParent() == null || view.getVisibility() != 0) {
            return;
        }
        undoBar.c(Arrays.asList(str));
    }
}
