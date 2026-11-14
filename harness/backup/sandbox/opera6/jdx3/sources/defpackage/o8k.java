package defpackage;

import android.graphics.Rect;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.opera.android.BrowserActivity;
import com.opera.android.browser.OperaPageRootView;

/* loaded from: classes.dex */
public abstract class o8k {
    public final pde a;
    public final BrowserActivity b;
    public final OperaPageRootView c;
    public Parcelable d = new Rect();

    /* JADX WARN: Multi-variable type inference failed */
    public o8k(BrowserActivity browserActivity, pde pdeVar) {
        this.b = browserActivity;
        this.a = pdeVar;
        this.c = (OperaPageRootView) LayoutInflater.from(browserActivity).inflate(2131559352, (ViewGroup) null);
    }
}
