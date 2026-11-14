package defpackage;

import android.app.ActionBar;
import android.app.Activity;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import com.opera.ad.mraid.MRAIDView;

/* loaded from: classes.dex */
public final /* synthetic */ class x4d implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ MRAIDView b;

    public /* synthetic */ x4d(MRAIDView mRAIDView, byte b) {
        this.a = b;
        this.b = mRAIDView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        MRAIDView mRAIDView = this.b;
        switch (b) {
            case 0:
                int i = MRAIDView.e0;
                Handler handler = mRAIDView.c0;
                byte b2 = mRAIDView.C;
                if (b2 != 0) {
                    byte b3 = 1;
                    if (b2 == 1 || b2 == 4) {
                        return;
                    }
                    byte b4 = 2;
                    if (b2 != 1 && b2 != 2) {
                        if (b2 == 3) {
                            mRAIDView.C = (byte) 1;
                            mRAIDView.S = true;
                            throw null;
                        }
                        return;
                    }
                    if (b2 == 2 || b2 == 3) {
                        mRAIDView.C = (byte) 1;
                    }
                    mRAIDView.S = true;
                    mRAIDView.x.removeAllViews();
                    ViewGroup viewGroup = (ViewGroup) upj.f(mRAIDView.A, mRAIDView);
                    if (viewGroup != null) {
                        viewGroup.removeView(mRAIDView.x);
                    }
                    mRAIDView.x = null;
                    mRAIDView.y = null;
                    handler.post(new x4d(mRAIDView, b3));
                    b5d b5dVar = mRAIDView.v;
                    if (b5dVar == null) {
                        b5d b5dVar2 = mRAIDView.u;
                        if (b5dVar2 != null) {
                            mRAIDView.addView(b5dVar2);
                        }
                    } else {
                        b5dVar.setWebChromeClient(null);
                        mRAIDView.v.setWebViewClient(null);
                        mRAIDView.v.destroy();
                        mRAIDView.v = null;
                        mRAIDView.u.setWebChromeClient(new a5d((byte) 0));
                        mRAIDView.u.setWebViewClient(new c5d(mRAIDView, (byte) 0));
                        mRAIDView.w = mRAIDView.u;
                    }
                    handler.post(new x4d(mRAIDView, b4));
                    return;
                }
                return;
            case 1:
                int i2 = MRAIDView.e0;
                Activity activity = mRAIDView.A;
                if (activity != null) {
                    int requestedOrientation = activity.getRequestedOrientation();
                    int i3 = mRAIDView.b0;
                    if (requestedOrientation != i3) {
                        activity.setRequestedOrientation(i3);
                    }
                }
                if (activity != null) {
                    if (!mRAIDView.U) {
                        activity.getWindow().clearFlags(1024);
                    }
                    if (mRAIDView.V) {
                        activity.getWindow().addFlags(2048);
                    }
                    if (mRAIDView.a0) {
                        ActionBar actionBar = activity.getActionBar();
                        if (actionBar != null) {
                            actionBar.show();
                            return;
                        }
                        return;
                    }
                    View view = mRAIDView.T;
                    if (view != null) {
                        view.setVisibility(mRAIDView.W);
                        return;
                    }
                    return;
                }
                return;
            default:
                int i4 = MRAIDView.e0;
                mRAIDView.I();
                return;
        }
    }
}
