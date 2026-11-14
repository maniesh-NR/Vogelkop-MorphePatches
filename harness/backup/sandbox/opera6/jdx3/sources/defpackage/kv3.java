package defpackage;

import android.view.View;
import android.view.ViewTreeObserver;
import com.opera.android.BrowserActivity;

/* loaded from: classes.dex */
public final class kv3 implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ View a;
    public final /* synthetic */ BrowserActivity b;

    public kv3(View view, BrowserActivity browserActivity) {
        this.a = view;
        this.b = browserActivity;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        this.a.getViewTreeObserver().removeOnPreDrawListener(this);
        BrowserActivity browserActivity = this.b;
        browserActivity.x.d(new qt3(browserActivity, (byte) 19)).a(null);
        return true;
    }
}
