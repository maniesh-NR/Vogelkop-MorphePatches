package defpackage;

import android.graphics.Rect;
import com.opera.android.browser.chromium.ChromiumContent;
import java.util.LinkedHashSet;
import org.chromium.content_public.browser.WebContents;

/* loaded from: classes.dex */
public final class tgi {
    public final float a;
    public final LinkedHashSet b = new LinkedHashSet();
    public r9b c = r9b.e;
    public final ty3 d = new ty3(this, 8);

    public tgi(float f) {
        this.a = f;
    }

    public final void a(ChromiumContent chromiumContent) {
        WebContents webContentsF = chromiumContent.f();
        if (webContentsF == null || webContentsF.isDestroyed()) {
            return;
        }
        float f = this.c.a;
        float f2 = this.a;
        webContentsF.Q(new Rect((int) Math.ceil(f / f2), (int) Math.ceil(r0.b / f2), (int) Math.ceil(r0.c / f2), (int) Math.ceil(r0.d / f2)));
    }
}
