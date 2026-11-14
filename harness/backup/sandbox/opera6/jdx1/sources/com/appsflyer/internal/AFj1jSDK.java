package com.appsflyer.internal;

import android.content.Intent;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class AFj1jSDK {

    @NotNull
    final Intent getCurrencyIso4217Code;

    /* JADX INFO: Add missing generic type declarations: [T] */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\u0001*\u00020\u0000H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroid/os/Parcelable;", "T", "J_", "()Landroid/os/Parcelable;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: com.appsflyer.internal.AFj1jSDK$1, reason: invalid class name */
    static final class AnonymousClass1<T> extends ozb implements Function0<T> {
        private /* synthetic */ String $getCurrencyIso4217Code;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(String str) {
            super(0);
            this.$getCurrencyIso4217Code = str;
        }

        /* JADX WARN: Incorrect return type in method signature: ()TT; */
        /* renamed from: J_, reason: merged with bridge method [inline-methods] */
        public final Parcelable invoke() {
            return AFj1jSDK.this.getCurrencyIso4217Code.getParcelableExtra(this.$getCurrencyIso4217Code);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "getMediationNetwork", "()Ljava/lang/String;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: com.appsflyer.internal.AFj1jSDK$2, reason: invalid class name */
    static final class AnonymousClass2 extends ozb implements Function0<String> {
        private /* synthetic */ String $getCurrencyIso4217Code;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(String str) {
            super(0);
            this.$getCurrencyIso4217Code = str;
        }

        /* renamed from: getMediationNetwork, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return AFj1jSDK.this.getCurrencyIso4217Code.getStringExtra(this.$getCurrencyIso4217Code);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroid/content/Intent;", "K_", "()Landroid/content/Intent;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: com.appsflyer.internal.AFj1jSDK$3, reason: invalid class name */
    static final class AnonymousClass3 extends ozb implements Function0<Intent> {
        private /* synthetic */ String $getMonetizationNetwork;
        private /* synthetic */ long $getRevenue;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(String str, long j) {
            super(0);
            this.$getMonetizationNetwork = str;
            this.$getRevenue = j;
        }

        @NotNull
        /* renamed from: K_, reason: merged with bridge method [inline-methods] */
        public final Intent invoke() {
            return AFj1jSDK.this.getCurrencyIso4217Code.putExtra(this.$getMonetizationNetwork, this.$getRevenue);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "getCurrencyIso4217Code", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: com.appsflyer.internal.AFj1jSDK$5, reason: invalid class name */
    static final class AnonymousClass5 extends ozb implements Function0<Boolean> {
        private /* synthetic */ String $getMediationNetwork;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass5(String str) {
            super(0);
            this.$getMediationNetwork = str;
        }

        @NotNull
        /* renamed from: getCurrencyIso4217Code, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke() {
            return Boolean.valueOf(AFj1jSDK.this.getCurrencyIso4217Code.hasExtra(this.$getMediationNetwork));
        }
    }

    public AFj1jSDK(@NotNull Intent intent) {
        this.getCurrencyIso4217Code = intent;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005b A[Catch: all -> 0x0060, TRY_LEAVE, TryCatch #0 {, blocks: (B:8:0x0013, B:19:0x0053, B:22:0x005b, B:18:0x004b, B:7:0x000b, B:10:0x002e, B:13:0x003e, B:14:0x0043, B:16:0x0049, B:4:0x0003), top: B:28:0x0003, inners: #1, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x002e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r1v10, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v1, types: [q0i] */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v2, types: [q0i] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final <T> T getMonetizationNetwork(kotlin.jvm.functions.Function0<? extends T> r7, java.lang.String r8, T r9, boolean r10) {
        /*
            r6 = this;
            android.content.Intent r0 = r6.getCurrencyIso4217Code
            monitor-enter(r0)
            p0i r1 = t0i.b     // Catch: java.lang.Throwable -> La
            java.lang.Object r1 = r7.invoke()     // Catch: java.lang.Throwable -> La
            goto L13
        La:
            r1 = move-exception
            p0i r2 = t0i.b     // Catch: java.lang.Throwable -> L60
            q0i r2 = new q0i     // Catch: java.lang.Throwable -> L60
            r2.<init>(r1)     // Catch: java.lang.Throwable -> L60
            r1 = r2
        L13:
            java.lang.Class<java.util.ConcurrentModificationException> r2 = java.util.ConcurrentModificationException.class
            s15 r2 = uqh.a(r2)     // Catch: java.lang.Throwable -> L60
            java.lang.Class<java.lang.ArrayIndexOutOfBoundsException> r3 = java.lang.ArrayIndexOutOfBoundsException.class
            s15 r3 = uqh.a(r3)     // Catch: java.lang.Throwable -> L60
            r4 = 2
            itb[] r4 = new itb[r4]     // Catch: java.lang.Throwable -> L60
            r5 = 0
            r4[r5] = r2     // Catch: java.lang.Throwable -> L60
            r2 = 1
            r4[r2] = r3     // Catch: java.lang.Throwable -> L60
            java.lang.Throwable r2 = t0i.d(r1)     // Catch: java.lang.Throwable -> L60
            if (r2 == 0) goto L53
            java.lang.Class r1 = r2.getClass()     // Catch: java.lang.Throwable -> L4a
            s15 r1 = uqh.a(r1)     // Catch: java.lang.Throwable -> L4a
            int r1 = e82.u(r1, r4)     // Catch: java.lang.Throwable -> L4a
            if (r1 < 0) goto L49
            if (r10 == 0) goto L43
            java.lang.Object r6 = r6.getMonetizationNetwork(r7, r8, r9, r5)     // Catch: java.lang.Throwable -> L4a
            goto L47
        L43:
            com.appsflyer.AFLogger.afErrorLog(r8, r2, r5, r5)     // Catch: java.lang.Throwable -> L4a
            r6 = r9
        L47:
            r1 = r6
            goto L53
        L49:
            throw r2     // Catch: java.lang.Throwable -> L4a
        L4a:
            r6 = move-exception
            p0i r7 = t0i.b     // Catch: java.lang.Throwable -> L60
            q0i r7 = new q0i     // Catch: java.lang.Throwable -> L60
            r7.<init>(r6)     // Catch: java.lang.Throwable -> L60
            r1 = r7
        L53:
            java.lang.Throwable r6 = t0i.d(r1)     // Catch: java.lang.Throwable -> L60
            if (r6 != 0) goto L5b
            r9 = r1
            goto L5e
        L5b:
            com.appsflyer.AFLogger.afErrorLog(r8, r6, r5, r5)     // Catch: java.lang.Throwable -> L60
        L5e:
            monitor-exit(r0)
            return r9
        L60:
            r6 = move-exception
            monitor-exit(r0)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFj1jSDK.getMonetizationNetwork(kotlin.jvm.functions.Function0, java.lang.String, java.lang.Object, boolean):java.lang.Object");
    }

    public final <T extends Parcelable> T H_(@NotNull String str) {
        return (T) getMonetizationNetwork(new AnonymousClass1(str), sko.k("Error while trying to read ", str, " extra from intent"), null, true);
    }

    public final Intent I_(@NotNull String str, long j) {
        return (Intent) getMonetizationNetwork(new AnonymousClass3(str, j), sko.k("Error while trying to write ", str, " extra to intent"), null, true);
    }

    public final boolean getMonetizationNetwork(@NotNull String str) {
        Boolean bool = (Boolean) getMonetizationNetwork(new AnonymousClass5(str), sko.k("Error while trying to check presence of ", str, " extra from intent"), Boolean.TRUE, true);
        if (bool != null) {
            return bool.booleanValue();
        }
        return true;
    }

    public final String getRevenue(@NotNull String str) {
        return (String) getMonetizationNetwork(new AnonymousClass2(str), sko.k("Error while trying to read ", str, " extra from intent"), null, true);
    }
}
