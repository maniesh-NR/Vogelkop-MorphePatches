package defpackage;

import ads_mobile_sdk.g03;
import android.content.BroadcastReceiver;

/* loaded from: classes.dex */
public final class up1 extends BroadcastReceiver {
    public final /* synthetic */ byte a;
    public final Object b;

    public up1(byte b) {
        this.a = b;
        switch (b) {
            case 25:
                this.b = g03.d;
                break;
            default:
                this.b = d0l.a;
                break;
        }
    }

    public /* synthetic */ up1(byte b, Object obj, boolean z) {
        this.a = b;
        this.b = obj;
    }

    public /* synthetic */ up1(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:127:0x02ef  */
    @Override // android.content.BroadcastReceiver
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onReceive(android.content.Context r24, android.content.Intent r25) {
        /*
            Method dump skipped, instructions count: 2168
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.up1.onReceive(android.content.Context, android.content.Intent):void");
    }
}
