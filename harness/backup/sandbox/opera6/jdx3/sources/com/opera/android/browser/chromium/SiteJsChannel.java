package com.opera.android.browser.chromium;

import defpackage.jo7;
import defpackage.koj;
import defpackage.snf;

/* loaded from: classes.dex */
public final class SiteJsChannel extends jo7 {
    public static boolean isPushedCdbWhitelistDisabled() {
        return false;
    }

    @Override // defpackage.jo7
    public final void d(byte[] bArr) throws Throwable {
        jo7.h(snf.b, bArr, 0, bArr.length, false);
        this.a.d(new koj((byte) 0)).a(null);
    }
}
