package com.appsflyer.internal;

import ads_mobile_sdk.pd;
import android.media.AudioTrack;
import android.view.View;
import androidx.core.app.NotificationCompat;
import com.appsflyer.AFLogger;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u00002\u00020\u0001B+\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0014¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0016\u001a\u0012\u0012\u0004\u0012\u00020\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u0015\u0018\u00010\u0013H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0018\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\fH\u0014¢\u0006\u0004\b\u0018\u0010\u000fJ\u000f\u0010\u001a\u001a\u00020\u0019H\u0014¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0019H\u0014¢\u0006\u0004\b\u001c\u0010\u001bJ\u0017\u0010\u0018\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u001dH\u0014¢\u0006\u0004\b\u0018\u0010\u001eR\u0014\u0010\u0011\u001a\u00020\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010#\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b!\u0010\""}, d2 = {"Lcom/appsflyer/internal/AFf1wSDK;", "Lcom/appsflyer/internal/AFf1uSDK;", "Lcom/appsflyer/internal/AFi1fSDK;", "p0", "Lcom/appsflyer/internal/AFc1pSDK;", "p1", "Lcom/appsflyer/internal/AFc1dSDK;", "p2", "Lcom/appsflyer/internal/AFh1eSDK;", "p3", "<init>", "(Lcom/appsflyer/internal/AFi1fSDK;Lcom/appsflyer/internal/AFc1pSDK;Lcom/appsflyer/internal/AFc1dSDK;Lcom/appsflyer/internal/AFh1eSDK;)V", "Lcom/appsflyer/internal/AFh1rSDK;", "", "areAllFieldsValid", "(Lcom/appsflyer/internal/AFh1rSDK;)V", "", "getMonetizationNetwork", "()J", "", "", "", "copy", "()Ljava/util/Map;", "AFAdRevenueData", "", "copydefault", "()Z", "getMediationNetwork", "", "(I)V", "equals", "Lcom/appsflyer/internal/AFc1pSDK;", "hashCode", "Lcom/appsflyer/internal/AFi1fSDK;", "getRevenue"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AFf1wSDK extends AFf1uSDK {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int AFKeystoreWrapper = 1;
    private static int registerClient;

    /* renamed from: equals, reason: from kotlin metadata */
    @NotNull
    private final AFc1pSDK getMonetizationNetwork;

    /* renamed from: hashCode, reason: from kotlin metadata */
    @NotNull
    private final AFi1fSDK getRevenue;
    private static char[] AFInAppEventParameterName = {10791, 10809, 10763, 10805, 10784, 10788, 10801, 10813, 10802};
    private static char AFLogger = 8141;

    public AFf1wSDK(@NotNull AFi1fSDK aFi1fSDK, @NotNull AFc1pSDK aFc1pSDK, @NotNull AFc1dSDK aFc1dSDK) {
        this(aFi1fSDK, aFc1pSDK, aFc1dSDK, null, 8, null);
    }

    private AFf1wSDK(@NotNull AFi1fSDK aFi1fSDK, @NotNull AFc1pSDK aFc1pSDK, @NotNull AFc1dSDK aFc1dSDK, @NotNull AFh1eSDK aFh1eSDK) {
        super(aFh1eSDK, aFc1dSDK);
        this.getRevenue = aFi1fSDK;
        this.getMonetizationNetwork = aFc1pSDK;
        this.getCurrencyIso4217Code.add(AFe1mSDK.CONVERSION);
    }

    public /* synthetic */ AFf1wSDK(AFi1fSDK aFi1fSDK, AFc1pSDK aFc1pSDK, AFc1dSDK aFc1dSDK, AFh1eSDK aFh1eSDK, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(aFi1fSDK, aFc1pSDK, aFc1dSDK, (i & 8) != 0 ? new AFh1eSDK() : aFh1eSDK);
    }

    private static void a(byte b, String str, int i, Object[] objArr) {
        int i2;
        char[] charArray = str != null ? str.toCharArray() : str;
        AFk1mSDK aFk1mSDK = new AFk1mSDK();
        char[] cArr = AFInAppEventParameterName;
        if (cArr != null) {
            $11 = ($10 + 121) % NotificationCompat.FLAG_HIGH_PRIORITY;
            int length = cArr.length;
            char[] cArr2 = new char[length];
            for (int i3 = 0; i3 < length; i3++) {
                cArr2[i3] = (char) (cArr[i3] ^ (-374623853307093042L));
            }
            cArr = cArr2;
        }
        char c = (char) (AFLogger ^ (-374623853307093042L));
        char[] cArr3 = new char[i];
        if (i % 2 != 0) {
            $10 = ($11 + pd.j1) % NotificationCompat.FLAG_HIGH_PRIORITY;
            i2 = i - 1;
            cArr3[i2] = (char) (charArray[i2] - b);
        } else {
            i2 = i;
        }
        if (i2 > 1) {
            int i4 = $11 + 67;
            $10 = i4 % NotificationCompat.FLAG_HIGH_PRIORITY;
            int i5 = i4 % 2;
            aFk1mSDK.AFAdRevenueData = 0;
            while (true) {
                int i6 = aFk1mSDK.AFAdRevenueData;
                if (i6 >= i2) {
                    break;
                }
                int i7 = $11;
                int i8 = (i7 + 57) % NotificationCompat.FLAG_HIGH_PRIORITY;
                $10 = i8;
                char c2 = charArray[i6];
                aFk1mSDK.getMonetizationNetwork = c2;
                char c3 = charArray[i6 + 1];
                aFk1mSDK.getCurrencyIso4217Code = c3;
                if (c2 == c3) {
                    int i9 = i7 + 81;
                    $10 = i9 % NotificationCompat.FLAG_HIGH_PRIORITY;
                    if (i9 % 2 != 0) {
                        cArr3[i6] = (char) (c2 >>> b);
                        cArr3[i6 >> 1] = (char) (c3 << b);
                    } else {
                        cArr3[i6] = (char) (c2 - b);
                        cArr3[i6 + 1] = (char) (c3 - b);
                    }
                } else {
                    int i10 = c2 / c;
                    aFk1mSDK.getMediationNetwork = i10;
                    int i11 = c2 % c;
                    aFk1mSDK.component1 = i11;
                    int i12 = c3 / c;
                    aFk1mSDK.getRevenue = i12;
                    int i13 = c3 % c;
                    aFk1mSDK.component2 = i13;
                    if (i11 == i13) {
                        int i14 = (i8 + 3) % NotificationCompat.FLAG_HIGH_PRIORITY;
                        $11 = i14;
                        int i15 = ((i10 + c) - 1) % c;
                        aFk1mSDK.getMediationNetwork = i15;
                        int i16 = ((i12 + c) - 1) % c;
                        aFk1mSDK.getRevenue = i16;
                        cArr3[i6] = cArr[(i15 * c) + i11];
                        cArr3[i6 + 1] = cArr[(i16 * c) + i13];
                        $10 = (i14 + 19) % NotificationCompat.FLAG_HIGH_PRIORITY;
                    } else if (i10 == i12) {
                        int i17 = ((i11 + c) - 1) % c;
                        aFk1mSDK.component1 = i17;
                        int i18 = ((i13 + c) - 1) % c;
                        aFk1mSDK.component2 = i18;
                        cArr3[i6] = cArr[(i10 * c) + i17];
                        cArr3[i6 + 1] = cArr[(i12 * c) + i18];
                    } else {
                        cArr3[i6] = cArr[(i10 * c) + i13];
                        cArr3[i6 + 1] = cArr[(i12 * c) + i11];
                    }
                }
                aFk1mSDK.AFAdRevenueData = i6 + 2;
            }
        }
        for (int i19 = 0; i19 < i; i19++) {
            cArr3[i19] = (char) (cArr3[i19] ^ 13722);
        }
        objArr[0] = new String(cArr3);
    }

    private final void areAllFieldsValid(AFh1rSDK p0) {
        try {
            Map<String, ?> map = (Map) getRevenue(new Object[]{this}, -846475554, 846475554, System.identityHashCode(this));
            if (map != null) {
                int i = AFKeystoreWrapper + 97;
                registerClient = i % NotificationCompat.FLAG_HIGH_PRIORITY;
                if (i % 2 != 0) {
                    p0.getMediationNetwork(map);
                    throw null;
                }
                p0.getMediationNetwork(map);
            }
            if (this.getRevenue.AFAdRevenueData()) {
                return;
            }
            registerClient = (AFKeystoreWrapper + 3) % NotificationCompat.FLAG_HIGH_PRIORITY;
            AFf1rSDK.component1(p0).put("pia_disabled", Boolean.TRUE);
        } catch (Throwable th) {
            AFg1gSDK.e$default(AFLogger.INSTANCE, AFg1cSDK.PLAY_INTEGRITY_API, "Error while adding PIA data to payload", th, true, false, false, false, 96, null);
        }
    }

    private final Map<String, Object> copy() {
        return (Map) getRevenue(new Object[]{this}, -846475554, 846475554, System.identityHashCode(this));
    }

    private static /* synthetic */ Object getCurrencyIso4217Code(Object[] objArr) {
        AFf1wSDK aFf1wSDK = (AFf1wSDK) objArr[0];
        registerClient = (AFKeystoreWrapper + 75) % NotificationCompat.FLAG_HIGH_PRIORITY;
        AFi1hSDK currencyIso4217Code = aFf1wSDK.getRevenue.getCurrencyIso4217Code();
        if (currencyIso4217Code == null) {
            return null;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        linkedHashMap2.put("pia_timestamp", Long.valueOf(currencyIso4217Code.AFAdRevenueData));
        linkedHashMap2.put("ttr_millis", Long.valueOf(currencyIso4217Code.getRevenue));
        String str = currencyIso4217Code.getCurrencyIso4217Code;
        if (str != null) {
            int i = AFKeystoreWrapper + 117;
            registerClient = i % NotificationCompat.FLAG_HIGH_PRIORITY;
            int i2 = i % 2;
            linkedHashMap2.put("pia_token", str);
            if (i2 != 0) {
                throw null;
            }
        }
        String str2 = currencyIso4217Code.getMonetizationNetwork;
        if (str2 != null) {
            registerClient = (AFKeystoreWrapper + 55) % NotificationCompat.FLAG_HIGH_PRIORITY;
            linkedHashMap2.put("error_code", str2);
            registerClient = (AFKeystoreWrapper + 19) % NotificationCompat.FLAG_HIGH_PRIORITY;
        }
        linkedHashMap.put("pia", linkedHashMap2);
        return linkedHashMap;
    }

    public static /* synthetic */ Object getRevenue(Object[] objArr, int i, int i2, int i3) {
        return getCurrencyIso4217Code(objArr);
    }

    @Override // com.appsflyer.internal.AFf1uSDK
    public final void AFAdRevenueData(int p0) {
        int i = registerClient + 69;
        AFKeystoreWrapper = i % NotificationCompat.FLAG_HIGH_PRIORITY;
        if (i % 2 == 0) {
            throw null;
        }
    }

    @Override // com.appsflyer.internal.AFf1uSDK, com.appsflyer.internal.AFf1rSDK
    public final void AFAdRevenueData(@NotNull AFh1rSDK p0) {
        Map<String, Object> map = p0.AFAdRevenueData;
        Object[] objArr = new Object[1];
        a((byte) (View.resolveSize(0, 0) + pd.h1), "\u0005\u0006\u0001\u0005\u0001\u0004\u0000\u0003\u0005\u0004\u0002\u0004", 13 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), objArr);
        map.put(((String) objArr[0]).intern(), String.valueOf(new Date().getTime()));
        super.AFAdRevenueData(p0);
        areAllFieldsValid(p0);
        this.toString.getRevenue(p0.AFAdRevenueData, this.getMonetizationNetwork.getMonetizationNetwork.AFAdRevenueData("appsFlyerCount", 0), this.getMonetizationNetwork.getMonetizationNetwork.AFAdRevenueData("appsFlyerInAppEventCount", 0));
        int i = registerClient + pd.l1;
        AFKeystoreWrapper = i % NotificationCompat.FLAG_HIGH_PRIORITY;
        if (i % 2 == 0) {
            throw null;
        }
    }

    @Override // com.appsflyer.internal.AFf1rSDK, com.appsflyer.internal.AFe1dSDK
    public final boolean copydefault() {
        int i = (registerClient + 31) % NotificationCompat.FLAG_HIGH_PRIORITY;
        AFKeystoreWrapper = i;
        registerClient = (i + 67) % NotificationCompat.FLAG_HIGH_PRIORITY;
        return false;
    }

    @Override // com.appsflyer.internal.AFf1uSDK, com.appsflyer.internal.AFe1dSDK, com.appsflyer.internal.AFe1sSDK
    public final boolean getMediationNetwork() {
        registerClient = (AFKeystoreWrapper + 97) % NotificationCompat.FLAG_HIGH_PRIORITY;
        return false;
    }

    @Override // com.appsflyer.internal.AFe1dSDK, com.appsflyer.internal.AFe1sSDK
    public final long getMonetizationNetwork() {
        AFKeystoreWrapper = (registerClient + 85) % NotificationCompat.FLAG_HIGH_PRIORITY;
        return 60000L;
    }
}
