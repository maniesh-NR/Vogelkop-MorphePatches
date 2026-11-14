package com.leanplum.messagetemplates;

import android.content.Context;
import androidx.annotation.NonNull;
import com.leanplum.ActionArgs;
import com.leanplum.ActionContext;

/* loaded from: classes.dex */
public interface MessageTemplate {
    @NonNull
    ActionArgs createActionArgs(Context context);

    @NonNull
    String getName();

    void handleAction(ActionContext actionContext);

    default boolean waitFilesAndVariables() {
        return false;
    }
}
