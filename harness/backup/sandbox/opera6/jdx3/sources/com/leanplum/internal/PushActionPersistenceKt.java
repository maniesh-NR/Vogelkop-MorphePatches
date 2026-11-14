package com.leanplum.internal;

import android.content.Context;
import com.leanplum.Leanplum;
import com.leanplum.internal.Constants;
import defpackage.h1a;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000(\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010%\n\u0002\b\u0004\u001a\u001b\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\u0002¢\u0006\u0004\b\u0003\u0010\u0004\u001a#\u0010\u0007\u001a\u00020\u00062\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\u0002¢\u0006\u0004\b\u0007\u0010\b\u001a\u0015\u0010\n\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0001¢\u0006\u0004\b\n\u0010\u000b\u001a\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\u0001¢\u0006\u0004\b\r\u0010\u000e\"\u0014\u0010\u000f\u001a\u00020\u00018\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010\"'\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0004¨\u0006\u0015"}, d2 = {"", "", "", "load", "()Ljava/util/Map;", "records", "", "save", "(Ljava/util/Map;)V", Constants.Keys.PUSH_METRIC_OCCURRENCE_ID, "recordOpenAction", "(Ljava/lang/String;)V", "", "isOpened", "(Ljava/lang/String;)Z", "PREF_KEY", "Ljava/lang/String;", "", "records$delegate", "Ll4c;", "getRecords", "AndroidSDKPush_release"}, k = 2, mv = {1, h1a.ERROR_PRIVATE_FIELD_NUMBER, 0}, xi = 48)
/* loaded from: classes.dex */
public final class PushActionPersistenceKt {

    @NotNull
    private static final String PREF_KEY = "__leanplum_push_open_actions";

    @NotNull
    private static final l4c records$delegate = z4c.b(PushActionPersistenceKt$records$2.INSTANCE);

    private static final Map<String, Long> getRecords() {
        return (Map) records$delegate.getValue();
    }

    public static final boolean isOpened(@NotNull String str) {
        return getRecords().containsKey(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Map<String, Long> load() {
        Context context = Leanplum.getContext();
        return context == null ? new LinkedHashMap() : (Map) CollectionUtil.uncheckedCast(JsonConverter.fromJson(context.getSharedPreferences(Constants.Defaults.MESSAGING_PREF_NAME, 0).getString(PREF_KEY, "{}")));
    }

    public static final void recordOpenAction(@NotNull String str) {
        getRecords().put(str, Long.valueOf(Clock.getInstance().currentTimeMillis()));
        save(getRecords());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void save(Map<String, Long> map) {
        Context context = Leanplum.getContext();
        if (context == null) {
            return;
        }
        context.getSharedPreferences(Constants.Defaults.MESSAGING_PREF_NAME, 0).edit().putString(PREF_KEY, JsonConverter.toJson(map)).apply();
    }
}
