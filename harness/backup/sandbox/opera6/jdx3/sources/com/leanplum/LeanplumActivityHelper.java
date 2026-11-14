package com.leanplum;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.leanplum.DeferredActivitiesStrategy;
import com.leanplum.annotations.Parser;
import com.leanplum.callbacks.PostponableAction;
import com.leanplum.internal.ActionManager;
import com.leanplum.internal.Constants;
import com.leanplum.internal.LeanplumInternal;
import com.leanplum.internal.Log;
import com.leanplum.internal.OperationQueue;
import com.leanplum.utils.BuildUtil;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

/* loaded from: classes.dex */
public class LeanplumActivityHelper {
    private static Activity currentActivity;
    static boolean isActivityPaused;
    private static boolean registeredCallbacks;
    private final Activity activity;
    private LeanplumInflater inflater;
    private LeanplumResources res;
    private static final Set<Class<? extends Activity>> OVERRIDDEN_ACTIVITIES = new HashSet();

    @NonNull
    private static DeferredActivitiesStrategy deferredActivitiesStrategy = DeferredActivitiesStrategy.BlacklistStrategy.create(new Class[0]);
    private static final Queue<Runnable> pendingActions = new LinkedList();
    private static final Runnable runPendingActionsRunnable = new Runnable() { // from class: com.leanplum.LeanplumActivityHelper.1
        @Override // java.lang.Runnable
        public void run() {
            LeanplumActivityHelper.runPendingActions();
        }
    };

    static class DefaultLifecycleCallbacksHandler implements Application.ActivityLifecycleCallbacks {

        @NonNull
        private final Application.ActivityLifecycleCallbacks callback;

        public DefaultLifecycleCallbacksHandler(@NonNull Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
            this.callback = activityLifecycleCallbacks;
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(@NonNull Activity activity, @Nullable Bundle bundle) {
            if (LeanplumActivityHelper.isLifecycleCallbacksOverridden(activity)) {
                return;
            }
            this.callback.onActivityCreated(activity, bundle);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(@NonNull Activity activity) {
            if (LeanplumActivityHelper.isLifecycleCallbacksOverridden(activity)) {
                return;
            }
            this.callback.onActivityDestroyed(activity);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
            if (LeanplumActivityHelper.isLifecycleCallbacksOverridden(activity)) {
                return;
            }
            this.callback.onActivityPaused(activity);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
            if (LeanplumActivityHelper.isLifecycleCallbacksOverridden(activity)) {
                return;
            }
            this.callback.onActivityResumed(activity);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(@NonNull Activity activity, @NonNull Bundle bundle) {
            if (LeanplumActivityHelper.isLifecycleCallbacksOverridden(activity)) {
                return;
            }
            this.callback.onActivitySaveInstanceState(activity, bundle);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(@NonNull Activity activity) {
            if (LeanplumActivityHelper.isLifecycleCallbacksOverridden(activity)) {
                return;
            }
            this.callback.onActivityStarted(activity);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
            if (LeanplumActivityHelper.isLifecycleCallbacksOverridden(activity)) {
                return;
            }
            this.callback.onActivityStopped(activity);
        }
    }

    static class LeanplumLifecycleCallbacks implements Application.ActivityLifecycleCallbacks {
        private final boolean mHandlePayloadOnResume;

        public LeanplumLifecycleCallbacks(boolean z) {
            this.mHandlePayloadOnResume = z;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: handleNotificationPayload, reason: merged with bridge method [inline-methods] */
        public void lambda$onActivityResumed$0(Bundle bundle) {
            try {
                String str = LeanplumPushService.LEANPLUM_SENDER_ID;
                LeanplumPushService.class.getDeclaredMethod("onActivityNotificationClick", Bundle.class).invoke(null, bundle);
            } catch (Throwable th) {
                Log.e("Push Notification action not run. Did you forget leanplum-push module?", th);
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
            try {
                LeanplumActivityHelper.onPause(activity);
            } catch (Throwable th) {
                Log.exception(th);
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
            final Bundle extras;
            try {
                LeanplumActivityHelper.onResume(activity);
                if (Leanplum.isScreenTrackingEnabled()) {
                    Leanplum.advanceTo(activity.getLocalClassName());
                }
            } catch (Throwable th) {
                Log.exception(th);
            }
            if (!this.mHandlePayloadOnResume || activity.getIntent() == null || (extras = activity.getIntent().getExtras()) == null || !extras.containsKey(Constants.Keys.PUSH_MESSAGE_TEXT)) {
                return;
            }
            OperationQueue.sharedInstance().addParallelOperation(new Runnable() { // from class: com.leanplum.a
                @Override // java.lang.Runnable
                public final void run() {
                    this.a.lambda$onActivityResumed$0(extras);
                }
            });
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
            try {
                LeanplumActivityHelper.onStop(activity);
            } catch (Throwable th) {
                Log.exception(th);
            }
        }
    }

    public LeanplumActivityHelper(Activity activity) {
        this.activity = activity;
        Leanplum.setApplicationContext(activity.getApplicationContext());
        Parser.parseVariables(activity);
    }

    public static void deferMessagesForActivities(Class... clsArr) {
        if (clsArr == null || clsArr.length == 0) {
            return;
        }
        deferredActivitiesStrategy = DeferredActivitiesStrategy.BlacklistStrategy.create(clsArr);
    }

    public static void enableLifecycleCallbacks(Application application) {
        Leanplum.setApplicationContext(application.getApplicationContext());
        application.registerActivityLifecycleCallbacks(new DefaultLifecycleCallbacksHandler(new LeanplumLifecycleCallbacks(BuildUtil.shouldDisableTrampolines(application))));
        registeredCallbacks = true;
        LeanplumInternal.addStartIssuedHandler(runPendingActionsRunnable);
    }

    public static Activity getCurrentActivity() {
        return currentActivity;
    }

    private static boolean isActivityClassIgnored(Activity activity) {
        return deferredActivitiesStrategy.isActivityClassIgnored(activity.getClass());
    }

    public static boolean isActivityPaused() {
        return isActivityPaused;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean isLifecycleCallbacksOverridden(Activity activity) {
        return OVERRIDDEN_ACTIVITIES.contains(activity.getClass());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void onPause(Activity activity) {
        isActivityPaused = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void onResume(Activity activity) {
        isActivityPaused = false;
        currentActivity = activity;
        if (LeanplumInternal.isPaused() || LeanplumInternal.hasStartedInBackground()) {
            Leanplum.resume();
            LocationManager locationManager = ActionManager.getLocationManager();
            if (locationManager != null) {
                locationManager.updateGeofencing();
                locationManager.updateUserLocation();
            }
        }
        LeanplumInternal.addStartIssuedHandler(runPendingActionsRunnable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void onStop(Activity activity) {
        if (isActivityPaused) {
            Leanplum.pause();
            LocationManager locationManager = ActionManager.getLocationManager();
            if (locationManager != null) {
                locationManager.updateGeofencing();
            }
        }
        Activity activity2 = currentActivity;
        if (activity2 == null || !activity2.equals(activity)) {
            return;
        }
        currentActivity = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void overrideLifecycleCallbacksProvider(Activity activity, ActivityLifecycleCallbacksProvider activityLifecycleCallbacksProvider) {
        OVERRIDDEN_ACTIVITIES.add(activity.getClass());
        activityLifecycleCallbacksProvider.registerLifecycleCallbacks(new LeanplumLifecycleCallbacks(BuildUtil.shouldDisableTrampolines(activity.getApplicationContext())));
    }

    public static void queueActionUponActive(Runnable runnable) {
        try {
            Activity activity = currentActivity;
            if (activity != null && !activity.isFinishing() && !isActivityPaused && (!(runnable instanceof PostponableAction) || !isActivityClassIgnored(currentActivity))) {
                runnable.run();
                return;
            }
            Queue<Runnable> queue = pendingActions;
            synchronized (queue) {
                queue.add(runnable);
            }
        } catch (Throwable th) {
            Log.exception(th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void runPendingActions() {
        LinkedList<Runnable> linkedList;
        if (isActivityPaused || currentActivity == null) {
            return;
        }
        Queue<Runnable> queue = pendingActions;
        synchronized (queue) {
            linkedList = new LinkedList(queue);
            queue.clear();
        }
        for (Runnable runnable : linkedList) {
            if ((runnable instanceof PostponableAction) && isActivityClassIgnored(currentActivity)) {
                pendingActions.add(runnable);
            } else {
                runnable.run();
            }
        }
    }

    public static void setCurrentActivity(Context context) {
        if (context instanceof Activity) {
            currentActivity = (Activity) context;
            LeanplumInternal.addStartIssuedHandler(runPendingActionsRunnable);
        }
    }

    public static void setDeferredActivitiesStrategy(@NonNull DeferredActivitiesStrategy deferredActivitiesStrategy2) {
        deferredActivitiesStrategy = deferredActivitiesStrategy2;
    }

    public LeanplumResources getLeanplumResources() {
        return getLeanplumResources(null);
    }

    public LeanplumResources getLeanplumResources(Resources resources) {
        LeanplumResources leanplumResources = this.res;
        if (leanplumResources != null) {
            return leanplumResources;
        }
        if (resources == null) {
            resources = this.activity.getResources();
        }
        if (resources instanceof LeanplumResources) {
            return (LeanplumResources) resources;
        }
        LeanplumResources leanplumResources2 = new LeanplumResources(resources);
        this.res = leanplumResources2;
        return leanplumResources2;
    }

    public void onPause() {
        try {
            if (registeredCallbacks) {
                return;
            }
            onPause(this.activity);
        } catch (Throwable th) {
            Log.exception(th);
        }
    }

    public void onResume() {
        try {
            if (registeredCallbacks) {
                return;
            }
            onResume(this.activity);
        } catch (Throwable th) {
            Log.exception(th);
        }
    }

    public void onStop() {
        try {
            if (registeredCallbacks) {
                return;
            }
            onStop(this.activity);
        } catch (Throwable th) {
            Log.exception(th);
        }
    }

    public void setContentView(int i) {
        LeanplumInflater leanplumInflaterFrom = this.inflater;
        if (leanplumInflaterFrom == null) {
            leanplumInflaterFrom = LeanplumInflater.from(this.activity);
            this.inflater = leanplumInflaterFrom;
        }
        this.activity.setContentView(leanplumInflaterFrom.inflate(i));
    }
}
