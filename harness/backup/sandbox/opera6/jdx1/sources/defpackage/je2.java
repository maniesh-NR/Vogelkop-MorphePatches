package defpackage;

import android.content.Context;
import android.os.AsyncTask;
import android.os.Handler;
import android.os.SystemClock;
import android.text.format.DateUtils;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public abstract class je2 extends wsc {
    private static final boolean DEBUG = false;
    private static final String TAG = "AsyncTaskLoader";
    private volatile ie2 mCancellingTask;
    private Executor mExecutor;
    private Handler mHandler;
    private long mLastLoadCompleteTime;
    private volatile ie2 mTask;
    private long mUpdateThrottle;

    public je2(Context context) {
        super(context);
        this.mLastLoadCompleteTime = -10000L;
    }

    public void cancelLoadInBackground() {
    }

    public void dispatchOnCancelled(ie2 ie2Var, Object obj) {
        onCanceled(obj);
        if (this.mCancellingTask == ie2Var) {
            rollbackContentChanged();
            this.mLastLoadCompleteTime = SystemClock.uptimeMillis();
            this.mCancellingTask = null;
            deliverCancellation();
            executePendingTask();
        }
    }

    public void dispatchOnLoadComplete(ie2 ie2Var, Object obj) {
        if (this.mTask != ie2Var) {
            dispatchOnCancelled(ie2Var, obj);
            return;
        }
        if (isAbandoned()) {
            onCanceled(obj);
            return;
        }
        commitContentChanged();
        this.mLastLoadCompleteTime = SystemClock.uptimeMillis();
        this.mTask = null;
        deliverResult(obj);
    }

    @Override // defpackage.wsc
    @Deprecated
    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        String str2;
        super.dump(str, fileDescriptor, printWriter, strArr);
        if (this.mTask != null) {
            printWriter.print(str);
            printWriter.print("mTask=");
            printWriter.print(this.mTask);
            printWriter.print(" waiting=");
            printWriter.println(this.mTask.e);
        }
        if (this.mCancellingTask != null) {
            printWriter.print(str);
            printWriter.print("mCancellingTask=");
            printWriter.print(this.mCancellingTask);
            printWriter.print(" waiting=");
            printWriter.println(this.mCancellingTask.e);
        }
        if (this.mUpdateThrottle != 0) {
            printWriter.print(str);
            printWriter.print("mUpdateThrottle=");
            printWriter.print(DateUtils.formatElapsedTime(this.mUpdateThrottle / 1000));
            printWriter.print(" mLastLoadCompleteTime=");
            if (this.mLastLoadCompleteTime == -10000) {
                str2 = "--";
            } else {
                str2 = "-" + DateUtils.formatElapsedTime((SystemClock.uptimeMillis() - this.mLastLoadCompleteTime) / 1000);
            }
            printWriter.print(str2);
            printWriter.println();
        }
    }

    public void executePendingTask() {
        if (this.mCancellingTask != null || this.mTask == null) {
            return;
        }
        if (this.mTask.e) {
            this.mTask.e = DEBUG;
            this.mHandler.removeCallbacks(this.mTask);
        }
        if (this.mUpdateThrottle > 0 && SystemClock.uptimeMillis() < this.mLastLoadCompleteTime + this.mUpdateThrottle) {
            this.mTask.e = true;
            this.mHandler.postAtTime(this.mTask, this.mLastLoadCompleteTime + this.mUpdateThrottle);
            return;
        }
        if (this.mExecutor == null) {
            this.mExecutor = getExecutor();
        }
        ie2 ie2Var = this.mTask;
        Executor executor = this.mExecutor;
        if (ie2Var.b == 1) {
            ie2Var.b = 2;
            executor.execute(ie2Var.a);
            return;
        }
        int iA = vep.A(ie2Var.b);
        if (iA == 1) {
            qp2.n("Cannot execute task: the task is already running.");
        } else if (iA != 2) {
            qp2.n("We should never reach this state");
        } else {
            qp2.n("Cannot execute task: the task has already been executed (a task can be executed only once)");
        }
    }

    public Executor getExecutor() {
        return AsyncTask.THREAD_POOL_EXECUTOR;
    }

    public boolean isLoadInBackgroundCanceled() {
        if (this.mCancellingTask != null) {
            return true;
        }
        return DEBUG;
    }

    public abstract Object loadInBackground();

    @Override // defpackage.wsc
    public boolean onCancelLoad() {
        if (this.mTask == null) {
            return DEBUG;
        }
        if (!isStarted()) {
            onContentChanged();
        }
        ie2 ie2Var = this.mCancellingTask;
        ie2 ie2Var2 = this.mTask;
        if (ie2Var != null) {
            if (ie2Var2.e) {
                this.mTask.e = DEBUG;
                this.mHandler.removeCallbacks(this.mTask);
            }
            this.mTask = null;
            return DEBUG;
        }
        boolean z = ie2Var2.e;
        ie2 ie2Var3 = this.mTask;
        if (z) {
            ie2Var3.e = DEBUG;
            this.mHandler.removeCallbacks(this.mTask);
            this.mTask = null;
            return DEBUG;
        }
        ie2Var3.c.set(true);
        boolean zCancel = ie2Var3.a.cancel(DEBUG);
        if (zCancel) {
            this.mCancellingTask = this.mTask;
            cancelLoadInBackground();
        }
        this.mTask = null;
        return zCancel;
    }

    public void onCanceled(Object obj) {
    }

    @Override // defpackage.wsc
    public void onForceLoad() {
        cancelLoad();
        this.mTask = new ie2(this);
        executePendingTask();
    }

    public Object onLoadInBackground() {
        return loadInBackground();
    }

    public void setUpdateThrottle(long j) {
        this.mUpdateThrottle = j;
        if (j != 0) {
            this.mHandler = new Handler();
        }
    }
}
