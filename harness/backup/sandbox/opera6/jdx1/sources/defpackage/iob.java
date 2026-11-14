package defpackage;

import android.app.Service;
import android.app.job.JobParameters;
import android.app.job.JobWorkItem;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.IBinder;
import java.util.ArrayList;
import java.util.HashMap;

/* loaded from: classes.dex */
public abstract class iob extends Service {
    static final boolean DEBUG = false;
    static final String TAG = "JobIntentService";
    hob mCompatWorkEnqueuer;
    aob mCurProcessor;
    bob mJobImpl;
    static final Object sLock = new Object();
    static final HashMap<ComponentName, hob> sClassWorkEnqueuer = new HashMap<>();
    boolean mInterruptIfStopped = DEBUG;
    boolean mStopped = DEBUG;
    boolean mDestroyed = DEBUG;
    final ArrayList<cob> mCompatQueue = null;

    public static void enqueueWork(Context context, ComponentName componentName, int i, Intent intent) {
        if (intent == null) {
            qp2.o("work must not be null");
            return;
        }
        synchronized (sLock) {
            hob workEnqueuer = getWorkEnqueuer(context, componentName, true, i);
            workEnqueuer.a(i);
            gob gobVar = (gob) workEnqueuer;
            gobVar.d.enqueue(gobVar.c, new JobWorkItem(intent));
        }
    }

    public static void enqueueWork(Context context, Class<?> cls, int i, Intent intent) {
        enqueueWork(context, new ComponentName(context, cls), i, intent);
    }

    public static hob getWorkEnqueuer(Context context, ComponentName componentName, boolean z, int i) {
        HashMap<ComponentName, hob> map = sClassWorkEnqueuer;
        hob hobVar = map.get(componentName);
        if (hobVar != null) {
            return hobVar;
        }
        if (!z) {
            qp2.o("Can't be here without a job id");
            return null;
        }
        gob gobVar = new gob(context, componentName, i);
        map.put(componentName, gobVar);
        return gobVar;
    }

    public dob dequeueWork() {
        bob bobVar = this.mJobImpl;
        if (bobVar == null) {
            synchronized (this.mCompatQueue) {
                if (this.mCompatQueue.size() <= 0) {
                    return null;
                }
                return this.mCompatQueue.remove(0);
            }
        }
        fob fobVar = (fob) bobVar;
        synchronized (fobVar.c) {
            JobParameters jobParameters = (JobParameters) fobVar.d;
            if (jobParameters == null) {
                return null;
            }
            JobWorkItem jobWorkItemDequeueWork = jobParameters.dequeueWork();
            if (jobWorkItemDequeueWork == null) {
                return null;
            }
            jobWorkItemDequeueWork.getIntent().setExtrasClassLoader(((iob) fobVar.b).getClassLoader());
            return new eob(fobVar, jobWorkItemDequeueWork);
        }
    }

    public boolean doStopCurrentWork() {
        aob aobVar = this.mCurProcessor;
        if (aobVar != null) {
            aobVar.cancel(this.mInterruptIfStopped);
        }
        this.mStopped = true;
        return onStopCurrentWork();
    }

    public void ensureProcessorRunningLocked(boolean z) {
        if (this.mCurProcessor == null) {
            aob aobVar = new aob(this);
            this.mCurProcessor = aobVar;
            aobVar.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
        }
    }

    public boolean isStopped() {
        return this.mStopped;
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        bob bobVar = this.mJobImpl;
        if (bobVar != null) {
            return ((fob) bobVar).getBinder();
        }
        return null;
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        this.mJobImpl = new fob(this);
        this.mCompatWorkEnqueuer = null;
    }

    @Override // android.app.Service
    public void onDestroy() {
        super.onDestroy();
        ArrayList<cob> arrayList = this.mCompatQueue;
        if (arrayList != null) {
            synchronized (arrayList) {
                this.mDestroyed = true;
                this.mCompatWorkEnqueuer.getClass();
            }
        }
    }

    public abstract void onHandleWork(Intent intent);

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i, int i2) {
        if (this.mCompatQueue == null) {
            return 2;
        }
        this.mCompatWorkEnqueuer.getClass();
        synchronized (this.mCompatQueue) {
            ArrayList<cob> arrayList = this.mCompatQueue;
            if (intent == null) {
                intent = new Intent();
            }
            arrayList.add(new cob(this, intent, i2));
            ensureProcessorRunningLocked(true);
        }
        return 3;
    }

    public boolean onStopCurrentWork() {
        return true;
    }

    public void processorFinished() {
        ArrayList<cob> arrayList = this.mCompatQueue;
        if (arrayList != null) {
            synchronized (arrayList) {
                this.mCurProcessor = null;
                ArrayList<cob> arrayList2 = this.mCompatQueue;
                if (arrayList2 != null && arrayList2.size() > 0) {
                    ensureProcessorRunningLocked(DEBUG);
                } else if (!this.mDestroyed) {
                    this.mCompatWorkEnqueuer.getClass();
                }
            }
        }
    }

    public void setInterruptIfStopped(boolean z) {
        this.mInterruptIfStopped = z;
    }
}
