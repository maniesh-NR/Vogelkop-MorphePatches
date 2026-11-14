package com.leanplum.internal;

import androidx.annotation.NonNull;
import com.leanplum.internal.Constants;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public class CountAggregator {
    private Set<String> enabledCounters = new HashSet();
    private final Map<String, Integer> counts = new HashMap();

    public Map<String, Integer> getAndClearCounts() {
        HashMap map = new HashMap();
        map.putAll(this.counts);
        this.counts.clear();
        return map;
    }

    public Map<String, Integer> getCounts() {
        return this.counts;
    }

    public void incrementCount(@NonNull String str) {
        incrementCount(str, 1);
    }

    public void incrementCount(@NonNull String str, int i) {
        if (this.enabledCounters.contains(str)) {
            this.counts.put(str, Integer.valueOf((this.counts.containsKey(str) ? this.counts.get(str) : 0).intValue() + i));
        }
    }

    public Map<String, Object> makeParams(@NonNull String str, int i) {
        HashMap map = new HashMap();
        map.put(Constants.Params.TYPE, Constants.Values.SDK_COUNT);
        map.put(Constants.Params.NAME, str);
        map.put(Constants.Params.COUNT, Integer.valueOf(i));
        return map;
    }

    public void sendAllCounts() {
        for (Map.Entry<String, Integer> entry : getAndClearCounts().entrySet()) {
            try {
                RequestSender.getInstance().send(RequestBuilder.withLogAction().andParams(makeParams(entry.getKey(), entry.getValue().intValue())).create());
            } catch (Throwable unused) {
            }
        }
    }

    public void setEnabledCounters(Set<String> set) {
        this.enabledCounters = set;
    }
}
