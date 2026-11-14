package ads_mobile_sdk;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class mi0 {
    public final qr0 a;
    public final AtomicReference b = new AtomicReference(wh0.TIER_UNKNOWN);
    public final AtomicReference c = new AtomicReference(yh0.PROCESSOR_TIER_UNKNOWN);
    public final ActivityManager d;

    public mi0(Context context, qr0 qr0Var) {
        this.a = qr0Var;
        this.d = (ActivityManager) context.getSystemService(ActivityManager.class);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.util.ArrayList] */
    public static Object a(long j, List list, List list2, List list3, Enum r7, Enum r8, long j2) {
        if (j <= 0) {
            return r7;
        }
        if (!list.isEmpty()) {
            list2 = new ArrayList(k95.o(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                list2.add(Long.valueOf(((Number) it.next()).intValue()));
            }
        }
        int size = list2.size();
        for (int i = 0; i < size && i < list3.size(); i++) {
            if (j <= ((Number) list2.get(i)).longValue() * j2) {
                return list3.get(i);
            }
        }
        return r8;
    }

    public final xh0 a() {
        qr0 qr0Var = this.a;
        qr0Var.getClass();
        Boolean bool = Boolean.TRUE;
        fo foVar = fo.a;
        if (!((Boolean) qr0Var.a("gads:device_tier_manager:enabled", bool, foVar)).booleanValue() || !((Boolean) qr0Var.a("gads:available_memory_tier:enabled", Boolean.FALSE, foVar)).booleanValue()) {
            return xh0.AVAILABLE_MEMORY_TIER_UNKNOWN;
        }
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        this.d.getMemoryInfo(memoryInfo);
        return (xh0) a(memoryInfo.availMem, (List) qr0Var.a("gads:device_tier:available_memory_thresholds_gb", Arrays.asList(1, 2, 4, 6, 8, 12, 16), fo.a$12), Arrays.asList(1L, 2L, 4L, 6L, 8L, 12L, 16L), Arrays.asList(xh0.AVAILABLE_MEMORY_TIER_EXTREME_LOW, xh0.AVAILABLE_MEMORY_TIER_VERY_LOW, xh0.AVAILABLE_MEMORY_TIER_LOW, xh0.AVAILABLE_MEMORY_TIER_MID, xh0.AVAILABLE_MEMORY_TIER_MID_PLUS, xh0.AVAILABLE_MEMORY_TIER_HIGH, xh0.AVAILABLE_MEMORY_TIER_VERY_HIGH), xh0.AVAILABLE_MEMORY_TIER_INVALID_DATA_SOURCE, xh0.AVAILABLE_MEMORY_TIER_EXTREME_HIGH, 1073741824L);
    }

    public final yh0 a(int i) {
        long j = i;
        qr0 qr0Var = this.a;
        qr0Var.getClass();
        return (yh0) a(j, (List) qr0Var.a("gads:device_tier:available_processor_thresholds", Arrays.asList(2, 4, 6, 8, 10), fo.a$12), Arrays.asList(2L, 4L, 6L, 8L, 10L), Arrays.asList(yh0.PROCESSOR_TIER_EXTREME_LOW, yh0.PROCESSOR_TIER_LOW, yh0.PROCESSOR_TIER_MID, yh0.PROCESSOR_TIER_MID_PLUS, yh0.PROCESSOR_TIER_HIGH), yh0.PROCESSOR_TIER_INVALID_DATA_SOURCE, yh0.PROCESSOR_TIER_EXTREME_HIGH, 1L);
    }

    public final void b() {
        long j;
        qr0 qr0Var = this.a;
        qr0Var.getClass();
        if (((Boolean) qr0Var.a("gads:device_tier_manager:enabled", Boolean.TRUE, fo.a)).booleanValue()) {
            AtomicReference atomicReference = this.b;
            Object obj = atomicReference.get();
            wh0 wh0Var = wh0.TIER_UNKNOWN;
            AtomicReference atomicReference2 = this.c;
            if (obj == wh0Var || atomicReference2.get() == yh0.PROCESSOR_TIER_UNKNOWN) {
                int i = Build.VERSION.SDK_INT;
                ActivityManager activityManager = this.d;
                if (i >= 34) {
                    ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
                    activityManager.getMemoryInfo(memoryInfo);
                    j = memoryInfo.advertisedMem;
                } else {
                    ActivityManager.MemoryInfo memoryInfo2 = new ActivityManager.MemoryInfo();
                    activityManager.getMemoryInfo(memoryInfo2);
                    j = memoryInfo2.totalMem;
                }
                long j2 = j;
                atomicReference.set((wh0) a(j2, (List) qr0Var.a("gads:device_tier:advertised_memory_thresholds_gb", Arrays.asList(1, 2, 4, 6, 8, 12, 16), fo.a$12), Arrays.asList(1L, 2L, 4L, 6L, 8L, 12L, 16L), Arrays.asList(wh0.TIER_EXTREME_LOW, wh0.TIER_VERY_LOW, wh0.TIER_LOW, wh0.TIER_MID, wh0.TIER_MID_PLUS, wh0.TIER_HIGH, wh0.TIER_VERY_HIGH), wh0.TIER_INVALID_DATA_SOURCE, wh0.TIER_EXTREME_HIGH, 1073741824L));
                atomicReference2.set(a(Runtime.getRuntime().availableProcessors()));
            }
        }
    }
}
