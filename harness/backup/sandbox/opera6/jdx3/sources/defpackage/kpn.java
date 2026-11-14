package defpackage;

import com.opera.android.browser.WebContentsWrapper;
import org.chromium.content_public.browser.NavigationHandle;
import org.chromium.url.GURL;

/* loaded from: classes.dex */
public final class kpn extends rtn {
    public final /* synthetic */ byte c;
    public final rpn d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ kpn(WebContentsWrapper webContentsWrapper, rpn rpnVar, byte b) {
        super(webContentsWrapper);
        this.c = b;
        this.d = rpnVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0030  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void didFinishNavigationInPrimaryMainFrame(org.chromium.content_public.browser.NavigationHandle r9) {
        /*
            r8 = this;
            byte r0 = r8.c
            switch(r0) {
                case 0: goto L6;
                default: goto L5;
            }
        L5:
            return
        L6:
            if (r9 == 0) goto Lb
            boolean r0 = r9.j
            goto Lc
        Lb:
            r0 = 0
        Lc:
            if (r0 == 0) goto L40
            int r0 = r9.k
            int r1 = r9.m
            java.lang.String r9 = r9.l
            r2 = -379(0xfffffffffffffe85, float:NaN)
            if (r0 == r2) goto L36
            r1 = -118(0xffffffffffffff8a, float:NaN)
            if (r0 == r1) goto L30
            r1 = -106(0xffffffffffffff96, float:NaN)
            if (r0 == r1) goto L30
            r1 = -15
            if (r0 == r1) goto L30
            r1 = -7
            if (r0 == r1) goto L30
            switch(r0) {
                case -104: goto L30;
                case -103: goto L30;
                case -102: goto L30;
                case -101: goto L30;
                case -100: goto L30;
                default: goto L2a;
            }
        L2a:
            o68 r1 = new o68
            r1.<init>(r0, r9)
            goto L3e
        L30:
            n68 r1 = new n68
            r1.<init>(r0, r9)
            goto L3e
        L36:
            o68 r9 = new o68
            java.lang.String r0 = "HTTP Error"
            r9.<init>(r1, r0)
            r1 = r9
        L3e:
            r5 = r1
            goto L43
        L40:
            psp r1 = psp.c
            goto L3e
        L43:
            rpn r8 = r8.d
            nak r8 = r8.b
        L47:
            java.lang.Object r9 = r8.getValue()
            r2 = r9
            qpn r2 = (defpackage.qpn) r2
            r6 = 0
            r7 = 11
            r3 = 0
            r4 = 0
            qpn r0 = defpackage.qpn.a(r2, r3, r4, r5, r6, r7)
            boolean r9 = r8.h(r9, r0)
            if (r9 == 0) goto L47
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kpn.didFinishNavigationInPrimaryMainFrame(org.chromium.content_public.browser.NavigationHandle):void");
    }

    public final void didStartLoading(GURL gurl) {
        Object value;
        switch (this.c) {
            case 1:
                nak nakVar = this.d.b;
                do {
                    value = nakVar.getValue();
                } while (!nakVar.h(value, qpn.a((qpn) value, null, true, null, false, 13)));
        }
    }

    public final void didStartNavigationInPrimaryMainFrame(NavigationHandle navigationHandle) {
        Object value;
        switch (this.c) {
            case 0:
                psp pspVar = psp.c;
                nak nakVar = this.d.b;
                do {
                    value = nakVar.getValue();
                } while (!nakVar.h(value, qpn.a((qpn) value, null, false, pspVar, false, 11)));
        }
    }

    public final void didStopLoading(GURL gurl, boolean z) {
        Object value;
        switch (this.c) {
            case 1:
                nak nakVar = this.d.b;
                do {
                    value = nakVar.getValue();
                } while (!nakVar.h(value, qpn.a((qpn) value, null, false, null, false, 13)));
        }
    }
}
