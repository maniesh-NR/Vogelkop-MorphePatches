package com.opera.android.media;

import J.N;
import android.app.Activity;
import android.app.PendingIntent;
import android.app.PictureInPictureParams;
import android.app.RemoteAction;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.drawable.Icon;
import android.os.Bundle;
import android.util.Rational;
import android.util.Size;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import com.opera.android.OperaApplication;
import com.opera.android.browser.chromium.ChromiumContent;
import defpackage.cvn;
import defpackage.dvn;
import defpackage.evn;
import defpackage.eyi;
import defpackage.hjf;
import defpackage.ty3;
import java.util.ArrayList;
import java.util.HashSet;
import org.chromium.base.ApplicationStatus;
import org.chromium.components.thinwebview.internal.CompositorViewImpl;
import org.chromium.content.browser.MediaSessionImpl;
import org.chromium.content_public.browser.WebContents;
import org.chromium.ui.base.WindowAndroid;
import org.chromium.url.GURL;

/* loaded from: classes.dex */
public class WebPictureInPictureActivity extends hjf {
    public static long v;
    public static final cvn w = new cvn();
    public long j;
    public ChromiumContent k;
    public ty3 l;
    public qi m;
    public final zg n = new zg(new dvn(this));
    public CompositorViewImpl o;
    public Rational p;
    public int q;
    public up1 r;
    public MediaSessionImpl s;
    public evn t;
    public cyd u;

    public static void createActivity(long j, @NonNull Object obj, int i, int i2, int i3, int i4) {
        long j2 = v;
        if (j2 != 0) {
            N.MvOQobqj(j2);
        }
        v = j;
        ChromiumContent chromiumContent = (ChromiumContent) obj;
        qi qiVar = chromiumContent.b;
        Bundle bundleA = null;
        Context context = qiVar != null ? (Context) qiVar.m().get() : null;
        Context context2 = context != null ? context : t8.a;
        Intent intent = new Intent(context2, (Class<?>) WebPictureInPictureActivity.class);
        intent.putExtra("com.opera.android.media.PictureInPicture.WebContents", chromiumContent.e());
        intent.putExtra("com.opera.android.media.WebPictureInPictureActivity.NativePointer", j);
        if (i4 != 0) {
            float f = i4;
            i3 = (int) (a26.v(i3 / f, 0.41841003f, 2.39f) * f);
        }
        if (i3 > 0 && i4 > 0) {
            Rect rect = new Rect(i, i2, i + i3, i2 + i4);
            if (context != null && rect.left >= 0 && rect.top >= 0) {
                bundleA = w.a(rect);
            }
            if (bundleA != null) {
                intent.putExtra("com.opera.android.media.PictureInPicture.launched", true);
            }
            intent.putExtra("com.opera.android.media.WebPictureInPictureActivity.source.width", i3);
            intent.putExtra("com.opera.android.media.WebPictureInPictureActivity.source.height", i4);
        }
        context2.startActivity(intent, bundleA);
    }

    /* JADX WARN: Type inference failed for: r5v2, types: [android.app.Activity, com.opera.android.media.WebPictureInPictureActivity] */
    public static void onWindowDestroyed(long j) {
        if (j == v) {
            v = 0L;
        }
        ArrayList arrayListA = ApplicationStatus.a();
        int size = arrayListA.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayListA.get(i);
            i++;
            Object obj2 = (Activity) obj;
            if (obj2 instanceof WebPictureInPictureActivity) {
                ?? r5 = (WebPictureInPictureActivity) obj2;
                if (j == r5.j) {
                    r5.j = 0L;
                    r5.finish();
                }
            }
        }
    }

    public final PictureInPictureParams F() {
        PictureInPictureParams.Builder builder = new PictureInPictureParams.Builder();
        cyd cydVar = this.u;
        fp1 fp1Var = (WebPictureInPictureActivity) cydVar.l;
        RemoteAction remoteAction = (RemoteAction) cydVar.g;
        RemoteAction remoteAction2 = (RemoteAction) cydVar.c;
        ArrayList arrayList = new ArrayList();
        boolean z = ((HashSet) cydVar.k).contains(2) || ((HashSet) cydVar.k).contains(3);
        if (z) {
            remoteAction2.setEnabled(((HashSet) cydVar.k).contains(2));
            arrayList.add(remoteAction2);
        }
        if (((HashSet) cydVar.k).contains(0)) {
            int i = cydVar.b;
            if (i == 0) {
                arrayList.add((RemoteAction) cydVar.e);
            } else if (i == 1) {
                arrayList.add((RemoteAction) cydVar.d);
            } else if (i == 2) {
                arrayList.add((RemoteAction) cydVar.f);
            }
        }
        if (z) {
            remoteAction.setEnabled(((HashSet) cydVar.k).contains(3));
            arrayList.add(remoteAction);
        }
        if (((HashSet) cydVar.k).contains(13)) {
            eyi eyiVar = (eyi) cydVar.i;
            arrayList.add((RemoteAction) (eyiVar.b ? eyiVar.c : eyiVar.d));
        }
        if (((HashSet) cydVar.k).contains(14)) {
            eyi eyiVar2 = (eyi) cydVar.j;
            arrayList.add((RemoteAction) (eyiVar2.b ? eyiVar2.c : eyiVar2.d));
        }
        if (((HashSet) cydVar.k).contains(15)) {
            arrayList.add((RemoteAction) cydVar.h);
        }
        if (arrayList.isEmpty()) {
            RemoteAction remoteAction3 = new RemoteAction(Icon.createWithBitmap(Bitmap.createBitmap(new int[]{0}, 1, 1, Bitmap.Config.ARGB_8888)), "", "", PendingIntent.getBroadcast(fp1Var.getApplicationContext(), -1, new Intent("com.opera.android.media.WebPictureInPictureActivity.MediaAction").setPackage(fp1Var.getPackageName()), 67108864));
            remoteAction3.setEnabled(false);
            arrayList.add(remoteAction3);
        }
        builder.setActions(arrayList);
        builder.setAspectRatio(this.p);
        return builder.build();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void close() {
        finish();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.hjf
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.m = new qi(this, this.n, false);
        String[] strArr = OperaApplication.K;
        this.t = (evn) ((OperaApplication) getApplication()).r.q1.get();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.hjf
    public final void onDestroy() {
        qi qiVar = this.m;
        if (qiVar != null) {
            qiVar.destroy();
            this.m = null;
        }
        super.onDestroy();
        up1 up1Var = this.r;
        if (up1Var != null) {
            unregisterReceiver(up1Var);
            this.r = null;
        }
        MediaSessionImpl mediaSessionImpl = this.s;
        if (mediaSessionImpl != null) {
            this.t.l(this.s, false, k1g.I(mediaSessionImpl));
            this.s = null;
        }
        this.t = null;
        ChromiumContent chromiumContent = this.k;
        if (chromiumContent != null) {
            chromiumContent.y(this.l);
            this.k = null;
        }
        this.l = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onPictureInPictureModeChanged(boolean z, Configuration configuration) {
        super/*xd5*/.onPictureInPictureModeChanged(z, configuration);
        MediaSessionImpl mediaSessionImpl = this.s;
        if (mediaSessionImpl != null) {
            this.t.l(this.s, z, k1g.I(mediaSessionImpl));
        }
        if (z) {
            return;
        }
        N.MUcD_MgJ(this.j);
        finish();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onStart() {
        WindowAndroid windowAndroidK0;
        super.onStart();
        Intent intent = getIntent();
        this.j = intent.getLongExtra("com.opera.android.media.WebPictureInPictureActivity.NativePointer", 0L);
        intent.setExtrasClassLoader(WebContents.class.getClassLoader());
        WebContents webContents = (WebContents) intent.getParcelableExtra("com.opera.android.media.PictureInPicture.WebContents");
        GURL gurl = ChromiumContent.V;
        ChromiumContent chromiumContent = (ChromiumContent) N.Mo8CJari(webContents);
        this.k = chromiumContent;
        if (this.j == v) {
            WebContents webContentsE = chromiumContent != null ? chromiumContent.e() : null;
            if (webContentsE != null && !webContentsE.isDestroyed() && (windowAndroidK0 = webContentsE.k0()) != null && windowAndroidK0.m().get() != null) {
                v = 0L;
                ty3 ty3Var = new ty3(this, (byte) 9);
                this.l = ty3Var;
                this.k.k(ty3Var);
                this.s = (MediaSessionImpl) N.Mtun$qW8(this.k.e());
                up1 up1Var = new up1(this, (byte) 24);
                this.r = up1Var;
                registerReceiver(up1Var, new IntentFilter("com.opera.android.media.WebPictureInPictureActivity.MediaAction"), null, null, 4);
                this.u = new cyd(this);
                N.M0CCxfVu(this.j, this, this.m);
                qi qiVar = this.m;
                this.q = (int) (((WindowAndroid) qiVar).d.f * 0.95d);
                CompositorViewImpl compositorViewImpl = new CompositorViewImpl(this, qiVar, new vll());
                this.o = compositorViewImpl;
                addContentView(compositorViewImpl.b, new ViewGroup.LayoutParams(-1, -1));
                this.o.b.addOnLayoutChangeListener(new ho3(this, (byte) 11));
                N.M_Dn99D1(this.j, this.o);
                Size size = new Size(intent.getIntExtra("com.opera.android.media.WebPictureInPictureActivity.source.width", 0), intent.getIntExtra("com.opera.android.media.WebPictureInPictureActivity.source.height", 0));
                if (size.getWidth() > 0 && size.getHeight() > 0) {
                    int width = size.getWidth();
                    int height = size.getHeight();
                    if (height != 0) {
                        float f = height;
                        width = (int) (a26.v(width / f, 0.41841003f, 2.39f) * f);
                    }
                    this.p = new Rational(width, height);
                }
                if (getIntent().hasExtra("com.opera.android.media.PictureInPicture.launched")) {
                    return;
                }
                enterPictureInPictureMode(F());
                return;
            }
        }
        finish();
    }

    public final void onStop() {
        super.onStop();
        CompositorViewImpl compositorViewImpl = this.o;
        if (compositorViewImpl != null) {
            RuntimeException runtimeException = compositorViewImpl.c.e;
            if (runtimeException != null) {
                h9o.m("WindowAndroid destroyed before CompositorViewImpl", runtimeException);
                return;
            }
            long j = compositorViewImpl.d;
            if (j != 0) {
                N.M_L66GG1(j);
                compositorViewImpl.d = 0L;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void setCameraState(boolean z) {
        ((eyi) this.u.j).b = z;
        try {
            setPictureInPictureParams(F());
        } catch (IllegalStateException unused) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void setMicrophoneMuted(boolean z) {
        ((eyi) this.u.i).b = !z;
        try {
            setPictureInPictureParams(F());
        } catch (IllegalStateException unused) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void setPlaybackState(int i) {
        this.u.b = i;
        try {
            setPictureInPictureParams(F());
        } catch (IllegalStateException unused) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void updateVideoSize(int i, int i2) {
        if (i2 != 0) {
            float f = i2;
            i = (int) (a26.v(i / f, 0.41841003f, 2.39f) * f);
        }
        this.p = new Rational(i, i2);
        try {
            setPictureInPictureParams(F());
        } catch (IllegalStateException unused) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void updateVisibleActions(@NonNull int[] iArr) {
        HashSet hashSet = new HashSet();
        for (int i : iArr) {
            hashSet.add(Integer.valueOf(i));
        }
        this.u.k = hashSet;
        try {
            setPictureInPictureParams(F());
        } catch (IllegalStateException unused) {
        }
    }
}
