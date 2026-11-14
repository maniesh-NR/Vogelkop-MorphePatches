package com.leanplum.internal;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.leanplum.Leanplum;
import com.leanplum.internal.Constants;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/* loaded from: classes.dex */
public class RequestUuidHelper {
    public void attachNewUuid(@NonNull List<Map<String, Object>> list) {
        String string = UUID.randomUUID().toString();
        Iterator<Map<String, Object>> it = list.iterator();
        while (it.hasNext()) {
            it.next().put(Constants.Params.UUID, string);
        }
    }

    public boolean attachUuid(@NonNull Map<String, Object> map) {
        Context context = Leanplum.getContext();
        if (context == null) {
            return false;
        }
        long eventsCount = LeanplumEventDataManager.sharedInstance().getEventsCount();
        String strLoadUuid = loadUuid();
        if (strLoadUuid == null || eventsCount % RequestBatchFactory.MAX_EVENTS_PER_API_CALL == 0) {
            strLoadUuid = saveNewUuid(context);
        }
        map.put(Constants.Params.UUID, strLoadUuid);
        return true;
    }

    public void deleteUuid() {
        Context context = Leanplum.getContext();
        if (context == null) {
            return;
        }
        SharedPreferences.Editor editorEdit = context.getSharedPreferences(Constants.Defaults.LEANPLUM, 0).edit();
        editorEdit.remove(Constants.Defaults.UUID_KEY);
        editorEdit.apply();
    }

    @Nullable
    public String loadUuid() {
        Context context = Leanplum.getContext();
        if (context == null) {
            return null;
        }
        return context.getSharedPreferences(Constants.Defaults.LEANPLUM, 0).getString(Constants.Defaults.UUID_KEY, null);
    }

    @NonNull
    public String saveNewUuid(Context context) {
        String string = UUID.randomUUID().toString();
        SharedPreferences.Editor editorEdit = context.getSharedPreferences(Constants.Defaults.LEANPLUM, 0).edit();
        editorEdit.putString(Constants.Defaults.UUID_KEY, string);
        editorEdit.apply();
        return string;
    }
}
