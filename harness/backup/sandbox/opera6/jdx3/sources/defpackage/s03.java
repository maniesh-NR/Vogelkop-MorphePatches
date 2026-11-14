package defpackage;

import android.app.job.JobParameters;
import android.os.SystemClock;
import android.view.ViewPropertyAnimator;
import com.leanplum.internal.Clock;
import com.opera.android.widget.RecyclerViewEmptyViewSwitcher;
import com.opera.android.widget.ThumbScroller;
import java.util.HashMap;
import org.chromium.components.background_task_scheduler.internal.BackgroundTaskJobService;
import org.chromium.ui.listmenu.ListMenuButton;

/* loaded from: classes.dex */
public final class s03 implements Runnable {
    public final /* synthetic */ byte a;
    public boolean b;
    public final Object c;

    public /* synthetic */ s03(byte b, Object obj, boolean z) {
        this.a = b;
        this.b = z;
        this.c = obj;
    }

    public s03(bi2 bi2Var) {
        this.a = (byte) 1;
        this.c = bi2Var;
        vml.d(this, 100L);
    }

    public /* synthetic */ s03(Object obj, byte b) {
        this.a = b;
        this.c = obj;
    }

    public s03(xt3 xt3Var, bwk bwkVar) {
        this.a = (byte) 6;
        this.c = bwkVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i;
        int iB;
        byte b = this.a;
        String str = null;
        Object obj = this.c;
        switch (b) {
            case 0:
                bx7 bx7Var = (bx7) obj;
                BackgroundTaskJobService backgroundTaskJobService = (BackgroundTaskJobService) bx7Var.b;
                HashMap map = backgroundTaskJobService.b;
                JobParameters jobParameters = (JobParameters) bx7Var.d;
                if (map.get(Integer.valueOf(jobParameters.getJobId())) == ((r03) bx7Var.c)) {
                    backgroundTaskJobService.b.remove(Integer.valueOf(jobParameters.getJobId()));
                    backgroundTaskJobService.jobFinished(jobParameters, this.b);
                    ujp ujpVarL = ujp.l();
                    int jobId = jobParameters.getJobId();
                    long jUptimeMillis = SystemClock.uptimeMillis() - bx7Var.a;
                    int iN = ujp.n(jobId);
                    ujpVarL.getClass();
                    ujp.h(iN, "Android.BackgroundTaskScheduler.TaskFinished2");
                    if (jobId == 1) {
                        str = "Gcm";
                    } else if (jobId == 2) {
                        str = "ComponentUpdate";
                    } else if (jobId == 21) {
                        str = "NotificationService";
                    } else if (jobId == 22) {
                        str = "FeedRefresh";
                    } else if (jobId == 42) {
                        str = "WebviewMinidumpUploading";
                    } else if (jobId == 43) {
                        str = "ChromeMinidumpUploading";
                    } else if (jobId == 77) {
                        str = "OfflinePages";
                    } else if (jobId == 83) {
                        str = "WebviewVariationsSeedFetch";
                    } else if (jobId == 91) {
                        str = "WebApkUpdate";
                    } else if (jobId == 110) {
                        str = "WebviewComponentUpdate";
                    } else if (jobId == 221) {
                        str = "NotificationServicePreUnsubscribe";
                    } else if (jobId == 33656) {
                        str = "Test";
                    } else if (jobId != 71300) {
                        switch (jobId) {
                            case 53:
                                str = "DownloadService";
                                break;
                            case 54:
                                str = "DownloadCleanup";
                                break;
                            case 55:
                                str = "DeprecatedDownloadResumption";
                                break;
                            case 56:
                                str = "DownloadAutoResumption";
                                break;
                            case 57:
                                str = "DownloadLater";
                                break;
                            case 58:
                                str = "DownloadAutoResumptionUnmetered";
                                break;
                            case 59:
                                str = "DownloadAutoResumptionAnyNetwork";
                                break;
                            default:
                                switch (jobId) {
                                    case 102:
                                        str = "BackgroundSyncOneShot";
                                        break;
                                    case 103:
                                        str = "NotificationScheduler";
                                        break;
                                    case 104:
                                        str = "NotificationTrigger";
                                        break;
                                    case 105:
                                        str = "PeriodicBackgroundSyncChromeWakeup";
                                        break;
                                    case 106:
                                        str = "QueryTile";
                                        break;
                                    case 107:
                                        str = "FeedV2Refresh";
                                        break;
                                    default:
                                        switch (jobId) {
                                            case 112:
                                                str = "SafetyHub";
                                                break;
                                            case 113:
                                                str = "AuxiliarySearchDonate";
                                                break;
                                            case 114:
                                                str = "ChromeSignalsReporting";
                                                break;
                                            case 115:
                                                str = "UmaUpload";
                                                break;
                                            case 116:
                                                str = "UkmUpload";
                                                break;
                                            case 117:
                                                str = "DwaUpload";
                                                break;
                                            case 118:
                                                str = "PumaUpload";
                                                break;
                                            case 119:
                                                str = "StructuredMetricsUpload";
                                                break;
                                        }
                                }
                        }
                    } else {
                        str = "Omaha";
                    }
                    ioh.x(jUptimeMillis, 1L, Clock.DAY_MILLIS, sko.j("Android.BackgroundTaskScheduler.TaskFinished.", str), 50);
                    break;
                }
                break;
            case 1:
                if (!this.b) {
                    this.b = true;
                    vml.a(this);
                    ((bi2) obj).run();
                    break;
                }
                break;
            case 2:
                this.b = false;
                ((pg7) obj).a();
                break;
            case 3:
                tn tnVar = (tn) obj;
                if (!this.b) {
                    this.b = true;
                    s03 s03Var = (s03) tnVar.c;
                    if (s03Var != null) {
                        vml.a(s03Var);
                        tnVar.c = null;
                    }
                    if (!tnVar.a) {
                        ((Runnable) tnVar.d).run();
                        break;
                    }
                }
                break;
            case 4:
                ListMenuButton listMenuButton = (ListMenuButton) obj;
                if (!listMenuButton.i && this.b) {
                    listMenuButton.clearFocus();
                }
                listMenuButton.setPressed(listMenuButton.g);
                break;
            case 5:
                if (this.b) {
                    this.b = false;
                    RecyclerViewEmptyViewSwitcher recyclerViewEmptyViewSwitcher = (RecyclerViewEmptyViewSwitcher) obj;
                    int i2 = RecyclerViewEmptyViewSwitcher.d;
                    if (recyclerViewEmptyViewSwitcher.a != null && recyclerViewEmptyViewSwitcher.getChildCount() >= 2) {
                        int displayedChild = (recyclerViewEmptyViewSwitcher.a.isEmpty() ? 1 : 0) - recyclerViewEmptyViewSwitcher.getDisplayedChild();
                        if (displayedChild != -1) {
                            if (displayedChild == 1) {
                                recyclerViewEmptyViewSwitcher.showNext();
                                break;
                            }
                        } else {
                            Runnable runnable = recyclerViewEmptyViewSwitcher.b;
                            if (runnable != null) {
                                runnable.run();
                            }
                            recyclerViewEmptyViewSwitcher.showPrevious();
                            break;
                        }
                    }
                }
                break;
            case 6:
                if (!this.b) {
                    ((bwk) obj).run();
                    vml.a(this);
                    this.b = true;
                    break;
                }
                break;
            case 7:
                if (!this.b) {
                    ThumbScroller thumbScroller = (ThumbScroller) obj;
                    int i3 = ThumbScroller.q;
                    if (thumbScroller.h == 1) {
                        iB = thumbScroller.b();
                        i = 0;
                    } else {
                        int i4 = ((uz4) thumbScroller.i.a).j;
                        int iB2 = thumbScroller.b() + (((((thumbScroller.getHeight() - thumbScroller.getPaddingTop()) - thumbScroller.getPaddingBottom()) - thumbScroller.b()) - ((uz4) thumbScroller.i.a).h) - thumbScroller.e.getHeight());
                        i = i4;
                        iB = iB2;
                    }
                    uz4 uz4Var = (uz4) thumbScroller.i.a;
                    huh huhVarA = uz4Var.a();
                    uz4Var.c.d1().g((int) Math.ceil(huhVarA.a(huhVarA.a)), i);
                    ViewPropertyAnimator listener = thumbScroller.e.animate().translationY(iB).setDuration(200L).setListener(new onl(thumbScroller, (byte) 0));
                    thumbScroller.c = listener;
                    listener.start();
                    break;
                }
                break;
            case 8:
                i3n i3nVar = ((z2n) obj).a;
                if (this.b && i3nVar.G) {
                    i3nVar.G = false;
                    wxe.t("Window regained focus, attempting to resume camera.", new Object[0]);
                    i3nVar.h(true);
                    break;
                }
                break;
            default:
                ((m2p) obj).a.c(this.b);
                break;
        }
    }
}
