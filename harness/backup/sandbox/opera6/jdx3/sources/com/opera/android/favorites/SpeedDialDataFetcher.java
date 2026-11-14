package com.opera.android.favorites;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import androidx.annotation.Nullable;
import com.opera.android.favorites.SpeedDialDataFetcher;
import com.opera.android.webapps.ShortcutHelper;
import com.opera.api.Callback;
import defpackage.ghf;
import defpackage.nml;
import defpackage.txi;
import defpackage.umi;
import defpackage.vml;
import defpackage.wzg;
import org.chromium.content_public.browser.WebContents;

/* loaded from: classes.dex */
public final class SpeedDialDataFetcher {
    public final Context a;
    public final Callback b;
    public final String c;
    public final byte d;
    public final int e;
    public final int f;

    /* JADX WARN: Multi-variable type inference failed */
    public SpeedDialDataFetcher(WebContents webContents, String str, int i, Context context, int i2, Callback callback) {
        this.a = context;
        this.b = callback;
        this.c = str;
        this.d = i;
        this.e = i2;
        boolean z = false;
        this.f = webContents == null ? 0 : webContents.T();
        new ghf(cqp.f0(context), str, i2, vml.d, new wzg((byte) 5, this, webContents, z), 3000L);
    }

    public final void finalizeAndSetIcon(@Nullable final Bitmap bitmap, final boolean z) {
        umi umiVar = vml.d;
        nml nmlVarB = umiVar.b(new esk() { // from class: kzj
            public final Object get() {
                Bitmap bitmapCopy;
                SpeedDialDataFetcher speedDialDataFetcher = this.a;
                Bitmap bitmapC = ShortcutHelper.c(speedDialDataFetcher.e, speedDialDataFetcher.f, speedDialDataFetcher.a, bitmap);
                if (bitmapC != null) {
                    return bitmapC;
                }
                byte b = speedDialDataFetcher.d;
                if (b == 0) {
                    return null;
                }
                if (b == 2 && z) {
                    return null;
                }
                Context context = speedDialDataFetcher.a;
                String str = speedDialDataFetcher.c;
                int i = speedDialDataFetcher.e;
                int i2 = vmj.g;
                vmj vmjVarL = tmj.l(context, str, umj.a, i, i, na5.b, false);
                Bitmap bitmap2 = vmjVarL.f;
                if (bitmap2 != null && (bitmapCopy = bitmap2.copy(Bitmap.Config.ARGB_8888, false)) != null) {
                    return bitmapCopy;
                }
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(vmjVarL.a, vmjVarL.b, Bitmap.Config.ARGB_8888);
                vmjVarL.a(new Canvas(bitmapCreateBitmap));
                return bitmapCreateBitmap;
            }
        });
        nmlVarB.b(umiVar.f(new txi(this, (byte) 12)));
        nmlVarB.a(null);
    }
}
