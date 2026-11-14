package com.leanplum.messagetemplates;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.SystemClock;
import com.appsflyer.internal.j;
import com.google.android.gms.tasks.Task;
import com.leanplum.ActionArgs;
import com.leanplum.ActionContext;
import com.leanplum.Leanplum;
import com.leanplum.LeanplumActivityHelper;
import com.leanplum.callbacks.ActionCallback;
import com.opera.android.BrowserActivity;
import com.opera.android.OperaApplication;
import com.opera.api.Callback;
import defpackage.a87;
import defpackage.b59;
import defpackage.dg0;
import defpackage.e4b;
import defpackage.eg0;
import defpackage.eo0;
import defpackage.f4b;
import defpackage.gg0;
import defpackage.ho0;
import defpackage.hpd;
import defpackage.mcj;
import defpackage.oji;
import defpackage.orm;
import defpackage.pjh;
import defpackage.qe9;
import defpackage.qim;
import defpackage.qjh;
import defpackage.qxh;
import defpackage.rw7;
import defpackage.rxh;
import defpackage.s1i;
import defpackage.s9i;
import defpackage.skm;
import defpackage.sw7;
import defpackage.sxh;
import defpackage.t1i;
import defpackage.tjh;
import defpackage.tw7;
import defpackage.u1i;
import defpackage.u55;
import defpackage.v1i;
import defpackage.vb0;
import defpackage.w1i;
import defpackage.x1i;
import defpackage.x5f;
import defpackage.xbf;
import defpackage.xi5;
import defpackage.y1i;
import defpackage.zx;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001:\u0001.B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ?\u0010\u0013\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J9\u0010\u001c\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0012\u001a\u00020\u00112\u0018\u0010\u001b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u001a0\u00180\u0017H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJG\u0010!\u001a\u00020\u00062\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010 \u001a\u00020\u00192\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b!\u0010\"J\u0013\u0010%\u001a\u00020$*\u00020#H\u0002¢\u0006\u0004\b%\u0010&R\u0014\u0010(\u001a\u00020'8\u0002X\u0082T¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010*\u001a\u00020'8\u0002X\u0082T¢\u0006\u0006\n\u0004\b*\u0010)R\u0014\u0010,\u001a\u00020+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-¨\u0006/"}, d2 = {"Lcom/leanplum/messagetemplates/OperaRateSheet;", "", "<init>", "()V", "Lorm;", "usageReporter", "", "register", "(Lorm;)V", "Landroid/app/Activity;", "activity", "Lqjh;", "rateFlowStarter", "Lcom/leanplum/ActionContext;", "actionContext", "Lskm;", "unfilteredUsageReporter", "Lu55;", "clock", "initiateRateSheet", "(Landroid/app/Activity;Lqjh;Lcom/leanplum/ActionContext;Lorm;Lskm;Lu55;)V", "La2i;", "reviewManager", "Lcom/opera/api/Callback;", "Ltw7;", "Lcom/leanplum/messagetemplates/OperaRateSheet$TimedReviewInfo;", "Lx1i;", "callback", "requestReviewInfo", "(La2i;Lu55;Lcom/opera/api/Callback;)V", "Landroid/content/Context;", "context", "reviewInfo", "onReviewInfo", "(Landroid/content/Context;Lcom/leanplum/ActionContext;Lqjh;La2i;Lcom/leanplum/messagetemplates/OperaRateSheet$TimedReviewInfo;Lorm;Lskm;)V", "Leo0;", "Lvb0;", "toDialogAction", "(Leo0;)Lvb0;", "", "NAME", "Ljava/lang/String;", "TAG", "Lpn7;", "REVIEW_INFO_FETCH_TIMEOUT", "J", "TimedReviewInfo", "app"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes.dex */
public final class OperaRateSheet {
    public static final int $stable = 0;

    @NotNull
    public static final OperaRateSheet INSTANCE = new OperaRateSheet();

    @NotNull
    private static final String NAME = "Rate Dialog";
    private static final long REVIEW_INFO_FETCH_TIMEOUT;

    @NotNull
    private static final String TAG = "OperaRateSheet";

    /* JADX INFO: Access modifiers changed from: private */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0082\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\t\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ$\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001c\u001a\u0004\b\u001d\u0010\u000e¨\u0006\u001e"}, d2 = {"Lcom/leanplum/messagetemplates/OperaRateSheet$TimedReviewInfo;", "", "Lz1i;", "reviewInfo", "Lpn7;", "fetchTime", "<init>", "(Lz1i;JLkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "toString", "()Ljava/lang/String;", "component1", "()Lz1i;", "component2-UwyO8pc", "()J", "component2", "copy-HG0u8IE", "(Lz1i;J)Lcom/leanplum/messagetemplates/OperaRateSheet$TimedReviewInfo;", "copy", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lz1i;", "getReviewInfo", "J", "getFetchTime-UwyO8pc", "app"}, k = 1, mv = {2, 4, 0}, xi = 48)
    static final /* data */ class TimedReviewInfo {
        private final long fetchTime;

        @NotNull
        private final z1i reviewInfo;

        private TimedReviewInfo(z1i z1iVar, long j) {
            this.reviewInfo = z1iVar;
            this.fetchTime = j;
        }

        public /* synthetic */ TimedReviewInfo(z1i z1iVar, long j, DefaultConstructorMarker defaultConstructorMarker) {
            this(z1iVar, j);
        }

        /* renamed from: copy-HG0u8IE$default, reason: not valid java name */
        public static /* synthetic */ TimedReviewInfo m4copyHG0u8IE$default(TimedReviewInfo timedReviewInfo, z1i z1iVar, long j, int i, Object obj) {
            if ((i & 1) != 0) {
                z1iVar = timedReviewInfo.reviewInfo;
            }
            if ((i & 2) != 0) {
                j = timedReviewInfo.fetchTime;
            }
            return timedReviewInfo.m6copyHG0u8IE(z1iVar, j);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final z1i getReviewInfo() {
            return this.reviewInfo;
        }

        /* renamed from: component2-UwyO8pc, reason: not valid java name and from getter */
        public final long getFetchTime() {
            return this.fetchTime;
        }

        @NotNull
        /* renamed from: copy-HG0u8IE, reason: not valid java name */
        public final TimedReviewInfo m6copyHG0u8IE(@NotNull z1i reviewInfo, long fetchTime) {
            return new TimedReviewInfo(reviewInfo, fetchTime, null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof TimedReviewInfo)) {
                return false;
            }
            TimedReviewInfo timedReviewInfo = (TimedReviewInfo) other;
            return Intrinsics.a(this.reviewInfo, timedReviewInfo.reviewInfo) && pn7.e(this.fetchTime, timedReviewInfo.fetchTime);
        }

        /* renamed from: getFetchTime-UwyO8pc, reason: not valid java name */
        public final long m7getFetchTimeUwyO8pc() {
            return this.fetchTime;
        }

        @NotNull
        public final z1i getReviewInfo() {
            return this.reviewInfo;
        }

        public int hashCode() {
            int iHashCode = this.reviewInfo.hashCode() * 31;
            long j = this.fetchTime;
            on7 on7Var = pn7.b;
            return Long.hashCode(j) + iHashCode;
        }

        @NotNull
        public final String toString() {
            return "";
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/leanplum/messagetemplates/OperaRateSheet$register$1", "Lcom/leanplum/callbacks/ActionCallback;", "onResponse", "", "actionContext", "Lcom/leanplum/ActionContext;", "app"}, k = 1, mv = {2, 4, 0}, xi = 48)
    /* renamed from: com.leanplum.messagetemplates.OperaRateSheet$register$1, reason: invalid class name */
    public static final class AnonymousClass1 extends ActionCallback {
        final /* synthetic */ orm $usageReporter;

        public AnonymousClass1(orm ormVar) {
            this.$usageReporter = ormVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Multi-variable type inference failed */
        public static final void onResponse$lambda$0(orm ormVar, ActionContext actionContext) {
            String str;
            Activity currentActivity = LeanplumActivityHelper.getCurrentActivity();
            eg0 eg0Var = eg0.f;
            if (currentActivity == 0 || !(currentActivity instanceof BrowserActivity)) {
                ((x5f) ormVar).p0("Invalid activity", eg0Var, actionContext.getMessageId());
                return;
            }
            String[] strArr = OperaApplication.K;
            OperaApplication operaApplication = (OperaApplication) currentActivity.getApplication();
            if (((f4b) operaApplication.r.S.get()).b()) {
                OperaRateSheet.INSTANCE.initiateRateSheet(currentActivity, (qjh) ((BrowserActivity) currentActivity).y.Z.get(), actionContext, operaApplication.L().c, operaApplication.L().d, u55.Ro);
                return;
            }
            f4b f4bVar = (f4b) operaApplication.r.S.get();
            if (!((Boolean) f4bVar.a.invoke()).booleanValue()) {
                e4b[] e4bVarArr = e4b.a;
                str = "Rating isn't supported for this build";
            } else if (!((Boolean) f4bVar.b.invoke()).booleanValue()) {
                e4b[] e4bVarArr2 = e4b.a;
                str = "Rate dialog hasn't been show yet";
            } else if (((Boolean) f4bVar.d.invoke()).booleanValue()) {
                e4b[] e4bVarArr3 = e4b.a;
                str = "User has already rated";
            } else if (f4bVar.a()) {
                e4b[] e4bVarArr4 = e4b.a;
                str = "Not enough time has passed since rate dialog was shown";
            } else {
                str = "";
            }
            ((x5f) ormVar).p0(str, eg0Var, actionContext.getMessageId());
        }

        @Override // com.leanplum.callbacks.ActionCallback
        public boolean onResponse(ActionContext actionContext) {
            LeanplumActivityHelper.queueActionUponActive(new hpd(this.$usageReporter, actionContext, (byte) 28));
            return true;
        }
    }

    static {
        on7 on7Var = pn7.b;
        REVIEW_INFO_FETCH_TIMEOUT = cs5.x0(3, un7.e);
    }

    private OperaRateSheet() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void initiateRateSheet(Activity activity, qjh rateFlowStarter, ActionContext actionContext, orm usageReporter, skm unfilteredUsageReporter, u55 clock) {
        Context applicationContext = activity.getApplicationContext();
        if (applicationContext == null) {
            applicationContext = activity;
        }
        mcj mcjVar = new mcj(new ctp(applicationContext));
        requestReviewInfo(mcjVar, clock, new qe9(activity, actionContext, rateFlowStarter, mcjVar, usageReporter, unfilteredUsageReporter, (byte) 1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initiateRateSheet$lambda$0(Activity activity, ActionContext actionContext, qjh qjhVar, a2i a2iVar, orm ormVar, skm skmVar, tw7 tw7Var) {
        if (tw7Var instanceof rw7) {
            x1i x1iVar = (x1i) ((rw7) tw7Var).a;
            x5f x5fVar = (x5f) ormVar;
            x5fVar.R(11, x1iVar.a);
            x5fVar.p0("Review error: ".concat(x1iVar.a), eg0.f, actionContext.getMessageId());
            return;
        }
        if (!(tw7Var instanceof sw7)) {
            h9o.p();
        } else {
            INSTANCE.onReviewInfo(activity, actionContext, qjhVar, a2iVar, (TimedReviewInfo) ((sw7) tw7Var).a, ormVar, skmVar);
        }
    }

    private final void onReviewInfo(final Context context, final ActionContext actionContext, qjh rateFlowStarter, a2i reviewManager, final TimedReviewInfo reviewInfo, final orm usageReporter, final skm unfilteredUsageReporter) {
        ((SharedPreferences) tjh.a(context).a.get()).edit().putLong("lastShown", System.currentTimeMillis()).apply();
        a87 a87Var = new a87(new s9i(new sxh(2132020614, new Object[]{new rxh(2132017591)}), new qxh("")), new xbf((byte) 7), (byte) 1);
        a87Var.s0((qim) rateFlowStarter.b.get(), new ai(rateFlowStarter, a87Var, reviewManager, reviewInfo.getReviewInfo(), new Callback() { // from class: com.leanplum.messagetemplates.a
            @Override // com.opera.api.Callback
            public final void run(Object obj) {
                OperaRateSheet.onReviewInfo$lambda$0(context, actionContext, usageReporter, reviewInfo, unfilteredUsageReporter, (pjh) obj);
            }
        }, (byte) 6));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onReviewInfo$lambda$0(Context context, ActionContext actionContext, orm ormVar, TimedReviewInfo timedReviewInfo, skm skmVar, pjh pjhVar) {
        eo0 eo0Var = pjhVar.b;
        eo0 eo0Var2 = pjhVar.b;
        if (eo0Var != eo0.e) {
            j.d((SharedPreferences) tjh.a(context).a.get(), "hasRated", true);
        }
        vb0 dialogAction = INSTANCE.toDialogAction(eo0Var2);
        if (Intrinsics.a(dialogAction, vb0.b)) {
            actionContext.trackMessageEvent(OperaArgs.PRIMARY_ACTION, 0.0d, null, null);
        }
        x5f x5fVar = (x5f) ormVar;
        x5fVar.u0(eo0Var2, pjhVar.a, xi5.a(context).b(), ((SharedPreferences) ((b59) oji.y(context).a).get()).getInt("TOTAL_PAGE_LOADS", 0), true, Long.valueOf(pn7.f(timedReviewInfo.m7getFetchTimeUwyO8pc())), pjhVar.d != null ? Long.valueOf(r13.intValue()) : null, ho0.c);
        ((x5f) skmVar).t0(pjhVar.c);
        x5fVar.Y(gg0.h, dialogAction, 2L, dg0.b, actionContext.getMessageId());
    }

    public static final void register(@NotNull orm usageReporter) {
        Leanplum.defineAction(NAME, 3, new ActionArgs(), new AnonymousClass1(usageReporter));
    }

    private final void requestReviewInfo(a2i reviewManager, u55 clock, Callback callback) {
        ((ulp) clock).getClass();
        ((mcj) reviewManager).k().addOnCompleteListener(new zx(clock, SystemClock.uptimeMillis(), callback));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void requestReviewInfo$lambda$0(u55 u55Var, long j, Callback callback, Task task) {
        ((ulp) u55Var).getClass();
        long jUptimeMillis = SystemClock.uptimeMillis();
        on7 on7Var = pn7.b;
        un7 un7Var = un7.d;
        long jL = pn7.l(cs5.y0(jUptimeMillis, un7Var), cs5.y0(j, un7Var));
        if (pn7.c(jL, REVIEW_INFO_FETCH_TIMEOUT) > 0) {
            callback.run(new rw7(new v1i(z1m.j(pn7.f(jL), "Timeout (", " ms)"))));
            return;
        }
        if (task.isSuccessful()) {
            callback.run(new sw7(new TimedReviewInfo((z1i) task.getResult(), jL, null)));
            return;
        }
        Object exception = task.getException();
        boolean z = exception instanceof y1i;
        Object obj = w1i.b;
        if (z) {
            int iD = ((y1i) exception).d();
            if (iD == -100) {
                obj = s1i.b;
            } else if (iD == -2) {
                obj = t1i.b;
            } else if (iD == -1) {
                obj = u1i.b;
            }
        }
        callback.run(new rw7(obj));
    }

    private final vb0 toDialogAction(eo0 eo0Var) {
        if (Intrinsics.a(eo0Var, eo0.d) || Intrinsics.a(eo0Var, eo0.b)) {
            return vb0.b;
        }
        if (Intrinsics.a(eo0Var, eo0.c)) {
            return vb0.c;
        }
        Intrinsics.a(eo0Var, eo0.e);
        return vb0.d;
    }
}
