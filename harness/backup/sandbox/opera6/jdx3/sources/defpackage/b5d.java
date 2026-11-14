package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import android.view.KeyEvent;
import android.view.View;
import android.webkit.WebView;
import com.opera.ad.mraid.MRAIDView;

/* loaded from: classes.dex */
public final class b5d extends WebView {
    public boolean a;
    public boolean b;
    public final /* synthetic */ MRAIDView c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b5d(MRAIDView mRAIDView, Context context) {
        super(context);
        this.c = mRAIDView;
    }

    @Override // android.webkit.WebView
    public final void destroy() {
        super.destroy();
        this.b = true;
    }

    @Override // android.webkit.WebView, android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        int i = configuration.orientation;
    }

    @Override // android.webkit.WebView, android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        MRAIDView mRAIDView;
        byte b;
        if (i != 4 || ((b = (mRAIDView = this.c).C) != 2 && b != 3)) {
            return super.onKeyDown(i, keyEvent);
        }
        mRAIDView.close();
        return true;
    }

    @Override // android.widget.AbsoluteLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        int i5 = MRAIDView.e0;
        MRAIDView mRAIDView = this.c;
        boolean z2 = this == mRAIDView.w;
        byte b = mRAIDView.C;
        if (z2) {
            if (mRAIDView.P) {
                mRAIDView.P = false;
                return;
            }
            if (b == 0 || b == 1) {
                mRAIDView.H();
                mRAIDView.G();
            }
            if (!mRAIDView.S) {
                mRAIDView.C(true);
            }
            if (mRAIDView.Q) {
                mRAIDView.Q = false;
                if (mRAIDView.R) {
                    return;
                }
                mRAIDView.I();
            }
        }
    }

    @Override // android.webkit.WebView, android.view.View
    public final void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        int i2 = MRAIDView.e0;
    }

    @Override // android.webkit.WebView, android.view.View
    public final void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        getVisibility();
        int i2 = MRAIDView.e0;
        if (i != 0) {
            if (this.c.C != 2) {
                toString();
                onPause();
                this.a = true;
                return;
            }
            return;
        }
        if (this.a) {
            toString();
            onResume();
            this.a = false;
        }
    }
}
