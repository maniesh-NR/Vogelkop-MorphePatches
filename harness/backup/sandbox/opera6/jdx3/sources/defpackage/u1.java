package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.appsflyer.internal.j;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class u1 {
    public static final s1 g = new s1("", false, null, null);
    public static final s1 h = new s1("new_user", false, null, null);
    public final HashSet a;
    public final AtomicReference b;
    public final v1 c;
    public final j4c d;
    public volatile boolean e;
    public final b59 f;

    public u1(Context context, v1 v1Var) {
        HashSet hashSet = new HashSet(na2.j(2));
        Collections.addAll(hashSet, "news_delay", "cc_new_start_page_test");
        this.a = hashSet;
        this.b = new AtomicReference();
        this.c = v1Var;
        this.d = new j4c(new t1(context, (byte) 0), (byte) 0);
        this.f = w1h.l(context, vml.d, "ab_testing", new bg1[0]);
    }

    public final String a(s1 s1Var) {
        String str;
        HashMap map = s1Var.c;
        if (map == null || (str = (String) map.get("test")) == null || !this.a.contains(str)) {
            return null;
        }
        return str;
    }

    public final void b(s1 s1Var) {
        this.b.set(s1Var);
        if (s1Var == null || TextUtils.isEmpty(s1Var.a) || !s1Var.b || a(s1Var) == null) {
            return;
        }
        b59 b59Var = this.f;
        if (((SharedPreferences) b59Var.get()).getBoolean("client_test_activated", true)) {
            return;
        }
        j.d((SharedPreferences) b59Var.get(), "client_test_activated", true);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x004a, code lost:
    
        if (r7.e != false) goto L39;
     */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00aa A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(defpackage.q1 r8, boolean r9) {
        /*
            r7 = this;
            java.lang.String r0 = "client_test_activated"
            if (r9 == 0) goto L14
            boolean r9 = r8.a
            if (r9 == 0) goto L14
            b59 r9 = r7.f
            java.lang.Object r9 = r9.get()
            android.content.SharedPreferences r9 = (android.content.SharedPreferences) r9
            r1 = 0
            com.appsflyer.internal.j.d(r9, r0, r1)
        L14:
            java.lang.String r9 = r8.b
            boolean r1 = r8.a
            java.lang.String[] r2 = r8.c
            java.lang.String[] r8 = r8.d
            s1 r3 = defpackage.u1.g
            s1 r4 = new s1
            r4.<init>(r9, r1, r2, r8)
            java.util.concurrent.atomic.AtomicReference r8 = r7.b
            java.lang.Object r2 = r8.get()
            s1 r2 = (defpackage.s1) r2
            java.lang.Object r8 = r8.get()
            s1 r8 = (defpackage.s1) r8
            r5 = 1
            if (r8 == 0) goto L71
            java.lang.String r6 = r8.a
            boolean r6 = android.text.TextUtils.isEmpty(r6)
            if (r6 != 0) goto L71
            boolean r6 = android.text.TextUtils.isEmpty(r9)
            boolean r8 = r8.b
            if (r6 == 0) goto L4d
            if (r8 == 0) goto La4
            if (r8 == 0) goto La4
            boolean r8 = r7.e
            if (r8 != 0) goto L95
            goto La4
        L4d:
            if (r8 == 0) goto L53
            boolean r8 = r7.e
            if (r8 != 0) goto L95
        L53:
            if (r1 == 0) goto La4
            java.lang.String r8 = r7.a(r4)
            if (r8 == 0) goto L95
            boolean r8 = r7.e
            if (r8 != 0) goto L95
            b59 r8 = r7.f
            java.lang.Object r8 = r8.get()
            android.content.SharedPreferences r8 = (android.content.SharedPreferences) r8
            boolean r8 = r8.getBoolean(r0, r5)
            if (r8 != 0) goto La4
            r7.a(r4)
            goto La4
        L71:
            boolean r8 = android.text.TextUtils.isEmpty(r9)
            if (r8 != 0) goto La4
            if (r1 == 0) goto La4
            java.lang.String r8 = r7.a(r4)
            if (r8 == 0) goto L95
            boolean r8 = r7.e
            if (r8 != 0) goto L95
            b59 r8 = r7.f
            java.lang.Object r8 = r8.get()
            android.content.SharedPreferences r8 = (android.content.SharedPreferences) r8
            boolean r8 = r8.getBoolean(r0, r5)
            if (r8 != 0) goto La4
            r7.a(r4)
            goto La4
        L95:
            if (r2 == 0) goto La0
            boolean r8 = r2.b
            if (r8 == 0) goto La0
            boolean r8 = r7.e
            if (r8 == 0) goto La0
            return
        La0:
            r7.b(r3)
            return
        La4:
            boolean r8 = android.text.TextUtils.isEmpty(r9)
            if (r8 != 0) goto Lba
            if (r1 == 0) goto Lba
            java.lang.String r8 = r7.a(r4)
            if (r8 == 0) goto Lb6
            r7.b(r4)
            return
        Lb6:
            r7.b(r3)
            return
        Lba:
            r7.b(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.u1.c(q1, boolean):void");
    }
}
