package defpackage;

import com.opera.android.browser.WebContentsWrapper;
import org.chromium.content_public.browser.WebContents;

/* loaded from: classes.dex */
public abstract class rtn extends ptn {
    public final WebContentsWrapper b;

    public rtn(WebContentsWrapper webContentsWrapper) {
        super(webContentsWrapper.e());
        this.b = webContentsWrapper;
        webContentsWrapper.c.b(this);
    }

    public void g() {
        c((WebContents) null);
        this.b.c.c(this);
    }

    public void h() {
    }

    public void webContentsDestroyed() {
        this.b.c.c(this);
    }
}
