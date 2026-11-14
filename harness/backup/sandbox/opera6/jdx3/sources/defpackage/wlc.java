package defpackage;

import com.opera.android.live_score.data.db.LiveScoreDatabase_Impl;
import java.util.List;

/* loaded from: classes.dex */
public final class wlc {
    public final LiveScoreDatabase_Impl a;
    public final nb2 b = new nb2(7);
    public final nb2 c = new nb2(8);
    public final nb2 d = new nb2(9);
    public final nb2 e = new nb2(10);
    public final nb2 f = new nb2(11);
    public final nb2 g = new nb2(12);
    public final nb2 h = new nb2(13);
    public final nb2 i = new nb2(14);
    public final li3 j = new li3((byte) 5);
    public final li3 k = new li3((byte) 3);
    public final li3 l = new li3((byte) 4);

    public wlc(LiveScoreDatabase_Impl liveScoreDatabase_Impl) {
        this.a = liveScoreDatabase_Impl;
    }

    /* JADX WARN: Code restructure failed: missing block: B:107:0x01b8, code lost:
    
        if (kfo.a0(r3, r0.a, false, true, new defpackage.vlc(r0, r2, 0)) == r4) goto L108;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object a(defpackage.wlc r29, java.util.ArrayList r30, mt5 r31) {
        /*
            Method dump skipped, instructions count: 446
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wlc.a(wlc, java.util.ArrayList, mt5):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x018a, code lost:
    
        if (kfo.a0(r2, r15.a, false, true, new defpackage.x41(r5, 9)) == r3) goto L54;
     */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x0130 -> B:42:0x0199). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:40:0x018a -> B:41:0x018c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object c(defpackage.wlc r18, long r19, mt5 r21) {
        /*
            Method dump skipped, instructions count: 498
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wlc.c(wlc, long, mt5):java.lang.Object");
    }

    public final Object b(List list, kuk kukVar) {
        StringBuilder sb = new StringBuilder("DELETE FROM football_events WHERE source IN (");
        int size = list.size();
        for (int i = 0; i < size; i++) {
            sb.append("?");
            if (i < size - 1) {
                sb.append(",");
            }
        }
        sb.append(")");
        return kfo.a0(kukVar, this.a, false, true, new jkc(sb.toString(), list, (byte) 5));
    }
}
