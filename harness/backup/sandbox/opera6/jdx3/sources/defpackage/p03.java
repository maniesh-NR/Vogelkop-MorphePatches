package defpackage;

import android.content.Context;
import org.chromium.content.browser.BrowserStartupControllerImpl;

/* loaded from: classes.dex */
public final class p03 implements r03 {
    public int a;
    public boolean b;
    public ix5 c;
    public final /* synthetic */ byte d;

    public /* synthetic */ p03(byte b) {
        this.d = b;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x000e. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001e  */
    @Override // defpackage.r03
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean a(android.content.Context r12, defpackage.zcl r13, bx7 r14) {
        /*
            r11 = this;
            int r0 = r13.a
            r11.a = r0
            qie r5 = new qie
            r5.<init>(r11, r14)
            byte r0 = r11.d
            r1 = 6
            r7 = 0
            r8 = 1
            switch(r0) {
                case 0: goto L18;
                default: goto L11;
            }
        L11:
            int r0 = w7d.z(r12)
            if (r0 != r1) goto L20
            goto L1e
        L18:
            int r0 = w7d.z(r12)
            if (r0 != r1) goto L20
        L1e:
            r0 = r8
            goto L21
        L20:
            r0 = r7
        L21:
            r1 = 2
            if (r0 != r1) goto L25
            return r7
        L25:
            r9 = 15
            r10 = 7
            if (r0 != r8) goto L33
            vr9 r12 = new vr9
            r12.<init>(r9, r11, r14, r7)
            org.chromium.base.task.PostTask.c(r10, r12)
            return r8
        L33:
            ll4 r1 = new ll4
            r6 = 1
            r2 = r11
            r3 = r12
            r4 = r13
            r1.<init>(r2, r3, r4, r5, r6)
            vr9 r11 = new vr9
            r11.<init>(r9, r2, r5, r7)
            org.chromium.content.browser.BrowserStartupControllerImpl r12 = org.chromium.content.browser.BrowserStartupControllerImpl.m
            if (r12 != 0) goto L4c
            org.chromium.content.browser.BrowserStartupControllerImpl r12 = new org.chromium.content.browser.BrowserStartupControllerImpl
            r12.<init>()
            org.chromium.content.browser.BrowserStartupControllerImpl.m = r12
        L4c:
            r13 = r12
            boolean r14 = r12.f
            if (r14 == 0) goto L59
            boolean r12 = r12.g
            if (r12 == 0) goto L59
            org.chromium.base.task.PostTask.c(r10, r1)
            return r8
        L59:
            if (r13 != 0) goto L62
            org.chromium.content.browser.BrowserStartupControllerImpl r13 = new org.chromium.content.browser.BrowserStartupControllerImpl
            r13.<init>()
            org.chromium.content.browser.BrowserStartupControllerImpl.m = r13
        L62:
            boolean r12 = r13.i
            if (r12 == 0) goto L6f
            boolean r12 = r13.f
            if (r12 != 0) goto L6f
            boolean r12 = r13.g
            if (r12 == 0) goto L6f
            r7 = r8
        L6f:
            wm3 r12 = new wm3
            r12.<init>(r2, r7, r1, r11)
            org.chromium.base.task.PostTask.c(r10, r12)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.p03.a(android.content.Context, zcl, bx7):boolean");
    }

    @Override // defpackage.r03
    public final boolean b(Context context, zcl zclVar) {
        this.b = true;
        if (BrowserStartupControllerImpl.m == null) {
            BrowserStartupControllerImpl.m = new BrowserStartupControllerImpl();
        }
        return true;
    }
}
