package com.leanplum.internal;

import androidx.annotation.NonNull;
import com.leanplum.internal.Constants;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public class RequestBatchFactory {
    static final int MAX_EVENTS_PER_API_CALL = 10000;
    private final RequestUuidHelper uuidHelper = new RequestUuidHelper();

    public RequestBatch createErrorBatch(List<Map<String, Object>> list) {
        ArrayList arrayList = new ArrayList();
        this.uuidHelper.attachNewUuid(list);
        return new RequestBatch(arrayList, arrayList, jsonEncodeRequests(arrayList));
    }

    public RequestBatch createNextBatch() {
        return createNextBatch(1.0d);
    }

    public RequestBatch createNextBatch(double d) {
        List<Map<String, Object>> unsentRequests;
        List<Map<String, Object>> listRemoveIrrelevantBackgroundStartRequests;
        try {
            if (d < 0.01d) {
                unsentRequests = new ArrayList<>(0);
                listRemoveIrrelevantBackgroundStartRequests = new ArrayList<>(0);
            } else {
                unsentRequests = getUnsentRequests(d);
                listRemoveIrrelevantBackgroundStartRequests = removeIrrelevantBackgroundStartRequests(unsentRequests);
            }
            return new RequestBatch(unsentRequests, listRemoveIrrelevantBackgroundStartRequests, jsonEncodeRequests(listRemoveIrrelevantBackgroundStartRequests));
        } catch (OutOfMemoryError unused) {
            return createNextBatch(d * 0.5d);
        }
    }

    public void deleteFinishedBatch(@NonNull RequestBatch requestBatch) {
        int eventsCount = requestBatch.getEventsCount();
        if (eventsCount == 0) {
            return;
        }
        LeanplumEventDataManager.sharedInstance().deleteEvents(eventsCount);
    }

    public List<Map<String, Object>> getUnsentRequests(double d) {
        List<Map<String, Object>> events = LeanplumEventDataManager.sharedInstance().getEvents((int) (MAX_EVENTS_PER_API_CALL * d));
        this.uuidHelper.deleteUuid();
        if (d < 1.0d) {
            this.uuidHelper.attachNewUuid(events);
        }
        return events;
    }

    public String jsonEncodeRequests(List<Map<String, Object>> list) {
        HashMap map = new HashMap();
        map.put(Constants.Params.DATA, list);
        return JsonConverter.toJson(map);
    }

    public List<Map<String, Object>> removeIrrelevantBackgroundStartRequests(List<Map<String, Object>> list) {
        ArrayList arrayList = new ArrayList();
        int size = list.size();
        if (size > 0) {
            for (int i = 0; i < size; i++) {
                Map<String, Object> map = list.get(i);
                if (i >= size - 1 || !RequestBuilder.ACTION_START.equals(list.get(i + 1).get("action")) || !RequestBuilder.ACTION_START.equals(map.get("action")) || !"true".equals(map.get(Constants.Params.BACKGROUND))) {
                    arrayList.add(map);
                }
            }
        }
        return arrayList;
    }
}
