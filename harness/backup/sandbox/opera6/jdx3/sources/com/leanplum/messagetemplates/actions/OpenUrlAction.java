package com.leanplum.messagetemplates.actions;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import androidx.annotation.NonNull;
import com.leanplum.ActionArgs;
import com.leanplum.ActionContext;
import com.leanplum.Leanplum;
import com.leanplum.internal.Log;
import com.leanplum.messagetemplates.MessageTemplate;
import com.leanplum.messagetemplates.MessageTemplateConstants;
import java.util.List;

/* loaded from: classes.dex */
public class OpenUrlAction implements MessageTemplate {
    private static final String OPEN_URL = "Open URL";

    private static void openUriIntent(Context context, Intent intent) {
        ActivityInfo activityInfo;
        String str;
        List<ResolveInfo> listQueryIntentActivities = context.getPackageManager().queryIntentActivities(intent, 131072);
        if (!listQueryIntentActivities.isEmpty()) {
            for (ResolveInfo resolveInfo : listQueryIntentActivities) {
                if (resolveInfo != null && (activityInfo = resolveInfo.activityInfo) != null && (str = activityInfo.packageName) != null && str.equals(context.getPackageName())) {
                    intent.setPackage(resolveInfo.activityInfo.packageName);
                }
            }
        }
        try {
            context.startActivity(intent);
        } catch (ActivityNotFoundException e) {
            Log.e("Activity you are trying to start doesn't exist or isn't exported in manifest: " + e, new Object[0]);
        }
    }

    @Override // com.leanplum.messagetemplates.MessageTemplate
    @NonNull
    public ActionArgs createActionArgs(Context context) {
        return new ActionArgs().with(MessageTemplateConstants.Args.URL, MessageTemplateConstants.Values.DEFAULT_URL);
    }

    @Override // com.leanplum.messagetemplates.MessageTemplate
    @NonNull
    public String getName() {
        return "Open URL";
    }

    @Override // com.leanplum.messagetemplates.MessageTemplate
    public void handleAction(ActionContext actionContext) {
        Context context = Leanplum.getContext();
        if (context == null) {
            return;
        }
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(actionContext.stringNamed(MessageTemplateConstants.Args.URL)));
        if (!(context instanceof Activity)) {
            intent.addFlags(268435456);
        }
        openUriIntent(context, intent);
    }
}
