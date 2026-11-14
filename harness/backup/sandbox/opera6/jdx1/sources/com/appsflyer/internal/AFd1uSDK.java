package com.appsflyer.internal;

import ads_mobile_sdk.pd;
import android.os.Build;
import android.widget.ExpandableListView;
import androidx.core.app.NotificationCompat;
import com.appsflyer.AFLogger;
import com.appsflyer.internal.AFd1vSDK;
import defpackage.l4c;
import java.io.UnsupportedEncodingException;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class AFd1uSDK implements AFd1vSDK {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int AFLogger = 1;
    private static int copydefault;
    private AFd1vSDK.AFa1ySDK component2;

    @NotNull
    private AFc1dSDK getMediationNetwork;
    private static char[] hashCode = {8636, 8652, 8639, 8648, 8626};
    private static int equals = -771284898;
    private static boolean toString = true;
    private static boolean copy = true;

    @NotNull
    private final l4c AFAdRevenueData = z4c.b(new AnonymousClass5());

    @NotNull
    private final l4c getMonetizationNetwork = z4c.b(new AnonymousClass2());

    @NotNull
    private final l4c getRevenue = z4c.b(new AnonymousClass4());

    @NotNull
    private final l4c getCurrencyIso4217Code = z4c.b(new AnonymousClass10());

    @NotNull
    private final l4c areAllFieldsValid = z4c.b(new AnonymousClass3());

    @NotNull
    private final String component1 = "6.17.0";

    @NotNull
    private final l4c component4 = z4c.b(new AnonymousClass1());

    @NotNull
    private final l4c component3 = z4c.b(new AnonymousClass6());

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/appsflyer/internal/AFc1bSDK;", "getRevenue", "()Lcom/appsflyer/internal/AFc1bSDK;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: com.appsflyer.internal.AFd1uSDK$1, reason: invalid class name */
    static final class AnonymousClass1 extends ozb implements Function0<AFc1bSDK> {
        public AnonymousClass1() {
            super(0);
        }

        @NotNull
        /* renamed from: getRevenue, reason: merged with bridge method [inline-methods] */
        public final AFc1bSDK invoke() {
            return new AFc1bSDK(AFd1uSDK.getCurrencyIso4217Code(AFd1uSDK.this).AFInAppEventType());
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/appsflyer/internal/AFf1gSDK;", "getRevenue", "()Lcom/appsflyer/internal/AFf1gSDK;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: com.appsflyer.internal.AFd1uSDK$10, reason: invalid class name */
    static final class AnonymousClass10 extends ozb implements Function0<AFf1gSDK> {
        public AnonymousClass10() {
            super(0);
        }

        @NotNull
        /* renamed from: getRevenue, reason: merged with bridge method [inline-methods] */
        public final AFf1gSDK invoke() {
            return AFd1uSDK.getCurrencyIso4217Code(AFd1uSDK.this).registerClient();
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/appsflyer/internal/AFc1pSDK;", "getCurrencyIso4217Code", "()Lcom/appsflyer/internal/AFc1pSDK;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: com.appsflyer.internal.AFd1uSDK$2, reason: invalid class name */
    static final class AnonymousClass2 extends ozb implements Function0<AFc1pSDK> {
        public AnonymousClass2() {
            super(0);
        }

        @NotNull
        /* renamed from: getCurrencyIso4217Code, reason: merged with bridge method [inline-methods] */
        public final AFc1pSDK invoke() {
            return AFd1uSDK.getCurrencyIso4217Code(AFd1uSDK.this).getRevenue();
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljava/util/concurrent/ExecutorService;", "AFAdRevenueData", "()Ljava/util/concurrent/ExecutorService;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: com.appsflyer.internal.AFd1uSDK$3, reason: invalid class name */
    static final class AnonymousClass3 extends ozb implements Function0<ExecutorService> {
        public AnonymousClass3() {
            super(0);
        }

        @NotNull
        /* renamed from: AFAdRevenueData, reason: merged with bridge method [inline-methods] */
        public final ExecutorService invoke() {
            return AFd1uSDK.getCurrencyIso4217Code(AFd1uSDK.this).getMonetizationNetwork();
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/appsflyer/internal/AFc1qSDK;", "AFAdRevenueData", "()Lcom/appsflyer/internal/AFc1qSDK;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: com.appsflyer.internal.AFd1uSDK$4, reason: invalid class name */
    static final class AnonymousClass4 extends ozb implements Function0<AFc1qSDK> {
        public AnonymousClass4() {
            super(0);
        }

        @NotNull
        /* renamed from: AFAdRevenueData, reason: merged with bridge method [inline-methods] */
        public final AFc1qSDK invoke() {
            return AFd1uSDK.getCurrencyIso4217Code(AFd1uSDK.this).component2();
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/appsflyer/internal/AFf1oSDK;", "getCurrencyIso4217Code", "()Lcom/appsflyer/internal/AFf1oSDK;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: com.appsflyer.internal.AFd1uSDK$5, reason: invalid class name */
    static final class AnonymousClass5 extends ozb implements Function0<AFf1oSDK> {
        public AnonymousClass5() {
            super(0);
        }

        @NotNull
        /* renamed from: getCurrencyIso4217Code, reason: merged with bridge method [inline-methods] */
        public final AFf1oSDK invoke() {
            return AFd1uSDK.getCurrencyIso4217Code(AFd1uSDK.this).component1();
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/appsflyer/internal/AFd1ySDK;", "AFAdRevenueData", "()Lcom/appsflyer/internal/AFd1ySDK;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: com.appsflyer.internal.AFd1uSDK$6, reason: invalid class name */
    static final class AnonymousClass6 extends ozb implements Function0<AFd1ySDK> {
        public AnonymousClass6() {
            super(0);
        }

        @NotNull
        /* renamed from: AFAdRevenueData, reason: merged with bridge method [inline-methods] */
        public final AFd1ySDK invoke() {
            return new AFd1ySDK(AFd1uSDK.this.getRevenue());
        }
    }

    public AFd1uSDK(@NotNull AFc1dSDK aFc1dSDK) {
        this.getMediationNetwork = aFc1dSDK;
    }

    private static /* synthetic */ Object AFAdRevenueData(Object[] objArr) {
        AFd1uSDK aFd1uSDK = (AFd1uSDK) objArr[0];
        int i = AFLogger + 79;
        copydefault = i % NotificationCompat.FLAG_HIGH_PRIORITY;
        byte b = 2;
        if (i % 2 != 0) {
            aFd1uSDK.areAllFieldsValid().execute(new l(aFd1uSDK, b));
            int i2 = 76 / 0;
        } else {
            aFd1uSDK.areAllFieldsValid().execute(new l(aFd1uSDK, b));
        }
        int i3 = copydefault + 21;
        AFLogger = i3 % NotificationCompat.FLAG_HIGH_PRIORITY;
        if (i3 % 2 == 0) {
            int i4 = 93 / 0;
        }
        return null;
    }

    private final Map<String, String> AFAdRevenueData(AFh1dSDK aFh1dSDK) throws UnsupportedEncodingException {
        Object[] objArr = new Object[1];
        a("\u0085\u0084\u0083\u0082\u0081", null, null, ExpandableListView.getPackedPositionType(0L) + 127, objArr);
        Map<String, String> mapC = rbd.c(new Pair[]{new Pair(((String) objArr[0]).intern(), Build.BRAND), new Pair("model", Build.MODEL), new Pair("app_id", getMediationNetwork().getRevenue.getMonetizationNetwork.getPackageName()), new Pair("p_ex", new AFa1vSDK().getMonetizationNetwork()), new Pair("api", String.valueOf(Build.VERSION.SDK_INT)), new Pair("sdk", this.component1), new Pair("uid", AFb1iSDK.getRevenue(getMediationNetwork().getMonetizationNetwork)), new Pair("exc_config", aFh1dSDK.getMonetizationNetwork())});
        int i = copydefault + 125;
        AFLogger = i % NotificationCompat.FLAG_HIGH_PRIORITY;
        if (i % 2 != 0) {
            return mapC;
        }
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void AFAdRevenueData(AFd1uSDK aFd1uSDK) {
        getMediationNetwork(new Object[]{aFd1uSDK}, 801406437, -801406436, (int) System.currentTimeMillis());
    }

    private static void a(String str, int[] iArr, String str2, int i, Object[] objArr) throws UnsupportedEncodingException {
        int length;
        char[] cArr;
        int i2;
        char[] charArray = str2;
        if (str2 != null) {
            $10 = ($11 + 39) % NotificationCompat.FLAG_HIGH_PRIORITY;
            charArray = str2.toCharArray();
        }
        char[] cArr2 = charArray;
        byte[] bytes = str;
        if (str != null) {
            bytes = str.getBytes("ISO-8859-1");
        }
        byte[] bArr = bytes;
        AFk1nSDK aFk1nSDK = new AFk1nSDK();
        char[] cArr3 = hashCode;
        if (cArr3 != null) {
            int i3 = $11 + 61;
            $10 = i3 % NotificationCompat.FLAG_HIGH_PRIORITY;
            if (i3 % 2 != 0) {
                length = cArr3.length;
                cArr = new char[length];
                i2 = 1;
            } else {
                length = cArr3.length;
                cArr = new char[length];
                i2 = 0;
            }
            while (i2 < length) {
                $10 = ($11 + 97) % NotificationCompat.FLAG_HIGH_PRIORITY;
                cArr[i2] = (char) (cArr3[i2] ^ (-5879130172463570806L));
                i2++;
            }
            cArr3 = cArr;
        }
        int i4 = (int) (equals ^ (-5879130172463570806L));
        if (copy) {
            int length2 = bArr.length;
            aFk1nSDK.getMonetizationNetwork = length2;
            char[] cArr4 = new char[length2];
            aFk1nSDK.AFAdRevenueData = 0;
            while (true) {
                int i5 = aFk1nSDK.AFAdRevenueData;
                int i6 = aFk1nSDK.getMonetizationNetwork;
                if (i5 >= i6) {
                    objArr[0] = new String(cArr4);
                    return;
                } else {
                    $11 = ($10 + 19) % NotificationCompat.FLAG_HIGH_PRIORITY;
                    cArr4[i5] = (char) (cArr3[bArr[(i6 - 1) - i5] + i] - i4);
                    aFk1nSDK.AFAdRevenueData = i5 + 1;
                }
            }
        } else {
            if (toString) {
                int length3 = cArr2.length;
                aFk1nSDK.getMonetizationNetwork = length3;
                char[] cArr5 = new char[length3];
                aFk1nSDK.AFAdRevenueData = 0;
                while (true) {
                    int i7 = aFk1nSDK.AFAdRevenueData;
                    int i8 = aFk1nSDK.getMonetizationNetwork;
                    if (i7 >= i8) {
                        break;
                    }
                    cArr5[i7] = (char) (cArr3[cArr2[(i8 - 1) - i7] - i] - i4);
                    aFk1nSDK.AFAdRevenueData = i7 + 1;
                }
                String str3 = new String(cArr5);
                int i9 = $11 + 27;
                $10 = i9 % NotificationCompat.FLAG_HIGH_PRIORITY;
                if (i9 % 2 == 0) {
                    objArr[0] = str3;
                    return;
                } else {
                    int i10 = 15 / 0;
                    objArr[0] = str3;
                    return;
                }
            }
            int length4 = iArr.length;
            aFk1nSDK.getMonetizationNetwork = length4;
            char[] cArr6 = new char[length4];
            aFk1nSDK.AFAdRevenueData = 0;
            while (true) {
                int i11 = aFk1nSDK.AFAdRevenueData;
                int i12 = aFk1nSDK.getMonetizationNetwork;
                if (i11 >= i12) {
                    objArr[0] = new String(cArr6);
                    return;
                } else {
                    cArr6[i11] = (char) (cArr3[iArr[(i12 - 1) - i11] - i] - i4);
                    aFk1nSDK.AFAdRevenueData = i11 + 1;
                }
            }
        }
    }

    private final ExecutorService areAllFieldsValid() {
        AFLogger = (copydefault + 47) % NotificationCompat.FLAG_HIGH_PRIORITY;
        ExecutorService executorService = (ExecutorService) this.areAllFieldsValid.getValue();
        AFLogger = (copydefault + 37) % NotificationCompat.FLAG_HIGH_PRIORITY;
        return executorService;
    }

    private final AFh1dSDK component1() {
        return (AFh1dSDK) getMediationNetwork(new Object[]{this}, 855295870, -855295867, System.identityHashCode(this));
    }

    private final AFc1qSDK component2() {
        int i = copydefault + 19;
        AFLogger = i % NotificationCompat.FLAG_HIGH_PRIORITY;
        int i2 = i % 2;
        AFc1qSDK aFc1qSDK = (AFc1qSDK) this.getRevenue.getValue();
        if (i2 != 0) {
            return aFc1qSDK;
        }
        throw null;
    }

    @NotNull
    private AFd1xSDK component3() {
        return (AFd1xSDK) getMediationNetwork(new Object[]{this}, -704520981, 704520985, System.identityHashCode(this));
    }

    private final AFf1gSDK component4() {
        int i = AFLogger + 17;
        copydefault = i % NotificationCompat.FLAG_HIGH_PRIORITY;
        int i2 = i % 2;
        AFf1gSDK aFf1gSDK = (AFf1gSDK) this.getCurrencyIso4217Code.getValue();
        if (i2 != 0) {
            throw null;
        }
        AFLogger = (copydefault + 117) % NotificationCompat.FLAG_HIGH_PRIORITY;
        return aFf1gSDK;
    }

    private final synchronized void copy() {
        boolean monetizationNetwork;
        AFh1dSDK aFh1dSDK = (AFh1dSDK) getMediationNetwork(new Object[]{this}, 855295870, -855295867, System.identityHashCode(this));
        if (aFh1dSDK != null) {
            int i = copydefault + 57;
            AFLogger = i % NotificationCompat.FLAG_HIGH_PRIORITY;
            int i2 = i % 2;
            int i3 = aFh1dSDK.AFAdRevenueData;
            if (i2 == 0) {
                throw null;
            }
            if (i3 == -1) {
                component2().getMonetizationNetwork("af_send_exc_to_server_window");
            } else if (component2().getCurrencyIso4217Code("af_send_exc_to_server_window", -1L) == -1) {
                AFLogger = (copydefault + 119) % NotificationCompat.FLAG_HIGH_PRIORITY;
                getRevenue(aFh1dSDK);
            }
            monetizationNetwork = getMonetizationNetwork(aFh1dSDK);
        } else {
            monetizationNetwork = false;
        }
        AFd1vSDK.AFa1ySDK aFa1ySDK = this.component2;
        int i4 = AFLogger;
        if (aFa1ySDK != null) {
            copydefault = (i4 + 73) % NotificationCompat.FLAG_HIGH_PRIORITY;
            aFa1ySDK.onConfigurationChanged(monetizationNetwork);
        } else {
            copydefault = (i4 + pd.h1) % NotificationCompat.FLAG_HIGH_PRIORITY;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0090 A[Catch: all -> 0x01ec, TryCatch #1 {, blocks: (B:3:0x0001, B:5:0x0017, B:7:0x001c, B:9:0x0028, B:12:0x004f, B:14:0x0060, B:16:0x0067, B:18:0x0079, B:27:0x0090, B:29:0x009d, B:31:0x00a5, B:33:0x00a9, B:35:0x00b7, B:37:0x00bd, B:39:0x00c9, B:41:0x00d5, B:43:0x00e1, B:45:0x00ef, B:47:0x00fb, B:49:0x00ff, B:51:0x0105, B:53:0x011b, B:55:0x011e, B:57:0x0124, B:59:0x0134, B:61:0x0138, B:63:0x013e, B:65:0x014e, B:67:0x0152, B:69:0x0158, B:74:0x0170, B:79:0x01c3, B:81:0x01c7, B:83:0x01d7, B:84:0x01e3, B:76:0x018a, B:77:0x01a2, B:72:0x0160, B:52:0x0112, B:25:0x008d, B:78:0x01b3, B:21:0x0088), top: B:95:0x0001, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00c9 A[Catch: all -> 0x01ec, TryCatch #1 {, blocks: (B:3:0x0001, B:5:0x0017, B:7:0x001c, B:9:0x0028, B:12:0x004f, B:14:0x0060, B:16:0x0067, B:18:0x0079, B:27:0x0090, B:29:0x009d, B:31:0x00a5, B:33:0x00a9, B:35:0x00b7, B:37:0x00bd, B:39:0x00c9, B:41:0x00d5, B:43:0x00e1, B:45:0x00ef, B:47:0x00fb, B:49:0x00ff, B:51:0x0105, B:53:0x011b, B:55:0x011e, B:57:0x0124, B:59:0x0134, B:61:0x0138, B:63:0x013e, B:65:0x014e, B:67:0x0152, B:69:0x0158, B:74:0x0170, B:79:0x01c3, B:81:0x01c7, B:83:0x01d7, B:84:0x01e3, B:76:0x018a, B:77:0x01a2, B:72:0x0160, B:52:0x0112, B:25:0x008d, B:78:0x01b3, B:21:0x0088), top: B:95:0x0001, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0123  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final synchronized void copydefault() {
        /*
            Method dump skipped, instructions count: 494
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFd1uSDK.copydefault():void");
    }

    private final void equals() {
        AFh1dSDK aFh1dSDK;
        int i = copydefault + 119;
        AFLogger = i % NotificationCompat.FLAG_HIGH_PRIORITY;
        if (i % 2 == 0) {
            aFh1dSDK = (AFh1dSDK) getMediationNetwork(new Object[]{this}, 855295870, -855295867, System.identityHashCode(this));
            int i2 = 59 / 0;
            if (aFh1dSDK == null) {
                return;
            }
        } else {
            aFh1dSDK = (AFh1dSDK) getMediationNetwork(new Object[]{this}, 855295870, -855295867, System.identityHashCode(this));
            if (aFh1dSDK == null) {
                return;
            }
        }
        if (!getCurrencyIso4217Code(aFh1dSDK)) {
            AFg1gSDK.v$default(AFLogger.INSTANCE, AFg1cSDK.EXCEPTION_MANAGER, "skipping", false, 4, null);
            return;
        }
        int i3 = AFLogger + 33;
        copydefault = i3 % NotificationCompat.FLAG_HIGH_PRIORITY;
        if (i3 % 2 != 0) {
            component4().getMediationNetwork();
            throw null;
        }
        String mediationNetwork = component4().getMediationNetwork();
        if (mediationNetwork != null) {
            getCurrencyIso4217Code(new JSONObject((Map) getMediationNetwork(new Object[]{AFAdRevenueData(aFh1dSDK), getRevenue().getMediationNetwork()}, -1072478634, 1072478634, (int) System.currentTimeMillis())).toString(), mediationNetwork);
        }
    }

    public static final /* synthetic */ AFc1dSDK getCurrencyIso4217Code(AFd1uSDK aFd1uSDK) {
        int i = AFLogger + 117;
        int i2 = i % NotificationCompat.FLAG_HIGH_PRIORITY;
        copydefault = i2;
        int i3 = i % 2;
        AFc1dSDK aFc1dSDK = aFd1uSDK.getMediationNetwork;
        if (i3 != 0) {
            throw null;
        }
        AFLogger = (i2 + 47) % NotificationCompat.FLAG_HIGH_PRIORITY;
        return aFc1dSDK;
    }

    private static /* synthetic */ Object getCurrencyIso4217Code(Object[] objArr) {
        AFd1uSDK aFd1uSDK = (AFd1uSDK) objArr[0];
        copydefault = (AFLogger + 43) % NotificationCompat.FLAG_HIGH_PRIORITY;
        aFd1uSDK.equals();
        int i = copydefault + 69;
        AFLogger = i % NotificationCompat.FLAG_HIGH_PRIORITY;
        if (i % 2 == 0) {
            int i2 = 22 / 0;
        }
        return null;
    }

    private final void getCurrencyIso4217Code(String str, String str2) {
        AFLogger = (copydefault + 53) % NotificationCompat.FLAG_HIGH_PRIORITY;
        ((AFd1xSDK) getMediationNetwork(new Object[]{this}, -704520981, 704520985, System.identityHashCode(this))).getMediationNetwork(str.getBytes(Charsets.UTF_8), Collections.singletonMap("Authorization", AFj1cSDK.getRevenue(str, str2)), 2000);
        int i = copydefault + 95;
        AFLogger = i % NotificationCompat.FLAG_HIGH_PRIORITY;
        if (i % 2 == 0) {
            int i2 = 81 / 0;
        }
    }

    private final boolean getCurrencyIso4217Code(AFh1dSDK aFh1dSDK) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        long currencyIso4217Code = component2().getCurrencyIso4217Code("af_send_exc_to_server_window", -1L);
        if (aFh1dSDK.getMediationNetwork < jCurrentTimeMillis / 1000) {
            return false;
        }
        if (currencyIso4217Code != -1) {
            copydefault = (AFLogger + 27) % NotificationCompat.FLAG_HIGH_PRIORITY;
            if (currencyIso4217Code >= jCurrentTimeMillis) {
                int iAFAdRevenueData = component2().AFAdRevenueData("af_send_exc_min", -1);
                if (iAFAdRevenueData == -1 || getRevenue().getCurrencyIso4217Code() < iAFAdRevenueData) {
                    return false;
                }
                return getMediationNetwork(aFh1dSDK);
            }
        }
        copydefault = (AFLogger + 13) % NotificationCompat.FLAG_HIGH_PRIORITY;
        return false;
    }

    private final AFc1pSDK getMediationNetwork() {
        copydefault = (AFLogger + 87) % NotificationCompat.FLAG_HIGH_PRIORITY;
        AFc1pSDK aFc1pSDK = (AFc1pSDK) this.getMonetizationNetwork.getValue();
        AFLogger = (copydefault + 59) % NotificationCompat.FLAG_HIGH_PRIORITY;
        return aFc1pSDK;
    }

    public static Object getMediationNetwork(Object[] objArr, int i, int i2, int i3) {
        int i4 = (i2 * (-344)) + (i * (-344));
        int i5 = ~i;
        int i6 = ~i2;
        int i7 = i5 | i6;
        int i8 = ((~(i7 | i3)) * 345) + (((~(i5 | (~i3))) | (~(i6 | i))) * 345) + (((~i7) | (~(i5 | i3))) * 345) + i4;
        if (i8 == 1) {
            return getCurrencyIso4217Code(objArr);
        }
        if (i8 == 2) {
            return AFAdRevenueData(objArr);
        }
        if (i8 == 3) {
            return getRevenue(objArr);
        }
        if (i8 == 4) {
            AFd1uSDK aFd1uSDK = (AFd1uSDK) objArr[0];
            copydefault = (AFLogger + 59) % NotificationCompat.FLAG_HIGH_PRIORITY;
            AFd1xSDK aFd1xSDK = (AFd1xSDK) aFd1uSDK.component3.getValue();
            AFLogger = (copydefault + 5) % NotificationCompat.FLAG_HIGH_PRIORITY;
            return aFd1xSDK;
        }
        Map map = (Map) objArr[0];
        List list = (List) objArr[1];
        int i9 = AFLogger + 43;
        copydefault = i9 % NotificationCompat.FLAG_HIGH_PRIORITY;
        if (i9 % 2 == 0) {
            return rbd.c(new Pair[]{new Pair("deviceInfo", map), new Pair("excs", AFd1tSDK.getCurrencyIso4217Code(list))});
        }
        Pair[] pairArr = new Pair[2];
        pairArr[0] = new Pair("deviceInfo", map);
        pairArr[0] = new Pair("excs", AFd1tSDK.getCurrencyIso4217Code(list));
        return rbd.c(pairArr);
    }

    private static Map<String, Object> getMediationNetwork(Map<String, ? extends Object> map, List<AFc1cSDK> list) {
        return (Map) getMediationNetwork(new Object[]{map, list}, -1072478634, 1072478634, (int) System.currentTimeMillis());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getMediationNetwork(AFd1uSDK aFd1uSDK) {
        copydefault = (AFLogger + 83) % NotificationCompat.FLAG_HIGH_PRIORITY;
        aFd1uSDK.copydefault();
        AFLogger = (copydefault + pd.W0) % NotificationCompat.FLAG_HIGH_PRIORITY;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getMediationNetwork(AFd1uSDK aFd1uSDK, Throwable th, String str) {
        AFh1dSDK aFh1dSDK;
        int i = copydefault + pd.T0;
        AFLogger = i % NotificationCompat.FLAG_HIGH_PRIORITY;
        if (i % 2 == 0) {
            aFh1dSDK = (AFh1dSDK) getMediationNetwork(new Object[]{aFd1uSDK}, 855295870, -855295867, System.identityHashCode(aFd1uSDK));
            int i2 = 90 / 0;
            if (aFh1dSDK == null) {
                return;
            }
        } else {
            aFh1dSDK = (AFh1dSDK) getMediationNetwork(new Object[]{aFd1uSDK}, 855295870, -855295867, System.identityHashCode(aFd1uSDK));
            if (aFh1dSDK == null) {
                return;
            }
        }
        if (aFd1uSDK.getMonetizationNetwork(aFh1dSDK)) {
            aFd1uSDK.getRevenue().AFAdRevenueData(th, str);
            AFLogger = (copydefault + 91) % NotificationCompat.FLAG_HIGH_PRIORITY;
        }
    }

    private final boolean getMediationNetwork(AFh1dSDK aFh1dSDK) {
        new AFd1sSDK();
        boolean mediationNetwork = AFd1sSDK.getMediationNetwork(this.component1, aFh1dSDK.getRevenue);
        AFLogger = (copydefault + 79) % NotificationCompat.FLAG_HIGH_PRIORITY;
        return mediationNetwork;
    }

    private final AFf1oSDK getMonetizationNetwork() {
        AFLogger = (copydefault + 99) % NotificationCompat.FLAG_HIGH_PRIORITY;
        AFf1oSDK aFf1oSDK = (AFf1oSDK) this.AFAdRevenueData.getValue();
        copydefault = (AFLogger + 11) % NotificationCompat.FLAG_HIGH_PRIORITY;
        return aFf1oSDK;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getMonetizationNetwork(AFd1uSDK aFd1uSDK) {
        AFLogger = (copydefault + 9) % NotificationCompat.FLAG_HIGH_PRIORITY;
        aFd1uSDK.copy();
        AFLogger = (copydefault + 51) % NotificationCompat.FLAG_HIGH_PRIORITY;
    }

    private final boolean getMonetizationNetwork(AFh1dSDK aFh1dSDK) {
        copydefault = (AFLogger + 67) % NotificationCompat.FLAG_HIGH_PRIORITY;
        long jCurrentTimeMillis = System.currentTimeMillis();
        long currencyIso4217Code = component2().getCurrencyIso4217Code("af_send_exc_to_server_window", -1L);
        if (aFh1dSDK.getMediationNetwork < jCurrentTimeMillis / 1000) {
            copydefault = (AFLogger + 25) % NotificationCompat.FLAG_HIGH_PRIORITY;
            return false;
        }
        if (currencyIso4217Code == -1 || currencyIso4217Code < jCurrentTimeMillis) {
            return false;
        }
        return getMediationNetwork(aFh1dSDK);
    }

    private static /* synthetic */ Object getRevenue(Object[] objArr) {
        AFd1uSDK aFd1uSDK = (AFd1uSDK) objArr[0];
        AFLogger = (copydefault + 29) % NotificationCompat.FLAG_HIGH_PRIORITY;
        AFi1wSDK aFi1wSDK = aFd1uSDK.getMonetizationNetwork().getMediationNetwork.getCurrencyIso4217Code;
        if (aFi1wSDK != null) {
            int i = AFLogger + 37;
            copydefault = i % NotificationCompat.FLAG_HIGH_PRIORITY;
            int i2 = i % 2;
            AFh1cSDK aFh1cSDK = aFi1wSDK.getMonetizationNetwork;
            if (i2 != 0) {
                throw null;
            }
            if (aFh1cSDK != null) {
                return aFh1cSDK.getRevenue;
            }
        }
        return null;
    }

    private final void getRevenue(AFh1dSDK aFh1dSDK) {
        int i;
        AFc1qSDK aFc1qSDKComponent2;
        int i2 = copydefault + 115;
        AFLogger = i2 % NotificationCompat.FLAG_HIGH_PRIORITY;
        int i3 = i2 % 2;
        TimeUnit timeUnit = TimeUnit.DAYS;
        if (i3 == 0) {
            i = aFh1dSDK.getCurrencyIso4217Code;
            long jCurrentTimeMillis = System.currentTimeMillis() ^ timeUnit.toMillis(aFh1dSDK.AFAdRevenueData);
            aFc1qSDKComponent2 = component2();
            aFc1qSDKComponent2.getMonetizationNetwork("af_send_exc_to_server_window", jCurrentTimeMillis);
        } else {
            i = aFh1dSDK.getCurrencyIso4217Code;
            long millis = timeUnit.toMillis(aFh1dSDK.AFAdRevenueData) + System.currentTimeMillis();
            aFc1qSDKComponent2 = component2();
            aFc1qSDKComponent2.getMonetizationNetwork("af_send_exc_to_server_window", millis);
        }
        aFc1qSDKComponent2.getMediationNetwork("af_send_exc_min", i);
    }

    @Override // com.appsflyer.internal.AFd1vSDK
    public final void AFAdRevenueData() {
        int i = copydefault + 61;
        AFLogger = i % NotificationCompat.FLAG_HIGH_PRIORITY;
        if (i % 2 == 0) {
            areAllFieldsValid().execute(new l(this, (byte) 0));
            throw null;
        }
        areAllFieldsValid().execute(new l(this, (byte) 0));
        copydefault = (AFLogger + 81) % NotificationCompat.FLAG_HIGH_PRIORITY;
    }

    @Override // com.appsflyer.internal.AFd1vSDK
    public final void AFAdRevenueData(AFd1vSDK.AFa1ySDK aFa1ySDK) {
        int i = AFLogger + 21;
        copydefault = i % NotificationCompat.FLAG_HIGH_PRIORITY;
        int i2 = i % 2;
        this.component2 = aFa1ySDK;
        ExecutorService executorServiceAreAllFieldsValid = areAllFieldsValid();
        if (i2 == 0) {
            executorServiceAreAllFieldsValid.execute(new l(this, (byte) 1));
        } else {
            executorServiceAreAllFieldsValid.execute(new l(this, (byte) 1));
            throw null;
        }
    }

    @Override // com.appsflyer.internal.AFd1vSDK
    public final void getCurrencyIso4217Code() {
        getMediationNetwork(new Object[]{this}, 58037992, -58037990, System.identityHashCode(this));
    }

    @Override // com.appsflyer.internal.AFd1vSDK
    public final void getMediationNetwork(@NotNull Throwable th, @NotNull String str) {
        copydefault = (AFLogger + 75) % NotificationCompat.FLAG_HIGH_PRIORITY;
        areAllFieldsValid().execute(new d(this, th, str, (byte) 1));
        AFLogger = (copydefault + 53) % NotificationCompat.FLAG_HIGH_PRIORITY;
    }

    @NotNull
    public final AFc1aSDK getRevenue() {
        int i = copydefault + 41;
        AFLogger = i % NotificationCompat.FLAG_HIGH_PRIORITY;
        int i2 = i % 2;
        AFc1aSDK aFc1aSDK = (AFc1aSDK) this.component4.getValue();
        if (i2 != 0) {
            return aFc1aSDK;
        }
        throw null;
    }
}
