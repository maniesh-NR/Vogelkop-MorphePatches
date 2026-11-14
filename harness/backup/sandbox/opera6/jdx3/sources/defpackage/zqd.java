package defpackage;

import J.N;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.os.SystemClock;
import com.opera.android.browser.chromium.ChromiumContent;
import com.opera.android.favorites.SpeedDialDataFetcher;
import com.opera.android.webapps.WebappActivity;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.chromium.base.FileUtils;
import org.chromium.content_public.browser.ImageDownloadCallback;
import org.chromium.content_public.browser.MediaSession;
import org.chromium.content_public.browser.WebContents;
import org.chromium.services.media_session.MediaImage;
import org.chromium.services.media_session.MediaMetadata;
import org.chromium.url.GURL;

/* loaded from: classes.dex */
public final class zqd {
    public MediaSession a;
    public final /* synthetic */ MediaSession b;
    public final /* synthetic */ ard c;

    public zqd(ard ardVar, MediaSession mediaSession, MediaSession mediaSession2) {
        this.b = mediaSession2;
        this.c = ardVar;
        this.a = mediaSession;
        mediaSession.a(this);
    }

    public final void a(List list) {
        MediaImage mediaImage;
        double d;
        ard ardVar = this.c;
        ImageDownloadCallback imageDownloadCallback = ardVar.p;
        if (((WebContents) ((ac1) imageDownloadCallback).c) != null) {
            ((ac1) imageDownloadCallback).d = ardVar;
            if (list == null) {
                mediaImage = null;
            } else {
                Iterator it = list.iterator();
                mediaImage = null;
                double d2 = 0.0d;
                while (it.hasNext()) {
                    MediaImage mediaImage2 = (MediaImage) it.next();
                    if (mediaImage2 == null) {
                        d = 0.0d;
                    } else {
                        List list2 = mediaImage2.c;
                        d = 0.4d;
                        if (!list2.isEmpty()) {
                            Iterator it2 = list2.iterator();
                            double dMax = 0.0d;
                            while (it2.hasNext()) {
                                dMax = Math.max(dMax, imageDownloadCallback.f((Rect) it2.next()));
                            }
                            GURL gurl = mediaImage2.a;
                            String str = mediaImage2.b;
                            String strA = FileUtils.a(gurl.g());
                            if ("bmp".equals(strA) || "image/bmp".equals(str)) {
                                d = 0.5d;
                            } else if ("gif".equals(strA) || "image/gif".equals(str)) {
                                d = 0.3d;
                            } else if (!"icon".equals(strA) && !"image/x-icon".equals(str)) {
                                d = ("png".equals(strA) || "image/png".equals(str)) ? 1.0d : ("jpeg".equals(strA) || "jpg".equals(strA) || "image/jpeg".equals(str)) ? 0.7d : 0.6d;
                            }
                            d *= dMax;
                        }
                    }
                    if (d > d2) {
                        mediaImage = mediaImage2;
                        d2 = d;
                    }
                }
            }
            if (mediaImage == null) {
                ((ac1) imageDownloadCallback).e = null;
                ard ardVar2 = (ard) ((ac1) imageDownloadCallback).d;
                ardVar2.getClass();
                ardVar2.e = ipe.r((Bitmap) null);
                ardVar2.h();
                ((ac1) imageDownloadCallback).b = -1;
                ((ac1) imageDownloadCallback).d = null;
            } else {
                GURL gurl2 = mediaImage.a;
                if (!gurl2.equals((GURL) ((ac1) imageDownloadCallback).e)) {
                    ((ac1) imageDownloadCallback).e = gurl2;
                    ((ac1) imageDownloadCallback).b = ((WebContents) ((ac1) imageDownloadCallback).c).P(gurl2, imageDownloadCallback);
                }
            }
        }
        ardVar.i();
    }

    public final void b(boolean z, boolean z2) {
        ard ardVar = this.c;
        epd epdVar = ardVar.c;
        k03 k03Var = ardVar.u;
        boolean z3 = !z2;
        MediaSession mediaSession = this.b;
        epdVar.a(mediaSession, z3, false);
        ChromiumContent chromiumContent = ardVar.b;
        if (chromiumContent != null && chromiumContent.c() != null && ardVar.b.c().isInPictureInPictureMode()) {
            ardVar.d.k(mediaSession, z3);
        }
        if (z && !z2) {
            if (k03Var.a < 0) {
                k03Var.a = SystemClock.elapsedRealtime();
            }
            k03Var.b = -1L;
        } else if (k03Var.a >= 0) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            k03Var.c = jElapsedRealtime - k03Var.a;
            k03Var.b = jElapsedRealtime;
            k03Var.a = -1L;
        }
        ChromiumContent chromiumContent2 = ardVar.b;
        if (!z) {
            if (chromiumContent2 == null || ardVar.s != null) {
                return;
            }
            oml omlVar = new oml(ardVar.a.d(new yqd(ardVar, (byte) 0)));
            ardVar.s = omlVar;
            omlVar.b(null, 1000L, TimeUnit.MILLISECONDS, null);
            ardVar.l = null;
            return;
        }
        fp1 fp1VarC = chromiumContent2.c();
        Intent intent = fp1VarC instanceof WebappActivity ? fp1VarC.getIntent() : mdb.b(fp1VarC).setAction("com.opera.android.action.ACTIVATE_TAB").putExtra("tabId", ardVar.b.i);
        if (ardVar.m == null) {
            String strTrim = ardVar.b.p().trim();
            if (strTrim.startsWith("▶")) {
                strTrim = strTrim.substring(1).trim();
            }
            ardVar.m = strTrim;
        }
        MediaMetadata mediaMetadataB = ardVar.b();
        ardVar.o = mediaMetadataB;
        Bitmap bitmap = ardVar.e;
        Bitmap bitmap2 = bitmap != null ? bitmap : ardVar.f;
        ardVar.g = bitmap2;
        ikd ikdVar = new ikd();
        ikdVar.a = mediaMetadataB;
        ikdVar.b = z2;
        ikdVar.c = ardVar.h;
        ChromiumContent chromiumContent3 = ardVar.b;
        ikdVar.d = chromiumContent3.i;
        ikdVar.e = chromiumContent3.t;
        ikdVar.f = z2 ? 2131231385 : 2131231388;
        ikdVar.g = bitmap2;
        ikdVar.h = bitmap;
        ikdVar.i = (byte) 5;
        ikdVar.k = intent;
        ikdVar.j = 2131363343;
        ikdVar.l = ardVar.v;
        ikdVar.m = ardVar.q;
        ikdVar.n = ardVar.r;
        ardVar.l = ikdVar;
        ardVar.g();
        if (fp1VarC != null) {
            fp1VarC.setVolumeControlStream(3);
        }
        if (ardVar.i) {
            ardVar.i = false;
            WebContents webContentsE = ardVar.b.e();
            String str = ardVar.h;
            Context context = ardVar.b.getView().getContext();
            y0a y0aVar = new y0a(this, (byte) 21);
            int iE = nr8.e(context);
            if (N.M4P_efwZ(webContentsE)) {
                return;
            }
            new SpeedDialDataFetcher(webContentsE, str, 0, context, iE, y0aVar);
        }
    }
}
