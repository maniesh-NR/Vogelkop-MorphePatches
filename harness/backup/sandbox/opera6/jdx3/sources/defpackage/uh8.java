package defpackage;

import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.c;

/* loaded from: classes.dex */
public abstract class uh8 {
    public static final ReentrantLock a = new ReentrantLock();

    /* JADX WARN: Removed duplicated region for block: B:29:0x00b5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(android.content.Context r18, android.app.ActivityManager r19, defpackage.q56 r20) throws java.lang.Throwable {
        /*
            java.lang.String r0 = "last_exit_reason_timestamp"
            java.util.concurrent.locks.ReentrantLock r1 = defpackage.uh8.a
            boolean r2 = r1.tryLock()
            if (r2 != 0) goto Lb
            return
        Lb:
            java.lang.String r2 = r18.getPackageName()     // Catch: java.lang.Throwable -> Ld0 java.lang.RuntimeException -> Ld7
            java.lang.String r3 = "osp_exit_reason_prefs"
            r4 = 0
            r5 = r18
            android.content.SharedPreferences r3 = r5.getSharedPreferences(r3, r4)     // Catch: java.lang.Throwable -> Ld0 java.lang.RuntimeException -> Ld7
            r5 = 0
            long r5 = r3.getLong(r0, r5)     // Catch: java.lang.Throwable -> Ld0 java.lang.RuntimeException -> Ld7
            r7 = r19
            java.util.List r7 = r7.getHistoricalProcessExitReasons(r2, r4, r4)     // Catch: java.lang.Throwable -> Ld0 java.lang.RuntimeException -> Ld7
            hf0 r8 = r20.z()     // Catch: java.lang.Throwable -> Ld0 java.lang.RuntimeException -> Ld7
            r1i r9 = new r1i     // Catch: java.lang.Throwable -> Ld0 java.lang.RuntimeException -> Ld7
            r9.<init>(r7)     // Catch: java.lang.Throwable -> Ld0 java.lang.RuntimeException -> Ld7
            java.util.Iterator r7 = r9.iterator()     // Catch: java.lang.Throwable -> Ld0 java.lang.RuntimeException -> Ld7
            r9 = r5
        L32:
            r11 = r7
            q1i r11 = (q1i) r11     // Catch: java.lang.Throwable -> Ld0 java.lang.RuntimeException -> Ld7
            java.lang.Object r11 = r11.b     // Catch: java.lang.Throwable -> Ld0 java.lang.RuntimeException -> Ld7
            java.util.ListIterator r11 = (java.util.ListIterator) r11     // Catch: java.lang.Throwable -> Ld0 java.lang.RuntimeException -> Ld7
            boolean r11 = r11.hasPrevious()     // Catch: java.lang.Throwable -> Ld0 java.lang.RuntimeException -> Ld7
            if (r11 == 0) goto Lbd
            r11 = r7
            q1i r11 = (q1i) r11     // Catch: java.lang.Throwable -> Ld0 java.lang.RuntimeException -> Ld7
            java.lang.Object r11 = r11.b     // Catch: java.lang.Throwable -> Ld0 java.lang.RuntimeException -> Ld7
            java.util.ListIterator r11 = (java.util.ListIterator) r11     // Catch: java.lang.Throwable -> Ld0 java.lang.RuntimeException -> Ld7
            java.lang.Object r11 = r11.previous()     // Catch: java.lang.Throwable -> Ld0 java.lang.RuntimeException -> Ld7
            android.app.ApplicationExitInfo r11 = (android.app.ApplicationExitInfo) r11     // Catch: java.lang.Throwable -> Ld0 java.lang.RuntimeException -> Ld7
            long r12 = r11.getTimestamp()     // Catch: java.lang.Throwable -> Ld0 java.lang.RuntimeException -> Ld7
            int r12 = (r12 > r5 ? 1 : (r12 == r5 ? 0 : -1))
            if (r12 <= 0) goto Lb5
            int r12 = r11.getReason()     // Catch: java.lang.Throwable -> Ld0 java.lang.RuntimeException -> Ld7
            r13 = 6
            r14 = 2
            r15 = 1
            if (r12 == r13) goto L80
            r13 = 9
            if (r12 == r13) goto L7a
            r13 = 13
            r16 = 0
            if (r12 != r13) goto L84
            java.lang.String r12 = r11.getDescription()     // Catch: java.lang.Throwable -> Ld0 java.lang.RuntimeException -> Ld7
            if (r12 == 0) goto L84
            java.lang.String r13 = "MemoryLimiter:AnonSwap"
            boolean r12 = kotlin.text.StringsKt.E(r12, r13, r4)     // Catch: java.lang.Throwable -> Ld0 java.lang.RuntimeException -> Ld7
            if (r12 != r15) goto L84
            java.lang.Integer r16 = java.lang.Integer.valueOf(r15)     // Catch: java.lang.Throwable -> Ld0 java.lang.RuntimeException -> Ld7
            goto L84
        L7a:
            r12 = 3
            java.lang.Integer r16 = java.lang.Integer.valueOf(r12)     // Catch: java.lang.Throwable -> Ld0 java.lang.RuntimeException -> Ld7
            goto L84
        L80:
            java.lang.Integer r16 = java.lang.Integer.valueOf(r14)     // Catch: java.lang.Throwable -> Ld0 java.lang.RuntimeException -> Ld7
        L84:
            if (r16 == 0) goto Lb5
            int r12 = r16.intValue()     // Catch: java.lang.Throwable -> Ld0 java.lang.RuntimeException -> Ld7
            java.lang.String r13 = r11.getProcessName()     // Catch: java.lang.Throwable -> Ld0 java.lang.RuntimeException -> Ld7
            gn0 r13 = b(r13, r2)     // Catch: java.lang.Throwable -> Ld0 java.lang.RuntimeException -> Ld7
            m70 r4 = new m70     // Catch: java.lang.Throwable -> Ld0 java.lang.RuntimeException -> Ld7
            r15 = 2443(0x98b, float:3.423E-42)
            r17 = r1
            r1 = -1
            r4.<init>(r15, r1, r14)     // Catch: java.lang.Throwable -> Lce java.lang.RuntimeException -> Ld9
            r1 = 1
            r14 = 0
            r4.q(r14, r1, r13)     // Catch: java.lang.Throwable -> Lce java.lang.RuntimeException -> Ld9
            long r12 = (long) r12     // Catch: java.lang.Throwable -> Lce java.lang.RuntimeException -> Ld9
            r4.p(r1, r1, r12)     // Catch: java.lang.Throwable -> Lce java.lang.RuntimeException -> Ld9
            r8.add(r4)     // Catch: java.lang.Throwable -> Lce java.lang.RuntimeException -> Ld9
            long r12 = r11.getTimestamp()     // Catch: java.lang.Throwable -> Lce java.lang.RuntimeException -> Ld9
            int r1 = (r12 > r9 ? 1 : (r12 == r9 ? 0 : -1))
            if (r1 <= 0) goto Lb8
            long r9 = r11.getTimestamp()     // Catch: java.lang.Throwable -> Lce java.lang.RuntimeException -> Ld9
            goto Lb8
        Lb5:
            r17 = r1
            r14 = r4
        Lb8:
            r4 = r14
            r1 = r17
            goto L32
        Lbd:
            r17 = r1
            int r1 = (r9 > r5 ? 1 : (r9 == r5 ? 0 : -1))
            if (r1 <= 0) goto Ld9
            android.content.SharedPreferences$Editor r1 = r3.edit()     // Catch: java.lang.Throwable -> Lce java.lang.RuntimeException -> Ld9
            r1.putLong(r0, r9)     // Catch: java.lang.Throwable -> Lce java.lang.RuntimeException -> Ld9
            r1.apply()     // Catch: java.lang.Throwable -> Lce java.lang.RuntimeException -> Ld9
            goto Ld9
        Lce:
            r0 = move-exception
            goto Ld3
        Ld0:
            r0 = move-exception
            r17 = r1
        Ld3:
            r17.unlock()
            throw r0
        Ld7:
            r17 = r1
        Ld9:
            r17.unlock()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uh8.a(android.content.Context, android.app.ActivityManager, q56):void");
    }

    public static gn0 b(String str, String str2) {
        if (Intrinsics.a(str, str2)) {
            return gn0.b;
        }
        if (c.q(str, str2 + ":sandboxed_process", false)) {
            return gn0.c;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str2);
        sb.append(":privileged_process");
        return c.q(str, sb.toString(), false) ? gn0.d : gn0.e;
    }
}
