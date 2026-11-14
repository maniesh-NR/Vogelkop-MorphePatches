package com.opera.android.browser.chromium.contextmenu;

import J.N;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.opera.android.browser.Referrer$Policy;
import defpackage.ms5;
import defpackage.ns5;
import defpackage.qs5;
import defpackage.sqh;
import java.util.ArrayDeque;
import org.chromium.content_public.browser.WebContents;

/* loaded from: classes.dex */
public final class ContextMenuHelperBridge {
    public final ArrayDeque a = new ArrayDeque();
    public final ns5 b;
    public long c;
    public ms5 d;
    public ge5 e;
    public ge5 f;

    public ContextMenuHelperBridge(WebContents webContents, ns5 ns5Var) {
        this.c = N.Mb0oOccr(this, webContents);
        this.b = ns5Var;
    }

    public final void a() {
        ArrayDeque arrayDeque = this.a;
        if (arrayDeque.isEmpty()) {
            return;
        }
        ms5 ms5Var = (ms5) arrayDeque.pop();
        this.d = ms5Var;
        N.MqnTJ088(this.c, ms5Var.a, ms5Var.b.a ? 1 : 0);
    }

    public final void destroy() {
        this.c = 0L;
    }

    public final void receiveImage(@Nullable byte[] bArr, @Nullable String str) {
        ge5 ge5Var = this.f;
        if (ge5Var == null) {
            return;
        }
        ge5Var.p(str, bArr);
        this.f = null;
    }

    public final void receiveImageExtension(@Nullable String str) {
        ge5 ge5Var = this.e;
        if (ge5Var == null) {
            return;
        }
        ge5Var.n(str);
        this.e = null;
    }

    public final void receiveThumbnail(int i, int i2, @Nullable byte[] bArr, int i3, int i4) {
        ms5 ms5Var = this.d;
        if (ms5Var == null) {
            return;
        }
        ms5Var.c.e(i, i2, bArr, i3, i4);
        this.d = null;
        a();
    }

    public final boolean showContextMenu(int i, @NonNull String str, @NonNull String str2, @NonNull String str3, @NonNull String str4, @NonNull String str5, @NonNull String str6, @NonNull String str7, @NonNull String str8, boolean z, @NonNull String str9, int i2, int i3, int i4, @NonNull String str10, boolean z2, int i5, int i6, int i7, int i8) {
        sqh sqhVar;
        Referrer$Policy referrer$Policy = null;
        if (TextUtils.isEmpty(str9)) {
            sqhVar = null;
        } else {
            switch (i2) {
                case 0:
                    referrer$Policy = Referrer$Policy.ALWAYS;
                    break;
                case 1:
                    referrer$Policy = Referrer$Policy.DEFAULT;
                    break;
                case 2:
                    referrer$Policy = Referrer$Policy.NO_REFERRER_WHEN_DOWNGRADE;
                    break;
                case 3:
                    referrer$Policy = Referrer$Policy.NEVER;
                    break;
                case 4:
                    referrer$Policy = Referrer$Policy.ORIGIN;
                    break;
                case 5:
                    referrer$Policy = Referrer$Policy.ORIGIN_WHEN_CROSSORIGIN;
                    break;
                case 6:
                    referrer$Policy = Referrer$Policy.STRICT_ORIGIN_WHEN_CROSSORIGIN;
                    break;
                case 7:
                    referrer$Policy = Referrer$Policy.SAME_ORIGIN;
                    break;
                case 8:
                    referrer$Policy = Referrer$Policy.STRICT_ORIGIN;
                    break;
            }
            sqhVar = new sqh(str9, referrer$Policy);
        }
        return this.b.y(new qs5(i, str, str2, str3, str4, str5, str6, str7, str8, z, sqhVar, i3, i4, str10, i5, i6, i7, i8), z2);
    }
}
