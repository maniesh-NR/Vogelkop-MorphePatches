package defpackage;

import android.view.ContentInfo;
import android.view.View;
import java.util.Objects;

/* loaded from: classes.dex */
public abstract class p5n {
    public static String[] a(View view) {
        return view.getReceiveContentMimeTypes();
    }

    public static sq5 b(View view, sq5 sq5Var) {
        ContentInfo contentInfoB = sq5Var.a.b();
        Objects.requireNonNull(contentInfoB);
        ContentInfo contentInfoPerformReceiveContent = view.performReceiveContent(contentInfoB);
        if (contentInfoPerformReceiveContent == null) {
            return null;
        }
        return contentInfoPerformReceiveContent == contentInfoB ? sq5Var : new sq5(new qq5(contentInfoPerformReceiveContent));
    }
}
